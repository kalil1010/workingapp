package p084c1;

import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p073Z0.InterfaceC0617m;
import p098g1.C0970a;

/* renamed from: c1.o */
/* loaded from: classes.dex */
public final class C0804o implements InterfaceC0617m {

    /* renamed from: a */
    public final /* synthetic */ Class f2987a;

    /* renamed from: b */
    public final /* synthetic */ Class f2988b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0616l f2989c;

    public C0804o(Class cls, Class cls2, AbstractC0616l abstractC0616l) {
        this.f2987a = cls;
        this.f2988b = cls2;
        this.f2989c = abstractC0616l;
    }

    @Override // p073Z0.InterfaceC0617m
    /* renamed from: a */
    public final AbstractC0616l mo1416a(C0608d c0608d, C0970a c0970a) {
        Class cls = this.f2987a;
        Class cls2 = c0970a.f4064a;
        if (cls2 == cls || cls2 == this.f2988b) {
            return this.f2989c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f2988b.getName() + "+" + this.f2987a.getName() + ",adapter=" + this.f2989c + "]";
    }
}
