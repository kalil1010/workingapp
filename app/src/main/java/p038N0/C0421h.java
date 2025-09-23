package p038N0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: N0.h */
/* loaded from: classes.dex */
public final class C0421h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f1305a;

    /* renamed from: b */
    public final /* synthetic */ int f1306b;

    /* renamed from: c */
    public final /* synthetic */ C0422i f1307c;

    public C0421h(C0422i c0422i, boolean z2, int i2) {
        this.f1307c = c0422i;
        this.f1305a = z2;
        this.f1306b = i2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0422i c0422i = this.f1307c;
        c0422i.f1293b.setTranslationX(0.0f);
        c0422i.m1096c(0.0f, this.f1305a, this.f1306b);
    }
}
