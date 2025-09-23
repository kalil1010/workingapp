package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p055T0.C0511e;

/* renamed from: androidx.emoji2.text.u */
/* loaded from: classes.dex */
public final class C0682u implements Spannable {

    /* renamed from: a */
    public boolean f2433a = false;

    /* renamed from: b */
    public Spannable f2434b;

    public C0682u(Spannable spannable) {
        this.f2434b = spannable;
    }

    /* renamed from: a */
    public final void m1644a() {
        Spannable spannable = this.f2434b;
        if (!this.f2433a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0511e(17) : new C0681t(17)).mo1280j(spannable)) {
                this.f2434b = new SpannableString(spannable);
            }
        }
        this.f2433a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f2434b.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f2434b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f2434b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f2434b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f2434b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f2434b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f2434b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2434b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f2434b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m1644a();
        this.f2434b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        m1644a();
        this.f2434b.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f2434b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2434b.toString();
    }

    public C0682u(CharSequence charSequence) {
        this.f2434b = new SpannableString(charSequence);
    }
}
