package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p144x.AbstractC1388a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC1388a {
    public ExpandableBehavior() {
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: f */
    public abstract void mo2032f(View view);

    @Override // p144x.AbstractC1388a
    /* renamed from: h */
    public final boolean mo2033h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: k */
    public final boolean mo2022k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM1556j = coordinatorLayout.m1556j(view);
            int size = arrayListM1556j.size();
            for (int i3 = 0; i3 < size; i3++) {
                mo2032f(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
