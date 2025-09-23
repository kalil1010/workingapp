package androidx.activity;

import java.io.Serializable;
import p107j1.C1180c;
import p128r1.InterfaceC1290a;
import p131s1.AbstractC1326c;
import p131s1.AbstractC1330g;
import p131s1.C1325b;
import p131s1.C1328e;
import p131s1.InterfaceC1324a;

/* renamed from: androidx.activity.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C0655s implements InterfaceC1290a, Serializable {

    /* renamed from: a */
    public transient C0655s f2031a;

    /* renamed from: b */
    public final Object f2032b;

    /* renamed from: c */
    public final boolean f2033c = false;

    /* renamed from: d */
    public final int f2034d = 0;

    /* renamed from: e */
    public final /* synthetic */ int f2035e;

    public C0655s(int i2, Object obj) {
        this.f2035e = i2;
        this.f2032b = obj;
    }

    @Override // p128r1.InterfaceC1290a
    /* renamed from: a */
    public final Object mo349a() {
        switch (this.f2035e) {
            case 0:
                ((C0656t) this.f2032b).m1469d();
                break;
            default:
                ((C0656t) this.f2032b).m1469d();
                break;
        }
        return C1180c.f4801c;
    }

    /* renamed from: b */
    public final InterfaceC1324a m1465b() {
        if (this.f2033c) {
            AbstractC1330g.f5651a.getClass();
            return new C1328e();
        }
        AbstractC1330g.f5651a.getClass();
        return new C1325b(C0656t.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0655s) {
            C0655s c0655s = (C0655s) obj;
            c0655s.getClass();
            return this.f2034d == c0655s.f2034d && AbstractC1326c.m3058a(this.f2032b, c0655s.f2032b) && m1465b().equals(c0655s.m1465b());
        }
        if (!(obj instanceof C0655s)) {
            return false;
        }
        C0655s c0655s2 = this.f2031a;
        if (c0655s2 == null) {
            AbstractC1330g.f5651a.getClass();
            this.f2031a = this;
            c0655s2 = this;
        }
        return obj.equals(c0655s2);
    }

    public final int hashCode() {
        m1465b();
        return (((m1465b().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        C0655s c0655s = this.f2031a;
        if (c0655s == null) {
            AbstractC1330g.f5651a.getClass();
            this.f2031a = this;
            c0655s = this;
        }
        return c0655s != this ? c0655s.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
