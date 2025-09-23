package p100h0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p033L1.AbstractC0364l;
import p073Z0.C0614j;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: h0.a */
/* loaded from: classes.dex */
public final class C0985a {

    /* renamed from: d */
    public static volatile C0985a f4133d;

    /* renamed from: e */
    public static final Object f4134e = new Object();

    /* renamed from: c */
    public final Context f4137c;

    /* renamed from: b */
    public final HashSet f4136b = new HashSet();

    /* renamed from: a */
    public final HashMap f4135a = new HashMap();

    public C0985a(Context context) {
        this.f4137c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C0985a m2492c(Context context) {
        if (f4133d == null) {
            synchronized (f4134e) {
                try {
                    if (f4133d == null) {
                        f4133d = new C0985a(context);
                    }
                } finally {
                }
            }
        }
        return f4133d;
    }

    /* renamed from: a */
    public final void m2493a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f4137c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f4136b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0986b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m2494b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new C0614j(e3);
            }
        }
    }

    /* renamed from: b */
    public final Object m2494b(Class cls, HashSet hashSet) {
        Object objMo1607b;
        if (AbstractC0364l.m989O()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f4135a;
        if (map.containsKey(cls)) {
            objMo1607b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0986b interfaceC0986b = (InterfaceC0986b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listMo1606a = interfaceC0986b.mo1606a();
                if (!listMo1606a.isEmpty()) {
                    for (Class cls2 : listMo1606a) {
                        if (!map.containsKey(cls2)) {
                            m2494b(cls2, hashSet);
                        }
                    }
                }
                objMo1607b = interfaceC0986b.mo1607b(this.f4137c);
                hashSet.remove(cls);
                map.put(cls, objMo1607b);
            } catch (Throwable th2) {
                throw new C0614j(th2);
            }
        }
        Trace.endSection();
        return objMo1607b;
    }
}
