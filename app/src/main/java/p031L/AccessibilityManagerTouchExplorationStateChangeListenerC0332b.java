package p031L;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p002A1.C0013H;
import p028K.AbstractC0241P;
import p033L1.AbstractC0356d;
import p064W0.C0564j;

/* renamed from: L.b */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0332b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final C0013H f1068a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0332b(C0013H c0013h) {
        this.f1068a = c0013h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0332b) {
            return this.f1068a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0332b) obj).f1068a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1068a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        C0564j c0564j = (C0564j) this.f1068a.f21a;
        AutoCompleteTextView autoCompleteTextView = c0564j.f1760h;
        if (autoCompleteTextView == null || AbstractC0356d.m972w(autoCompleteTextView)) {
            return;
        }
        int i2 = z2 ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        c0564j.f1804d.setImportantForAccessibility(i2);
    }
}
