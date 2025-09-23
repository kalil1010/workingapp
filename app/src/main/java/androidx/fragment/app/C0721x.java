package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import p006C.AbstractC0075g;
import p073Z0.C0614j;
import p119o.C1249k;

/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public final class C0721x {

    /* renamed from: b */
    public static final C1249k f2677b = new C1249k();

    /* renamed from: a */
    public final /* synthetic */ C0686D f2678a;

    public C0721x(C0686D c0686d) {
        this.f2678a = c0686d;
    }

    /* renamed from: b */
    public static Class m1763b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C1249k c1249k = f2677b;
        C1249k c1249k2 = (C1249k) c1249k.getOrDefault(classLoader, null);
        if (c1249k2 == null) {
            c1249k2 = new C1249k();
            c1249k.put(classLoader, c1249k2);
        }
        Class cls = (Class) c1249k2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1249k2.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class m1764c(ClassLoader classLoader, String str) {
        try {
            return m1763b(classLoader, str);
        } catch (ClassCastException e3) {
            throw new C0614j(AbstractC0075g.m238g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        } catch (ClassNotFoundException e4) {
            throw new C0614j(AbstractC0075g.m238g("Unable to instantiate fragment ", str, ": make sure class name exists"), e4);
        }
    }

    /* renamed from: a */
    public final AbstractComponentCallbacksC0712o m1765a(String str) {
        try {
            return (AbstractComponentCallbacksC0712o) m1764c(this.f2678a.f2459n.f2659g.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e3) {
            throw new C0614j(AbstractC0075g.m238g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new C0614j(AbstractC0075g.m238g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new C0614j(AbstractC0075g.m238g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new C0614j(AbstractC0075g.m238g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e6);
        }
    }
}
