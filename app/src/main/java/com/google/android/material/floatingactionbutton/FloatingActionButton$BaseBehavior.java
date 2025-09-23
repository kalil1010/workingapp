package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p144x.AbstractC1388a;
import p144x.C1391d;
import p145x0.AbstractC1395a;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC1388a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: e */
    public final boolean mo2100e(View view) {
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: g */
    public final void mo2052g(C1391d c1391d) {
        if (c1391d.f6015h == 0) {
            c1391d.f6015h = 80;
        }
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: h */
    public final boolean mo2033h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: k */
    public final boolean mo2022k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1395a.f6038g);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
