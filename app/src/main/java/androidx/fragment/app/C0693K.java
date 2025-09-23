package androidx.fragment.app;

import androidx.activity.C0646l;
import androidx.lifecycle.C0734K;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.EnumC0747l;
import androidx.lifecycle.InterfaceC0735L;
import androidx.lifecycle.InterfaceC0743h;
import p097g0.C0968d;
import p097g0.InterfaceC0969e;

/* renamed from: androidx.fragment.app.K */
/* loaded from: classes.dex */
public final class C0693K implements InterfaceC0743h, InterfaceC0969e, InterfaceC0735L {

    /* renamed from: a */
    public final C0734K f2517a;

    /* renamed from: b */
    public C0755t f2518b = null;

    /* renamed from: c */
    public C0646l f2519c = null;

    public C0693K(C0734K c0734k) {
        this.f2517a = c0734k;
    }

    @Override // p097g0.InterfaceC0969e
    /* renamed from: b */
    public final C0968d mo1451b() {
        m1716f();
        return (C0968d) this.f2519c.f2014c;
    }

    @Override // androidx.lifecycle.InterfaceC0735L
    /* renamed from: c */
    public final C0734K mo1452c() {
        m1716f();
        return this.f2517a;
    }

    /* renamed from: d */
    public final void m1715d(EnumC0747l enumC0747l) {
        this.f2518b.m1782d(enumC0747l);
    }

    @Override // androidx.lifecycle.InterfaceC0753r
    /* renamed from: e */
    public final C0755t mo1453e() {
        m1716f();
        return this.f2518b;
    }

    /* renamed from: f */
    public final void m1716f() {
        if (this.f2518b == null) {
            this.f2518b = new C0755t(this);
            this.f2519c = new C0646l(this);
        }
    }
}
