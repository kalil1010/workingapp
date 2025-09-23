package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0646l;
import androidx.lifecycle.C0734K;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.EnumC0747l;
import androidx.lifecycle.EnumC0748m;
import androidx.lifecycle.InterfaceC0751p;
import androidx.lifecycle.InterfaceC0753r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import p002A1.C0019a;
import p002A1.C0027i;
import p006C.AbstractC0075g;
import p028K.AbstractC0228C;
import p028K.AbstractC0241P;
import p064W0.ViewOnAttachStateChangeListenerC0567m;
import p079b0.C0762a;
import p119o.C1250l;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: androidx.fragment.app.I */
/* loaded from: classes.dex */
public final class C0691I {

    /* renamed from: a */
    public final C0019a f2504a;

    /* renamed from: b */
    public final C0027i f2505b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0712o f2506c;

    /* renamed from: d */
    public boolean f2507d = false;

    /* renamed from: e */
    public int f2508e = -1;

    public C0691I(C0019a c0019a, C0027i c0027i, AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        this.f2504a = c0019a;
        this.f2505b = c0027i;
        this.f2506c = abstractComponentCallbacksC0712o;
    }

    /* renamed from: a */
    public final void m1698a() {
        boolean zM1646D = C0686D.m1646D(3);
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (zM1646D) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        Bundle bundle = abstractComponentCallbacksC0712o.f2629b;
        abstractComponentCallbacksC0712o.f2647t.m1654I();
        abstractComponentCallbacksC0712o.f2628a = 3;
        abstractComponentCallbacksC0712o.f2614C = true;
        if (C0686D.m1646D(3)) {
            abstractComponentCallbacksC0712o.toString();
        }
        View view = abstractComponentCallbacksC0712o.f2616E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0712o.f2629b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0712o.f2630c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0712o.f2630c = null;
            }
            if (abstractComponentCallbacksC0712o.f2616E != null) {
                abstractComponentCallbacksC0712o.f2624M.f2519c.m1458c(abstractComponentCallbacksC0712o.f2631d);
                abstractComponentCallbacksC0712o.f2631d = null;
            }
            abstractComponentCallbacksC0712o.f2614C = false;
            abstractComponentCallbacksC0712o.mo1749t(bundle2);
            if (!abstractComponentCallbacksC0712o.f2614C) {
                throw new C0697O("Fragment " + abstractComponentCallbacksC0712o + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0712o.f2616E != null) {
                abstractComponentCallbacksC0712o.f2624M.m1715d(EnumC0747l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0712o.f2629b = null;
        C0686D c0686d = abstractComponentCallbacksC0712o.f2647t;
        c0686d.f2470y = false;
        c0686d.f2471z = false;
        c0686d.f2444F.f2485h = false;
        c0686d.m1686s(4);
        this.f2504a.m68e(false);
    }

    /* renamed from: b */
    public final void m1699b() {
        View view;
        View view2;
        C0027i c0027i = this.f2505b;
        c0027i.getClass();
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        ViewGroup viewGroup = abstractComponentCallbacksC0712o.f2615D;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c0027i.f65b;
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0712o);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = (AbstractComponentCallbacksC0712o) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC0712o2.f2615D == viewGroup && (view = abstractComponentCallbacksC0712o2.f2616E) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o3 = (AbstractComponentCallbacksC0712o) arrayList.get(i2);
                    if (abstractComponentCallbacksC0712o3.f2615D == viewGroup && (view2 = abstractComponentCallbacksC0712o3.f2616E) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0712o.f2615D.addView(abstractComponentCallbacksC0712o.f2616E, iIndexOfChild);
    }

    /* renamed from: c */
    public final void m1700c() {
        boolean zM1646D = C0686D.m1646D(3);
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (zM1646D) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = abstractComponentCallbacksC0712o.f2634g;
        C0027i c0027i = this.f2505b;
        C0691I c0691i = null;
        if (abstractComponentCallbacksC0712o2 != null) {
            C0691I c0691i2 = (C0691I) ((HashMap) c0027i.f66c).get(abstractComponentCallbacksC0712o2.f2632e);
            if (c0691i2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0712o + " declared target fragment " + abstractComponentCallbacksC0712o.f2634g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0712o.f2635h = abstractComponentCallbacksC0712o.f2634g.f2632e;
            abstractComponentCallbacksC0712o.f2634g = null;
            c0691i = c0691i2;
        } else {
            String str = abstractComponentCallbacksC0712o.f2635h;
            if (str != null && (c0691i = (C0691I) ((HashMap) c0027i.f66c).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0712o + " declared target fragment " + abstractComponentCallbacksC0712o.f2635h + " that does not belong to this FragmentManager!");
            }
        }
        if (c0691i != null) {
            c0691i.m1708k();
        }
        C0686D c0686d = abstractComponentCallbacksC0712o.f2645r;
        abstractComponentCallbacksC0712o.f2646s = c0686d.f2459n;
        abstractComponentCallbacksC0712o.f2648u = c0686d.f2461p;
        C0019a c0019a = this.f2504a;
        c0019a.m74k(false);
        ArrayList arrayList = abstractComponentCallbacksC0712o.f2627P;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
        arrayList.clear();
        abstractComponentCallbacksC0712o.f2647t.m1669b(abstractComponentCallbacksC0712o.f2646s, abstractComponentCallbacksC0712o.mo1740d(), abstractComponentCallbacksC0712o);
        abstractComponentCallbacksC0712o.f2628a = 0;
        abstractComponentCallbacksC0712o.f2614C = false;
        abstractComponentCallbacksC0712o.mo1741k(abstractComponentCallbacksC0712o.f2646s.f2659g);
        if (!abstractComponentCallbacksC0712o.f2614C) {
            throw new C0697O("Fragment " + abstractComponentCallbacksC0712o + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0712o.f2645r.f2457l.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0689G) it2.next()).mo1697f();
        }
        C0686D c0686d2 = abstractComponentCallbacksC0712o.f2647t;
        c0686d2.f2470y = false;
        c0686d2.f2471z = false;
        c0686d2.f2444F.f2485h = false;
        c0686d2.m1686s(0);
        c0019a.m69f(false);
    }

    /* renamed from: d */
    public final int m1701d() {
        C0696N c0696n;
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (abstractComponentCallbacksC0712o.f2645r == null) {
            return abstractComponentCallbacksC0712o.f2628a;
        }
        int iMin = this.f2508e;
        int iOrdinal = abstractComponentCallbacksC0712o.f2622K.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0712o.f2640m) {
            if (abstractComponentCallbacksC0712o.f2641n) {
                iMin = Math.max(this.f2508e, 2);
                View view = abstractComponentCallbacksC0712o.f2616E;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f2508e < 4 ? Math.min(iMin, abstractComponentCallbacksC0712o.f2628a) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0712o.f2638k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0712o.f2615D;
        if (viewGroup != null) {
            C0705h c0705hM1733f = C0705h.m1733f(viewGroup, abstractComponentCallbacksC0712o.m1756j().m1652C());
            c0705hM1733f.getClass();
            C0696N c0696nM1737d = c0705hM1733f.m1737d(abstractComponentCallbacksC0712o);
            i = c0696nM1737d != null ? c0696nM1737d.f2525b : 0;
            Iterator it = c0705hM1733f.f2579c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0696n = null;
                    break;
                }
                c0696n = (C0696N) it.next();
                if (c0696n.f2526c.equals(abstractComponentCallbacksC0712o) && !c0696n.f2529f) {
                    break;
                }
            }
            if (c0696n != null && (i == 0 || i == 1)) {
                i = c0696n.f2525b;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0712o.f2639l) {
            iMin = abstractComponentCallbacksC0712o.f2644q > 0 ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0712o.f2617F && abstractComponentCallbacksC0712o.f2628a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (C0686D.m1646D(2)) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        return iMin;
    }

    /* renamed from: e */
    public final void m1702e() {
        Parcelable parcelable;
        boolean zM1646D = C0686D.m1646D(3);
        final AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (zM1646D) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        if (abstractComponentCallbacksC0712o.f2621J) {
            Bundle bundle = abstractComponentCallbacksC0712o.f2629b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0712o.f2647t.m1659N(parcelable);
                C0686D c0686d = abstractComponentCallbacksC0712o.f2647t;
                c0686d.f2470y = false;
                c0686d.f2471z = false;
                c0686d.f2444F.f2485h = false;
                c0686d.m1686s(1);
            }
            abstractComponentCallbacksC0712o.f2628a = 1;
            return;
        }
        C0019a c0019a = this.f2504a;
        c0019a.m75n(false);
        Bundle bundle2 = abstractComponentCallbacksC0712o.f2629b;
        abstractComponentCallbacksC0712o.f2647t.m1654I();
        abstractComponentCallbacksC0712o.f2628a = 1;
        abstractComponentCallbacksC0712o.f2614C = false;
        abstractComponentCallbacksC0712o.f2623L.m1779a(new InterfaceC0751p() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.InterfaceC0751p
            /* renamed from: b */
            public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
                View view;
                if (enumC0747l != EnumC0747l.ON_STOP || (view = abstractComponentCallbacksC0712o.f2616E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0712o.f2626O.m1458c(bundle2);
        abstractComponentCallbacksC0712o.mo1742l(bundle2);
        abstractComponentCallbacksC0712o.f2621J = true;
        if (abstractComponentCallbacksC0712o.f2614C) {
            abstractComponentCallbacksC0712o.f2623L.m1782d(EnumC0747l.ON_CREATE);
            c0019a.m70g(false);
        } else {
            throw new C0697O("Fragment " + abstractComponentCallbacksC0712o + " did not call through to super.onCreate()");
        }
    }

    /* renamed from: f */
    public final void m1703f() throws Resources.NotFoundException {
        String resourceName;
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (abstractComponentCallbacksC0712o.f2640m) {
            return;
        }
        if (C0686D.m1646D(3)) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        LayoutInflater layoutInflaterMo1745p = abstractComponentCallbacksC0712o.mo1745p(abstractComponentCallbacksC0712o.f2629b);
        ViewGroup viewGroup = abstractComponentCallbacksC0712o.f2615D;
        if (viewGroup == null) {
            int i2 = abstractComponentCallbacksC0712o.f2650w;
            if (i2 == 0) {
                viewGroup = null;
            } else {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0712o + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0712o.f2645r.f2460o.mo1021V(i2);
                if (viewGroup == null && !abstractComponentCallbacksC0712o.f2642o) {
                    try {
                        resourceName = abstractComponentCallbacksC0712o.m1758v().getResources().getResourceName(abstractComponentCallbacksC0712o.f2650w);
                    } catch (Resources.NotFoundException unused) {
                        resourceName = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0712o.f2650w) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0712o);
                }
            }
        }
        abstractComponentCallbacksC0712o.f2615D = viewGroup;
        abstractComponentCallbacksC0712o.mo1750u(layoutInflaterMo1745p, viewGroup, abstractComponentCallbacksC0712o.f2629b);
        View view = abstractComponentCallbacksC0712o.f2616E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0712o.f2616E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0712o);
            if (viewGroup != null) {
                m1699b();
            }
            if (abstractComponentCallbacksC0712o.f2652y) {
                abstractComponentCallbacksC0712o.f2616E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0712o.f2616E;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            if (view2.isAttachedToWindow()) {
                AbstractC0228C.m617c(abstractComponentCallbacksC0712o.f2616E);
            } else {
                View view3 = abstractComponentCallbacksC0712o.f2616E;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0567m(1, view3));
            }
            abstractComponentCallbacksC0712o.f2647t.m1686s(2);
            this.f2504a.m80s(false);
            int visibility = abstractComponentCallbacksC0712o.f2616E.getVisibility();
            abstractComponentCallbacksC0712o.m1752f().f2609j = abstractComponentCallbacksC0712o.f2616E.getAlpha();
            if (abstractComponentCallbacksC0712o.f2615D != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0712o.f2616E.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0712o.m1752f().f2610k = viewFindFocus;
                    if (C0686D.m1646D(2)) {
                        viewFindFocus.toString();
                        Objects.toString(abstractComponentCallbacksC0712o);
                    }
                }
                abstractComponentCallbacksC0712o.f2616E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0712o.f2628a = 2;
    }

    /* renamed from: g */
    public final void m1704g() {
        boolean z2;
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712oM138v;
        boolean zM1646D = C0686D.m1646D(3);
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (zM1646D) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        boolean z3 = abstractComponentCallbacksC0712o.f2639l && abstractComponentCallbacksC0712o.f2644q <= 0;
        C0027i c0027i = this.f2505b;
        if (!z3) {
            C0688F c0688f = (C0688F) c0027i.f67d;
            if (!((c0688f.f2480c.containsKey(abstractComponentCallbacksC0712o.f2632e) && c0688f.f2483f) ? c0688f.f2484g : true)) {
                String str = abstractComponentCallbacksC0712o.f2635h;
                if (str != null && (abstractComponentCallbacksC0712oM138v = c0027i.m138v(str)) != null && abstractComponentCallbacksC0712oM138v.f2612A) {
                    abstractComponentCallbacksC0712o.f2634g = abstractComponentCallbacksC0712oM138v;
                }
                abstractComponentCallbacksC0712o.f2628a = 0;
                return;
            }
        }
        C0715r c0715r = abstractComponentCallbacksC0712o.f2646s;
        if (c0715r != null) {
            z2 = ((C0688F) c0027i.f67d).f2484g;
        } else {
            z2 = c0715r.f2659g != null ? !r6.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            C0688F c0688f2 = (C0688F) c0027i.f67d;
            c0688f2.getClass();
            if (C0686D.m1646D(3)) {
                Objects.toString(abstractComponentCallbacksC0712o);
            }
            HashMap map = c0688f2.f2481d;
            C0688F c0688f3 = (C0688F) map.get(abstractComponentCallbacksC0712o.f2632e);
            if (c0688f3 != null) {
                c0688f3.mo1694a();
                map.remove(abstractComponentCallbacksC0712o.f2632e);
            }
            HashMap map2 = c0688f2.f2482e;
            C0734K c0734k = (C0734K) map2.get(abstractComponentCallbacksC0712o.f2632e);
            if (c0734k != null) {
                c0734k.m1771a();
                map2.remove(abstractComponentCallbacksC0712o.f2632e);
            }
        }
        abstractComponentCallbacksC0712o.f2647t.m1678k();
        abstractComponentCallbacksC0712o.f2623L.m1782d(EnumC0747l.ON_DESTROY);
        abstractComponentCallbacksC0712o.f2628a = 0;
        abstractComponentCallbacksC0712o.f2621J = false;
        abstractComponentCallbacksC0712o.f2614C = true;
        this.f2504a.m71h(false);
        Iterator it = c0027i.m140x().iterator();
        while (it.hasNext()) {
            C0691I c0691i = (C0691I) it.next();
            if (c0691i != null) {
                String str2 = abstractComponentCallbacksC0712o.f2632e;
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = c0691i.f2506c;
                if (str2.equals(abstractComponentCallbacksC0712o2.f2635h)) {
                    abstractComponentCallbacksC0712o2.f2634g = abstractComponentCallbacksC0712o;
                    abstractComponentCallbacksC0712o2.f2635h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0712o.f2635h;
        if (str3 != null) {
            abstractComponentCallbacksC0712o.f2634g = c0027i.m138v(str3);
        }
        c0027i.m109K(this);
    }

    /* renamed from: h */
    public final void m1705h() {
        View view;
        boolean zM1646D = C0686D.m1646D(3);
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (zM1646D) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0712o.f2615D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0712o.f2616E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0712o.f2647t.m1686s(1);
        if (abstractComponentCallbacksC0712o.f2616E != null) {
            C0693K c0693k = abstractComponentCallbacksC0712o.f2624M;
            c0693k.m1716f();
            if (c0693k.f2518b.f2732c.compareTo(EnumC0748m.f2723c) >= 0) {
                abstractComponentCallbacksC0712o.f2624M.m1715d(EnumC0747l.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0712o.f2628a = 1;
        abstractComponentCallbacksC0712o.f2614C = false;
        abstractComponentCallbacksC0712o.mo1743n();
        if (!abstractComponentCallbacksC0712o.f2614C) {
            throw new C0697O("Fragment " + abstractComponentCallbacksC0712o + " did not call through to super.onDestroyView()");
        }
        C1250l c1250l = ((C0762a) new C0019a(abstractComponentCallbacksC0712o, abstractComponentCallbacksC0712o.mo1452c()).f46b).f2873c;
        if (c1250l.f5062c > 0) {
            c1250l.f5061b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0712o.f2643p = false;
        this.f2504a.m81t(false);
        abstractComponentCallbacksC0712o.f2615D = null;
        abstractComponentCallbacksC0712o.f2616E = null;
        abstractComponentCallbacksC0712o.f2624M = null;
        abstractComponentCallbacksC0712o.f2625N.m1794e(null);
        abstractComponentCallbacksC0712o.f2641n = false;
    }

    /* renamed from: i */
    public final void m1706i() {
        boolean zM1646D = C0686D.m1646D(3);
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (zM1646D) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        abstractComponentCallbacksC0712o.f2628a = -1;
        abstractComponentCallbacksC0712o.f2614C = false;
        abstractComponentCallbacksC0712o.mo1744o();
        if (!abstractComponentCallbacksC0712o.f2614C) {
            throw new C0697O("Fragment " + abstractComponentCallbacksC0712o + " did not call through to super.onDetach()");
        }
        C0686D c0686d = abstractComponentCallbacksC0712o.f2647t;
        if (!c0686d.f2439A) {
            c0686d.m1678k();
            abstractComponentCallbacksC0712o.f2647t = new C0686D();
        }
        this.f2504a.m72i(false);
        abstractComponentCallbacksC0712o.f2628a = -1;
        abstractComponentCallbacksC0712o.f2646s = null;
        abstractComponentCallbacksC0712o.f2648u = null;
        abstractComponentCallbacksC0712o.f2645r = null;
        if (!abstractComponentCallbacksC0712o.f2639l || abstractComponentCallbacksC0712o.f2644q > 0) {
            C0688F c0688f = (C0688F) this.f2505b.f67d;
            if (!((c0688f.f2480c.containsKey(abstractComponentCallbacksC0712o.f2632e) && c0688f.f2483f) ? c0688f.f2484g : true)) {
                return;
            }
        }
        if (C0686D.m1646D(3)) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        abstractComponentCallbacksC0712o.f2623L = new C0755t(abstractComponentCallbacksC0712o);
        abstractComponentCallbacksC0712o.f2626O = new C0646l(abstractComponentCallbacksC0712o);
        abstractComponentCallbacksC0712o.f2632e = UUID.randomUUID().toString();
        abstractComponentCallbacksC0712o.f2638k = false;
        abstractComponentCallbacksC0712o.f2639l = false;
        abstractComponentCallbacksC0712o.f2640m = false;
        abstractComponentCallbacksC0712o.f2641n = false;
        abstractComponentCallbacksC0712o.f2642o = false;
        abstractComponentCallbacksC0712o.f2644q = 0;
        abstractComponentCallbacksC0712o.f2645r = null;
        abstractComponentCallbacksC0712o.f2647t = new C0686D();
        abstractComponentCallbacksC0712o.f2646s = null;
        abstractComponentCallbacksC0712o.f2649v = 0;
        abstractComponentCallbacksC0712o.f2650w = 0;
        abstractComponentCallbacksC0712o.f2651x = null;
        abstractComponentCallbacksC0712o.f2652y = false;
        abstractComponentCallbacksC0712o.f2653z = false;
    }

    /* renamed from: j */
    public final void m1707j() {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (abstractComponentCallbacksC0712o.f2640m && abstractComponentCallbacksC0712o.f2641n && !abstractComponentCallbacksC0712o.f2643p) {
            if (C0686D.m1646D(3)) {
                Objects.toString(abstractComponentCallbacksC0712o);
            }
            abstractComponentCallbacksC0712o.mo1750u(abstractComponentCallbacksC0712o.mo1745p(abstractComponentCallbacksC0712o.f2629b), null, abstractComponentCallbacksC0712o.f2629b);
            View view = abstractComponentCallbacksC0712o.f2616E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0712o.f2616E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0712o);
                if (abstractComponentCallbacksC0712o.f2652y) {
                    abstractComponentCallbacksC0712o.f2616E.setVisibility(8);
                }
                abstractComponentCallbacksC0712o.f2647t.m1686s(2);
                this.f2504a.m80s(false);
                abstractComponentCallbacksC0712o.f2628a = 2;
            }
        }
    }

    /* renamed from: k */
    public final void m1708k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z2 = this.f2507d;
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (z2) {
            if (C0686D.m1646D(2)) {
                Objects.toString(abstractComponentCallbacksC0712o);
                return;
            }
            return;
        }
        try {
            this.f2507d = true;
            while (true) {
                int iM1701d = m1701d();
                int i2 = abstractComponentCallbacksC0712o.f2628a;
                if (iM1701d == i2) {
                    if (abstractComponentCallbacksC0712o.f2620I) {
                        if (abstractComponentCallbacksC0712o.f2616E != null && (viewGroup = abstractComponentCallbacksC0712o.f2615D) != null) {
                            C0705h c0705hM1733f = C0705h.m1733f(viewGroup, abstractComponentCallbacksC0712o.m1756j().m1652C());
                            if (abstractComponentCallbacksC0712o.f2652y) {
                                c0705hM1733f.getClass();
                                if (C0686D.m1646D(2)) {
                                    Objects.toString(abstractComponentCallbacksC0712o);
                                }
                                c0705hM1733f.m1734a(3, 1, this);
                            } else {
                                c0705hM1733f.getClass();
                                if (C0686D.m1646D(2)) {
                                    Objects.toString(abstractComponentCallbacksC0712o);
                                }
                                c0705hM1733f.m1734a(2, 1, this);
                            }
                        }
                        C0686D c0686d = abstractComponentCallbacksC0712o.f2645r;
                        if (c0686d != null && abstractComponentCallbacksC0712o.f2638k && C0686D.m1647E(abstractComponentCallbacksC0712o)) {
                            c0686d.f2469x = true;
                        }
                        abstractComponentCallbacksC0712o.f2620I = false;
                    }
                    this.f2507d = false;
                    return;
                }
                if (iM1701d <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            m1706i();
                            break;
                        case 0:
                            m1704g();
                            break;
                        case 1:
                            m1705h();
                            abstractComponentCallbacksC0712o.f2628a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0712o.f2641n = false;
                            abstractComponentCallbacksC0712o.f2628a = 2;
                            break;
                        case 3:
                            if (C0686D.m1646D(3)) {
                                Objects.toString(abstractComponentCallbacksC0712o);
                            }
                            if (abstractComponentCallbacksC0712o.f2616E != null && abstractComponentCallbacksC0712o.f2630c == null) {
                                m1712o();
                            }
                            if (abstractComponentCallbacksC0712o.f2616E != null && (viewGroup3 = abstractComponentCallbacksC0712o.f2615D) != null) {
                                C0705h c0705hM1733f2 = C0705h.m1733f(viewGroup3, abstractComponentCallbacksC0712o.m1756j().m1652C());
                                c0705hM1733f2.getClass();
                                if (C0686D.m1646D(2)) {
                                    Objects.toString(abstractComponentCallbacksC0712o);
                                }
                                c0705hM1733f2.m1734a(1, 3, this);
                            }
                            abstractComponentCallbacksC0712o.f2628a = 3;
                            break;
                        case 4:
                            m1714q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0712o.f2628a = 5;
                            break;
                        case 6:
                            m1709l();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            m1700c();
                            break;
                        case 1:
                            m1702e();
                            break;
                        case 2:
                            m1707j();
                            m1703f();
                            break;
                        case 3:
                            m1698a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0712o.f2616E != null && (viewGroup2 = abstractComponentCallbacksC0712o.f2615D) != null) {
                                C0705h c0705hM1733f3 = C0705h.m1733f(viewGroup2, abstractComponentCallbacksC0712o.m1756j().m1652C());
                                int iM233b = AbstractC0075g.m233b(abstractComponentCallbacksC0712o.f2616E.getVisibility());
                                c0705hM1733f3.getClass();
                                if (C0686D.m1646D(2)) {
                                    Objects.toString(abstractComponentCallbacksC0712o);
                                }
                                c0705hM1733f3.m1734a(iM233b, 2, this);
                            }
                            abstractComponentCallbacksC0712o.f2628a = 4;
                            break;
                        case 5:
                            m1713p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0712o.f2628a = 6;
                            break;
                        case 7:
                            m1711n();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f2507d = false;
            throw th;
        }
    }

    /* renamed from: l */
    public final void m1709l() {
        boolean zM1646D = C0686D.m1646D(3);
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (zM1646D) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        abstractComponentCallbacksC0712o.f2647t.m1686s(5);
        if (abstractComponentCallbacksC0712o.f2616E != null) {
            abstractComponentCallbacksC0712o.f2624M.m1715d(EnumC0747l.ON_PAUSE);
        }
        abstractComponentCallbacksC0712o.f2623L.m1782d(EnumC0747l.ON_PAUSE);
        abstractComponentCallbacksC0712o.f2628a = 6;
        abstractComponentCallbacksC0712o.f2614C = true;
        this.f2504a.m73j(false);
    }

    /* renamed from: m */
    public final void m1710m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        Bundle bundle = abstractComponentCallbacksC0712o.f2629b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0712o.f2630c = abstractComponentCallbacksC0712o.f2629b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0712o.f2631d = abstractComponentCallbacksC0712o.f2629b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0712o.f2629b.getString("android:target_state");
        abstractComponentCallbacksC0712o.f2635h = string;
        if (string != null) {
            abstractComponentCallbacksC0712o.f2636i = abstractComponentCallbacksC0712o.f2629b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0712o.f2629b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0712o.f2618G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0712o.f2617F = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1711n() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.C0686D.m1646D(r0)
            androidx.fragment.app.o r1 = r6.f2506c
            if (r0 == 0) goto Lc
            java.util.Objects.toString(r1)
        Lc:
            androidx.fragment.app.n r0 = r1.f2619H
            r2 = 0
            if (r0 != 0) goto L13
            r0 = r2
            goto L15
        L13:
            android.view.View r0 = r0.f2610k
        L15:
            if (r0 == 0) goto L45
            android.view.View r3 = r1.f2616E
            if (r0 != r3) goto L1c
            goto L26
        L1c:
            android.view.ViewParent r3 = r0.getParent()
        L20:
            if (r3 == 0) goto L45
            android.view.View r4 = r1.f2616E
            if (r3 != r4) goto L40
        L26:
            r0.requestFocus()
            r3 = 2
            boolean r3 = androidx.fragment.app.C0686D.m1646D(r3)
            if (r3 == 0) goto L45
            r0.toString()
            java.util.Objects.toString(r1)
            android.view.View r0 = r1.f2616E
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
            goto L45
        L40:
            android.view.ViewParent r3 = r3.getParent()
            goto L20
        L45:
            androidx.fragment.app.n r0 = r1.m1752f()
            r0.f2610k = r2
            androidx.fragment.app.D r0 = r1.f2647t
            r0.m1654I()
            androidx.fragment.app.D r0 = r1.f2647t
            r3 = 1
            r0.m1691x(r3)
            r0 = 7
            r1.f2628a = r0
            r1.f2614C = r3
            androidx.lifecycle.t r3 = r1.f2623L
            androidx.lifecycle.l r4 = androidx.lifecycle.EnumC0747l.ON_RESUME
            r3.m1782d(r4)
            android.view.View r3 = r1.f2616E
            if (r3 == 0) goto L6d
            androidx.fragment.app.K r3 = r1.f2624M
            androidx.lifecycle.t r3 = r3.f2518b
            r3.m1782d(r4)
        L6d:
            androidx.fragment.app.D r3 = r1.f2647t
            r4 = 0
            r3.f2470y = r4
            r3.f2471z = r4
            androidx.fragment.app.F r5 = r3.f2444F
            r5.f2485h = r4
            r3.m1686s(r0)
            A1.a r0 = r6.f2504a
            r0.m76o(r4)
            r1.f2629b = r2
            r1.f2630c = r2
            r1.f2631d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0691I.m1711n():void");
    }

    /* renamed from: o */
    public final void m1712o() {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (abstractComponentCallbacksC0712o.f2616E == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0712o.f2616E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0712o.f2630c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0712o.f2624M.f2519c.m1459d(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0712o.f2631d = bundle;
    }

    /* renamed from: p */
    public final void m1713p() {
        boolean zM1646D = C0686D.m1646D(3);
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (zM1646D) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        abstractComponentCallbacksC0712o.f2647t.m1654I();
        abstractComponentCallbacksC0712o.f2647t.m1691x(true);
        abstractComponentCallbacksC0712o.f2628a = 5;
        abstractComponentCallbacksC0712o.f2614C = false;
        abstractComponentCallbacksC0712o.mo1747r();
        if (!abstractComponentCallbacksC0712o.f2614C) {
            throw new C0697O("Fragment " + abstractComponentCallbacksC0712o + " did not call through to super.onStart()");
        }
        C0755t c0755t = abstractComponentCallbacksC0712o.f2623L;
        EnumC0747l enumC0747l = EnumC0747l.ON_START;
        c0755t.m1782d(enumC0747l);
        if (abstractComponentCallbacksC0712o.f2616E != null) {
            abstractComponentCallbacksC0712o.f2624M.f2518b.m1782d(enumC0747l);
        }
        C0686D c0686d = abstractComponentCallbacksC0712o.f2647t;
        c0686d.f2470y = false;
        c0686d.f2471z = false;
        c0686d.f2444F.f2485h = false;
        c0686d.m1686s(5);
        this.f2504a.m78q(false);
    }

    /* renamed from: q */
    public final void m1714q() {
        boolean zM1646D = C0686D.m1646D(3);
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2506c;
        if (zM1646D) {
            Objects.toString(abstractComponentCallbacksC0712o);
        }
        C0686D c0686d = abstractComponentCallbacksC0712o.f2647t;
        c0686d.f2471z = true;
        c0686d.f2444F.f2485h = true;
        c0686d.m1686s(4);
        if (abstractComponentCallbacksC0712o.f2616E != null) {
            abstractComponentCallbacksC0712o.f2624M.m1715d(EnumC0747l.ON_STOP);
        }
        abstractComponentCallbacksC0712o.f2623L.m1782d(EnumC0747l.ON_STOP);
        abstractComponentCallbacksC0712o.f2628a = 4;
        abstractComponentCallbacksC0712o.f2614C = false;
        abstractComponentCallbacksC0712o.mo1748s();
        if (abstractComponentCallbacksC0712o.f2614C) {
            this.f2504a.m79r(false);
            return;
        }
        throw new C0697O("Fragment " + abstractComponentCallbacksC0712o + " did not call through to super.onStop()");
    }

    public C0691I(C0019a c0019a, C0027i c0027i, ClassLoader classLoader, C0721x c0721x, C0690H c0690h) {
        this.f2504a = c0019a;
        this.f2505b = c0027i;
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712oM1765a = c0721x.m1765a(c0690h.f2491a);
        this.f2506c = abstractComponentCallbacksC0712oM1765a;
        Bundle bundle = c0690h.f2500j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0712oM1765a.m1761y(bundle);
        abstractComponentCallbacksC0712oM1765a.f2632e = c0690h.f2492b;
        abstractComponentCallbacksC0712oM1765a.f2640m = c0690h.f2493c;
        abstractComponentCallbacksC0712oM1765a.f2642o = true;
        abstractComponentCallbacksC0712oM1765a.f2649v = c0690h.f2494d;
        abstractComponentCallbacksC0712oM1765a.f2650w = c0690h.f2495e;
        abstractComponentCallbacksC0712oM1765a.f2651x = c0690h.f2496f;
        abstractComponentCallbacksC0712oM1765a.f2612A = c0690h.f2497g;
        abstractComponentCallbacksC0712oM1765a.f2639l = c0690h.f2498h;
        abstractComponentCallbacksC0712oM1765a.f2653z = c0690h.f2499i;
        abstractComponentCallbacksC0712oM1765a.f2652y = c0690h.f2501k;
        abstractComponentCallbacksC0712oM1765a.f2622K = EnumC0748m.values()[c0690h.f2502l];
        Bundle bundle2 = c0690h.f2503m;
        if (bundle2 != null) {
            abstractComponentCallbacksC0712oM1765a.f2629b = bundle2;
        } else {
            abstractComponentCallbacksC0712oM1765a.f2629b = new Bundle();
        }
        if (C0686D.m1646D(2)) {
            Objects.toString(abstractComponentCallbacksC0712oM1765a);
        }
    }

    public C0691I(C0019a c0019a, C0027i c0027i, AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o, C0690H c0690h) {
        this.f2504a = c0019a;
        this.f2505b = c0027i;
        this.f2506c = abstractComponentCallbacksC0712o;
        abstractComponentCallbacksC0712o.f2630c = null;
        abstractComponentCallbacksC0712o.f2631d = null;
        abstractComponentCallbacksC0712o.f2644q = 0;
        abstractComponentCallbacksC0712o.f2641n = false;
        abstractComponentCallbacksC0712o.f2638k = false;
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = abstractComponentCallbacksC0712o.f2634g;
        abstractComponentCallbacksC0712o.f2635h = abstractComponentCallbacksC0712o2 != null ? abstractComponentCallbacksC0712o2.f2632e : null;
        abstractComponentCallbacksC0712o.f2634g = null;
        Bundle bundle = c0690h.f2503m;
        if (bundle != null) {
            abstractComponentCallbacksC0712o.f2629b = bundle;
        } else {
            abstractComponentCallbacksC0712o.f2629b = new Bundle();
        }
    }
}
