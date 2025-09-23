package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import p131s1.AbstractC1326c;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public abstract class AbstractC0756u {

    /* renamed from: a */
    public static final HashMap f2738a = new HashMap();

    /* renamed from: b */
    public static final HashMap f2739b = new HashMap();

    /* renamed from: a */
    public static void m1787a(Constructor constructor, InterfaceC0752q interfaceC0752q) {
        try {
            AbstractC1326c.m3061d(constructor.newInstance(interfaceC0752q), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m1788b(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.AbstractC0756u.m1788b(java.lang.Class):int");
    }
}
