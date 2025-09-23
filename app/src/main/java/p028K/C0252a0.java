package p028K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p006C.C0072d;

/* renamed from: K.a0 */
/* loaded from: classes.dex */
public final class C0252a0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0266h0 f826a;

    /* renamed from: b */
    public final /* synthetic */ C0292u0 f827b;

    /* renamed from: c */
    public final /* synthetic */ C0292u0 f828c;

    /* renamed from: d */
    public final /* synthetic */ int f829d;

    /* renamed from: e */
    public final /* synthetic */ View f830e;

    public C0252a0(C0266h0 c0266h0, C0292u0 c0292u0, C0292u0 c0292u02, int i2, View view) {
        this.f826a = c0266h0;
        this.f827b = c0292u0;
        this.f828c = c0292u02;
        this.f829d = i2;
        this.f830e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        int i2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0266h0 c0266h0 = this.f826a;
        c0266h0.f867a.mo744d(animatedFraction);
        float fMo742b = c0266h0.f867a.mo742b();
        PathInterpolator pathInterpolator = C0258d0.f845e;
        int i3 = Build.VERSION.SDK_INT;
        C0292u0 c0292u0 = this.f827b;
        AbstractC0276m0 c0274l0 = i3 >= 30 ? new C0274l0(c0292u0) : i3 >= 29 ? new C0272k0(c0292u0) : new C0270j0(c0292u0);
        int i4 = 1;
        while (i4 <= 256) {
            int i5 = this.f829d & i4;
            C0288s0 c0288s0 = c0292u0.f910a;
            if (i5 == 0) {
                c0274l0.mo773c(i4, c0288s0.mo793f(i4));
                f = fMo742b;
                i2 = 1;
            } else {
                C0072d c0072dMo793f = c0288s0.mo793f(i4);
                C0072d c0072dMo793f2 = this.f828c.f910a.mo793f(i4);
                float f2 = 1.0f - fMo742b;
                f = fMo742b;
                i2 = 1;
                c0274l0.mo773c(i4, C0292u0.m816e(c0072dMo793f, (int) (((c0072dMo793f.f172a - c0072dMo793f2.f172a) * f2) + 0.5d), (int) (((c0072dMo793f.f173b - c0072dMo793f2.f173b) * f2) + 0.5d), (int) (((c0072dMo793f.f174c - c0072dMo793f2.f174c) * f2) + 0.5d), (int) (((c0072dMo793f.f175d - c0072dMo793f2.f175d) * f2) + 0.5d)));
            }
            i4 <<= i2;
            fMo742b = f;
        }
        C0258d0.m736g(this.f830e, c0274l0.mo753b(), Collections.singletonList(c0266h0));
    }
}
