package p084c1;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import p073Z0.C0611g;
import p080b1.InterfaceC0779q;
import p092e1.AbstractC0897c;
import p101h1.C0987a;

/* renamed from: c1.k */
/* loaded from: classes.dex */
public final class C0800k extends AbstractC0799j {

    /* renamed from: b */
    public final InterfaceC0779q f2975b;

    public C0800k(InterfaceC0779q interfaceC0779q, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f2975b = interfaceC0779q;
    }

    @Override // p084c1.AbstractC0799j
    /* renamed from: c */
    public final Object mo2006c() {
        return this.f2975b.mo22i();
    }

    @Override // p084c1.AbstractC0799j
    /* renamed from: d */
    public final Object mo2007d(Object obj) {
        return obj;
    }

    @Override // p084c1.AbstractC0799j
    /* renamed from: e */
    public final void mo2008e(Object obj, C0987a c0987a, C0798i c0798i) throws IllegalAccessException, IllegalArgumentException {
        Object objMo1406a = c0798i.f2969h.mo1406a(c0987a);
        if (objMo1406a == null && c0798i.f2972k) {
            return;
        }
        Field field = c0798i.f2963b;
        if (!c0798i.f2973l) {
            field.set(obj, objMo1406a);
            return;
        }
        throw new C0611g("Cannot set value of 'static final' " + AbstractC0897c.m2276d(field, false));
    }
}
