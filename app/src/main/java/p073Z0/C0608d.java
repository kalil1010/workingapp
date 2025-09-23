package p073Z0;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p080b1.C0767e;
import p080b1.C0772j;
import p080b1.C0774l;
import p084c1.AbstractC0806q;
import p084c1.C0791b;
import p084c1.C0792c;
import p084c1.C0793d;
import p084c1.C0796g;
import p084c1.C0797h;
import p084c1.C0803n;
import p084c1.C0804o;
import p095f1.AbstractC0963b;
import p098g1.C0970a;
import p101h1.C0988b;

/* renamed from: Z0.d */
/* loaded from: classes.dex */
public final class C0608d {

    /* renamed from: a */
    public final ThreadLocal f1921a;

    /* renamed from: b */
    public final ConcurrentHashMap f1922b;

    /* renamed from: c */
    public final C0767e f1923c;

    /* renamed from: d */
    public final C0792c f1924d;

    /* renamed from: e */
    public final List f1925e;

    /* renamed from: f */
    public final boolean f1926f;

    public C0608d() {
        C0772j c0772j = C0772j.f2894c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f1921a = new ThreadLocal();
        this.f1922b = new ConcurrentHashMap();
        C0767e c0767e = new C0767e(1);
        this.f1923c = c0767e;
        this.f1926f = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC0806q.f3017z);
        arrayList.add(C0797h.f2960b);
        arrayList.add(c0772j);
        arrayList.addAll(list);
        arrayList.add(AbstractC0806q.f3007p);
        arrayList.add(AbstractC0806q.f2998g);
        arrayList.add(AbstractC0806q.f2995d);
        arrayList.add(AbstractC0806q.f2996e);
        arrayList.add(AbstractC0806q.f2997f);
        C0796g c0796g = AbstractC0806q.f3002k;
        arrayList.add(new C0804o(Long.TYPE, Long.class, c0796g));
        arrayList.add(new C0804o(Double.TYPE, Double.class, new C0605a(0)));
        arrayList.add(new C0804o(Float.TYPE, Float.class, new C0605a(1)));
        arrayList.add(C0796g.f2958b);
        arrayList.add(AbstractC0806q.f2999h);
        arrayList.add(AbstractC0806q.f3000i);
        arrayList.add(new C0803n(AtomicLong.class, new C0606b(new C0606b(c0796g, 0), 2), 0));
        arrayList.add(new C0803n(AtomicLongArray.class, new C0606b(new C0606b(c0796g, 1), 2), 0));
        arrayList.add(AbstractC0806q.f3001j);
        arrayList.add(AbstractC0806q.f3003l);
        arrayList.add(AbstractC0806q.f3008q);
        arrayList.add(AbstractC0806q.f3009r);
        arrayList.add(new C0803n(BigDecimal.class, AbstractC0806q.f3004m, 0));
        arrayList.add(new C0803n(BigInteger.class, AbstractC0806q.f3005n, 0));
        arrayList.add(new C0803n(C0774l.class, AbstractC0806q.f3006o, 0));
        arrayList.add(AbstractC0806q.f3010s);
        arrayList.add(AbstractC0806q.f3011t);
        arrayList.add(AbstractC0806q.f3013v);
        arrayList.add(AbstractC0806q.f3014w);
        arrayList.add(AbstractC0806q.f3016y);
        arrayList.add(AbstractC0806q.f3012u);
        arrayList.add(AbstractC0806q.f2993b);
        arrayList.add(C0793d.f2950b);
        arrayList.add(AbstractC0806q.f3015x);
        if (AbstractC0963b.f4040a) {
            arrayList.add(AbstractC0963b.f4042c);
            arrayList.add(AbstractC0963b.f4041b);
            arrayList.add(AbstractC0963b.f4043d);
        }
        arrayList.add(C0791b.f2944d);
        arrayList.add(AbstractC0806q.f2992a);
        arrayList.add(new C0792c(c0767e, 0));
        arrayList.add(new C0792c(c0767e, 2));
        C0792c c0792c = new C0792c(c0767e, 1);
        this.f1924d = c0792c;
        arrayList.add(c0792c);
        arrayList.add(AbstractC0806q.f2991A);
        arrayList.add(new C0803n(c0767e, c0772j, c0792c));
        this.f1925e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m1408a(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            throw new IllegalArgumentException(d3 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1409b(java.lang.String r5, java.lang.Class r6) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p073Z0.C0608d.m1409b(java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* renamed from: c */
    public final AbstractC0616l m1410c(C0970a c0970a) {
        boolean z2;
        ConcurrentHashMap concurrentHashMap = this.f1922b;
        AbstractC0616l abstractC0616l = (AbstractC0616l) concurrentHashMap.get(c0970a);
        if (abstractC0616l != null) {
            return abstractC0616l;
        }
        ThreadLocal threadLocal = this.f1921a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z2 = true;
        } else {
            AbstractC0616l abstractC0616l2 = (AbstractC0616l) map.get(c0970a);
            if (abstractC0616l2 != null) {
                return abstractC0616l2;
            }
            z2 = false;
        }
        try {
            C0607c c0607c = new C0607c();
            AbstractC0616l abstractC0616lMo1416a = null;
            c0607c.f1920a = null;
            map.put(c0970a, c0607c);
            Iterator it = this.f1925e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC0616lMo1416a = ((InterfaceC0617m) it.next()).mo1416a(this, c0970a);
                if (abstractC0616lMo1416a != null) {
                    if (c0607c.f1920a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c0607c.f1920a = abstractC0616lMo1416a;
                    map.put(c0970a, abstractC0616lMo1416a);
                }
            }
            if (z2) {
                threadLocal.remove();
            }
            if (abstractC0616lMo1416a != null) {
                if (z2) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC0616lMo1416a;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + c0970a);
        } catch (Throwable th) {
            if (z2) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final String m1411d(Object obj) {
        Class<?> cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            C0988b c0988b = new C0988b(stringWriter);
            c0988b.f4161f = this.f1926f;
            c0988b.f4160e = false;
            c0988b.f4163h = false;
            m1412e(obj, cls, c0988b);
            return stringWriter.toString();
        } catch (IOException e3) {
            throw new C0611g(e3);
        }
    }

    /* renamed from: e */
    public final void m1412e(Object obj, Class cls, C0988b c0988b) {
        AbstractC0616l abstractC0616lM1410c = m1410c(new C0970a(cls));
        boolean z2 = c0988b.f4160e;
        c0988b.f4160e = true;
        boolean z3 = c0988b.f4161f;
        c0988b.f4161f = this.f1926f;
        boolean z4 = c0988b.f4163h;
        c0988b.f4163h = false;
        try {
            try {
                try {
                    abstractC0616lM1410c.mo1407b(c0988b, obj);
                } catch (IOException e3) {
                    throw new C0611g(e3);
                }
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e4.getMessage(), e4);
            }
        } finally {
            c0988b.f4160e = z2;
            c0988b.f4161f = z3;
            c0988b.f4163h = z4;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f1925e + ",instanceCreators:" + this.f1923c + "}";
    }
}
