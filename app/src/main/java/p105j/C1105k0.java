package p105j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p093e2.AbstractC0901d;
import p094f0.C0929b;

/* renamed from: j.k0 */
/* loaded from: classes.dex */
public final class C1105k0 extends ToggleButton {

    /* renamed from: a */
    public final C0929b f4555a;

    /* renamed from: b */
    public final C1072Z f4556b;

    /* renamed from: c */
    public C1138w f4557c;

    public C1105k0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC1079b1.m2695a(this, getContext());
        C0929b c0929b = new C0929b(this);
        this.f4555a = c0929b;
        c0929b.m2420k(attributeSet, R.attr.buttonStyleToggle);
        C1072Z c1072z = new C1072Z(this);
        this.f4556b = c1072z;
        c1072z.m2683f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m2757a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1138w getEmojiTextViewHelper() {
        if (this.f4557c == null) {
            this.f4557c = new C1138w(this);
        }
        return this.f4557c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0929b c0929b = this.f4555a;
        if (c0929b != null) {
            c0929b.m2410a();
        }
        C1072Z c1072z = this.f4556b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0929b c0929b = this.f4555a;
        if (c0929b != null) {
            return c0929b.m2417h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0929b c0929b = this.f4555a;
        if (c0929b != null) {
            return c0929b.m2418i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4556b.m2681d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4556b.m2682e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2758b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0929b c0929b = this.f4555a;
        if (c0929b != null) {
            c0929b.m2422m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0929b c0929b = this.f4555a;
        if (c0929b != null) {
            c0929b.m2423n(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4556b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4556b;
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
        C0929b c0929b = this.f4555a;
        if (c0929b != null) {
            c0929b.m2428s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0929b c0929b = this.f4555a;
        if (c0929b != null) {
            c0929b.m2429t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1072Z c1072z = this.f4556b;
        c1072z.m2688l(colorStateList);
        c1072z.m2680b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1072Z c1072z = this.f4556b;
        c1072z.m2689m(mode);
        c1072z.m2680b();
    }
}
