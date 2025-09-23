package p094f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.e */
/* loaded from: classes.dex */
public final class C0935e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0926Z f3862a;

    /* renamed from: b */
    public final /* synthetic */ int f3863b;

    /* renamed from: c */
    public final /* synthetic */ View f3864c;

    /* renamed from: d */
    public final /* synthetic */ int f3865d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f3866e;

    /* renamed from: f */
    public final /* synthetic */ C0943i f3867f;

    public C0935e(C0943i c0943i, AbstractC0926Z abstractC0926Z, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3867f = c0943i;
        this.f3862a = abstractC0926Z;
        this.f3863b = i2;
        this.f3864c = view;
        this.f3865d = i3;
        this.f3866e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i2 = this.f3863b;
        View view = this.f3864c;
        if (i2 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f3865d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3866e.setListener(null);
        C0943i c0943i = this.f3867f;
        AbstractC0926Z abstractC0926Z = this.f3862a;
        c0943i.m2336c(abstractC0926Z);
        c0943i.f3919p.remove(abstractC0926Z);
        c0943i.m2443i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3867f.getClass();
    }
}
