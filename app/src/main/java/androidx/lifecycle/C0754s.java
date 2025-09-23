package androidx.lifecycle;

import p131s1.AbstractC1326c;

/* renamed from: androidx.lifecycle.s */
/* loaded from: classes.dex */
public final class C0754s {

    /* renamed from: a */
    public EnumC0748m f2728a;

    /* renamed from: b */
    public InterfaceC0751p f2729b;

    /* renamed from: a */
    public final void m1778a(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
        EnumC0748m enumC0748mM1777a = enumC0747l.m1777a();
        EnumC0748m enumC0748m = this.f2728a;
        AbstractC1326c.m3062e(enumC0748m, "state1");
        if (enumC0748mM1777a.compareTo(enumC0748m) < 0) {
            enumC0748m = enumC0748mM1777a;
        }
        this.f2728a = enumC0748m;
        this.f2729b.mo1439b(interfaceC0753r, enumC0747l);
        this.f2728a = enumC0748mM1777a;
    }
}
