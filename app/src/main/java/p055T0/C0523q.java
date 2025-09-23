package p055T0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: T0.q */
/* loaded from: classes.dex */
public final class C0523q extends AbstractC0525s {

    /* renamed from: h */
    public static final RectF f1667h = new RectF();

    /* renamed from: b */
    public final float f1668b;

    /* renamed from: c */
    public final float f1669c;

    /* renamed from: d */
    public final float f1670d;

    /* renamed from: e */
    public final float f1671e;

    /* renamed from: f */
    public float f1672f;

    /* renamed from: g */
    public float f1673g;

    public C0523q(float f, float f2, float f3, float f4) {
        this.f1668b = f;
        this.f1669c = f2;
        this.f1670d = f3;
        this.f1671e = f4;
    }

    @Override // p055T0.AbstractC0525s
    /* renamed from: a */
    public final void mo1305a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1676a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f1667h;
        rectF.set(this.f1668b, this.f1669c, this.f1670d, this.f1671e);
        path.arcTo(rectF, this.f1672f, this.f1673g, false);
        path.transform(matrix);
    }
}
