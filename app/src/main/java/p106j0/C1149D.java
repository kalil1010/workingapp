package p106j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p033L1.AbstractC0356d;

/* renamed from: j0.D */
/* loaded from: classes.dex */
public final class C1149D extends AnimatorListenerAdapter implements InterfaceC1162k {

    /* renamed from: a */
    public final View f4701a;

    /* renamed from: b */
    public final int f4702b;

    /* renamed from: c */
    public final ViewGroup f4703c;

    /* renamed from: e */
    public boolean f4705e;

    /* renamed from: f */
    public boolean f4706f = false;

    /* renamed from: d */
    public final boolean f4704d = true;

    public C1149D(View view, int i2) {
        this.f4701a = view;
        this.f4702b = i2;
        this.f4703c = (ViewGroup) view.getParent();
        m2773g(true);
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: a */
    public final void mo2768a(AbstractC1164m abstractC1164m) {
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: b */
    public final void mo2769b() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        m2773g(false);
        if (this.f4706f) {
            return;
        }
        AbstractC1174w.m2823b(this.f4701a, this.f4702b);
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
    public final void mo2772e() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        m2773g(true);
        if (this.f4706f) {
            return;
        }
        AbstractC1174w.m2823b(this.f4701a, 0);
    }

    /* renamed from: g */
    public final void m2773g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f4704d || this.f4705e == z2 || (viewGroup = this.f4703c) == null) {
            return;
        }
        this.f4705e = z2;
        AbstractC0356d.m948I(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4706f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f4706f) {
            AbstractC1174w.m2823b(this.f4701a, this.f4702b);
            ViewGroup viewGroup = this.f4703c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2773g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z2) {
            AbstractC1174w.m2823b(this.f4701a, 0);
            ViewGroup viewGroup = this.f4703c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z2) {
            return;
        }
        if (!this.f4706f) {
            AbstractC1174w.m2823b(this.f4701a, this.f4702b);
            ViewGroup viewGroup = this.f4703c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2773g(false);
    }
}
