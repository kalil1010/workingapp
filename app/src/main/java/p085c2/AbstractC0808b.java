package p085c2;

import androidx.activity.C0646l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import p080b1.C0767e;
import p089d2.C0859a;
import p093e2.AbstractC0901d;
import p093e2.C0898a;
import p093e2.C0899b;
import p093e2.C0900c;

/* renamed from: c2.b */
/* loaded from: classes.dex */
public abstract class AbstractC0808b {

    /* renamed from: a */
    public static volatile int f3018a;

    /* renamed from: b */
    public static final C0646l f3019b = new C0646l();

    /* renamed from: c */
    public static final C0767e f3020c = new C0767e(7);

    /* renamed from: d */
    public static final boolean f3021d;

    /* renamed from: e */
    public static final String[] f3022e;

    /* renamed from: f */
    public static final String f3023f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f3021d = property == null ? false : property.equalsIgnoreCase("true");
        f3022e = new String[]{"1.6", "1.7"};
        f3023f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    /* renamed from: a */
    public static final void m2011a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        LinkedHashSet linkedHashSetM2012b;
        try {
            try {
                try {
                    if (m2016f()) {
                        linkedHashSetM2012b = null;
                    } else {
                        linkedHashSetM2012b = m2012b();
                        m2019i(linkedHashSetM2012b);
                    }
                    StaticLoggerBinder.getSingleton();
                    f3018a = 3;
                    m2018h(linkedHashSetM2012b);
                    m2017g();
                } catch (NoClassDefFoundError e3) {
                    String message = e3.getMessage();
                    if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                        f3018a = 2;
                        System.err.println("Failed to instantiate SLF4J LoggerFactory");
                        System.err.println("Reported exception:");
                        e3.printStackTrace();
                        throw e3;
                    }
                    f3018a = 4;
                    AbstractC0901d.m2302j0("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    AbstractC0901d.m2302j0("Defaulting to no-operation (NOP) logger implementation");
                    AbstractC0901d.m2302j0("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                    m2017g();
                }
            } catch (Exception e4) {
                f3018a = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                e4.printStackTrace();
                throw new IllegalStateException("Unexpected initialization failure", e4);
            } catch (NoSuchMethodError e5) {
                String message2 = e5.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f3018a = 2;
                    AbstractC0901d.m2302j0("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    AbstractC0901d.m2302j0("Your binding is version 1.5.5 or earlier.");
                    AbstractC0901d.m2302j0("Upgrade your binding to version 1.6.x.");
                }
                throw e5;
            }
        } catch (Throwable th) {
            m2017g();
            throw th;
        }
    }

    /* renamed from: b */
    public static LinkedHashSet m2012b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = AbstractC0808b.class.getClassLoader();
            String str = f3023f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e3) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            e3.printStackTrace();
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public static ILoggerFactory m2013c() {
        if (f3018a == 0) {
            synchronized (AbstractC0808b.class) {
                try {
                    if (f3018a == 0) {
                        f3018a = 1;
                        m2011a();
                        if (f3018a == 3) {
                            m2020j();
                        }
                    }
                } finally {
                }
            }
        }
        int i2 = f3018a;
        if (i2 == 1) {
            return f3019b;
        }
        if (i2 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i2 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i2 == 4) {
            return f3020c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* renamed from: d */
    public static InterfaceC0807a m2014d(Class cls) {
        int i2;
        InterfaceC0807a interfaceC0807aM2015e = m2015e(cls.getName());
        if (f3021d) {
            C0900c c0900c = AbstractC0901d.f3735a;
            Class cls2 = null;
            if (c0900c == null) {
                if (AbstractC0901d.f3736b) {
                    c0900c = null;
                } else {
                    try {
                        c0900c = new C0900c();
                    } catch (SecurityException unused) {
                        c0900c = null;
                    }
                    AbstractC0901d.f3735a = c0900c;
                    AbstractC0901d.f3736b = true;
                }
            }
            if (c0900c != null) {
                Class[] classContext = c0900c.getClassContext();
                String name = AbstractC0901d.class.getName();
                int i3 = 0;
                while (i3 < classContext.length && !name.equals(classContext[i3].getName())) {
                    i3++;
                }
                if (i3 >= classContext.length || (i2 = i3 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i2];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                AbstractC0901d.m2302j0("Detected logger name mismatch. Given name: \"" + interfaceC0807aM2015e.mo128l() + "\"; computed name: \"" + cls2.getName() + "\".");
                AbstractC0901d.m2302j0("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return interfaceC0807aM2015e;
    }

    /* renamed from: e */
    public static InterfaceC0807a m2015e(String str) {
        return m2013c().mo1457b(str);
    }

    /* renamed from: f */
    public static boolean m2016f() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    /* renamed from: g */
    public static void m2017g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0646l c0646l = f3019b;
        synchronized (c0646l) {
            try {
                c0646l.f2012a = true;
                Iterator it = new ArrayList(((HashMap) c0646l.f2013b).values()).iterator();
                while (it.hasNext()) {
                    C0899b c0899b = (C0899b) it.next();
                    c0899b.f3729b = m2015e(c0899b.f3728a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) f3019b.f2014c;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0859a c0859a = (C0859a) it2.next();
                if (c0859a != null) {
                    C0899b c0899b2 = c0859a.f3521a;
                    String str = c0899b2.f3728a;
                    if (c0899b2.f3729b == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c0899b2.f3729b instanceof C0898a)) {
                        if (!c0899b2.m2279c()) {
                            AbstractC0901d.m2302j0(str);
                        } else if (c0899b2.m2279c()) {
                            try {
                                c0899b2.f3731d.invoke(c0899b2.f3729b, c0859a);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i3 = i2 + 1;
                if (i2 == 0) {
                    if (c0859a.f3521a.m2279c()) {
                        AbstractC0901d.m2302j0("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC0901d.m2302j0("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC0901d.m2302j0("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(c0859a.f3521a.f3729b instanceof C0898a)) {
                        AbstractC0901d.m2302j0("The following set of substitute loggers may have been accessed");
                        AbstractC0901d.m2302j0("during the initialization phase. Logging calls during this");
                        AbstractC0901d.m2302j0("phase were not honored. However, subsequent logging calls to these");
                        AbstractC0901d.m2302j0("loggers will work as normally expected.");
                        AbstractC0901d.m2302j0("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i3;
            }
            arrayList.clear();
        }
        C0646l c0646l2 = f3019b;
        ((HashMap) c0646l2.f2013b).clear();
        ((LinkedBlockingQueue) c0646l2.f2014c).clear();
    }

    /* renamed from: h */
    public static void m2018h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        AbstractC0901d.m2302j0("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    /* renamed from: i */
    public static void m2019i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            AbstractC0901d.m2302j0("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                AbstractC0901d.m2302j0("Found binding in [" + ((URL) it.next()) + "]");
            }
            AbstractC0901d.m2302j0("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: j */
    public static final void m2020j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z2 = false;
            for (String str2 : f3022e) {
                if (str.startsWith(str2)) {
                    z2 = true;
                }
            }
            if (z2) {
                return;
            }
            AbstractC0901d.m2302j0("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f3022e).toString());
            AbstractC0901d.m2302j0("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
            th.printStackTrace();
        }
    }
}
