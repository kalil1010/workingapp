package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p001A0.C0002a;
import p006C.AbstractC0075g;
import p093e2.AbstractC0901d;
import p144x.AbstractC1388a;
import p148y0.AbstractC1400a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC1388a {

    /* renamed from: b */
    public int f3037b;

    /* renamed from: c */
    public int f3038c;

    /* renamed from: d */
    public TimeInterpolator f3039d;

    /* renamed from: e */
    public TimeInterpolator f3040e;

    /* renamed from: h */
    public ViewPropertyAnimator f3043h;

    /* renamed from: a */
    public final LinkedHashSet f3036a = new LinkedHashSet();

    /* renamed from: f */
    public int f3041f = 0;

    /* renamed from: g */
    public int f3042g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: k */
    public boolean mo2022k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f3041f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f3037b = AbstractC0901d.m2304k0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f3038c = AbstractC0901d.m2304k0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f3039d = AbstractC0901d.m2306l0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1400a.f6069d);
        this.f3040e = AbstractC0901d.m2306l0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1400a.f6068c);
        return false;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: o */
    public final void mo2025o(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f3036a;
        if (i2 > 0) {
            if (this.f3042g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f3043h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f3042g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw AbstractC0075g.m235d(it);
            }
            this.f3043h = view.animate().translationY(this.f3041f).setInterpolator(this.f3040e).setDuration(this.f3038c).setListener(new C0002a(0, this));
            return;
        }
        if (i2 >= 0 || this.f3042g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f3043h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f3042g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw AbstractC0075g.m235d(it2);
        }
        this.f3043h = view.animate().translationY(0).setInterpolator(this.f3039d).setDuration(this.f3037b).setListener(new C0002a(0, this));
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: s */
    public boolean mo2028s(View view, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
