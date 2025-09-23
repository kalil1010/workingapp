package p045Q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* renamed from: Q.m */
/* loaded from: classes.dex */
public abstract class AbstractC0449m {
    /* renamed from: a */
    public static int m1125a(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* renamed from: b */
    public static ColorStateList m1126b(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* renamed from: c */
    public static PorterDuff.Mode m1127c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* renamed from: d */
    public static int m1128d(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* renamed from: e */
    public static void m1129e(TextView textView, int i2) {
        textView.setBreakStrategy(i2);
    }

    /* renamed from: f */
    public static void m1130f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* renamed from: g */
    public static void m1131g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* renamed from: h */
    public static void m1132h(TextView textView, int i2) {
        textView.setHyphenationFrequency(i2);
    }
}
