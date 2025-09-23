package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0646l;
import androidx.lifecycle.C0734K;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.C0759x;
import androidx.lifecycle.EnumC0748m;
import androidx.lifecycle.InterfaceC0735L;
import androidx.lifecycle.InterfaceC0743h;
import androidx.lifecycle.InterfaceC0753r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p002A1.AbstractActivityC0021c;
import p033L1.AbstractC0364l;
import p090e.AbstractActivityC0874g;
import p097g0.C0968d;
import p097g0.InterfaceC0969e;
import p131s1.AbstractC1326c;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0712o implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0753r, InterfaceC0735L, InterfaceC0743h, InterfaceC0969e {

    /* renamed from: Q */
    public static final Object f2611Q = new Object();

    /* renamed from: A */
    public boolean f2612A;

    /* renamed from: C */
    public boolean f2614C;

    /* renamed from: D */
    public ViewGroup f2615D;

    /* renamed from: E */
    public View f2616E;

    /* renamed from: F */
    public boolean f2617F;

    /* renamed from: H */
    public C0711n f2619H;

    /* renamed from: I */
    public boolean f2620I;

    /* renamed from: J */
    public boolean f2621J;

    /* renamed from: L */
    public C0755t f2623L;

    /* renamed from: M */
    public C0693K f2624M;

    /* renamed from: O */
    public C0646l f2626O;

    /* renamed from: P */
    public final ArrayList f2627P;

    /* renamed from: b */
    public Bundle f2629b;

    /* renamed from: c */
    public SparseArray f2630c;

    /* renamed from: d */
    public Bundle f2631d;

    /* renamed from: f */
    public Bundle f2633f;

    /* renamed from: g */
    public AbstractComponentCallbacksC0712o f2634g;

    /* renamed from: i */
    public int f2636i;

    /* renamed from: k */
    public boolean f2638k;

    /* renamed from: l */
    public boolean f2639l;

    /* renamed from: m */
    public boolean f2640m;

    /* renamed from: n */
    public boolean f2641n;

    /* renamed from: o */
    public boolean f2642o;

    /* renamed from: p */
    public boolean f2643p;

    /* renamed from: q */
    public int f2644q;

    /* renamed from: r */
    public C0686D f2645r;

    /* renamed from: s */
    public C0715r f2646s;

    /* renamed from: u */
    public AbstractComponentCallbacksC0712o f2648u;

    /* renamed from: v */
    public int f2649v;

    /* renamed from: w */
    public int f2650w;

    /* renamed from: x */
    public String f2651x;

    /* renamed from: y */
    public boolean f2652y;

    /* renamed from: z */
    public boolean f2653z;

    /* renamed from: a */
    public int f2628a = -1;

    /* renamed from: e */
    public String f2632e = UUID.randomUUID().toString();

    /* renamed from: h */
    public String f2635h = null;

    /* renamed from: j */
    public Boolean f2637j = null;

    /* renamed from: t */
    public C0686D f2647t = new C0686D();

    /* renamed from: B */
    public final boolean f2613B = true;

    /* renamed from: G */
    public boolean f2618G = true;

    /* renamed from: K */
    public EnumC0748m f2622K = EnumC0748m.f2725e;

    /* renamed from: N */
    public final C0759x f2625N = new C0759x();

    public AbstractComponentCallbacksC0712o() {
        new AtomicInteger();
        this.f2627P = new ArrayList();
        this.f2623L = new C0755t(this);
        this.f2626O = new C0646l(this);
    }

    @Override // p097g0.InterfaceC0969e
    /* renamed from: b */
    public final C0968d mo1451b() {
        return (C0968d) this.f2626O.f2014c;
    }

    @Override // androidx.lifecycle.InterfaceC0735L
    /* renamed from: c */
    public final C0734K mo1452c() {
        if (this.f2645r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m1755i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f2645r.f2444F.f2482e;
        C0734K c0734k = (C0734K) map.get(this.f2632e);
        if (c0734k != null) {
            return c0734k;
        }
        C0734K c0734k2 = new C0734K();
        map.put(this.f2632e, c0734k2);
        return c0734k2;
    }

    /* renamed from: d */
    public AbstractC0364l mo1740d() {
        return new C0710m(this);
    }

    @Override // androidx.lifecycle.InterfaceC0753r
    /* renamed from: e */
    public final C0755t mo1453e() {
        return this.f2623L;
    }

    /* renamed from: f */
    public final C0711n m1752f() {
        if (this.f2619H == null) {
            C0711n c0711n = new C0711n();
            Object obj = f2611Q;
            c0711n.f2606g = obj;
            c0711n.f2607h = obj;
            c0711n.f2608i = obj;
            c0711n.f2609j = 1.0f;
            c0711n.f2610k = null;
            this.f2619H = c0711n;
        }
        return this.f2619H;
    }

    /* renamed from: g */
    public final C0686D m1753g() {
        if (this.f2646s != null) {
            return this.f2647t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: h */
    public final Context m1754h() {
        C0715r c0715r = this.f2646s;
        if (c0715r == null) {
            return null;
        }
        return c0715r.f2659g;
    }

    /* renamed from: i */
    public final int m1755i() {
        EnumC0748m enumC0748m = this.f2622K;
        return (enumC0748m == EnumC0748m.f2722b || this.f2648u == null) ? enumC0748m.ordinal() : Math.min(enumC0748m.ordinal(), this.f2648u.m1755i());
    }

    /* renamed from: j */
    public final C0686D m1756j() {
        C0686D c0686d = this.f2645r;
        if (c0686d != null) {
            return c0686d;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: k */
    public void mo1741k(AbstractActivityC0874g abstractActivityC0874g) {
        this.f2614C = true;
        C0715r c0715r = this.f2646s;
        if ((c0715r == null ? null : c0715r.f2658f) != null) {
            this.f2614C = true;
        }
    }

    /* renamed from: l */
    public void mo1742l(Bundle bundle) {
        Parcelable parcelable;
        this.f2614C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2647t.m1659N(parcelable);
            C0686D c0686d = this.f2647t;
            c0686d.f2470y = false;
            c0686d.f2471z = false;
            c0686d.f2444F.f2485h = false;
            c0686d.m1686s(1);
        }
        C0686D c0686d2 = this.f2647t;
        if (c0686d2.f2458m >= 1) {
            return;
        }
        c0686d2.f2470y = false;
        c0686d2.f2471z = false;
        c0686d2.f2444F.f2485h = false;
        c0686d2.m1686s(1);
    }

    /* renamed from: m */
    public View mo1757m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: n */
    public void mo1743n() {
        this.f2614C = true;
    }

    /* renamed from: o */
    public void mo1744o() {
        this.f2614C = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f2614C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0715r c0715r = this.f2646s;
        AbstractActivityC0874g abstractActivityC0874g = c0715r == null ? null : c0715r.f2658f;
        if (abstractActivityC0874g != null) {
            abstractActivityC0874g.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f2614C = true;
    }

    /* renamed from: p */
    public LayoutInflater mo1745p(Bundle bundle) {
        C0715r c0715r = this.f2646s;
        if (c0715r == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0021c abstractActivityC0021c = c0715r.f2662j;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC0021c.getLayoutInflater().cloneInContext(abstractActivityC0021c);
        layoutInflaterCloneInContext.setFactory2(this.f2647t.f2451f);
        return layoutInflaterCloneInContext;
    }

    /* renamed from: q */
    public abstract void mo1746q(Bundle bundle);

    /* renamed from: r */
    public void mo1747r() {
        this.f2614C = true;
    }

    /* renamed from: s */
    public void mo1748s() {
        this.f2614C = true;
    }

    /* renamed from: t */
    public void mo1749t(Bundle bundle) {
        this.f2614C = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f2632e);
        if (this.f2649v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2649v));
        }
        if (this.f2651x != null) {
            sb.append(" tag=");
            sb.append(this.f2651x);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo1750u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2647t.m1654I();
        this.f2643p = true;
        this.f2624M = new C0693K(mo1452c());
        View viewMo1757m = mo1757m(layoutInflater, viewGroup);
        this.f2616E = viewMo1757m;
        if (viewMo1757m == null) {
            if (this.f2624M.f2518b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2624M = null;
            return;
        }
        this.f2624M.m1716f();
        View view = this.f2616E;
        C0693K c0693k = this.f2624M;
        AbstractC1326c.m3062e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, c0693k);
        View view2 = this.f2616E;
        C0693K c0693k2 = this.f2624M;
        AbstractC1326c.m3062e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, c0693k2);
        View view3 = this.f2616E;
        C0693K c0693k3 = this.f2624M;
        AbstractC1326c.m3062e(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c0693k3);
        this.f2625N.m1794e(this.f2624M);
    }

    /* renamed from: v */
    public final Context m1758v() {
        Context contextM1754h = m1754h();
        if (contextM1754h != null) {
            return contextM1754h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: w */
    public final View m1759w() {
        View view = this.f2616E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: x */
    public final void m1760x(int i2, int i3, int i4, int i5) {
        if (this.f2619H == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        m1752f().f2601b = i2;
        m1752f().f2602c = i3;
        m1752f().f2603d = i4;
        m1752f().f2604e = i5;
    }

    /* renamed from: y */
    public final void m1761y(Bundle bundle) {
        C0686D c0686d = this.f2645r;
        if (c0686d != null && (c0686d.f2470y || c0686d.f2471z)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2633f = bundle;
    }
}
