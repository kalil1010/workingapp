package p093e2;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import p002A1.C0027i;
import p085c2.InterfaceC0807a;
import p089d2.C0859a;

/* renamed from: e2.b */
/* loaded from: classes.dex */
public final class C0899b implements InterfaceC0807a {

    /* renamed from: a */
    public final String f3728a;

    /* renamed from: b */
    public volatile InterfaceC0807a f3729b;

    /* renamed from: c */
    public Boolean f3730c;

    /* renamed from: d */
    public Method f3731d;

    /* renamed from: e */
    public C0027i f3732e;

    /* renamed from: f */
    public final LinkedBlockingQueue f3733f;

    /* renamed from: g */
    public final boolean f3734g;

    public C0899b(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z2) {
        this.f3728a = str;
        this.f3733f = linkedBlockingQueue;
        this.f3734g = z2;
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: a */
    public final void mo118a(String str, EOFException eOFException) {
        m2278b().mo118a(str, eOFException);
    }

    /* renamed from: b */
    public final InterfaceC0807a m2278b() {
        if (this.f3729b != null) {
            return this.f3729b;
        }
        if (this.f3734g) {
            return C0898a.f3727a;
        }
        if (this.f3732e == null) {
            C0027i c0027i = new C0027i(5);
            c0027i.f66c = this;
            c0027i.f65b = this.f3728a;
            c0027i.f67d = this.f3733f;
            this.f3732e = c0027i;
        }
        return this.f3732e;
    }

    /* renamed from: c */
    public final boolean m2279c() {
        Boolean bool = this.f3730c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f3731d = this.f3729b.getClass().getMethod("log", C0859a.class);
            this.f3730c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f3730c = Boolean.FALSE;
        }
        return this.f3730c.booleanValue();
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: d */
    public final boolean mo121d() {
        return m2278b().mo121d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0899b.class == obj.getClass() && this.f3728a.equals(((C0899b) obj).f3728a);
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: f */
    public final void mo123f() {
        m2278b().mo123f();
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: g */
    public final void mo124g(String str, Exception exc) {
        m2278b().mo124g(str, exc);
    }

    public final int hashCode() {
        return this.f3728a.hashCode();
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: i */
    public final void mo125i(String str) {
        m2278b().mo125i(str);
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: j */
    public final void mo126j(String str) {
        m2278b().mo126j(str);
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: k */
    public final void mo127k(String str) {
        m2278b().mo127k(str);
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: l */
    public final String mo128l() {
        return this.f3728a;
    }
}
