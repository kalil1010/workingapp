package p022I;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: I.e */
/* loaded from: classes.dex */
public final class C0202e {

    /* renamed from: a */
    public final TextPaint f751a;

    /* renamed from: b */
    public final TextDirectionHeuristic f752b;

    /* renamed from: c */
    public final int f753c;

    /* renamed from: d */
    public final int f754d;

    public C0202e(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0201d.m545h(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
        }
        this.f751a = textPaint;
        this.f752b = textDirectionHeuristic;
        this.f753c = i2;
        this.f754d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0202e)) {
            return false;
        }
        C0202e c0202e = (C0202e) obj;
        if (this.f753c != c0202e.f753c || this.f754d != c0202e.f754d) {
            return false;
        }
        TextPaint textPaint = this.f751a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c0202e.f751a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f752b == c0202e.f752b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f751a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f752b, Integer.valueOf(this.f753c), Integer.valueOf(this.f754d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f751a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f752b);
        sb.append(", breakStrategy=" + this.f753c);
        sb.append(", hyphenationFrequency=" + this.f754d);
        sb.append("}");
        return sb.toString();
    }

    public C0202e(PrecomputedText.Params params) {
        this.f751a = params.getTextPaint();
        this.f752b = params.getTextDirection();
        this.f753c = params.getBreakStrategy();
        this.f754d = params.getHyphenationFrequency();
    }
}
