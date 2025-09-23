package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p028K.ViewTreeObserverOnPreDrawListenerC0289t;

/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public final class RunnableC0716s extends AnimationSet implements Runnable {

    /* renamed from: a */
    public final ViewGroup f2663a;

    /* renamed from: b */
    public final View f2664b;

    /* renamed from: c */
    public boolean f2665c;

    /* renamed from: d */
    public boolean f2666d;

    /* renamed from: e */
    public boolean f2667e;

    public RunnableC0716s(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2667e = true;
        this.f2663a = viewGroup;
        this.f2664b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f2667e = true;
        if (this.f2665c) {
            return !this.f2666d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f2665c = true;
            ViewTreeObserverOnPreDrawListenerC0289t.m814a(this.f2663a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f2665c;
        ViewGroup viewGroup = this.f2663a;
        if (z2 || !this.f2667e) {
            viewGroup.endViewTransition(this.f2664b);
            this.f2666d = true;
        } else {
            this.f2667e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f) {
        this.f2667e = true;
        if (this.f2665c) {
            return !this.f2666d;
        }
        if (!super.getTransformation(j2, transformation, f)) {
            this.f2665c = true;
            ViewTreeObserverOnPreDrawListenerC0289t.m814a(this.f2663a, this);
        }
        return true;
    }
}
