package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import p002A1.RunnableC0030l;
import p090e.AbstractActivityC0874g;

/* renamed from: androidx.activity.j */
/* loaded from: classes.dex */
public final class ExecutorC0644j implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b */
    public Runnable f1995b;

    /* renamed from: d */
    public final /* synthetic */ AbstractActivityC0874g f1997d;

    /* renamed from: a */
    public final long f1994a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c */
    public boolean f1996c = false;

    public ExecutorC0644j(AbstractActivityC0874g abstractActivityC0874g) {
        this.f1997d = abstractActivityC0874g;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1995b = runnable;
        View decorView = this.f1997d.getWindow().getDecorView();
        if (!this.f1996c) {
            decorView.postOnAnimation(new RunnableC0030l(9, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1995b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1994a) {
                this.f1996c = false;
                this.f1997d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1995b = null;
        C0646l c0646l = this.f1997d.f2005i;
        synchronized (c0646l.f2013b) {
            z2 = c0646l.f2012a;
        }
        if (z2) {
            this.f1996c = false;
            this.f1997d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1997d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
