package p028K;

import android.view.WindowInsetsAnimation;

/* renamed from: K.f0 */
/* loaded from: classes.dex */
public final class C0262f0 extends AbstractC0264g0 {

    /* renamed from: e */
    public final WindowInsetsAnimation f853e;

    public C0262f0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f853e = windowInsetsAnimation;
    }

    @Override // p028K.AbstractC0264g0
    /* renamed from: a */
    public final long mo741a() {
        return this.f853e.getDurationMillis();
    }

    @Override // p028K.AbstractC0264g0
    /* renamed from: b */
    public final float mo742b() {
        return this.f853e.getInterpolatedFraction();
    }

    @Override // p028K.AbstractC0264g0
    /* renamed from: c */
    public final int mo743c() {
        return this.f853e.getTypeMask();
    }

    @Override // p028K.AbstractC0264g0
    /* renamed from: d */
    public final void mo744d(float f) {
        this.f853e.setFraction(f);
    }
}
