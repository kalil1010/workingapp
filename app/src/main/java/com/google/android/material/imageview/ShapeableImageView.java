package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import p032L0.C0352a;
import p033L1.AbstractC0356d;
import p055T0.AbstractC0518l;
import p055T0.C0513g;
import p055T0.C0517k;
import p055T0.C0519m;
import p055T0.InterfaceC0528v;
import p070Y0.AbstractC0601a;
import p093e2.AbstractC0901d;
import p105j.C1142y;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class ShapeableImageView extends C1142y implements InterfaceC0528v {

    /* renamed from: d */
    public final C0519m f3248d;

    /* renamed from: e */
    public final RectF f3249e;

    /* renamed from: f */
    public final RectF f3250f;

    /* renamed from: g */
    public final Paint f3251g;

    /* renamed from: h */
    public final Paint f3252h;

    /* renamed from: i */
    public final Path f3253i;

    /* renamed from: j */
    public ColorStateList f3254j;

    /* renamed from: k */
    public C0513g f3255k;

    /* renamed from: l */
    public C0517k f3256l;

    /* renamed from: m */
    public float f3257m;

    /* renamed from: n */
    public final Path f3258n;

    /* renamed from: o */
    public final int f3259o;

    /* renamed from: p */
    public final int f3260p;

    /* renamed from: q */
    public final int f3261q;

    /* renamed from: r */
    public final int f3262r;

    /* renamed from: s */
    public final int f3263s;

    /* renamed from: t */
    public final int f3264t;

    /* renamed from: u */
    public boolean f3265u;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(AbstractC0601a.m1405a(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f3248d = AbstractC0518l.f1648a;
        this.f3253i = new Path();
        this.f3265u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f3252h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f3249e = new RectF();
        this.f3250f = new RectF();
        this.f3258n = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1395a.f6056y, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f3254j = AbstractC0901d.m2318t(context2, typedArrayObtainStyledAttributes, 9);
        this.f3257m = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3259o = dimensionPixelSize;
        this.f3260p = dimensionPixelSize;
        this.f3261q = dimensionPixelSize;
        this.f3262r = dimensionPixelSize;
        this.f3259o = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f3260p = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f3261q = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f3262r = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f3263s = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f3264t = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f3251g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f3256l = C0517k.m1297b(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).m1295a();
        setOutlineProvider(new C0352a(this));
    }

    /* renamed from: c */
    public final boolean m2101c() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: d */
    public final void m2102d(int i2, int i3) {
        RectF rectF = this.f3249e;
        rectF.set(getPaddingLeft(), getPaddingTop(), i2 - getPaddingRight(), i3 - getPaddingBottom());
        C0517k c0517k = this.f3256l;
        Path path = this.f3253i;
        this.f3248d.m1301a(c0517k, 1.0f, rectF, null, path);
        Path path2 = this.f3258n;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f3250f;
        rectF2.set(0.0f, 0.0f, i2, i3);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f3262r;
    }

    public final int getContentPaddingEnd() {
        int i2 = this.f3264t;
        return i2 != Integer.MIN_VALUE ? i2 : m2101c() ? this.f3259o : this.f3261q;
    }

    public int getContentPaddingLeft() {
        int i2;
        int i3;
        if (this.f3263s != Integer.MIN_VALUE || this.f3264t != Integer.MIN_VALUE) {
            if (m2101c() && (i3 = this.f3264t) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!m2101c() && (i2 = this.f3263s) != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f3259o;
    }

    public int getContentPaddingRight() {
        int i2;
        int i3;
        if (this.f3263s != Integer.MIN_VALUE || this.f3264t != Integer.MIN_VALUE) {
            if (m2101c() && (i3 = this.f3263s) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!m2101c() && (i2 = this.f3264t) != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f3261q;
    }

    public final int getContentPaddingStart() {
        int i2 = this.f3263s;
        return i2 != Integer.MIN_VALUE ? i2 : m2101c() ? this.f3261q : this.f3259o;
    }

    public int getContentPaddingTop() {
        return this.f3260p;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C0517k getShapeAppearanceModel() {
        return this.f3256l;
    }

    public ColorStateList getStrokeColor() {
        return this.f3254j;
    }

    public float getStrokeWidth() {
        return this.f3257m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f3258n, this.f3252h);
        if (this.f3254j == null) {
            return;
        }
        Paint paint = this.f3251g;
        paint.setStrokeWidth(this.f3257m);
        int colorForState = this.f3254j.getColorForState(getDrawableState(), this.f3254j.getDefaultColor());
        if (this.f3257m <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f3253i, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.f3265u && isLayoutDirectionResolved()) {
            this.f3265u = true;
            if (!isPaddingRelative() && this.f3263s == Integer.MIN_VALUE && this.f3264t == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        m2102d(i2, i3);
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(getContentPaddingLeft() + i2, getContentPaddingTop() + i3, getContentPaddingRight() + i4, getContentPaddingBottom() + i5);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(getContentPaddingStart() + i2, getContentPaddingTop() + i3, getContentPaddingEnd() + i4, getContentPaddingBottom() + i5);
    }

    @Override // p055T0.InterfaceC0528v
    public void setShapeAppearanceModel(C0517k c0517k) {
        this.f3256l = c0517k;
        C0513g c0513g = this.f3255k;
        if (c0513g != null) {
            c0513g.setShapeAppearanceModel(c0517k);
        }
        m2102d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f3254j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i2) {
        setStrokeColor(AbstractC0356d.m969s(getContext(), i2));
    }

    public void setStrokeWidth(float f) {
        if (this.f3257m != f) {
            this.f3257m = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i2) {
        setStrokeWidth(getResources().getDimensionPixelSize(i2));
    }
}
