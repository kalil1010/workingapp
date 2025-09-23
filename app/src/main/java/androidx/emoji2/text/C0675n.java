package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002A1.RunnableC0030l;
import p007C0.C0088f;
import p011D1.C0132v;
import p020H.AbstractC0173c;
import p020H.C0178h;
import p033L1.AbstractC0364l;
import p055T0.C0511e;

/* renamed from: androidx.emoji2.text.n */
/* loaded from: classes.dex */
public final class C0675n implements InterfaceC0670i {

    /* renamed from: a */
    public final Context f2415a;

    /* renamed from: b */
    public final C0132v f2416b;

    /* renamed from: c */
    public final C0511e f2417c;

    /* renamed from: d */
    public final Object f2418d;

    /* renamed from: e */
    public Handler f2419e;

    /* renamed from: f */
    public ThreadPoolExecutor f2420f;

    /* renamed from: g */
    public ThreadPoolExecutor f2421g;

    /* renamed from: h */
    public AbstractC0364l f2422h;

    public C0675n(Context context, C0132v c0132v) {
        C0511e c0511e = C0676o.f2423d;
        this.f2418d = new Object();
        AbstractC0364l.m1010q(context, "Context cannot be null");
        this.f2415a = context.getApplicationContext();
        this.f2416b = c0132v;
        this.f2417c = c0511e;
    }

    /* renamed from: a */
    public final void m1636a() {
        synchronized (this.f2418d) {
            try {
                this.f2422h = null;
                Handler handler = this.f2419e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f2419e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2421g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2420f = null;
                this.f2421g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final C0178h m1637b() throws Resources.NotFoundException {
        try {
            C0511e c0511e = this.f2417c;
            Context context = this.f2415a;
            C0132v c0132v = this.f2416b;
            c0511e.getClass();
            C0088f c0088fM476a = AbstractC0173c.m476a(context, c0132v);
            int i2 = c0088fM476a.f207a;
            if (i2 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i2 + ")");
            }
            C0178h[] c0178hArr = (C0178h[]) c0088fM476a.f208b;
            if (c0178hArr == null || c0178hArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0178hArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0670i
    /* renamed from: d */
    public final void mo17d(AbstractC0364l abstractC0364l) {
        synchronized (this.f2418d) {
            this.f2422h = abstractC0364l;
        }
        synchronized (this.f2418d) {
            try {
                if (this.f2422h == null) {
                    return;
                }
                if (this.f2420f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0662a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f2421g = threadPoolExecutor;
                    this.f2420f = threadPoolExecutor;
                }
                this.f2420f.execute(new RunnableC0030l(11, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
