package p050R1;

import java.util.concurrent.TimeUnit;
import p131s1.AbstractC1326c;

/* renamed from: R1.e */
/* loaded from: classes.dex */
public class C0477e extends C0496x {

    /* renamed from: h */
    public static final long f1466h;

    /* renamed from: i */
    public static final long f1467i;

    /* renamed from: j */
    public static C0477e f1468j;

    /* renamed from: e */
    public boolean f1469e;

    /* renamed from: f */
    public C0477e f1470f;

    /* renamed from: g */
    public long f1471g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f1466h = millis;
        f1467i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: i */
    public final void m1162i() {
        C0477e c0477e;
        if (this.f1469e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long j2 = this.f1519c;
        boolean z2 = this.f1517a;
        if (j2 != 0 || z2) {
            this.f1469e = true;
            synchronized (C0477e.class) {
                try {
                    if (f1468j == null) {
                        f1468j = new C0477e();
                        C0474b c0474b = new C0474b("Okio Watchdog");
                        c0474b.setDaemon(true);
                        c0474b.start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j2 != 0 && z2) {
                        this.f1471g = Math.min(j2, mo1208c() - jNanoTime) + jNanoTime;
                    } else if (j2 != 0) {
                        this.f1471g = j2 + jNanoTime;
                    } else {
                        if (!z2) {
                            throw new AssertionError();
                        }
                        this.f1471g = mo1208c();
                    }
                    long j3 = this.f1471g - jNanoTime;
                    C0477e c0477e2 = f1468j;
                    AbstractC1326c.m3059b(c0477e2);
                    while (true) {
                        c0477e = c0477e2.f1470f;
                        if (c0477e == null || j3 < c0477e.f1471g - jNanoTime) {
                            break;
                        } else {
                            c0477e2 = c0477e;
                        }
                    }
                    this.f1470f = c0477e;
                    c0477e2.f1470f = this;
                    if (c0477e2 == f1468j) {
                        C0477e.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean m1163j() {
        if (!this.f1469e) {
            return false;
        }
        this.f1469e = false;
        synchronized (C0477e.class) {
            C0477e c0477e = f1468j;
            while (c0477e != null) {
                C0477e c0477e2 = c0477e.f1470f;
                if (c0477e2 == this) {
                    c0477e.f1470f = this.f1470f;
                    this.f1470f = null;
                    return false;
                }
                c0477e = c0477e2;
            }
            return true;
        }
    }

    /* renamed from: k */
    public void mo492k() {
    }
}
