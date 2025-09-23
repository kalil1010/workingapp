package p094f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.f */
/* loaded from: classes.dex */
public final class C0937f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3872a;

    /* renamed from: b */
    public final /* synthetic */ C0939g f3873b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f3874c;

    /* renamed from: d */
    public final /* synthetic */ View f3875d;

    /* renamed from: e */
    public final /* synthetic */ C0943i f3876e;

    public /* synthetic */ C0937f(C0943i c0943i, C0939g c0939g, ViewPropertyAnimator viewPropertyAnimator, View view, int i2) {
        this.f3872a = i2;
        this.f3876e = c0943i;
        this.f3873b = c0939g;
        this.f3874c = viewPropertyAnimator;
        this.f3875d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3872a) {
            case 0:
                this.f3874c.setListener(null);
                View view = this.f3875d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0939g c0939g = this.f3873b;
                AbstractC0926Z abstractC0926Z = c0939g.f3887a;
                C0943i c0943i = this.f3876e;
                c0943i.m2336c(abstractC0926Z);
                c0943i.f3921r.remove(c0939g.f3887a);
                c0943i.m2443i();
                break;
            default:
                this.f3874c.setListener(null);
                View view2 = this.f3875d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0939g c0939g2 = this.f3873b;
                AbstractC0926Z abstractC0926Z2 = c0939g2.f3888b;
                C0943i c0943i2 = this.f3876e;
                c0943i2.m2336c(abstractC0926Z2);
                c0943i2.f3921r.remove(c0939g2.f3888b);
                c0943i2.m2443i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3872a) {
            case 0:
                AbstractC0926Z abstractC0926Z = this.f3873b.f3887a;
                this.f3876e.getClass();
                break;
            default:
                AbstractC0926Z abstractC0926Z2 = this.f3873b.f3888b;
                this.f3876e.getClass();
                break;
        }
    }
}
