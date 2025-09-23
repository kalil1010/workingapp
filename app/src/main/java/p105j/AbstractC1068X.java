package p105j;

import android.widget.TextView;

/* renamed from: j.X */
/* loaded from: classes.dex */
public abstract class AbstractC1068X {
    /* renamed from: a */
    public static int m2672a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: b */
    public static void m2673b(TextView textView, int i2, int i3, int i4, int i5) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    /* renamed from: c */
    public static void m2674c(TextView textView, int[] iArr, int i2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    /* renamed from: d */
    public static boolean m2675d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
