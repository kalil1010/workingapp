package p015F0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p001A0.C0002a;
import p002A1.C0027i;
import p003B.AbstractC0054j;
import p003B.AbstractC0060p;
import p006C.AbstractC0075g;
import p009D.AbstractC0098a;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0368A;
import p045Q.AbstractC0438b;
import p045Q.AbstractC0439c;
import p070Y0.AbstractC0601a;
import p093e2.AbstractC0901d;
import p105j.C1122q;
import p109k0.C1184b;
import p109k0.C1186d;
import p109k0.C1187e;
import p109k0.C1188f;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: F0.d */
/* loaded from: classes.dex */
public final class C0149d extends C1122q {

    /* renamed from: e */
    public final LinkedHashSet f510e;

    /* renamed from: f */
    public final LinkedHashSet f511f;

    /* renamed from: g */
    public ColorStateList f512g;

    /* renamed from: h */
    public boolean f513h;

    /* renamed from: i */
    public boolean f514i;

    /* renamed from: j */
    public boolean f515j;

    /* renamed from: k */
    public CharSequence f516k;

    /* renamed from: l */
    public Drawable f517l;

    /* renamed from: m */
    public Drawable f518m;

    /* renamed from: n */
    public boolean f519n;

    /* renamed from: o */
    public ColorStateList f520o;

    /* renamed from: p */
    public ColorStateList f521p;

    /* renamed from: q */
    public PorterDuff.Mode f522q;

    /* renamed from: r */
    public int f523r;

    /* renamed from: s */
    public int[] f524s;

    /* renamed from: t */
    public boolean f525t;

    /* renamed from: u */
    public CharSequence f526u;

    /* renamed from: v */
    public CompoundButton.OnCheckedChangeListener f527v;

    /* renamed from: w */
    public final C1188f f528w;

    /* renamed from: x */
    public final C0146a f529x;

    /* renamed from: y */
    public static final int[] f508y = {R.attr.state_indeterminate};

    /* renamed from: z */
    public static final int[] f509z = {R.attr.state_error};

    /* renamed from: A */
    public static final int[][] f506A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B */
    public static final int f507B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C0149d(Context context, AttributeSet attributeSet) {
        super(AbstractC0601a.m1405a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f510e = new LinkedHashSet();
        this.f511f = new LinkedHashSet();
        Context context2 = getContext();
        C1188f c1188f = new C1188f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC0060p.f137a;
        Drawable drawableM181a = AbstractC0054j.m181a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c1188f.f4824a = drawableM181a;
        drawableM181a.setCallback(c1188f.f4823f);
        new C1187e(c1188f.f4824a.getConstantState());
        this.f528w = c1188f;
        this.f529x = new C0146a(this);
        Context context3 = getContext();
        this.f517l = AbstractC0439c.m1106a(this);
        this.f520o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC1395a.f6045n;
        AbstractC0368A.m1036a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        AbstractC0368A.m1037b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0027i c0027i = new C0027i(context3, typedArrayObtainStyledAttributes);
        this.f518m = c0027i.m100B(2);
        if (this.f517l != null && AbstractC0364l.m996c0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f507B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f517l = AbstractC0901d.m2321x(context3, R.drawable.mtrl_checkbox_button);
                this.f519n = true;
                if (this.f518m == null) {
                    this.f518m = AbstractC0901d.m2321x(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f521p = AbstractC0901d.m2316s(context3, c0027i, 3);
        this.f522q = AbstractC0368A.m1042g(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f513h = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f514i = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f515j = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f516k = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c0027i.m114R();
        m414a();
    }

    private String getButtonStateDescription() {
        int i2 = this.f523r;
        return i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f512g == null) {
            int iM983G = AbstractC0364l.m983G(this, R.attr.colorControlActivated);
            int iM983G2 = AbstractC0364l.m983G(this, R.attr.colorError);
            int iM983G3 = AbstractC0364l.m983G(this, R.attr.colorSurface);
            int iM983G4 = AbstractC0364l.m983G(this, R.attr.colorOnSurface);
            this.f512g = new ColorStateList(f506A, new int[]{AbstractC0364l.m990Q(iM983G3, iM983G2, 1.0f), AbstractC0364l.m990Q(iM983G3, iM983G, 1.0f), AbstractC0364l.m990Q(iM983G3, iM983G4, 0.54f), AbstractC0364l.m990Q(iM983G3, iM983G4, 0.38f), AbstractC0364l.m990Q(iM983G3, iM983G4, 0.38f)});
        }
        return this.f512g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f520o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* renamed from: a */
    public final void m414a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0002a c0002a;
        Drawable drawableMutate = this.f517l;
        ColorStateList colorStateList3 = this.f520o;
        PorterDuff.Mode modeM1103b = AbstractC0438b.m1103b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeM1103b != null) {
                AbstractC0098a.m301i(drawableMutate, modeM1103b);
            }
        }
        this.f517l = drawableMutate;
        Drawable drawableMutate2 = this.f518m;
        ColorStateList colorStateList4 = this.f521p;
        PorterDuff.Mode mode = this.f522q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                AbstractC0098a.m301i(drawableMutate2, mode);
            }
        }
        this.f518m = drawableMutate2;
        if (this.f519n) {
            C1188f c1188f = this.f528w;
            if (c1188f != null) {
                Drawable drawable = c1188f.f4824a;
                C0146a c0146a = this.f529x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0146a.f502a == null) {
                        c0146a.f502a = new C1184b(c0146a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0146a.f502a);
                }
                ArrayList arrayList = c1188f.f4822e;
                C1186d c1186d = c1188f.f4819b;
                if (arrayList != null && c0146a != null) {
                    arrayList.remove(c0146a);
                    if (c1188f.f4822e.size() == 0 && (c0002a = c1188f.f4821d) != null) {
                        c1186d.f4815b.removeListener(c0002a);
                        c1188f.f4821d = null;
                    }
                }
                Drawable drawable2 = c1188f.f4824a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0146a.f502a == null) {
                        c0146a.f502a = new C1184b(c0146a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0146a.f502a);
                } else if (c0146a != null) {
                    if (c1188f.f4822e == null) {
                        c1188f.f4822e = new ArrayList();
                    }
                    if (!c1188f.f4822e.contains(c0146a)) {
                        c1188f.f4822e.add(c0146a);
                        if (c1188f.f4821d == null) {
                            c1188f.f4821d = new C0002a(8, c1188f);
                        }
                        c1186d.f4815b.addListener(c1188f.f4821d);
                    }
                }
            }
            Drawable drawable3 = this.f517l;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c1188f != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c1188f, false);
                ((AnimatedStateListDrawable) this.f517l).addTransition(R.id.indeterminate, R.id.unchecked, c1188f, false);
            }
        }
        Drawable drawable4 = this.f517l;
        if (drawable4 != null && (colorStateList2 = this.f520o) != null) {
            AbstractC0098a.m300h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f518m;
        if (drawable5 != null && (colorStateList = this.f521p) != null) {
            AbstractC0098a.m300h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f517l;
        Drawable drawable7 = this.f518m;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f517l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f518m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f521p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f522q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f520o;
    }

    public int getCheckedState() {
        return this.f523r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f516k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f523r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f513h && this.f520o == null && this.f521p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f508y);
        }
        if (this.f515j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f509z);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i4 = iArrOnCreateDrawableState[i3];
            if (i4 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i4 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i3] = 16842912;
                break;
            }
            i3++;
        }
        this.f524s = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableM1106a;
        if (!this.f514i || !TextUtils.isEmpty(getText()) || (drawableM1106a = AbstractC0439c.m1106a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM1106a.getIntrinsicWidth()) / 2) * (AbstractC0368A.m1040e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM1106a.getBounds();
            AbstractC0098a.m298f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f515j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f516k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0148c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0148c c0148c = (C0148c) parcelable;
        super.onRestoreInstanceState(c0148c.getSuperState());
        setCheckedState(c0148c.f505a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0148c c0148c = new C0148c(super.onSaveInstanceState());
        c0148c.f505a = getCheckedState();
        return c0148c;
    }

    @Override // p105j.C1122q, android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(AbstractC0901d.m2321x(getContext(), i2));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f518m = drawable;
        m414a();
    }

    public void setButtonIconDrawableResource(int i2) {
        setButtonIconDrawable(AbstractC0901d.m2321x(getContext(), i2));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f521p == colorStateList) {
            return;
        }
        this.f521p = colorStateList;
        m414a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f522q == mode) {
            return;
        }
        this.f522q = mode;
        m414a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f520o == colorStateList) {
            return;
        }
        this.f520o = colorStateList;
        m414a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m414a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f514i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i2) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f523r != i2) {
            this.f523r = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30 && this.f526u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f525t) {
                return;
            }
            this.f525t = true;
            LinkedHashSet linkedHashSet = this.f511f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC0075g.m235d(it);
                }
            }
            if (this.f523r != 2 && (onCheckedChangeListener = this.f527v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i3 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f525t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f516k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i2) {
        setErrorAccessibilityLabel(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f515j == z2) {
            return;
        }
        this.f515j = z2;
        refreshDrawableState();
        Iterator it = this.f510e.iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f527v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f526u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f513h = z2;
        if (z2) {
            AbstractC0438b.m1104c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0438b.m1104c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p105j.C1122q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f517l = drawable;
        this.f519n = false;
        m414a();
    }
}
