package p050R1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p131s1.AbstractC1326c;

/* renamed from: R1.k */
/* loaded from: classes.dex */
public final class C0483k extends C0496x {

    /* renamed from: e */
    public C0496x f1485e;

    public C0483k(C0496x c0496x) {
        AbstractC1326c.m3062e(c0496x, "delegate");
        this.f1485e = c0496x;
    }

    @Override // p050R1.C0496x
    /* renamed from: a */
    public final C0496x mo1206a() {
        return this.f1485e.mo1206a();
    }

    @Override // p050R1.C0496x
    /* renamed from: b */
    public final C0496x mo1207b() {
        return this.f1485e.mo1207b();
    }

    @Override // p050R1.C0496x
    /* renamed from: c */
    public final long mo1208c() {
        return this.f1485e.mo1208c();
    }

    @Override // p050R1.C0496x
    /* renamed from: d */
    public final C0496x mo1209d(long j2) {
        return this.f1485e.mo1209d(j2);
    }

    @Override // p050R1.C0496x
    /* renamed from: e */
    public final boolean mo1210e() {
        return this.f1485e.mo1210e();
    }

    @Override // p050R1.C0496x
    /* renamed from: f */
    public final void mo1211f() throws InterruptedIOException {
        this.f1485e.mo1211f();
    }

    @Override // p050R1.C0496x
    /* renamed from: g */
    public final C0496x mo1212g(long j2, TimeUnit timeUnit) {
        AbstractC1326c.m3062e(timeUnit, "unit");
        return this.f1485e.mo1212g(j2, timeUnit);
    }

    @Override // p050R1.C0496x
    /* renamed from: h */
    public final long mo1213h() {
        return this.f1485e.mo1213h();
    }
}
