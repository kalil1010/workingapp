package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import p001A0.C0002a;
import p006C.C0072d;
import p028K.AbstractC0228C;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p028K.AbstractC0276m0;
import p028K.C0270j0;
import p028K.C0272k0;
import p028K.C0274l0;
import p028K.C0281p;
import p028K.C0288s0;
import p028K.C0292u0;
import p028K.InterfaceC0277n;
import p028K.InterfaceC0279o;
import p090e.C0867H;
import p093e2.AbstractC0901d;
import p099h.C0981k;
import p102i.InterfaceC1018x;
import p102i.MenuC1006l;
import p105j.C1086e;
import p105j.C1097h1;
import p105j.C1104k;
import p105j.C1112m1;
import p105j.InterfaceC1083d;
import p105j.InterfaceC1111m0;
import p105j.InterfaceC1114n0;
import p105j.RunnableC1080c;
import tkbmmn.ghwbbf.irvjzy.R;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1111m0, InterfaceC0277n, InterfaceC0279o {

    /* renamed from: B */
    public static final int[] f2104B = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A */
    public final C0281p f2105A;

    /* renamed from: a */
    public int f2106a;

    /* renamed from: b */
    public int f2107b;

    /* renamed from: c */
    public ContentFrameLayout f2108c;

    /* renamed from: d */
    public ActionBarContainer f2109d;

    /* renamed from: e */
    public InterfaceC1114n0 f2110e;

    /* renamed from: f */
    public Drawable f2111f;

    /* renamed from: g */
    public boolean f2112g;

    /* renamed from: h */
    public boolean f2113h;

    /* renamed from: i */
    public boolean f2114i;

    /* renamed from: j */
    public boolean f2115j;

    /* renamed from: k */
    public boolean f2116k;

    /* renamed from: l */
    public int f2117l;

    /* renamed from: m */
    public int f2118m;

    /* renamed from: n */
    public final Rect f2119n;

    /* renamed from: o */
    public final Rect f2120o;

    /* renamed from: p */
    public final Rect f2121p;

    /* renamed from: q */
    public C0292u0 f2122q;

    /* renamed from: r */
    public C0292u0 f2123r;

    /* renamed from: s */
    public C0292u0 f2124s;

    /* renamed from: t */
    public C0292u0 f2125t;

    /* renamed from: u */
    public InterfaceC1083d f2126u;

    /* renamed from: v */
    public OverScroller f2127v;

    /* renamed from: w */
    public ViewPropertyAnimator f2128w;

    /* renamed from: x */
    public final C0002a f2129x;

    /* renamed from: y */
    public final RunnableC1080c f2130y;

    /* renamed from: z */
    public final RunnableC1080c f2131z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2107b = 0;
        this.f2119n = new Rect();
        this.f2120o = new Rect();
        this.f2121p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0292u0 c0292u0 = C0292u0.f909b;
        this.f2122q = c0292u0;
        this.f2123r = c0292u0;
        this.f2124s = c0292u0;
        this.f2125t = c0292u0;
        this.f2129x = new C0002a(6, this);
        this.f2130y = new RunnableC1080c(this, 0);
        this.f2131z = new RunnableC1080c(this, 1);
        m1488i(context);
        this.f2105A = new C0281p();
    }

    /* renamed from: g */
    public static boolean m1486g(View view, Rect rect, boolean z2) {
        boolean z3;
        C1086e c1086e = (C1086e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c1086e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c1086e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c1086e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c1086e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c1086e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c1086e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c1086e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c1086e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: a */
    public final void mo783a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // p028K.InterfaceC0279o
    /* renamed from: b */
    public final void mo801b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        mo784c(view, i2, i3, i4, i5, i6);
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: c */
    public final void mo784c(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1086e;
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: d */
    public final void mo785d(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f2111f == null || this.f2112g) {
            return;
        }
        if (this.f2109d.getVisibility() == 0) {
            translationY = (int) (this.f2109d.getTranslationY() + this.f2109d.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f2111f.setBounds(0, translationY, getWidth(), this.f2111f.getIntrinsicHeight() + translationY);
        this.f2111f.draw(canvas);
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: e */
    public final void mo786e(View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // p028K.InterfaceC0277n
    /* renamed from: f */
    public final boolean mo787f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1086e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1086e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2109d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0281p c0281p = this.f2105A;
        return c0281p.f899b | c0281p.f898a;
    }

    public CharSequence getTitle() {
        m1490k();
        return ((C1112m1) this.f2110e).f4568a.getTitle();
    }

    /* renamed from: h */
    public final void m1487h() {
        removeCallbacks(this.f2130y);
        removeCallbacks(this.f2131z);
        ViewPropertyAnimator viewPropertyAnimator = this.f2128w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public final void m1488i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2104B);
        this.f2106a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f2111f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f2112g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2127v = new OverScroller(context);
    }

    /* renamed from: j */
    public final void m1489j(int i2) {
        m1490k();
        if (i2 == 2) {
            this.f2110e.getClass();
        } else if (i2 == 5) {
            this.f2110e.getClass();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* renamed from: k */
    public final void m1490k() {
        InterfaceC1114n0 wrapper;
        if (this.f2108c == null) {
            this.f2108c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f2109d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC1114n0) {
                wrapper = (InterfaceC1114n0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f2110e = wrapper;
        }
    }

    /* renamed from: l */
    public final void m1491l(MenuC1006l menuC1006l, InterfaceC1018x interfaceC1018x) {
        m1490k();
        C1112m1 c1112m1 = (C1112m1) this.f2110e;
        C1104k c1104k = c1112m1.f4580m;
        Toolbar toolbar = c1112m1.f4568a;
        if (c1104k == null) {
            C1104k c1104k2 = new C1104k(toolbar.getContext());
            c1112m1.f4580m = c1104k2;
            c1104k2.f4538i = R.id.action_menu_presenter;
        }
        C1104k c1104k3 = c1112m1.f4580m;
        c1104k3.f4534e = interfaceC1018x;
        if (menuC1006l == null && toolbar.f2217a == null) {
            return;
        }
        toolbar.m1525f();
        MenuC1006l menuC1006l2 = toolbar.f2217a.f2132p;
        if (menuC1006l2 == menuC1006l) {
            return;
        }
        if (menuC1006l2 != null) {
            menuC1006l2.m2578r(toolbar.f2210K);
            menuC1006l2.m2578r(toolbar.f2211L);
        }
        if (toolbar.f2211L == null) {
            toolbar.f2211L = new C1097h1(toolbar);
        }
        c1104k3.f4547r = true;
        if (menuC1006l != null) {
            menuC1006l.m2571b(c1104k3, toolbar.f2226j);
            menuC1006l.m2571b(toolbar.f2211L, toolbar.f2226j);
        } else {
            c1104k3.mo1067h(toolbar.f2226j, null);
            toolbar.f2211L.mo1067h(toolbar.f2226j, null);
            c1104k3.mo1064d();
            toolbar.f2211L.mo1064d();
        }
        toolbar.f2217a.setPopupTheme(toolbar.f2227k);
        toolbar.f2217a.setPresenter(c1104k3);
        toolbar.f2210K = c1104k3;
        toolbar.m1536u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1490k();
        C0292u0 c0292u0M817g = C0292u0.m817g(this, windowInsets);
        boolean zM1486g = m1486g(this.f2109d, new Rect(c0292u0M817g.m819b(), c0292u0M817g.m821d(), c0292u0M817g.m820c(), c0292u0M817g.m818a()), false);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        Rect rect = this.f2119n;
        AbstractC0230E.m619b(this, c0292u0M817g, rect);
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        C0288s0 c0288s0 = c0292u0M817g.f910a;
        C0292u0 c0292u0Mo795l = c0288s0.mo795l(i2, i3, i4, i5);
        this.f2122q = c0292u0Mo795l;
        boolean z2 = true;
        if (!this.f2123r.equals(c0292u0Mo795l)) {
            this.f2123r = this.f2122q;
            zM1486g = true;
        }
        Rect rect2 = this.f2120o;
        if (rect2.equals(rect)) {
            z2 = zM1486g;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return c0288s0.mo808a().f910a.mo803c().f910a.mo802b().m822f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1488i(getContext());
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        AbstractC0228C.m617c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1487h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C1086e c1086e = (C1086e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c1086e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c1086e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int measuredHeight;
        m1490k();
        measureChildWithMargins(this.f2109d, i2, 0, i3, 0);
        C1086e c1086e = (C1086e) this.f2109d.getLayoutParams();
        int iMax = Math.max(0, this.f2109d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1086e).leftMargin + ((ViewGroup.MarginLayoutParams) c1086e).rightMargin);
        int iMax2 = Math.max(0, this.f2109d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1086e).topMargin + ((ViewGroup.MarginLayoutParams) c1086e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2109d.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f2106a;
            if (this.f2114i && this.f2109d.getTabContainer() != null) {
                measuredHeight += this.f2106a;
            }
        } else {
            measuredHeight = this.f2109d.getVisibility() != 8 ? this.f2109d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f2119n;
        Rect rect2 = this.f2121p;
        rect2.set(rect);
        C0292u0 c0292u0 = this.f2122q;
        this.f2124s = c0292u0;
        if (this.f2113h || z2) {
            C0072d c0072dM228b = C0072d.m228b(c0292u0.m819b(), this.f2124s.m821d() + measuredHeight, this.f2124s.m820c(), this.f2124s.m818a());
            C0292u0 c0292u02 = this.f2124s;
            int i4 = Build.VERSION.SDK_INT;
            AbstractC0276m0 c0274l0 = i4 >= 30 ? new C0274l0(c0292u02) : i4 >= 29 ? new C0272k0(c0292u02) : new C0270j0(c0292u02);
            c0274l0.mo755g(c0072dM228b);
            this.f2124s = c0274l0.mo753b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f2124s = c0292u0.f910a.mo795l(0, measuredHeight, 0, 0);
        }
        m1486g(this.f2108c, rect2, true);
        if (!this.f2125t.equals(this.f2124s)) {
            C0292u0 c0292u03 = this.f2124s;
            this.f2125t = c0292u03;
            AbstractC0241P.m690b(this.f2108c, c0292u03);
        }
        measureChildWithMargins(this.f2108c, i2, 0, i3, 0);
        C1086e c1086e2 = (C1086e) this.f2108c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f2108c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1086e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1086e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f2108c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1086e2).topMargin + ((ViewGroup.MarginLayoutParams) c1086e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2108c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (!this.f2115j || !z2) {
            return false;
        }
        this.f2127v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2127v.getFinalY() > this.f2109d.getHeight()) {
            m1487h();
            this.f2131z.run();
        } else {
            m1487h();
            this.f2130y.run();
        }
        this.f2116k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f2117l + i3;
        this.f2117l = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        C0867H c0867h;
        C0981k c0981k;
        this.f2105A.f898a = i2;
        this.f2117l = getActionBarHideOffset();
        m1487h();
        InterfaceC1083d interfaceC1083d = this.f2126u;
        if (interfaceC1083d == null || (c0981k = (c0867h = (C0867H) interfaceC1083d).f3547F) == null) {
            return;
        }
        c0981k.m2486a();
        c0867h.f3547F = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f2109d.getVisibility() != 0) {
            return false;
        }
        return this.f2115j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f2115j || this.f2116k) {
            return;
        }
        if (this.f2117l <= this.f2109d.getHeight()) {
            m1487h();
            postDelayed(this.f2130y, 600L);
        } else {
            m1487h();
            postDelayed(this.f2131z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        m1490k();
        int i3 = this.f2118m ^ i2;
        this.f2118m = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        InterfaceC1083d interfaceC1083d = this.f2126u;
        if (interfaceC1083d != null) {
            C0867H c0867h = (C0867H) interfaceC1083d;
            c0867h.f3543B = !z3;
            if (z2 || !z3) {
                if (c0867h.f3544C) {
                    c0867h.f3544C = false;
                    c0867h.m2204Q(true);
                }
            } else if (!c0867h.f3544C) {
                c0867h.f3544C = true;
                c0867h.m2204Q(true);
            }
        }
        if ((i3 & 256) == 0 || this.f2126u == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        AbstractC0228C.m617c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f2107b = i2;
        InterfaceC1083d interfaceC1083d = this.f2126u;
        if (interfaceC1083d != null) {
            ((C0867H) interfaceC1083d).f3542A = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        m1487h();
        this.f2109d.setTranslationY(-Math.max(0, Math.min(i2, this.f2109d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1083d interfaceC1083d) {
        this.f2126u = interfaceC1083d;
        if (getWindowToken() != null) {
            ((C0867H) this.f2126u).f3542A = this.f2107b;
            int i2 = this.f2118m;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                AbstractC0228C.m617c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f2114i = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f2115j) {
            this.f2115j = z2;
            if (z2) {
                return;
            }
            m1487h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        m1490k();
        C1112m1 c1112m1 = (C1112m1) this.f2110e;
        c1112m1.f4571d = i2 != 0 ? AbstractC0901d.m2321x(c1112m1.f4568a.getContext(), i2) : null;
        c1112m1.m2730c();
    }

    public void setLogo(int i2) {
        m1490k();
        C1112m1 c1112m1 = (C1112m1) this.f2110e;
        c1112m1.f4572e = i2 != 0 ? AbstractC0901d.m2321x(c1112m1.f4568a.getContext(), i2) : null;
        c1112m1.m2730c();
    }

    public void setOverlayMode(boolean z2) {
        this.f2113h = z2;
        this.f2112g = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // p105j.InterfaceC1111m0
    public void setWindowCallback(Window.Callback callback) {
        m1490k();
        ((C1112m1) this.f2110e).f4578k = callback;
    }

    @Override // p105j.InterfaceC1111m0
    public void setWindowTitle(CharSequence charSequence) {
        m1490k();
        C1112m1 c1112m1 = (C1112m1) this.f2110e;
        if (c1112m1.f4574g) {
            return;
        }
        c1112m1.f4575h = charSequence;
        if ((c1112m1.f4569b & 8) != 0) {
            Toolbar toolbar = c1112m1.f4568a;
            toolbar.setTitle(charSequence);
            if (c1112m1.f4574g) {
                AbstractC0241P.m702n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1086e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m1490k();
        C1112m1 c1112m1 = (C1112m1) this.f2110e;
        c1112m1.f4571d = drawable;
        c1112m1.m2730c();
    }
}
