package p007C0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import p055T0.C0512f;
import p055T0.C0513g;
import p094f0.C0948m;

/* renamed from: C0.c */
/* loaded from: classes.dex */
public final class C0085c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f201a;

    /* renamed from: b */
    public final /* synthetic */ Object f202b;

    public /* synthetic */ C0085c(int i2, Object obj) {
        this.f201a = i2;
        this.f202b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f201a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0513g c0513g = ((BottomSheetBehavior) this.f202b).f3090i;
                if (c0513g != null) {
                    C0512f c0512f = c0513g.f1601a;
                    if (c0512f.f1592i != fFloatValue) {
                        c0512f.f1592i = fFloatValue;
                        c0513g.f1605e = true;
                        c0513g.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                ((TextInputLayout) this.f202b).f3399v0.m1053k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0948m c0948m = (C0948m) this.f202b;
                c0948m.f3939c.setAlpha(iFloatValue);
                c0948m.f3940d.setAlpha(iFloatValue);
                c0948m.f3955s.invalidate();
                break;
        }
    }
}
