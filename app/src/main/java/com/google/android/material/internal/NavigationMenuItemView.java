package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p003B.AbstractC0054j;
import p003B.AbstractC0060p;
import p009D.AbstractC0098a;
import p010D0.C0107e;
import p028K.AbstractC0241P;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0375d;
import p102i.C1008n;
import p102i.InterfaceC1020z;
import p105j.C1143y0;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0375d implements InterfaceC1020z {

    /* renamed from: G */
    public static final int[] f3271G = {R.attr.state_checked};

    /* renamed from: A */
    public FrameLayout f3272A;

    /* renamed from: B */
    public C1008n f3273B;

    /* renamed from: C */
    public ColorStateList f3274C;

    /* renamed from: D */
    public boolean f3275D;

    /* renamed from: E */
    public Drawable f3276E;

    /* renamed from: F */
    public final C0107e f3277F;

    /* renamed from: v */
    public int f3278v;

    /* renamed from: w */
    public boolean f3279w;

    /* renamed from: x */
    public boolean f3280x;

    /* renamed from: y */
    public boolean f3281y;

    /* renamed from: z */
    public final CheckedTextView f3282z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3281y = true;
        C0107e c0107e = new C0107e(2, this);
        this.f3277F = c0107e;
        setOrientation(0);
        LayoutInflater.from(context).inflate(tkbmmn.ghwbbf.irvjzy.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(tkbmmn.ghwbbf.irvjzy.R.id.design_menu_item_text);
        this.f3282z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0241P.m701m(checkedTextView, c0107e);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3272A == null) {
                this.f3272A = (FrameLayout) ((ViewStub) findViewById(tkbmmn.ghwbbf.irvjzy.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f3272A.removeAllViews();
            this.f3272A.addView(view);
        }
    }

    @Override // p102i.InterfaceC1020z
    /* renamed from: e */
    public final void mo1472e(C1008n c1008n) {
        StateListDrawable stateListDrawable;
        this.f3273B = c1008n;
        int i2 = c1008n.f4281a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(c1008n.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(tkbmmn.ghwbbf.irvjzy.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f3271G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            setBackground(stateListDrawable);
        }
        setCheckable(c1008n.isCheckable());
        setChecked(c1008n.isChecked());
        setEnabled(c1008n.isEnabled());
        setTitle(c1008n.f4285e);
        setIcon(c1008n.getIcon());
        setActionView(c1008n.getActionView());
        setContentDescription(c1008n.f4297q);
        AbstractC0364l.m1000g0(this, c1008n.f4298r);
        C1008n c1008n2 = this.f3273B;
        CharSequence charSequence = c1008n2.f4285e;
        CheckedTextView checkedTextView = this.f3282z;
        if (charSequence == null && c1008n2.getIcon() == null && this.f3273B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f3272A;
            if (frameLayout != null) {
                C1143y0 c1143y0 = (C1143y0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1143y0).width = -1;
                this.f3272A.setLayoutParams(c1143y0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f3272A;
        if (frameLayout2 != null) {
            C1143y0 c1143y02 = (C1143y0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1143y02).width = -2;
            this.f3272A.setLayoutParams(c1143y02);
        }
    }

    @Override // p102i.InterfaceC1020z
    public C1008n getItemData() {
        return this.f3273B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        C1008n c1008n = this.f3273B;
        if (c1008n != null && c1008n.isCheckable() && this.f3273B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3271G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f3280x != z2) {
            this.f3280x = z2;
            this.f3277F.mo731h(this.f3282z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f3282z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f3281y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f3275D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                AbstractC0098a.m300h(drawable, this.f3274C);
            }
            int i2 = this.f3278v;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f3279w) {
            if (this.f3276E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0060p.f137a;
                Drawable drawableM181a = AbstractC0054j.m181a(resources, tkbmmn.ghwbbf.irvjzy.R.drawable.navigation_empty_icon, theme);
                this.f3276E = drawableM181a;
                if (drawableM181a != null) {
                    int i3 = this.f3278v;
                    drawableM181a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f3276E;
        }
        this.f3282z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.f3282z.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f3278v = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f3274C = colorStateList;
        this.f3275D = colorStateList != null;
        C1008n c1008n = this.f3273B;
        if (c1008n != null) {
            setIcon(c1008n.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f3282z.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f3279w = z2;
    }

    public void setTextAppearance(int i2) {
        this.f3282z.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3282z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3282z.setText(charSequence);
    }
}
