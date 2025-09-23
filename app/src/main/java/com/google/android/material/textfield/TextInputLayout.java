package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p000A.AbstractC0001b;
import p001A0.C0004c;
import p002A1.C0027i;
import p002A1.RunnableC0030l;
import p002A1.RunnableC0042x;
import p006C.AbstractC0069a;
import p007C0.C0085c;
import p007C0.C0086d;
import p009D.AbstractC0098a;
import p022I.AbstractC0205h;
import p022I.C0199b;
import p028K.AbstractC0232G;
import p028K.AbstractC0241P;
import p028K.C0263g;
import p033L1.AbstractC0356d;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0368A;
import p035M0.AbstractC0374c;
import p035M0.C0373b;
import p046Q0.C0455a;
import p046Q0.C0458d;
import p055T0.C0507a;
import p055T0.C0511e;
import p055T0.C0512f;
import p055T0.C0513g;
import p055T0.C0515i;
import p055T0.C0516j;
import p055T0.C0517k;
import p055T0.InterfaceC0509c;
import p064W0.C0554B;
import p064W0.C0560f;
import p064W0.C0561g;
import p064W0.C0564j;
import p064W0.C0566l;
import p064W0.C0569o;
import p064W0.C0572r;
import p064W0.C0573s;
import p064W0.C0576v;
import p064W0.C0578x;
import p064W0.C0579y;
import p064W0.C0580z;
import p064W0.InterfaceC0553A;
import p070Y0.AbstractC0601a;
import p093e2.AbstractC0901d;
import p105j.AbstractC1117o0;
import p105j.C1081c0;
import p105j.C1131t;
import p106j0.AbstractC1168q;
import p106j0.C1159h;
import p145x0.AbstractC1395a;
import p148y0.AbstractC1400a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0 */
    public static final int[][] f3330C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A */
    public ColorStateList f3331A;

    /* renamed from: A0 */
    public boolean f3332A0;

    /* renamed from: B */
    public ColorStateList f3333B;

    /* renamed from: B0 */
    public boolean f3334B0;

    /* renamed from: C */
    public boolean f3335C;

    /* renamed from: D */
    public CharSequence f3336D;

    /* renamed from: E */
    public boolean f3337E;

    /* renamed from: F */
    public C0513g f3338F;

    /* renamed from: G */
    public C0513g f3339G;

    /* renamed from: H */
    public StateListDrawable f3340H;

    /* renamed from: I */
    public boolean f3341I;

    /* renamed from: J */
    public C0513g f3342J;

    /* renamed from: K */
    public C0513g f3343K;

    /* renamed from: L */
    public C0517k f3344L;

    /* renamed from: M */
    public boolean f3345M;

    /* renamed from: N */
    public final int f3346N;

    /* renamed from: O */
    public int f3347O;

    /* renamed from: P */
    public int f3348P;

    /* renamed from: Q */
    public int f3349Q;

    /* renamed from: R */
    public int f3350R;

    /* renamed from: S */
    public int f3351S;

    /* renamed from: T */
    public int f3352T;

    /* renamed from: U */
    public int f3353U;

    /* renamed from: V */
    public final Rect f3354V;

    /* renamed from: W */
    public final Rect f3355W;

    /* renamed from: a */
    public final FrameLayout f3356a;

    /* renamed from: a0 */
    public final RectF f3357a0;

    /* renamed from: b */
    public final C0578x f3358b;

    /* renamed from: b0 */
    public Typeface f3359b0;

    /* renamed from: c */
    public final C0569o f3360c;

    /* renamed from: c0 */
    public ColorDrawable f3361c0;

    /* renamed from: d */
    public EditText f3362d;

    /* renamed from: d0 */
    public int f3363d0;

    /* renamed from: e */
    public CharSequence f3364e;

    /* renamed from: e0 */
    public final LinkedHashSet f3365e0;

    /* renamed from: f */
    public int f3366f;

    /* renamed from: f0 */
    public ColorDrawable f3367f0;

    /* renamed from: g */
    public int f3368g;

    /* renamed from: g0 */
    public int f3369g0;

    /* renamed from: h */
    public int f3370h;

    /* renamed from: h0 */
    public Drawable f3371h0;

    /* renamed from: i */
    public int f3372i;

    /* renamed from: i0 */
    public ColorStateList f3373i0;

    /* renamed from: j */
    public final C0573s f3374j;

    /* renamed from: j0 */
    public ColorStateList f3375j0;

    /* renamed from: k */
    public boolean f3376k;

    /* renamed from: k0 */
    public int f3377k0;

    /* renamed from: l */
    public int f3378l;

    /* renamed from: l0 */
    public int f3379l0;

    /* renamed from: m */
    public boolean f3380m;

    /* renamed from: m0 */
    public int f3381m0;

    /* renamed from: n */
    public InterfaceC0553A f3382n;

    /* renamed from: n0 */
    public ColorStateList f3383n0;

    /* renamed from: o */
    public C1081c0 f3384o;

    /* renamed from: o0 */
    public int f3385o0;

    /* renamed from: p */
    public int f3386p;

    /* renamed from: p0 */
    public int f3387p0;

    /* renamed from: q */
    public int f3388q;

    /* renamed from: q0 */
    public int f3389q0;

    /* renamed from: r */
    public CharSequence f3390r;

    /* renamed from: r0 */
    public int f3391r0;

    /* renamed from: s */
    public boolean f3392s;

    /* renamed from: s0 */
    public int f3393s0;

    /* renamed from: t */
    public C1081c0 f3394t;

    /* renamed from: t0 */
    public int f3395t0;

    /* renamed from: u */
    public ColorStateList f3396u;

    /* renamed from: u0 */
    public boolean f3397u0;

    /* renamed from: v */
    public int f3398v;

    /* renamed from: v0 */
    public final C0373b f3399v0;

    /* renamed from: w */
    public C1159h f3400w;

    /* renamed from: w0 */
    public boolean f3401w0;

    /* renamed from: x */
    public C1159h f3402x;

    /* renamed from: x0 */
    public boolean f3403x0;

    /* renamed from: y */
    public ColorStateList f3404y;

    /* renamed from: y0 */
    public ValueAnimator f3405y0;

    /* renamed from: z */
    public ColorStateList f3406z;

    /* renamed from: z0 */
    public boolean f3407z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC0601a.m1405a(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.textInputStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_Design_TextInputLayout), attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.textInputStyle);
        this.f3366f = -1;
        this.f3368g = -1;
        this.f3370h = -1;
        this.f3372i = -1;
        this.f3374j = new C0573s(this);
        this.f3382n = new C0263g(2);
        this.f3354V = new Rect();
        this.f3355W = new Rect();
        this.f3357a0 = new RectF();
        this.f3365e0 = new LinkedHashSet();
        C0373b c0373b = new C0373b(this);
        this.f3399v0 = c0373b;
        this.f3334B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f3356a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC1400a.f6066a;
        c0373b.f1158Q = linearInterpolator;
        c0373b.m1050h(false);
        c0373b.f1157P = linearInterpolator;
        c0373b.m1050h(false);
        if (c0373b.f1180g != 8388659) {
            c0373b.f1180g = 8388659;
            c0373b.m1050h(false);
        }
        int[] iArr = AbstractC1395a.f6030D;
        AbstractC0368A.m1036a(context2, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.textInputStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_Design_TextInputLayout);
        AbstractC0368A.m1037b(context2, attributeSet, iArr, tkbmmn.ghwbbf.irvjzy.R.attr.textInputStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, tkbmmn.ghwbbf.irvjzy.R.attr.textInputStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_Design_TextInputLayout);
        C0027i c0027i = new C0027i(context2, typedArrayObtainStyledAttributes);
        C0578x c0578x = new C0578x(this, c0027i);
        this.f3358b = c0578x;
        this.f3335C = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f3403x0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f3401w0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f3344L = C0517k.m1297b(context2, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.textInputStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_Design_TextInputLayout).m1295a();
        this.f3346N = context2.getResources().getDimensionPixelOffset(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f3348P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f3350R = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f3351S = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f3349Q = this.f3350R;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C0516j c0516jM1300e = this.f3344L.m1300e();
        if (dimension >= 0.0f) {
            c0516jM1300e.f1628e = new C0507a(dimension);
        }
        if (dimension2 >= 0.0f) {
            c0516jM1300e.f1629f = new C0507a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c0516jM1300e.f1630g = new C0507a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c0516jM1300e.f1631h = new C0507a(dimension4);
        }
        this.f3344L = c0516jM1300e.m1295a();
        ColorStateList colorStateListM2316s = AbstractC0901d.m2316s(context2, c0027i, 7);
        if (colorStateListM2316s != null) {
            int defaultColor = colorStateListM2316s.getDefaultColor();
            this.f3385o0 = defaultColor;
            this.f3353U = defaultColor;
            if (colorStateListM2316s.isStateful()) {
                this.f3387p0 = colorStateListM2316s.getColorForState(new int[]{-16842910}, -1);
                this.f3389q0 = colorStateListM2316s.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f3391r0 = colorStateListM2316s.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f3389q0 = this.f3385o0;
                ColorStateList colorStateListM969s = AbstractC0356d.m969s(context2, tkbmmn.ghwbbf.irvjzy.R.color.mtrl_filled_background_color);
                this.f3387p0 = colorStateListM969s.getColorForState(new int[]{-16842910}, -1);
                this.f3391r0 = colorStateListM969s.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f3353U = 0;
            this.f3385o0 = 0;
            this.f3387p0 = 0;
            this.f3389q0 = 0;
            this.f3391r0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM99A = c0027i.m99A(1);
            this.f3375j0 = colorStateListM99A;
            this.f3373i0 = colorStateListM99A;
        }
        ColorStateList colorStateListM2316s2 = AbstractC0901d.m2316s(context2, c0027i, 14);
        this.f3381m0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f3377k0 = AbstractC0001b.m3a(context2, tkbmmn.ghwbbf.irvjzy.R.color.mtrl_textinput_default_box_stroke_color);
        this.f3393s0 = AbstractC0001b.m3a(context2, tkbmmn.ghwbbf.irvjzy.R.color.mtrl_textinput_disabled_color);
        this.f3379l0 = AbstractC0001b.m3a(context2, tkbmmn.ghwbbf.irvjzy.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM2316s2 != null) {
            setBoxStrokeColorStateList(colorStateListM2316s2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0901d.m2316s(context2, c0027i, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f3331A = c0027i.m99A(24);
        this.f3333B = c0027i.m99A(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i2 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f3388q = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f3386p = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.f3386p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f3388q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0027i.m99A(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0027i.m99A(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0027i.m99A(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0027i.m99A(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0027i.m99A(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0027i.m99A(58));
        }
        C0569o c0569o = new C0569o(this, c0027i);
        this.f3360c = c0569o;
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c0027i.m114R();
        setImportantForAccessibility(2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 >= 26) {
            AbstractC0232G.m660m(this, 1);
        }
        frameLayout.addView(c0578x);
        frameLayout.addView(c0569o);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f3362d;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC0356d.m972w(editText)) {
            return this.f3338F;
        }
        int iM983G = AbstractC0364l.m983G(this.f3362d, tkbmmn.ghwbbf.irvjzy.R.attr.colorControlHighlight);
        int i2 = this.f3347O;
        int[][] iArr = f3330C0;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            C0513g c0513g = this.f3338F;
            int i3 = this.f3353U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0364l.m990Q(iM983G, i3, 0.1f), i3}), c0513g, c0513g);
        }
        Context context = getContext();
        C0513g c0513g2 = this.f3338F;
        TypedValue typedValueM997d0 = AbstractC0364l.m997d0(context, tkbmmn.ghwbbf.irvjzy.R.attr.colorSurface, "TextInputLayout");
        int i4 = typedValueM997d0.resourceId;
        int iM3a = i4 != 0 ? AbstractC0001b.m3a(context, i4) : typedValueM997d0.data;
        C0513g c0513g3 = new C0513g(c0513g2.f1601a.f1584a);
        int iM990Q = AbstractC0364l.m990Q(iM983G, iM3a, 0.1f);
        c0513g3.m1290j(new ColorStateList(iArr, new int[]{iM990Q, 0}));
        c0513g3.setTint(iM3a);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM990Q, iM3a});
        C0513g c0513g4 = new C0513g(c0513g2.f1601a.f1584a);
        c0513g4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0513g3, c0513g4), c0513g2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f3340H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f3340H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f3340H.addState(new int[0], m2119f(false));
        }
        return this.f3340H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f3339G == null) {
            this.f3339G = m2119f(true);
        }
        return this.f3339G;
    }

    /* renamed from: k */
    public static void m2113k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m2113k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f3362d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z2 = editText instanceof TextInputEditText;
        }
        this.f3362d = editText;
        int i2 = this.f3366f;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.f3370h);
        }
        int i3 = this.f3368g;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.f3372i);
        }
        this.f3341I = false;
        m2122i();
        setTextInputAccessibilityDelegate(new C0580z(this));
        Typeface typeface = this.f3362d.getTypeface();
        C0373b c0373b = this.f3399v0;
        c0373b.m1055m(typeface);
        float textSize = this.f3362d.getTextSize();
        if (c0373b.f1181h != textSize) {
            c0373b.f1181h = textSize;
            c0373b.m1050h(false);
        }
        int i4 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f3362d.getLetterSpacing();
        if (c0373b.f1164W != letterSpacing) {
            c0373b.f1164W = letterSpacing;
            c0373b.m1050h(false);
        }
        int gravity = this.f3362d.getGravity();
        int i5 = (gravity & (-113)) | 48;
        if (c0373b.f1180g != i5) {
            c0373b.f1180g = i5;
            c0373b.m1050h(false);
        }
        if (c0373b.f1178f != gravity) {
            c0373b.f1178f = gravity;
            c0373b.m1050h(false);
        }
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        this.f3395t0 = editText.getMinimumHeight();
        this.f3362d.addTextChangedListener(new C0579y(this, editText));
        if (this.f3373i0 == null) {
            this.f3373i0 = this.f3362d.getHintTextColors();
        }
        if (this.f3335C) {
            if (TextUtils.isEmpty(this.f3336D)) {
                CharSequence hint = this.f3362d.getHint();
                this.f3364e = hint;
                setHint(hint);
                this.f3362d.setHint((CharSequence) null);
            }
            this.f3337E = true;
        }
        if (i4 >= 29) {
            m2128p();
        }
        if (this.f3384o != null) {
            m2126n(this.f3362d.getText());
        }
        m2130r();
        this.f3374j.m1376b();
        this.f3358b.bringToFront();
        C0569o c0569o = this.f3360c;
        c0569o.bringToFront();
        Iterator it = this.f3365e0.iterator();
        while (it.hasNext()) {
            ((C0566l) it.next()).m1354a(this);
        }
        c0569o.m1370m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m2133u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f3336D)) {
            return;
        }
        this.f3336D = charSequence;
        C0373b c0373b = this.f3399v0;
        if (charSequence == null || !TextUtils.equals(c0373b.f1142A, charSequence)) {
            c0373b.f1142A = charSequence;
            c0373b.f1143B = null;
            Bitmap bitmap = c0373b.f1146E;
            if (bitmap != null) {
                bitmap.recycle();
                c0373b.f1146E = null;
            }
            c0373b.m1050h(false);
        }
        if (this.f3397u0) {
            return;
        }
        m2123j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f3392s == z2) {
            return;
        }
        if (z2) {
            C1081c0 c1081c0 = this.f3394t;
            if (c1081c0 != null) {
                this.f3356a.addView(c1081c0);
                this.f3394t.setVisibility(0);
            }
        } else {
            C1081c0 c1081c02 = this.f3394t;
            if (c1081c02 != null) {
                c1081c02.setVisibility(8);
            }
            this.f3394t = null;
        }
        this.f3392s = z2;
    }

    /* renamed from: a */
    public final void m2114a(float f) {
        int i2 = 1;
        C0373b c0373b = this.f3399v0;
        if (c0373b.f1170b == f) {
            return;
        }
        if (this.f3405y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3405y0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0901d.m2306l0(getContext(), tkbmmn.ghwbbf.irvjzy.R.attr.motionEasingEmphasizedInterpolator, AbstractC1400a.f6067b));
            this.f3405y0.setDuration(AbstractC0901d.m2304k0(getContext(), tkbmmn.ghwbbf.irvjzy.R.attr.motionDurationMedium4, 167));
            this.f3405y0.addUpdateListener(new C0085c(i2, this));
        }
        this.f3405y0.setFloatValues(c0373b.f1170b, f);
        this.f3405y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f3356a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m2132t();
        setEditText((EditText) view);
    }

    /* renamed from: b */
    public final void m2115b() {
        int i2;
        int i3;
        C0513g c0513g = this.f3338F;
        if (c0513g == null) {
            return;
        }
        C0517k c0517k = c0513g.f1601a.f1584a;
        C0517k c0517k2 = this.f3344L;
        if (c0517k != c0517k2) {
            c0513g.setShapeAppearanceModel(c0517k2);
        }
        if (this.f3347O == 2 && (i2 = this.f3349Q) > -1 && (i3 = this.f3352T) != 0) {
            C0513g c0513g2 = this.f3338F;
            c0513g2.f1601a.f1593j = i2;
            c0513g2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
            C0512f c0512f = c0513g2.f1601a;
            if (c0512f.f1587d != colorStateListValueOf) {
                c0512f.f1587d = colorStateListValueOf;
                c0513g2.onStateChange(c0513g2.getState());
            }
        }
        int iM193b = this.f3353U;
        if (this.f3347O == 1) {
            iM193b = AbstractC0069a.m193b(this.f3353U, AbstractC0364l.m982F(getContext(), tkbmmn.ghwbbf.irvjzy.R.attr.colorSurface, 0));
        }
        this.f3353U = iM193b;
        this.f3338F.m1290j(ColorStateList.valueOf(iM193b));
        C0513g c0513g3 = this.f3342J;
        if (c0513g3 != null && this.f3343K != null) {
            if (this.f3349Q > -1 && this.f3352T != 0) {
                c0513g3.m1290j(this.f3362d.isFocused() ? ColorStateList.valueOf(this.f3377k0) : ColorStateList.valueOf(this.f3352T));
                this.f3343K.m1290j(ColorStateList.valueOf(this.f3352T));
            }
            invalidate();
        }
        m2131s();
    }

    /* renamed from: c */
    public final int m2116c() {
        float fM1047d;
        if (!this.f3335C) {
            return 0;
        }
        int i2 = this.f3347O;
        C0373b c0373b = this.f3399v0;
        if (i2 == 0) {
            fM1047d = c0373b.m1047d();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fM1047d = c0373b.m1047d() / 2.0f;
        }
        return (int) fM1047d;
    }

    /* renamed from: d */
    public final C1159h m2117d() {
        C1159h c1159h = new C1159h();
        c1159h.f4760c = AbstractC0901d.m2304k0(getContext(), tkbmmn.ghwbbf.irvjzy.R.attr.motionDurationShort2, 87);
        c1159h.f4761d = AbstractC0901d.m2306l0(getContext(), tkbmmn.ghwbbf.irvjzy.R.attr.motionEasingLinearInterpolator, AbstractC1400a.f6066a);
        return c1159h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f3362d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f3364e != null) {
            boolean z2 = this.f3337E;
            this.f3337E = false;
            CharSequence hint = editText.getHint();
            this.f3362d.setHint(this.f3364e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f3362d.setHint(hint);
                this.f3337E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.f3356a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.f3362d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f3332A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f3332A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0513g c0513g;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z2 = this.f3335C;
        C0373b c0373b = this.f3399v0;
        if (z2) {
            c0373b.getClass();
            int iSave = canvas2.save();
            if (c0373b.f1143B != null) {
                RectF rectF = c0373b.f1176e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0373b.f1155N;
                    textPaint.setTextSize(c0373b.f1148G);
                    float f = c0373b.f1189p;
                    float f2 = c0373b.f1190q;
                    float f3 = c0373b.f1147F;
                    if (f3 != 1.0f) {
                        canvas2.scale(f3, f3, f, f2);
                    }
                    if (c0373b.f1175d0 <= 1 || c0373b.f1144C) {
                        canvas2.translate(f, f2);
                        c0373b.f1166Y.draw(canvas2);
                    } else {
                        float lineStart = c0373b.f1189p - c0373b.f1166Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c0373b.f1171b0 * f4));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f5 = c0373b.f1149H;
                            float f6 = c0373b.f1150I;
                            float f7 = c0373b.f1151J;
                            int i3 = c0373b.f1152K;
                            textPaint.setShadowLayer(f5, f6, f7, AbstractC0069a.m195d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        c0373b.f1166Y.draw(canvas2);
                        textPaint.setAlpha((int) (c0373b.f1169a0 * f4));
                        if (i2 >= 31) {
                            float f8 = c0373b.f1149H;
                            float f9 = c0373b.f1150I;
                            float f10 = c0373b.f1151J;
                            int i4 = c0373b.f1152K;
                            textPaint.setShadowLayer(f8, f9, f10, AbstractC0069a.m195d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c0373b.f1166Y.getLineBaseline(0);
                        CharSequence charSequence = c0373b.f1173c0;
                        float f11 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(c0373b.f1149H, c0373b.f1150I, c0373b.f1151J, c0373b.f1152K);
                        }
                        String strTrim = c0373b.f1173c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(c0373b.f1166Y.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(iSave);
                }
            }
        }
        if (this.f3343K == null || (c0513g = this.f3342J) == null) {
            return;
        }
        c0513g.draw(canvas2);
        if (this.f3362d.isFocused()) {
            Rect bounds = this.f3343K.getBounds();
            Rect bounds2 = this.f3342J.getBounds();
            float f12 = c0373b.f1170b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC1400a.m3166c(iCenterX, bounds2.left, f12);
            bounds.right = AbstractC1400a.m3166c(iCenterX, bounds2.right, f12);
            this.f3343K.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.f3407z0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f3407z0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            M0.b r3 = r4.f3399v0
            if (r3 == 0) goto L2f
            r3.f1153L = r1
            android.content.res.ColorStateList r1 = r3.f1184k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f1183j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.m1050h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f3362d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = p028K.AbstractC0241P.f815a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.m2133u(r0, r2)
        L47:
            r4.m2130r()
            r4.m2136x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f3407z0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* renamed from: e */
    public final boolean m2118e() {
        return this.f3335C && !TextUtils.isEmpty(this.f3336D) && (this.f3338F instanceof C0561g);
    }

    /* renamed from: f */
    public final C0513g m2119f(boolean z2) throws Resources.NotFoundException {
        int i2 = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f3362d;
        float popupElevation = editText instanceof C0576v ? ((C0576v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(tkbmmn.ghwbbf.irvjzy.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0515i c0515i = new C0515i();
        C0515i c0515i2 = new C0515i();
        C0515i c0515i3 = new C0515i();
        C0515i c0515i4 = new C0515i();
        C0511e c0511e = new C0511e(i2);
        C0511e c0511e2 = new C0511e(i2);
        C0511e c0511e3 = new C0511e(i2);
        C0511e c0511e4 = new C0511e(i2);
        C0507a c0507a = new C0507a(f);
        C0507a c0507a2 = new C0507a(f);
        C0507a c0507a3 = new C0507a(dimensionPixelOffset);
        C0507a c0507a4 = new C0507a(dimensionPixelOffset);
        C0517k c0517k = new C0517k();
        c0517k.f1636a = c0515i;
        c0517k.f1637b = c0515i2;
        c0517k.f1638c = c0515i3;
        c0517k.f1639d = c0515i4;
        c0517k.f1640e = c0507a;
        c0517k.f1641f = c0507a2;
        c0517k.f1642g = c0507a4;
        c0517k.f1643h = c0507a3;
        c0517k.f1644i = c0511e;
        c0517k.f1645j = c0511e2;
        c0517k.f1646k = c0511e3;
        c0517k.f1647l = c0511e4;
        EditText editText2 = this.f3362d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0576v ? ((C0576v) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C0513g.f1600w;
            TypedValue typedValueM997d0 = AbstractC0364l.m997d0(context, tkbmmn.ghwbbf.irvjzy.R.attr.colorSurface, C0513g.class.getSimpleName());
            int i3 = typedValueM997d0.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i3 != 0 ? AbstractC0001b.m3a(context, i3) : typedValueM997d0.data);
        }
        C0513g c0513g = new C0513g();
        c0513g.m1288h(context);
        c0513g.m1290j(dropDownBackgroundTintList);
        c0513g.m1289i(popupElevation);
        c0513g.setShapeAppearanceModel(c0517k);
        C0512f c0512f = c0513g.f1601a;
        if (c0512f.f1590g == null) {
            c0512f.f1590g = new Rect();
        }
        c0513g.f1601a.f1590g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c0513g.invalidateSelf();
        return c0513g;
    }

    /* renamed from: g */
    public final int m2120g(int i2, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f3362d.getCompoundPaddingLeft() : this.f3360c.m1360c() : this.f3358b.m1388a()) + i2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3362d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m2116c() + getPaddingTop() + editText.getBaseline();
    }

    public C0513g getBoxBackground() {
        int i2 = this.f3347O;
        if (i2 == 1 || i2 == 2) {
            return this.f3338F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3353U;
    }

    public int getBoxBackgroundMode() {
        return this.f3347O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f3348P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM1040e = AbstractC0368A.m1040e(this);
        RectF rectF = this.f3357a0;
        return zM1040e ? this.f3344L.f1643h.mo1270a(rectF) : this.f3344L.f1642g.mo1270a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM1040e = AbstractC0368A.m1040e(this);
        RectF rectF = this.f3357a0;
        return zM1040e ? this.f3344L.f1642g.mo1270a(rectF) : this.f3344L.f1643h.mo1270a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM1040e = AbstractC0368A.m1040e(this);
        RectF rectF = this.f3357a0;
        return zM1040e ? this.f3344L.f1640e.mo1270a(rectF) : this.f3344L.f1641f.mo1270a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM1040e = AbstractC0368A.m1040e(this);
        RectF rectF = this.f3357a0;
        return zM1040e ? this.f3344L.f1641f.mo1270a(rectF) : this.f3344L.f1640e.mo1270a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f3381m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3383n0;
    }

    public int getBoxStrokeWidth() {
        return this.f3350R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f3351S;
    }

    public int getCounterMaxLength() {
        return this.f3378l;
    }

    public CharSequence getCounterOverflowDescription() {
        C1081c0 c1081c0;
        if (this.f3376k && this.f3380m && (c1081c0 = this.f3384o) != null) {
            return c1081c0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f3406z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3404y;
    }

    public ColorStateList getCursorColor() {
        return this.f3331A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f3333B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f3373i0;
    }

    public EditText getEditText() {
        return this.f3362d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3360c.f1785g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3360c.f1785g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f3360c.f1791m;
    }

    public int getEndIconMode() {
        return this.f3360c.f1787i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f3360c.f1792n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3360c.f1785g;
    }

    public CharSequence getError() {
        C0573s c0573s = this.f3374j;
        if (c0573s.f1829q) {
            return c0573s.f1828p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f3374j.f1832t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3374j.f1831s;
    }

    public int getErrorCurrentTextColors() {
        C1081c0 c1081c0 = this.f3374j.f1830r;
        if (c1081c0 != null) {
            return c1081c0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f3360c.f1781c.getDrawable();
    }

    public CharSequence getHelperText() {
        C0573s c0573s = this.f3374j;
        if (c0573s.f1836x) {
            return c0573s.f1835w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C1081c0 c1081c0 = this.f3374j.f1837y;
        if (c1081c0 != null) {
            return c1081c0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f3335C) {
            return this.f3336D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f3399v0.m1047d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0373b c0373b = this.f3399v0;
        return c0373b.m1048e(c0373b.f1184k);
    }

    public ColorStateList getHintTextColor() {
        return this.f3375j0;
    }

    public InterfaceC0553A getLengthCounter() {
        return this.f3382n;
    }

    public int getMaxEms() {
        return this.f3368g;
    }

    public int getMaxWidth() {
        return this.f3372i;
    }

    public int getMinEms() {
        return this.f3366f;
    }

    public int getMinWidth() {
        return this.f3370h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3360c.f1785g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3360c.f1785g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3392s) {
            return this.f3390r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3398v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3396u;
    }

    public CharSequence getPrefixText() {
        return this.f3358b.f1857c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3358b.f1856b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3358b.f1856b;
    }

    public C0517k getShapeAppearanceModel() {
        return this.f3344L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3358b.f1858d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3358b.f1858d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f3358b.f1861g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f3358b.f1862h;
    }

    public CharSequence getSuffixText() {
        return this.f3360c.f1794p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3360c.f1795q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3360c.f1795q;
    }

    public Typeface getTypeface() {
        return this.f3359b0;
    }

    /* renamed from: h */
    public final int m2121h(int i2, boolean z2) {
        return i2 - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f3362d.getCompoundPaddingRight() : this.f3358b.m1388a() : this.f3360c.m1360c());
    }

    /* renamed from: i */
    public final void m2122i() throws Resources.NotFoundException {
        int i2 = this.f3347O;
        if (i2 == 0) {
            this.f3338F = null;
            this.f3342J = null;
            this.f3343K = null;
        } else if (i2 == 1) {
            this.f3338F = new C0513g(this.f3344L);
            this.f3342J = new C0513g();
            this.f3343K = new C0513g();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.f3347O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f3335C || (this.f3338F instanceof C0561g)) {
                this.f3338F = new C0513g(this.f3344L);
            } else {
                C0517k c0517k = this.f3344L;
                int i3 = C0561g.f1753y;
                if (c0517k == null) {
                    c0517k = new C0517k();
                }
                C0560f c0560f = new C0560f(c0517k, new RectF());
                C0561g c0561g = new C0561g(c0560f);
                c0561g.f1754x = c0560f;
                this.f3338F = c0561g;
            }
            this.f3342J = null;
            this.f3343K = null;
        }
        m2131s();
        m2136x();
        if (this.f3347O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f3348P = getResources().getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0901d.m2285P(getContext())) {
                this.f3348P = getResources().getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f3362d != null && this.f3347O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f3362d;
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f3362d.getPaddingEnd(), getResources().getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0901d.m2285P(getContext())) {
                EditText editText2 = this.f3362d;
                WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f3362d.getPaddingEnd(), getResources().getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f3347O != 0) {
            m2132t();
        }
        EditText editText3 = this.f3362d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.f3347O;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2123j() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2123j():void");
    }

    /* renamed from: l */
    public final void m2124l(C1081c0 c1081c0, int i2) {
        try {
            c1081c0.setTextAppearance(i2);
            if (c1081c0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c1081c0.setTextAppearance(tkbmmn.ghwbbf.irvjzy.R.style.TextAppearance_AppCompat_Caption);
        c1081c0.setTextColor(AbstractC0001b.m3a(getContext(), tkbmmn.ghwbbf.irvjzy.R.color.design_error));
    }

    /* renamed from: m */
    public final boolean m2125m() {
        C0573s c0573s = this.f3374j;
        return (c0573s.f1827o != 1 || c0573s.f1830r == null || TextUtils.isEmpty(c0573s.f1828p)) ? false : true;
    }

    /* renamed from: n */
    public final void m2126n(Editable editable) throws Resources.NotFoundException {
        ((C0263g) this.f3382n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f3380m;
        int i2 = this.f3378l;
        String string = null;
        if (i2 == -1) {
            this.f3384o.setText(String.valueOf(length));
            this.f3384o.setContentDescription(null);
            this.f3380m = false;
        } else {
            this.f3380m = length > i2;
            Context context = getContext();
            this.f3384o.setContentDescription(context.getString(this.f3380m ? tkbmmn.ghwbbf.irvjzy.R.string.character_counter_overflowed_content_description : tkbmmn.ghwbbf.irvjzy.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f3378l)));
            if (z2 != this.f3380m) {
                m2127o();
            }
            String str = C0199b.f746b;
            C0199b c0199b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0199b.f749e : C0199b.f748d;
            C1081c0 c1081c0 = this.f3384o;
            String string2 = getContext().getString(tkbmmn.ghwbbf.irvjzy.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f3378l));
            if (string2 == null) {
                c0199b.getClass();
            } else {
                c0199b.getClass();
                C0086d c0086d = AbstractC0205h.f756a;
                string = c0199b.m534c(string2).toString();
            }
            c1081c0.setText(string);
        }
        if (this.f3362d == null || z2 == this.f3380m) {
            return;
        }
        m2133u(false, false);
        m2136x();
        m2130r();
    }

    /* renamed from: o */
    public final void m2127o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1081c0 c1081c0 = this.f3384o;
        if (c1081c0 != null) {
            m2124l(c1081c0, this.f3380m ? this.f3386p : this.f3388q);
            if (!this.f3380m && (colorStateList2 = this.f3404y) != null) {
                this.f3384o.setTextColor(colorStateList2);
            }
            if (!this.f3380m || (colorStateList = this.f3406z) == null) {
                return;
            }
            this.f3384o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3399v0.m1049g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0569o c0569o = this.f3360c;
        c0569o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f3334B0 = false;
        if (this.f3362d != null && this.f3362d.getMeasuredHeight() < (iMax = Math.max(c0569o.getMeasuredHeight(), this.f3358b.getMeasuredHeight()))) {
            this.f3362d.setMinimumHeight(iMax);
            z2 = true;
        }
        boolean zM2129q = m2129q();
        if (z2 || zM2129q) {
            this.f3362d.post(new RunnableC0030l(7, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.f3362d;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC0374c.f1200a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f3354V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC0374c.f1200a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC0374c.m1056a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC0374c.f1201b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C0513g c0513g = this.f3342J;
            if (c0513g != null) {
                int i6 = rect.bottom;
                c0513g.setBounds(rect.left, i6 - this.f3350R, rect.right, i6);
            }
            C0513g c0513g2 = this.f3343K;
            if (c0513g2 != null) {
                int i7 = rect.bottom;
                c0513g2.setBounds(rect.left, i7 - this.f3351S, rect.right, i7);
            }
            if (this.f3335C) {
                float textSize = this.f3362d.getTextSize();
                C0373b c0373b = this.f3399v0;
                if (c0373b.f1181h != textSize) {
                    c0373b.f1181h = textSize;
                    c0373b.m1050h(false);
                }
                int gravity = this.f3362d.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (c0373b.f1180g != i8) {
                    c0373b.f1180g = i8;
                    c0373b.m1050h(false);
                }
                if (c0373b.f1178f != gravity) {
                    c0373b.f1178f = gravity;
                    c0373b.m1050h(false);
                }
                if (this.f3362d == null) {
                    throw new IllegalStateException();
                }
                boolean zM1040e = AbstractC0368A.m1040e(this);
                int i9 = rect.bottom;
                Rect rect2 = this.f3355W;
                rect2.bottom = i9;
                int i10 = this.f3347O;
                if (i10 == 1) {
                    rect2.left = m2120g(rect.left, zM1040e);
                    rect2.top = rect.top + this.f3348P;
                    rect2.right = m2121h(rect.right, zM1040e);
                } else if (i10 != 2) {
                    rect2.left = m2120g(rect.left, zM1040e);
                    rect2.top = getPaddingTop();
                    rect2.right = m2121h(rect.right, zM1040e);
                } else {
                    rect2.left = this.f3362d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m2116c();
                    rect2.right = rect.right - this.f3362d.getPaddingRight();
                }
                int i11 = rect2.left;
                int i12 = rect2.top;
                int i13 = rect2.right;
                int i14 = rect2.bottom;
                Rect rect3 = c0373b.f1174d;
                if (rect3.left != i11 || rect3.top != i12 || rect3.right != i13 || rect3.bottom != i14) {
                    rect3.set(i11, i12, i13, i14);
                    c0373b.f1154M = true;
                }
                if (this.f3362d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0373b.f1156O;
                textPaint.setTextSize(c0373b.f1181h);
                textPaint.setTypeface(c0373b.f1194u);
                textPaint.setLetterSpacing(c0373b.f1164W);
                float f = -textPaint.ascent();
                rect2.left = this.f3362d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f3347O != 1 || this.f3362d.getMinLines() > 1) ? rect.top + this.f3362d.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f3362d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f3347O != 1 || this.f3362d.getMinLines() > 1) ? rect.bottom - this.f3362d.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                Rect rect4 = c0373b.f1172c;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    c0373b.f1154M = true;
                }
                c0373b.m1050h(false);
                if (!m2118e() || this.f3397u0) {
                    return;
                }
                m2123j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) throws Resources.NotFoundException {
        EditText editText;
        super.onMeasure(i2, i3);
        boolean z2 = this.f3334B0;
        C0569o c0569o = this.f3360c;
        if (!z2) {
            c0569o.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f3334B0 = true;
        }
        if (this.f3394t != null && (editText = this.f3362d) != null) {
            this.f3394t.setGravity(editText.getGravity());
            this.f3394t.setPadding(this.f3362d.getCompoundPaddingLeft(), this.f3362d.getCompoundPaddingTop(), this.f3362d.getCompoundPaddingRight(), this.f3362d.getCompoundPaddingBottom());
        }
        c0569o.m1370m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof C0554B)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0554B c0554b = (C0554B) parcelable;
        super.onRestoreInstanceState(c0554b.f1521a);
        setError(c0554b.f1734c);
        if (c0554b.f1735d) {
            post(new RunnableC0042x(7, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = i2 == 1;
        if (z2 != this.f3345M) {
            InterfaceC0509c interfaceC0509c = this.f3344L.f1640e;
            RectF rectF = this.f3357a0;
            float fMo1270a = interfaceC0509c.mo1270a(rectF);
            float fMo1270a2 = this.f3344L.f1641f.mo1270a(rectF);
            float fMo1270a3 = this.f3344L.f1643h.mo1270a(rectF);
            float fMo1270a4 = this.f3344L.f1642g.mo1270a(rectF);
            C0517k c0517k = this.f3344L;
            AbstractC0356d abstractC0356d = c0517k.f1636a;
            AbstractC0356d abstractC0356d2 = c0517k.f1637b;
            AbstractC0356d abstractC0356d3 = c0517k.f1639d;
            AbstractC0356d abstractC0356d4 = c0517k.f1638c;
            C0511e c0511e = new C0511e(0);
            C0511e c0511e2 = new C0511e(0);
            C0511e c0511e3 = new C0511e(0);
            C0511e c0511e4 = new C0511e(0);
            C0516j.m1294b(abstractC0356d2);
            C0516j.m1294b(abstractC0356d);
            C0516j.m1294b(abstractC0356d4);
            C0516j.m1294b(abstractC0356d3);
            C0507a c0507a = new C0507a(fMo1270a2);
            C0507a c0507a2 = new C0507a(fMo1270a);
            C0507a c0507a3 = new C0507a(fMo1270a4);
            C0507a c0507a4 = new C0507a(fMo1270a3);
            C0517k c0517k2 = new C0517k();
            c0517k2.f1636a = abstractC0356d2;
            c0517k2.f1637b = abstractC0356d;
            c0517k2.f1638c = abstractC0356d3;
            c0517k2.f1639d = abstractC0356d4;
            c0517k2.f1640e = c0507a;
            c0517k2.f1641f = c0507a2;
            c0517k2.f1642g = c0507a4;
            c0517k2.f1643h = c0507a3;
            c0517k2.f1644i = c0511e;
            c0517k2.f1645j = c0511e2;
            c0517k2.f1646k = c0511e3;
            c0517k2.f1647l = c0511e4;
            this.f3345M = z2;
            setShapeAppearanceModel(c0517k2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0554B c0554b = new C0554B(super.onSaveInstanceState());
        if (m2125m()) {
            c0554b.f1734c = getError();
        }
        C0569o c0569o = this.f3360c;
        c0554b.f1735d = c0569o.f1787i != 0 && c0569o.f1785g.f3268d;
        return c0554b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2128p() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f3331A
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130903287(0x7f0300f7, float:1.7413388E38)
            android.util.TypedValue r1 = p033L1.AbstractC0364l.m995b0(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = p033L1.AbstractC0356d.m969s(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f3362d
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = p006C.AbstractC0070b.m204e(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f3362d
            android.graphics.drawable.Drawable r1 = p006C.AbstractC0070b.m204e(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m2125m()
            if (r2 != 0) goto L49
            j.c0 r2 = r4.f3384o
            if (r2 == 0) goto L4e
            boolean r2 = r4.f3380m
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.f3333B
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            p009D.AbstractC0098a.m300h(r1, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2128p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2129q() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2129q():boolean");
    }

    /* renamed from: r */
    public final void m2130r() {
        Drawable background;
        C1081c0 c1081c0;
        EditText editText = this.f3362d;
        if (editText == null || this.f3347O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1117o0.f4587a;
        Drawable drawableMutate = background.mutate();
        if (m2125m()) {
            drawableMutate.setColorFilter(C1131t.m2750c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f3380m && (c1081c0 = this.f3384o) != null) {
            drawableMutate.setColorFilter(C1131t.m2750c(c1081c0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f3362d.refreshDrawableState();
        }
    }

    /* renamed from: s */
    public final void m2131s() {
        EditText editText = this.f3362d;
        if (editText == null || this.f3338F == null) {
            return;
        }
        if ((this.f3341I || editText.getBackground() == null) && this.f3347O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f3362d;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            editText2.setBackground(editTextBoxBackground);
            this.f3341I = true;
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.f3353U != i2) {
            this.f3353U = i2;
            this.f3385o0 = i2;
            this.f3389q0 = i2;
            this.f3391r0 = i2;
            m2115b();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(AbstractC0001b.m3a(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3385o0 = defaultColor;
        this.f3353U = defaultColor;
        this.f3387p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3389q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f3391r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m2115b();
    }

    public void setBoxBackgroundMode(int i2) throws Resources.NotFoundException {
        if (i2 == this.f3347O) {
            return;
        }
        this.f3347O = i2;
        if (this.f3362d != null) {
            m2122i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.f3348P = i2;
    }

    public void setBoxCornerFamily(int i2) {
        C0516j c0516jM1300e = this.f3344L.m1300e();
        InterfaceC0509c interfaceC0509c = this.f3344L.f1640e;
        AbstractC0356d abstractC0356dM1013u = AbstractC0364l.m1013u(i2);
        c0516jM1300e.f1624a = abstractC0356dM1013u;
        C0516j.m1294b(abstractC0356dM1013u);
        c0516jM1300e.f1628e = interfaceC0509c;
        InterfaceC0509c interfaceC0509c2 = this.f3344L.f1641f;
        AbstractC0356d abstractC0356dM1013u2 = AbstractC0364l.m1013u(i2);
        c0516jM1300e.f1625b = abstractC0356dM1013u2;
        C0516j.m1294b(abstractC0356dM1013u2);
        c0516jM1300e.f1629f = interfaceC0509c2;
        InterfaceC0509c interfaceC0509c3 = this.f3344L.f1643h;
        AbstractC0356d abstractC0356dM1013u3 = AbstractC0364l.m1013u(i2);
        c0516jM1300e.f1627d = abstractC0356dM1013u3;
        C0516j.m1294b(abstractC0356dM1013u3);
        c0516jM1300e.f1631h = interfaceC0509c3;
        InterfaceC0509c interfaceC0509c4 = this.f3344L.f1642g;
        AbstractC0356d abstractC0356dM1013u4 = AbstractC0364l.m1013u(i2);
        c0516jM1300e.f1626c = abstractC0356dM1013u4;
        C0516j.m1294b(abstractC0356dM1013u4);
        c0516jM1300e.f1630g = interfaceC0509c4;
        this.f3344L = c0516jM1300e.m1295a();
        m2115b();
    }

    public void setBoxStrokeColor(int i2) throws Resources.NotFoundException {
        if (this.f3381m0 != i2) {
            this.f3381m0 = i2;
            m2136x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.f3377k0 = colorStateList.getDefaultColor();
            this.f3393s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f3379l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f3381m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f3381m0 != colorStateList.getDefaultColor()) {
            this.f3381m0 = colorStateList.getDefaultColor();
        }
        m2136x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f3383n0 != colorStateList) {
            this.f3383n0 = colorStateList;
            m2136x();
        }
    }

    public void setBoxStrokeWidth(int i2) throws Resources.NotFoundException {
        this.f3350R = i2;
        m2136x();
    }

    public void setBoxStrokeWidthFocused(int i2) throws Resources.NotFoundException {
        this.f3351S = i2;
        m2136x();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) throws Resources.NotFoundException {
        if (this.f3376k != z2) {
            C0573s c0573s = this.f3374j;
            if (z2) {
                C1081c0 c1081c0 = new C1081c0(getContext(), null);
                this.f3384o = c1081c0;
                c1081c0.setId(tkbmmn.ghwbbf.irvjzy.R.id.textinput_counter);
                Typeface typeface = this.f3359b0;
                if (typeface != null) {
                    this.f3384o.setTypeface(typeface);
                }
                this.f3384o.setMaxLines(1);
                c0573s.m1375a(this.f3384o, 2);
                ((ViewGroup.MarginLayoutParams) this.f3384o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_textinput_counter_margin_start));
                m2127o();
                if (this.f3384o != null) {
                    EditText editText = this.f3362d;
                    m2126n(editText != null ? editText.getText() : null);
                }
            } else {
                c0573s.m1381g(this.f3384o, 2);
                this.f3384o = null;
            }
            this.f3376k = z2;
        }
    }

    public void setCounterMaxLength(int i2) throws Resources.NotFoundException {
        if (this.f3378l != i2) {
            if (i2 > 0) {
                this.f3378l = i2;
            } else {
                this.f3378l = -1;
            }
            if (!this.f3376k || this.f3384o == null) {
                return;
            }
            EditText editText = this.f3362d;
            m2126n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f3386p != i2) {
            this.f3386p = i2;
            m2127o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f3406z != colorStateList) {
            this.f3406z = colorStateList;
            m2127o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f3388q != i2) {
            this.f3388q = i2;
            m2127o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3404y != colorStateList) {
            this.f3404y = colorStateList;
            m2127o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f3331A != colorStateList) {
            this.f3331A = colorStateList;
            m2128p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f3333B != colorStateList) {
            this.f3333B = colorStateList;
            if (m2125m() || (this.f3384o != null && this.f3380m)) {
                m2128p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f3373i0 = colorStateList;
        this.f3375j0 = colorStateList;
        if (this.f3362d != null) {
            m2133u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        m2113k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f3360c.f1785g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f3360c.f1785g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        C0569o c0569o = this.f3360c;
        CharSequence text = i2 != 0 ? c0569o.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = c0569o.f1785g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        C0569o c0569o = this.f3360c;
        Drawable drawableM2321x = i2 != 0 ? AbstractC0901d.m2321x(c0569o.getContext(), i2) : null;
        CheckableImageButton checkableImageButton = c0569o.f1785g;
        checkableImageButton.setImageDrawable(drawableM2321x);
        if (drawableM2321x != null) {
            ColorStateList colorStateList = c0569o.f1789k;
            PorterDuff.Mode mode = c0569o.f1790l;
            TextInputLayout textInputLayout = c0569o.f1779a;
            AbstractC0364l.m1001h(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0364l.m994a0(textInputLayout, checkableImageButton, c0569o.f1789k);
        }
    }

    public void setEndIconMinSize(int i2) {
        C0569o c0569o = this.f3360c;
        if (i2 < 0) {
            c0569o.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != c0569o.f1791m) {
            c0569o.f1791m = i2;
            CheckableImageButton checkableImageButton = c0569o.f1785g;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = c0569o.f1781c;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) throws Resources.NotFoundException {
        this.f3360c.m1364g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0569o c0569o = this.f3360c;
        View.OnLongClickListener onLongClickListener = c0569o.f1793o;
        CheckableImageButton checkableImageButton = c0569o.f1785g;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0364l.m998e0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0569o c0569o = this.f3360c;
        c0569o.f1793o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0569o.f1785g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0364l.m998e0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0569o c0569o = this.f3360c;
        c0569o.f1792n = scaleType;
        c0569o.f1785g.setScaleType(scaleType);
        c0569o.f1781c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0569o c0569o = this.f3360c;
        if (c0569o.f1789k != colorStateList) {
            c0569o.f1789k = colorStateList;
            AbstractC0364l.m1001h(c0569o.f1779a, c0569o.f1785g, colorStateList, c0569o.f1790l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0569o c0569o = this.f3360c;
        if (c0569o.f1790l != mode) {
            c0569o.f1790l = mode;
            AbstractC0364l.m1001h(c0569o.f1779a, c0569o.f1785g, c0569o.f1789k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f3360c.m1365h(z2);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        C0573s c0573s = this.f3374j;
        if (!c0573s.f1829q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0573s.m1380f();
            return;
        }
        c0573s.m1377c();
        c0573s.f1828p = charSequence;
        c0573s.f1830r.setText(charSequence);
        int i2 = c0573s.f1826n;
        if (i2 != 1) {
            c0573s.f1827o = 1;
        }
        c0573s.m1383i(i2, c0573s.f1827o, c0573s.m1382h(c0573s.f1830r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        C0573s c0573s = this.f3374j;
        c0573s.f1832t = i2;
        C1081c0 c1081c0 = c0573s.f1830r;
        if (c1081c0 != null) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            c1081c0.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0573s c0573s = this.f3374j;
        c0573s.f1831s = charSequence;
        C1081c0 c1081c0 = c0573s.f1830r;
        if (c1081c0 != null) {
            c1081c0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) throws Resources.NotFoundException {
        C0573s c0573s = this.f3374j;
        if (c0573s.f1829q == z2) {
            return;
        }
        c0573s.m1377c();
        TextInputLayout textInputLayout = c0573s.f1820h;
        if (z2) {
            C1081c0 c1081c0 = new C1081c0(c0573s.f1819g, null);
            c0573s.f1830r = c1081c0;
            c1081c0.setId(tkbmmn.ghwbbf.irvjzy.R.id.textinput_error);
            c0573s.f1830r.setTextAlignment(5);
            Typeface typeface = c0573s.f1812B;
            if (typeface != null) {
                c0573s.f1830r.setTypeface(typeface);
            }
            int i2 = c0573s.f1833u;
            c0573s.f1833u = i2;
            C1081c0 c1081c02 = c0573s.f1830r;
            if (c1081c02 != null) {
                textInputLayout.m2124l(c1081c02, i2);
            }
            ColorStateList colorStateList = c0573s.f1834v;
            c0573s.f1834v = colorStateList;
            C1081c0 c1081c03 = c0573s.f1830r;
            if (c1081c03 != null && colorStateList != null) {
                c1081c03.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0573s.f1831s;
            c0573s.f1831s = charSequence;
            C1081c0 c1081c04 = c0573s.f1830r;
            if (c1081c04 != null) {
                c1081c04.setContentDescription(charSequence);
            }
            int i3 = c0573s.f1832t;
            c0573s.f1832t = i3;
            C1081c0 c1081c05 = c0573s.f1830r;
            if (c1081c05 != null) {
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                c1081c05.setAccessibilityLiveRegion(i3);
            }
            c0573s.f1830r.setVisibility(4);
            c0573s.m1375a(c0573s.f1830r, 0);
        } else {
            c0573s.m1380f();
            c0573s.m1381g(c0573s.f1830r, 0);
            c0573s.f1830r = null;
            textInputLayout.m2130r();
            textInputLayout.m2136x();
        }
        c0573s.f1829q = z2;
    }

    public void setErrorIconDrawable(int i2) throws Resources.NotFoundException {
        C0569o c0569o = this.f3360c;
        c0569o.m1366i(i2 != 0 ? AbstractC0901d.m2321x(c0569o.getContext(), i2) : null);
        AbstractC0364l.m994a0(c0569o.f1779a, c0569o.f1781c, c0569o.f1782d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0569o c0569o = this.f3360c;
        CheckableImageButton checkableImageButton = c0569o.f1781c;
        View.OnLongClickListener onLongClickListener = c0569o.f1784f;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0364l.m998e0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0569o c0569o = this.f3360c;
        c0569o.f1784f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0569o.f1781c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0364l.m998e0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0569o c0569o = this.f3360c;
        if (c0569o.f1782d != colorStateList) {
            c0569o.f1782d = colorStateList;
            AbstractC0364l.m1001h(c0569o.f1779a, c0569o.f1781c, colorStateList, c0569o.f1783e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0569o c0569o = this.f3360c;
        if (c0569o.f1783e != mode) {
            c0569o.f1783e = mode;
            AbstractC0364l.m1001h(c0569o.f1779a, c0569o.f1781c, c0569o.f1782d, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        C0573s c0573s = this.f3374j;
        c0573s.f1833u = i2;
        C1081c0 c1081c0 = c0573s.f1830r;
        if (c1081c0 != null) {
            c0573s.f1820h.m2124l(c1081c0, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0573s c0573s = this.f3374j;
        c0573s.f1834v = colorStateList;
        C1081c0 c1081c0 = c0573s.f1830r;
        if (c1081c0 == null || colorStateList == null) {
            return;
        }
        c1081c0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f3401w0 != z2) {
            this.f3401w0 = z2;
            m2133u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0573s c0573s = this.f3374j;
        if (zIsEmpty) {
            if (c0573s.f1836x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0573s.f1836x) {
            setHelperTextEnabled(true);
        }
        c0573s.m1377c();
        c0573s.f1835w = charSequence;
        c0573s.f1837y.setText(charSequence);
        int i2 = c0573s.f1826n;
        if (i2 != 2) {
            c0573s.f1827o = 2;
        }
        c0573s.m1383i(i2, c0573s.f1827o, c0573s.m1382h(c0573s.f1837y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0573s c0573s = this.f3374j;
        c0573s.f1811A = colorStateList;
        C1081c0 c1081c0 = c0573s.f1837y;
        if (c1081c0 == null || colorStateList == null) {
            return;
        }
        c1081c0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) throws Resources.NotFoundException {
        C0573s c0573s = this.f3374j;
        if (c0573s.f1836x == z2) {
            return;
        }
        c0573s.m1377c();
        if (z2) {
            C1081c0 c1081c0 = new C1081c0(c0573s.f1819g, null);
            c0573s.f1837y = c1081c0;
            c1081c0.setId(tkbmmn.ghwbbf.irvjzy.R.id.textinput_helper_text);
            c0573s.f1837y.setTextAlignment(5);
            Typeface typeface = c0573s.f1812B;
            if (typeface != null) {
                c0573s.f1837y.setTypeface(typeface);
            }
            c0573s.f1837y.setVisibility(4);
            c0573s.f1837y.setAccessibilityLiveRegion(1);
            int i2 = c0573s.f1838z;
            c0573s.f1838z = i2;
            C1081c0 c1081c02 = c0573s.f1837y;
            if (c1081c02 != null) {
                c1081c02.setTextAppearance(i2);
            }
            ColorStateList colorStateList = c0573s.f1811A;
            c0573s.f1811A = colorStateList;
            C1081c0 c1081c03 = c0573s.f1837y;
            if (c1081c03 != null && colorStateList != null) {
                c1081c03.setTextColor(colorStateList);
            }
            c0573s.m1375a(c0573s.f1837y, 1);
            c0573s.f1837y.setAccessibilityDelegate(new C0572r(c0573s));
        } else {
            c0573s.m1377c();
            int i3 = c0573s.f1826n;
            if (i3 == 2) {
                c0573s.f1827o = 0;
            }
            c0573s.m1383i(i3, c0573s.f1827o, c0573s.m1382h(c0573s.f1837y, ""));
            c0573s.m1381g(c0573s.f1837y, 1);
            c0573s.f1837y = null;
            TextInputLayout textInputLayout = c0573s.f1820h;
            textInputLayout.m2130r();
            textInputLayout.m2136x();
        }
        c0573s.f1836x = z2;
    }

    public void setHelperTextTextAppearance(int i2) {
        C0573s c0573s = this.f3374j;
        c0573s.f1838z = i2;
        C1081c0 c1081c0 = c0573s.f1837y;
        if (c1081c0 != null) {
            c1081c0.setTextAppearance(i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f3335C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f3403x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f3335C) {
            this.f3335C = z2;
            if (z2) {
                CharSequence hint = this.f3362d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f3336D)) {
                        setHint(hint);
                    }
                    this.f3362d.setHint((CharSequence) null);
                }
                this.f3337E = true;
            } else {
                this.f3337E = false;
                if (!TextUtils.isEmpty(this.f3336D) && TextUtils.isEmpty(this.f3362d.getHint())) {
                    this.f3362d.setHint(this.f3336D);
                }
                setHintInternal(null);
            }
            if (this.f3362d != null) {
                m2132t();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        C0373b c0373b = this.f3399v0;
        TextInputLayout textInputLayout = c0373b.f1168a;
        C0458d c0458d = new C0458d(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = c0458d.f1377j;
        if (colorStateList != null) {
            c0373b.f1184k = colorStateList;
        }
        float f = c0458d.f1378k;
        if (f != 0.0f) {
            c0373b.f1182i = f;
        }
        ColorStateList colorStateList2 = c0458d.f1368a;
        if (colorStateList2 != null) {
            c0373b.f1162U = colorStateList2;
        }
        c0373b.f1160S = c0458d.f1372e;
        c0373b.f1161T = c0458d.f1373f;
        c0373b.f1159R = c0458d.f1374g;
        c0373b.f1163V = c0458d.f1376i;
        C0455a c0455a = c0373b.f1198y;
        if (c0455a != null) {
            c0455a.f1361p = true;
        }
        C0004c c0004c = new C0004c(14, c0373b);
        c0458d.m1139a();
        c0373b.f1198y = new C0455a(c0004c, c0458d.f1381n);
        c0458d.m1141c(textInputLayout.getContext(), c0373b.f1198y);
        c0373b.m1050h(false);
        this.f3375j0 = c0373b.f1184k;
        if (this.f3362d != null) {
            m2133u(false, false);
            m2132t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3375j0 != colorStateList) {
            if (this.f3373i0 == null) {
                C0373b c0373b = this.f3399v0;
                if (c0373b.f1184k != colorStateList) {
                    c0373b.f1184k = colorStateList;
                    c0373b.m1050h(false);
                }
            }
            this.f3375j0 = colorStateList;
            if (this.f3362d != null) {
                m2133u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0553A interfaceC0553A) {
        this.f3382n = interfaceC0553A;
    }

    public void setMaxEms(int i2) {
        this.f3368g = i2;
        EditText editText = this.f3362d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.f3372i = i2;
        EditText editText = this.f3362d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f3366f = i2;
        EditText editText = this.f3362d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.f3370h = i2;
        EditText editText = this.f3362d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        C0569o c0569o = this.f3360c;
        c0569o.f1785g.setContentDescription(i2 != 0 ? c0569o.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        C0569o c0569o = this.f3360c;
        c0569o.f1785g.setImageDrawable(i2 != 0 ? AbstractC0901d.m2321x(c0569o.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) throws Resources.NotFoundException {
        C0569o c0569o = this.f3360c;
        if (z2 && c0569o.f1787i != 1) {
            c0569o.m1364g(1);
        } else if (z2) {
            c0569o.getClass();
        } else {
            c0569o.m1364g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0569o c0569o = this.f3360c;
        c0569o.f1789k = colorStateList;
        AbstractC0364l.m1001h(c0569o.f1779a, c0569o.f1785g, colorStateList, c0569o.f1790l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0569o c0569o = this.f3360c;
        c0569o.f1790l = mode;
        AbstractC0364l.m1001h(c0569o.f1779a, c0569o.f1785g, c0569o.f1789k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f3394t == null) {
            C1081c0 c1081c0 = new C1081c0(getContext(), null);
            this.f3394t = c1081c0;
            c1081c0.setId(tkbmmn.ghwbbf.irvjzy.R.id.textinput_placeholder);
            this.f3394t.setImportantForAccessibility(2);
            C1159h c1159hM2117d = m2117d();
            this.f3400w = c1159hM2117d;
            c1159hM2117d.f4759b = 67L;
            this.f3402x = m2117d();
            setPlaceholderTextAppearance(this.f3398v);
            setPlaceholderTextColor(this.f3396u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3392s) {
                setPlaceholderTextEnabled(true);
            }
            this.f3390r = charSequence;
        }
        EditText editText = this.f3362d;
        m2134v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f3398v = i2;
        C1081c0 c1081c0 = this.f3394t;
        if (c1081c0 != null) {
            c1081c0.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3396u != colorStateList) {
            this.f3396u = colorStateList;
            C1081c0 c1081c0 = this.f3394t;
            if (c1081c0 == null || colorStateList == null) {
                return;
            }
            c1081c0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0578x c0578x = this.f3358b;
        c0578x.getClass();
        c0578x.f1857c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0578x.f1856b.setText(charSequence);
        c0578x.m1392e();
    }

    public void setPrefixTextAppearance(int i2) {
        this.f3358b.f1856b.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3358b.f1856b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C0517k c0517k) {
        C0513g c0513g = this.f3338F;
        if (c0513g == null || c0513g.f1601a.f1584a == c0517k) {
            return;
        }
        this.f3344L = c0517k;
        m2115b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f3358b.f1858d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3358b.f1858d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? AbstractC0901d.m2321x(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        C0578x c0578x = this.f3358b;
        if (i2 < 0) {
            c0578x.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i2 != c0578x.f1861g) {
            c0578x.f1861g = i2;
            CheckableImageButton checkableImageButton = c0578x.f1858d;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0578x c0578x = this.f3358b;
        View.OnLongClickListener onLongClickListener = c0578x.f1863i;
        CheckableImageButton checkableImageButton = c0578x.f1858d;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0364l.m998e0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0578x c0578x = this.f3358b;
        c0578x.f1863i = onLongClickListener;
        CheckableImageButton checkableImageButton = c0578x.f1858d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0364l.m998e0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0578x c0578x = this.f3358b;
        c0578x.f1862h = scaleType;
        c0578x.f1858d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0578x c0578x = this.f3358b;
        if (c0578x.f1859e != colorStateList) {
            c0578x.f1859e = colorStateList;
            AbstractC0364l.m1001h(c0578x.f1855a, c0578x.f1858d, colorStateList, c0578x.f1860f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0578x c0578x = this.f3358b;
        if (c0578x.f1860f != mode) {
            c0578x.f1860f = mode;
            AbstractC0364l.m1001h(c0578x.f1855a, c0578x.f1858d, c0578x.f1859e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f3358b.m1390c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0569o c0569o = this.f3360c;
        c0569o.getClass();
        c0569o.f1794p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0569o.f1795q.setText(charSequence);
        c0569o.m1371n();
    }

    public void setSuffixTextAppearance(int i2) {
        this.f3360c.f1795q.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3360c.f1795q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0580z c0580z) {
        EditText editText = this.f3362d;
        if (editText != null) {
            AbstractC0241P.m701m(editText, c0580z);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3359b0) {
            this.f3359b0 = typeface;
            this.f3399v0.m1055m(typeface);
            C0573s c0573s = this.f3374j;
            if (typeface != c0573s.f1812B) {
                c0573s.f1812B = typeface;
                C1081c0 c1081c0 = c0573s.f1830r;
                if (c1081c0 != null) {
                    c1081c0.setTypeface(typeface);
                }
                C1081c0 c1081c02 = c0573s.f1837y;
                if (c1081c02 != null) {
                    c1081c02.setTypeface(typeface);
                }
            }
            C1081c0 c1081c03 = this.f3384o;
            if (c1081c03 != null) {
                c1081c03.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m2132t() {
        if (this.f3347O != 1) {
            FrameLayout frameLayout = this.f3356a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM2116c = m2116c();
            if (iM2116c != layoutParams.topMargin) {
                layoutParams.topMargin = iM2116c;
                frameLayout.requestLayout();
            }
        }
    }

    /* renamed from: u */
    public final void m2133u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C1081c0 c1081c0;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f3362d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f3362d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f3373i0;
        C0373b c0373b = this.f3399v0;
        if (colorStateList2 != null) {
            c0373b.m1051i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f3373i0;
            c0373b.m1051i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f3393s0) : this.f3393s0));
        } else if (m2125m()) {
            C1081c0 c1081c02 = this.f3374j.f1830r;
            c0373b.m1051i(c1081c02 != null ? c1081c02.getTextColors() : null);
        } else if (this.f3380m && (c1081c0 = this.f3384o) != null) {
            c0373b.m1051i(c1081c0.getTextColors());
        } else if (z5 && (colorStateList = this.f3375j0) != null && c0373b.f1184k != colorStateList) {
            c0373b.f1184k = colorStateList;
            c0373b.m1050h(false);
        }
        C0569o c0569o = this.f3360c;
        C0578x c0578x = this.f3358b;
        if (z4 || !this.f3401w0 || (isEnabled() && z5)) {
            if (z3 || this.f3397u0) {
                ValueAnimator valueAnimator = this.f3405y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3405y0.cancel();
                }
                if (z2 && this.f3403x0) {
                    m2114a(1.0f);
                } else {
                    c0373b.m1053k(1.0f);
                }
                this.f3397u0 = false;
                if (m2118e()) {
                    m2123j();
                }
                EditText editText3 = this.f3362d;
                m2134v(editText3 != null ? editText3.getText() : null);
                c0578x.f1864j = false;
                c0578x.m1392e();
                c0569o.f1796r = false;
                c0569o.m1371n();
                return;
            }
            return;
        }
        if (z3 || !this.f3397u0) {
            ValueAnimator valueAnimator2 = this.f3405y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f3405y0.cancel();
            }
            if (z2 && this.f3403x0) {
                m2114a(0.0f);
            } else {
                c0373b.m1053k(0.0f);
            }
            if (m2118e() && !((C0561g) this.f3338F).f1754x.f1752q.isEmpty() && m2118e()) {
                ((C0561g) this.f3338F).m1345n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f3397u0 = true;
            C1081c0 c1081c03 = this.f3394t;
            if (c1081c03 != null && this.f3392s) {
                c1081c03.setText((CharSequence) null);
                AbstractC1168q.m2817a(this.f3356a, this.f3402x);
                this.f3394t.setVisibility(4);
            }
            c0578x.f1864j = true;
            c0578x.m1392e();
            c0569o.f1796r = true;
            c0569o.m1371n();
        }
    }

    /* renamed from: v */
    public final void m2134v(Editable editable) {
        ((C0263g) this.f3382n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f3356a;
        if (length != 0 || this.f3397u0) {
            C1081c0 c1081c0 = this.f3394t;
            if (c1081c0 == null || !this.f3392s) {
                return;
            }
            c1081c0.setText((CharSequence) null);
            AbstractC1168q.m2817a(frameLayout, this.f3402x);
            this.f3394t.setVisibility(4);
            return;
        }
        if (this.f3394t == null || !this.f3392s || TextUtils.isEmpty(this.f3390r)) {
            return;
        }
        this.f3394t.setText(this.f3390r);
        AbstractC1168q.m2817a(frameLayout, this.f3400w);
        this.f3394t.setVisibility(0);
        this.f3394t.bringToFront();
        announceForAccessibility(this.f3390r);
    }

    /* renamed from: w */
    public final void m2135w(boolean z2, boolean z3) {
        int defaultColor = this.f3383n0.getDefaultColor();
        int colorForState = this.f3383n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f3383n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f3352T = colorForState2;
        } else if (z3) {
            this.f3352T = colorForState;
        } else {
            this.f3352T = defaultColor;
        }
    }

    /* renamed from: x */
    public final void m2136x() throws Resources.NotFoundException {
        C1081c0 c1081c0;
        EditText editText;
        EditText editText2;
        if (this.f3338F == null || this.f3347O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f3362d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f3362d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f3352T = this.f3393s0;
        } else if (m2125m()) {
            if (this.f3383n0 != null) {
                m2135w(z3, z2);
            } else {
                this.f3352T = getErrorCurrentTextColors();
            }
        } else if (!this.f3380m || (c1081c0 = this.f3384o) == null) {
            if (z3) {
                this.f3352T = this.f3381m0;
            } else if (z2) {
                this.f3352T = this.f3379l0;
            } else {
                this.f3352T = this.f3377k0;
            }
        } else if (this.f3383n0 != null) {
            m2135w(z3, z2);
        } else {
            this.f3352T = c1081c0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m2128p();
        }
        C0569o c0569o = this.f3360c;
        c0569o.m1369l();
        CheckableImageButton checkableImageButton = c0569o.f1781c;
        ColorStateList colorStateList = c0569o.f1782d;
        TextInputLayout textInputLayout = c0569o.f1779a;
        AbstractC0364l.m994a0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0569o.f1789k;
        CheckableImageButton checkableImageButton2 = c0569o.f1785g;
        AbstractC0364l.m994a0(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0569o.m1359b() instanceof C0564j) {
            if (!textInputLayout.m2125m() || checkableImageButton2.getDrawable() == null) {
                AbstractC0364l.m1001h(textInputLayout, checkableImageButton2, c0569o.f1789k, c0569o.f1790l);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                AbstractC0098a.m299g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C0578x c0578x = this.f3358b;
        AbstractC0364l.m994a0(c0578x.f1855a, c0578x.f1858d, c0578x.f1859e);
        if (this.f3347O == 2) {
            int i2 = this.f3349Q;
            if (z3 && isEnabled()) {
                this.f3349Q = this.f3351S;
            } else {
                this.f3349Q = this.f3350R;
            }
            if (this.f3349Q != i2 && m2118e() && !this.f3397u0) {
                if (m2118e()) {
                    ((C0561g) this.f3338F).m1345n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m2123j();
            }
        }
        if (this.f3347O == 1) {
            if (!isEnabled()) {
                this.f3353U = this.f3387p0;
            } else if (z2 && !z3) {
                this.f3353U = this.f3391r0;
            } else if (z3) {
                this.f3353U = this.f3389q0;
            } else {
                this.f3353U = this.f3385o0;
            }
        }
        m2115b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3358b.m1389b(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3360c.f1785g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3360c.f1785g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3360c.m1366i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3360c.f1785g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0569o c0569o = this.f3360c;
        CheckableImageButton checkableImageButton = c0569o.f1785g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0569o.f1789k;
            PorterDuff.Mode mode = c0569o.f1790l;
            TextInputLayout textInputLayout = c0569o.f1779a;
            AbstractC0364l.m1001h(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0364l.m994a0(textInputLayout, checkableImageButton, c0569o.f1789k);
        }
    }
}
