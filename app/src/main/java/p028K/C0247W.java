package p028K;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import p006C.AbstractC0069a;
import p041O0.AbstractC0425a;
import p064W0.C0564j;
import p080b1.C0770h;
import p090e.C0867H;
import p148y0.AbstractC1400a;

/* renamed from: K.W */
/* loaded from: classes.dex */
public final /* synthetic */ class C0247W implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f822a;

    /* renamed from: b */
    public final /* synthetic */ Object f823b;

    public /* synthetic */ C0247W(int i2, Object obj) {
        this.f822a = i2;
        this.f823b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f822a) {
            case 0:
                ((View) ((C0867H) ((C0770h) this.f823b).f2887a).f3556q.getParent()).invalidate();
                break;
            case 1:
                ((DrawerLayout) this.f823b).setScrimColor(AbstractC0069a.m195d(-1728053248, AbstractC1400a.m3166c(AbstractC0425a.f1312a, 0, valueAnimator.getAnimatedFraction())));
                break;
            default:
                C0564j c0564j = (C0564j) this.f823b;
                c0564j.getClass();
                c0564j.f1804d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0247W(C0770h c0770h, View view) {
        this.f822a = 0;
        this.f823b = c0770h;
    }
}
