package p055T0;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: T0.r */
/* loaded from: classes.dex */
public final class C0524r extends AbstractC0525s {

    /* renamed from: b */
    public float f1674b;

    /* renamed from: c */
    public float f1675c;

    @Override // p055T0.AbstractC0525s
    /* renamed from: a */
    public final void mo1305a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1676a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1674b, this.f1675c);
        path.transform(matrix);
    }
}
