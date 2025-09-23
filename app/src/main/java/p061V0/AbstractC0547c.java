package p061V0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import p009D.AbstractC0098a;
import p028K.AbstractC0228C;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0368A;
import p055T0.C0513g;
import p055T0.C0517k;
import p070Y0.AbstractC0601a;
import p093e2.AbstractC0901d;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: V0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0547c extends FrameLayout {

    /* renamed from: i */
    public static final ViewOnTouchListenerC0546b f1721i = new ViewOnTouchListenerC0546b();

    /* renamed from: a */
    public final C0517k f1722a;

    /* renamed from: b */
    public int f1723b;

    /* renamed from: c */
    public final float f1724c;

    /* renamed from: d */
    public final float f1725d;

    /* renamed from: e */
    public final int f1726e;

    /* renamed from: f */
    public final int f1727f;

    /* renamed from: g */
    public ColorStateList f1728g;

    /* renamed from: h */
    public PorterDuff.Mode f1729h;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0547c(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(AbstractC0601a.m1405a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1395a.f6027A);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            AbstractC0230E.m636s(this, dimensionPixelSize);
        }
        this.f1723b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f1722a = C0517k.m1297b(context2, attributeSet, 0, 0).m1295a();
        }
        this.f1724c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0901d.m2318t(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC0368A.m1042g(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1725d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f1726e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1727f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f1721i);
        setFocusable(true);
        if (getBackground() == null) {
            int iM990Q = AbstractC0364l.m990Q(AbstractC0364l.m983G(this, R.attr.colorSurface), AbstractC0364l.m983G(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            C0517k c0517k = this.f1722a;
            if (c0517k != null) {
                int i2 = AbstractC0548d.f1730a;
                C0513g c0513g = new C0513g(c0517k);
                c0513g.m1290j(ColorStateList.valueOf(iM990Q));
                gradientDrawable = c0513g;
            } else {
                Resources resources = getResources();
                int i3 = AbstractC0548d.f1730a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iM990Q);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f1728g;
            if (colorStateList != null) {
                AbstractC0098a.m300h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(AbstractC0548d abstractC0548d) {
    }

    public float getActionTextColorAlpha() {
        return this.f1725d;
    }

    public int getAnimationMode() {
        return this.f1723b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1724c;
    }

    public int getMaxInlineActionWidth() {
        return this.f1727f;
    }

    public int getMaxWidth() {
        return this.f1726e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        AbstractC0228C.m617c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f1726e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f1723b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f1728g != null) {
            drawable = drawable.mutate();
            AbstractC0098a.m300h(drawable, this.f1728g);
            AbstractC0098a.m301i(drawable, this.f1729h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1728g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC0098a.m300h(drawableMutate, colorStateList);
            AbstractC0098a.m301i(drawableMutate, this.f1729h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1729h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC0098a.m301i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f1721i);
        super.setOnClickListener(onClickListener);
    }
}
