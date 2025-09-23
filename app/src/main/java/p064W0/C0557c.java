package p064W0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;

/* renamed from: W0.c */
/* loaded from: classes.dex */
public final class C0557c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f1740a;

    /* renamed from: b */
    public final /* synthetic */ C0558d f1741b;

    public /* synthetic */ C0557c(C0558d c0558d, int i2) {
        this.f1740a = i2;
        this.f1741b = c0558d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        switch (this.f1740a) {
            case 1:
                this.f1741b.f1802b.m1365h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) throws Resources.NotFoundException {
        switch (this.f1740a) {
            case 0:
                this.f1741b.f1802b.m1365h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
