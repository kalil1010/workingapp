package p084c1;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p006C.AbstractC0075g;
import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p080b1.C0778p;
import p098g1.C0970a;
import p101h1.C0987a;
import p101h1.C0988b;
import p124q.AbstractC1271e;

/* renamed from: c1.h */
/* loaded from: classes.dex */
public final class C0797h extends AbstractC0616l {

    /* renamed from: b */
    public static final C0790a f2960b = new C0790a(2);

    /* renamed from: a */
    public final C0608d f2961a;

    public C0797h(C0608d c0608d) {
        this.f2961a = c0608d;
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) {
        Object arrayList;
        Serializable arrayList2;
        int iM2496B = c0987a.m2496B();
        int iM2966a = AbstractC1271e.m2966a(iM2496B);
        if (iM2966a == 0) {
            c0987a.m2504g();
            arrayList = new ArrayList();
        } else if (iM2966a != 2) {
            arrayList = null;
        } else {
            c0987a.m2505h();
            arrayList = new C0778p(true);
        }
        if (arrayList == null) {
            return m2004c(c0987a, iM2496B);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c0987a.m2512o()) {
                String strM2519v = arrayList instanceof Map ? c0987a.m2519v() : null;
                int iM2496B2 = c0987a.m2496B();
                int iM2966a2 = AbstractC1271e.m2966a(iM2496B2);
                if (iM2966a2 == 0) {
                    c0987a.m2504g();
                    arrayList2 = new ArrayList();
                } else if (iM2966a2 != 2) {
                    arrayList2 = null;
                } else {
                    c0987a.m2505h();
                    arrayList2 = new C0778p(true);
                }
                boolean z2 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m2004c(c0987a, iM2496B2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strM2519v, arrayList2);
                }
                if (z2) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c0987a.m2508k();
                } else {
                    c0987a.m2509l();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) throws IOException {
        if (obj == null) {
            c0988b.m2532o();
            return;
        }
        Class<?> cls = obj.getClass();
        C0608d c0608d = this.f2961a;
        c0608d.getClass();
        AbstractC0616l abstractC0616lM1410c = c0608d.m1410c(new C0970a(cls));
        if (!(abstractC0616lM1410c instanceof C0797h)) {
            abstractC0616lM1410c.mo1407b(c0988b, obj);
        } else {
            c0988b.m2526i();
            c0988b.m2529l();
        }
    }

    /* renamed from: c */
    public final Serializable m2004c(C0987a c0987a, int i2) {
        int iM2966a = AbstractC1271e.m2966a(i2);
        if (iM2966a == 5) {
            return c0987a.m2523z();
        }
        if (iM2966a == 6) {
            return Double.valueOf(c0987a.m2516s());
        }
        if (iM2966a == 7) {
            return Boolean.valueOf(c0987a.m2515r());
        }
        if (iM2966a != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0075g.m242k(i2)));
        }
        c0987a.m2521x();
        return null;
    }
}
