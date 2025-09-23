package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p001A0.C0004c;
import p006C.C0072d;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p028K.C0292u0;
import p031L.C0336f;
import p045Q.C0444h;
import p054T.C0506e;
import p057U.AbstractC0533a;
import p060V.C0540b;
import p060V.C0542d;
import p060V.C0543e;
import p060V.C0544f;
import p060V.InterfaceC0541c;
import p060V.ViewOnApplyWindowInsetsListenerC0539a;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: D */
    public static final int[] f2348D = {R.attr.colorPrimaryDark};

    /* renamed from: E */
    public static final int[] f2349E = {R.attr.layout_gravity};

    /* renamed from: F */
    public static final boolean f2350F;

    /* renamed from: G */
    public static final boolean f2351G;

    /* renamed from: H */
    public static final boolean f2352H;

    /* renamed from: A */
    public Rect f2353A;

    /* renamed from: B */
    public Matrix f2354B;

    /* renamed from: C */
    public final C0004c f2355C;

    /* renamed from: a */
    public final C0444h f2356a;

    /* renamed from: b */
    public float f2357b;

    /* renamed from: c */
    public final int f2358c;

    /* renamed from: d */
    public int f2359d;

    /* renamed from: e */
    public float f2360e;

    /* renamed from: f */
    public final Paint f2361f;

    /* renamed from: g */
    public final C0506e f2362g;

    /* renamed from: h */
    public final C0506e f2363h;

    /* renamed from: i */
    public final C0544f f2364i;

    /* renamed from: j */
    public final C0544f f2365j;

    /* renamed from: k */
    public int f2366k;

    /* renamed from: l */
    public boolean f2367l;

    /* renamed from: m */
    public boolean f2368m;

    /* renamed from: n */
    public int f2369n;

    /* renamed from: o */
    public int f2370o;

    /* renamed from: p */
    public int f2371p;

    /* renamed from: q */
    public int f2372q;

    /* renamed from: r */
    public boolean f2373r;

    /* renamed from: s */
    public InterfaceC0541c f2374s;

    /* renamed from: t */
    public ArrayList f2375t;

    /* renamed from: u */
    public float f2376u;

    /* renamed from: v */
    public float f2377v;

    /* renamed from: w */
    public Drawable f2378w;

    /* renamed from: x */
    public WindowInsets f2379x;

    /* renamed from: y */
    public boolean f2380y;

    /* renamed from: z */
    public final ArrayList f2381z;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f2350F = true;
        f2351G = true;
        f2352H = i2 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.drawerLayoutStyle);
        this.f2356a = new C0444h(1);
        this.f2359d = -1728053248;
        this.f2361f = new Paint();
        this.f2368m = true;
        this.f2369n = 3;
        this.f2370o = 3;
        this.f2371p = 3;
        this.f2372q = 3;
        this.f2355C = new C0004c(19, this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f2358c = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C0544f c0544f = new C0544f(this, 3);
        this.f2364i = c0544f;
        C0544f c0544f2 = new C0544f(this, 5);
        this.f2365j = c0544f2;
        C0506e c0506e = new C0506e(getContext(), this, c0544f);
        c0506e.f1557b = (int) (c0506e.f1557b * 1.0f);
        this.f2362g = c0506e;
        c0506e.f1572q = 1;
        c0506e.f1569n = f2;
        c0544f.f1718d = c0506e;
        C0506e c0506e2 = new C0506e(getContext(), this, c0544f2);
        c0506e2.f1557b = (int) (1.0f * c0506e2.f1557b);
        this.f2363h = c0506e2;
        c0506e2.f1572q = 2;
        c0506e2.f1569n = f2;
        c0544f2.f1718d = c0506e2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        setImportantForAccessibility(1);
        AbstractC0241P.m701m(this, new C0540b(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0539a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f2348D);
            try {
                this.f2378w = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0533a.f1694a, tkbmmn.ghwbbf.irvjzy.R.attr.drawerLayoutStyle, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f2357b = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f2357b = getResources().getDimension(tkbmmn.ghwbbf.irvjzy.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f2381z = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: l */
    public static String m1582l(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    /* renamed from: m */
    public static boolean m1583m(View view) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    /* renamed from: n */
    public static boolean m1584n(View view) {
        return ((C0542d) view.getLayoutParams()).f1708a == 0;
    }

    /* renamed from: o */
    public static boolean m1585o(View view) {
        if (m1586p(view)) {
            return (((C0542d) view.getLayoutParams()).f1711d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: p */
    public static boolean m1586p(View view) {
        int i2 = ((C0542d) view.getLayoutParams()).f1708a;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* renamed from: q */
    public static boolean m1587q(View view) {
        if (m1586p(view)) {
            return ((C0542d) view.getLayoutParams()).f1709b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: a */
    public final void m1588a(InterfaceC0541c interfaceC0541c) {
        if (interfaceC0541c == null) {
            return;
        }
        if (this.f2375t == null) {
            this.f2375t = new ArrayList();
        }
        this.f2375t.add(interfaceC0541c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            arrayList2 = this.f2381z;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!m1586p(childAt)) {
                arrayList2.add(childAt);
            } else if (m1585o(childAt)) {
                childAt.addFocusables(arrayList, i2, i3);
                z2 = true;
            }
            i4++;
        }
        if (!z2) {
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) arrayList2.get(i5);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i2, i3);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (m1594g() != null || m1586p(view)) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
            view.setImportantForAccessibility(1);
        }
        if (f2350F) {
            return;
        }
        AbstractC0241P.m701m(view, this.f2356a);
    }

    /* renamed from: b */
    public final boolean m1589b(View view, int i2) {
        return (m1598k(view) & i2) == i2;
    }

    /* renamed from: c */
    public final void m1590c(View view, boolean z2) {
        if (!m1586p(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0542d c0542d = (C0542d) view.getLayoutParams();
        if (this.f2368m) {
            c0542d.f1709b = 0.0f;
            c0542d.f1711d = 0;
        } else if (z2) {
            c0542d.f1711d |= 4;
            if (m1589b(view, 3)) {
                this.f2362g.m1268r(view, -view.getWidth(), view.getTop());
            } else {
                this.f2363h.m1268r(view, getWidth(), view.getTop());
            }
        } else {
            float f = ((C0542d) view.getLayoutParams()).f1709b;
            float width = view.getWidth();
            int i2 = ((int) (width * 0.0f)) - ((int) (f * width));
            if (!m1589b(view, 3)) {
                i2 = -i2;
            }
            view.offsetLeftAndRight(i2);
            m1602u(view, 0.0f);
            m1605x(view, 0);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0542d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            fMax = Math.max(fMax, ((C0542d) getChildAt(i2).getLayoutParams()).f1709b);
        }
        this.f2360e = fMax;
        boolean zM1257g = this.f2362g.m1257g();
        boolean zM1257g2 = this.f2363h.m1257g();
        if (zM1257g || zM1257g2) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: d */
    public final void m1591d() {
        View viewM1593f = m1593f(8388611);
        if (viewM1593f != null) {
            m1590c(viewM1593f, true);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + m1582l(8388611));
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2360e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (this.f2353A == null) {
                this.f2353A = new Rect();
            }
            childAt.getHitRect(this.f2353A);
            if (this.f2353A.contains((int) x2, (int) y2) && !m1584n(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f2354B == null) {
                            this.f2354B = new Matrix();
                        }
                        matrix.invert(this.f2354B);
                        motionEventObtain.transform(this.f2354B);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        Drawable background;
        int height = getHeight();
        boolean zM1584n = m1584n(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i2 = 0;
        if (zM1584n) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m1586p(childAt) && childAt.getHeight() >= height) {
                    if (m1589b(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(iSave);
        float f = this.f2360e;
        if (f > 0.0f && zM1584n) {
            int i5 = this.f2359d;
            Paint paint = this.f2361f;
            paint.setColor((((int) ((((-16777216) & i5) >>> 24) * f)) << 24) | (i5 & 16777215));
            canvas.drawRect(i2, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    /* renamed from: e */
    public final void m1592e(boolean z2) {
        int childCount = getChildCount();
        boolean zM1268r = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0542d c0542d = (C0542d) childAt.getLayoutParams();
            if (m1586p(childAt) && (!z2 || c0542d.f1710c)) {
                zM1268r |= m1589b(childAt, 3) ? this.f2362g.m1268r(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2363h.m1268r(childAt, getWidth(), childAt.getTop());
                c0542d.f1710c = false;
            }
        }
        C0544f c0544f = this.f2364i;
        c0544f.f1720f.removeCallbacks(c0544f.f1719e);
        C0544f c0544f2 = this.f2365j;
        c0544f2.f1720f.removeCallbacks(c0544f2.f1719e);
        if (zM1268r) {
            invalidate();
        }
    }

    /* renamed from: f */
    public final View m1593f(int i2) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((m1598k(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final View m1594g() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((C0542d) childAt.getLayoutParams()).f1711d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0542d c0542d = new C0542d(-1, -1);
        c0542d.f1708a = 0;
        return c0542d;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0542d) {
            C0542d c0542d = (C0542d) layoutParams;
            C0542d c0542d2 = new C0542d(c0542d);
            c0542d2.f1708a = 0;
            c0542d2.f1708a = c0542d.f1708a;
            return c0542d2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0542d c0542d3 = new C0542d((ViewGroup.MarginLayoutParams) layoutParams);
            c0542d3.f1708a = 0;
            return c0542d3;
        }
        C0542d c0542d4 = new C0542d(layoutParams);
        c0542d4.f1708a = 0;
        return c0542d4;
    }

    public float getDrawerElevation() {
        if (f2351G) {
            return this.f2357b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2378w;
    }

    /* renamed from: h */
    public final View m1595h() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (m1586p(childAt) && m1587q(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final int m1596i(int i2) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        int layoutDirection = getLayoutDirection();
        if (i2 == 3) {
            int i3 = this.f2369n;
            if (i3 != 3) {
                return i3;
            }
            int i4 = layoutDirection == 0 ? this.f2371p : this.f2372q;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i2 == 5) {
            int i5 = this.f2370o;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.f2372q : this.f2371p;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i2 == 8388611) {
            int i7 = this.f2371p;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f2369n : this.f2370o;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i2 != 8388613) {
            return 0;
        }
        int i9 = this.f2372q;
        if (i9 != 3) {
            return i9;
        }
        int i10 = layoutDirection == 0 ? this.f2370o : this.f2369n;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    /* renamed from: j */
    public final int m1597j(View view) {
        if (m1586p(view)) {
            return m1596i(((C0542d) view.getLayoutParams()).f1708a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: k */
    public final int m1598k(View view) {
        int i2 = ((C0542d) view.getLayoutParams()).f1708a;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        return Gravity.getAbsoluteGravity(i2, getLayoutDirection());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2368m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2368m = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2380y || this.f2378w == null) {
            return;
        }
        WindowInsets windowInsets = this.f2379x;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f2378w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f2378w.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            T.e r1 = r8.f2362g
            boolean r2 = r1.m1267q(r9)
            T.e r3 = r8.f2363h
            boolean r3 = r3.m1267q(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.f1559d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.f1566k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f1561f
            r5 = r5[r0]
            float[] r6 = r1.f1559d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f1562g
            r6 = r6[r0]
            float[] r7 = r1.f1560e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f1557b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            V.f r9 = r8.f2364i
            A1.x r0 = r9.f1719e
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.f1720f
            r9.removeCallbacks(r0)
            V.f r9 = r8.f2365j
            A1.x r0 = r9.f1719e
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.f1720f
            r9.removeCallbacks(r0)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.m1592e(r3)
            r8.f2373r = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f2376u = r0
            r8.f2377v = r9
            float r5 = r8.f2360e
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.m1258h(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = m1584n(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.f2373r = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            V.d r1 = (p060V.C0542d) r1
            boolean r1 = r1.f1710c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.f2373r
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            return r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || m1595h() == null) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View viewM1595h = m1595h();
        if (viewM1595h != null && m1597j(viewM1595h) == 0) {
            m1592e(false);
        }
        return viewM1595h != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        float f;
        int i6;
        boolean z3 = true;
        this.f2367l = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0542d c0542d = (C0542d) childAt.getLayoutParams();
                if (m1584n(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) c0542d).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) c0542d).topMargin, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0542d).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m1589b(childAt, 3)) {
                        float f2 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (c0542d.f1709b * f2));
                        f = (measuredWidth + i6) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i7 - r11) / f3;
                        i6 = i7 - ((int) (c0542d.f1709b * f3));
                    }
                    boolean z4 = f != c0542d.f1709b ? z3 : false;
                    int i10 = c0542d.f1708a & 112;
                    if (i10 == 16) {
                        int i11 = i5 - i3;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) c0542d).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) c0542d).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) c0542d).topMargin;
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight + i16);
                    } else {
                        int i17 = i5 - i3;
                        childAt.layout(i6, (i17 - ((ViewGroup.MarginLayoutParams) c0542d).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i17 - ((ViewGroup.MarginLayoutParams) c0542d).bottomMargin);
                    }
                    if (z4) {
                        m1602u(childAt, f);
                    }
                    int i18 = c0542d.f1709b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i8++;
            z3 = true;
        }
        if (f2352H && (rootWindowInsets = getRootWindowInsets()) != null) {
            C0072d c0072dMo811i = C0292u0.m817g(null, rootWindowInsets).f910a.mo811i();
            C0506e c0506e = this.f2362g;
            c0506e.f1570o = Math.max(c0506e.f1571p, c0072dMo811i.f172a);
            C0506e c0506e2 = this.f2363h;
            c0506e2.f1570o = Math.max(c0506e2.f1571p, c0072dMo811i.f174c);
        }
        this.f2367l = false;
        this.f2368m = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewM1593f;
        if (!(parcelable instanceof C0543e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0543e c0543e = (C0543e) parcelable;
        super.onRestoreInstanceState(c0543e.f1521a);
        int i2 = c0543e.f1712c;
        if (i2 != 0 && (viewM1593f = m1593f(i2)) != null) {
            m1599r(viewM1593f);
        }
        int i3 = c0543e.f1713d;
        if (i3 != 3) {
            m1601t(i3, 3);
        }
        int i4 = c0543e.f1714e;
        if (i4 != 3) {
            m1601t(i4, 5);
        }
        int i5 = c0543e.f1715f;
        if (i5 != 3) {
            m1601t(i5, 8388611);
        }
        int i6 = c0543e.f1716g;
        if (i6 != 3) {
            m1601t(i6, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        if (f2351G) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0543e c0543e = new C0543e(super.onSaveInstanceState());
        c0543e.f1712c = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C0542d c0542d = (C0542d) getChildAt(i2).getLayoutParams();
            int i3 = c0542d.f1711d;
            boolean z2 = i3 == 1;
            boolean z3 = i3 == 2;
            if (z2 || z3) {
                c0543e.f1712c = c0542d.f1708a;
                break;
            }
        }
        c0543e.f1713d = this.f2369n;
        c0543e.f1714e = this.f2370o;
        c0543e.f1715f = this.f2371p;
        c0543e.f1716g = this.f2372q;
        return c0543e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            T.e r0 = r6.f2362g
            r0.m1260j(r7)
            T.e r1 = r6.f2363h
            r1.m1260j(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L59
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            return r3
        L1a:
            r6.m1592e(r3)
            r6.f2373r = r2
            return r3
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.m1258h(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = m1584n(r4)
            if (r4 == 0) goto L54
            float r4 = r6.f2376u
            float r1 = r1 - r4
            float r4 = r6.f2377v
            float r7 = r7 - r4
            int r0 = r0.f1557b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.m1594g()
            if (r7 == 0) goto L54
            int r7 = r6.m1597j(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.m1592e(r2)
            return r3
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2376u = r0
            r6.f2377v = r7
            r6.f2373r = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public final void m1599r(View view) {
        if (!m1586p(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0542d c0542d = (C0542d) view.getLayoutParams();
        if (this.f2368m) {
            c0542d.f1709b = 1.0f;
            c0542d.f1711d = 1;
            m1604w(view, true);
            m1603v(view);
        } else {
            c0542d.f1711d |= 2;
            if (m1589b(view, 3)) {
                this.f2362g.m1268r(view, 0, view.getTop());
            } else {
                this.f2363h.m1268r(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            m1592e(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2367l) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: s */
    public final void m1600s() {
        View viewM1593f = m1593f(8388611);
        if (viewM1593f != null) {
            m1599r(viewM1593f);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + m1582l(8388611));
        }
    }

    public void setDrawerElevation(float f) {
        this.f2357b = f;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (m1586p(childAt)) {
                float f2 = this.f2357b;
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                AbstractC0230E.m636s(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0541c interfaceC0541c) {
        ArrayList arrayList;
        InterfaceC0541c interfaceC0541c2 = this.f2374s;
        if (interfaceC0541c2 != null && (arrayList = this.f2375t) != null) {
            arrayList.remove(interfaceC0541c2);
        }
        if (interfaceC0541c != null) {
            m1588a(interfaceC0541c);
        }
        this.f2374s = interfaceC0541c;
    }

    public void setDrawerLockMode(int i2) {
        m1601t(i2, 3);
        m1601t(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.f2359d = i2;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2378w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.f2378w = new ColorDrawable(i2);
        invalidate();
    }

    /* renamed from: t */
    public final void m1601t(int i2, int i3) {
        View viewM1593f;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        if (i3 == 3) {
            this.f2369n = i2;
        } else if (i3 == 5) {
            this.f2370o = i2;
        } else if (i3 == 8388611) {
            this.f2371p = i2;
        } else if (i3 == 8388613) {
            this.f2372q = i2;
        }
        if (i2 != 0) {
            (absoluteGravity == 3 ? this.f2362g : this.f2363h).m1251a();
        }
        if (i2 != 1) {
            if (i2 == 2 && (viewM1593f = m1593f(absoluteGravity)) != null) {
                m1599r(viewM1593f);
                return;
            }
            return;
        }
        View viewM1593f2 = m1593f(absoluteGravity);
        if (viewM1593f2 != null) {
            m1590c(viewM1593f2, true);
        }
    }

    /* renamed from: u */
    public final void m1602u(View view, float f) {
        C0542d c0542d = (C0542d) view.getLayoutParams();
        if (f == c0542d.f1709b) {
            return;
        }
        c0542d.f1709b = f;
        ArrayList arrayList = this.f2375t;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC0541c) this.f2375t.get(size)).mo155a(f);
            }
        }
    }

    /* renamed from: v */
    public final void m1603v(View view) {
        C0336f c0336f = C0336f.f1076l;
        AbstractC0241P.m698j(view, c0336f.m894a());
        AbstractC0241P.m696h(view, 0);
        if (!m1585o(view) || m1597j(view) == 2) {
            return;
        }
        AbstractC0241P.m699k(view, c0336f, this.f2355C);
    }

    /* renamed from: w */
    public final void m1604w(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z2 || m1586p(childAt)) && !(z2 && childAt == view)) {
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    /* renamed from: x */
    public final void m1605x(View view, int i2) {
        int i3;
        View rootView;
        int i4 = this.f2362g.f1556a;
        int i5 = this.f2363h.f1556a;
        if (i4 == 1 || i5 == 1) {
            i3 = 1;
        } else {
            i3 = 2;
            if (i4 != 2 && i5 != 2) {
                i3 = 0;
            }
        }
        if (view != null && i2 == 0) {
            float f = ((C0542d) view.getLayoutParams()).f1709b;
            if (f == 0.0f) {
                C0542d c0542d = (C0542d) view.getLayoutParams();
                if ((c0542d.f1711d & 1) == 1) {
                    c0542d.f1711d = 0;
                    ArrayList arrayList = this.f2375t;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((InterfaceC0541c) this.f2375t.get(size)).mo157c(view);
                        }
                    }
                    m1604w(view, false);
                    m1603v(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C0542d c0542d2 = (C0542d) view.getLayoutParams();
                if ((c0542d2.f1711d & 1) == 0) {
                    c0542d2.f1711d = 1;
                    ArrayList arrayList2 = this.f2375t;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((InterfaceC0541c) this.f2375t.get(size2)).mo156b(view);
                        }
                    }
                    m1604w(view, true);
                    m1603v(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i3 != this.f2366k) {
            this.f2366k = i3;
            ArrayList arrayList3 = this.f2375t;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((InterfaceC0541c) this.f2375t.get(size3)).getClass();
                }
            }
        }
    }

    public void setStatusBarBackground(int i2) {
        this.f2378w = i2 != 0 ? AbstractC0000a.m1b(getContext(), i2) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0542d c0542d = new C0542d(context, attributeSet);
        c0542d.f1708a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2349E);
        c0542d.f1708a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return c0542d;
    }
}
