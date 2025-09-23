package p064W0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: W0.r */
/* loaded from: classes.dex */
public final class C0572r extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final /* synthetic */ C0573s f1810a;

    public C0572r(C0573s c0573s) {
        this.f1810a = c0573s;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f1810a.f1820h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
