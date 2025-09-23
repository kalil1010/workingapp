package p080b1;

import java.lang.reflect.Method;

/* renamed from: b1.t */
/* loaded from: classes.dex */
public final class C0782t extends AbstractC0784v {

    /* renamed from: b */
    public final /* synthetic */ Method f2928b;

    public C0782t(Method method) {
        this.f2928b = method;
    }

    @Override // p080b1.AbstractC0784v
    /* renamed from: a */
    public final Object mo1997a(Class cls) {
        String strM1973c = C0767e.m1973c(cls);
        if (strM1973c != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM1973c));
        }
        return this.f2928b.invoke(null, cls, Object.class);
    }
}
