package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p009D.AbstractC0099b;
import p011D1.C0121k;
import p025J.C0215b;
import p028K.AbstractC0228C;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p028K.C0281p;
import p028K.C0292u0;
import p028K.InterfaceC0277n;
import p028K.InterfaceC0279o;
import p035M0.C0369B;
import p080b1.C0770h;
import p119o.C1249k;
import p141w.AbstractC1381a;
import p144x.AbstractC1388a;
import p144x.AbstractC1394g;
import p144x.C1391d;
import p144x.C1393f;
import p144x.InterfaceC1389b;
import p144x.ViewGroupOnHierarchyChangeListenerC1390c;
import p144x.ViewTreeObserverOnPreDrawListenerC1392e;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0277n, InterfaceC0279o {

    /* renamed from: t */
    public static final String f2277t;

    /* renamed from: u */
    public static final Class[] f2278u;

    /* renamed from: v */
    public static final ThreadLocal f2279v;

    /* renamed from: w */
    public static final C0369B f2280w;

    /* renamed from: x */
    public static final C0215b f2281x;

    /* renamed from: a */
    public final ArrayList f2282a;

    /* renamed from: b */
    public final C0121k f2283b;

    /* renamed from: c */
    public final ArrayList f2284c;

    /* renamed from: d */
    public final ArrayList f2285d;

    /* renamed from: e */
    public final int[] f2286e;

    /* renamed from: f */
    public final int[] f2287f;

    /* renamed from: g */
    public boolean f2288g;

    /* renamed from: h */
    public boolean f2289h;

    /* renamed from: i */
    public final int[] f2290i;

    /* renamed from: j */
    public View f2291j;

    /* renamed from: k */
    public View f2292k;

    /* renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC1392e f2293l;

    /* renamed from: m */
    public boolean f2294m;

    /* renamed from: n */
    public C0292u0 f2295n;

    /* renamed from: o */
    public boolean f2296o;

    /* renamed from: p */
    public Drawable f2297p;

    /* renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f2298q;

    /* renamed from: r */
    public C0770h f2299r;

    /* renamed from: s */
    public final C0281p f2300s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2277t = r02 != null ? r02.getName() : null;
        f2280w = new C0369B(4);
        f2278u = new Class[]{Context.class, AttributeSet.class};
        f2279v = new ThreadLocal();
        f2281x = new C0215b();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f2282a = new ArrayList();
        this.f2283b = new C0121k(6);
        this.f2284c = new ArrayList();
        this.f2285d = new ArrayList();
        this.f2286e = new int[2];
        this.f2287f = new int[2];
        this.f2300s = new C0281p();
        int[] iArr = AbstractC1381a.f5997a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f2290i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f2290i[i2] = (int) (r2[i2] * f);
            }
        }
        this.f2297p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m1564v();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1390c(this));
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: g */
    public static Rect m1549g() {
        Rect rect = (Rect) f2281x.mo564a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: l */
    public static void m1550l(int i2, Rect rect, Rect rect2, C1391d c1391d, int i3, int i4) {
        int i5 = c1391d.f6010c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = c1391d.f6011d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int iWidth = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            iWidth -= i3 / 2;
        } else if (i7 != 5) {
            iWidth -= i3;
        }
        if (i8 == 16) {
            iHeight -= i4 / 2;
        } else if (i8 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    /* renamed from: m */
    public static C1391d m1551m(View view) {
        C1391d c1391d = (C1391d) view.getLayoutParams();
        if (!c1391d.f6009b) {
            InterfaceC1389b interfaceC1389b = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC1389b = (InterfaceC1389b) superclass.getAnnotation(InterfaceC1389b.class);
                if (interfaceC1389b != null) {
                    break;
                }
            }
            if (interfaceC1389b != null) {
                try {
                    AbstractC1388a abstractC1388a = (AbstractC1388a) interfaceC1389b.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    AbstractC1388a abstractC1388a2 = c1391d.f6008a;
                    if (abstractC1388a2 != abstractC1388a) {
                        if (abstractC1388a2 != null) {
                            abstractC1388a2.mo2053i();
                        }
                        c1391d.f6008a = abstractC1388a;
                        c1391d.f6009b = true;
                        if (abstractC1388a != null) {
                            abstractC1388a.mo2052g(c1391d);
                        }
                    }
                } catch (Exception unused) {
                    interfaceC1389b.value().getClass();
                }
            }
            c1391d.f6009b = true;
        }
        return c1391d;
    }

    /* renamed from: t */
    public static void m1552t(View view, int i2) {
        C1391d c1391d = (C1391d) view.getLayoutParams();
        int i3 = c1391d.f6016i;
        if (i3 != i2) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            view.offsetLeftAndRight(i2 - i3);
            c1391d.f6016i = i2;
        }
    }

    /* renamed from: u */
    public static void m1553u(View view, int i2) {
        C1391d c1391d = (C1391d) view.getLayoutParams();
        int i3 = c1391d.f6017j;
        if (i3 != i2) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            view.offsetTopAndBottom(i2 - i3);
            c1391d.f6017j = i2;
        }
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: a */
    public final void mo783a(View view, View view2, int i2, int i3) {
        C0281p c0281p = this.f2300s;
        if (i3 == 1) {
            c0281p.f899b = i2;
        } else {
            c0281p.f898a = i2;
        }
        this.f2292k = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((C1391d) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // p028K.InterfaceC0279o
    /* renamed from: b */
    public final void mo801b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        AbstractC1388a abstractC1388a;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1391d c1391d = (C1391d) childAt.getLayoutParams();
                if (c1391d.m3162a(i6) && (abstractC1388a = c1391d.f6008a) != null) {
                    int[] iArr2 = this.f2286e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1388a.mo2025o(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            m1559o(1);
        }
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: c */
    public final void mo784c(View view, int i2, int i3, int i4, int i5, int i6) {
        mo801b(view, i2, i3, i4, i5, 0, this.f2287f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1391d) && super.checkLayoutParams(layoutParams);
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: d */
    public final void mo785d(View view, int i2) {
        C0281p c0281p = this.f2300s;
        if (i2 == 1) {
            c0281p.f899b = 0;
        } else {
            c0281p.f898a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C1391d c1391d = (C1391d) childAt.getLayoutParams();
            if (c1391d.m3162a(i2)) {
                AbstractC1388a abstractC1388a = c1391d.f6008a;
                if (abstractC1388a != null) {
                    abstractC1388a.mo2029t(childAt, view, i2);
                }
                if (i2 == 0) {
                    c1391d.f6020m = false;
                } else if (i2 == 1) {
                    c1391d.f6021n = false;
                }
            }
        }
        this.f2292k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC1388a abstractC1388a = ((C1391d) view.getLayoutParams()).f6008a;
        if (abstractC1388a != null) {
            abstractC1388a.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2297p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: e */
    public final void mo786e(View view, int i2, int i3, int[] iArr, int i4) {
        AbstractC1388a abstractC1388a;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1391d c1391d = (C1391d) childAt.getLayoutParams();
                if (c1391d.m3162a(i4) && (abstractC1388a = c1391d.f6008a) != null) {
                    int[] iArr2 = this.f2286e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1388a.mo2024n(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            m1559o(1);
        }
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: f */
    public final boolean mo787f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1391d c1391d = (C1391d) childAt.getLayoutParams();
                AbstractC1388a abstractC1388a = c1391d.f6008a;
                if (abstractC1388a != null) {
                    boolean zMo2028s = abstractC1388a.mo2028s(childAt, i2, i3);
                    z2 |= zMo2028s;
                    if (i3 == 0) {
                        c1391d.f6020m = zMo2028s;
                    } else if (i3 == 1) {
                        c1391d.f6021n = zMo2028s;
                    }
                } else if (i3 == 0) {
                    c1391d.f6020m = false;
                } else if (i3 == 1) {
                    c1391d.f6021n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1391d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1391d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m1562r();
        return Collections.unmodifiableList(this.f2282a);
    }

    public final C0292u0 getLastWindowInsets() {
        return this.f2295n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0281p c0281p = this.f2300s;
        return c0281p.f899b | c0281p.f898a;
    }

    public Drawable getStatusBarBackground() {
        return this.f2297p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final void m1554h(C1391d c1391d, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1391d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) c1391d).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1391d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) c1391d).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    /* renamed from: i */
    public final void m1555i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            m1557k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: j */
    public final ArrayList m1556j(View view) {
        C1249k c1249k = (C1249k) this.f2283b.f353b;
        int i2 = c1249k.f5058c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) c1249k.m2914j(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1249k.m2912h(i3));
            }
        }
        ArrayList arrayList3 = this.f2285d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* renamed from: k */
    public final void m1557k(Rect rect, View view) {
        ThreadLocal threadLocal = AbstractC1394g.f6025a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC1394g.f6025a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC1394g.m3163a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC1394g.f6026b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: n */
    public final boolean m1558n(View view, int i2, int i3) {
        C0215b c0215b = f2281x;
        Rect rectM1549g = m1549g();
        m1557k(rectM1549g, view);
        try {
            return rectM1549g.contains(i2, i3);
        } finally {
            rectM1549g.setEmpty();
            c0215b.mo566c(rectM1549g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0047 A[EDGE_INSN: B:133:0x0047->B:10:0x0047 BREAK  A[LOOP:2: B:119:0x02ad->B:124:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1559o(int r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1559o(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1563s(false);
        if (this.f2294m) {
            if (this.f2293l == null) {
                this.f2293l = new ViewTreeObserverOnPreDrawListenerC1392e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2293l);
        }
        if (this.f2295n == null) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            if (getFitsSystemWindows()) {
                AbstractC0228C.m617c(this);
            }
        }
        this.f2289h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1563s(false);
        if (this.f2294m && this.f2293l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2293l);
        }
        View view = this.f2292k;
        if (view != null) {
            mo785d(view, 0);
        }
        this.f2289h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2296o || this.f2297p == null) {
            return;
        }
        C0292u0 c0292u0 = this.f2295n;
        int iM821d = c0292u0 != null ? c0292u0.m821d() : 0;
        if (iM821d > 0) {
            this.f2297p.setBounds(0, 0, getWidth(), iM821d);
            this.f2297p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1563s(true);
        }
        boolean zM1561q = m1561q(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM1561q;
        }
        m1563s(true);
        return zM1561q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        AbstractC1388a abstractC1388a;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f2282a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((abstractC1388a = ((C1391d) view.getLayoutParams()).f6008a) == null || !abstractC1388a.mo2022k(this, view, layoutDirection))) {
                m1560p(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C1391d c1391d = (C1391d) childAt.getLayoutParams();
                if (c1391d.m3162a(0)) {
                    AbstractC1388a abstractC1388a = c1391d.f6008a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC1388a abstractC1388a;
        int childCount = getChildCount();
        boolean zMo2054m = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C1391d c1391d = (C1391d) childAt.getLayoutParams();
                if (c1391d.m3162a(0) && (abstractC1388a = c1391d.f6008a) != null) {
                    zMo2054m |= abstractC1388a.mo2054m(view);
                }
            }
        }
        return zMo2054m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        mo786e(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        mo784c(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        mo783a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1393f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1393f c1393f = (C1393f) parcelable;
        super.onRestoreInstanceState(c1393f.f1521a);
        SparseArray sparseArray = c1393f.f6024c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC1388a abstractC1388a = m1551m(childAt).f6008a;
            if (id != -1 && abstractC1388a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC1388a.mo2026q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo2027r;
        C1393f c1393f = new C1393f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC1388a abstractC1388a = ((C1391d) childAt.getLayoutParams()).f6008a;
            if (id != -1 && abstractC1388a != null && (parcelableMo2027r = abstractC1388a.mo2027r(childAt)) != null) {
                sparseArray.append(id, parcelableMo2027r);
            }
        }
        c1393f.f6024c = sparseArray;
        return c1393f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo787f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo785d(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f2291j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m1561q(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f2291j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            x.d r6 = (p144x.C1391d) r6
            x.a r6 = r6.f6008a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f2291j
            boolean r6 = r6.mo2030u(r7, r1)
        L2a:
            android.view.View r7 = r0.f2291j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.m1563s(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1560p(android.view.View r13, int r14) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1560p(android.view.View, int):void");
    }

    /* renamed from: q */
    public final boolean m1561q(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f2284c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        C0369B c0369b = f2280w;
        if (c0369b != null) {
            Collections.sort(arrayList, c0369b);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo2021j = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            AbstractC1388a abstractC1388a = ((C1391d) view.getLayoutParams()).f6008a;
            if (zMo2021j && actionMasked != 0) {
                if (abstractC1388a != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 == 0) {
                        abstractC1388a.mo2021j(this, view, motionEventObtain);
                    } else if (i2 == 1) {
                        abstractC1388a.mo2030u(view, motionEventObtain);
                    }
                }
            } else if (!zMo2021j && abstractC1388a != null) {
                if (i2 == 0) {
                    zMo2021j = abstractC1388a.mo2021j(this, view, motionEvent);
                } else if (i2 == 1) {
                    zMo2021j = abstractC1388a.mo2030u(view, motionEvent);
                }
                if (zMo2021j) {
                    this.f2291j = view;
                }
            }
        }
        arrayList.clear();
        return zMo2021j;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1562r() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1562r():void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC1388a abstractC1388a = ((C1391d) view.getLayoutParams()).f6008a;
        if (abstractC1388a != null) {
            abstractC1388a.mo2034p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f2288g) {
            return;
        }
        m1563s(false);
        this.f2288g = true;
    }

    /* renamed from: s */
    public final void m1563s(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC1388a abstractC1388a = ((C1391d) childAt.getLayoutParams()).f6008a;
            if (abstractC1388a != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC1388a.mo2021j(this, childAt, motionEventObtain);
                } else {
                    abstractC1388a.mo2030u(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C1391d) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.f2291j = null;
        this.f2288g = false;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        m1564v();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2298q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2297p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f2297p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f2297p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f2297p;
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                AbstractC0099b.m303b(drawable3, getLayoutDirection());
                this.f2297p.setVisible(getVisibility() == 0, false);
                this.f2297p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? AbstractC0000a.m1b(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f2297p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f2297p.setVisible(z2, false);
    }

    /* renamed from: v */
    public final void m1564v() {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (!getFitsSystemWindows()) {
            AbstractC0230E.m638u(this, null);
            return;
        }
        if (this.f2299r == null) {
            this.f2299r = new C0770h(this);
        }
        AbstractC0230E.m638u(this, this.f2299r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2297p;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1391d ? new C1391d((C1391d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1391d((ViewGroup.MarginLayoutParams) layoutParams) : new C1391d(layoutParams);
    }
}
