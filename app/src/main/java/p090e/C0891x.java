package p090e;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p105j.C1027C;
import p105j.C1081c0;
import p105j.C1116o;
import p105j.C1119p;
import p105j.C1122q;
import p119o.C1249k;

/* renamed from: e.x */
/* loaded from: classes.dex */
public class C0891x {

    /* renamed from: b */
    public static final Class[] f3712b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f3713c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f3714d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f3715e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f3716f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f3717g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final C1249k f3718h = new C1249k();

    /* renamed from: a */
    public final Object[] f3719a = new Object[2];

    /* renamed from: a */
    public C1116o mo2137a(Context context, AttributeSet attributeSet) {
        return new C1116o(context, attributeSet);
    }

    /* renamed from: b */
    public C1119p mo2138b(Context context, AttributeSet attributeSet) {
        return new C1119p(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.buttonStyle);
    }

    /* renamed from: c */
    public C1122q mo2139c(Context context, AttributeSet attributeSet) {
        return new C1122q(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.checkboxStyle);
    }

    /* renamed from: d */
    public C1027C mo2140d(Context context, AttributeSet attributeSet) {
        return new C1027C(context, attributeSet);
    }

    /* renamed from: e */
    public C1081c0 mo2141e(Context context, AttributeSet attributeSet) {
        return new C1081c0(context, attributeSet);
    }

    /* renamed from: f */
    public final View m2271f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        C1249k c1249k = f3718h;
        Constructor constructor = (Constructor) c1249k.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3712b);
            c1249k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f3719a);
    }
}
