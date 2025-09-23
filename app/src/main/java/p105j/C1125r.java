package p105j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p002A1.C0027i;
import p028K.AbstractC0241P;
import p033L1.AbstractC0356d;
import p086d.AbstractC0843a;
import p093e2.AbstractC0901d;
import p094f0.C0929b;
import p097g0.C0968d;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.r */
/* loaded from: classes.dex */
public final class C1125r extends CheckedTextView {

    /* renamed from: a */
    public final C0968d f4621a;

    /* renamed from: b */
    public final C0929b f4622b;

    /* renamed from: c */
    public final C1072Z f4623c;

    /* renamed from: d */
    public C1138w f4624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1125r(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC1082c1.m2702a(context);
        AbstractC1079b1.m2695a(this, getContext());
        C1072Z c1072z = new C1072Z(this);
        this.f4623c = c1072z;
        c1072z.m2683f(attributeSet, R.attr.checkedTextViewStyle);
        c1072z.m2680b();
        C0929b c0929b = new C0929b(this);
        this.f4622b = c0929b;
        c0929b.m2420k(attributeSet, R.attr.checkedTextViewStyle);
        this.f4621a = new C0968d(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0843a.f3462l;
        C0027i c0027iM98N = C0027i.m98N(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
        AbstractC0241P.m700l(this, getContext(), iArr, attributeSet, (TypedArray) c0027iM98N.f66c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0901d.m2321x(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0901d.m2321x(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0027iM98N.m99A(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC1117o0.m2733b(typedArray.getInt(3, -1), null));
            }
            c0027iM98N.m114R();
            getEmojiTextViewHelper().m2757a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0027iM98N.m114R();
            throw th;
        }
    }

    private C1138w getEmojiTextViewHelper() {
        if (this.f4624d == null) {
            this.f4624d = new C1138w(this);
        }
        return this.f4624d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1072Z c1072z = this.f4623c;
        if (c1072z != null) {
            c1072z.m2680b();
        }
        C0929b c0929b = this.f4622b;
        if (c0929b != null) {
            c0929b.m2410a();
        }
        C0968d c0968d = this.f4621a;
        if (c0968d != null) {
            c0968d.m2475b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0356d.m949J(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0929b c0929b = this.f4622b;
        if (c0929b != null) {
            return c0929b.m2417h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0929b c0929b = this.f4622b;
        if (c0929b != null) {
            return c0929b.m2418i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0968d c0968d = this.f4621a;
        if (c0968d != null) {
            return (ColorStateList) c0968d.f4062e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0968d c0968d = this.f4621a;
        if (c0968d != null) {
            return (PorterDuff.Mode) c0968d.f4063f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4623c.m2681d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4623c.m2682e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0356d.m973x(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2758b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0929b c0929b = this.f4622b;
        if (c0929b != null) {
            c0929b.m2422m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0929b c0929b = this.f4622b;
        if (c0929b != null) {
            c0929b.m2423n(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0968d c0968d = this.f4621a;
        if (c0968d != null) {
            if (c0968d.f4060c) {
                c0968d.f4060c = false;
            } else {
                c0968d.f4060c = true;
                c0968d.m2475b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4623c;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4623c;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0356d.m950K(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2759c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0929b c0929b = this.f4622b;
        if (c0929b != null) {
            c0929b.m2428s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0929b c0929b = this.f4622b;
        if (c0929b != null) {
            c0929b.m2429t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0968d c0968d = this.f4621a;
        if (c0968d != null) {
            c0968d.f4062e = colorStateList;
            c0968d.f4058a = true;
            c0968d.m2475b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0968d c0968d = this.f4621a;
        if (c0968d != null) {
            c0968d.f4063f = mode;
            c0968d.f4059b = true;
            c0968d.m2475b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1072Z c1072z = this.f4623c;
        c1072z.m2688l(colorStateList);
        c1072z.m2680b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1072Z c1072z = this.f4623c;
        c1072z.m2689m(mode);
        c1072z.m2680b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C1072Z c1072z = this.f4623c;
        if (c1072z != null) {
            c1072z.m2684g(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(AbstractC0901d.m2321x(getContext(), i2));
    }
}
