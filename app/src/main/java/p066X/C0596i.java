package p066X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0671j;

/* renamed from: X.i */
/* loaded from: classes.dex */
public final class C0596i implements TextWatcher {

    /* renamed from: a */
    public final EditText f1903a;

    /* renamed from: b */
    public C0595h f1904b;

    /* renamed from: c */
    public boolean f1905c = true;

    public C0596i(EditText editText) {
        this.f1903a = editText;
    }

    /* renamed from: a */
    public static void m1402a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0671j c0671jM1625a = C0671j.m1625a();
            if (editableText == null) {
                length = 0;
            } else {
                c0671jM1625a.getClass();
                length = editableText.length();
            }
            c0671jM1625a.m1629e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        EditText editText = this.f1903a;
        if (editText.isInEditMode() || !this.f1905c || C0671j.f2394j == null || i3 > i4 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM1626b = C0671j.m1625a().m1626b();
        if (iM1626b != 0) {
            if (iM1626b == 1) {
                C0671j.m1625a().m1629e((Spannable) charSequence, i2, i4 + i2);
                return;
            } else if (iM1626b != 3) {
                return;
            }
        }
        C0671j c0671jM1625a = C0671j.m1625a();
        if (this.f1904b == null) {
            this.f1904b = new C0595h(editText);
        }
        c0671jM1625a.m1630f(this.f1904b);
    }
}
