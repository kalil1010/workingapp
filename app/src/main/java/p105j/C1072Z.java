package p105j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p002A1.C0027i;
import p006C.AbstractC0075g;
import p011D1.C0118h;
import p028K.AbstractC0241P;
import p033L1.AbstractC0356d;
import p033L1.AbstractC0364l;
import p042P.AbstractC0430a;
import p045Q.AbstractC0449m;
import p086d.AbstractC0843a;

/* renamed from: j.Z */
/* loaded from: classes.dex */
public final class C1072Z {

    /* renamed from: a */
    public final TextView f4445a;

    /* renamed from: b */
    public C0118h f4446b;

    /* renamed from: c */
    public C0118h f4447c;

    /* renamed from: d */
    public C0118h f4448d;

    /* renamed from: e */
    public C0118h f4449e;

    /* renamed from: f */
    public C0118h f4450f;

    /* renamed from: g */
    public C0118h f4451g;

    /* renamed from: h */
    public C0118h f4452h;

    /* renamed from: i */
    public final C1102j0 f4453i;

    /* renamed from: j */
    public int f4454j = 0;

    /* renamed from: k */
    public int f4455k = -1;

    /* renamed from: l */
    public Typeface f4456l;

    /* renamed from: m */
    public boolean f4457m;

    public C1072Z(TextView textView) {
        this.f4445a = textView;
        this.f4453i = new C1102j0(textView);
    }

    /* renamed from: c */
    public static C0118h m2677c(Context context, C1131t c1131t, int i2) {
        ColorStateList colorStateListM2661f;
        synchronized (c1131t) {
            colorStateListM2661f = c1131t.f4636a.m2661f(context, i2);
        }
        if (colorStateListM2661f == null) {
            return null;
        }
        C0118h c0118h = new C0118h();
        c0118h.f330b = true;
        c0118h.f331c = colorStateListM2661f;
        return c0118h;
    }

    /* renamed from: h */
    public static void m2678h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            AbstractC0430a.m1097a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i2 >= 30) {
            AbstractC0430a.m1097a(editorInfo, text);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = text.length();
        if (i5 < 0 || i3 > length) {
            AbstractC0356d.m946G(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            AbstractC0356d.m946G(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0356d.m946G(editorInfo, text, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(text.length() - i3, i9 - Math.min(i5, (int) (i9 * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        AbstractC0356d.m946G(editorInfo, i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    /* renamed from: a */
    public final void m2679a(Drawable drawable, C0118h c0118h) {
        if (drawable == null || c0118h == null) {
            return;
        }
        C1131t.m2752e(drawable, c0118h, this.f4445a.getDrawableState());
    }

    /* renamed from: b */
    public final void m2680b() {
        C0118h c0118h = this.f4446b;
        TextView textView = this.f4445a;
        if (c0118h != null || this.f4447c != null || this.f4448d != null || this.f4449e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m2679a(compoundDrawables[0], this.f4446b);
            m2679a(compoundDrawables[1], this.f4447c);
            m2679a(compoundDrawables[2], this.f4448d);
            m2679a(compoundDrawables[3], this.f4449e);
        }
        if (this.f4450f == null && this.f4451g == null) {
            return;
        }
        Drawable[] drawableArrM2667a = AbstractC1064V.m2667a(textView);
        m2679a(drawableArrM2667a[0], this.f4450f);
        m2679a(drawableArrM2667a[2], this.f4451g);
    }

    /* renamed from: d */
    public final ColorStateList m2681d() {
        C0118h c0118h = this.f4452h;
        if (c0118h != null) {
            return (ColorStateList) c0118h.f331c;
        }
        return null;
    }

    /* renamed from: e */
    public final PorterDuff.Mode m2682e() {
        C0118h c0118h = this.f4452h;
        if (c0118h != null) {
            return (PorterDuff.Mode) c0118h.f332d;
        }
        return null;
    }

    /* renamed from: f */
    public final void m2683f(AttributeSet attributeSet, int i2) {
        boolean z2;
        boolean z3;
        String string;
        String string2;
        ColorStateList colorStateList;
        int resourceId;
        int i3;
        int resourceId2;
        TextView textView = this.f4445a;
        Context context = textView.getContext();
        C1131t c1131tM2749a = C1131t.m2749a();
        int[] iArr = AbstractC0843a.f3458h;
        C0027i c0027iM98N = C0027i.m98N(context, attributeSet, iArr, i2);
        AbstractC0241P.m700l(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0027iM98N.f66c, i2);
        TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f4446b = m2677c(context, c1131tM2749a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f4447c = m2677c(context, c1131tM2749a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f4448d = m2677c(context, c1131tM2749a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f4449e = m2677c(context, c1131tM2749a, typedArray.getResourceId(2, 0));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f4450f = m2677c(context, c1131tM2749a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f4451g = m2677c(context, c1131tM2749a, typedArray.getResourceId(6, 0));
        }
        c0027iM98N.m114R();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0843a.f3474x;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0027i c0027i = new C0027i(context, typedArrayObtainStyledAttributes);
            if (z4 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            m2690n(context, c0027i);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i4 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            c0027i.m114R();
        } else {
            z2 = false;
            z3 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C0027i c0027i2 = new C0027i(context, typedArrayObtainStyledAttributes2);
        if (!z4 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z3 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z5 = z3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i4 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i4 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2690n(context, c0027i2);
        c0027i2.m114R();
        if (!z4 && z2) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f4456l;
        if (typeface != null) {
            if (this.f4455k == -1) {
                textView.setTypeface(typeface, this.f4454j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC1068X.m2675d(textView, string);
        }
        if (string2 != null) {
            AbstractC1066W.m2671b(textView, AbstractC1066W.m2670a(string2));
        }
        int[] iArr3 = AbstractC0843a.f3459i;
        C1102j0 c1102j0 = this.f4453i;
        Context context2 = c1102j0.f4528j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i2, 0);
        TextView textView2 = c1102j0.f4527i;
        AbstractC0241P.m700l(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i2);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c1102j0.f4519a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                c1102j0.f4524f = C1102j0.m2713b(iArr4);
                c1102j0.m2721i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c1102j0.m2722j()) {
            c1102j0.f4519a = 0;
        } else if (c1102j0.f4519a == 1) {
            if (!c1102j0.f4525g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c1102j0.m2723k(dimension2, f, dimension);
            }
            c1102j0.m2720h();
        }
        if (AbstractC1133t1.f4639b && c1102j0.f4519a != 0) {
            int[] iArr5 = c1102j0.f4524f;
            if (iArr5.length > 0) {
                if (AbstractC1068X.m2672a(textView) != -1.0f) {
                    AbstractC1068X.m2673b(textView, Math.round(c1102j0.f4522d), Math.round(c1102j0.f4523e), Math.round(c1102j0.f4521c), 0);
                } else {
                    AbstractC1068X.m2674c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM2753b = resourceId4 != -1 ? c1131tM2749a.m2753b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM2753b2 = resourceId5 != -1 ? c1131tM2749a.m2753b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM2753b3 = resourceId6 != -1 ? c1131tM2749a.m2753b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM2753b4 = resourceId7 != -1 ? c1131tM2749a.m2753b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM2753b5 = resourceId8 != -1 ? c1131tM2749a.m2753b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM2753b6 = resourceId9 != -1 ? c1131tM2749a.m2753b(context, resourceId9) : null;
        if (drawableM2753b5 != null || drawableM2753b6 != null) {
            Drawable[] drawableArrM2667a = AbstractC1064V.m2667a(textView);
            if (drawableM2753b5 == null) {
                drawableM2753b5 = drawableArrM2667a[0];
            }
            if (drawableM2753b2 == null) {
                drawableM2753b2 = drawableArrM2667a[1];
            }
            if (drawableM2753b6 == null) {
                drawableM2753b6 = drawableArrM2667a[2];
            }
            if (drawableM2753b4 == null) {
                drawableM2753b4 = drawableArrM2667a[3];
            }
            AbstractC1064V.m2668b(textView, drawableM2753b5, drawableM2753b2, drawableM2753b6, drawableM2753b4);
        } else if (drawableM2753b != null || drawableM2753b2 != null || drawableM2753b3 != null || drawableM2753b4 != null) {
            Drawable[] drawableArrM2667a2 = AbstractC1064V.m2667a(textView);
            Drawable drawable = drawableArrM2667a2[0];
            if (drawable == null && drawableArrM2667a2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM2753b == null) {
                    drawableM2753b = compoundDrawables[0];
                }
                if (drawableM2753b2 == null) {
                    drawableM2753b2 = compoundDrawables[1];
                }
                if (drawableM2753b3 == null) {
                    drawableM2753b3 = compoundDrawables[2];
                }
                if (drawableM2753b4 == null) {
                    drawableM2753b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM2753b, drawableM2753b2, drawableM2753b3, drawableM2753b4);
            } else {
                if (drawableM2753b2 == null) {
                    drawableM2753b2 = drawableArrM2667a2[1];
                }
                Drawable drawable2 = drawableArrM2667a2[2];
                if (drawableM2753b4 == null) {
                    drawableM2753b4 = drawableArrM2667a2[3];
                }
                AbstractC1064V.m2668b(textView, drawable, drawableM2753b2, drawable2, drawableM2753b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0356d.m969s(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            AbstractC0449m.m1130f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            AbstractC0449m.m1131g(textView, AbstractC1117o0.m2733b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC0356d.m944E(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC0356d.m945F(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            AbstractC0364l.m1009p(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    /* renamed from: g */
    public final void m2684g(Context context, int i2) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0843a.f3474x);
        C0027i c0027i = new C0027i(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f4445a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2690n(context, c0027i);
        if (i3 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC1068X.m2675d(textView, string);
        }
        c0027i.m114R();
        Typeface typeface = this.f4456l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f4454j);
        }
    }

    /* renamed from: i */
    public final void m2685i(int i2, int i3, int i4, int i5) {
        C1102j0 c1102j0 = this.f4453i;
        if (c1102j0.m2722j()) {
            DisplayMetrics displayMetrics = c1102j0.f4528j.getResources().getDisplayMetrics();
            c1102j0.m2723k(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c1102j0.m2720h()) {
                c1102j0.m2716a();
            }
        }
    }

    /* renamed from: j */
    public final void m2686j(int[] iArr, int i2) {
        C1102j0 c1102j0 = this.f4453i;
        if (c1102j0.m2722j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1102j0.f4528j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c1102j0.f4524f = C1102j0.m2713b(iArrCopyOf);
                if (!c1102j0.m2721i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1102j0.f4525g = false;
            }
            if (c1102j0.m2720h()) {
                c1102j0.m2716a();
            }
        }
    }

    /* renamed from: k */
    public final void m2687k(int i2) {
        C1102j0 c1102j0 = this.f4453i;
        if (c1102j0.m2722j()) {
            if (i2 == 0) {
                c1102j0.f4519a = 0;
                c1102j0.f4522d = -1.0f;
                c1102j0.f4523e = -1.0f;
                c1102j0.f4521c = -1.0f;
                c1102j0.f4524f = new int[0];
                c1102j0.f4520b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException(AbstractC0075g.m236e("Unknown auto-size text type: ", i2));
            }
            DisplayMetrics displayMetrics = c1102j0.f4528j.getResources().getDisplayMetrics();
            c1102j0.m2723k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1102j0.m2720h()) {
                c1102j0.m2716a();
            }
        }
    }

    /* renamed from: l */
    public final void m2688l(ColorStateList colorStateList) {
        if (this.f4452h == null) {
            this.f4452h = new C0118h();
        }
        C0118h c0118h = this.f4452h;
        c0118h.f331c = colorStateList;
        c0118h.f330b = colorStateList != null;
        this.f4446b = c0118h;
        this.f4447c = c0118h;
        this.f4448d = c0118h;
        this.f4449e = c0118h;
        this.f4450f = c0118h;
        this.f4451g = c0118h;
    }

    /* renamed from: m */
    public final void m2689m(PorterDuff.Mode mode) {
        if (this.f4452h == null) {
            this.f4452h = new C0118h();
        }
        C0118h c0118h = this.f4452h;
        c0118h.f332d = mode;
        c0118h.f329a = mode != null;
        this.f4446b = c0118h;
        this.f4447c = c0118h;
        this.f4448d = c0118h;
        this.f4449e = c0118h;
        this.f4450f = c0118h;
        this.f4451g = c0118h;
    }

    /* renamed from: n */
    public final void m2690n(Context context, C0027i c0027i) {
        String string;
        int i2 = this.f4454j;
        TypedArray typedArray = (TypedArray) c0027i.f66c;
        this.f4454j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f4455k = i4;
            if (i4 != -1) {
                this.f4454j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f4457m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f4456l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f4456l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f4456l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f4456l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f4455k;
        int i8 = this.f4454j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM102D = c0027i.m102D(i6, this.f4454j, new C1062U(this, i7, i8, new WeakReference(this.f4445a)));
                if (typefaceM102D != null) {
                    if (i3 < 28 || this.f4455k == -1) {
                        this.f4456l = typefaceM102D;
                    } else {
                        this.f4456l = AbstractC1070Y.m2676a(Typeface.create(typefaceM102D, 0), this.f4455k, (this.f4454j & 2) != 0);
                    }
                }
                this.f4457m = this.f4456l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f4456l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f4455k == -1) {
            this.f4456l = Typeface.create(string, this.f4454j);
        } else {
            this.f4456l = AbstractC1070Y.m2676a(Typeface.create(string, 0), this.f4455k, (this.f4454j & 2) != 0);
        }
    }
}
