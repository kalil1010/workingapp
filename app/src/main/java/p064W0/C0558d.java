package p064W0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import p002A1.RunnableC0030l;
import p002A1.ViewOnClickListenerC0022d;
import p093e2.AbstractC0901d;
import p148y0.AbstractC1400a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: W0.d */
/* loaded from: classes.dex */
public final class C0558d extends AbstractC0570p {

    /* renamed from: e */
    public final int f1742e;

    /* renamed from: f */
    public final int f1743f;

    /* renamed from: g */
    public final TimeInterpolator f1744g;

    /* renamed from: h */
    public final TimeInterpolator f1745h;

    /* renamed from: i */
    public EditText f1746i;

    /* renamed from: j */
    public final ViewOnClickListenerC0022d f1747j;

    /* renamed from: k */
    public final ViewOnFocusChangeListenerC0555a f1748k;

    /* renamed from: l */
    public AnimatorSet f1749l;

    /* renamed from: m */
    public ValueAnimator f1750m;

    public C0558d(C0569o c0569o) {
        super(c0569o);
        this.f1747j = new ViewOnClickListenerC0022d(2, this);
        this.f1748k = new ViewOnFocusChangeListenerC0555a(this, 0);
        this.f1742e = AbstractC0901d.m2304k0(c0569o.getContext(), R.attr.motionDurationShort3, 100);
        this.f1743f = AbstractC0901d.m2304k0(c0569o.getContext(), R.attr.motionDurationShort3, 150);
        this.f1744g = AbstractC0901d.m2306l0(c0569o.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1400a.f6066a);
        this.f1745h = AbstractC0901d.m2306l0(c0569o.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1400a.f6069d);
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: a */
    public final void mo1333a() {
        if (this.f1802b.f1794p != null) {
            return;
        }
        m1343t(m1344u());
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: c */
    public final int mo1334c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: d */
    public final int mo1335d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: e */
    public final View.OnFocusChangeListener mo1336e() {
        return this.f1748k;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: f */
    public final View.OnClickListener mo1337f() {
        return this.f1747j;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: g */
    public final View.OnFocusChangeListener mo1338g() {
        return this.f1748k;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: m */
    public final void mo1339m(EditText editText) {
        this.f1746i = editText;
        this.f1801a.setEndIconVisible(m1344u());
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: p */
    public final void mo1340p(boolean z2) {
        if (this.f1802b.f1794p == null) {
            return;
        }
        m1343t(z2);
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: r */
    public final void mo1341r() {
        final int i2 = 1;
        final int i3 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f1745h);
        valueAnimatorOfFloat.setDuration(this.f1743f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: W0.b

            /* renamed from: b */
            public final /* synthetic */ C0558d f1739b;

            {
                this.f1739b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0558d c0558d = this.f1739b;
                        c0558d.getClass();
                        c0558d.f1804d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0558d c0558d2 = this.f1739b;
                        c0558d2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0558d2.f1804d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1744g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i4 = this.f1742e;
        valueAnimatorOfFloat2.setDuration(i4);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: W0.b

            /* renamed from: b */
            public final /* synthetic */ C0558d f1739b;

            {
                this.f1739b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0558d c0558d = this.f1739b;
                        c0558d.getClass();
                        c0558d.f1804d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0558d c0558d2 = this.f1739b;
                        c0558d2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0558d2.f1804d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1749l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f1749l.addListener(new C0557c(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i4);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: W0.b

            /* renamed from: b */
            public final /* synthetic */ C0558d f1739b;

            {
                this.f1739b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0558d c0558d = this.f1739b;
                        c0558d.getClass();
                        c0558d.f1804d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0558d c0558d2 = this.f1739b;
                        c0558d2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0558d2.f1804d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f1750m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0557c(this, i2));
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: s */
    public final void mo1342s() {
        EditText editText = this.f1746i;
        if (editText != null) {
            editText.post(new RunnableC0030l(5, this));
        }
    }

    /* renamed from: t */
    public final void m1343t(boolean z2) {
        boolean z3 = this.f1802b.m1361d() == z2;
        if (z2 && !this.f1749l.isRunning()) {
            this.f1750m.cancel();
            this.f1749l.start();
            if (z3) {
                this.f1749l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f1749l.cancel();
        this.f1750m.start();
        if (z3) {
            this.f1750m.end();
        }
    }

    /* renamed from: u */
    public final boolean m1344u() {
        EditText editText = this.f1746i;
        if (editText != null) {
            return (editText.hasFocus() || this.f1804d.hasFocus()) && this.f1746i.getText().length() > 0;
        }
        return false;
    }
}
