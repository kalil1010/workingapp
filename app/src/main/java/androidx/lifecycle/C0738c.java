package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C0738c {

    /* renamed from: c */
    public static final C0738c f2716c = new C0738c();

    /* renamed from: a */
    public final HashMap f2717a = new HashMap();

    /* renamed from: b */
    public final HashMap f2718b = new HashMap();

    /* renamed from: b */
    public static void m1775b(HashMap map, C0737b c0737b, EnumC0747l enumC0747l, Class cls) {
        EnumC0747l enumC0747l2 = (EnumC0747l) map.get(c0737b);
        if (enumC0747l2 == null || enumC0747l == enumC0747l2) {
            if (enumC0747l2 == null) {
                map.put(c0737b, enumC0747l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0737b.f2715b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0747l2 + ", new value " + enumC0747l);
    }

    /* renamed from: a */
    public final C0736a m1776a(Class cls, Method[] methodArr) throws SecurityException {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f2717a;
        if (superclass != null) {
            C0736a c0736aM1776a = (C0736a) map2.get(superclass);
            if (c0736aM1776a == null) {
                c0736aM1776a = m1776a(superclass, null);
            }
            map.putAll(c0736aM1776a.f2713b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0736a c0736aM1776a2 = (C0736a) map2.get(cls2);
            if (c0736aM1776a2 == null) {
                c0736aM1776a2 = m1776a(cls2, null);
            }
            for (Map.Entry entry : c0736aM1776a2.f2713b.entrySet()) {
                m1775b(map, (C0737b) entry.getKey(), (EnumC0747l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            InterfaceC0760y interfaceC0760y = (InterfaceC0760y) method.getAnnotation(InterfaceC0760y.class);
            if (interfaceC0760y != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!InterfaceC0753r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0747l enumC0747lValue = interfaceC0760y.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0747l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0747lValue != EnumC0747l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1775b(map, new C0737b(i2, method), enumC0747lValue, cls);
                z2 = true;
            }
        }
        C0736a c0736a = new C0736a(map);
        map2.put(cls, c0736a);
        this.f2718b.put(cls, Boolean.valueOf(z2));
        return c0736a;
    }
}
