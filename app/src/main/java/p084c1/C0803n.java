package p084c1;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p006C.AbstractC0075g;
import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p073Z0.InterfaceC0617m;
import p080b1.AbstractC0766d;
import p080b1.C0767e;
import p080b1.C0772j;
import p092e1.AbstractC0897c;
import p098g1.C0970a;

/* renamed from: c1.n */
/* loaded from: classes.dex */
public final class C0803n implements InterfaceC0617m {

    /* renamed from: a */
    public final /* synthetic */ int f2984a;

    /* renamed from: b */
    public final Object f2985b;

    /* renamed from: c */
    public final Object f2986c;

    public /* synthetic */ C0803n(Class cls, AbstractC0616l abstractC0616l, int i2) {
        this.f2984a = i2;
        this.f2985b = cls;
        this.f2986c = abstractC0616l;
    }

    @Override // p073Z0.InterfaceC0617m
    /* renamed from: a */
    public final AbstractC0616l mo1416a(C0608d c0608d, C0970a c0970a) {
        switch (this.f2984a) {
            case 0:
                if (c0970a.f4064a == ((Class) this.f2985b)) {
                    return (AbstractC0616l) this.f2986c;
                }
                return null;
            case 1:
                Class cls = (Class) this.f2985b;
                Class<?> cls2 = c0970a.f4064a;
                if (cls.isAssignableFrom(cls2)) {
                    return new C0791b(this, cls2);
                }
                return null;
            default:
                Class cls3 = c0970a.f4064a;
                if (!Object.class.isAssignableFrom(cls3)) {
                    return null;
                }
                List list = Collections.EMPTY_LIST;
                AbstractC0766d.m1968e();
                return AbstractC0897c.f3726a.mo1019P(cls3) ? new C0801l(cls3, m2009b(c0608d, c0970a, cls3, true)) : new C0800k(((C0767e) this.f2985b).m1980g(c0970a), m2009b(c0608d, c0970a, cls3, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d1, code lost:
    
        r14 = new p098g1.C0970a(p080b1.AbstractC0766d.m1971h(r6, r15, r15.getGenericSuperclass(), new java.util.HashMap()));
        r15 = r14.f4064a;
        r0 = r26;
        r9 = r27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedHashMap m2009b(p073Z0.C0608d r27, p098g1.C0970a r28, java.lang.Class r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p084c1.C0803n.m2009b(Z0.d, g1.a, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    /* renamed from: c */
    public boolean m2010c(Field field, boolean z2) {
        Class<?> type = field.getType();
        C0772j c0772j = (C0772j) this.f2986c;
        c0772j.getClass();
        if (C0772j.m1987c(type)) {
            return false;
        }
        c0772j.m1988b(z2);
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || C0772j.m1987c(field.getType())) {
            return false;
        }
        List list = z2 ? c0772j.f2895a : c0772j.f2896b;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
        return true;
    }

    public String toString() {
        switch (this.f2984a) {
            case 0:
                return "Factory[type=" + ((Class) this.f2985b).getName() + ",adapter=" + ((AbstractC0616l) this.f2986c) + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f2985b).getName() + ",adapter=" + ((AbstractC0616l) this.f2986c) + "]";
            default:
                return super.toString();
        }
    }

    public C0803n(C0767e c0767e, C0772j c0772j, C0792c c0792c) {
        this.f2984a = 2;
        List list = Collections.EMPTY_LIST;
        this.f2985b = c0767e;
        this.f2986c = c0772j;
    }
}
