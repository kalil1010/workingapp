package p084c1;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p073Z0.InterfaceC0617m;
import p080b1.AbstractC0766d;
import p095f1.C0962a;
import p098g1.C0970a;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public final class C0790a implements InterfaceC0617m {

    /* renamed from: a */
    public final /* synthetic */ int f2943a;

    public /* synthetic */ C0790a(int i2) {
        this.f2943a = i2;
    }

    @Override // p073Z0.InterfaceC0617m
    /* renamed from: a */
    public final AbstractC0616l mo1416a(C0608d c0608d, C0970a c0970a) {
        switch (this.f2943a) {
            case 0:
                Type type = c0970a.f4065b;
                boolean z2 = type instanceof GenericArrayType;
                if (!z2 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z2 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new C0791b(c0608d, c0608d.m1410c(new C0970a(genericComponentType)), AbstractC0766d.m1970g(genericComponentType));
            case 1:
                if (c0970a.f4064a == Date.class) {
                    return new C0793d();
                }
                return null;
            case 2:
                if (c0970a.f4064a == Object.class) {
                    return new C0797h(c0608d);
                }
                return null;
            case 3:
                Class superclass = c0970a.f4064a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new C0802m(superclass);
            case 4:
                if (c0970a.f4064a == java.sql.Date.class) {
                    return new C0962a(0);
                }
                return null;
            case 5:
                if (c0970a.f4064a == Time.class) {
                    return new C0962a(1);
                }
                return null;
            default:
                if (c0970a.f4064a != Timestamp.class) {
                    return null;
                }
                c0608d.getClass();
                return new C0962a(c0608d.m1410c(new C0970a(Date.class)));
        }
    }
}
