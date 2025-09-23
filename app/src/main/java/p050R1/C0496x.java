package p050R1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p131s1.AbstractC1326c;

/* renamed from: R1.x */
/* loaded from: classes.dex */
public class C0496x {

    /* renamed from: d */
    public static final C0495w f1516d = new C0495w();

    /* renamed from: a */
    public boolean f1517a;

    /* renamed from: b */
    public long f1518b;

    /* renamed from: c */
    public long f1519c;

    /* renamed from: a */
    public C0496x mo1206a() {
        this.f1517a = false;
        return this;
    }

    /* renamed from: b */
    public C0496x mo1207b() {
        this.f1519c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo1208c() {
        if (this.f1517a) {
            return this.f1518b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C0496x mo1209d(long j2) {
        this.f1517a = true;
        this.f1518b = j2;
        return this;
    }

    /* renamed from: e */
    public boolean mo1210e() {
        return this.f1517a;
    }

    /* renamed from: f */
    public void mo1211f() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f1517a && this.f1518b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C0496x mo1212g(long j2, TimeUnit timeUnit) {
        AbstractC1326c.m3062e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f1519c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }

    /* renamed from: h */
    public long mo1213h() {
        return this.f1519c;
    }
}
