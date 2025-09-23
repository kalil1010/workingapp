package p031L;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.time.Duration;

/* renamed from: L.i */
/* loaded from: classes.dex */
public abstract class AbstractC0339i {
    /* renamed from: a */
    public static AccessibilityNodeInfo.AccessibilityAction m908a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* renamed from: b */
    public static void m909b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* renamed from: c */
    public static CharSequence m910c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* renamed from: d */
    public static long m911d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
    }

    /* renamed from: e */
    public static boolean m912e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }

    /* renamed from: f */
    public static boolean m913f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* renamed from: g */
    public static void m914g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z2);
    }

    /* renamed from: h */
    public static void m915h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    /* renamed from: i */
    public static void m916i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    /* renamed from: j */
    public static void m917j(AccessibilityNodeInfo accessibilityNodeInfo, long j2) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j2));
    }

    /* renamed from: k */
    public static void m918k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z2) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z2);
    }

    /* renamed from: l */
    public static void m919l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z2);
    }
}
