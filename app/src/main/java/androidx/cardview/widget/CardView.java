package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p002A1.C0019a;
import p080b1.C0767e;
import p114m.AbstractC1229a;
import p117n.C1235a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f */
    public static final int[] f2250f = {R.attr.colorBackground};

    /* renamed from: g */
    public static final C0767e f2251g = new C0767e(11);

    /* renamed from: a */
    public boolean f2252a;

    /* renamed from: b */
    public boolean f2253b;

    /* renamed from: c */
    public final Rect f2254c;

    /* renamed from: d */
    public final Rect f2255d;

    /* renamed from: e */
    public final C0019a f2256e;

    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f2254c = rect;
        this.f2255d = new Rect();
        C0019a c0019a = new C0019a(21, this);
        this.f2256e = c0019a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1229a.f4936a, tkbmmn.ghwbbf.irvjzy.R.attr.cardViewStyle, tkbmmn.ghwbbf.irvjzy.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f2250f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(tkbmmn.ghwbbf.irvjzy.R.color.cardview_light_background) : getResources().getColor(tkbmmn.ghwbbf.irvjzy.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f2252a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f2253b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C0767e c0767e = f2251g;
        C1235a c1235a = new C1235a(colorStateListValueOf, dimension);
        c0019a.f47c = c1235a;
        setBackgroundDrawable(c1235a);
        setClipToOutline(true);
        setElevation(dimension2);
        c0767e.m1981k(c0019a, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1235a) ((Drawable) this.f2256e.f47c)).f4960h;
    }

    public float getCardElevation() {
        return ((CardView) this.f2256e.f46b).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f2254c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2254c.left;
    }

    public int getContentPaddingRight() {
        return this.f2254c.right;
    }

    public int getContentPaddingTop() {
        return this.f2254c.top;
    }

    public float getMaxCardElevation() {
        return ((C1235a) ((Drawable) this.f2256e.f47c)).f4957e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2253b;
    }

    public float getRadius() {
        return ((C1235a) ((Drawable) this.f2256e.f47c)).f4953a;
    }

    public boolean getUseCompatPadding() {
        return this.f2252a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
        C1235a c1235a = (C1235a) ((Drawable) this.f2256e.f47c);
        if (colorStateListValueOf == null) {
            c1235a.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c1235a.f4960h = colorStateListValueOf;
        c1235a.f4954b.setColor(colorStateListValueOf.getColorForState(c1235a.getState(), c1235a.f4960h.getDefaultColor()));
        c1235a.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.f2256e.f46b).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f2251g.m1981k(this.f2256e, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f2253b) {
            this.f2253b = z2;
            C0767e c0767e = f2251g;
            C0019a c0019a = this.f2256e;
            c0767e.m1981k(c0019a, ((C1235a) ((Drawable) c0019a.f47c)).f4957e);
        }
    }

    public void setRadius(float f) {
        C1235a c1235a = (C1235a) ((Drawable) this.f2256e.f47c);
        if (f == c1235a.f4953a) {
            return;
        }
        c1235a.f4953a = f;
        c1235a.m2871b(null);
        c1235a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f2252a != z2) {
            this.f2252a = z2;
            C0767e c0767e = f2251g;
            C0019a c0019a = this.f2256e;
            c0767e.m1981k(c0019a, ((C1235a) ((Drawable) c0019a.f47c)).f4957e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1235a c1235a = (C1235a) ((Drawable) this.f2256e.f47c);
        if (colorStateList == null) {
            c1235a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c1235a.f4960h = colorStateList;
        c1235a.f4954b.setColor(colorStateList.getColorForState(c1235a.getState(), c1235a.f4960h.getDefaultColor()));
        c1235a.invalidateSelf();
    }
}
