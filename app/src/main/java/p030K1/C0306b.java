package p030K1;

import p050R1.C0482j;
import p055T0.C0511e;
import p131s1.AbstractC1326c;

/* renamed from: K1.b */
/* loaded from: classes.dex */
public final class C0306b {

    /* renamed from: d */
    public static final C0482j f931d;

    /* renamed from: e */
    public static final C0482j f932e;

    /* renamed from: f */
    public static final C0482j f933f;

    /* renamed from: g */
    public static final C0482j f934g;

    /* renamed from: h */
    public static final C0482j f935h;

    /* renamed from: i */
    public static final C0482j f936i;

    /* renamed from: a */
    public final int f937a;

    /* renamed from: b */
    public final C0482j f938b;

    /* renamed from: c */
    public final C0482j f939c;

    static {
        C0482j c0482j = C0482j.f1481d;
        f931d = C0511e.m1275e(":");
        f932e = C0511e.m1275e(":status");
        f933f = C0511e.m1275e(":method");
        f934g = C0511e.m1275e(":path");
        f935h = C0511e.m1275e(":scheme");
        f936i = C0511e.m1275e(":authority");
    }

    public C0306b(C0482j c0482j, C0482j c0482j2) {
        AbstractC1326c.m3062e(c0482j, "name");
        AbstractC1326c.m3062e(c0482j2, "value");
        this.f938b = c0482j;
        this.f939c = c0482j2;
        this.f937a = c0482j2.mo1197c() + c0482j.mo1197c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0306b)) {
            return false;
        }
        C0306b c0306b = (C0306b) obj;
        return AbstractC1326c.m3058a(this.f938b, c0306b.f938b) && AbstractC1326c.m3058a(this.f939c, c0306b.f939c);
    }

    public final int hashCode() {
        C0482j c0482j = this.f938b;
        int iHashCode = (c0482j != null ? c0482j.hashCode() : 0) * 31;
        C0482j c0482j2 = this.f939c;
        return iHashCode + (c0482j2 != null ? c0482j2.hashCode() : 0);
    }

    public final String toString() {
        return this.f938b.m1204j() + ": " + this.f939c.m1204j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0306b(String str, String str2) {
        this(C0511e.m1275e(str), C0511e.m1275e(str2));
        AbstractC1326c.m3062e(str, "name");
        AbstractC1326c.m3062e(str2, "value");
        C0482j c0482j = C0482j.f1481d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0306b(C0482j c0482j, String str) {
        this(c0482j, C0511e.m1275e(str));
        AbstractC1326c.m3062e(c0482j, "name");
        AbstractC1326c.m3062e(str, "value");
        C0482j c0482j2 = C0482j.f1481d;
    }
}
