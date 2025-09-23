package p064W0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p055T0.C0513g;

/* renamed from: W0.g */
/* loaded from: classes.dex */
public final class C0561g extends C0513g {

    /* renamed from: y */
    public static final /* synthetic */ int f1753y = 0;

    /* renamed from: x */
    public C0560f f1754x;

    @Override // p055T0.C0513g
    /* renamed from: e */
    public final void mo1285e(Canvas canvas) {
        if (this.f1754x.f1752q.isEmpty()) {
            super.mo1285e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f1754x.f1752q);
        } else {
            canvas.clipRect(this.f1754x.f1752q, Region.Op.DIFFERENCE);
        }
        super.mo1285e(canvas);
        canvas.restore();
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1754x = new C0560f(this.f1754x);
        return this;
    }

    /* renamed from: n */
    public final void m1345n(float f, float f2, float f3, float f4) {
        RectF rectF = this.f1754x.f1752q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
