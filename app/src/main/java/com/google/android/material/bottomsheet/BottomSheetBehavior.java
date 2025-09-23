package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.activity.C0636b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p001A0.C0002a;
import p002A1.C0019a;
import p006C.AbstractC0075g;
import p007C0.C0085c;
import p007C0.C0086d;
import p007C0.C0087e;
import p007C0.C0088f;
import p007C0.C0090h;
import p007C0.C0091i;
import p007C0.RunnableC0084b;
import p028K.AbstractC0228C;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p028K.C0251a;
import p028K.C0253b;
import p028K.C0257d;
import p028K.C0258d0;
import p028K.C0260e0;
import p028K.ViewOnApplyWindowInsetsListenerC0256c0;
import p031L.C0336f;
import p035M0.C0371D;
import p035M0.ViewOnAttachStateChangeListenerC0370C;
import p038N0.C0420g;
import p038N0.InterfaceC0415b;
import p054T.C0506e;
import p055T0.C0512f;
import p055T0.C0513g;
import p055T0.C0517k;
import p072Z.C0603a;
import p093e2.AbstractC0901d;
import p144x.AbstractC1388a;
import p144x.C1391d;
import p145x0.AbstractC1395a;
import p148y0.AbstractC1400a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC1388a implements InterfaceC0415b {

    /* renamed from: A */
    public final C0091i f3051A;

    /* renamed from: B */
    public final ValueAnimator f3052B;

    /* renamed from: C */
    public final int f3053C;

    /* renamed from: D */
    public int f3054D;

    /* renamed from: E */
    public int f3055E;

    /* renamed from: F */
    public final float f3056F;

    /* renamed from: G */
    public int f3057G;

    /* renamed from: H */
    public final float f3058H;

    /* renamed from: I */
    public boolean f3059I;

    /* renamed from: J */
    public boolean f3060J;

    /* renamed from: K */
    public final boolean f3061K;

    /* renamed from: L */
    public int f3062L;

    /* renamed from: M */
    public C0506e f3063M;

    /* renamed from: N */
    public boolean f3064N;

    /* renamed from: O */
    public int f3065O;

    /* renamed from: P */
    public boolean f3066P;

    /* renamed from: Q */
    public final float f3067Q;

    /* renamed from: R */
    public int f3068R;

    /* renamed from: S */
    public int f3069S;

    /* renamed from: T */
    public int f3070T;

    /* renamed from: U */
    public WeakReference f3071U;

    /* renamed from: V */
    public WeakReference f3072V;

    /* renamed from: W */
    public final ArrayList f3073W;

    /* renamed from: X */
    public VelocityTracker f3074X;

    /* renamed from: Y */
    public C0420g f3075Y;

    /* renamed from: Z */
    public int f3076Z;

    /* renamed from: a */
    public final int f3077a;

    /* renamed from: a0 */
    public int f3078a0;

    /* renamed from: b */
    public boolean f3079b;

    /* renamed from: b0 */
    public boolean f3080b0;

    /* renamed from: c */
    public final float f3081c;

    /* renamed from: c0 */
    public HashMap f3082c0;

    /* renamed from: d */
    public final int f3083d;

    /* renamed from: d0 */
    public final SparseIntArray f3084d0;

    /* renamed from: e */
    public int f3085e;

    /* renamed from: e0 */
    public final C0087e f3086e0;

    /* renamed from: f */
    public boolean f3087f;

    /* renamed from: g */
    public int f3088g;

    /* renamed from: h */
    public final int f3089h;

    /* renamed from: i */
    public final C0513g f3090i;

    /* renamed from: j */
    public final ColorStateList f3091j;

    /* renamed from: k */
    public final int f3092k;

    /* renamed from: l */
    public final int f3093l;

    /* renamed from: m */
    public int f3094m;

    /* renamed from: n */
    public final boolean f3095n;

    /* renamed from: o */
    public final boolean f3096o;

    /* renamed from: p */
    public final boolean f3097p;

    /* renamed from: q */
    public final boolean f3098q;

    /* renamed from: r */
    public final boolean f3099r;

    /* renamed from: s */
    public final boolean f3100s;

    /* renamed from: t */
    public final boolean f3101t;

    /* renamed from: u */
    public final boolean f3102u;

    /* renamed from: v */
    public int f3103v;

    /* renamed from: w */
    public int f3104w;

    /* renamed from: x */
    public final boolean f3105x;

    /* renamed from: y */
    public final C0517k f3106y;

    /* renamed from: z */
    public boolean f3107z;

    public BottomSheetBehavior() {
        this.f3077a = 0;
        this.f3079b = true;
        this.f3092k = -1;
        this.f3093l = -1;
        this.f3051A = new C0091i(this);
        this.f3056F = 0.5f;
        this.f3058H = -1.0f;
        this.f3061K = true;
        this.f3062L = 4;
        this.f3067Q = 0.1f;
        this.f3073W = new ArrayList();
        this.f3078a0 = -1;
        this.f3084d0 = new SparseIntArray();
        this.f3086e0 = new C0087e(this, 0);
    }

    /* renamed from: A */
    public static int m2038A(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    /* renamed from: z */
    public static View m2039z(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (AbstractC0230E.m633p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewM2039z = m2039z(viewGroup.getChildAt(i2));
            if (viewM2039z != null) {
                return viewM2039z;
            }
        }
        return null;
    }

    /* renamed from: B */
    public final int m2040B() {
        if (this.f3079b) {
            return this.f3054D;
        }
        return Math.max(this.f3053C, this.f3099r ? 0 : this.f3104w);
    }

    /* renamed from: C */
    public final int m2041C(int i2) {
        if (i2 == 3) {
            return m2040B();
        }
        if (i2 == 4) {
            return this.f3057G;
        }
        if (i2 == 5) {
            return this.f3070T;
        }
        if (i2 == 6) {
            return this.f3055E;
        }
        throw new IllegalArgumentException(AbstractC0075g.m236e("Invalid state to get top offset: ", i2));
    }

    /* renamed from: D */
    public final boolean m2042D() {
        WeakReference weakReference = this.f3071U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f3071U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void m2043E(int i2) {
        if (i2 == -1) {
            if (this.f3087f) {
                return;
            } else {
                this.f3087f = true;
            }
        } else {
            if (!this.f3087f && this.f3085e == i2) {
                return;
            }
            this.f3087f = false;
            this.f3085e = Math.max(0, i2);
        }
        m2051M();
    }

    /* renamed from: F */
    public final void m2044F(int i2) throws Resources.NotFoundException {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.f3059I || i2 != 5) {
            int i3 = (i2 == 6 && this.f3079b && m2041C(i2) <= this.f3054D) ? 3 : i2;
            WeakReference weakReference = this.f3071U;
            if (weakReference == null || weakReference.get() == null) {
                m2045G(i2);
                return;
            }
            View view = (View) this.f3071U.get();
            RunnableC0084b runnableC0084b = new RunnableC0084b(this, view, i3);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                if (view.isAttachedToWindow()) {
                    view.post(runnableC0084b);
                    return;
                }
            }
            runnableC0084b.run();
        }
    }

    /* renamed from: G */
    public final void m2045G(int i2) throws Resources.NotFoundException {
        if (this.f3062L == i2) {
            return;
        }
        this.f3062L = i2;
        if (i2 != 4 && i2 != 3 && i2 != 6) {
            boolean z2 = this.f3059I;
        }
        WeakReference weakReference = this.f3071U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            m2050L(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            m2050L(false);
        }
        m2049K(i2, true);
        ArrayList arrayList = this.f3073W;
        if (arrayList.size() <= 0) {
            m2048J();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: H */
    public final boolean m2046H(View view, float f) {
        if (this.f3060J) {
            return true;
        }
        if (view.getTop() < this.f3057G) {
            return false;
        }
        return Math.abs(((f * this.f3067Q) + ((float) view.getTop())) - ((float) this.f3057G)) / ((float) m2057x()) > 0.5f;
    }

    /* renamed from: I */
    public final void m2047I(View view, int i2, boolean z2) throws Resources.NotFoundException {
        int iM2041C = m2041C(i2);
        C0506e c0506e = this.f3063M;
        if (c0506e == null || (!z2 ? c0506e.m1268r(view, view.getLeft(), iM2041C) : c0506e.m1266p(view.getLeft(), iM2041C))) {
            m2045G(i2);
            return;
        }
        m2045G(2);
        m2049K(i2, true);
        this.f3051A.m283a(i2);
    }

    /* renamed from: J */
    public final void m2048J() throws Resources.NotFoundException {
        View view;
        int iM894a;
        WeakReference weakReference = this.f3071U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0241P.m698j(view, 524288);
        AbstractC0241P.m696h(view, 0);
        AbstractC0241P.m698j(view, 262144);
        AbstractC0241P.m696h(view, 0);
        AbstractC0241P.m698j(view, 1048576);
        AbstractC0241P.m696h(view, 0);
        SparseIntArray sparseIntArray = this.f3084d0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            AbstractC0241P.m698j(view, i2);
            AbstractC0241P.m696h(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f3079b && this.f3062L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0088f c0088f = new C0088f(this, 6);
            ArrayList arrayListM694f = AbstractC0241P.m694f(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListM694f.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = AbstractC0241P.f818d[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < arrayListM694f.size(); i7++) {
                            z2 &= ((C0336f) arrayListM694f.get(i7)).m894a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    iM894a = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0336f) arrayListM694f.get(i3)).f1079a).getLabel())) {
                        iM894a = ((C0336f) arrayListM694f.get(i3)).m894a();
                        break;
                    }
                    i3++;
                }
            }
            if (iM894a != -1) {
                C0336f c0336f = new C0336f(null, iM894a, string, c0088f, null);
                View.AccessibilityDelegate accessibilityDelegateM692d = AbstractC0241P.m692d(view);
                C0253b c0253b = accessibilityDelegateM692d == null ? null : accessibilityDelegateM692d instanceof C0251a ? ((C0251a) accessibilityDelegateM692d).f825a : new C0253b(accessibilityDelegateM692d);
                if (c0253b == null) {
                    c0253b = new C0253b();
                }
                AbstractC0241P.m701m(view, c0253b);
                AbstractC0241P.m698j(view, c0336f.m894a());
                AbstractC0241P.m694f(view).add(c0336f);
                AbstractC0241P.m696h(view, 0);
            }
            sparseIntArray.put(0, iM894a);
        }
        if (this.f3059I && this.f3062L != 5) {
            AbstractC0241P.m699k(view, C0336f.f1076l, new C0088f(this, 5));
        }
        int i8 = this.f3062L;
        if (i8 == 3) {
            AbstractC0241P.m699k(view, C0336f.f1075k, new C0088f(this, this.f3079b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            AbstractC0241P.m699k(view, C0336f.f1074j, new C0088f(this, this.f3079b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            AbstractC0241P.m699k(view, C0336f.f1075k, new C0088f(this, 4));
            AbstractC0241P.m699k(view, C0336f.f1074j, new C0088f(this, 3));
        }
    }

    /* renamed from: K */
    public final void m2049K(int i2, boolean z2) {
        C0513g c0513g = this.f3090i;
        ValueAnimator valueAnimator = this.f3052B;
        if (i2 == 2) {
            return;
        }
        boolean z3 = this.f3062L == 3 && (this.f3105x || m2042D());
        if (this.f3107z == z3 || c0513g == null) {
            return;
        }
        this.f3107z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c0513g.f1601a.f1592i, z3 ? m2056w() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM2056w = this.f3107z ? m2056w() : 1.0f;
        C0512f c0512f = c0513g.f1601a;
        if (c0512f.f1592i != fM2056w) {
            c0512f.f1592i = fM2056w;
            c0513g.f1605e = true;
            c0513g.invalidateSelf();
        }
    }

    /* renamed from: L */
    public final void m2050L(boolean z2) {
        WeakReference weakReference = this.f3071U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f3082c0 != null) {
                    return;
                } else {
                    this.f3082c0 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.f3071U.get() && z2) {
                    this.f3082c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f3082c0 = null;
        }
    }

    /* renamed from: M */
    public final void m2051M() {
        View view;
        if (this.f3071U != null) {
            m2055v();
            if (this.f3062L != 4 || (view = (View) this.f3071U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: a */
    public final void mo1085a() throws Resources.NotFoundException {
        int i2 = 1;
        C0420g c0420g = this.f3075Y;
        if (c0420g == null) {
            return;
        }
        C0636b c0636b = c0420g.f1297f;
        c0420g.f1297f = null;
        if (c0636b == null || Build.VERSION.SDK_INT < 34) {
            m2044F(this.f3059I ? 5 : 4);
            return;
        }
        boolean z2 = this.f3059I;
        int i3 = c0420g.f1295d;
        int i4 = c0420g.f1294c;
        float f = c0636b.f1981c;
        if (!z2) {
            AnimatorSet animatorSetM1092a = c0420g.m1092a();
            animatorSetM1092a.setDuration(AbstractC1400a.m3166c(i4, i3, f));
            animatorSetM1092a.start();
            m2044F(4);
            return;
        }
        C0002a c0002a = new C0002a(i2, this);
        View view = c0420g.f1293b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new C0603a(1));
        objectAnimatorOfFloat.setDuration(AbstractC1400a.m3166c(i4, i3, f));
        objectAnimatorOfFloat.addListener(new C0002a(3, c0420g));
        objectAnimatorOfFloat.addListener(c0002a);
        objectAnimatorOfFloat.start();
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: b */
    public final void mo1086b(C0636b c0636b) {
        C0420g c0420g = this.f3075Y;
        if (c0420g == null) {
            return;
        }
        c0420g.f1297f = c0636b;
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: c */
    public final void mo1087c(C0636b c0636b) {
        C0420g c0420g = this.f3075Y;
        if (c0420g == null) {
            return;
        }
        C0636b c0636b2 = c0420g.f1297f;
        c0420g.f1297f = c0636b;
        if (c0636b2 == null) {
            return;
        }
        c0420g.m1093b(c0636b.f1981c);
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: d */
    public final void mo1088d() {
        C0420g c0420g = this.f3075Y;
        if (c0420g == null) {
            return;
        }
        C0636b c0636b = c0420g.f1297f;
        c0420g.f1297f = null;
        if (c0636b == null) {
            return;
        }
        AnimatorSet animatorSetM1092a = c0420g.m1092a();
        animatorSetM1092a.setDuration(c0420g.f1296e);
        animatorSetM1092a.start();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: g */
    public final void mo2052g(C1391d c1391d) {
        this.f3071U = null;
        this.f3063M = null;
        this.f3075Y = null;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: i */
    public final void mo2053i() {
        this.f3071U = null;
        this.f3063M = null;
        this.f3075Y = null;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: j */
    public final boolean mo2021j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i2;
        C0506e c0506e;
        if (!view.isShown() || !this.f3061K) {
            this.f3064N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3076Z = -1;
            this.f3078a0 = -1;
            VelocityTracker velocityTracker = this.f3074X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3074X = null;
            }
        }
        if (this.f3074X == null) {
            this.f3074X = VelocityTracker.obtain();
        }
        this.f3074X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f3078a0 = (int) motionEvent.getY();
            if (this.f3062L != 2) {
                WeakReference weakReference = this.f3072V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m1558n(view2, x2, this.f3078a0)) {
                    this.f3076Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f3080b0 = true;
                }
            }
            this.f3064N = this.f3076Z == -1 && !coordinatorLayout.m1558n(view, x2, this.f3078a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3080b0 = false;
            this.f3076Z = -1;
            if (this.f3064N) {
                this.f3064N = false;
                return false;
            }
        }
        if (this.f3064N || (c0506e = this.f3063M) == null || !c0506e.m1267q(motionEvent)) {
            WeakReference weakReference2 = this.f3072V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f3064N || this.f3062L == 1 || coordinatorLayout.m1558n(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f3063M == null || (i2 = this.f3078a0) == -1 || Math.abs(i2 - motionEvent.getY()) <= this.f3063M.f1557b) {
                return false;
            }
        }
        return true;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: k */
    public final boolean mo2022k(CoordinatorLayout coordinatorLayout, View view, int i2) throws Resources.NotFoundException {
        int i3 = this.f3093l;
        C0513g c0513g = this.f3090i;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f3071U == null) {
            this.f3088g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f3095n || this.f3087f) ? false : true;
            if (this.f3096o || this.f3097p || this.f3098q || this.f3100s || this.f3101t || this.f3102u || z2) {
                C0086d c0086d = new C0086d(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0371D c0371d = new C0371D();
                c0371d.f1138a = paddingStart;
                c0371d.f1139b = paddingEnd;
                c0371d.f1140c = paddingBottom;
                AbstractC0230E.m638u(view, new C0019a(c0086d, 7, c0371d));
                if (view.isAttachedToWindow()) {
                    AbstractC0228C.m617c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0370C());
                }
            }
            C0257d c0257d = new C0257d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new C0260e0(c0257d));
            } else {
                PathInterpolator pathInterpolator = C0258d0.f845e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0256c0 = new ViewOnApplyWindowInsetsListenerC0256c0(view, c0257d);
                view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0256c0);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0256c0);
                }
            }
            this.f3071U = new WeakReference(view);
            this.f3075Y = new C0420g(view);
            if (c0513g != null) {
                view.setBackground(c0513g);
                float fM626i = this.f3058H;
                if (fM626i == -1.0f) {
                    fM626i = AbstractC0230E.m626i(view);
                }
                c0513g.m1289i(fM626i);
            } else {
                ColorStateList colorStateList = this.f3091j;
                if (colorStateList != null) {
                    AbstractC0230E.m634q(view, colorStateList);
                }
            }
            m2048J();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f3063M == null) {
            this.f3063M = new C0506e(coordinatorLayout.getContext(), coordinatorLayout, this.f3086e0);
        }
        int top = view.getTop();
        coordinatorLayout.m1560p(view, i2);
        this.f3069S = coordinatorLayout.getWidth();
        this.f3070T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f3068R = height;
        int iMin = this.f3070T;
        int i5 = iMin - height;
        int i6 = this.f3104w;
        if (i5 < i6) {
            if (this.f3099r) {
                if (i3 != -1) {
                    iMin = Math.min(iMin, i3);
                }
                this.f3068R = iMin;
            } else {
                int iMin2 = iMin - i6;
                if (i3 != -1) {
                    iMin2 = Math.min(iMin2, i3);
                }
                this.f3068R = iMin2;
            }
        }
        this.f3054D = Math.max(0, this.f3070T - this.f3068R);
        this.f3055E = (int) ((1.0f - this.f3056F) * this.f3070T);
        m2055v();
        int i7 = this.f3062L;
        if (i7 == 3) {
            view.offsetTopAndBottom(m2040B());
        } else if (i7 == 6) {
            view.offsetTopAndBottom(this.f3055E);
        } else if (this.f3059I && i7 == 5) {
            view.offsetTopAndBottom(this.f3070T);
        } else if (i7 == 4) {
            view.offsetTopAndBottom(this.f3057G);
        } else if (i7 == 1 || i7 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m2049K(this.f3062L, false);
        this.f3072V = new WeakReference(m2039z(view));
        ArrayList arrayList = this.f3073W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: l */
    public final boolean mo2023l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m2038A(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f3092k, marginLayoutParams.width), m2038A(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f3093l, marginLayoutParams.height));
        return true;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: m */
    public final boolean mo2054m(View view) {
        WeakReference weakReference = this.f3072V;
        return (weakReference == null || view != weakReference.get() || this.f3062L == 3) ? false : true;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: n */
    public final void mo2024n(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) throws Resources.NotFoundException {
        boolean z2 = this.f3061K;
        if (i4 == 1) {
            return;
        }
        WeakReference weakReference = this.f3072V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < m2040B()) {
                int iM2040B = top - m2040B();
                iArr[1] = iM2040B;
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                view.offsetTopAndBottom(-iM2040B);
                m2045G(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i3;
                WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                view.offsetTopAndBottom(-i3);
                m2045G(1);
            }
        } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f3057G;
            if (i5 > i6 && !this.f3059I) {
                int i7 = top - i6;
                iArr[1] = i7;
                WeakHashMap weakHashMap3 = AbstractC0241P.f815a;
                view.offsetTopAndBottom(-i7);
                m2045G(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i3;
                WeakHashMap weakHashMap4 = AbstractC0241P.f815a;
                view.offsetTopAndBottom(-i3);
                m2045G(1);
            }
        }
        m2058y(view.getTop());
        this.f3065O = i3;
        this.f3066P = true;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: o */
    public final void mo2025o(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: q */
    public final void mo2026q(View view, Parcelable parcelable) {
        C0090h c0090h = (C0090h) parcelable;
        int i2 = this.f3077a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f3085e = c0090h.f211d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f3079b = c0090h.f212e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.f3059I = c0090h.f213f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.f3060J = c0090h.f214g;
            }
        }
        int i3 = c0090h.f210c;
        if (i3 == 1 || i3 == 2) {
            this.f3062L = 4;
        } else {
            this.f3062L = i3;
        }
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: r */
    public final Parcelable mo2027r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C0090h(this);
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: s */
    public final boolean mo2028s(View view, int i2, int i3) {
        this.f3065O = 0;
        this.f3066P = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // p144x.AbstractC1388a
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2029t(android.view.View r4, android.view.View r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.m2040B()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.m2045G(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f3072V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f3066P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f3065O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f3079b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f3055E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f3059I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f3074X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f3081c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f3074X
            int r0 = r3.f3076Z
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.m2046H(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f3065O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f3079b
            if (r2 == 0) goto L74
            int r6 = r3.f3054D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f3057G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f3055E
            if (r5 >= r2) goto L83
            int r0 = r3.f3057G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f3057G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f3079b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f3055E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f3057G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.m2047I(r4, r1, r5)
            r3.f3066P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2029t(android.view.View, android.view.View, int):void");
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: u */
    public final boolean mo2030u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f3062L;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        C0506e c0506e = this.f3063M;
        if (c0506e != null && (this.f3061K || i2 == 1)) {
            c0506e.m1260j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f3076Z = -1;
            this.f3078a0 = -1;
            VelocityTracker velocityTracker = this.f3074X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3074X = null;
            }
        }
        if (this.f3074X == null) {
            this.f3074X = VelocityTracker.obtain();
        }
        this.f3074X.addMovement(motionEvent);
        if (this.f3063M != null && ((this.f3061K || this.f3062L == 1) && actionMasked == 2 && !this.f3064N)) {
            float fAbs = Math.abs(this.f3078a0 - motionEvent.getY());
            C0506e c0506e2 = this.f3063M;
            if (fAbs > c0506e2.f1557b) {
                c0506e2.m1252b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3064N;
    }

    /* renamed from: v */
    public final void m2055v() {
        int iM2057x = m2057x();
        if (this.f3079b) {
            this.f3057G = Math.max(this.f3070T - iM2057x, this.f3054D);
        } else {
            this.f3057G = this.f3070T - iM2057x;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m2056w() {
        /*
            r5 = this;
            T0.g r0 = r5.f3090i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f3071U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f3071U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.m2042D()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            T0.g r2 = r5.f3090i
            T0.f r3 = r2.f1601a
            T0.k r3 = r3.f1584a
            T0.c r3 = r3.f1640e
            android.graphics.RectF r2 = r2.m1286f()
            float r2 = r3.mo1270a(r2)
            android.view.RoundedCorner r3 = p007C0.AbstractC0083a.m272h(r0)
            if (r3 == 0) goto L4e
            int r3 = p007C0.AbstractC0083a.m267c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            T0.g r2 = r5.f3090i
            T0.f r4 = r2.f1601a
            T0.k r4 = r4.f1584a
            T0.c r4 = r4.f1641f
            android.graphics.RectF r2 = r2.m1286f()
            float r2 = r4.mo1270a(r2)
            android.view.RoundedCorner r0 = p007C0.AbstractC0083a.m277m(r0)
            if (r0 == 0) goto L74
            int r0 = p007C0.AbstractC0083a.m267c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m2056w():float");
    }

    /* renamed from: x */
    public final int m2057x() {
        int i2;
        return this.f3087f ? Math.min(Math.max(this.f3088g, this.f3070T - ((this.f3069S * 9) / 16)), this.f3068R) + this.f3103v : (this.f3095n || this.f3096o || (i2 = this.f3094m) <= 0) ? this.f3085e + this.f3103v : Math.max(this.f3085e, i2 + this.f3089h);
    }

    /* renamed from: y */
    public final void m2058y(int i2) {
        if (((View) this.f3071U.get()) != null) {
            ArrayList arrayList = this.f3073W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = this.f3057G;
            if (i2 <= i3 && i3 != m2040B()) {
                m2040B();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i2;
        int i3 = 0;
        this.f3077a = 0;
        this.f3079b = true;
        this.f3092k = -1;
        this.f3093l = -1;
        this.f3051A = new C0091i(this);
        this.f3056F = 0.5f;
        this.f3058H = -1.0f;
        this.f3061K = true;
        this.f3062L = 4;
        this.f3067Q = 0.1f;
        this.f3073W = new ArrayList();
        this.f3078a0 = -1;
        this.f3084d0 = new SparseIntArray();
        this.f3086e0 = new C0087e(this, i3);
        this.f3089h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1395a.f6032a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f3091j = AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f3106y = C0517k.m1297b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m1295a();
        }
        C0517k c0517k = this.f3106y;
        if (c0517k != null) {
            C0513g c0513g = new C0513g(c0517k);
            this.f3090i = c0513g;
            c0513g.m1288h(context);
            ColorStateList colorStateList = this.f3091j;
            if (colorStateList != null) {
                this.f3090i.m1290j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3090i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m2056w(), 1.0f);
        this.f3052B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f3052B.addUpdateListener(new C0085c(i3, this));
        this.f3058H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f3092k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f3093l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            m2043E(i2);
        } else {
            m2043E(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f3059I != z2) {
            this.f3059I = z2;
            if (!z2 && this.f3062L == 5) {
                m2044F(4);
            }
            m2048J();
        }
        this.f3095n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f3079b != z3) {
            this.f3079b = z3;
            if (this.f3071U != null) {
                m2055v();
            }
            m2045G((this.f3079b && this.f3062L == 6) ? 3 : this.f3062L);
            m2049K(this.f3062L, true);
            m2048J();
        }
        this.f3060J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f3061K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f3077a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f3056F = f;
            if (this.f3071U != null) {
                this.f3055E = (int) ((1.0f - f) * this.f3070T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i4 = typedValuePeekValue2.data;
                if (i4 >= 0) {
                    this.f3053C = i4;
                    m2049K(this.f3062L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f3053C = dimensionPixelOffset;
                    m2049K(this.f3062L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f3083d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f3096o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f3097p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f3098q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f3099r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f3100s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f3101t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f3102u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f3105x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f3081c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
