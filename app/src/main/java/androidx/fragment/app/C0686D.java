package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0641g;
import androidx.activity.C0655s;
import androidx.activity.C0656t;
import androidx.activity.InterfaceC0637c;
import androidx.lifecycle.AbstractC0732I;
import androidx.lifecycle.C0733J;
import androidx.lifecycle.C0734K;
import androidx.lifecycle.EnumC0748m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p002A1.AbstractActivityC0021c;
import p002A1.C0019a;
import p002A1.C0027i;
import p002A1.RunnableC0042x;
import p006C.AbstractC0075g;
import p033L1.AbstractC0364l;
import p055T0.C0511e;
import p076a0.C0624a;
import p131s1.AbstractC1326c;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: androidx.fragment.app.D */
/* loaded from: classes.dex */
public final class C0686D {

    /* renamed from: A */
    public boolean f2439A;

    /* renamed from: B */
    public boolean f2440B;

    /* renamed from: C */
    public ArrayList f2441C;

    /* renamed from: D */
    public ArrayList f2442D;

    /* renamed from: E */
    public ArrayList f2443E;

    /* renamed from: F */
    public C0688F f2444F;

    /* renamed from: G */
    public final RunnableC0042x f2445G;

    /* renamed from: b */
    public boolean f2447b;

    /* renamed from: d */
    public ArrayList f2449d;

    /* renamed from: e */
    public ArrayList f2450e;

    /* renamed from: g */
    public C0656t f2452g;

    /* renamed from: k */
    public final C0019a f2456k;

    /* renamed from: l */
    public final CopyOnWriteArrayList f2457l;

    /* renamed from: m */
    public int f2458m;

    /* renamed from: n */
    public C0715r f2459n;

    /* renamed from: o */
    public AbstractC0364l f2460o;

    /* renamed from: p */
    public AbstractComponentCallbacksC0712o f2461p;

    /* renamed from: q */
    public AbstractComponentCallbacksC0712o f2462q;

    /* renamed from: r */
    public final C0721x f2463r;

    /* renamed from: s */
    public final C0511e f2464s;

    /* renamed from: t */
    public C0019a f2465t;

    /* renamed from: u */
    public C0019a f2466u;

    /* renamed from: v */
    public C0019a f2467v;

    /* renamed from: w */
    public ArrayDeque f2468w;

    /* renamed from: x */
    public boolean f2469x;

    /* renamed from: y */
    public boolean f2470y;

    /* renamed from: z */
    public boolean f2471z;

    /* renamed from: a */
    public final ArrayList f2446a = new ArrayList();

    /* renamed from: c */
    public final C0027i f2448c = new C0027i();

    /* renamed from: f */
    public final LayoutInflaterFactory2C0718u f2451f = new LayoutInflaterFactory2C0718u(this);

    /* renamed from: h */
    public final C0720w f2453h = new C0720w(this);

    /* renamed from: i */
    public final AtomicInteger f2454i = new AtomicInteger();

    /* renamed from: j */
    public final Map f2455j = Collections.synchronizedMap(new HashMap());

    public C0686D() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new C0511e(18, this);
        this.f2456k = new C0019a(this);
        this.f2457l = new CopyOnWriteArrayList();
        this.f2458m = -1;
        this.f2463r = new C0721x(this);
        this.f2464s = new C0511e(19);
        this.f2468w = new ArrayDeque();
        this.f2445G = new RunnableC0042x(11, this);
    }

    /* renamed from: D */
    public static boolean m1646D(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    /* renamed from: E */
    public static boolean m1647E(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        abstractComponentCallbacksC0712o.getClass();
        C0027i c0027i = abstractComponentCallbacksC0712o.f2647t.f2448c;
        c0027i.getClass();
        ArrayList arrayList = new ArrayList();
        for (C0691I c0691i : ((HashMap) c0027i.f66c).values()) {
            if (c0691i != null) {
                arrayList.add(c0691i.f2506c);
            } else {
                arrayList.add(null);
            }
        }
        Iterator it = arrayList.iterator();
        boolean zM1647E = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = (AbstractComponentCallbacksC0712o) it.next();
            if (abstractComponentCallbacksC0712o2 != null) {
                zM1647E = m1647E(abstractComponentCallbacksC0712o2);
            }
            if (zM1647E) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m1648F(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        if (abstractComponentCallbacksC0712o == null) {
            return true;
        }
        if (abstractComponentCallbacksC0712o.f2613B) {
            return abstractComponentCallbacksC0712o.f2645r == null || m1648F(abstractComponentCallbacksC0712o.f2648u);
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m1649G(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        if (abstractComponentCallbacksC0712o == null) {
            return true;
        }
        C0686D c0686d = abstractComponentCallbacksC0712o.f2645r;
        return abstractComponentCallbacksC0712o.equals(c0686d.f2462q) && m1649G(c0686d.f2461p);
    }

    /* renamed from: A */
    public final ViewGroup m1650A(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        ViewGroup viewGroup = abstractComponentCallbacksC0712o.f2615D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0712o.f2650w <= 0 || !this.f2460o.mo1022W()) {
            return null;
        }
        View viewMo1021V = this.f2460o.mo1021V(abstractComponentCallbacksC0712o.f2650w);
        if (viewMo1021V instanceof ViewGroup) {
            return (ViewGroup) viewMo1021V;
        }
        return null;
    }

    /* renamed from: B */
    public final C0721x m1651B() {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2461p;
        return abstractComponentCallbacksC0712o != null ? abstractComponentCallbacksC0712o.f2645r.m1651B() : this.f2463r;
    }

    /* renamed from: C */
    public final C0511e m1652C() {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2461p;
        return abstractComponentCallbacksC0712o != null ? abstractComponentCallbacksC0712o.f2645r.m1652C() : this.f2464s;
    }

    /* renamed from: H */
    public final void m1653H(int i2, boolean z2) {
        HashMap map;
        C0715r c0715r;
        if (this.f2459n == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f2458m) {
            this.f2458m = i2;
            C0027i c0027i = this.f2448c;
            Iterator it = ((ArrayList) c0027i.f65b).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (HashMap) c0027i.f66c;
                if (!zHasNext) {
                    break;
                }
                C0691I c0691i = (C0691I) map.get(((AbstractComponentCallbacksC0712o) it.next()).f2632e);
                if (c0691i != null) {
                    c0691i.m1708k();
                }
            }
            for (C0691I c0691i2 : map.values()) {
                if (c0691i2 != null) {
                    c0691i2.m1708k();
                    AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0691i2.f2506c;
                    if (abstractComponentCallbacksC0712o.f2639l && abstractComponentCallbacksC0712o.f2644q <= 0) {
                        c0027i.m109K(c0691i2);
                    }
                }
            }
            m1666U();
            if (this.f2469x && (c0715r = this.f2459n) != null && this.f2458m == 7) {
                c0715r.f2662j.m2215i().mo2229a();
                this.f2469x = false;
            }
        }
    }

    /* renamed from: I */
    public final void m1654I() {
        if (this.f2459n == null) {
            return;
        }
        this.f2470y = false;
        this.f2471z = false;
        this.f2444F.f2485h = false;
        for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : this.f2448c.m103E()) {
            if (abstractComponentCallbacksC0712o != null) {
                abstractComponentCallbacksC0712o.f2647t.m1654I();
            }
        }
    }

    /* renamed from: J */
    public final boolean m1655J() {
        m1691x(false);
        m1690w(true);
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2462q;
        if (abstractComponentCallbacksC0712o != null && abstractComponentCallbacksC0712o.m1753g().m1655J()) {
            return true;
        }
        boolean zM1656K = m1656K(this.f2441C, this.f2442D, -1, 0);
        if (zM1656K) {
            this.f2447b = true;
            try {
                m1658M(this.f2441C, this.f2442D);
            } finally {
                m1671d();
            }
        }
        m1667V();
        m1687t();
        ((HashMap) this.f2448c.f66c).values().removeAll(Collections.singleton(null));
        return zM1656K;
    }

    /* renamed from: K */
    public final boolean m1656K(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        int size;
        C0698a c0698a;
        ArrayList arrayList3 = this.f2449d;
        if (arrayList3 == null) {
            return false;
        }
        if (i2 < 0 && (i3 & 1) == 0) {
            int size2 = arrayList3.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.f2449d.remove(size2));
            arrayList2.add(Boolean.TRUE);
            return true;
        }
        if (i2 >= 0) {
            size = arrayList3.size() - 1;
            while (size >= 0) {
                C0698a c0698a2 = (C0698a) this.f2449d.get(size);
                if (i2 >= 0 && i2 == c0698a2.f2549r) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return false;
            }
            if ((i3 & 1) != 0) {
                do {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    c0698a = (C0698a) this.f2449d.get(size);
                    if (i2 < 0) {
                        break;
                    }
                } while (i2 == c0698a.f2549r);
            }
        } else {
            size = -1;
        }
        if (size == this.f2449d.size() - 1) {
            return false;
        }
        for (int size3 = this.f2449d.size() - 1; size3 > size; size3--) {
            arrayList.add(this.f2449d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: L */
    public final void m1657L(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        if (m1646D(2)) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        boolean z2 = abstractComponentCallbacksC0712o.f2644q > 0;
        if (abstractComponentCallbacksC0712o.f2653z && z2) {
            return;
        }
        C0027i c0027i = this.f2448c;
        synchronized (((ArrayList) c0027i.f65b)) {
            ((ArrayList) c0027i.f65b).remove(abstractComponentCallbacksC0712o);
        }
        abstractComponentCallbacksC0712o.f2638k = false;
        if (m1647E(abstractComponentCallbacksC0712o)) {
            this.f2469x = true;
        }
        abstractComponentCallbacksC0712o.f2639l = true;
        m1665T(abstractComponentCallbacksC0712o);
    }

    /* renamed from: M */
    public final void m1658M(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((C0698a) arrayList.get(i2)).f2546o) {
                if (i3 != i2) {
                    m1692y(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((C0698a) arrayList.get(i3)).f2546o) {
                        i3++;
                    }
                }
                m1692y(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m1692y(arrayList, arrayList2, i3, size);
        }
    }

    /* renamed from: N */
    public final void m1659N(Parcelable parcelable) {
        int i2;
        C0019a c0019a;
        int i3;
        C0691I c0691i;
        if (parcelable == null) {
            return;
        }
        C0687E c0687e = (C0687E) parcelable;
        if (c0687e.f2472a == null) {
            return;
        }
        C0027i c0027i = this.f2448c;
        ((HashMap) c0027i.f66c).clear();
        Iterator it = c0687e.f2472a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i2 = 2;
            c0019a = this.f2456k;
            if (!zHasNext) {
                break;
            }
            C0690H c0690h = (C0690H) it.next();
            if (c0690h != null) {
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = (AbstractComponentCallbacksC0712o) this.f2444F.f2480c.get(c0690h.f2492b);
                if (abstractComponentCallbacksC0712o != null) {
                    if (m1646D(2)) {
                        abstractComponentCallbacksC0712o.toString();
                    }
                    c0691i = new C0691I(c0019a, c0027i, abstractComponentCallbacksC0712o, c0690h);
                } else {
                    c0691i = new C0691I(this.f2456k, this.f2448c, this.f2459n.f2659g.getClassLoader(), m1651B(), c0690h);
                }
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = c0691i.f2506c;
                abstractComponentCallbacksC0712o2.f2645r = this;
                if (m1646D(2)) {
                    abstractComponentCallbacksC0712o2.toString();
                }
                c0691i.m1710m(this.f2459n.f2659g.getClassLoader());
                c0027i.m108J(c0691i);
                c0691i.f2508e = this.f2458m;
            }
        }
        C0688F c0688f = this.f2444F;
        c0688f.getClass();
        Iterator it2 = new ArrayList(c0688f.f2480c.values()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o3 = (AbstractComponentCallbacksC0712o) it2.next();
            if ((((HashMap) c0027i.f66c).get(abstractComponentCallbacksC0712o3.f2632e) != null ? 1 : 0) == 0) {
                if (m1646D(2)) {
                    abstractComponentCallbacksC0712o3.toString();
                    Objects.toString(c0687e.f2472a);
                }
                this.f2444F.m1695b(abstractComponentCallbacksC0712o3);
                abstractComponentCallbacksC0712o3.f2645r = this;
                C0691I c0691i2 = new C0691I(c0019a, c0027i, abstractComponentCallbacksC0712o3);
                c0691i2.f2508e = 1;
                c0691i2.m1708k();
                abstractComponentCallbacksC0712o3.f2639l = true;
                c0691i2.m1708k();
            }
        }
        ArrayList<String> arrayList = c0687e.f2473b;
        ((ArrayList) c0027i.f65b).clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712oM138v = c0027i.m138v(str);
                if (abstractComponentCallbacksC0712oM138v == null) {
                    throw new IllegalStateException(AbstractC0075g.m238g("No instantiated fragment for (", str, ")"));
                }
                if (m1646D(2)) {
                    abstractComponentCallbacksC0712oM138v.toString();
                }
                c0027i.m131o(abstractComponentCallbacksC0712oM138v);
            }
        }
        if (c0687e.f2474c != null) {
            this.f2449d = new ArrayList(c0687e.f2474c.length);
            int i4 = 0;
            while (true) {
                C0699b[] c0699bArr = c0687e.f2474c;
                if (i4 >= c0699bArr.length) {
                    break;
                }
                C0699b c0699b = c0699bArr[i4];
                c0699b.getClass();
                C0698a c0698a = new C0698a(this);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int[] iArr = c0699b.f2550a;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    C0692J c0692j = new C0692J();
                    int i7 = i5 + 1;
                    c0692j.f2509a = iArr[i5];
                    if (m1646D(i2)) {
                        c0698a.toString();
                        int i8 = iArr[i7];
                    }
                    String str2 = (String) c0699b.f2551b.get(i6);
                    if (str2 != null) {
                        c0692j.f2510b = c0027i.m138v(str2);
                    } else {
                        c0692j.f2510b = null;
                    }
                    int i9 = i2;
                    c0692j.f2515g = EnumC0748m.values()[c0699b.f2552c[i6]];
                    c0692j.f2516h = EnumC0748m.values()[c0699b.f2553d[i6]];
                    int i10 = iArr[i7];
                    c0692j.f2511c = i10;
                    int i11 = iArr[i5 + 2];
                    c0692j.f2512d = i11;
                    int i12 = i5 + 4;
                    int i13 = iArr[i5 + 3];
                    c0692j.f2513e = i13;
                    i5 += 5;
                    int i14 = iArr[i12];
                    c0692j.f2514f = i14;
                    c0698a.f2533b = i10;
                    c0698a.f2534c = i11;
                    c0698a.f2535d = i13;
                    c0698a.f2536e = i14;
                    c0698a.m1722b(c0692j);
                    i6++;
                    i2 = i9;
                }
                int i15 = i2;
                c0698a.f2537f = c0699b.f2554e;
                c0698a.f2539h = c0699b.f2555f;
                c0698a.f2549r = c0699b.f2556g;
                c0698a.f2538g = true;
                c0698a.f2540i = c0699b.f2557h;
                c0698a.f2541j = c0699b.f2558i;
                c0698a.f2542k = c0699b.f2559j;
                c0698a.f2543l = c0699b.f2560k;
                c0698a.f2544m = c0699b.f2561l;
                c0698a.f2545n = c0699b.f2562m;
                c0698a.f2546o = c0699b.f2563n;
                c0698a.m1723c(1);
                if (m1646D(i15)) {
                    c0698a.toString();
                    PrintWriter printWriter = new PrintWriter(new C0694L());
                    c0698a.m1724d("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2449d.add(c0698a);
                i4++;
                i2 = i15;
            }
        } else {
            this.f2449d = null;
        }
        this.f2454i.set(c0687e.f2475d);
        String str3 = c0687e.f2476e;
        if (str3 != null) {
            AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712oM138v2 = c0027i.m138v(str3);
            this.f2462q = abstractComponentCallbacksC0712oM138v2;
            m1683p(abstractComponentCallbacksC0712oM138v2);
        }
        ArrayList arrayList2 = c0687e.f2477f;
        if (arrayList2 != null) {
            while (i3 < arrayList2.size()) {
                Bundle bundle = (Bundle) c0687e.f2478g.get(i3);
                bundle.setClassLoader(this.f2459n.f2659g.getClassLoader());
                this.f2455j.put(arrayList2.get(i3), bundle);
                i3++;
            }
        }
        this.f2468w = new ArrayDeque(c0687e.f2479h);
    }

    /* renamed from: O */
    public final C0687E m1660O() {
        int i2;
        ArrayList arrayList;
        C0699b[] c0699bArr;
        int size;
        Iterator it = m1672e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0705h c0705h = (C0705h) it.next();
            if (c0705h.f2581e) {
                c0705h.f2581e = false;
                c0705h.m1736c();
            }
        }
        Iterator it2 = m1672e().iterator();
        while (it2.hasNext()) {
            ((C0705h) it2.next()).m1738e();
        }
        m1691x(true);
        this.f2470y = true;
        this.f2444F.f2485h = true;
        C0027i c0027i = this.f2448c;
        c0027i.getClass();
        HashMap map = (HashMap) c0027i.f66c;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0691I c0691i = (C0691I) it3.next();
            if (c0691i != null) {
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0691i.f2506c;
                C0690H c0690h = new C0690H(abstractComponentCallbacksC0712o);
                if (abstractComponentCallbacksC0712o.f2628a <= -1 || c0690h.f2503m != null) {
                    c0690h.f2503m = abstractComponentCallbacksC0712o.f2629b;
                } else {
                    Bundle bundle = new Bundle();
                    abstractComponentCallbacksC0712o.mo1746q(bundle);
                    abstractComponentCallbacksC0712o.f2626O.m1459d(bundle);
                    C0687E c0687eM1660O = abstractComponentCallbacksC0712o.f2647t.m1660O();
                    if (c0687eM1660O != null) {
                        bundle.putParcelable("android:support:fragments", c0687eM1660O);
                    }
                    c0691i.f2504a.m77p(false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (abstractComponentCallbacksC0712o.f2616E != null) {
                        c0691i.m1712o();
                    }
                    if (abstractComponentCallbacksC0712o.f2630c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0712o.f2630c);
                    }
                    if (abstractComponentCallbacksC0712o.f2631d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0712o.f2631d);
                    }
                    if (!abstractComponentCallbacksC0712o.f2618G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0712o.f2618G);
                    }
                    c0690h.f2503m = bundle2;
                    if (abstractComponentCallbacksC0712o.f2635h != null) {
                        if (bundle2 == null) {
                            c0690h.f2503m = new Bundle();
                        }
                        c0690h.f2503m.putString("android:target_state", abstractComponentCallbacksC0712o.f2635h);
                        int i3 = abstractComponentCallbacksC0712o.f2636i;
                        if (i3 != 0) {
                            c0690h.f2503m.putInt("android:target_req_state", i3);
                        }
                    }
                }
                arrayList2.add(c0690h);
                if (m1646D(2)) {
                    Objects.toString(abstractComponentCallbacksC0712o);
                    Objects.toString(c0690h.f2503m);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            m1646D(2);
            return null;
        }
        C0027i c0027i2 = this.f2448c;
        synchronized (((ArrayList) c0027i2.f65b)) {
            try {
                if (((ArrayList) c0027i2.f65b).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) c0027i2.f65b).size());
                    Iterator it4 = ((ArrayList) c0027i2.f65b).iterator();
                    while (it4.hasNext()) {
                        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = (AbstractComponentCallbacksC0712o) it4.next();
                        arrayList.add(abstractComponentCallbacksC0712o2.f2632e);
                        if (m1646D(2)) {
                            abstractComponentCallbacksC0712o2.toString();
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList3 = this.f2449d;
        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
            c0699bArr = null;
        } else {
            c0699bArr = new C0699b[size];
            for (i2 = 0; i2 < size; i2++) {
                c0699bArr[i2] = new C0699b((C0698a) this.f2449d.get(i2));
                if (m1646D(2)) {
                    Objects.toString(this.f2449d.get(i2));
                }
            }
        }
        C0687E c0687e = new C0687E();
        c0687e.f2476e = null;
        ArrayList arrayList4 = new ArrayList();
        c0687e.f2477f = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        c0687e.f2478g = arrayList5;
        c0687e.f2472a = arrayList2;
        c0687e.f2473b = arrayList;
        c0687e.f2474c = c0699bArr;
        c0687e.f2475d = this.f2454i.get();
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o3 = this.f2462q;
        if (abstractComponentCallbacksC0712o3 != null) {
            c0687e.f2476e = abstractComponentCallbacksC0712o3.f2632e;
        }
        arrayList4.addAll(this.f2455j.keySet());
        arrayList5.addAll(this.f2455j.values());
        c0687e.f2479h = new ArrayList(this.f2468w);
        return c0687e;
    }

    /* renamed from: P */
    public final void m1661P() {
        synchronized (this.f2446a) {
            try {
                if (this.f2446a.size() == 1) {
                    this.f2459n.f2660h.removeCallbacks(this.f2445G);
                    this.f2459n.f2660h.post(this.f2445G);
                    m1667V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: Q */
    public final void m1662Q(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o, boolean z2) {
        ViewGroup viewGroupM1650A = m1650A(abstractComponentCallbacksC0712o);
        if (viewGroupM1650A == null || !(viewGroupM1650A instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM1650A).setDrawDisappearingViewsLast(!z2);
    }

    /* renamed from: R */
    public final void m1663R(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o, EnumC0748m enumC0748m) {
        if (abstractComponentCallbacksC0712o.equals(this.f2448c.m138v(abstractComponentCallbacksC0712o.f2632e)) && (abstractComponentCallbacksC0712o.f2646s == null || abstractComponentCallbacksC0712o.f2645r == this)) {
            abstractComponentCallbacksC0712o.f2622K = enumC0748m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0712o + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: S */
    public final void m1664S(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        if (abstractComponentCallbacksC0712o != null) {
            if (!abstractComponentCallbacksC0712o.equals(this.f2448c.m138v(abstractComponentCallbacksC0712o.f2632e)) || (abstractComponentCallbacksC0712o.f2646s != null && abstractComponentCallbacksC0712o.f2645r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0712o + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = this.f2462q;
        this.f2462q = abstractComponentCallbacksC0712o;
        m1683p(abstractComponentCallbacksC0712o2);
        m1683p(this.f2462q);
    }

    /* renamed from: T */
    public final void m1665T(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        ViewGroup viewGroupM1650A = m1650A(abstractComponentCallbacksC0712o);
        if (viewGroupM1650A != null) {
            C0711n c0711n = abstractComponentCallbacksC0712o.f2619H;
            if ((c0711n == null ? 0 : c0711n.f2604e) + (c0711n == null ? 0 : c0711n.f2603d) + (c0711n == null ? 0 : c0711n.f2602c) + (c0711n == null ? 0 : c0711n.f2601b) > 0) {
                if (viewGroupM1650A.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM1650A.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0712o);
                }
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = (AbstractComponentCallbacksC0712o) viewGroupM1650A.getTag(R.id.visible_removing_fragment_view_tag);
                C0711n c0711n2 = abstractComponentCallbacksC0712o.f2619H;
                boolean z2 = c0711n2 != null ? c0711n2.f2600a : false;
                if (abstractComponentCallbacksC0712o2.f2619H == null) {
                    return;
                }
                abstractComponentCallbacksC0712o2.m1752f().f2600a = z2;
            }
        }
    }

    /* renamed from: U */
    public final void m1666U() {
        Iterator it = this.f2448c.m140x().iterator();
        while (it.hasNext()) {
            C0691I c0691i = (C0691I) it.next();
            AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0691i.f2506c;
            if (abstractComponentCallbacksC0712o.f2617F) {
                if (this.f2447b) {
                    this.f2440B = true;
                } else {
                    abstractComponentCallbacksC0712o.f2617F = false;
                    c0691i.m1708k();
                }
            }
        }
    }

    /* renamed from: V */
    public final void m1667V() {
        synchronized (this.f2446a) {
            try {
                if (!this.f2446a.isEmpty()) {
                    C0720w c0720w = this.f2453h;
                    c0720w.f2673a = true;
                    C0655s c0655s = c0720w.f2675c;
                    if (c0655s != null) {
                        c0655s.mo349a();
                    }
                    return;
                }
                C0720w c0720w2 = this.f2453h;
                ArrayList arrayList = this.f2449d;
                c0720w2.f2673a = (arrayList != null ? arrayList.size() : 0) > 0 && m1649G(this.f2461p);
                C0655s c0655s2 = c0720w2.f2675c;
                if (c0655s2 != null) {
                    c0655s2.mo349a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final C0691I m1668a(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        if (m1646D(2)) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        C0691I c0691iM1673f = m1673f(abstractComponentCallbacksC0712o);
        abstractComponentCallbacksC0712o.f2645r = this;
        C0027i c0027i = this.f2448c;
        c0027i.m108J(c0691iM1673f);
        if (!abstractComponentCallbacksC0712o.f2653z) {
            c0027i.m131o(abstractComponentCallbacksC0712o);
            abstractComponentCallbacksC0712o.f2639l = false;
            if (abstractComponentCallbacksC0712o.f2616E == null) {
                abstractComponentCallbacksC0712o.f2620I = false;
            }
            if (m1647E(abstractComponentCallbacksC0712o)) {
                this.f2469x = true;
            }
        }
        return c0691iM1673f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m1669b(C0715r c0715r, AbstractC0364l abstractC0364l, AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        C0688F c0688f;
        String str;
        if (this.f2459n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2459n = c0715r;
        this.f2460o = abstractC0364l;
        this.f2461p = abstractComponentCallbacksC0712o;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2457l;
        if (abstractComponentCallbacksC0712o != 0) {
            copyOnWriteArrayList.add(new C0722y(abstractComponentCallbacksC0712o));
        } else if (c0715r != null) {
            copyOnWriteArrayList.add(c0715r);
        }
        if (this.f2461p != null) {
            m1667V();
        }
        if (c0715r != null) {
            C0656t c0656tM1455h = c0715r.f2662j.m1455h();
            this.f2452g = c0656tM1455h;
            c0656tM1455h.m1466a(abstractComponentCallbacksC0712o != 0 ? abstractComponentCallbacksC0712o : c0715r, this.f2453h);
        }
        if (abstractComponentCallbacksC0712o != 0) {
            C0688F c0688f2 = abstractComponentCallbacksC0712o.f2645r.f2444F;
            HashMap map = c0688f2.f2481d;
            C0688F c0688f3 = (C0688F) map.get(abstractComponentCallbacksC0712o.f2632e);
            if (c0688f3 == null) {
                c0688f3 = new C0688F(c0688f2.f2483f);
                map.put(abstractComponentCallbacksC0712o.f2632e, c0688f3);
            }
            this.f2444F = c0688f3;
        } else if (c0715r != null) {
            C0734K c0734kMo1452c = c0715r.f2662j.mo1452c();
            AbstractC1326c.m3062e(c0734kMo1452c, "store");
            C0624a c0624a = C0624a.f1944b;
            AbstractC1326c.m3062e(c0624a, "defaultCreationExtras");
            String canonicalName = C0688F.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC1326c.m3062e(strConcat, "key");
            LinkedHashMap linkedHashMap = c0734kMo1452c.f2707a;
            AbstractC0732I abstractC0732I = (AbstractC0732I) linkedHashMap.get(strConcat);
            if (C0688F.class.isInstance(abstractC0732I)) {
                AbstractC1326c.m3060c(abstractC0732I, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0624a.f1945a);
                linkedHashMap2.put(C0733J.f2706b, strConcat);
                try {
                    c0688f = new C0688F(true);
                } catch (AbstractMethodError unused) {
                    c0688f = new C0688F(true);
                }
                abstractC0732I = c0688f;
                AbstractC0732I abstractC0732I2 = (AbstractC0732I) linkedHashMap.put(strConcat, abstractC0732I);
                if (abstractC0732I2 != null) {
                    abstractC0732I2.mo1694a();
                }
            }
            this.f2444F = (C0688F) abstractC0732I;
        } else {
            this.f2444F = new C0688F(false);
        }
        C0688F c0688f4 = this.f2444F;
        c0688f4.f2485h = this.f2470y || this.f2471z;
        this.f2448c.f67d = c0688f4;
        C0715r c0715r2 = this.f2459n;
        if (c0715r2 != null) {
            AbstractActivityC0021c abstractActivityC0021c = c0715r2.f2662j;
            if (abstractComponentCallbacksC0712o != 0) {
                str = abstractComponentCallbacksC0712o.f2632e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String strM237f = AbstractC0075g.m237f(str2, "StartActivityForResult");
            C0723z c0723z = new C0723z(2);
            C0719v c0719v = new C0719v(this, 2);
            C0641g c0641g = abstractActivityC0021c.f2006j;
            this.f2465t = c0641g.m1447b(strM237f, c0723z, c0719v);
            this.f2466u = c0641g.m1447b(AbstractC0075g.m237f(str2, "StartIntentSenderForResult"), new C0723z(0), new C0719v(this, 0));
            this.f2467v = c0641g.m1447b(AbstractC0075g.m237f(str2, "RequestPermissions"), new C0723z(1), new C0719v(this, 1));
        }
    }

    /* renamed from: c */
    public final void m1670c(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        if (m1646D(2)) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        if (abstractComponentCallbacksC0712o.f2653z) {
            abstractComponentCallbacksC0712o.f2653z = false;
            if (abstractComponentCallbacksC0712o.f2638k) {
                return;
            }
            this.f2448c.m131o(abstractComponentCallbacksC0712o);
            if (m1646D(2)) {
                abstractComponentCallbacksC0712o.toString();
            }
            if (m1647E(abstractComponentCallbacksC0712o)) {
                this.f2469x = true;
            }
        }
    }

    /* renamed from: d */
    public final void m1671d() {
        this.f2447b = false;
        this.f2442D.clear();
        this.f2441C.clear();
    }

    /* renamed from: e */
    public final HashSet m1672e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2448c.m140x().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0691I) it.next()).f2506c.f2615D;
            if (viewGroup != null) {
                hashSet.add(C0705h.m1733f(viewGroup, m1652C()));
            }
        }
        return hashSet;
    }

    /* renamed from: f */
    public final C0691I m1673f(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        String str = abstractComponentCallbacksC0712o.f2632e;
        C0027i c0027i = this.f2448c;
        C0691I c0691i = (C0691I) ((HashMap) c0027i.f66c).get(str);
        if (c0691i != null) {
            return c0691i;
        }
        C0691I c0691i2 = new C0691I(this.f2456k, c0027i, abstractComponentCallbacksC0712o);
        c0691i2.m1710m(this.f2459n.f2659g.getClassLoader());
        c0691i2.f2508e = this.f2458m;
        return c0691i2;
    }

    /* renamed from: g */
    public final void m1674g(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        if (m1646D(2)) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        if (abstractComponentCallbacksC0712o.f2653z) {
            return;
        }
        abstractComponentCallbacksC0712o.f2653z = true;
        if (abstractComponentCallbacksC0712o.f2638k) {
            if (m1646D(2)) {
                abstractComponentCallbacksC0712o.toString();
            }
            C0027i c0027i = this.f2448c;
            synchronized (((ArrayList) c0027i.f65b)) {
                ((ArrayList) c0027i.f65b).remove(abstractComponentCallbacksC0712o);
            }
            abstractComponentCallbacksC0712o.f2638k = false;
            if (m1647E(abstractComponentCallbacksC0712o)) {
                this.f2469x = true;
            }
            m1665T(abstractComponentCallbacksC0712o);
        }
    }

    /* renamed from: h */
    public final void m1675h() {
        for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : this.f2448c.m103E()) {
            if (abstractComponentCallbacksC0712o != null) {
                abstractComponentCallbacksC0712o.f2614C = true;
                abstractComponentCallbacksC0712o.f2647t.m1675h();
            }
        }
    }

    /* renamed from: i */
    public final boolean m1676i() {
        if (this.f2458m >= 1) {
            for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : this.f2448c.m103E()) {
                if (abstractComponentCallbacksC0712o != null) {
                    if (!abstractComponentCallbacksC0712o.f2652y ? abstractComponentCallbacksC0712o.f2647t.m1676i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m1677j() {
        if (this.f2458m < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : this.f2448c.m103E()) {
            if (abstractComponentCallbacksC0712o != null && m1648F(abstractComponentCallbacksC0712o)) {
                if (!abstractComponentCallbacksC0712o.f2652y ? abstractComponentCallbacksC0712o.f2647t.m1677j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0712o);
                    z2 = true;
                }
            }
        }
        if (this.f2450e != null) {
            for (int i2 = 0; i2 < this.f2450e.size(); i2++) {
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = (AbstractComponentCallbacksC0712o) this.f2450e.get(i2);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0712o2)) {
                    abstractComponentCallbacksC0712o2.getClass();
                }
            }
        }
        this.f2450e = arrayList;
        return z2;
    }

    /* renamed from: k */
    public final void m1678k() {
        Integer num;
        Integer num2;
        Integer num3;
        this.f2439A = true;
        m1691x(true);
        Iterator it = m1672e().iterator();
        while (it.hasNext()) {
            ((C0705h) it.next()).m1738e();
        }
        m1686s(-1);
        this.f2459n = null;
        this.f2460o = null;
        this.f2461p = null;
        if (this.f2452g != null) {
            Iterator it2 = this.f2453h.f2674b.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0637c) it2.next()).cancel();
            }
            this.f2452g = null;
        }
        C0019a c0019a = this.f2465t;
        if (c0019a != null) {
            C0641g c0641g = (C0641g) c0019a.f46b;
            ArrayList arrayList = c0641g.f1989d;
            String str = (String) c0019a.f47c;
            if (!arrayList.contains(str) && (num3 = (Integer) c0641g.f1987b.remove(str)) != null) {
                c0641g.f1986a.remove(num3);
            }
            c0641g.f1990e.remove(str);
            HashMap map = c0641g.f1991f;
            if (map.containsKey(str)) {
                Objects.toString(map.get(str));
                map.remove(str);
            }
            Bundle bundle = c0641g.f1992g;
            if (bundle.containsKey(str)) {
                Objects.toString(bundle.getParcelable(str));
                bundle.remove(str);
            }
            if (c0641g.f1988c.get(str) != null) {
                throw new ClassCastException();
            }
            C0019a c0019a2 = this.f2466u;
            C0641g c0641g2 = (C0641g) c0019a2.f46b;
            ArrayList arrayList2 = c0641g2.f1989d;
            String str2 = (String) c0019a2.f47c;
            if (!arrayList2.contains(str2) && (num2 = (Integer) c0641g2.f1987b.remove(str2)) != null) {
                c0641g2.f1986a.remove(num2);
            }
            c0641g2.f1990e.remove(str2);
            HashMap map2 = c0641g2.f1991f;
            if (map2.containsKey(str2)) {
                Objects.toString(map2.get(str2));
                map2.remove(str2);
            }
            Bundle bundle2 = c0641g2.f1992g;
            if (bundle2.containsKey(str2)) {
                Objects.toString(bundle2.getParcelable(str2));
                bundle2.remove(str2);
            }
            if (c0641g2.f1988c.get(str2) != null) {
                throw new ClassCastException();
            }
            C0019a c0019a3 = this.f2467v;
            C0641g c0641g3 = (C0641g) c0019a3.f46b;
            ArrayList arrayList3 = c0641g3.f1989d;
            String str3 = (String) c0019a3.f47c;
            if (!arrayList3.contains(str3) && (num = (Integer) c0641g3.f1987b.remove(str3)) != null) {
                c0641g3.f1986a.remove(num);
            }
            c0641g3.f1990e.remove(str3);
            HashMap map3 = c0641g3.f1991f;
            if (map3.containsKey(str3)) {
                Objects.toString(map3.get(str3));
                map3.remove(str3);
            }
            Bundle bundle3 = c0641g3.f1992g;
            if (bundle3.containsKey(str3)) {
                Objects.toString(bundle3.getParcelable(str3));
                bundle3.remove(str3);
            }
            if (c0641g3.f1988c.get(str3) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* renamed from: l */
    public final void m1679l() {
        for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : this.f2448c.m103E()) {
            if (abstractComponentCallbacksC0712o != null) {
                abstractComponentCallbacksC0712o.f2614C = true;
                abstractComponentCallbacksC0712o.f2647t.m1679l();
            }
        }
    }

    /* renamed from: m */
    public final void m1680m() {
        for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : this.f2448c.m103E()) {
            if (abstractComponentCallbacksC0712o != null) {
                abstractComponentCallbacksC0712o.f2647t.m1680m();
            }
        }
    }

    /* renamed from: n */
    public final boolean m1681n() {
        if (this.f2458m >= 1) {
            for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : this.f2448c.m103E()) {
                if (abstractComponentCallbacksC0712o != null) {
                    if (!abstractComponentCallbacksC0712o.f2652y ? abstractComponentCallbacksC0712o.f2647t.m1681n() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public final void m1682o() {
        if (this.f2458m < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : this.f2448c.m103E()) {
            if (abstractComponentCallbacksC0712o != null && !abstractComponentCallbacksC0712o.f2652y) {
                abstractComponentCallbacksC0712o.f2647t.m1682o();
            }
        }
    }

    /* renamed from: p */
    public final void m1683p(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        if (abstractComponentCallbacksC0712o != null) {
            if (abstractComponentCallbacksC0712o.equals(this.f2448c.m138v(abstractComponentCallbacksC0712o.f2632e))) {
                abstractComponentCallbacksC0712o.f2645r.getClass();
                boolean zM1649G = m1649G(abstractComponentCallbacksC0712o);
                Boolean bool = abstractComponentCallbacksC0712o.f2637j;
                if (bool == null || bool.booleanValue() != zM1649G) {
                    abstractComponentCallbacksC0712o.f2637j = Boolean.valueOf(zM1649G);
                    C0686D c0686d = abstractComponentCallbacksC0712o.f2647t;
                    c0686d.m1667V();
                    c0686d.m1683p(c0686d.f2462q);
                }
            }
        }
    }

    /* renamed from: q */
    public final void m1684q() {
        for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : this.f2448c.m103E()) {
            if (abstractComponentCallbacksC0712o != null) {
                abstractComponentCallbacksC0712o.f2647t.m1684q();
            }
        }
    }

    /* renamed from: r */
    public final boolean m1685r() {
        if (this.f2458m < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : this.f2448c.m103E()) {
            if (abstractComponentCallbacksC0712o != null && m1648F(abstractComponentCallbacksC0712o)) {
                if (!abstractComponentCallbacksC0712o.f2652y ? abstractComponentCallbacksC0712o.f2647t.m1685r() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* renamed from: s */
    public final void m1686s(int i2) {
        try {
            this.f2447b = true;
            for (C0691I c0691i : ((HashMap) this.f2448c.f66c).values()) {
                if (c0691i != null) {
                    c0691i.f2508e = i2;
                }
            }
            m1653H(i2, false);
            Iterator it = m1672e().iterator();
            while (it.hasNext()) {
                ((C0705h) it.next()).m1738e();
            }
            this.f2447b = false;
            m1691x(true);
        } catch (Throwable th) {
            this.f2447b = false;
            throw th;
        }
    }

    /* renamed from: t */
    public final void m1687t() {
        if (this.f2440B) {
            this.f2440B = false;
            m1666U();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            sb.append(abstractComponentCallbacksC0712o.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2461p)));
            sb.append("}");
        } else {
            C0715r c0715r = this.f2459n;
            if (c0715r != null) {
                sb.append(c0715r.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f2459n)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1688u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strM237f = AbstractC0075g.m237f(str, "    ");
        C0027i c0027i = this.f2448c;
        c0027i.getClass();
        String str3 = str + "    ";
        HashMap map = (HashMap) c0027i.f66c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0691I c0691i : map.values()) {
                printWriter.print(str);
                if (c0691i != null) {
                    AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0691i.f2506c;
                    printWriter.println(abstractComponentCallbacksC0712o);
                    abstractComponentCallbacksC0712o.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0712o.f2649v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0712o.f2650w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0712o.f2651x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0712o.f2628a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0712o.f2632e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0712o.f2644q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0712o.f2638k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0712o.f2639l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0712o.f2640m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0712o.f2641n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0712o.f2652y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0712o.f2653z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0712o.f2613B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0712o.f2612A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0712o.f2618G);
                    if (abstractComponentCallbacksC0712o.f2645r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0712o.f2645r);
                    }
                    if (abstractComponentCallbacksC0712o.f2646s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0712o.f2646s);
                    }
                    if (abstractComponentCallbacksC0712o.f2648u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0712o.f2648u);
                    }
                    if (abstractComponentCallbacksC0712o.f2633f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0712o.f2633f);
                    }
                    if (abstractComponentCallbacksC0712o.f2629b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0712o.f2629b);
                    }
                    if (abstractComponentCallbacksC0712o.f2630c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0712o.f2630c);
                    }
                    if (abstractComponentCallbacksC0712o.f2631d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0712o.f2631d);
                    }
                    Object objM138v = abstractComponentCallbacksC0712o.f2634g;
                    if (objM138v == null) {
                        C0686D c0686d = abstractComponentCallbacksC0712o.f2645r;
                        objM138v = (c0686d == null || (str2 = abstractComponentCallbacksC0712o.f2635h) == null) ? null : c0686d.f2448c.m138v(str2);
                    }
                    if (objM138v != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(objM138v);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0712o.f2636i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0711n c0711n = abstractComponentCallbacksC0712o.f2619H;
                    printWriter.println(c0711n == null ? false : c0711n.f2600a);
                    C0711n c0711n2 = abstractComponentCallbacksC0712o.f2619H;
                    if ((c0711n2 == null ? 0 : c0711n2.f2601b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0711n c0711n3 = abstractComponentCallbacksC0712o.f2619H;
                        printWriter.println(c0711n3 == null ? 0 : c0711n3.f2601b);
                    }
                    C0711n c0711n4 = abstractComponentCallbacksC0712o.f2619H;
                    if ((c0711n4 == null ? 0 : c0711n4.f2602c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0711n c0711n5 = abstractComponentCallbacksC0712o.f2619H;
                        printWriter.println(c0711n5 == null ? 0 : c0711n5.f2602c);
                    }
                    C0711n c0711n6 = abstractComponentCallbacksC0712o.f2619H;
                    if ((c0711n6 == null ? 0 : c0711n6.f2603d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0711n c0711n7 = abstractComponentCallbacksC0712o.f2619H;
                        printWriter.println(c0711n7 == null ? 0 : c0711n7.f2603d);
                    }
                    C0711n c0711n8 = abstractComponentCallbacksC0712o.f2619H;
                    if ((c0711n8 == null ? 0 : c0711n8.f2604e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0711n c0711n9 = abstractComponentCallbacksC0712o.f2619H;
                        printWriter.println(c0711n9 == null ? 0 : c0711n9.f2604e);
                    }
                    if (abstractComponentCallbacksC0712o.f2615D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0712o.f2615D);
                    }
                    if (abstractComponentCallbacksC0712o.f2616E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0712o.f2616E);
                    }
                    if (abstractComponentCallbacksC0712o.m1754h() != null) {
                        new C0019a(abstractComponentCallbacksC0712o, abstractComponentCallbacksC0712o.mo1452c()).m82u(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0712o.f2647t + ":");
                    abstractComponentCallbacksC0712o.f2647t.m1688u(AbstractC0075g.m237f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0027i.f65b;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = (AbstractComponentCallbacksC0712o) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0712o2.toString());
            }
        }
        ArrayList arrayList2 = this.f2450e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o3 = (AbstractComponentCallbacksC0712o) this.f2450e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0712o3.toString());
            }
        }
        ArrayList arrayList3 = this.f2449d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0698a c0698a = (C0698a) this.f2449d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0698a.toString());
                c0698a.m1724d(strM237f, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2454i.get());
        synchronized (this.f2446a) {
            try {
                int size4 = this.f2446a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (InterfaceC0684B) this.f2446a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2459n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2460o);
        if (this.f2461p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2461p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2458m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2470y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2471z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2439A);
        if (this.f2469x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2469x);
        }
    }

    /* renamed from: v */
    public final void m1689v(InterfaceC0684B interfaceC0684B, boolean z2) {
        if (!z2) {
            if (this.f2459n == null) {
                if (!this.f2439A) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f2470y || this.f2471z) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2446a) {
            try {
                if (this.f2459n == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2446a.add(interfaceC0684B);
                    m1661P();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: w */
    public final void m1690w(boolean z2) {
        if (this.f2447b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2459n == null) {
            if (!this.f2439A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2459n.f2660h.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f2470y || this.f2471z)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2441C == null) {
            this.f2441C = new ArrayList();
            this.f2442D = new ArrayList();
        }
        this.f2447b = false;
    }

    /* renamed from: x */
    public final boolean m1691x(boolean z2) {
        boolean zMo1645a;
        m1690w(z2);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f2441C;
            ArrayList arrayList2 = this.f2442D;
            synchronized (this.f2446a) {
                try {
                    if (this.f2446a.isEmpty()) {
                        zMo1645a = false;
                    } else {
                        int size = this.f2446a.size();
                        zMo1645a = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            zMo1645a |= ((InterfaceC0684B) this.f2446a.get(i2)).mo1645a(arrayList, arrayList2);
                        }
                        this.f2446a.clear();
                        this.f2459n.f2660h.removeCallbacks(this.f2445G);
                    }
                } finally {
                }
            }
            if (!zMo1645a) {
                m1667V();
                m1687t();
                ((HashMap) this.f2448c.f66c).values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.f2447b = true;
            try {
                m1658M(this.f2441C, this.f2442D);
            } finally {
                m1671d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1692y(java.util.ArrayList r25, java.util.ArrayList r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0686D.m1692y(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: z */
    public final AbstractComponentCallbacksC0712o m1693z(int i2) {
        C0027i c0027i = this.f2448c;
        ArrayList arrayList = (ArrayList) c0027i.f65b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = (AbstractComponentCallbacksC0712o) arrayList.get(size);
            if (abstractComponentCallbacksC0712o != null && abstractComponentCallbacksC0712o.f2649v == i2) {
                return abstractComponentCallbacksC0712o;
            }
        }
        for (C0691I c0691i : ((HashMap) c0027i.f66c).values()) {
            if (c0691i != null) {
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = c0691i.f2506c;
                if (abstractComponentCallbacksC0712o2.f2649v == i2) {
                    return abstractComponentCallbacksC0712o2;
                }
            }
        }
        return null;
    }
}
