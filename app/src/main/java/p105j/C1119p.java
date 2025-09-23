package p105j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.InvocationTargetException;
import p033L1.AbstractC0356d;
import p093e2.AbstractC0901d;
import p094f0.C0929b;

/* renamed from: j.p */
/* loaded from: classes.dex */
public class C1119p extends Button {

    /* renamed from: a */
    public final C0929b f4591a;

    /* renamed from: b */
    public final C1072Z f4592b;

    /* renamed from: c */
    public C1138w f4593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1119p(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC1082c1.m2702a(context);
        AbstractC1079b1.m2695a(this, getContext());
        C0929b c0929b = new C0929b(this);
        this.f4591a = c0929b;
        c0929b.m2420k(attributeSet, i2);
        C1072Z c1072z = new C1072Z(this);
        this.f4592b = c1072z;
        c1072z.m2683f(attributeSet, i2);
        c1072z.m2680b();
        getEmojiTextViewHelper().m2757a(attributeSet, i2);
    }

    private C1138w getEmojiTextViewHelper() {
        if (this.f4593c == null) {
            this.f4593c = new C1138w(this);
        }
        return this.f4593c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0929b c0929b = this.f4591a;
        if (c0929b != null) {
            c0929b.m2410a();
        }
        C1072Z c1072z = this.f4592b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1133t1.f4639b) {
            return super.getAutoSizeMaxTextSize();
        }
        C1072Z c1072z = this.f4592b;
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
        C1072Z c1072z = this.f4592b;
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
        C1072Z c1072z = this.f4592b;
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
        C1072Z c1072z = this.f4592b;
        return c1072z != null ? c1072z.f4453i.f4524f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC1133t1.f4639b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1072Z c1072z = this.f4592b;
        if (c1072z != null) {
            return c1072z.f4453i.f4519a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0356d.m949J(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0929b c0929b = this.f4591a;
        if (c0929b != null) {
            return c0929b.m2417h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0929b c0929b = this.f4591a;
        if (c0929b != null) {
            return c0929b.m2418i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4592b.m2681d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4592b.m2682e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C1072Z c1072z = this.f4592b;
        if (c1072z == null || AbstractC1133t1.f4639b) {
            return;
        }
        c1072z.f4453i.m2716a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C1072Z c1072z = this.f4592b;
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
        C1072Z c1072z = this.f4592b;
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
        C1072Z c1072z = this.f4592b;
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
        C1072Z c1072z = this.f4592b;
        if (c1072z != null) {
            c1072z.m2687k(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0929b c0929b = this.f4591a;
        if (c0929b != null) {
            c0929b.m2422m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0929b c0929b = this.f4591a;
        if (c0929b != null) {
            c0929b.m2423n(i2);
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

    public void setSupportAllCaps(boolean z2) {
        C1072Z c1072z = this.f4592b;
        if (c1072z != null) {
            c1072z.f4445a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0929b c0929b = this.f4591a;
        if (c0929b != null) {
            c0929b.m2428s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0929b c0929b = this.f4591a;
        if (c0929b != null) {
            c0929b.m2429t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1072Z c1072z = this.f4592b;
        c1072z.m2688l(colorStateList);
        c1072z.m2680b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1072Z c1072z = this.f4592b;
        c1072z.m2689m(mode);
        c1072z.m2680b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C1072Z c1072z = this.f4592b;
        if (c1072z != null) {
            c1072z.m2684g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = AbstractC1133t1.f4639b;
        if (z2) {
            super.setTextSize(i2, f);
            return;
        }
        C1072Z c1072z = this.f4592b;
        if (c1072z == null || z2) {
            return;
        }
        C1102j0 c1102j0 = c1072z.f4453i;
        if (c1102j0.m2718f()) {
            return;
        }
        c1102j0.m2719g(i2, f);
    }
}
