package p105j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p002A1.C0027i;
import p006C.AbstractC0069a;
import p086d.AbstractC0843a;

/* renamed from: j.b1 */
/* loaded from: classes.dex */
public abstract class AbstractC1079b1 {

    /* renamed from: a */
    public static final ThreadLocal f4485a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f4486b = {-16842910};

    /* renamed from: c */
    public static final int[] f4487c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f4488d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f4489e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f4490f = new int[0];

    /* renamed from: g */
    public static final int[] f4491g = new int[1];

    /* renamed from: a */
    public static void m2695a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0843a.f3460j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m2696b(Context context, int i2) {
        ColorStateList colorStateListM2698d = m2698d(context, i2);
        if (colorStateListM2698d != null && colorStateListM2698d.isStateful()) {
            return colorStateListM2698d.getColorForState(f4486b, colorStateListM2698d.getDefaultColor());
        }
        ThreadLocal threadLocal = f4485a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC0069a.m195d(m2697c(context, i2), Math.round(Color.alpha(r4) * f));
    }

    /* renamed from: c */
    public static int m2697c(Context context, int i2) {
        int[] iArr = f4491g;
        iArr[0] = i2;
        C0027i c0027iM97M = C0027i.m97M(context, null, iArr);
        try {
            return ((TypedArray) c0027iM97M.f66c).getColor(0, 0);
        } finally {
            c0027iM97M.m114R();
        }
    }

    /* renamed from: d */
    public static ColorStateList m2698d(Context context, int i2) {
        int[] iArr = f4491g;
        iArr[0] = i2;
        C0027i c0027iM97M = C0027i.m97M(context, null, iArr);
        try {
            return c0027iM97M.m99A(0);
        } finally {
            c0027iM97M.m114R();
        }
    }
}
