package p116m1;

import p118n1.C1238b;
import p121o1.C1256b;
import p131s1.AbstractC1326c;

/* renamed from: m1.c */
/* loaded from: classes.dex */
public abstract class AbstractC1234c {

    /* renamed from: a */
    public static final C1233b f4952a;

    static {
        C1233b c1233b;
        try {
            Object objNewInstance = C1256b.class.newInstance();
            AbstractC1326c.m3061d(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    c1233b = (C1233b) objNewInstance;
                } catch (ClassCastException e3) {
                    ClassLoader classLoader = objNewInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = C1233b.class.getClassLoader();
                    if (AbstractC1326c.m3058a(classLoader, classLoader2)) {
                        throw e3;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e3);
                }
            } catch (ClassNotFoundException unused) {
                Object objNewInstance2 = C1238b.class.newInstance();
                AbstractC1326c.m3061d(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        c1233b = (C1233b) objNewInstance2;
                    } catch (ClassNotFoundException unused2) {
                        c1233b = new C1233b();
                    }
                } catch (ClassCastException e4) {
                    ClassLoader classLoader3 = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = C1233b.class.getClassLoader();
                    if (AbstractC1326c.m3058a(classLoader3, classLoader4)) {
                        throw e4;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e4);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object objNewInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            AbstractC1326c.m3061d(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    c1233b = (C1233b) objNewInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    AbstractC1326c.m3061d(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        c1233b = (C1233b) objNewInstance4;
                    } catch (ClassCastException e5) {
                        ClassLoader classLoader5 = objNewInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = C1233b.class.getClassLoader();
                        if (AbstractC1326c.m3058a(classLoader5, classLoader6)) {
                            throw e5;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e5);
                    }
                }
            } catch (ClassCastException e6) {
                ClassLoader classLoader7 = objNewInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = C1233b.class.getClassLoader();
                if (AbstractC1326c.m3058a(classLoader7, classLoader8)) {
                    throw e6;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e6);
            }
        }
        f4952a = c1233b;
    }
}
