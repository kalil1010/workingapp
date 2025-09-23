package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p011D1.C0121k;
import p033L1.AbstractC0364l;
import p063W.C0551a;

/* renamed from: androidx.emoji2.text.s */
/* loaded from: classes.dex */
public final class C0680s extends ReplacementSpan {

    /* renamed from: b */
    public final C0673l f2431b;

    /* renamed from: a */
    public final Paint.FontMetricsInt f2430a = new Paint.FontMetricsInt();

    /* renamed from: c */
    public float f2432c = 1.0f;

    public C0680s(C0673l c0673l) {
        AbstractC0364l.m1010q(c0673l, "metadata cannot be null");
        this.f2431b = c0673l;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
        C0671j.m1625a().getClass();
        C0673l c0673l = this.f2431b;
        C0121k c0121k = c0673l.f2407b;
        Typeface typeface = (Typeface) c0121k.f355d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) c0121k.f353b, c0673l.f2406a * 2, 2, f, i5, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f2430a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0673l c0673l = this.f2431b;
        this.f2432c = fAbs / (c0673l.m1632b().m610a(14) != 0 ? ((ByteBuffer) r8.f806d).getShort(r1 + r8.f803a) : (short) 0);
        C0551a c0551aM1632b = c0673l.m1632b();
        int iM610a = c0551aM1632b.m610a(14);
        if (iM610a != 0) {
            ((ByteBuffer) c0551aM1632b.f806d).getShort(iM610a + c0551aM1632b.f803a);
        }
        short s2 = (short) ((c0673l.m1632b().m610a(12) != 0 ? ((ByteBuffer) r5.f806d).getShort(r7 + r5.f803a) : (short) 0) * this.f2432c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
