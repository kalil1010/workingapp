package p028K;

import android.view.WindowInsets;
import p006C.C0072d;

/* renamed from: K.q0 */
/* loaded from: classes.dex */
public class C0284q0 extends C0282p0 {

    /* renamed from: n */
    public C0072d f900n;

    /* renamed from: o */
    public C0072d f901o;

    /* renamed from: p */
    public C0072d f902p;

    public C0284q0(C0292u0 c0292u0, WindowInsets windowInsets) {
        super(c0292u0, windowInsets);
        this.f900n = null;
        this.f901o = null;
        this.f902p = null;
    }

    @Override // p028K.C0288s0
    /* renamed from: g */
    public C0072d mo810g() {
        if (this.f901o == null) {
            this.f901o = C0072d.m229c(this.f892c.getMandatorySystemGestureInsets());
        }
        return this.f901o;
    }

    @Override // p028K.C0288s0
    /* renamed from: i */
    public C0072d mo811i() {
        if (this.f900n == null) {
            this.f900n = C0072d.m229c(this.f892c.getSystemGestureInsets());
        }
        return this.f900n;
    }

    @Override // p028K.C0288s0
    /* renamed from: k */
    public C0072d mo812k() {
        if (this.f902p == null) {
            this.f902p = C0072d.m229c(this.f892c.getTappableElementInsets());
        }
        return this.f902p;
    }

    @Override // p028K.AbstractC0278n0, p028K.C0288s0
    /* renamed from: l */
    public C0292u0 mo795l(int i2, int i3, int i4, int i5) {
        return C0292u0.m817g(null, this.f892c.inset(i2, i3, i4, i5));
    }

    @Override // p028K.C0280o0, p028K.C0288s0
    /* renamed from: q */
    public void mo806q(C0072d c0072d) {
    }
}
