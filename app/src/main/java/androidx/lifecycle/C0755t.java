package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p006C.AbstractC0075g;
import p108k.C1181a;
import p111l.C1219a;
import p111l.C1221c;
import p131s1.AbstractC1326c;

/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public final class C0755t {

    /* renamed from: a */
    public final boolean f2730a;

    /* renamed from: b */
    public C1219a f2731b;

    /* renamed from: c */
    public EnumC0748m f2732c;

    /* renamed from: d */
    public final WeakReference f2733d;

    /* renamed from: e */
    public int f2734e;

    /* renamed from: f */
    public boolean f2735f;

    /* renamed from: g */
    public boolean f2736g;

    /* renamed from: h */
    public final ArrayList f2737h;

    public C0755t(InterfaceC0753r interfaceC0753r) {
        new AtomicReference();
        this.f2730a = true;
        this.f2731b = new C1219a();
        this.f2732c = EnumC0748m.f2722b;
        this.f2737h = new ArrayList();
        this.f2733d = new WeakReference(interfaceC0753r);
    }

    /* renamed from: a */
    public final void m1779a(InterfaceC0752q interfaceC0752q) {
        InterfaceC0751p reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC0753r interfaceC0753r;
        ArrayList arrayList = this.f2737h;
        m1781c("addObserver");
        EnumC0748m enumC0748m = this.f2732c;
        EnumC0748m enumC0748m2 = EnumC0748m.f2721a;
        if (enumC0748m != enumC0748m2) {
            enumC0748m2 = EnumC0748m.f2722b;
        }
        C0754s c0754s = new C0754s();
        HashMap map = AbstractC0756u.f2738a;
        boolean z2 = interfaceC0752q instanceof InterfaceC0751p;
        boolean z3 = interfaceC0752q instanceof InterfaceC0739d;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0739d) interfaceC0752q, (InterfaceC0751p) interfaceC0752q);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0739d) interfaceC0752q, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (InterfaceC0751p) interfaceC0752q;
        } else {
            Class<?> cls = interfaceC0752q.getClass();
            if (AbstractC0756u.m1788b(cls) == 2) {
                Object obj2 = AbstractC0756u.f2739b.get(cls);
                AbstractC1326c.m3059b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0756u.m1787a((Constructor) list.get(0), interfaceC0752q);
                    throw null;
                }
                int size = list.size();
                InterfaceC0742g[] interfaceC0742gArr = new InterfaceC0742g[size];
                if (size > 0) {
                    AbstractC0756u.m1787a((Constructor) list.get(0), interfaceC0752q);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0742gArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0752q);
            }
        }
        c0754s.f2729b = reflectiveGenericLifecycleObserver;
        c0754s.f2728a = enumC0748m2;
        C1219a c1219a = this.f2731b;
        C1221c c1221cMo2854a = c1219a.mo2854a(interfaceC0752q);
        if (c1221cMo2854a != null) {
            obj = c1221cMo2854a.f4912b;
        } else {
            HashMap map2 = c1219a.f4907e;
            C1221c c1221c = new C1221c(interfaceC0752q, c0754s);
            c1219a.f4921d++;
            C1221c c1221c2 = c1219a.f4919b;
            if (c1221c2 == null) {
                c1219a.f4918a = c1221c;
                c1219a.f4919b = c1221c;
            } else {
                c1221c2.f4913c = c1221c;
                c1221c.f4914d = c1221c2;
                c1219a.f4919b = c1221c;
            }
            map2.put(interfaceC0752q, c1221c);
            obj = null;
        }
        if (((C0754s) obj) == null && (interfaceC0753r = (InterfaceC0753r) this.f2733d.get()) != null) {
            boolean z4 = this.f2734e != 0 || this.f2735f;
            EnumC0748m enumC0748mM1780b = m1780b(interfaceC0752q);
            this.f2734e++;
            while (c0754s.f2728a.compareTo(enumC0748mM1780b) < 0 && this.f2731b.f4907e.containsKey(interfaceC0752q)) {
                arrayList.add(c0754s.f2728a);
                C0745j c0745j = EnumC0747l.Companion;
                EnumC0748m enumC0748m3 = c0754s.f2728a;
                c0745j.getClass();
                AbstractC1326c.m3062e(enumC0748m3, "state");
                int iOrdinal = enumC0748m3.ordinal();
                EnumC0747l enumC0747l = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0747l.ON_RESUME : EnumC0747l.ON_START : EnumC0747l.ON_CREATE;
                if (enumC0747l == null) {
                    throw new IllegalStateException("no event up from " + c0754s.f2728a);
                }
                c0754s.m1778a(interfaceC0753r, enumC0747l);
                arrayList.remove(arrayList.size() - 1);
                enumC0748mM1780b = m1780b(interfaceC0752q);
            }
            if (!z4) {
                m1786h();
            }
            this.f2734e--;
        }
    }

    /* renamed from: b */
    public final EnumC0748m m1780b(InterfaceC0752q interfaceC0752q) {
        HashMap map = this.f2731b.f4907e;
        C1221c c1221c = map.containsKey(interfaceC0752q) ? ((C1221c) map.get(interfaceC0752q)).f4914d : null;
        EnumC0748m enumC0748m = c1221c != null ? ((C0754s) c1221c.f4912b).f2728a : null;
        ArrayList arrayList = this.f2737h;
        EnumC0748m enumC0748m2 = arrayList.isEmpty() ? null : (EnumC0748m) arrayList.get(arrayList.size() - 1);
        EnumC0748m enumC0748m3 = this.f2732c;
        AbstractC1326c.m3062e(enumC0748m3, "state1");
        if (enumC0748m == null || enumC0748m.compareTo(enumC0748m3) >= 0) {
            enumC0748m = enumC0748m3;
        }
        return (enumC0748m2 == null || enumC0748m2.compareTo(enumC0748m) >= 0) ? enumC0748m : enumC0748m2;
    }

    /* renamed from: c */
    public final void m1781c(String str) {
        if (this.f2730a) {
            ((C1181a) C1181a.m2831L().f4804n).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0075g.m238g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* renamed from: d */
    public final void m1782d(EnumC0747l enumC0747l) {
        AbstractC1326c.m3062e(enumC0747l, "event");
        m1781c("handleLifecycleEvent");
        m1783e(enumC0747l.m1777a());
    }

    /* renamed from: e */
    public final void m1783e(EnumC0748m enumC0748m) {
        EnumC0748m enumC0748m2 = this.f2732c;
        if (enumC0748m2 == enumC0748m) {
            return;
        }
        EnumC0748m enumC0748m3 = EnumC0748m.f2722b;
        EnumC0748m enumC0748m4 = EnumC0748m.f2721a;
        if (enumC0748m2 == enumC0748m3 && enumC0748m == enumC0748m4) {
            throw new IllegalStateException(("no event down from " + this.f2732c + " in component " + this.f2733d.get()).toString());
        }
        this.f2732c = enumC0748m;
        if (this.f2735f || this.f2734e != 0) {
            this.f2736g = true;
            return;
        }
        this.f2735f = true;
        m1786h();
        this.f2735f = false;
        if (this.f2732c == enumC0748m4) {
            this.f2731b = new C1219a();
        }
    }

    /* renamed from: f */
    public final void m1784f(InterfaceC0752q interfaceC0752q) {
        m1781c("removeObserver");
        this.f2731b.mo2855b(interfaceC0752q);
    }

    /* renamed from: g */
    public final void m1785g() {
        EnumC0748m enumC0748m = EnumC0748m.f2723c;
        m1781c("setCurrentState");
        m1783e(enumC0748m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f2736g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1786h() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0755t.m1786h():void");
    }
}
