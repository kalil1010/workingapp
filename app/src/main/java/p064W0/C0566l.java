package p064W0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: W0.l */
/* loaded from: classes.dex */
public final class C0566l {

    /* renamed from: a */
    public final /* synthetic */ C0569o f1772a;

    public C0566l(C0569o c0569o) {
        this.f1772a = c0569o;
    }

    /* renamed from: a */
    public final void m1354a(TextInputLayout textInputLayout) {
        C0569o c0569o = this.f1772a;
        if (c0569o.f1797s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0569o.f1797s;
        C0565k c0565k = c0569o.f1800v;
        if (editText != null) {
            editText.removeTextChangedListener(c0565k);
            if (c0569o.f1797s.getOnFocusChangeListener() == c0569o.m1359b().mo1336e()) {
                c0569o.f1797s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0569o.f1797s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0565k);
        }
        c0569o.m1359b().mo1339m(c0569o.f1797s);
        c0569o.m1367j(c0569o.m1359b());
    }
}
