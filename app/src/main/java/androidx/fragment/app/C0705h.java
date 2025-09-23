package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p001A0.C0004c;
import p002A1.C0019a;
import p002A1.C0027i;
import p006C.AbstractC0075g;
import p017G.C0155d;
import p020H.RunnableC0181k;
import p028K.AbstractC0241P;
import p055T0.C0511e;
import p124q.AbstractC1271e;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public final class C0705h {

    /* renamed from: a */
    public final ViewGroup f2577a;

    /* renamed from: b */
    public final ArrayList f2578b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f2579c = new ArrayList();

    /* renamed from: d */
    public boolean f2580d = false;

    /* renamed from: e */
    public boolean f2581e = false;

    public C0705h(ViewGroup viewGroup) {
        this.f2577a = viewGroup;
    }

    /* renamed from: f */
    public static C0705h m1733f(ViewGroup viewGroup, C0511e c0511e) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0705h) {
            return (C0705h) tag;
        }
        c0511e.getClass();
        C0705h c0705h = new C0705h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0705h);
        return c0705h;
    }

    /* renamed from: a */
    public final void m1734a(int i2, int i3, C0691I c0691i) {
        synchronized (this.f2578b) {
            try {
                C0155d c0155d = new C0155d();
                C0696N c0696nM1737d = m1737d(c0691i.f2506c);
                if (c0696nM1737d != null) {
                    c0696nM1737d.m1720c(i2, i3);
                    return;
                }
                C0696N c0696n = new C0696N(i2, i3, c0691i, c0155d);
                this.f2578b.add(c0696n);
                c0696n.f2527d.add(new RunnableC0695M(this, c0696n, 0));
                c0696n.f2527d.add(new RunnableC0695M(this, c0696n, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m1735b(ArrayList arrayList, boolean z2) throws Resources.NotFoundException {
        int i2;
        int i3;
        Iterator it = arrayList.iterator();
        C0696N c0696n = null;
        C0696N c0696n2 = null;
        while (true) {
            i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            C0696N c0696n3 = (C0696N) it.next();
            int iM234c = AbstractC0075g.m234c(c0696n3.f2526c.f2616E);
            int iM2966a = AbstractC1271e.m2966a(c0696n3.f2524a);
            if (iM2966a != 0) {
                if (iM2966a != 1) {
                    if (iM2966a == 2 || iM2966a == 3) {
                    }
                } else if (iM234c != 2) {
                    c0696n2 = c0696n3;
                }
            }
            if (iM234c == 2 && c0696n == null) {
                c0696n = c0696n3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it2.hasNext()) {
                break;
            }
            C0696N c0696n4 = (C0696N) it2.next();
            C0155d c0155d = new C0155d();
            c0696n4.m1721d();
            HashSet hashSet = c0696n4.f2528e;
            hashSet.add(c0155d);
            C0702e c0702e = new C0702e(c0696n4, c0155d);
            c0702e.f2573d = false;
            c0702e.f2572c = z2;
            arrayList2.add(c0702e);
            C0155d c0155d2 = new C0155d();
            c0696n4.m1721d();
            hashSet.add(c0155d2);
            if (!z2 ? c0696n4 == c0696n2 : c0696n4 == c0696n) {
                z3 = true;
            }
            C0704g c0704g = new C0704g(c0696n4, c0155d2);
            int i4 = c0696n4.f2524a;
            AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0696n4.f2526c;
            if (i4 == 2) {
                if (z2) {
                    abstractComponentCallbacksC0712o.getClass();
                } else {
                    abstractComponentCallbacksC0712o.getClass();
                }
                if (z2) {
                    abstractComponentCallbacksC0712o.getClass();
                } else {
                    abstractComponentCallbacksC0712o.getClass();
                }
            } else if (z2) {
                abstractComponentCallbacksC0712o.getClass();
            } else {
                abstractComponentCallbacksC0712o.getClass();
            }
            if (z3) {
                if (z2) {
                    abstractComponentCallbacksC0712o.getClass();
                } else {
                    abstractComponentCallbacksC0712o.getClass();
                }
            }
            arrayList3.add(c0704g);
            c0696n4.f2527d.add(new RunnableC0181k(this, arrayList4, c0696n4));
        }
        HashMap map = new HashMap();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C0696N c0696n5 = (C0696N) ((C0704g) it3.next()).f2575a;
            AbstractC0075g.m234c(c0696n5.f2526c.f2616E);
            int i5 = c0696n5.f2524a;
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C0704g c0704g2 = (C0704g) it4.next();
            map.put((C0696N) c0704g2.f2575a, Boolean.FALSE);
            c0704g2.m1727d();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f2577a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        boolean z4 = false;
        while (it5.hasNext()) {
            C0702e c0702e2 = (C0702e) it5.next();
            C0696N c0696n6 = (C0696N) c0702e2.f2575a;
            int iM234c2 = AbstractC0075g.m234c(c0696n6.f2526c.f2616E);
            int i6 = c0696n6.f2524a;
            if (iM234c2 == i6 || !(iM234c2 == i2 || i6 == i2)) {
                i3 = i2;
                c0702e2.m1727d();
            } else {
                C0019a c0019aM1725j = c0702e2.m1725j(context);
                if (c0019aM1725j == null) {
                    c0702e2.m1727d();
                } else {
                    Animator animator = (Animator) c0019aM1725j.f46b;
                    if (animator == null) {
                        arrayList5.add(c0702e2);
                    } else {
                        C0696N c0696n7 = (C0696N) c0702e2.f2575a;
                        i3 = i2;
                        boolean zEquals = Boolean.TRUE.equals(map.get(c0696n7));
                        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o2 = c0696n7.f2526c;
                        if (zEquals) {
                            if (C0686D.m1646D(i3)) {
                                Objects.toString(abstractComponentCallbacksC0712o2);
                            }
                            c0702e2.m1727d();
                        } else {
                            boolean z5 = c0696n7.f2524a == 3;
                            if (z5) {
                                arrayList4.remove(c0696n7);
                            }
                            View view = abstractComponentCallbacksC0712o2.f2616E;
                            viewGroup.startViewTransition(view);
                            animator.addListener(new C0700c(viewGroup, view, z5, c0696n7, c0702e2));
                            animator.setTarget(view);
                            animator.start();
                            ((C0155d) c0702e2.f2576b).m419a(new C0004c(24, animator));
                            z4 = true;
                        }
                    }
                }
                i3 = i2;
            }
            i2 = i3;
        }
        int i7 = i2;
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            C0702e c0702e3 = (C0702e) it6.next();
            C0696N c0696n8 = (C0696N) c0702e3.f2575a;
            AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o3 = c0696n8.f2526c;
            if (zContainsValue) {
                if (C0686D.m1646D(i7)) {
                    Objects.toString(abstractComponentCallbacksC0712o3);
                }
                c0702e3.m1727d();
            } else if (z4) {
                if (C0686D.m1646D(i7)) {
                    Objects.toString(abstractComponentCallbacksC0712o3);
                }
                c0702e3.m1727d();
            } else {
                View view2 = abstractComponentCallbacksC0712o3.f2616E;
                C0019a c0019aM1725j2 = c0702e3.m1725j(context);
                c0019aM1725j2.getClass();
                Animation animation = (Animation) c0019aM1725j2.f47c;
                animation.getClass();
                if (c0696n8.f2524a != 1) {
                    view2.startAnimation(animation);
                    c0702e3.m1727d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0716s runnableC0716s = new RunnableC0716s(animation, viewGroup, view2);
                    runnableC0716s.setAnimationListener(new AnimationAnimationListenerC0701d(view2, viewGroup, c0702e3));
                    view2.startAnimation(runnableC0716s);
                }
                ((C0155d) c0702e3.f2576b).m419a(new C0027i(view2, viewGroup, c0702e3));
            }
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            C0696N c0696n9 = (C0696N) it7.next();
            AbstractC0075g.m232a(c0696n9.f2526c.f2616E, c0696n9.f2524a);
        }
        arrayList4.clear();
    }

    /* renamed from: c */
    public final void m1736c() {
        if (this.f2581e) {
            return;
        }
        ViewGroup viewGroup = this.f2577a;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (!viewGroup.isAttachedToWindow()) {
            m1738e();
            this.f2580d = false;
            return;
        }
        synchronized (this.f2578b) {
            try {
                if (!this.f2578b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2579c);
                    this.f2579c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0696N c0696n = (C0696N) it.next();
                        if (C0686D.m1646D(2)) {
                            Objects.toString(c0696n);
                        }
                        c0696n.m1718a();
                        if (!c0696n.f2530g) {
                            this.f2579c.add(c0696n);
                        }
                    }
                    m1739g();
                    ArrayList arrayList2 = new ArrayList(this.f2578b);
                    this.f2578b.clear();
                    this.f2579c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0696N) it2.next()).m1721d();
                    }
                    m1735b(arrayList2, this.f2580d);
                    this.f2580d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final C0696N m1737d(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        Iterator it = this.f2578b.iterator();
        while (it.hasNext()) {
            C0696N c0696n = (C0696N) it.next();
            if (c0696n.f2526c.equals(abstractComponentCallbacksC0712o) && !c0696n.f2529f) {
                return c0696n;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m1738e() {
        ViewGroup viewGroup = this.f2577a;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f2578b) {
            try {
                m1739g();
                Iterator it = this.f2578b.iterator();
                while (it.hasNext()) {
                    ((C0696N) it.next()).m1721d();
                }
                Iterator it2 = new ArrayList(this.f2579c).iterator();
                while (it2.hasNext()) {
                    C0696N c0696n = (C0696N) it2.next();
                    if (C0686D.m1646D(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f2577a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(c0696n);
                    }
                    c0696n.m1718a();
                }
                Iterator it3 = new ArrayList(this.f2578b).iterator();
                while (it3.hasNext()) {
                    C0696N c0696n2 = (C0696N) it3.next();
                    if (C0686D.m1646D(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f2577a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(c0696n2);
                    }
                    c0696n2.m1718a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m1739g() {
        Iterator it = this.f2578b.iterator();
        while (it.hasNext()) {
            C0696N c0696n = (C0696N) it.next();
            if (c0696n.f2525b == 2) {
                c0696n.m1720c(AbstractC0075g.m233b(c0696n.f2526c.m1759w().getVisibility()), 1);
            }
        }
    }
}
