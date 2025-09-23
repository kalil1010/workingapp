package p055T0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p052S0.C0499a;

/* renamed from: T0.o */
/* loaded from: classes.dex */
public final class C0521o extends AbstractC0526t {

    /* renamed from: c */
    public final C0523q f1663c;

    public C0521o(C0523q c0523q) {
        this.f1663c = c0523q;
    }

    @Override // p055T0.AbstractC0526t
    /* renamed from: a */
    public final void mo1303a(Matrix matrix, C0499a c0499a, int i2, Canvas canvas) {
        C0523q c0523q = this.f1663c;
        float f = c0523q.f1672f;
        float f2 = c0523q.f1673g;
        RectF rectF = new RectF(c0523q.f1668b, c0523q.f1669c, c0523q.f1670d, c0523q.f1671e);
        c0499a.getClass();
        boolean z2 = f2 < 0.0f;
        Path path = c0499a.f1532g;
        int[] iArr = C0499a.f1524k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = c0499a.f1531f;
            iArr[2] = c0499a.f1530e;
            iArr[3] = c0499a.f1529d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i2;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c0499a.f1529d;
            iArr[2] = c0499a.f1530e;
            iArr[3] = c0499a.f1531f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i2 / fWidth);
        float[] fArr = C0499a.f1525l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c0499a.f1527b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c0499a.f1533h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
