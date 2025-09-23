package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p001A0.C0004c;
import p006C.AbstractC0075g;
import p009D.AbstractC0098a;
import p010D0.C0104b;
import p010D0.C0105c;
import p010D0.InterfaceC0103a;
import p028K.AbstractC0241P;
import p033L1.AbstractC0356d;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0368A;
import p049R0.AbstractC0472a;
import p055T0.C0507a;
import p055T0.C0516j;
import p055T0.C0517k;
import p055T0.InterfaceC0528v;
import p070Y0.AbstractC0601a;
import p093e2.AbstractC0901d;
import p105j.C1119p;
import p145x0.AbstractC1395a;

/* loaded from: classes.dex */
public class MaterialButton extends C1119p implements Checkable, InterfaceC0528v {

    /* renamed from: r */
    public static final int[] f3108r = {R.attr.state_checkable};

    /* renamed from: s */
    public static final int[] f3109s = {R.attr.state_checked};

    /* renamed from: d */
    public final C0105c f3110d;

    /* renamed from: e */
    public final LinkedHashSet f3111e;

    /* renamed from: f */
    public InterfaceC0103a f3112f;

    /* renamed from: g */
    public PorterDuff.Mode f3113g;

    /* renamed from: h */
    public ColorStateList f3114h;

    /* renamed from: i */
    public Drawable f3115i;

    /* renamed from: j */
    public String f3116j;

    /* renamed from: k */
    public int f3117k;

    /* renamed from: l */
    public int f3118l;

    /* renamed from: m */
    public int f3119m;

    /* renamed from: n */
    public int f3120n;

    /* renamed from: o */
    public boolean f3121o;

    /* renamed from: p */
    public boolean f3122p;

    /* renamed from: q */
    public int f3123q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0601a.m1405a(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.materialButtonStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Button), attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.materialButtonStyle);
        this.f3111e = new LinkedHashSet();
        this.f3121o = false;
        this.f3122p = false;
        Context context2 = getContext();
        TypedArray typedArrayM1041f = AbstractC0368A.m1041f(context2, attributeSet, AbstractC1395a.f6041j, tkbmmn.ghwbbf.irvjzy.R.attr.materialButtonStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f3120n = typedArrayM1041f.getDimensionPixelSize(12, 0);
        int i2 = typedArrayM1041f.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f3113g = AbstractC0368A.m1042g(i2, mode);
        this.f3114h = AbstractC0901d.m2318t(getContext(), typedArrayM1041f, 14);
        this.f3115i = AbstractC0901d.m2322y(getContext(), typedArrayM1041f, 10);
        this.f3123q = typedArrayM1041f.getInteger(11, 1);
        this.f3117k = typedArrayM1041f.getDimensionPixelSize(13, 0);
        C0105c c0105c = new C0105c(this, C0517k.m1297b(context2, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.materialButtonStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Button).m1295a());
        this.f3110d = c0105c;
        c0105c.f243c = typedArrayM1041f.getDimensionPixelOffset(1, 0);
        c0105c.f244d = typedArrayM1041f.getDimensionPixelOffset(2, 0);
        c0105c.f245e = typedArrayM1041f.getDimensionPixelOffset(3, 0);
        c0105c.f246f = typedArrayM1041f.getDimensionPixelOffset(4, 0);
        if (typedArrayM1041f.hasValue(8)) {
            int dimensionPixelSize = typedArrayM1041f.getDimensionPixelSize(8, -1);
            c0105c.f247g = dimensionPixelSize;
            float f = dimensionPixelSize;
            C0516j c0516jM1300e = c0105c.f242b.m1300e();
            c0516jM1300e.f1628e = new C0507a(f);
            c0516jM1300e.f1629f = new C0507a(f);
            c0516jM1300e.f1630g = new C0507a(f);
            c0516jM1300e.f1631h = new C0507a(f);
            c0105c.m311c(c0516jM1300e.m1295a());
            c0105c.f256p = true;
        }
        c0105c.f248h = typedArrayM1041f.getDimensionPixelSize(20, 0);
        c0105c.f249i = AbstractC0368A.m1042g(typedArrayM1041f.getInt(7, -1), mode);
        c0105c.f250j = AbstractC0901d.m2318t(getContext(), typedArrayM1041f, 6);
        c0105c.f251k = AbstractC0901d.m2318t(getContext(), typedArrayM1041f, 19);
        c0105c.f252l = AbstractC0901d.m2318t(getContext(), typedArrayM1041f, 16);
        c0105c.f257q = typedArrayM1041f.getBoolean(5, false);
        c0105c.f260t = typedArrayM1041f.getDimensionPixelSize(9, 0);
        c0105c.f258r = typedArrayM1041f.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM1041f.hasValue(0)) {
            c0105c.f255o = true;
            setSupportBackgroundTintList(c0105c.f250j);
            setSupportBackgroundTintMode(c0105c.f249i);
        } else {
            c0105c.m313e();
        }
        setPaddingRelative(paddingStart + c0105c.f243c, paddingTop + c0105c.f245e, paddingEnd + c0105c.f244d, paddingBottom + c0105c.f246f);
        typedArrayM1041f.recycle();
        setCompoundDrawablePadding(this.f3120n);
        m2061c(this.f3115i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(fMax);
    }

    /* renamed from: a */
    public final boolean m2059a() {
        C0105c c0105c = this.f3110d;
        return (c0105c == null || c0105c.f255o) ? false : true;
    }

    /* renamed from: b */
    public final void m2060b() {
        int i2 = this.f3123q;
        boolean z2 = true;
        if (i2 != 1 && i2 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f3115i, null, null, null);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            setCompoundDrawablesRelative(null, null, this.f3115i, null);
        } else if (i2 == 16 || i2 == 32) {
            setCompoundDrawablesRelative(null, this.f3115i, null, null);
        }
    }

    /* renamed from: c */
    public final void m2061c(boolean z2) {
        Drawable drawable = this.f3115i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f3115i = drawableMutate;
            AbstractC0098a.m300h(drawableMutate, this.f3114h);
            PorterDuff.Mode mode = this.f3113g;
            if (mode != null) {
                AbstractC0098a.m301i(this.f3115i, mode);
            }
            int intrinsicWidth = this.f3117k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f3115i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f3117k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f3115i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3115i;
            int i2 = this.f3118l;
            int i3 = this.f3119m;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.f3115i.setVisible(true, z2);
        }
        if (z2) {
            m2060b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i4 = this.f3123q;
        if (((i4 == 1 || i4 == 2) && drawable3 != this.f3115i) || (((i4 == 3 || i4 == 4) && drawable5 != this.f3115i) || ((i4 == 16 || i4 == 32) && drawable4 != this.f3115i))) {
            m2060b();
        }
    }

    /* renamed from: d */
    public final void m2062d(int i2, int i3) {
        if (this.f3115i == null || getLayout() == null) {
            return;
        }
        int i4 = this.f3123q;
        if (!(i4 == 1 || i4 == 2) && i4 != 3 && i4 != 4) {
            if (i4 == 16 || i4 == 32) {
                this.f3118l = 0;
                if (i4 == 16) {
                    this.f3119m = 0;
                    m2061c(false);
                    return;
                }
                int intrinsicHeight = this.f3117k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f3115i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f3120n) - getPaddingBottom()) / 2);
                if (this.f3119m != iMax) {
                    this.f3119m = iMax;
                    m2061c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f3119m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f3123q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f3118l = 0;
            m2061c(false);
            return;
        }
        int intrinsicWidth = this.f3117k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f3115i.getIntrinsicWidth();
        }
        int textLayoutWidth = i2 - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f3120n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f3123q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f3118l != paddingEnd) {
            this.f3118l = paddingEnd;
            m2061c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f3116j)) {
            return this.f3116j;
        }
        C0105c c0105c = this.f3110d;
        return ((c0105c == null || !c0105c.f257q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m2059a()) {
            return this.f3110d.f247g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3115i;
    }

    public int getIconGravity() {
        return this.f3123q;
    }

    public int getIconPadding() {
        return this.f3120n;
    }

    public int getIconSize() {
        return this.f3117k;
    }

    public ColorStateList getIconTint() {
        return this.f3114h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3113g;
    }

    public int getInsetBottom() {
        return this.f3110d.f246f;
    }

    public int getInsetTop() {
        return this.f3110d.f245e;
    }

    public ColorStateList getRippleColor() {
        if (m2059a()) {
            return this.f3110d.f252l;
        }
        return null;
    }

    public C0517k getShapeAppearanceModel() {
        if (m2059a()) {
            return this.f3110d.f242b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m2059a()) {
            return this.f3110d.f251k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m2059a()) {
            return this.f3110d.f248h;
        }
        return 0;
    }

    @Override // p105j.C1119p
    public ColorStateList getSupportBackgroundTintList() {
        return m2059a() ? this.f3110d.f250j : super.getSupportBackgroundTintList();
    }

    @Override // p105j.C1119p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m2059a() ? this.f3110d.f249i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3121o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m2059a()) {
            AbstractC0364l.m999f0(this, this.f3110d.m310b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        C0105c c0105c = this.f3110d;
        if (c0105c != null && c0105c.f257q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3108r);
        }
        if (this.f3121o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3109s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p105j.C1119p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f3121o);
    }

    @Override // p105j.C1119p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C0105c c0105c = this.f3110d;
        accessibilityNodeInfo.setCheckable(c0105c != null && c0105c.f257q);
        accessibilityNodeInfo.setChecked(this.f3121o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p105j.C1119p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        m2062d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0104b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0104b c0104b = (C0104b) parcelable;
        super.onRestoreInstanceState(c0104b.f1521a);
        setChecked(c0104b.f240c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0104b c0104b = new C0104b(super.onSaveInstanceState());
        c0104b.f240c = this.f3121o;
        return c0104b;
    }

    @Override // p105j.C1119p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        m2062d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f3110d.f258r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f3115i != null) {
            if (this.f3115i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f3116j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (!m2059a()) {
            super.setBackgroundColor(i2);
            return;
        }
        C0105c c0105c = this.f3110d;
        if (c0105c.m310b(false) != null) {
            c0105c.m310b(false).setTint(i2);
        }
    }

    @Override // p105j.C1119p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m2059a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        C0105c c0105c = this.f3110d;
        c0105c.f255o = true;
        ColorStateList colorStateList = c0105c.f250j;
        MaterialButton materialButton = c0105c.f241a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c0105c.f249i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p105j.C1119p, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? AbstractC0901d.m2321x(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (m2059a()) {
            this.f3110d.f257q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        C0105c c0105c = this.f3110d;
        if (c0105c == null || !c0105c.f257q || !isEnabled() || this.f3121o == z2) {
            return;
        }
        this.f3121o = z2;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z3 = this.f3121o;
            if (!materialButtonToggleGroup.f3130f) {
                materialButtonToggleGroup.m2064b(getId(), z3);
            }
        }
        if (this.f3122p) {
            return;
        }
        this.f3122p = true;
        Iterator it = this.f3111e.iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
        this.f3122p = false;
    }

    public void setCornerRadius(int i2) {
        if (m2059a()) {
            C0105c c0105c = this.f3110d;
            if (c0105c.f256p && c0105c.f247g == i2) {
                return;
            }
            c0105c.f247g = i2;
            c0105c.f256p = true;
            float f = i2;
            C0516j c0516jM1300e = c0105c.f242b.m1300e();
            c0516jM1300e.f1628e = new C0507a(f);
            c0516jM1300e.f1629f = new C0507a(f);
            c0516jM1300e.f1630g = new C0507a(f);
            c0516jM1300e.f1631h = new C0507a(f);
            c0105c.m311c(c0516jM1300e.m1295a());
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (m2059a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m2059a()) {
            this.f3110d.m310b(false).m1289i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3115i != drawable) {
            this.f3115i = drawable;
            m2061c(true);
            m2062d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f3123q != i2) {
            this.f3123q = i2;
            m2062d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f3120n != i2) {
            this.f3120n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? AbstractC0901d.m2321x(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f3117k != i2) {
            this.f3117k = i2;
            m2061c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3114h != colorStateList) {
            this.f3114h = colorStateList;
            m2061c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3113g != mode) {
            this.f3113g = mode;
            m2061c(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(AbstractC0356d.m969s(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        C0105c c0105c = this.f3110d;
        c0105c.m312d(c0105c.f245e, i2);
    }

    public void setInsetTop(int i2) {
        C0105c c0105c = this.f3110d;
        c0105c.m312d(i2, c0105c.f246f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0103a interfaceC0103a) {
        this.f3112f = interfaceC0103a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC0103a interfaceC0103a = this.f3112f;
        if (interfaceC0103a != null) {
            ((MaterialButtonToggleGroup) ((C0004c) interfaceC0103a).f7b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m2059a()) {
            C0105c c0105c = this.f3110d;
            if (c0105c.f252l != colorStateList) {
                c0105c.f252l = colorStateList;
                MaterialButton materialButton = c0105c.f241a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC0472a.m1161a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (m2059a()) {
            setRippleColor(AbstractC0356d.m969s(getContext(), i2));
        }
    }

    @Override // p055T0.InterfaceC0528v
    public void setShapeAppearanceModel(C0517k c0517k) {
        if (!m2059a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f3110d.m311c(c0517k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (m2059a()) {
            C0105c c0105c = this.f3110d;
            c0105c.f254n = z2;
            c0105c.m314f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m2059a()) {
            C0105c c0105c = this.f3110d;
            if (c0105c.f251k != colorStateList) {
                c0105c.f251k = colorStateList;
                c0105c.m314f();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (m2059a()) {
            setStrokeColor(AbstractC0356d.m969s(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (m2059a()) {
            C0105c c0105c = this.f3110d;
            if (c0105c.f248h != i2) {
                c0105c.f248h = i2;
                c0105c.m314f();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (m2059a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // p105j.C1119p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m2059a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0105c c0105c = this.f3110d;
        if (c0105c.f250j != colorStateList) {
            c0105c.f250j = colorStateList;
            if (c0105c.m310b(false) != null) {
                AbstractC0098a.m300h(c0105c.m310b(false), c0105c.f250j);
            }
        }
    }

    @Override // p105j.C1119p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m2059a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0105c c0105c = this.f3110d;
        if (c0105c.f249i != mode) {
            c0105c.f249i = mode;
            if (c0105c.m310b(false) == null || c0105c.f249i == null) {
                return;
            }
            AbstractC0098a.m301i(c0105c.m310b(false), c0105c.f249i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        m2062d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f3110d.f258r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3121o);
    }
}
