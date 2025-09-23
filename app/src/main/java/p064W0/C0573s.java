package p064W0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p093e2.AbstractC0901d;
import p105j.C1081c0;
import p148y0.AbstractC1400a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: W0.s */
/* loaded from: classes.dex */
public final class C0573s {

    /* renamed from: A */
    public ColorStateList f1811A;

    /* renamed from: B */
    public Typeface f1812B;

    /* renamed from: a */
    public final int f1813a;

    /* renamed from: b */
    public final int f1814b;

    /* renamed from: c */
    public final int f1815c;

    /* renamed from: d */
    public final TimeInterpolator f1816d;

    /* renamed from: e */
    public final TimeInterpolator f1817e;

    /* renamed from: f */
    public final TimeInterpolator f1818f;

    /* renamed from: g */
    public final Context f1819g;

    /* renamed from: h */
    public final TextInputLayout f1820h;

    /* renamed from: i */
    public LinearLayout f1821i;

    /* renamed from: j */
    public int f1822j;

    /* renamed from: k */
    public FrameLayout f1823k;

    /* renamed from: l */
    public AnimatorSet f1824l;

    /* renamed from: m */
    public final float f1825m;

    /* renamed from: n */
    public int f1826n;

    /* renamed from: o */
    public int f1827o;

    /* renamed from: p */
    public CharSequence f1828p;

    /* renamed from: q */
    public boolean f1829q;

    /* renamed from: r */
    public C1081c0 f1830r;

    /* renamed from: s */
    public CharSequence f1831s;

    /* renamed from: t */
    public int f1832t;

    /* renamed from: u */
    public int f1833u;

    /* renamed from: v */
    public ColorStateList f1834v;

    /* renamed from: w */
    public CharSequence f1835w;

    /* renamed from: x */
    public boolean f1836x;

    /* renamed from: y */
    public C1081c0 f1837y;

    /* renamed from: z */
    public int f1838z;

    public C0573s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1819g = context;
        this.f1820h = textInputLayout;
        this.f1825m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1813a = AbstractC0901d.m2304k0(context, R.attr.motionDurationShort4, 217);
        this.f1814b = AbstractC0901d.m2304k0(context, R.attr.motionDurationMedium4, 167);
        this.f1815c = AbstractC0901d.m2304k0(context, R.attr.motionDurationShort4, 167);
        this.f1816d = AbstractC0901d.m2306l0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC1400a.f6069d);
        LinearInterpolator linearInterpolator = AbstractC1400a.f6066a;
        this.f1817e = AbstractC0901d.m2306l0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1818f = AbstractC0901d.m2306l0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* renamed from: a */
    public final void m1375a(C1081c0 c1081c0, int i2) {
        if (this.f1821i == null && this.f1823k == null) {
            Context context = this.f1819g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f1821i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f1821i;
            TextInputLayout textInputLayout = this.f1820h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1823k = new FrameLayout(context);
            this.f1821i.addView(this.f1823k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m1376b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f1823k.setVisibility(0);
            this.f1823k.addView(c1081c0);
        } else {
            this.f1821i.addView(c1081c0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f1821i.setVisibility(0);
        this.f1822j++;
    }

    /* renamed from: b */
    public final void m1376b() {
        if (this.f1821i != null) {
            TextInputLayout textInputLayout = this.f1820h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1819g;
                boolean zM2285P = AbstractC0901d.m2285P(context);
                LinearLayout linearLayout = this.f1821i;
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                int paddingStart = editText.getPaddingStart();
                if (zM2285P) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM2285P) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM2285P) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* renamed from: c */
    public final void m1377c() {
        AnimatorSet animatorSet = this.f1824l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: d */
    public final void m1378d(ArrayList arrayList, boolean z2, C1081c0 c1081c0, int i2, int i3, int i4) {
        if (c1081c0 == null || !z2) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            boolean z3 = i4 == i2;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1081c0, (Property<C1081c0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i5 = this.f1815c;
            objectAnimatorOfFloat.setDuration(z3 ? this.f1814b : i5);
            objectAnimatorOfFloat.setInterpolator(z3 ? this.f1817e : this.f1818f);
            if (i2 == i4 && i3 != 0) {
                objectAnimatorOfFloat.setStartDelay(i5);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i4 != i2 || i3 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1081c0, (Property<C1081c0, Float>) View.TRANSLATION_Y, -this.f1825m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f1813a);
            objectAnimatorOfFloat2.setInterpolator(this.f1816d);
            objectAnimatorOfFloat2.setStartDelay(i5);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* renamed from: e */
    public final TextView m1379e(int i2) {
        if (i2 == 1) {
            return this.f1830r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f1837y;
    }

    /* renamed from: f */
    public final void m1380f() {
        this.f1828p = null;
        m1377c();
        if (this.f1826n == 1) {
            if (!this.f1836x || TextUtils.isEmpty(this.f1835w)) {
                this.f1827o = 0;
            } else {
                this.f1827o = 2;
            }
        }
        m1383i(this.f1826n, this.f1827o, m1382h(this.f1830r, ""));
    }

    /* renamed from: g */
    public final void m1381g(C1081c0 c1081c0, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f1821i;
        if (linearLayout == null) {
            return;
        }
        if ((i2 == 0 || i2 == 1) && (frameLayout = this.f1823k) != null) {
            frameLayout.removeView(c1081c0);
        } else {
            linearLayout.removeView(c1081c0);
        }
        int i3 = this.f1822j - 1;
        this.f1822j = i3;
        LinearLayout linearLayout2 = this.f1821i;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final boolean m1382h(C1081c0 c1081c0, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        TextInputLayout textInputLayout = this.f1820h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f1827o == this.f1826n && c1081c0 != null && TextUtils.equals(c1081c0.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m1383i(int i2, int i3, boolean z2) {
        TextView textViewM1379e;
        TextView textViewM1379e2;
        C0573s c0573s = this;
        if (i2 == i3) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            c0573s.f1824l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c0573s.m1378d(arrayList, c0573s.f1836x, c0573s.f1837y, 2, i2, i3);
            c0573s.m1378d(arrayList, c0573s.f1829q, c0573s.f1830r, 1, i2, i3);
            int size = arrayList.size();
            long jMax = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Animator animator = (Animator) arrayList.get(i4);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            C0571q c0571q = new C0571q(this, i3, m1379e(i2), i2, c0573s.m1379e(i3));
            c0573s = this;
            animatorSet.addListener(c0571q);
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (textViewM1379e2 = c0573s.m1379e(i3)) != null) {
                textViewM1379e2.setVisibility(0);
                textViewM1379e2.setAlpha(1.0f);
            }
            if (i2 != 0 && (textViewM1379e = m1379e(i2)) != null) {
                textViewM1379e.setVisibility(4);
                if (i2 == 1) {
                    textViewM1379e.setText((CharSequence) null);
                }
            }
            c0573s.f1826n = i3;
        }
        TextInputLayout textInputLayout = c0573s.f1820h;
        textInputLayout.m2130r();
        textInputLayout.m2133u(z2, false);
        textInputLayout.m2136x();
    }
}
