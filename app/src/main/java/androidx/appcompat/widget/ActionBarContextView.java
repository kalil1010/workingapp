package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import p005B1.ViewOnClickListenerC0066d;
import p028K.AbstractC0241P;
import p028K.C0248X;
import p086d.AbstractC0843a;
import p093e2.AbstractC0901d;
import p099h.AbstractC0971a;
import p102i.InterfaceC0990A;
import p102i.MenuC1006l;
import p105j.AbstractC1133t1;
import p105j.C1074a;
import p105j.C1089f;
import p105j.C1104k;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a */
    public final C1074a f2084a;

    /* renamed from: b */
    public final Context f2085b;

    /* renamed from: c */
    public ActionMenuView f2086c;

    /* renamed from: d */
    public C1104k f2087d;

    /* renamed from: e */
    public int f2088e;

    /* renamed from: f */
    public C0248X f2089f;

    /* renamed from: g */
    public boolean f2090g;

    /* renamed from: h */
    public boolean f2091h;

    /* renamed from: i */
    public CharSequence f2092i;

    /* renamed from: j */
    public CharSequence f2093j;

    /* renamed from: k */
    public View f2094k;

    /* renamed from: l */
    public View f2095l;

    /* renamed from: m */
    public View f2096m;

    /* renamed from: n */
    public LinearLayout f2097n;

    /* renamed from: o */
    public TextView f2098o;

    /* renamed from: p */
    public TextView f2099p;

    /* renamed from: q */
    public final int f2100q;

    /* renamed from: r */
    public final int f2101r;

    /* renamed from: s */
    public boolean f2102s;

    /* renamed from: t */
    public final int f2103t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f2084a = new C1074a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2085b = context;
        } else {
            this.f2085b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0843a.f3454d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0901d.m2321x(context, resourceId);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        setBackground(drawable);
        this.f2100q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f2101r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f2088e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f2103t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public static int m1479f(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    /* renamed from: g */
    public static int m1480g(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: c */
    public final void m1481c(AbstractC0971a abstractC0971a) {
        View view = this.f2094k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f2103t, (ViewGroup) this, false);
            this.f2094k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f2094k);
        }
        View viewFindViewById = this.f2094k.findViewById(R.id.action_mode_close_button);
        this.f2095l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0066d(5, abstractC0971a));
        MenuC1006l menuC1006lMo2187d = abstractC0971a.mo2187d();
        C1104k c1104k = this.f2087d;
        if (c1104k != null) {
            c1104k.m2725f();
            C1089f c1089f = c1104k.f4550u;
            if (c1089f != null && c1089f.m2594b()) {
                c1089f.f4327i.dismiss();
            }
        }
        C1104k c1104k2 = new C1104k(getContext());
        this.f2087d = c1104k2;
        c1104k2.f4542m = true;
        c1104k2.f4543n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC1006lMo2187d.m2571b(this.f2087d, this.f2085b);
        C1104k c1104k3 = this.f2087d;
        InterfaceC0990A interfaceC0990A = c1104k3.f4537h;
        if (interfaceC0990A == null) {
            InterfaceC0990A interfaceC0990A2 = (InterfaceC0990A) c1104k3.f4533d.inflate(c1104k3.f4535f, (ViewGroup) this, false);
            c1104k3.f4537h = interfaceC0990A2;
            interfaceC0990A2.mo1475b(c1104k3.f4532c);
            c1104k3.mo1064d();
        }
        InterfaceC0990A interfaceC0990A3 = c1104k3.f4537h;
        if (interfaceC0990A != interfaceC0990A3) {
            ((ActionMenuView) interfaceC0990A3).setPresenter(c1104k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0990A3;
        this.f2086c = actionMenuView;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        actionMenuView.setBackground(null);
        addView(this.f2086c, layoutParams);
    }

    /* renamed from: d */
    public final void m1482d() {
        if (this.f2097n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2097n = linearLayout;
            this.f2098o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f2099p = (TextView) this.f2097n.findViewById(R.id.action_bar_subtitle);
            int i2 = this.f2100q;
            if (i2 != 0) {
                this.f2098o.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f2101r;
            if (i3 != 0) {
                this.f2099p.setTextAppearance(getContext(), i3);
            }
        }
        this.f2098o.setText(this.f2092i);
        this.f2099p.setText(this.f2093j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f2092i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f2093j);
        this.f2099p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f2097n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f2097n.getParent() == null) {
            addView(this.f2097n);
        }
    }

    /* renamed from: e */
    public final void m1483e() {
        removeAllViews();
        this.f2096m = null;
        this.f2086c = null;
        this.f2087d = null;
        View view = this.f2095l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f2089f != null ? this.f2084a.f4464b : getVisibility();
    }

    public int getContentHeight() {
        return this.f2088e;
    }

    public CharSequence getSubtitle() {
        return this.f2093j;
    }

    public CharSequence getTitle() {
        return this.f2092i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            C0248X c0248x = this.f2089f;
            if (c0248x != null) {
                c0248x.m718b();
            }
            super.setVisibility(i2);
        }
    }

    /* renamed from: i */
    public final C0248X m1485i(int i2, long j2) {
        C0248X c0248x = this.f2089f;
        if (c0248x != null) {
            c0248x.m718b();
        }
        C1074a c1074a = this.f2084a;
        if (i2 != 0) {
            C0248X c0248xM689a = AbstractC0241P.m689a(this);
            c0248xM689a.m717a(0.0f);
            c0248xM689a.m719c(j2);
            c1074a.f4465c.f2089f = c0248xM689a;
            c1074a.f4464b = i2;
            c0248xM689a.m720d(c1074a);
            return c0248xM689a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0248X c0248xM689a2 = AbstractC0241P.m689a(this);
        c0248xM689a2.m717a(1.0f);
        c0248xM689a2.m719c(j2);
        c1074a.f4465c.f2089f = c0248xM689a2;
        c1074a.f4464b = i2;
        c0248xM689a2.m720d(c1074a);
        return c0248xM689a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0843a.f3451a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1104k c1104k = this.f2087d;
        if (c1104k != null) {
            Configuration configuration2 = c1104k.f4531b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            c1104k.f4546q = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            MenuC1006l menuC1006l = c1104k.f4532c;
            if (menuC1006l != null) {
                menuC1006l.mo1072p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1104k c1104k = this.f2087d;
        if (c1104k != null) {
            c1104k.m2725f();
            C1089f c1089f = this.f2087d.f4550u;
            if (c1089f == null || !c1089f.m2594b()) {
                return;
            }
            c1089f.f4327i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2091h = false;
        }
        if (!this.f2091h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f2091h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f2091h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean zM2754a = AbstractC1133t1.m2754a(this);
        int paddingRight = zM2754a ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2094k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2094k.getLayoutParams();
            int i6 = zM2754a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = zM2754a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = zM2754a ? paddingRight - i6 : paddingRight + i6;
            int iM1480g = m1480g(this.f2094k, i8, paddingTop, paddingTop2, zM2754a) + i8;
            paddingRight = zM2754a ? iM1480g - i7 : iM1480g + i7;
        }
        LinearLayout linearLayout = this.f2097n;
        if (linearLayout != null && this.f2096m == null && linearLayout.getVisibility() != 8) {
            paddingRight += m1480g(this.f2097n, paddingRight, paddingTop, paddingTop2, zM2754a);
        }
        View view2 = this.f2096m;
        if (view2 != null) {
            m1480g(view2, paddingRight, paddingTop, paddingTop2, zM2754a);
        }
        int paddingLeft = zM2754a ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2086c;
        if (actionMenuView != null) {
            m1480g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM2754a);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f2088e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f2094k;
        if (view != null) {
            int iM1479f = m1479f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2094k.getLayoutParams();
            paddingLeft = iM1479f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f2086c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m1479f(this.f2086c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f2097n;
        if (linearLayout != null && this.f2096m == null) {
            if (this.f2102s) {
                this.f2097n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f2097n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f2097n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = m1479f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f2096m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f2096m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f2088e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2090g = false;
        }
        if (!this.f2090g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f2090g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f2090g = false;
        return true;
    }

    public void setContentHeight(int i2) {
        this.f2088e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2096m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2096m = view;
        if (view != null && (linearLayout = this.f2097n) != null) {
            removeView(linearLayout);
            this.f2097n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2093j = charSequence;
        m1482d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2092i = charSequence;
        m1482d();
        AbstractC0241P.m702n(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f2102s) {
            requestLayout();
        }
        this.f2102s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
