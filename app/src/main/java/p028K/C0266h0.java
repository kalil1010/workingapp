package p028K;

import android.os.Build;
import android.view.animation.Interpolator;
import p026J0.AbstractC0217b;

/* renamed from: K.h0 */
/* loaded from: classes.dex */
public final class C0266h0 {

    /* renamed from: a */
    public AbstractC0264g0 f867a;

    public C0266h0(int i2, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f867a = new C0262f0(AbstractC0217b.m580i(i2, interpolator, j2));
        } else {
            this.f867a = new C0258d0(i2, interpolator, j2);
        }
    }
}
