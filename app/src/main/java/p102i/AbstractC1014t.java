package p102i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: i.t */
/* loaded from: classes.dex */
public abstract class AbstractC1014t implements InterfaceC0992C, InterfaceC1019y, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f4317a;

    /* renamed from: p */
    public static int m2590p(ListAdapter listAdapter, Context context, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    /* renamed from: x */
    public static boolean m2591x(MenuC1006l menuC1006l) {
        int size = menuC1006l.f4256f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menuC1006l.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: c */
    public final int mo1063c() {
        return 0;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: e */
    public final boolean mo1065e(C1008n c1008n) {
        return false;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: h */
    public final void mo1067h(Context context, MenuC1006l menuC1006l) {
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: l */
    public final boolean mo1069l(C1008n c1008n) {
        return false;
    }

    /* renamed from: o */
    public abstract void mo2545o(MenuC1006l menuC1006l);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1003i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1003i) listAdapter).f4244a.m2577q((MenuItem) listAdapter.getItem(i2), this, !(this instanceof ViewOnKeyListenerC1000f) ? 0 : 4);
    }

    /* renamed from: q */
    public abstract void mo2546q(View view);

    /* renamed from: r */
    public abstract void mo2547r(boolean z2);

    /* renamed from: s */
    public abstract void mo2548s(int i2);

    /* renamed from: t */
    public abstract void mo2549t(int i2);

    /* renamed from: u */
    public abstract void mo2550u(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: v */
    public abstract void mo2551v(boolean z2);

    /* renamed from: w */
    public abstract void mo2552w(int i2);
}
