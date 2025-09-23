package p045Q;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;
import p028K.C0261f;
import p028K.InterfaceC0259e;
import p028K.InterfaceC0285r;

/* renamed from: Q.q */
/* loaded from: classes.dex */
public final class C0453q implements InterfaceC0285r {
    /* renamed from: a */
    public final C0261f m1138a(View view, C0261f c0261f) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(c0261f);
        }
        if (c0261f.f852a.mo16c() == 2) {
            return c0261f;
        }
        InterfaceC0259e interfaceC0259e = c0261f.f852a;
        ClipData clipDataMo18e = interfaceC0259e.mo18e();
        int iMo23j = interfaceC0259e.mo23j();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i2 = 0; i2 < clipDataMo18e.getItemCount(); i2++) {
            ClipData.Item itemAt = clipDataMo18e.getItemAt(i2);
            if ((iMo23j & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
