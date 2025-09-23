package p055T0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p052S0.C0499a;

/* renamed from: T0.p */
/* loaded from: classes.dex */
public final class C0522p extends AbstractC0526t {

    /* renamed from: c */
    public final C0524r f1664c;

    /* renamed from: d */
    public final float f1665d;

    /* renamed from: e */
    public final float f1666e;

    public C0522p(C0524r c0524r, float f, float f2) {
        this.f1664c = c0524r;
        this.f1665d = f;
        this.f1666e = f2;
    }

    @Override // p055T0.AbstractC0526t
    /* renamed from: a */
    public final void mo1303a(Matrix matrix, C0499a c0499a, int i2, Canvas canvas) {
        C0524r c0524r = this.f1664c;
        float f = c0524r.f1675c;
        float f2 = this.f1666e;
        float f3 = c0524r.f1674b;
        float f4 = this.f1665d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f1678a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m1304b());
        c0499a.getClass();
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = C0499a.f1522i;
        iArr[0] = c0499a.f1531f;
        iArr[1] = c0499a.f1530e;
        iArr[2] = c0499a.f1529d;
        Paint paint = c0499a.f1528c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C0499a.f1523j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* renamed from: b */
    public final float m1304b() {
        C0524r c0524r = this.f1664c;
        return (float) Math.toDegrees(Math.atan((c0524r.f1675c - this.f1666e) / (c0524r.f1674b - this.f1665d)));
    }
}
