package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p093e2.AbstractC0901d;
import p144x.AbstractC1388a;
import p144x.C1391d;
import p145x0.AbstractC1395a;
import p151z0.AbstractC1417a;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC1417a {

    /* renamed from: b */
    public final int f3029b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* renamed from: w */
    public static void m2031w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
        }
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: f */
    public final void mo2032f(View view) {
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: h */
    public boolean mo2033h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1388a abstractC1388a = ((C1391d) view2.getLayoutParams()).f6008a;
        if (abstractC1388a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC1388a).getClass();
            int i2 = this.f3029b;
            int iM2299h = bottom - (i2 == 0 ? 0 : AbstractC0901d.m2299h((int) (0.0f * i2), 0, i2));
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            view.offsetTopAndBottom(iM2299h);
        }
        return false;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: l */
    public final boolean mo2023l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        m2031w(coordinatorLayout.m1556j(view));
        return false;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: p */
    public final void mo2034p(CoordinatorLayout coordinatorLayout, View view) {
        m2031w(coordinatorLayout.m1556j(view));
    }

    @Override // p151z0.AbstractC1417a
    /* renamed from: v */
    public final void mo2035v(CoordinatorLayout coordinatorLayout, View view, int i2) {
        m2031w(coordinatorLayout.m1556j(view));
        coordinatorLayout.m1560p(view, i2);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1395a.f6054w);
        this.f3029b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
