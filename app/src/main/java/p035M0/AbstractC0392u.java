package p035M0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* renamed from: M0.u */
/* loaded from: classes.dex */
public abstract class AbstractC0392u extends FrameLayout {

    /* renamed from: a */
    public Drawable f1250a;

    /* renamed from: b */
    public Rect f1251b;

    /* renamed from: c */
    public Rect f1252c;

    /* renamed from: d */
    public boolean f1253d;

    /* renamed from: e */
    public boolean f1254e;

    /* renamed from: f */
    public boolean f1255f;

    /* renamed from: g */
    public boolean f1256g;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f1251b == null || this.f1250a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z2 = this.f1253d;
        Rect rect = this.f1252c;
        if (z2) {
            rect.set(0, 0, width, this.f1251b.top);
            this.f1250a.setBounds(rect);
            this.f1250a.draw(canvas);
        }
        if (this.f1254e) {
            rect.set(0, height - this.f1251b.bottom, width, height);
            this.f1250a.setBounds(rect);
            this.f1250a.draw(canvas);
        }
        if (this.f1255f) {
            Rect rect2 = this.f1251b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f1250a.setBounds(rect);
            this.f1250a.draw(canvas);
        }
        if (this.f1256g) {
            Rect rect3 = this.f1251b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f1250a.setBounds(rect);
            this.f1250a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f1250a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f1250a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z2) {
        this.f1254e = z2;
    }

    public void setDrawLeftInsetForeground(boolean z2) {
        this.f1255f = z2;
    }

    public void setDrawRightInsetForeground(boolean z2) {
        this.f1256g = z2;
    }

    public void setDrawTopInsetForeground(boolean z2) {
        this.f1253d = z2;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f1250a = drawable;
    }
}
