package p045Q;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: Q.o */
/* loaded from: classes.dex */
public abstract class AbstractC0451o {
    /* renamed from: a */
    public static CharSequence m1134a(PrecomputedText precomputedText) {
        return precomputedText;
    }

    /* renamed from: b */
    public static String[] m1135b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: c */
    public static PrecomputedText.Params m1136c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* renamed from: d */
    public static void m1137d(TextView textView, int i2) {
        textView.setFirstBaselineToTopHeight(i2);
    }
}
