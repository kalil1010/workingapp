package p064W0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p105j.C1081c0;

/* renamed from: W0.q */
/* loaded from: classes.dex */
public final class C0571q extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f1805a;

    /* renamed from: b */
    public final /* synthetic */ TextView f1806b;

    /* renamed from: c */
    public final /* synthetic */ int f1807c;

    /* renamed from: d */
    public final /* synthetic */ TextView f1808d;

    /* renamed from: e */
    public final /* synthetic */ C0573s f1809e;

    public C0571q(C0573s c0573s, int i2, TextView textView, int i3, TextView textView2) {
        this.f1809e = c0573s;
        this.f1805a = i2;
        this.f1806b = textView;
        this.f1807c = i3;
        this.f1808d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1081c0 c1081c0;
        int i2 = this.f1805a;
        C0573s c0573s = this.f1809e;
        c0573s.f1826n = i2;
        c0573s.f1824l = null;
        TextView textView = this.f1806b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1807c == 1 && (c1081c0 = c0573s.f1830r) != null) {
                c1081c0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1808d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1808d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
