package p117n;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: n.a */
/* loaded from: classes.dex */
public final class C1235a extends Drawable {

    /* renamed from: a */
    public float f4953a;

    /* renamed from: b */
    public final Paint f4954b;

    /* renamed from: c */
    public final RectF f4955c;

    /* renamed from: d */
    public final Rect f4956d;

    /* renamed from: e */
    public float f4957e;

    /* renamed from: h */
    public ColorStateList f4960h;

    /* renamed from: i */
    public PorterDuffColorFilter f4961i;

    /* renamed from: j */
    public ColorStateList f4962j;

    /* renamed from: f */
    public boolean f4958f = false;

    /* renamed from: g */
    public boolean f4959g = true;

    /* renamed from: k */
    public PorterDuff.Mode f4963k = PorterDuff.Mode.SRC_IN;

    public C1235a(ColorStateList colorStateList, float f) {
        this.f4953a = f;
        Paint paint = new Paint(5);
        this.f4954b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f4960h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f4960h.getDefaultColor()));
        this.f4955c = new RectF();
        this.f4956d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m2870a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void m2871b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f4955c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f4956d;
        rect2.set(rect);
        if (this.f4958f) {
            rect2.inset((int) Math.ceil(AbstractC1236b.m2872a(this.f4957e, this.f4953a, this.f4959g)), (int) Math.ceil(AbstractC1236b.m2873b(this.f4957e, this.f4953a, this.f4959g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f4954b;
        if (this.f4961i == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.f4961i);
            z2 = true;
        }
        RectF rectF = this.f4955c;
        float f = this.f4953a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f4956d, this.f4953a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f4962j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f4960h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2871b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4960h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f4954b;
        boolean z2 = colorForState != paint.getColor();
        if (z2) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f4962j;
        if (colorStateList2 == null || (mode = this.f4963k) == null) {
            return z2;
        }
        this.f4961i = m2870a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f4954b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4954b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f4962j = colorStateList;
        this.f4961i = m2870a(colorStateList, this.f4963k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f4963k = mode;
        this.f4961i = m2870a(this.f4962j, mode);
        invalidateSelf();
    }
}
