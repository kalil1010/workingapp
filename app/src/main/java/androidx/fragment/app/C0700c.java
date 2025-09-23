package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p006C.AbstractC0075g;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public final class C0700c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2564a;

    /* renamed from: b */
    public final /* synthetic */ View f2565b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2566c;

    /* renamed from: d */
    public final /* synthetic */ C0696N f2567d;

    /* renamed from: e */
    public final /* synthetic */ C0702e f2568e;

    public C0700c(ViewGroup viewGroup, View view, boolean z2, C0696N c0696n, C0702e c0702e) {
        this.f2564a = viewGroup;
        this.f2565b = view;
        this.f2566c = z2;
        this.f2567d = c0696n;
        this.f2568e = c0702e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f2564a;
        View view = this.f2565b;
        viewGroup.endViewTransition(view);
        if (this.f2566c) {
            AbstractC0075g.m232a(view, this.f2567d.f2524a);
        }
        this.f2568e.m1727d();
    }
}
