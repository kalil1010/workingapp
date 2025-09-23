package p080b1;

import java.lang.reflect.Method;

/* renamed from: b1.r */
/* loaded from: classes.dex */
public final class C0780r extends AbstractC0784v {

    /* renamed from: b */
    public final /* synthetic */ Method f2924b;

    /* renamed from: c */
    public final /* synthetic */ Object f2925c;

    public C0780r(Method method, Object obj) {
        this.f2924b = method;
        this.f2925c = obj;
    }

    @Override // p080b1.AbstractC0784v
    /* renamed from: a */
    public final Object mo1997a(Class cls) {
        String strM1973c = C0767e.m1973c(cls);
        if (strM1973c != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM1973c));
        }
        return this.f2924b.invoke(this.f2925c, cls);
    }
}
