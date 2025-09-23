package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p002A1.RunnableC0042x;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0701d implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2569a;

    /* renamed from: b */
    public final /* synthetic */ View f2570b;

    /* renamed from: c */
    public final /* synthetic */ C0702e f2571c;

    public AnimationAnimationListenerC0701d(View view, ViewGroup viewGroup, C0702e c0702e) {
        this.f2569a = viewGroup;
        this.f2570b = view;
        this.f2571c = c0702e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2569a.post(new RunnableC0042x(9, this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
