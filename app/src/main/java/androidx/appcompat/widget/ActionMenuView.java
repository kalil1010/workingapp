package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p080b1.C0767e;
import p080b1.C0770h;
import p102i.C1008n;
import p102i.InterfaceC0990A;
import p102i.InterfaceC1005k;
import p102i.MenuC1006l;
import p105j.AbstractC1133t1;
import p105j.AbstractC1145z0;
import p105j.C1089f;
import p105j.C1091f1;
import p105j.C1098i;
import p105j.C1104k;
import p105j.C1110m;
import p105j.C1143y0;
import p105j.InterfaceC1107l;
import p105j.InterfaceC1113n;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC1145z0 implements InterfaceC1005k, InterfaceC0990A {

    /* renamed from: p */
    public MenuC1006l f2132p;

    /* renamed from: q */
    public Context f2133q;

    /* renamed from: r */
    public int f2134r;

    /* renamed from: s */
    public boolean f2135s;

    /* renamed from: t */
    public C1104k f2136t;

    /* renamed from: u */
    public C1091f1 f2137u;

    /* renamed from: v */
    public boolean f2138v;

    /* renamed from: w */
    public int f2139w;

    /* renamed from: x */
    public final int f2140x;

    /* renamed from: y */
    public final int f2141y;

    /* renamed from: z */
    public InterfaceC1113n f2142z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2140x = (int) (56.0f * f);
        this.f2141y = (int) (f * 4.0f);
        this.f2133q = context;
        this.f2134r = 0;
    }

    /* renamed from: l */
    public static C1110m m1492l() {
        C1110m c1110m = new C1110m(-2, -2);
        c1110m.f4562a = false;
        ((LinearLayout.LayoutParams) c1110m).gravity = 16;
        return c1110m;
    }

    /* renamed from: m */
    public static C1110m m1493m(ViewGroup.LayoutParams layoutParams) {
        C1110m c1110m;
        if (layoutParams == null) {
            return m1492l();
        }
        if (layoutParams instanceof C1110m) {
            C1110m c1110m2 = (C1110m) layoutParams;
            c1110m = new C1110m(c1110m2);
            c1110m.f4562a = c1110m2.f4562a;
        } else {
            c1110m = new C1110m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1110m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1110m).gravity = 16;
        }
        return c1110m;
    }

    @Override // p102i.InterfaceC0990A
    /* renamed from: b */
    public final void mo1475b(MenuC1006l menuC1006l) {
        this.f2132p = menuC1006l;
    }

    @Override // p102i.InterfaceC1005k
    /* renamed from: c */
    public final boolean mo1476c(C1008n c1008n) {
        return this.f2132p.m2577q(c1008n, null, 0);
    }

    @Override // p105j.AbstractC1145z0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1110m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p105j.AbstractC1145z0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1492l();
    }

    @Override // p105j.AbstractC1145z0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1493m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f2132p == null) {
            Context context = getContext();
            MenuC1006l menuC1006l = new MenuC1006l(context);
            this.f2132p = menuC1006l;
            menuC1006l.f4255e = new C0770h(this);
            C1104k c1104k = new C1104k(context);
            this.f2136t = c1104k;
            c1104k.f4542m = true;
            c1104k.f4543n = true;
            c1104k.f4534e = new C0767e(9);
            this.f2132p.m2571b(c1104k, this.f2133q);
            C1104k c1104k2 = this.f2136t;
            c1104k2.f4537h = this;
            this.f2132p = c1104k2.f4532c;
        }
        return this.f2132p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1104k c1104k = this.f2136t;
        C1098i c1098i = c1104k.f4539j;
        if (c1098i != null) {
            return c1098i.getDrawable();
        }
        if (c1104k.f4541l) {
            return c1104k.f4540k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f2134r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p105j.AbstractC1145z0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1143y0 generateDefaultLayoutParams() {
        return m1492l();
    }

    @Override // p105j.AbstractC1145z0
    /* renamed from: i */
    public final C1143y0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1110m(getContext(), attributeSet);
    }

    @Override // p105j.AbstractC1145z0
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C1143y0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1493m(layoutParams);
    }

    /* renamed from: n */
    public final boolean m1497n(int i2) {
        boolean zMo1471b = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC1107l)) {
            zMo1471b = ((InterfaceC1107l) childAt).mo1471b();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC1107l)) ? zMo1471b : ((InterfaceC1107l) childAt2).mo1470a() | zMo1471b;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1104k c1104k = this.f2136t;
        if (c1104k != null) {
            c1104k.mo1064d();
            if (this.f2136t.m2726i()) {
                this.f2136t.m2725f();
                this.f2136t.m2727o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1104k c1104k = this.f2136t;
        if (c1104k != null) {
            c1104k.m2725f();
            C1089f c1089f = c1104k.f4550u;
            if (c1089f == null || !c1089f.m2594b()) {
                return;
            }
            c1089f.f4327i.dismiss();
        }
    }

    @Override // p105j.AbstractC1145z0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.f2138v) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zM2754a = AbstractC1133t1.m2754a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C1110m c1110m = (C1110m) childAt.getLayoutParams();
                if (c1110m.f4562a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1497n(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM2754a) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1110m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1110m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1110m).leftMargin) + ((LinearLayout.LayoutParams) c1110m).rightMargin;
                    m1497n(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zM2754a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C1110m c1110m2 = (C1110m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1110m2.f4562a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c1110m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1110m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C1110m c1110m3 = (C1110m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1110m3.f4562a) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) c1110m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c1110m3).rightMargin + iMax + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // p105j.AbstractC1145z0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        ?? r11;
        int i6;
        int i7;
        MenuC1006l menuC1006l;
        boolean z2 = this.f2138v;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f2138v = z3;
        if (z2 != z3) {
            this.f2139w = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f2138v && (menuC1006l = this.f2132p) != null && size != this.f2139w) {
            this.f2139w = size;
            menuC1006l.mo1072p(true);
        }
        int childCount = getChildCount();
        if (!this.f2138v || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C1110m c1110m = (C1110m) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) c1110m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1110m).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f2140x;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        boolean z4 = false;
        int i16 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f2141y;
            if (i15 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i15);
            int i17 = size3;
            int i18 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i6 = i13;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z5) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C1110m c1110m2 = (C1110m) childAt.getLayoutParams();
                c1110m2.f4567f = false;
                c1110m2.f4564c = 0;
                c1110m2.f4563b = 0;
                c1110m2.f4565d = false;
                ((LinearLayout.LayoutParams) c1110m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1110m2).rightMargin = 0;
                c1110m2.f4566e = z5 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i19 = c1110m2.f4562a ? 1 : i11;
                C1110m c1110m3 = (C1110m) childAt.getLayoutParams();
                int i20 = i11;
                i6 = i13;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i18, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z7 = z6;
                if (i19 <= 0 || (z6 && i19 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i19, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i6;
                    if (measuredWidth % i6 != 0) {
                        i7++;
                    }
                    if (z7 && i7 < 2) {
                        i7 = 2;
                    }
                }
                c1110m3.f4565d = !c1110m3.f4562a && z7;
                c1110m3.f4563b = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i6, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i7);
                if (c1110m2.f4565d) {
                    i16++;
                }
                if (c1110m2.f4562a) {
                    z4 = true;
                }
                i11 = i20 - i7;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    j2 |= 1 << i15;
                }
            }
            i15++;
            size3 = i17;
            paddingBottom = i18;
            i13 = i6;
        }
        int i21 = size3;
        int i22 = i11;
        int i23 = i13;
        boolean z8 = z4 && i14 == 2;
        int i24 = i22;
        boolean z9 = false;
        while (i16 > 0 && i24 > 0) {
            int i25 = Integer.MAX_VALUE;
            long j3 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i27 < childCount2) {
                boolean z10 = z8;
                C1110m c1110m4 = (C1110m) getChildAt(i27).getLayoutParams();
                int i28 = iMax;
                if (c1110m4.f4565d) {
                    int i29 = c1110m4.f4563b;
                    if (i29 < i25) {
                        j3 = 1 << i27;
                        i25 = i29;
                        i26 = 1;
                    } else if (i29 == i25) {
                        j3 |= 1 << i27;
                        i26++;
                    }
                }
                i27++;
                iMax = i28;
                z8 = z10;
            }
            boolean z11 = z8;
            i5 = iMax;
            j2 |= j3;
            if (i26 > i24) {
                break;
            }
            int i30 = i25 + 1;
            int i31 = 0;
            while (i31 < childCount2) {
                View childAt2 = getChildAt(i31);
                C1110m c1110m5 = (C1110m) childAt2.getLayoutParams();
                boolean z12 = z4;
                long j4 = 1 << i31;
                if ((j3 & j4) != 0) {
                    if (z11 && c1110m5.f4566e) {
                        r11 = 1;
                        r11 = 1;
                        if (i24 == 1) {
                            childAt2.setPadding(i4 + i23, 0, i4, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1110m5.f4563b += r11;
                    c1110m5.f4567f = r11;
                    i24--;
                } else if (c1110m5.f4563b == i30) {
                    j2 |= j4;
                }
                i31++;
                z4 = z12;
            }
            iMax = i5;
            z8 = z11;
            z9 = true;
        }
        i5 = iMax;
        boolean z13 = !z4 && i14 == 1;
        if (i24 > 0 && j2 != 0 && (i24 < i14 - 1 || z13 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j2);
            if (!z13) {
                if ((j2 & 1) != 0 && !((C1110m) getChildAt(0).getLayoutParams()).f4566e) {
                    fBitCount -= 0.5f;
                }
                int i32 = childCount2 - 1;
                if ((j2 & (1 << i32)) != 0 && !((C1110m) getChildAt(i32).getLayoutParams()).f4566e) {
                    fBitCount -= 0.5f;
                }
            }
            int i33 = fBitCount > 0.0f ? (int) ((i24 * i23) / fBitCount) : 0;
            boolean z14 = z9;
            for (int i34 = 0; i34 < childCount2; i34++) {
                if ((j2 & (1 << i34)) != 0) {
                    View childAt3 = getChildAt(i34);
                    C1110m c1110m6 = (C1110m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1110m6.f4564c = i33;
                        c1110m6.f4567f = true;
                        if (i34 == 0 && !c1110m6.f4566e) {
                            ((LinearLayout.LayoutParams) c1110m6).leftMargin = (-i33) / 2;
                        }
                        z14 = true;
                    } else if (c1110m6.f4562a) {
                        c1110m6.f4564c = i33;
                        c1110m6.f4567f = true;
                        ((LinearLayout.LayoutParams) c1110m6).rightMargin = (-i33) / 2;
                        z14 = true;
                    } else {
                        if (i34 != 0) {
                            ((LinearLayout.LayoutParams) c1110m6).leftMargin = i33 / 2;
                        }
                        if (i34 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c1110m6).rightMargin = i33 / 2;
                        }
                    }
                }
            }
            z9 = z14;
        }
        if (z9) {
            for (int i35 = 0; i35 < childCount2; i35++) {
                View childAt4 = getChildAt(i35);
                C1110m c1110m7 = (C1110m) childAt4.getLayoutParams();
                if (c1110m7.f4567f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1110m7.f4563b * i23) + c1110m7.f4564c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i9, mode != 1073741824 ? i5 : i21);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f2136t.f4547r = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC1113n interfaceC1113n) {
        this.f2142z = interfaceC1113n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1104k c1104k = this.f2136t;
        C1098i c1098i = c1104k.f4539j;
        if (c1098i != null) {
            c1098i.setImageDrawable(drawable);
        } else {
            c1104k.f4541l = true;
            c1104k.f4540k = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f2135s = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.f2134r != i2) {
            this.f2134r = i2;
            if (i2 == 0) {
                this.f2133q = getContext();
            } else {
                this.f2133q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C1104k c1104k) {
        this.f2136t = c1104k;
        c1104k.f4537h = this;
        this.f2132p = c1104k.f4532c;
    }

    @Override // p105j.AbstractC1145z0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1110m(getContext(), attributeSet);
    }
}
