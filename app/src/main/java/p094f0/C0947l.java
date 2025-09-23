package p094f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.l */
/* loaded from: classes.dex */
public final class C0947l extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f3931a = false;

    /* renamed from: b */
    public final /* synthetic */ C0948m f3932b;

    public C0947l(C0948m c0948m) {
        this.f3932b = c0948m;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3931a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3931a) {
            this.f3931a = false;
            return;
        }
        C0948m c0948m = this.f3932b;
        if (((Float) c0948m.f3962z.getAnimatedValue()).floatValue() == 0.0f) {
            c0948m.f3935A = 0;
            c0948m.m2451g(0);
        } else {
            c0948m.f3935A = 2;
            c0948m.f3955s.invalidate();
        }
    }
}
