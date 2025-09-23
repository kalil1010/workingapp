package p106j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j0.g */
/* loaded from: classes.dex */
public final class C1158g extends AnimatorListenerAdapter implements InterfaceC1162k {

    /* renamed from: a */
    public final View f4739a;

    /* renamed from: b */
    public boolean f4740b = false;

    public C1158g(View view) {
        this.f4739a = view;
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: a */
    public final void mo2768a(AbstractC1164m abstractC1164m) {
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: b */
    public final void mo2769b() {
        View view = this.f4739a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC1174w.f4793a.mo1018L(view) : 0.0f));
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: c */
    public final void mo2770c(AbstractC1164m abstractC1164m) {
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: d */
    public final void mo2771d(AbstractC1164m abstractC1164m) {
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: e */
    public final void mo2772e() {
        this.f4739a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: f */
    public final void mo2796f(AbstractC1164m abstractC1164m) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC1174w.f4793a.mo1026h0(this.f4739a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f4739a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f4740b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f4740b;
        View view = this.f4739a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C1147B c1147b = AbstractC1174w.f4793a;
        c1147b.mo1026h0(view, 1.0f);
        c1147b.getClass();
    }
}
