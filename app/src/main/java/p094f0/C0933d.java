package p094f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d */
/* loaded from: classes.dex */
public final class C0933d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3856a = 1;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0926Z f3857b;

    /* renamed from: c */
    public final /* synthetic */ View f3858c;

    /* renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f3859d;

    /* renamed from: e */
    public final /* synthetic */ C0943i f3860e;

    public C0933d(C0943i c0943i, AbstractC0926Z abstractC0926Z, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3860e = c0943i;
        this.f3857b = abstractC0926Z;
        this.f3859d = viewPropertyAnimator;
        this.f3858c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3856a) {
            case 1:
                this.f3858c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3856a) {
            case 0:
                this.f3859d.setListener(null);
                this.f3858c.setAlpha(1.0f);
                C0943i c0943i = this.f3860e;
                AbstractC0926Z abstractC0926Z = this.f3857b;
                c0943i.m2336c(abstractC0926Z);
                c0943i.f3920q.remove(abstractC0926Z);
                c0943i.m2443i();
                break;
            default:
                this.f3859d.setListener(null);
                C0943i c0943i2 = this.f3860e;
                AbstractC0926Z abstractC0926Z2 = this.f3857b;
                c0943i2.m2336c(abstractC0926Z2);
                c0943i2.f3918o.remove(abstractC0926Z2);
                c0943i2.m2443i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3856a) {
            case 0:
                this.f3860e.getClass();
                break;
            default:
                this.f3860e.getClass();
                break;
        }
    }

    public C0933d(C0943i c0943i, AbstractC0926Z abstractC0926Z, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3860e = c0943i;
        this.f3857b = abstractC0926Z;
        this.f3858c = view;
        this.f3859d = viewPropertyAnimator;
    }
}
