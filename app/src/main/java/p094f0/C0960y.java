package p094f0;

import android.view.View;
import androidx.emoji2.text.AbstractC0668g;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.y */
/* loaded from: classes.dex */
public final class C0960y extends AbstractC0913L {

    /* renamed from: a */
    public RecyclerView f4029a;

    /* renamed from: b */
    public final C0930b0 f4030b = new C0930b0(this);

    /* renamed from: c */
    public C0959x f4031c;

    /* renamed from: d */
    public C0959x f4032d;

    /* renamed from: b */
    public static int m2467b(View view, AbstractC0668g abstractC0668g) {
        return ((abstractC0668g.mo1612c(view) / 2) + abstractC0668g.mo1614e(view)) - ((abstractC0668g.mo1621l() / 2) + abstractC0668g.mo1620k());
    }

    /* renamed from: c */
    public static View m2468c(AbstractC0911J abstractC0911J, AbstractC0668g abstractC0668g) {
        int iM2374v = abstractC0911J.m2374v();
        View view = null;
        if (iM2374v == 0) {
            return null;
        }
        int iMo1621l = (abstractC0668g.mo1621l() / 2) + abstractC0668g.mo1620k();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iM2374v; i3++) {
            View viewM2372u = abstractC0911J.m2372u(i3);
            int iAbs = Math.abs(((abstractC0668g.mo1612c(viewM2372u) / 2) + abstractC0668g.mo1614e(viewM2372u)) - iMo1621l);
            if (iAbs < i2) {
                view = viewM2372u;
                i2 = iAbs;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final int[] m2469a(AbstractC0911J abstractC0911J, View view) {
        int[] iArr = new int[2];
        if (abstractC0911J.mo1862d()) {
            iArr[0] = m2467b(view, m2470d(abstractC0911J));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0911J.mo1865e()) {
            iArr[1] = m2467b(view, m2471e(abstractC0911J));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* renamed from: d */
    public final AbstractC0668g m2470d(AbstractC0911J abstractC0911J) {
        C0959x c0959x = this.f4032d;
        if (c0959x == null || ((AbstractC0911J) c0959x.f2391b) != abstractC0911J) {
            this.f4032d = new C0959x(abstractC0911J, 0);
        }
        return this.f4032d;
    }

    /* renamed from: e */
    public final AbstractC0668g m2471e(AbstractC0911J abstractC0911J) {
        C0959x c0959x = this.f4031c;
        if (c0959x == null || ((AbstractC0911J) c0959x.f2391b) != abstractC0911J) {
            this.f4031c = new C0959x(abstractC0911J, 1);
        }
        return this.f4031c;
    }

    /* renamed from: f */
    public final void m2472f() {
        AbstractC0911J layoutManager;
        RecyclerView recyclerView = this.f4029a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewM2468c = layoutManager.mo1865e() ? m2468c(layoutManager, m2471e(layoutManager)) : layoutManager.mo1862d() ? m2468c(layoutManager, m2470d(layoutManager)) : null;
        if (viewM2468c == null) {
            return;
        }
        int[] iArrM2469a = m2469a(layoutManager, viewM2468c);
        int i2 = iArrM2469a[0];
        if (i2 == 0 && iArrM2469a[1] == 0) {
            return;
        }
        this.f4029a.m1908c0(i2, iArrM2469a[1], false);
    }
}
