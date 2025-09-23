package p066X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0669h;
import androidx.emoji2.text.C0671j;
import java.lang.ref.WeakReference;

/* renamed from: X.c */
/* loaded from: classes.dex */
public final class C0590c extends AbstractC0669h {

    /* renamed from: a */
    public final WeakReference f1892a;

    /* renamed from: b */
    public final WeakReference f1893b;

    public C0590c(TextView textView, C0591d c0591d) {
        this.f1892a = new WeakReference(textView);
        this.f1893b = new WeakReference(c0591d);
    }

    @Override // androidx.emoji2.text.AbstractC0669h
    /* renamed from: a */
    public final void mo1397a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f1892a.get();
        InputFilter inputFilter = (InputFilter) this.f1893b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0671j c0671jM1625a = C0671j.m1625a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0671jM1625a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM1629e = c0671jM1625a.m1629e(text, 0, length);
                    if (text == charSequenceM1629e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM1629e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM1629e);
                    textView.setText(charSequenceM1629e);
                    if (charSequenceM1629e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM1629e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
