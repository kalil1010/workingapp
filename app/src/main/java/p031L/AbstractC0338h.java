package p031L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.h */
/* loaded from: classes.dex */
public abstract class AbstractC0338h {
    /* renamed from: a */
    public static C0340j m898a(boolean z2, int i2, int i3, int i4, int i5, boolean z3, String str, String str2) {
        return new C0340j(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(i2).setRowIndex(i3).setColumnSpan(i4).setRowSpan(i5).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build());
    }

    /* renamed from: b */
    public static C0341k m899b(AccessibilityNodeInfo accessibilityNodeInfo, int i2, int i3) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2, i3);
        if (child != null) {
            return new C0341k(child, 0);
        }
        return null;
    }

    /* renamed from: c */
    public static String m900c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    /* renamed from: d */
    public static String m901d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* renamed from: e */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m902e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* renamed from: f */
    public static C0341k m903f(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i2);
        if (parent != null) {
            return new C0341k(parent, 0);
        }
        return null;
    }

    /* renamed from: g */
    public static String m904g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* renamed from: h */
    public static boolean m905h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* renamed from: i */
    public static void m906i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setTextSelectable(z2);
    }

    /* renamed from: j */
    public static void m907j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
