package p031L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.j */
/* loaded from: classes.dex */
public final class C0340j {

    /* renamed from: a */
    public final AccessibilityNodeInfo.CollectionItemInfo f1083a;

    public C0340j(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f1083a = collectionItemInfo;
    }

    /* renamed from: a */
    public static C0340j m920a(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        return new C0340j(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2, z3));
    }
}
