package p064W0;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;

/* renamed from: W0.y */
/* loaded from: classes.dex */
public final class C0579y implements TextWatcher {

    /* renamed from: a */
    public int f1865a;

    /* renamed from: b */
    public final /* synthetic */ EditText f1866b;

    /* renamed from: c */
    public final /* synthetic */ TextInputLayout f1867c;

    public C0579y(TextInputLayout textInputLayout, EditText editText) {
        this.f1867c = textInputLayout;
        this.f1866b = editText;
        this.f1865a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        TextInputLayout textInputLayout = this.f1867c;
        textInputLayout.m2133u(!textInputLayout.f3332A0, false);
        if (textInputLayout.f3376k) {
            textInputLayout.m2126n(editable);
        }
        if (textInputLayout.f3392s) {
            textInputLayout.m2134v(editable);
        }
        EditText editText = this.f1866b;
        int lineCount = editText.getLineCount();
        int i2 = this.f1865a;
        if (lineCount != i2) {
            if (lineCount < i2) {
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                int minimumHeight = editText.getMinimumHeight();
                int i3 = textInputLayout.f3395t0;
                if (minimumHeight != i3) {
                    editText.setMinimumHeight(i3);
                }
            }
            this.f1865a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
