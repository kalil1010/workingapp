package p028K;

import android.view.animation.Interpolator;

/* renamed from: K.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC0264g0 {

    /* renamed from: a */
    public final int f855a;

    /* renamed from: b */
    public float f856b;

    /* renamed from: c */
    public final Interpolator f857c;

    /* renamed from: d */
    public final long f858d;

    public AbstractC0264g0(int i2, Interpolator interpolator, long j2) {
        this.f855a = i2;
        this.f857c = interpolator;
        this.f858d = j2;
    }

    /* renamed from: a */
    public long mo741a() {
        return this.f858d;
    }

    /* renamed from: b */
    public float mo742b() {
        Interpolator interpolator = this.f857c;
        return interpolator != null ? interpolator.getInterpolation(this.f856b) : this.f856b;
    }

    /* renamed from: c */
    public int mo743c() {
        return this.f855a;
    }

    /* renamed from: d */
    public void mo744d(float f) {
        this.f856b = f;
    }
}
