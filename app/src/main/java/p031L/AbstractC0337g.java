package p031L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.g */
/* loaded from: classes.dex */
public abstract class AbstractC0337g {
    /* renamed from: a */
    public static Object m895a(int i2, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i2, f, f2, f3);
    }

    /* renamed from: b */
    public static CharSequence m896b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: c */
    public static void m897c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
