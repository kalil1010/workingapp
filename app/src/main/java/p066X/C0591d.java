package p066X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0671j;

/* renamed from: X.d */
/* loaded from: classes.dex */
public final class C0591d implements InputFilter {

    /* renamed from: a */
    public final TextView f1894a;

    /* renamed from: b */
    public C0590c f1895b;

    public C0591d(TextView textView) {
        this.f1894a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        TextView textView = this.f1894a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM1626b = C0671j.m1625a().m1626b();
        if (iM1626b != 0) {
            if (iM1626b == 1) {
                if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return C0671j.m1625a().m1629e(charSequence, 0, charSequence.length());
            }
            if (iM1626b != 3) {
                return charSequence;
            }
        }
        C0671j c0671jM1625a = C0671j.m1625a();
        if (this.f1895b == null) {
            this.f1895b = new C0590c(textView, this);
        }
        c0671jM1625a.m1630f(this.f1895b);
        return charSequence;
    }
}
