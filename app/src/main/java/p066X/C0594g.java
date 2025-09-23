package p066X;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.C0671j;
import p093e2.AbstractC0901d;

/* renamed from: X.g */
/* loaded from: classes.dex */
public final class C0594g extends AbstractC0901d {

    /* renamed from: c */
    public final C0593f f1901c;

    public C0594g(TextView textView) {
        this.f1901c = new C0593f(textView);
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: A */
    public final InputFilter[] mo1398A(InputFilter[] inputFilterArr) {
        return !(C0671j.f2394j != null) ? inputFilterArr : this.f1901c.mo1398A(inputFilterArr);
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: m0 */
    public final void mo1399m0(boolean z2) {
        if (C0671j.f2394j != null) {
            this.f1901c.mo1399m0(z2);
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: o0 */
    public final void mo1400o0(boolean z2) {
        boolean z3 = C0671j.f2394j != null;
        C0593f c0593f = this.f1901c;
        if (z3) {
            c0593f.mo1400o0(z2);
        } else {
            c0593f.f1900e = z2;
        }
    }
}
