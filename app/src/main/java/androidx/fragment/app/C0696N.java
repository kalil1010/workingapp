package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p001A0.C0004c;
import p017G.C0155d;
import p017G.InterfaceC0154c;
import p124q.AbstractC1271e;

/* renamed from: androidx.fragment.app.N */
/* loaded from: classes.dex */
public final class C0696N {

    /* renamed from: a */
    public int f2524a;

    /* renamed from: b */
    public int f2525b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0712o f2526c;

    /* renamed from: d */
    public final ArrayList f2527d = new ArrayList();

    /* renamed from: e */
    public final HashSet f2528e = new HashSet();

    /* renamed from: f */
    public boolean f2529f = false;

    /* renamed from: g */
    public boolean f2530g = false;

    /* renamed from: h */
    public final C0691I f2531h;

    public C0696N(int i2, int i3, C0691I c0691i, C0155d c0155d) {
        this.f2524a = i2;
        this.f2525b = i3;
        this.f2526c = c0691i.f2506c;
        c0155d.m419a(new C0004c(27, this));
        this.f2531h = c0691i;
    }

    /* renamed from: a */
    public final void m1718a() {
        if (this.f2529f) {
            return;
        }
        this.f2529f = true;
        HashSet hashSet = this.f2528e;
        if (hashSet.isEmpty()) {
            m1719b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            C0155d c0155d = (C0155d) it.next();
            synchronized (c0155d) {
                try {
                    if (!c0155d.f531a) {
                        c0155d.f531a = true;
                        c0155d.f533c = true;
                        InterfaceC0154c interfaceC0154c = c0155d.f532b;
                        if (interfaceC0154c != null) {
                            try {
                                interfaceC0154c.mo21h();
                            } catch (Throwable th) {
                                synchronized (c0155d) {
                                    c0155d.f533c = false;
                                    c0155d.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0155d) {
                            c0155d.f533c = false;
                            c0155d.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1719b() {
        if (!this.f2530g) {
            if (C0686D.m1646D(2)) {
                toString();
            }
            this.f2530g = true;
            Iterator it = this.f2527d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f2531h.m1708k();
    }

    /* renamed from: c */
    public final void m1720c(int i2, int i3) {
        int iM2966a = AbstractC1271e.m2966a(i3);
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2526c;
        if (iM2966a == 0) {
            if (this.f2524a != 1) {
                if (C0686D.m1646D(2)) {
                    Objects.toString(abstractComponentCallbacksC0712o);
                }
                this.f2524a = i2;
                return;
            }
            return;
        }
        if (iM2966a != 1) {
            if (iM2966a != 2) {
                return;
            }
            if (C0686D.m1646D(2)) {
                Objects.toString(abstractComponentCallbacksC0712o);
            }
            this.f2524a = 1;
            this.f2525b = 3;
            return;
        }
        if (this.f2524a == 1) {
            if (C0686D.m1646D(2)) {
                Objects.toString(abstractComponentCallbacksC0712o);
            }
            this.f2524a = 2;
            this.f2525b = 2;
        }
    }

    /* renamed from: d */
    public final void m1721d() {
        if (this.f2525b == 2) {
            C0691I c0691i = this.f2531h;
            AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0691i.f2506c;
            View viewFindFocus = abstractComponentCallbacksC0712o.f2616E.findFocus();
            if (viewFindFocus != null) {
                abstractComponentCallbacksC0712o.m1752f().f2610k = viewFindFocus;
                if (C0686D.m1646D(2)) {
                    viewFindFocus.toString();
                    abstractComponentCallbacksC0712o.toString();
                }
            }
            View viewM1759w = this.f2526c.m1759w();
            if (viewM1759w.getParent() == null) {
                c0691i.m1699b();
                viewM1759w.setAlpha(0.0f);
            }
            if (viewM1759w.getAlpha() == 0.0f && viewM1759w.getVisibility() == 0) {
                viewM1759w.setVisibility(4);
            }
            C0711n c0711n = abstractComponentCallbacksC0712o.f2619H;
            viewM1759w.setAlpha(c0711n == null ? 1.0f : c0711n.f2609j);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Operation {");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} {mFinalState = ");
        int i2 = this.f2524a;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        sb.append("} {mLifecycleImpact = ");
        int i3 = this.f2525b;
        sb.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE");
        sb.append("} {mFragment = ");
        sb.append(this.f2526c);
        sb.append("}");
        return sb.toString();
    }
}
