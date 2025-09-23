package p002A1;

import android.os.AsyncTask;
import java.util.TimerTask;

/* renamed from: A1.I */
/* loaded from: classes.dex */
public final class C0014I extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ String f22a;

    /* renamed from: b */
    public final /* synthetic */ C0015J f23b;

    public C0014I(C0015J c0015j, String str) {
        this.f23b = c0015j;
        this.f22a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C0015J c0015j = this.f23b;
        AsyncTaskC0011F asyncTaskC0011F = c0015j.f27d;
        if (asyncTaskC0011F != null) {
            asyncTaskC0011F.cancel(true);
        }
        AsyncTaskC0011F asyncTaskC0011F2 = new AsyncTaskC0011F(new C0013H(this));
        c0015j.f27d = asyncTaskC0011F2;
        asyncTaskC0011F2.f19b = c0015j.f28e;
        try {
            asyncTaskC0011F2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f22a);
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
        }
    }
}
