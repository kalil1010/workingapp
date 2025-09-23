package com.google.android.material.sidesheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0636b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p001A0.C0002a;
import p003B.RunnableC0058n;
import p006C.AbstractC0075g;
import p007C0.C0087e;
import p007C0.C0091i;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p031L.C0336f;
import p031L.InterfaceC0351u;
import p038N0.C0422i;
import p038N0.InterfaceC0415b;
import p054T.C0506e;
import p055T0.C0507a;
import p055T0.C0513g;
import p055T0.C0516j;
import p055T0.C0517k;
import p058U0.C0534a;
import p058U0.C0537d;
import p093e2.AbstractC0901d;
import p144x.AbstractC1388a;
import p144x.C1391d;
import p145x0.AbstractC1395a;
import p148y0.AbstractC1400a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC1388a implements InterfaceC0415b {

    /* renamed from: a */
    public AbstractC0901d f3301a;

    /* renamed from: b */
    public final C0513g f3302b;

    /* renamed from: c */
    public final ColorStateList f3303c;

    /* renamed from: d */
    public final C0517k f3304d;

    /* renamed from: e */
    public final C0091i f3305e;

    /* renamed from: f */
    public final float f3306f;

    /* renamed from: g */
    public final boolean f3307g;

    /* renamed from: h */
    public int f3308h;

    /* renamed from: i */
    public C0506e f3309i;

    /* renamed from: j */
    public boolean f3310j;

    /* renamed from: k */
    public final float f3311k;

    /* renamed from: l */
    public int f3312l;

    /* renamed from: m */
    public int f3313m;

    /* renamed from: n */
    public int f3314n;

    /* renamed from: o */
    public int f3315o;

    /* renamed from: p */
    public WeakReference f3316p;

    /* renamed from: q */
    public WeakReference f3317q;

    /* renamed from: r */
    public final int f3318r;

    /* renamed from: s */
    public VelocityTracker f3319s;

    /* renamed from: t */
    public C0422i f3320t;

    /* renamed from: u */
    public int f3321u;

    /* renamed from: v */
    public final LinkedHashSet f3322v;

    /* renamed from: w */
    public final C0087e f3323w;

    public SideSheetBehavior() {
        this.f3305e = new C0091i(this);
        this.f3307g = true;
        this.f3308h = 5;
        this.f3311k = 0.1f;
        this.f3318r = -1;
        this.f3322v = new LinkedHashSet();
        this.f3323w = new C0087e(this, 1);
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: a */
    public final void mo1085a() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        C0422i c0422i = this.f3320t;
        if (c0422i == null) {
            return;
        }
        C0636b c0636b = c0422i.f1297f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        c0422i.f1297f = null;
        int i2 = 5;
        if (c0636b == null || Build.VERSION.SDK_INT < 34) {
            m2107v(5);
            return;
        }
        AbstractC0901d abstractC0901d = this.f3301a;
        if (abstractC0901d != null && abstractC0901d.mo1320H() != 0) {
            i2 = 3;
        }
        C0002a c0002a = new C0002a(4, this);
        WeakReference weakReference = this.f3317q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iMo1328v = this.f3301a.mo1328v(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: U0.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f1699a.f3301a.mo1327u0(marginLayoutParams, AbstractC1400a.m3166c(iMo1328v, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        c0422i.m1095b(c0636b, i2, c0002a, animatorUpdateListener);
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: b */
    public final void mo1086b(C0636b c0636b) {
        C0422i c0422i = this.f3320t;
        if (c0422i == null) {
            return;
        }
        c0422i.f1297f = c0636b;
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: c */
    public final void mo1087c(C0636b c0636b) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C0422i c0422i = this.f3320t;
        if (c0422i == null) {
            return;
        }
        AbstractC0901d abstractC0901d = this.f3301a;
        int i2 = (abstractC0901d == null || abstractC0901d.mo1320H() == 0) ? 5 : 3;
        C0636b c0636b2 = c0422i.f1297f;
        c0422i.f1297f = c0636b;
        if (c0636b2 != null) {
            c0422i.m1096c(c0636b.f1981c, c0636b.f1982d == 0, i2);
        }
        WeakReference weakReference = this.f3316p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f3316p.get();
        WeakReference weakReference2 = this.f3317q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f3301a.mo1327u0(marginLayoutParams, (int) ((view.getScaleX() * this.f3312l) + this.f3315o));
        view2.requestLayout();
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: d */
    public final void mo1088d() {
        C0422i c0422i = this.f3320t;
        if (c0422i == null) {
            return;
        }
        c0422i.m1094a();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: g */
    public final void mo2052g(C1391d c1391d) {
        this.f3316p = null;
        this.f3309i = null;
        this.f3320t = null;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: i */
    public final void mo2053i() {
        this.f3316p = null;
        this.f3309i = null;
        this.f3320t = null;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: j */
    public final boolean mo2021j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0506e c0506e;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC0241P.m693e(view) == null) || !this.f3307g) {
            this.f3310j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f3319s) != null) {
            velocityTracker.recycle();
            this.f3319s = null;
        }
        if (this.f3319s == null) {
            this.f3319s = VelocityTracker.obtain();
        }
        this.f3319s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f3321u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f3310j) {
            this.f3310j = false;
            return false;
        }
        return (this.f3310j || (c0506e = this.f3309i) == null || !c0506e.m1267q(motionEvent)) ? false : true;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: k */
    public final boolean mo2022k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View view2;
        View view3;
        int i3;
        View viewFindViewById;
        int iMo1318F = 0;
        int i4 = 1;
        C0513g c0513g = this.f3302b;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f3316p == null) {
            this.f3316p = new WeakReference(view);
            this.f3320t = new C0422i(view);
            if (c0513g != null) {
                view.setBackground(c0513g);
                float fM626i = this.f3306f;
                if (fM626i == -1.0f) {
                    fM626i = AbstractC0230E.m626i(view);
                }
                c0513g.m1289i(fM626i);
            } else {
                ColorStateList colorStateList = this.f3303c;
                if (colorStateList != null) {
                    AbstractC0230E.m634q(view, colorStateList);
                }
            }
            int i5 = this.f3308h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            m2111z();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC0241P.m693e(view) == null) {
                AbstractC0241P.m702n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C1391d) view.getLayoutParams()).f6010c, i2) == 3 ? 1 : 0;
        AbstractC0901d abstractC0901d = this.f3301a;
        if (abstractC0901d == null || abstractC0901d.mo1320H() != i6) {
            C0517k c0517k = this.f3304d;
            C1391d c1391d = null;
            if (i6 == 0) {
                this.f3301a = new C0534a(this, i4);
                if (c0517k != null) {
                    WeakReference weakReference = this.f3316p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C1391d)) {
                        c1391d = (C1391d) view3.getLayoutParams();
                    }
                    if (c1391d == null || ((ViewGroup.MarginLayoutParams) c1391d).rightMargin <= 0) {
                        C0516j c0516jM1300e = c0517k.m1300e();
                        c0516jM1300e.f1629f = new C0507a(0.0f);
                        c0516jM1300e.f1630g = new C0507a(0.0f);
                        C0517k c0517kM1295a = c0516jM1300e.m1295a();
                        if (c0513g != null) {
                            c0513g.setShapeAppearanceModel(c0517kM1295a);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.f3301a = new C0534a(this, iMo1318F);
                if (c0517k != null) {
                    WeakReference weakReference2 = this.f3316p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C1391d)) {
                        c1391d = (C1391d) view2.getLayoutParams();
                    }
                    if (c1391d == null || ((ViewGroup.MarginLayoutParams) c1391d).leftMargin <= 0) {
                        C0516j c0516jM1300e2 = c0517k.m1300e();
                        c0516jM1300e2.f1628e = new C0507a(0.0f);
                        c0516jM1300e2.f1631h = new C0507a(0.0f);
                        C0517k c0517kM1295a2 = c0516jM1300e2.m1295a();
                        if (c0513g != null) {
                            c0513g.setShapeAppearanceModel(c0517kM1295a2);
                        }
                    }
                }
            }
        }
        if (this.f3309i == null) {
            this.f3309i = new C0506e(coordinatorLayout.getContext(), coordinatorLayout, this.f3323w);
        }
        int iMo1318F2 = this.f3301a.mo1318F(view);
        coordinatorLayout.m1560p(view, i2);
        this.f3313m = coordinatorLayout.getWidth();
        this.f3314n = this.f3301a.mo1319G(coordinatorLayout);
        this.f3312l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f3315o = marginLayoutParams != null ? this.f3301a.mo1324c(marginLayoutParams) : 0;
        int i7 = this.f3308h;
        if (i7 == 1 || i7 == 2) {
            iMo1318F = iMo1318F2 - this.f3301a.mo1318F(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f3308h);
            }
            iMo1318F = this.f3301a.mo1315B();
        }
        view.offsetLeftAndRight(iMo1318F);
        if (this.f3317q == null && (i3 = this.f3318r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.f3317q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f3322v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: l */
    public final boolean mo2023l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: q */
    public final void mo2026q(View view, Parcelable parcelable) {
        int i2 = ((C0537d) parcelable).f1703c;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.f3308h = i2;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: r */
    public final Parcelable mo2027r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C0537d(this);
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: u */
    public final boolean mo2030u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3308h == 1 && actionMasked == 0) {
            return true;
        }
        if (m2109x()) {
            this.f3309i.m1260j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f3319s) != null) {
            velocityTracker.recycle();
            this.f3319s = null;
        }
        if (this.f3319s == null) {
            this.f3319s = VelocityTracker.obtain();
        }
        this.f3319s.addMovement(motionEvent);
        if (m2109x() && actionMasked == 2 && !this.f3310j && m2109x()) {
            float fAbs = Math.abs(this.f3321u - motionEvent.getX());
            C0506e c0506e = this.f3309i;
            if (fAbs > c0506e.f1557b) {
                c0506e.m1252b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3310j;
    }

    /* renamed from: v */
    public final void m2107v(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f3316p;
        if (weakReference == null || weakReference.get() == null) {
            m2108w(i2);
            return;
        }
        View view = (View) this.f3316p.get();
        RunnableC0058n runnableC0058n = new RunnableC0058n(this, i2, 1);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0058n);
                return;
            }
        }
        runnableC0058n.run();
    }

    /* renamed from: w */
    public final void m2108w(int i2) {
        View view;
        if (this.f3308h == i2) {
            return;
        }
        this.f3308h = i2;
        WeakReference weakReference = this.f3316p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = this.f3308h == 5 ? 4 : 0;
        if (view.getVisibility() != i3) {
            view.setVisibility(i3);
        }
        Iterator it = this.f3322v.iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
        m2111z();
    }

    /* renamed from: x */
    public final boolean m2109x() {
        if (this.f3309i != null) {
            return this.f3307g || this.f3308h == 1;
        }
        return false;
    }

    /* renamed from: y */
    public final void m2110y(View view, int i2, boolean z2) {
        int iMo1330z;
        if (i2 == 3) {
            iMo1330z = this.f3301a.mo1330z();
        } else {
            if (i2 != 5) {
                throw new IllegalArgumentException(AbstractC0075g.m236e("Invalid state to get outer edge offset: ", i2));
            }
            iMo1330z = this.f3301a.mo1315B();
        }
        C0506e c0506e = this.f3309i;
        if (c0506e == null || (!z2 ? c0506e.m1268r(view, iMo1330z, view.getTop()) : c0506e.m1266p(iMo1330z, view.getTop()))) {
            m2108w(i2);
        } else {
            m2108w(2);
            this.f3305e.m283a(i2);
        }
    }

    /* renamed from: z */
    public final void m2111z() {
        View view;
        WeakReference weakReference = this.f3316p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0241P.m698j(view, 262144);
        AbstractC0241P.m696h(view, 0);
        AbstractC0241P.m698j(view, 1048576);
        AbstractC0241P.m696h(view, 0);
        final int i2 = 5;
        if (this.f3308h != 5) {
            AbstractC0241P.m699k(view, C0336f.f1076l, new InterfaceC0351u() { // from class: U0.b
                @Override // p031L.InterfaceC0351u
                /* renamed from: f */
                public final boolean mo19f(View view2) {
                    this.f1697a.m2107v(i2);
                    return true;
                }
            });
        }
        final int i3 = 3;
        if (this.f3308h != 3) {
            AbstractC0241P.m699k(view, C0336f.f1074j, new InterfaceC0351u() { // from class: U0.b
                @Override // p031L.InterfaceC0351u
                /* renamed from: f */
                public final boolean mo19f(View view2) {
                    this.f1697a.m2107v(i3);
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f3305e = new C0091i(this);
        this.f3307g = true;
        this.f3308h = 5;
        this.f3311k = 0.1f;
        this.f3318r = -1;
        this.f3322v = new LinkedHashSet();
        this.f3323w = new C0087e(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1395a.f6057z);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f3303c = AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f3304d = C0517k.m1297b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m1295a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f3318r = resourceId;
            WeakReference weakReference = this.f3317q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3317q = null;
            WeakReference weakReference2 = this.f3316p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C0517k c0517k = this.f3304d;
        if (c0517k != null) {
            C0513g c0513g = new C0513g(c0517k);
            this.f3302b = c0513g;
            c0513g.m1288h(context);
            ColorStateList colorStateList = this.f3303c;
            if (colorStateList != null) {
                this.f3302b.m1290j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3302b.setTint(typedValue.data);
            }
        }
        this.f3306f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f3307g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
