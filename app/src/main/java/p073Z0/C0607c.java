package p073Z0;

import p101h1.C0987a;
import p101h1.C0988b;

/* renamed from: Z0.c */
/* loaded from: classes.dex */
public final class C0607c extends AbstractC0616l {

    /* renamed from: a */
    public AbstractC0616l f1920a;

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) {
        AbstractC0616l abstractC0616l = this.f1920a;
        if (abstractC0616l != null) {
            return abstractC0616l.mo1406a(c0987a);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) {
        AbstractC0616l abstractC0616l = this.f1920a;
        if (abstractC0616l == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC0616l.mo1407b(c0988b, obj);
    }
}
