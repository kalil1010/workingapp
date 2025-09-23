package p080b1;

import java.lang.reflect.Method;

/* renamed from: b1.s */
/* loaded from: classes.dex */
public final class C0781s extends AbstractC0784v {

    /* renamed from: b */
    public final /* synthetic */ Method f2926b;

    /* renamed from: c */
    public final /* synthetic */ int f2927c;

    public C0781s(int i2, Method method) {
        this.f2926b = method;
        this.f2927c = i2;
    }

    @Override // p080b1.AbstractC0784v
    /* renamed from: a */
    public final Object mo1997a(Class cls) {
        String strM1973c = C0767e.m1973c(cls);
        if (strM1973c != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM1973c));
        }
        return this.f2926b.invoke(null, cls, Integer.valueOf(this.f2927c));
    }
}
