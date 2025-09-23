package p072Z;

import android.view.animation.Interpolator;

/* renamed from: Z.b */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0604b implements Interpolator {

    /* renamed from: a */
    public final float[] f1915a;

    /* renamed from: b */
    public final float f1916b;

    public AbstractInterpolatorC0604b(float[] fArr) {
        this.f1915a = fArr;
        this.f1916b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1915a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f1916b;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return ((fArr[iMin + 1] - f4) * f3) + f4;
    }
}
