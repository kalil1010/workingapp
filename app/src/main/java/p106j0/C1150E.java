package p106j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j0.E */
/* loaded from: classes.dex */
public final class C1150E extends AnimatorListenerAdapter implements InterfaceC1162k {

    /* renamed from: a */
    public final ViewGroup f4707a;

    /* renamed from: b */
    public final View f4708b;

    /* renamed from: c */
    public final View f4709c;

    /* renamed from: d */
    public boolean f4710d = true;

    /* renamed from: e */
    public final /* synthetic */ C1159h f4711e;

    public C1150E(C1159h c1159h, ViewGroup viewGroup, View view, View view2) {
        this.f4711e = c1159h;
        this.f4707a = viewGroup;
        this.f4708b = view;
        this.f4709c = view2;
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: a */
    public final void mo2768a(AbstractC1164m abstractC1164m) {
        if (this.f4710d) {
            m2774g();
        }
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: b */
    public final void mo2769b() {
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: c */
    public final void mo2770c(AbstractC1164m abstractC1164m) {
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: d */
    public final void mo2771d(AbstractC1164m abstractC1164m) {
        abstractC1164m.mo2790x(this);
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: e */
    public final void mo2772e() {
    }

    /* renamed from: g */
    public final void m2774g() {
        this.f4709c.setTag(R.id.save_overlay_view, null);
        this.f4707a.getOverlay().remove(this.f4708b);
        this.f4710d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m2774g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f4707a.getOverlay().remove(this.f4708b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f4708b;
        if (view.getParent() == null) {
            this.f4707a.getOverlay().add(view);
        } else {
            this.f4711e.mo2783c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f4709c;
            View view2 = this.f4708b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f4707a.getOverlay().add(view2);
            this.f4710d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        m2774g();
    }
}
