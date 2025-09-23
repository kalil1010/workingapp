package p105j;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p006C.AbstractC0077i;
import p022I.AbstractC0203f;
import p022I.C0202e;
import p033L1.AbstractC0356d;
import p033L1.AbstractC0364l;
import p045Q.AbstractC0449m;
import p080b1.C0770h;
import p093e2.AbstractC0901d;
import p094f0.C0929b;

/* renamed from: j.c0 */
/* loaded from: classes.dex */
public class C1081c0 extends TextView {

    /* renamed from: a */
    public final C0929b f4494a;

    /* renamed from: b */
    public final C1072Z f4495b;

    /* renamed from: c */
    public final C1025B f4496c;

    /* renamed from: d */
    public C1138w f4497d;

    /* renamed from: e */
    public boolean f4498e;

    /* renamed from: f */
    public C0770h f4499f;

    /* renamed from: g */
    public Future f4500g;

    public C1081c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1138w getEmojiTextViewHelper() {
        if (this.f4497d == null) {
            this.f4497d = new C1138w(this);
        }
        return this.f4497d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0929b c0929b = this.f4494a;
        if (c0929b != null) {
            c0929b.m2410a();
        }
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    /* renamed from: f */
    public final void m2701f() {
        Future future = this.f4500g;
        if (future == null) {
            return;
        }
        try {
            this.f4500g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0356d.m971v(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1133t1.f4639b) {
            return super.getAutoSizeMaxTextSize();
        }
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            return Math.round(c1072z.f4453i.f4523e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC1133t1.f4639b) {
            return super.getAutoSizeMinTextSize();
        }
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            return Math.round(c1072z.f4453i.f4522d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC1133t1.f4639b) {
            return super.getAutoSizeStepGranularity();
        }
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            return Math.round(c1072z.f4453i.f4521c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC1133t1.f4639b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1072Z c1072z = this.f4495b;
        return c1072z != null ? c1072z.f4453i.f4524f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC1133t1.f4639b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            return c1072z.f4453i.f4519a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0356d.m949J(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC1075a0 getSuperCaller() {
        if (this.f4499f == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                this.f4499f = new C1078b0(this);
            } else if (i2 >= 26) {
                this.f4499f = new C0770h(this);
            }
        }
        return this.f4499f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0929b c0929b = this.f4494a;
        if (c0929b != null) {
            return c0929b.m2417h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0929b c0929b = this.f4494a;
        if (c0929b != null) {
            return c0929b.m2418i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4495b.m2681d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4495b.m2682e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m2701f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1025B c1025b;
        if (Build.VERSION.SDK_INT >= 28 || (c1025b = this.f4496c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1025b.f4339c;
        return textClassifier == null ? AbstractC1060T.m2666a((TextView) c1025b.f4338b) : textClassifier;
    }

    public C0202e getTextMetricsParamsCompat() {
        return AbstractC0356d.m971v(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4495b.getClass();
        C1072Z.m2678h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0356d.m973x(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C1072Z c1072z = this.f4495b;
        if (c1072z == null || AbstractC1133t1.f4639b) {
            return;
        }
        c1072z.f4453i.m2716a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        m2701f();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C1072Z c1072z = this.f4495b;
        if (c1072z == null || AbstractC1133t1.f4639b) {
            return;
        }
        C1102j0 c1102j0 = c1072z.f4453i;
        if (c1102j0.m2718f()) {
            c1102j0.m2716a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2758b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (AbstractC1133t1.f4639b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            c1072z.m2685i(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (AbstractC1133t1.f4639b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            c1072z.m2686j(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (AbstractC1133t1.f4639b) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            c1072z.m2687k(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0929b c0929b = this.f4494a;
        if (c0929b != null) {
            c0929b.m2422m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0929b c0929b = this.f4494a;
        if (c0929b != null) {
            c0929b.m2423n(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4495b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0901d) getEmojiTextViewHelper().f4660b.f7b).mo1398A(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1982b(i2);
        } else {
            AbstractC0356d.m944E(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1984j(i2);
        } else {
            AbstractC0356d.m945F(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        AbstractC0364l.m1009p(i2);
        if (i2 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(AbstractC0203f abstractC0203f) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0356d.m971v(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0929b c0929b = this.f4494a;
        if (c0929b != null) {
            c0929b.m2428s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0929b c0929b = this.f4494a;
        if (c0929b != null) {
            c0929b.m2429t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1072Z c1072z = this.f4495b;
        c1072z.m2688l(colorStateList);
        c1072z.m2680b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1072Z c1072z = this.f4495b;
        c1072z.m2689m(mode);
        c1072z.m2680b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            c1072z.m2684g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1025B c1025b;
        if (Build.VERSION.SDK_INT >= 28 || (c1025b = this.f4496c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1025b.f4339c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0203f> future) {
        this.f4500g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0202e c0202e) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0202e.f752b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(c0202e.f751a);
        AbstractC0449m.m1129e(this, c0202e.f753c);
        AbstractC0449m.m1132h(this, c0202e.f754d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = AbstractC1133t1.f4639b;
        if (z2) {
            super.setTextSize(i2, f);
            return;
        }
        C1072Z c1072z = this.f4495b;
        if (c1072z == null || z2) {
            return;
        }
        C1102j0 c1102j0 = c1072z.f4453i;
        if (c1102j0.m2718f()) {
            return;
        }
        c1102j0.m2719g(i2, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceCreate;
        if (this.f4498e) {
            return;
        }
        if (typeface == null || i2 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC0364l abstractC0364l = AbstractC0077i.f179a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i2);
        }
        this.f4498e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f4498e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1081c0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC1082c1.m2702a(context);
        this.f4498e = false;
        this.f4499f = null;
        AbstractC1079b1.m2695a(this, getContext());
        C0929b c0929b = new C0929b(this);
        this.f4494a = c0929b;
        c0929b.m2420k(attributeSet, i2);
        C1072Z c1072z = new C1072Z(this);
        this.f4495b = c1072z;
        c1072z.m2683f(attributeSet, i2);
        c1072z.m2680b();
        C1025B c1025b = new C1025B();
        c1025b.f4338b = this;
        this.f4496c = c1025b;
        getEmojiTextViewHelper().m2757a(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0901d.m2321x(context, i2) : null, i3 != 0 ? AbstractC0901d.m2321x(context, i3) : null, i4 != 0 ? AbstractC0901d.m2321x(context, i4) : null, i5 != 0 ? AbstractC0901d.m2321x(context, i5) : null);
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0901d.m2321x(context, i2) : null, i3 != 0 ? AbstractC0901d.m2321x(context, i3) : null, i4 != 0 ? AbstractC0901d.m2321x(context, i4) : null, i5 != 0 ? AbstractC0901d.m2321x(context, i5) : null);
        C1072Z c1072z = this.f4495b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }
}
