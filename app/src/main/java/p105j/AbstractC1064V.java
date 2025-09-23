package p105j;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: j.V */
/* loaded from: classes.dex */
public abstract class AbstractC1064V {
    /* renamed from: a */
    public static Drawable[] m2667a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* renamed from: b */
    public static void m2668b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: c */
    public static void m2669c(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }
}
