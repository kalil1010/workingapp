package p035M0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p105j.AbstractC1145z0;
import p145x0.AbstractC1395a;

/* renamed from: M0.d */
/* loaded from: classes.dex */
public abstract class AbstractC0375d extends AbstractC1145z0 {

    /* renamed from: p */
    public Drawable f1202p;

    /* renamed from: q */
    public final Rect f1203q;

    /* renamed from: r */
    public final Rect f1204r;

    /* renamed from: s */
    public int f1205s;

    /* renamed from: t */
    public final boolean f1206t;

    /* renamed from: u */
    public boolean f1207u;

    public AbstractC0375d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1203q = new Rect();
        this.f1204r = new Rect();
        this.f1205s = 119;
        this.f1206t = true;
        this.f1207u = false;
        int[] iArr = AbstractC1395a.f6039h;
        AbstractC0368A.m1036a(context, attributeSet, 0, 0);
        AbstractC0368A.m1037b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f1205s = typedArrayObtainStyledAttributes.getInt(1, this.f1205s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1206t = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1202p;
        if (drawable != null) {
            if (this.f1207u) {
                this.f1207u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f1206t;
                Rect rect = this.f1203q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i2 = this.f1205s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f1204r;
                Gravity.apply(i2, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1202p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1202p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f1202p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f1202p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f1205s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1202p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p105j.AbstractC1145z0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.f1207u = z2 | this.f1207u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f1207u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f1202p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1202p);
            }
            this.f1202p = drawable;
            this.f1207u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1205s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
        if (this.f1205s != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1205s = i2;
            if (i2 == 119 && this.f1202p != null) {
                this.f1202p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1202p;
    }
}
