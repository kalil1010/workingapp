package p105j;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: j.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC1084d0 {
    /* renamed from: a */
    public static StaticLayout m2703a(CharSequence charSequence, Layout.Alignment alignment, int i2, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i2, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    /* renamed from: b */
    public static int m2704b(TextView textView) {
        return textView.getMaxLines();
    }
}
