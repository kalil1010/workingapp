package p035M0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: M0.w */
/* loaded from: classes.dex */
public final class C0394w {

    /* renamed from: a */
    public CharSequence f1257a;

    /* renamed from: b */
    public final TextPaint f1258b;

    /* renamed from: c */
    public final int f1259c;

    /* renamed from: d */
    public int f1260d;

    /* renamed from: j */
    public boolean f1266j;

    /* renamed from: e */
    public Layout.Alignment f1261e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f1262f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f1263g = 1.0f;

    /* renamed from: h */
    public int f1264h = 1;

    /* renamed from: i */
    public boolean f1265i = true;

    /* renamed from: k */
    public TextUtils.TruncateAt f1267k = null;

    public C0394w(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f1257a = charSequence;
        this.f1258b = textPaint;
        this.f1259c = i2;
        this.f1260d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout m1075a() {
        if (this.f1257a == null) {
            this.f1257a = "";
        }
        int iMax = Math.max(0, this.f1259c);
        CharSequence charSequenceEllipsize = this.f1257a;
        int i2 = this.f1262f;
        TextPaint textPaint = this.f1258b;
        if (i2 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f1267k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f1260d);
        this.f1260d = iMin;
        if (this.f1266j && this.f1262f == 1) {
            this.f1261e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f1261e);
        builderObtain.setIncludePad(this.f1265i);
        builderObtain.setTextDirection(this.f1266j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f1267k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f1262f);
        float f = this.f1263g;
        if (f != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f);
        }
        if (this.f1262f > 1) {
            builderObtain.setHyphenationFrequency(this.f1264h);
        }
        return builderObtain.build();
    }
}
