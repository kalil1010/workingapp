package p028K;

import android.view.WindowInsets;
import p006C.C0072d;

/* renamed from: K.o0 */
/* loaded from: classes.dex */
public class C0280o0 extends AbstractC0278n0 {

    /* renamed from: m */
    public C0072d f897m;

    public C0280o0(C0292u0 c0292u0, WindowInsets windowInsets) {
        super(c0292u0, windowInsets);
        this.f897m = null;
    }

    @Override // p028K.C0288s0
    /* renamed from: b */
    public C0292u0 mo802b() {
        return C0292u0.m817g(null, this.f892c.consumeStableInsets());
    }

    @Override // p028K.C0288s0
    /* renamed from: c */
    public C0292u0 mo803c() {
        return C0292u0.m817g(null, this.f892c.consumeSystemWindowInsets());
    }

    @Override // p028K.C0288s0
    /* renamed from: h */
    public final C0072d mo804h() {
        if (this.f897m == null) {
            WindowInsets windowInsets = this.f892c;
            this.f897m = C0072d.m228b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f897m;
    }

    @Override // p028K.C0288s0
    /* renamed from: m */
    public boolean mo805m() {
        return this.f892c.isConsumed();
    }

    @Override // p028K.C0288s0
    /* renamed from: q */
    public void mo806q(C0072d c0072d) {
        this.f897m = c0072d;
    }
}
