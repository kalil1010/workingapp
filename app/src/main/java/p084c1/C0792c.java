package p084c1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p073Z0.AbstractC0616l;
import p073Z0.C0606b;
import p073Z0.C0608d;
import p073Z0.InterfaceC0617m;
import p077a1.InterfaceC0628a;
import p080b1.AbstractC0766d;
import p080b1.C0767e;
import p080b1.InterfaceC0779q;
import p098g1.C0970a;

/* renamed from: c1.c */
/* loaded from: classes.dex */
public final class C0792c implements InterfaceC0617m {

    /* renamed from: a */
    public final /* synthetic */ int f2948a;

    /* renamed from: b */
    public final C0767e f2949b;

    public /* synthetic */ C0792c(C0767e c0767e, int i2) {
        this.f2948a = i2;
        this.f2949b = c0767e;
    }

    /* renamed from: b */
    public static AbstractC0616l m2001b(C0767e c0767e, C0608d c0608d, C0970a c0970a, InterfaceC0628a interfaceC0628a) {
        AbstractC0616l abstractC0616lMo1416a;
        Object objMo22i = c0767e.m1980g(new C0970a(interfaceC0628a.value())).mo22i();
        boolean zNullSafe = interfaceC0628a.nullSafe();
        if (objMo22i instanceof AbstractC0616l) {
            abstractC0616lMo1416a = (AbstractC0616l) objMo22i;
        } else {
            if (!(objMo22i instanceof InterfaceC0617m)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo22i.getClass().getName() + " as a @JsonAdapter for " + AbstractC0766d.m1972i(c0970a.f4065b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            abstractC0616lMo1416a = ((InterfaceC0617m) objMo22i).mo1416a(c0608d, c0970a);
        }
        return (abstractC0616lMo1416a == null || !zNullSafe) ? abstractC0616lMo1416a : new C0606b(abstractC0616lMo1416a, 2);
    }

    @Override // p073Z0.InterfaceC0617m
    /* renamed from: a */
    public final AbstractC0616l mo1416a(C0608d c0608d, C0970a c0970a) throws NoSuchMethodException, SecurityException {
        Class cls;
        Type[] actualTypeArguments;
        cls = Object.class;
        C0767e c0767e = this.f2949b;
        switch (this.f2948a) {
            case 0:
                Class cls2 = c0970a.f4064a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type = c0970a.f4065b;
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                AbstractC0766d.m1965b(Collection.class.isAssignableFrom(cls2));
                Type typeM1971h = AbstractC0766d.m1971h(type, cls2, AbstractC0766d.m1969f(type, cls2, Collection.class), new HashMap());
                cls = typeM1971h instanceof ParameterizedType ? ((ParameterizedType) typeM1971h).getActualTypeArguments()[0] : Object.class;
                return new C0791b(c0608d, cls, c0608d.m1410c(new C0970a(cls)), c0767e.m1980g(c0970a));
            case 1:
                InterfaceC0628a interfaceC0628a = (InterfaceC0628a) c0970a.f4064a.getAnnotation(InterfaceC0628a.class);
                if (interfaceC0628a == null) {
                    return null;
                }
                return m2001b(c0767e, c0608d, c0970a, interfaceC0628a);
            default:
                Class cls3 = c0970a.f4064a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                Type type2 = c0970a.f4065b;
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    AbstractC0766d.m1965b(Map.class.isAssignableFrom(cls3));
                    Type typeM1971h2 = AbstractC0766d.m1971h(type2, cls3, AbstractC0766d.m1969f(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeM1971h2 instanceof ParameterizedType ? ((ParameterizedType) typeM1971h2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                AbstractC0616l abstractC0616lM1410c = (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC0806q.f2994c : c0608d.m1410c(new C0970a(type3));
                AbstractC0616l abstractC0616lM1410c2 = c0608d.m1410c(new C0970a(actualTypeArguments[1]));
                InterfaceC0779q interfaceC0779qM1980g = c0767e.m1980g(c0970a);
                Type[] typeArr = actualTypeArguments;
                return new C0794e(this, c0608d, typeArr[0], abstractC0616lM1410c, typeArr[1], abstractC0616lM1410c2, interfaceC0779qM1980g);
        }
    }
}
