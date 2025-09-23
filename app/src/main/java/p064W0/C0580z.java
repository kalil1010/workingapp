package p064W0;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p028K.C0253b;
import p031L.C0341k;
import p105j.C1081c0;

/* renamed from: W0.z */
/* loaded from: classes.dex */
public final class C0580z extends C0253b {

    /* renamed from: d */
    public final TextInputLayout f1868d;

    public C0580z(TextInputLayout textInputLayout) {
        this.f1868d = textInputLayout;
    }

    @Override // p028K.C0253b
    /* renamed from: d */
    public final void mo316d(View view, C0341k c0341k) {
        View.AccessibilityDelegate accessibilityDelegate = this.f832a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0341k.f1085a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1868d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f3397u0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        C0578x c0578x = textInputLayout.f3358b;
        C1081c0 c1081c0 = c0578x.f1856b;
        if (c1081c0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c1081c0);
            accessibilityNodeInfo.setTraversalAfter(c1081c0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c0578x.f1858d);
        }
        if (!zIsEmpty) {
            c0341k.m932l(text);
        } else if (!TextUtils.isEmpty(string)) {
            c0341k.m932l(string);
            if (!z2 && placeholderText != null) {
                c0341k.m932l(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c0341k.m932l(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                c0341k.m931k(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                c0341k.m932l(string);
            }
            if (i2 >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                c0341k.m928h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C1081c0 c1081c02 = textInputLayout.f3374j.f1837y;
        if (c1081c02 != null) {
            accessibilityNodeInfo.setLabelFor(c1081c02);
        }
        textInputLayout.f3360c.m1359b().mo1350n(c0341k);
    }

    @Override // p028K.C0253b
    /* renamed from: e */
    public final void mo728e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo728e(view, accessibilityEvent);
        this.f1868d.f3360c.m1359b().mo1351o(accessibilityEvent);
    }
}
