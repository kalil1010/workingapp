package p105j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p045Q.InterfaceC0454r;
import p093e2.AbstractC0901d;
import p094f0.C0929b;
import p097g0.C0968d;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.C */
/* loaded from: classes.dex */
public class C1027C extends RadioButton implements InterfaceC0454r {

    /* renamed from: a */
    public final C0968d f4340a;

    /* renamed from: b */
    public final C0929b f4341b;

    /* renamed from: c */
    public final C1072Z f4342c;

    /* renamed from: d */
    public C1138w f4343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1027C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        AbstractC1082c1.m2702a(context);
        AbstractC1079b1.m2695a(this, getContext());
        C0968d c0968d = new C0968d(this);
        this.f4340a = c0968d;
        c0968d.m2477d(attributeSet, R.attr.radioButtonStyle);
        C0929b c0929b = new C0929b(this);
        this.f4341b = c0929b;
        c0929b.m2420k(attributeSet, R.attr.radioButtonStyle);
        C1072Z c1072z = new C1072Z(this);
        this.f4342c = c1072z;
        c1072z.m2683f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m2757a(attributeSet, R.attr.radioButtonStyle);
    }

    private C1138w getEmojiTextViewHelper() {
        if (this.f4343d == null) {
            this.f4343d = new C1138w(this);
        }
        return this.f4343d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0929b c0929b = this.f4341b;
        if (c0929b != null) {
            c0929b.m2410a();
        }
        C1072Z c1072z = this.f4342c;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0968d c0968d = this.f4340a;
        if (c0968d != null) {
            c0968d.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0929b c0929b = this.f4341b;
        if (c0929b != null) {
            return c0929b.m2417h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0929b c0929b = this.f4341b;
        if (c0929b != null) {
            return c0929b.m2418i();
        }
        return null;
    }

    @Override // p045Q.InterfaceC0454r
    public ColorStateList getSupportButtonTintList() {
        C0968d c0968d = this.f4340a;
        if (c0968d != null) {
            return (ColorStateList) c0968d.f4062e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0968d c0968d = this.f4340a;
        if (c0968d != null) {
            return (PorterDuff.Mode) c0968d.f4063f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4342c.m2681d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4342c.m2682e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2758b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0929b c0929b = this.f4341b;
        if (c0929b != null) {
            c0929b.m2422m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0929b c0929b = this.f4341b;
        if (c0929b != null) {
            c0929b.m2423n(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0968d c0968d = this.f4340a;
        if (c0968d != null) {
            if (c0968d.f4060c) {
                c0968d.f4060c = false;
            } else {
                c0968d.f4060c = true;
                c0968d.m2474a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4342c;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4342c;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2759c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0901d) getEmojiTextViewHelper().f4660b.f7b).mo1398A(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0929b c0929b = this.f4341b;
        if (c0929b != null) {
            c0929b.m2428s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0929b c0929b = this.f4341b;
        if (c0929b != null) {
            c0929b.m2429t(mode);
        }
    }

    @Override // p045Q.InterfaceC0454r
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0968d c0968d = this.f4340a;
        if (c0968d != null) {
            c0968d.f4062e = colorStateList;
            c0968d.f4058a = true;
            c0968d.m2474a();
        }
    }

    @Override // p045Q.InterfaceC0454r
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0968d c0968d = this.f4340a;
        if (c0968d != null) {
            c0968d.f4063f = mode;
            c0968d.f4059b = true;
            c0968d.m2474a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1072Z c1072z = this.f4342c;
        c1072z.m2688l(colorStateList);
        c1072z.m2680b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1072Z c1072z = this.f4342c;
        c1072z.m2689m(mode);
        c1072z.m2680b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(AbstractC0901d.m2321x(getContext(), i2));
    }
}
