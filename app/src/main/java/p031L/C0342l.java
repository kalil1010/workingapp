package p031L;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p001A0.C0004c;

/* renamed from: L.l */
/* loaded from: classes.dex */
public class C0342l extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final C0004c f1087a;

    public C0342l(C0004c c0004c) {
        this.f1087a = c0004c;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        C0341k c0341kMo30q = this.f1087a.mo30q(i2);
        if (c0341kMo30q == null) {
            return null;
        }
        return c0341kMo30q.f1085a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.f1087a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        C0341k c0341kMo31r = this.f1087a.mo31r(i2);
        if (c0341kMo31r == null) {
            return null;
        }
        return c0341kMo31r.f1085a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        return this.f1087a.mo33t(i2, i3, bundle);
    }
}
