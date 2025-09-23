package p105j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p002A1.C0027i;
import p033L1.AbstractC0356d;
import p093e2.AbstractC0901d;
import p094f0.C0929b;

/* renamed from: j.z */
/* loaded from: classes.dex */
public final class C1144z extends MultiAutoCompleteTextView {

    /* renamed from: d */
    public static final int[] f4678d = {R.attr.popupBackground};

    /* renamed from: a */
    public final C0929b f4679a;

    /* renamed from: b */
    public final C1072Z f4680b;

    /* renamed from: c */
    public final C1025B f4681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.autoCompleteTextViewStyle);
        AbstractC1082c1.m2702a(context);
        AbstractC1079b1.m2695a(this, getContext());
        C0027i c0027iM98N = C0027i.m98N(getContext(), attributeSet, f4678d, tkbmmn.ghwbbf.irvjzy.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c0027iM98N.f66c).hasValue(0)) {
            setDropDownBackgroundDrawable(c0027iM98N.m100B(0));
        }
        c0027iM98N.m114R();
        C0929b c0929b = new C0929b(this);
        this.f4679a = c0929b;
        c0929b.m2420k(attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.autoCompleteTextViewStyle);
        C1072Z c1072z = new C1072Z(this);
        this.f4680b = c1072z;
        c1072z.m2683f(attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.autoCompleteTextViewStyle);
        c1072z.m2680b();
        C1025B c1025b = new C1025B(this);
        this.f4681c = c1025b;
        c1025b.mo2615b(attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM2614a = c1025b.m2614a(keyListener);
        if (keyListenerM2614a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2614a);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0929b c0929b = this.f4679a;
        if (c0929b != null) {
            c0929b.m2410a();
        }
        C1072Z c1072z = this.f4680b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0929b c0929b = this.f4679a;
        if (c0929b != null) {
            return c0929b.m2417h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0929b c0929b = this.f4679a;
        if (c0929b != null) {
            return c0929b.m2418i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4680b.m2681d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4680b.m2682e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0356d.m973x(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f4681c.m2616c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0929b c0929b = this.f4679a;
        if (c0929b != null) {
            c0929b.m2422m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0929b c0929b = this.f4679a;
        if (c0929b != null) {
            c0929b.m2423n(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4680b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4680b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0901d.m2321x(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f4681c.m2617d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4681c.m2614a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0929b c0929b = this.f4679a;
        if (c0929b != null) {
            c0929b.m2428s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0929b c0929b = this.f4679a;
        if (c0929b != null) {
            c0929b.m2429t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1072Z c1072z = this.f4680b;
        c1072z.m2688l(colorStateList);
        c1072z.m2680b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1072Z c1072z = this.f4680b;
        c1072z.m2689m(mode);
        c1072z.m2680b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C1072Z c1072z = this.f4680b;
        if (c1072z != null) {
            c1072z.m2684g(context, i2);
        }
    }
}
