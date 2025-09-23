package p020H;

import android.os.Process;

/* renamed from: H.i */
/* loaded from: classes.dex */
public final class C0179i extends Thread {

    /* renamed from: a */
    public final int f650a;

    public C0179i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f650a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f650a);
        super.run();
    }
}
