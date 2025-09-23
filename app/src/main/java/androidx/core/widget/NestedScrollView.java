package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import p001A0.C0004c;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p028K.C0265h;
import p028K.C0275m;
import p028K.C0281p;
import p028K.InterfaceC0279o;
import p045Q.AbstractC0441e;
import p045Q.AbstractC0445i;
import p045Q.C0444h;
import p045Q.C0447k;
import p045Q.InterfaceC0446j;
import p093e2.AbstractC0901d;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0279o {

    /* renamed from: B */
    public static final float f2318B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C */
    public static final C0444h f2319C = new C0444h(0);

    /* renamed from: D */
    public static final int[] f2320D = {R.attr.fillViewport};

    /* renamed from: A */
    public final C0265h f2321A;

    /* renamed from: a */
    public final float f2322a;

    /* renamed from: b */
    public long f2323b;

    /* renamed from: c */
    public final Rect f2324c;

    /* renamed from: d */
    public final OverScroller f2325d;

    /* renamed from: e */
    public final EdgeEffect f2326e;

    /* renamed from: f */
    public final EdgeEffect f2327f;

    /* renamed from: g */
    public int f2328g;

    /* renamed from: h */
    public boolean f2329h;

    /* renamed from: i */
    public boolean f2330i;

    /* renamed from: j */
    public View f2331j;

    /* renamed from: k */
    public boolean f2332k;

    /* renamed from: l */
    public VelocityTracker f2333l;

    /* renamed from: m */
    public boolean f2334m;

    /* renamed from: n */
    public boolean f2335n;

    /* renamed from: o */
    public final int f2336o;

    /* renamed from: p */
    public final int f2337p;

    /* renamed from: q */
    public final int f2338q;

    /* renamed from: r */
    public int f2339r;

    /* renamed from: s */
    public final int[] f2340s;

    /* renamed from: t */
    public final int[] f2341t;

    /* renamed from: u */
    public int f2342u;

    /* renamed from: v */
    public int f2343v;

    /* renamed from: w */
    public C0447k f2344w;

    /* renamed from: x */
    public final C0281p f2345x;

    /* renamed from: y */
    public final C0275m f2346y;

    /* renamed from: z */
    public float f2347z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.nestedScrollViewStyle);
        this.f2324c = new Rect();
        this.f2329h = true;
        this.f2330i = false;
        this.f2331j = null;
        this.f2332k = false;
        this.f2335n = true;
        this.f2339r = -1;
        this.f2340s = new int[2];
        this.f2341t = new int[2];
        this.f2321A = new C0265h(getContext(), new C0004c(17, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f2326e = i2 >= 31 ? AbstractC0441e.m1108a(context, attributeSet) : new EdgeEffect(context);
        this.f2327f = i2 >= 31 ? AbstractC0441e.m1108a(context, attributeSet) : new EdgeEffect(context);
        this.f2322a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2325d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2336o = viewConfiguration.getScaledTouchSlop();
        this.f2337p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2338q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2320D, tkbmmn.ghwbbf.irvjzy.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f2345x = new C0281p();
        this.f2346y = new C0275m(this);
        setNestedScrollingEnabled(true);
        AbstractC0241P.m701m(this, f2319C);
    }

    /* renamed from: l */
    public static boolean m1565l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1565l((View) parent, nestedScrollView);
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: a */
    public final void mo783a(View view, View view2, int i2, int i3) {
        C0281p c0281p = this.f2345x;
        if (i3 == 1) {
            c0281p.f899b = i2;
        } else {
            c0281p.f898a = i2;
        }
        this.f2346y.m780g(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p028K.InterfaceC0279o
    /* renamed from: b */
    public final void mo801b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m1572n(i5, i6, iArr);
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: c */
    public final void mo784c(View view, int i2, int i3, int i4, int i5, int i6) {
        m1572n(i5, i6, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: d */
    public final void mo785d(View view, int i2) {
        C0281p c0281p = this.f2345x;
        if (i2 == 1) {
            c0281p.f899b = 0;
        } else {
            c0281p.f898a = 0;
        }
        m1581w(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1568i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return this.f2346y.m774a(f, f2, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2346y.m775b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f2346y.m776c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f2346y.m777d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2326e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (AbstractC0445i.m1120a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (AbstractC0445i.m1120a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f2327f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC0445i.m1120a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (AbstractC0445i.m1120a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: e */
    public final void mo786e(View view, int i2, int i3, int[] iArr, int i4) {
        this.f2346y.m776c(i2, i3, iArr, null, i4);
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: f */
    public final boolean mo787f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    /* renamed from: g */
    public final boolean m1566g(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m1571m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1577s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f2324c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m1577s(m1567h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m1571m(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0281p c0281p = this.f2345x;
        return c0281p.f899b | c0281p.f898a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f2347z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2347z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2347z;
    }

    /* renamed from: h */
    public final int m1567h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2346y.m779f(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1568i(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.f2324c
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto L98
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L98
            int r0 = r6.getAction()
            if (r0 != 0) goto Lc0
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L88
            r3 = 20
            if (r0 == r3) goto L78
            r3 = 62
            if (r0 == r3) goto L6d
            r6 = 92
            if (r0 == r6) goto L68
            r6 = 93
            if (r0 == r6) goto L63
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L5f
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L5b
            goto Lc0
        L5b:
            r5.m1575q(r2)
            return r1
        L5f:
            r5.m1575q(r4)
            return r1
        L63:
            boolean r6 = r5.m1570k(r2)
            return r6
        L68:
            boolean r6 = r5.m1570k(r4)
            return r6
        L6d:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L74
            r2 = r4
        L74:
            r5.m1575q(r2)
            return r1
        L78:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L83
            boolean r6 = r5.m1570k(r2)
            return r6
        L83:
            boolean r6 = r5.m1566g(r2)
            return r6
        L88:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L93
            boolean r6 = r5.m1570k(r4)
            return r6
        L93:
            boolean r6 = r5.m1566g(r4)
            return r6
        L98:
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto Lc0
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto Lc0
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto Lac
            r6 = 0
        Lac:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r2)
            if (r6 == 0) goto Lc0
            if (r6 == r5) goto Lc0
            boolean r6 = r6.requestFocus(r2)
            if (r6 == 0) goto Lc0
            r6 = 1
            return r6
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m1568i(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2346y.f883d;
    }

    /* renamed from: j */
    public final void m1569j(int i2) {
        if (getChildCount() > 0) {
            this.f2325d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f2346y.m780g(2, 1);
            this.f2343v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: k */
    public final boolean m1570k(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f2324c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m1576r(i2, rect.top, rect.bottom);
    }

    /* renamed from: m */
    public final boolean m1571m(View view, int i2, int i3) {
        Rect rect = this.f2324c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final void m1572n(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2346y.m777d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    /* renamed from: o */
    public final void m1573o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2339r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f2328g = (int) motionEvent.getY(i2);
            this.f2339r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f2333l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2330i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredHeight;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f2329h = false;
        View view = this.f2331j;
        if (view != null && m1565l(view, this)) {
            View view2 = this.f2331j;
            Rect rect = this.f2324c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM1567h = m1567h(rect);
            if (iM1567h != 0) {
                scrollBy(0, iM1567h);
            }
        }
        this.f2331j = null;
        if (!this.f2330i) {
            if (this.f2344w != null) {
                scrollTo(getScrollX(), this.f2344w.f1352a);
                this.f2344w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i6 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2330i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2334m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m1569j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f2346y.m775b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f2346y.m776c(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m1572n(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        mo783a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus != null && m1571m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0447k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0447k c0447k = (C0447k) parcelable;
        super.onRestoreInstanceState(c0447k.getSuperState());
        this.f2344w = c0447k;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0447k c0447k = new C0447k(super.onSaveInstanceState());
        c0447k.f1352a = getScrollY();
        return c0447k;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m1571m(viewFindFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f2324c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM1567h = m1567h(rect);
        if (iM1567h != 0) {
            if (this.f2335n) {
                m1579u(0, iM1567h, false);
            } else {
                scrollBy(0, iM1567h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo787f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo785d(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f2333l == null) {
            this.f2333l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2342u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f2342u);
        C0275m c0275m = this.f2346y;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f2327f;
            EdgeEffect edgeEffect2 = this.f2326e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2333l;
                velocityTracker.computeCurrentVelocity(1000, this.f2338q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2339r);
                if (Math.abs(yVelocity) >= this.f2337p) {
                    if (AbstractC0901d.m2320w(edgeEffect2) != 0.0f) {
                        if (m1578t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m1569j(-yVelocity);
                        }
                    } else if (AbstractC0901d.m2320w(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (m1578t(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            m1569j(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f2 = i3;
                        if (!c0275m.m775b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m1569j(i3);
                        }
                    }
                } else if (this.f2325d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2339r = -1;
                this.f2332k = false;
                VelocityTracker velocityTracker2 = this.f2333l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f2333l = null;
                }
                m1581w(0);
                this.f2326e.onRelease();
                this.f2327f.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2339r);
                if (iFindPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f2328g - y2;
                    float x2 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (AbstractC0901d.m2320w(edgeEffect2) != 0.0f) {
                        float f3 = -AbstractC0901d.m2290Y(edgeEffect2, -height, x2);
                        if (AbstractC0901d.m2320w(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (AbstractC0901d.m2320w(edgeEffect) != 0.0f) {
                        float fM2290Y = AbstractC0901d.m2290Y(edgeEffect, height, 1.0f - x2);
                        if (AbstractC0901d.m2320w(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = fM2290Y;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i5 = i4 - iRound;
                    if (!this.f2332k && Math.abs(i5) > this.f2336o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2332k = true;
                        i5 = i5 > 0 ? i5 - this.f2336o : i5 + this.f2336o;
                    }
                    if (this.f2332k) {
                        int iM1577s = m1577s(i5, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f2328g = y2 - iM1577s;
                        this.f2342u += iM1577s;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2332k && getChildCount() > 0 && this.f2325d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2339r = -1;
                this.f2332k = false;
                VelocityTracker velocityTracker3 = this.f2333l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2333l = null;
                }
                m1581w(0);
                this.f2326e.onRelease();
                this.f2327f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2328g = (int) motionEvent.getY(actionIndex);
                this.f2339r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1573o(motionEvent);
                this.f2328g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2339r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f2332k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2325d.isFinished()) {
                this.f2325d.abortAnimation();
                m1581w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f2328g = y3;
            this.f2339r = pointerId;
            c0275m.m780g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f2333l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* renamed from: p */
    public final boolean m1574p(int i2, int i3, int i4, int i5) {
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            i6 = i3;
            z2 = false;
        } else {
            i6 = 0;
            z2 = true;
        }
        if (i8 > i5) {
            i7 = i5;
        } else {
            if (i8 >= 0) {
                i7 = i8;
                z3 = false;
                if (z3 && !this.f2346y.m779f(1)) {
                    this.f2325d.springBack(i6, i7, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i6, i7);
                return !z2 || z3;
            }
            i7 = 0;
        }
        z3 = true;
        if (z3) {
            this.f2325d.springBack(i6, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i6, i7);
        if (z2) {
        }
    }

    /* renamed from: q */
    public final void m1575q(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f2324c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        m1576r(i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1576r(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.getHeight()
            int r5 = r0.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L82
        L75:
            if (r6 == 0) goto L7b
            int r2 = r2 - r5
        L78:
            r3 = 0
            r4 = 1
            goto L7e
        L7b:
            int r2 = r3 - r4
            goto L78
        L7e:
            r0.m1577s(r2, r3, r4, r4)
            r7 = r4
        L82:
            android.view.View r2 = r0.findFocus()
            if (r11 == r2) goto L8b
            r11.requestFocus(r1)
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m1576r(int, int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f2329h) {
            this.f2331j = view2;
        } else {
            Rect rect = this.f2324c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM1567h = m1567h(rect);
            if (iM1567h != 0) {
                scrollBy(0, iM1567h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM1567h = m1567h(rect);
        boolean z3 = iM1567h != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iM1567h);
                return z3;
            }
            m1579u(0, iM1567h, false);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f2333l) != null) {
            velocityTracker.recycle();
            this.f2333l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2329h = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final int m1577s(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        VelocityTracker velocityTracker;
        C0275m c0275m = this.f2346y;
        if (i4 == 1) {
            c0275m.m780g(2, i4);
        }
        boolean zM776c = this.f2346y.m776c(0, i2, this.f2341t, this.f2340s, i4);
        int[] iArr = this.f2341t;
        int[] iArr2 = this.f2340s;
        if (zM776c) {
            i5 = i2 - iArr[1];
            i6 = iArr2[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = m1574p(i5, 0, scrollY, scrollRange) && !c0275m.m779f(i4);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f2346y.m777d(0, scrollY2, 0, i5 - scrollY2, this.f2340s, i4, iArr);
        int i7 = i6 + iArr2[1];
        int i8 = i5 - iArr[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f2327f;
        EdgeEffect edgeEffect2 = this.f2326e;
        if (i9 < 0) {
            if (z4) {
                AbstractC0901d.m2290Y(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            AbstractC0901d.m2290Y(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i4 == 0 && (velocityTracker = this.f2333l) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            m1581w(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f2334m) {
            this.f2334m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0275m c0275m = this.f2346y;
        if (c0275m.f883d) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            AbstractC0230E.m643z(c0275m.f882c);
        }
        c0275m.f883d = z2;
    }

    public void setOnScrollChangeListener(InterfaceC0446j interfaceC0446j) {
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f2335n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f2346y.m780g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1581w(0);
    }

    /* renamed from: t */
    public final boolean m1578t(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float fM2320w = AbstractC0901d.m2320w(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i2) * 0.35f;
        float f = this.f2322a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d3 = f2318B;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) f))) < fM2320w;
    }

    /* renamed from: u */
    public final void m1579u(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2323b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2325d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f2346y.m780g(2, 1);
            } else {
                m1581w(1);
            }
            this.f2343v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f2325d.isFinished()) {
                this.f2325d.abortAnimation();
                m1581w(1);
            }
            scrollBy(i2, i3);
        }
        this.f2323b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: v */
    public final boolean m1580v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f2326e;
        if (AbstractC0901d.m2320w(edgeEffect) != 0.0f) {
            AbstractC0901d.m2290Y(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f2327f;
        if (AbstractC0901d.m2320w(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC0901d.m2290Y(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: w */
    public final void m1581w(int i2) {
        this.f2346y.m781h(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
