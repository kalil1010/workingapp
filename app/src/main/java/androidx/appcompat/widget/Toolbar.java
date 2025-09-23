package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p002A1.C0019a;
import p002A1.C0027i;
import p002A1.RunnableC0042x;
import p005B1.ViewOnClickListenerC0066d;
import p006C.AbstractC0075g;
import p028K.AbstractC0241P;
import p033L1.AbstractC0364l;
import p086d.AbstractC0843a;
import p093e2.AbstractC0901d;
import p099h.C0979i;
import p102i.C1008n;
import p102i.MenuC1006l;
import p105j.AbstractC1133t1;
import p105j.C1054P0;
import p105j.C1081c0;
import p105j.C1091f1;
import p105j.C1097h1;
import p105j.C1100i1;
import p105j.C1104k;
import p105j.C1106k1;
import p105j.C1112m1;
import p105j.C1140x;
import p105j.C1142y;
import p105j.InterfaceC1103j1;
import p105j.InterfaceC1114n0;
import p105j.RunnableC1088e1;
import p105j.ViewOnClickListenerC1109l1;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public ColorStateList f2200A;

    /* renamed from: B */
    public boolean f2201B;

    /* renamed from: C */
    public boolean f2202C;

    /* renamed from: D */
    public final ArrayList f2203D;

    /* renamed from: E */
    public final ArrayList f2204E;

    /* renamed from: F */
    public final int[] f2205F;

    /* renamed from: G */
    public final C0019a f2206G;

    /* renamed from: H */
    public ArrayList f2207H;

    /* renamed from: I */
    public final C1091f1 f2208I;

    /* renamed from: J */
    public C1112m1 f2209J;

    /* renamed from: K */
    public C1104k f2210K;

    /* renamed from: L */
    public C1097h1 f2211L;

    /* renamed from: M */
    public boolean f2212M;

    /* renamed from: N */
    public OnBackInvokedCallback f2213N;

    /* renamed from: O */
    public OnBackInvokedDispatcher f2214O;

    /* renamed from: P */
    public boolean f2215P;

    /* renamed from: Q */
    public final RunnableC0042x f2216Q;

    /* renamed from: a */
    public ActionMenuView f2217a;

    /* renamed from: b */
    public C1081c0 f2218b;

    /* renamed from: c */
    public C1081c0 f2219c;

    /* renamed from: d */
    public C1140x f2220d;

    /* renamed from: e */
    public C1142y f2221e;

    /* renamed from: f */
    public final Drawable f2222f;

    /* renamed from: g */
    public final CharSequence f2223g;

    /* renamed from: h */
    public C1140x f2224h;

    /* renamed from: i */
    public View f2225i;

    /* renamed from: j */
    public Context f2226j;

    /* renamed from: k */
    public int f2227k;

    /* renamed from: l */
    public int f2228l;

    /* renamed from: m */
    public int f2229m;

    /* renamed from: n */
    public final int f2230n;

    /* renamed from: o */
    public final int f2231o;

    /* renamed from: p */
    public int f2232p;

    /* renamed from: q */
    public int f2233q;

    /* renamed from: r */
    public int f2234r;

    /* renamed from: s */
    public int f2235s;

    /* renamed from: t */
    public C1054P0 f2236t;

    /* renamed from: u */
    public int f2237u;

    /* renamed from: v */
    public int f2238v;

    /* renamed from: w */
    public final int f2239w;

    /* renamed from: x */
    public CharSequence f2240x;

    /* renamed from: y */
    public CharSequence f2241y;

    /* renamed from: z */
    public ColorStateList f2242z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0979i(getContext());
    }

    /* renamed from: h */
    public static C1100i1 m1516h() {
        C1100i1 c1100i1 = new C1100i1(-2, -2);
        c1100i1.f4515b = 0;
        c1100i1.f4514a = 8388627;
        return c1100i1;
    }

    /* renamed from: i */
    public static C1100i1 m1517i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof C1100i1;
        if (z2) {
            C1100i1 c1100i1 = (C1100i1) layoutParams;
            C1100i1 c1100i12 = new C1100i1(c1100i1);
            c1100i12.f4515b = 0;
            c1100i12.f4515b = c1100i1.f4515b;
            return c1100i12;
        }
        if (z2) {
            C1100i1 c1100i13 = new C1100i1((C1100i1) layoutParams);
            c1100i13.f4515b = 0;
            return c1100i13;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1100i1 c1100i14 = new C1100i1(layoutParams);
            c1100i14.f4515b = 0;
            return c1100i14;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1100i1 c1100i15 = new C1100i1(marginLayoutParams);
        c1100i15.f4515b = 0;
        ((ViewGroup.MarginLayoutParams) c1100i15).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1100i15).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1100i15).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1100i15).bottomMargin = marginLayoutParams.bottomMargin;
        return c1100i15;
    }

    /* renamed from: k */
    public static int m1518k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: l */
    public static int m1519l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m1520a(ArrayList arrayList, int i2) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C1100i1 c1100i1 = (C1100i1) childAt.getLayoutParams();
                if (c1100i1.f4515b == 0 && m1535t(childAt)) {
                    int i4 = c1100i1.f4514a;
                    WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            C1100i1 c1100i12 = (C1100i1) childAt2.getLayoutParams();
            if (c1100i12.f4515b == 0 && m1535t(childAt2)) {
                int i6 = c1100i12.f4514a;
                WeakHashMap weakHashMap3 = AbstractC0241P.f815a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1521b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1100i1 c1100i1M1516h = layoutParams == null ? m1516h() : !checkLayoutParams(layoutParams) ? m1517i(layoutParams) : (C1100i1) layoutParams;
        c1100i1M1516h.f4515b = 1;
        if (!z2 || this.f2225i == null) {
            addView(view, c1100i1M1516h);
        } else {
            view.setLayoutParams(c1100i1M1516h);
            this.f2204E.add(view);
        }
    }

    /* renamed from: c */
    public final void m1522c() {
        if (this.f2224h == null) {
            C1140x c1140x = new C1140x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f2224h = c1140x;
            c1140x.setImageDrawable(this.f2222f);
            this.f2224h.setContentDescription(this.f2223g);
            C1100i1 c1100i1M1516h = m1516h();
            c1100i1M1516h.f4514a = (this.f2230n & 112) | 8388611;
            c1100i1M1516h.f4515b = 2;
            this.f2224h.setLayoutParams(c1100i1M1516h);
            this.f2224h.setOnClickListener(new ViewOnClickListenerC0066d(6, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1100i1);
    }

    /* renamed from: d */
    public final void m1523d() {
        if (this.f2236t == null) {
            C1054P0 c1054p0 = new C1054P0();
            c1054p0.f4413a = 0;
            c1054p0.f4414b = 0;
            c1054p0.f4415c = Integer.MIN_VALUE;
            c1054p0.f4416d = Integer.MIN_VALUE;
            c1054p0.f4417e = 0;
            c1054p0.f4418f = 0;
            c1054p0.f4419g = false;
            c1054p0.f4420h = false;
            this.f2236t = c1054p0;
        }
    }

    /* renamed from: e */
    public final void m1524e() {
        m1525f();
        ActionMenuView actionMenuView = this.f2217a;
        if (actionMenuView.f2132p == null) {
            MenuC1006l menuC1006l = (MenuC1006l) actionMenuView.getMenu();
            if (this.f2211L == null) {
                this.f2211L = new C1097h1(this);
            }
            this.f2217a.setExpandedActionViewsExclusive(true);
            menuC1006l.m2571b(this.f2211L, this.f2226j);
            m1536u();
        }
    }

    /* renamed from: f */
    public final void m1525f() {
        if (this.f2217a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f2217a = actionMenuView;
            actionMenuView.setPopupTheme(this.f2227k);
            this.f2217a.setOnMenuItemClickListener(this.f2208I);
            ActionMenuView actionMenuView2 = this.f2217a;
            C1091f1 c1091f1 = new C1091f1(this);
            actionMenuView2.getClass();
            actionMenuView2.f2137u = c1091f1;
            C1100i1 c1100i1M1516h = m1516h();
            c1100i1M1516h.f4514a = (this.f2230n & 112) | 8388613;
            this.f2217a.setLayoutParams(c1100i1M1516h);
            m1521b(this.f2217a, false);
        }
    }

    /* renamed from: g */
    public final void m1526g() {
        if (this.f2220d == null) {
            this.f2220d = new C1140x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1100i1 c1100i1M1516h = m1516h();
            c1100i1M1516h.f4514a = (this.f2230n & 112) | 8388611;
            this.f2220d.setLayoutParams(c1100i1M1516h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1516h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1517i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1140x c1140x = this.f2224h;
        if (c1140x != null) {
            return c1140x.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1140x c1140x = this.f2224h;
        if (c1140x != null) {
            return c1140x.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1054P0 c1054p0 = this.f2236t;
        if (c1054p0 != null) {
            return c1054p0.f4419g ? c1054p0.f4413a : c1054p0.f4414b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f2238v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1054P0 c1054p0 = this.f2236t;
        if (c1054p0 != null) {
            return c1054p0.f4413a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1054P0 c1054p0 = this.f2236t;
        if (c1054p0 != null) {
            return c1054p0.f4414b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1054P0 c1054p0 = this.f2236t;
        if (c1054p0 != null) {
            return c1054p0.f4419g ? c1054p0.f4414b : c1054p0.f4413a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f2237u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC1006l menuC1006l;
        ActionMenuView actionMenuView = this.f2217a;
        return (actionMenuView == null || (menuC1006l = actionMenuView.f2132p) == null || !menuC1006l.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f2238v, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2237u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1142y c1142y = this.f2221e;
        if (c1142y != null) {
            return c1142y.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1142y c1142y = this.f2221e;
        if (c1142y != null) {
            return c1142y.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1524e();
        return this.f2217a.getMenu();
    }

    public View getNavButtonView() {
        return this.f2220d;
    }

    public CharSequence getNavigationContentDescription() {
        C1140x c1140x = this.f2220d;
        if (c1140x != null) {
            return c1140x.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1140x c1140x = this.f2220d;
        if (c1140x != null) {
            return c1140x.getDrawable();
        }
        return null;
    }

    public C1104k getOuterActionMenuPresenter() {
        return this.f2210K;
    }

    public Drawable getOverflowIcon() {
        m1524e();
        return this.f2217a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2226j;
    }

    public int getPopupTheme() {
        return this.f2227k;
    }

    public CharSequence getSubtitle() {
        return this.f2241y;
    }

    public final TextView getSubtitleTextView() {
        return this.f2219c;
    }

    public CharSequence getTitle() {
        return this.f2240x;
    }

    public int getTitleMarginBottom() {
        return this.f2235s;
    }

    public int getTitleMarginEnd() {
        return this.f2233q;
    }

    public int getTitleMarginStart() {
        return this.f2232p;
    }

    public int getTitleMarginTop() {
        return this.f2234r;
    }

    public final TextView getTitleTextView() {
        return this.f2218b;
    }

    public InterfaceC1114n0 getWrapper() {
        Drawable drawable;
        if (this.f2209J == null) {
            C1112m1 c1112m1 = new C1112m1();
            c1112m1.f4581n = 0;
            c1112m1.f4568a = this;
            c1112m1.f4575h = getTitle();
            c1112m1.f4576i = getSubtitle();
            c1112m1.f4574g = c1112m1.f4575h != null;
            c1112m1.f4573f = getNavigationIcon();
            C0027i c0027iM98N = C0027i.m98N(getContext(), null, AbstractC0843a.f3451a, R.attr.actionBarStyle);
            c1112m1.f4582o = c0027iM98N.m100B(15);
            TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c1112m1.f4574g = true;
                c1112m1.f4575h = text;
                if ((c1112m1.f4569b & 8) != 0) {
                    Toolbar toolbar = c1112m1.f4568a;
                    toolbar.setTitle(text);
                    if (c1112m1.f4574g) {
                        AbstractC0241P.m702n(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c1112m1.f4576i = text2;
                if ((c1112m1.f4569b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM100B = c0027iM98N.m100B(20);
            if (drawableM100B != null) {
                c1112m1.f4572e = drawableM100B;
                c1112m1.m2730c();
            }
            Drawable drawableM100B2 = c0027iM98N.m100B(17);
            if (drawableM100B2 != null) {
                c1112m1.f4571d = drawableM100B2;
                c1112m1.m2730c();
            }
            if (c1112m1.f4573f == null && (drawable = c1112m1.f4582o) != null) {
                c1112m1.f4573f = drawable;
                int i2 = c1112m1.f4569b & 4;
                Toolbar toolbar2 = c1112m1.f4568a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c1112m1.m2728a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c1112m1.f4570c;
                if (view != null && (c1112m1.f4569b & 16) != 0) {
                    removeView(view);
                }
                c1112m1.f4570c = viewInflate;
                if (viewInflate != null && (c1112m1.f4569b & 16) != 0) {
                    addView(viewInflate);
                }
                c1112m1.m2728a(c1112m1.f4569b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m1523d();
                this.f2236t.m2664a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f2228l = resourceId2;
                C1081c0 c1081c0 = this.f2218b;
                if (c1081c0 != null) {
                    c1081c0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f2229m = resourceId3;
                C1081c0 c1081c02 = this.f2219c;
                if (c1081c02 != null) {
                    c1081c02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0027iM98N.m114R();
            if (R.string.abc_action_bar_up_description != c1112m1.f4581n) {
                c1112m1.f4581n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = c1112m1.f4581n;
                    c1112m1.f4577j = i3 != 0 ? c1112m1.f4568a.getContext().getString(i3) : null;
                    c1112m1.m2729b();
                }
            }
            c1112m1.f4577j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC1109l1(c1112m1));
            this.f2209J = c1112m1;
        }
        return this.f2209J;
    }

    /* renamed from: j */
    public final int m1527j(View view, int i2) {
        C1100i1 c1100i1 = (C1100i1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = c1100i1.f4514a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f2239w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1100i1).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) c1100i1).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) c1100i1).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    /* renamed from: m */
    public void mo1528m(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    /* renamed from: n */
    public final void m1529n() {
        Iterator it = this.f2207H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f2206G.f46b).iterator();
        if (it2.hasNext()) {
            throw AbstractC0075g.m235d(it2);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f2207H = currentMenuItems2;
    }

    /* renamed from: o */
    public final boolean m1530o(View view) {
        return view.getParent() == this || this.f2204E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1536u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2216Q);
        m1536u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2202C = false;
        }
        if (!this.f2202C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f2202C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f2202C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0295 A[LOOP:0: B:104:0x0293->B:105:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ad A[LOOP:1: B:107:0x02ab->B:108:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02cd A[LOOP:2: B:110:0x02cb->B:111:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0321 A[LOOP:3: B:119:0x031f->B:120:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int iM1518k;
        int iMax;
        int iCombineMeasuredStates;
        int iM1518k2;
        int iM1519l;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zM2754a = AbstractC1133t1.m2754a(this);
        int i4 = !zM2754a ? 1 : 0;
        int i5 = 0;
        if (m1535t(this.f2220d)) {
            m1534s(this.f2220d, i2, 0, i3, this.f2231o);
            iM1518k = m1518k(this.f2220d) + this.f2220d.getMeasuredWidth();
            iMax = Math.max(0, m1519l(this.f2220d) + this.f2220d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2220d.getMeasuredState());
        } else {
            iM1518k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m1535t(this.f2224h)) {
            m1534s(this.f2224h, i2, 0, i3, this.f2231o);
            iM1518k = m1518k(this.f2224h) + this.f2224h.getMeasuredWidth();
            iMax = Math.max(iMax, m1519l(this.f2224h) + this.f2224h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2224h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM1518k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM1518k);
        int[] iArr = this.f2205F;
        iArr[zM2754a ? 1 : 0] = iMax4;
        if (m1535t(this.f2217a)) {
            m1534s(this.f2217a, i2, iMax3, i3, this.f2231o);
            iM1518k2 = m1518k(this.f2217a) + this.f2217a.getMeasuredWidth();
            iMax = Math.max(iMax, m1519l(this.f2217a) + this.f2217a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2217a.getMeasuredState());
        } else {
            iM1518k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM1518k2);
        iArr[i4] = Math.max(0, currentContentInsetEnd - iM1518k2);
        if (m1535t(this.f2225i)) {
            iMax5 += m1533r(this.f2225i, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, m1519l(this.f2225i) + this.f2225i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2225i.getMeasuredState());
        }
        if (m1535t(this.f2221e)) {
            iMax5 += m1533r(this.f2221e, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, m1519l(this.f2221e) + this.f2221e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2221e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (((C1100i1) childAt.getLayoutParams()).f4515b == 0 && m1535t(childAt)) {
                iMax5 += m1533r(childAt, i2, iMax5, i3, 0, iArr);
                int iMax6 = Math.max(iMax, m1519l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i7 = iMax5;
        int i8 = this.f2234r + this.f2235s;
        int i9 = this.f2232p + this.f2233q;
        if (m1535t(this.f2218b)) {
            m1533r(this.f2218b, i2, i7 + i9, i3, i8, iArr);
            int iM1518k3 = m1518k(this.f2218b) + this.f2218b.getMeasuredWidth();
            iM1519l = m1519l(this.f2218b) + this.f2218b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2218b.getMeasuredState());
            iMax2 = iM1518k3;
        } else {
            iM1519l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m1535t(this.f2219c)) {
            iMax2 = Math.max(iMax2, m1533r(this.f2219c, i2, i7 + i9, i3, i8 + iM1519l, iArr));
            iM1519l += m1519l(this.f2219c) + this.f2219c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f2219c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM1519l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i7 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.f2212M) {
            i5 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = getChildAt(i10);
            if (m1535t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i5 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i5);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C1106k1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1106k1 c1106k1 = (C1106k1) parcelable;
        super.onRestoreInstanceState(c1106k1.f1521a);
        ActionMenuView actionMenuView = this.f2217a;
        MenuC1006l menuC1006l = actionMenuView != null ? actionMenuView.f2132p : null;
        int i2 = c1106k1.f4558c;
        if (i2 != 0 && this.f2211L != null && menuC1006l != null && (menuItemFindItem = menuC1006l.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c1106k1.f4559d) {
            RunnableC0042x runnableC0042x = this.f2216Q;
            removeCallbacks(runnableC0042x);
            post(runnableC0042x);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        m1523d();
        C1054P0 c1054p0 = this.f2236t;
        boolean z2 = i2 == 1;
        if (z2 == c1054p0.f4419g) {
            return;
        }
        c1054p0.f4419g = z2;
        if (!c1054p0.f4420h) {
            c1054p0.f4413a = c1054p0.f4417e;
            c1054p0.f4414b = c1054p0.f4418f;
            return;
        }
        if (z2) {
            int i3 = c1054p0.f4416d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c1054p0.f4417e;
            }
            c1054p0.f4413a = i3;
            int i4 = c1054p0.f4415c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c1054p0.f4418f;
            }
            c1054p0.f4414b = i4;
            return;
        }
        int i5 = c1054p0.f4415c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c1054p0.f4417e;
        }
        c1054p0.f4413a = i5;
        int i6 = c1054p0.f4416d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = c1054p0.f4418f;
        }
        c1054p0.f4414b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1104k c1104k;
        C1008n c1008n;
        C1106k1 c1106k1 = new C1106k1(super.onSaveInstanceState());
        C1097h1 c1097h1 = this.f2211L;
        if (c1097h1 != null && (c1008n = c1097h1.f4511b) != null) {
            c1106k1.f4558c = c1008n.f4281a;
        }
        ActionMenuView actionMenuView = this.f2217a;
        c1106k1.f4559d = (actionMenuView == null || (c1104k = actionMenuView.f2136t) == null || !c1104k.m2726i()) ? false : true;
        return c1106k1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2201B = false;
        }
        if (!this.f2201B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f2201B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f2201B = false;
        return true;
    }

    /* renamed from: p */
    public final int m1531p(View view, int i2, int i3, int[] iArr) {
        C1100i1 c1100i1 = (C1100i1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c1100i1).leftMargin - iArr[0];
        int iMax = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int iM1527j = m1527j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM1527j, iMax + measuredWidth, view.getMeasuredHeight() + iM1527j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1100i1).rightMargin + iMax;
    }

    /* renamed from: q */
    public final int m1532q(View view, int i2, int i3, int[] iArr) {
        C1100i1 c1100i1 = (C1100i1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c1100i1).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iM1527j = m1527j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM1527j, iMax, view.getMeasuredHeight() + iM1527j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1100i1).leftMargin);
    }

    /* renamed from: r */
    public final int m1533r(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* renamed from: s */
    public final void m1534s(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f2215P != z2) {
            this.f2215P = z2;
            m1536u();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(AbstractC0901d.m2321x(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f2212M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f2238v) {
            this.f2238v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f2237u) {
            this.f2237u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AbstractC0901d.m2321x(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AbstractC0901d.m2321x(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1526g();
        this.f2220d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC1103j1 interfaceC1103j1) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m1524e();
        this.f2217a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f2227k != i2) {
            this.f2227k = i2;
            if (i2 == 0) {
                this.f2226j = getContext();
            } else {
                this.f2226j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f2235s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f2233q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f2232p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f2234r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    /* renamed from: t */
    public final boolean m1535t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1536u() {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L4f
            android.window.OnBackInvokedDispatcher r1 = p105j.AbstractC1094g1.m2708a(r4)
            j.h1 r2 = r4.f2211L
            if (r2 == 0) goto L23
            i.n r2 = r2.f4511b
            if (r2 == 0) goto L23
            if (r1 == 0) goto L23
            java.util.WeakHashMap r2 = p028K.AbstractC0241P.f815a
            boolean r2 = r4.isAttachedToWindow()
            if (r2 == 0) goto L23
            boolean r2 = r4.f2215P
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = r0
        L24:
            if (r2 == 0) goto L41
            android.window.OnBackInvokedDispatcher r3 = r4.f2214O
            if (r3 != 0) goto L41
            android.window.OnBackInvokedCallback r2 = r4.f2213N
            if (r2 != 0) goto L39
            j.e1 r2 = new j.e1
            r2.<init>(r4, r0)
            android.window.OnBackInvokedCallback r0 = p105j.AbstractC1094g1.m2709b(r2)
            r4.f2213N = r0
        L39:
            android.window.OnBackInvokedCallback r0 = r4.f2213N
            p105j.AbstractC1094g1.m2710c(r1, r0)
            r4.f2214O = r1
            return
        L41:
            if (r2 != 0) goto L4f
            android.window.OnBackInvokedDispatcher r0 = r4.f2214O
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedCallback r1 = r4.f2213N
            p105j.AbstractC1094g1.m2711d(r0, r1)
            r0 = 0
            r4.f2214O = r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.m1536u():void");
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f2239w = 8388627;
        this.f2203D = new ArrayList();
        this.f2204E = new ArrayList();
        this.f2205F = new int[2];
        this.f2206G = new C0019a(new RunnableC1088e1(this, 1));
        this.f2207H = new ArrayList();
        this.f2208I = new C1091f1(this);
        this.f2216Q = new RunnableC0042x(15, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0843a.f3475y;
        C0027i c0027iM98N = C0027i.m98N(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC0241P.m700l(this, context, iArr, attributeSet, (TypedArray) c0027iM98N.f66c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
        this.f2228l = typedArray.getResourceId(28, 0);
        this.f2229m = typedArray.getResourceId(19, 0);
        this.f2239w = typedArray.getInteger(0, 8388627);
        this.f2230n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2235s = dimensionPixelOffset;
        this.f2234r = dimensionPixelOffset;
        this.f2233q = dimensionPixelOffset;
        this.f2232p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2232p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2233q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2234r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2235s = dimensionPixelOffset5;
        }
        this.f2231o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m1523d();
        C1054P0 c1054p0 = this.f2236t;
        c1054p0.f4420h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1054p0.f4417e = dimensionPixelSize;
            c1054p0.f4413a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1054p0.f4418f = dimensionPixelSize2;
            c1054p0.f4414b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1054p0.m2664a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2237u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f2238v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f2222f = c0027iM98N.m100B(4);
        this.f2223g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2226j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM100B = c0027iM98N.m100B(16);
        if (drawableM100B != null) {
            setNavigationIcon(drawableM100B);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM100B2 = c0027iM98N.m100B(11);
        if (drawableM100B2 != null) {
            setLogo(drawableM100B2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0027iM98N.m99A(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0027iM98N.m99A(20));
        }
        if (typedArray.hasValue(14)) {
            mo1528m(typedArray.getResourceId(14, 0));
        }
        c0027iM98N.m114R();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1100i1 c1100i1 = new C1100i1(context, attributeSet);
        c1100i1.f4514a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0843a.f3452b);
        c1100i1.f4514a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1100i1.f4515b = 0;
        return c1100i1;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1522c();
        }
        C1140x c1140x = this.f2224h;
        if (c1140x != null) {
            c1140x.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1522c();
            this.f2224h.setImageDrawable(drawable);
        } else {
            C1140x c1140x = this.f2224h;
            if (c1140x != null) {
                c1140x.setImageDrawable(this.f2222f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2221e == null) {
                this.f2221e = new C1142y(getContext(), null, 0);
            }
            if (!m1530o(this.f2221e)) {
                m1521b(this.f2221e, true);
            }
        } else {
            C1142y c1142y = this.f2221e;
            if (c1142y != null && m1530o(c1142y)) {
                removeView(this.f2221e);
                this.f2204E.remove(this.f2221e);
            }
        }
        C1142y c1142y2 = this.f2221e;
        if (c1142y2 != null) {
            c1142y2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2221e == null) {
            this.f2221e = new C1142y(getContext(), null, 0);
        }
        C1142y c1142y = this.f2221e;
        if (c1142y != null) {
            c1142y.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1526g();
        }
        C1140x c1140x = this.f2220d;
        if (c1140x != null) {
            c1140x.setContentDescription(charSequence);
            AbstractC0364l.m1000g0(this.f2220d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1526g();
            if (!m1530o(this.f2220d)) {
                m1521b(this.f2220d, true);
            }
        } else {
            C1140x c1140x = this.f2220d;
            if (c1140x != null && m1530o(c1140x)) {
                removeView(this.f2220d);
                this.f2204E.remove(this.f2220d);
            }
        }
        C1140x c1140x2 = this.f2220d;
        if (c1140x2 != null) {
            c1140x2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1081c0 c1081c0 = this.f2219c;
            if (c1081c0 != null && m1530o(c1081c0)) {
                removeView(this.f2219c);
                this.f2204E.remove(this.f2219c);
            }
        } else {
            if (this.f2219c == null) {
                Context context = getContext();
                C1081c0 c1081c02 = new C1081c0(context, null);
                this.f2219c = c1081c02;
                c1081c02.setSingleLine();
                this.f2219c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f2229m;
                if (i2 != 0) {
                    this.f2219c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f2200A;
                if (colorStateList != null) {
                    this.f2219c.setTextColor(colorStateList);
                }
            }
            if (!m1530o(this.f2219c)) {
                m1521b(this.f2219c, true);
            }
        }
        C1081c0 c1081c03 = this.f2219c;
        if (c1081c03 != null) {
            c1081c03.setText(charSequence);
        }
        this.f2241y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2200A = colorStateList;
        C1081c0 c1081c0 = this.f2219c;
        if (c1081c0 != null) {
            c1081c0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1081c0 c1081c0 = this.f2218b;
            if (c1081c0 != null && m1530o(c1081c0)) {
                removeView(this.f2218b);
                this.f2204E.remove(this.f2218b);
            }
        } else {
            if (this.f2218b == null) {
                Context context = getContext();
                C1081c0 c1081c02 = new C1081c0(context, null);
                this.f2218b = c1081c02;
                c1081c02.setSingleLine();
                this.f2218b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f2228l;
                if (i2 != 0) {
                    this.f2218b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f2242z;
                if (colorStateList != null) {
                    this.f2218b.setTextColor(colorStateList);
                }
            }
            if (!m1530o(this.f2218b)) {
                m1521b(this.f2218b, true);
            }
        }
        C1081c0 c1081c03 = this.f2218b;
        if (c1081c03 != null) {
            c1081c03.setText(charSequence);
        }
        this.f2240x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2242z = colorStateList;
        C1081c0 c1081c0 = this.f2218b;
        if (c1081c0 != null) {
            c1081c0.setTextColor(colorStateList);
        }
    }
}
