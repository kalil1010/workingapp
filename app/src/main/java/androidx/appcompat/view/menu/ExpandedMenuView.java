package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p002A1.C0027i;
import p102i.C1008n;
import p102i.InterfaceC0990A;
import p102i.InterfaceC1005k;
import p102i.MenuC1006l;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1005k, InterfaceC0990A, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public static final int[] f2056b = {R.attr.background, R.attr.divider};

    /* renamed from: a */
    public MenuC1006l f2057a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0027i c0027iM98N = C0027i.m98N(context, attributeSet, f2056b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0027iM98N.m100B(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0027iM98N.m100B(1));
        }
        c0027iM98N.m114R();
    }

    @Override // p102i.InterfaceC0990A
    /* renamed from: b */
    public final void mo1475b(MenuC1006l menuC1006l) {
        this.f2057a = menuC1006l;
    }

    @Override // p102i.InterfaceC1005k
    /* renamed from: c */
    public final boolean mo1476c(C1008n c1008n) {
        return this.f2057a.m2577q(c1008n, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        mo1476c((C1008n) getAdapter().getItem(i2));
    }
}
