package p064W0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p002A1.C0027i;
import p028K.AbstractC0241P;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0368A;
import p093e2.AbstractC0901d;
import p105j.C1081c0;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: W0.x */
/* loaded from: classes.dex */
public final class C0578x extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f1855a;

    /* renamed from: b */
    public final C1081c0 f1856b;

    /* renamed from: c */
    public CharSequence f1857c;

    /* renamed from: d */
    public final CheckableImageButton f1858d;

    /* renamed from: e */
    public ColorStateList f1859e;

    /* renamed from: f */
    public PorterDuff.Mode f1860f;

    /* renamed from: g */
    public int f1861g;

    /* renamed from: h */
    public ImageView.ScaleType f1862h;

    /* renamed from: i */
    public View.OnLongClickListener f1863i;

    /* renamed from: j */
    public boolean f1864j;

    public C0578x(TextInputLayout textInputLayout, C0027i c0027i) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f1855a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1858d = checkableImageButton;
        C1081c0 c1081c0 = new C1081c0(getContext(), null);
        this.f1856b = c1081c0;
        if (AbstractC0901d.m2285P(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f1863i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0364l.m998e0(checkableImageButton, onLongClickListener);
        this.f1863i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0364l.m998e0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0027i.f66c;
        if (typedArray.hasValue(69)) {
            this.f1859e = AbstractC0901d.m2316s(getContext(), c0027i, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f1860f = AbstractC0368A.m1042g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m1389b(c0027i.m100B(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1861g) {
            this.f1861g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM1012t = AbstractC0364l.m1012t(typedArray.getInt(68, -1));
            this.f1862h = scaleTypeM1012t;
            checkableImageButton.setScaleType(scaleTypeM1012t);
        }
        c1081c0.setVisibility(8);
        c1081c0.setId(R.id.textinput_prefix_text);
        c1081c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        c1081c0.setAccessibilityLiveRegion(1);
        c1081c0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c1081c0.setTextColor(c0027i.m99A(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f1857c = TextUtils.isEmpty(text2) ? null : text2;
        c1081c0.setText(text2);
        m1392e();
        addView(checkableImageButton);
        addView(c1081c0);
    }

    /* renamed from: a */
    public final int m1388a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f1858d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        return this.f1856b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* renamed from: b */
    public final void m1389b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1858d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1859e;
            PorterDuff.Mode mode = this.f1860f;
            TextInputLayout textInputLayout = this.f1855a;
            AbstractC0364l.m1001h(textInputLayout, checkableImageButton, colorStateList, mode);
            m1390c(true);
            AbstractC0364l.m994a0(textInputLayout, checkableImageButton, this.f1859e);
            return;
        }
        m1390c(false);
        View.OnLongClickListener onLongClickListener = this.f1863i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0364l.m998e0(checkableImageButton, onLongClickListener);
        this.f1863i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0364l.m998e0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* renamed from: c */
    public final void m1390c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f1858d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            m1391d();
            m1392e();
        }
    }

    /* renamed from: d */
    public final void m1391d() throws Resources.NotFoundException {
        int paddingStart;
        EditText editText = this.f1855a.f3362d;
        if (editText == null) {
            return;
        }
        if (this.f1858d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
        this.f1856b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* renamed from: e */
    public final void m1392e() {
        int i2 = (this.f1857c == null || this.f1864j) ? 8 : 0;
        setVisibility((this.f1858d.getVisibility() == 0 || i2 == 0) ? 0 : 8);
        this.f1856b.setVisibility(i2);
        this.f1855a.m2129q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) throws Resources.NotFoundException {
        super.onMeasure(i2, i3);
        m1391d();
    }
}
