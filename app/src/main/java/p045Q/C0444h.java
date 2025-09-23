package p045Q;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import p028K.C0253b;
import p031L.C0336f;
import p031L.C0341k;

/* renamed from: Q.h */
/* loaded from: classes.dex */
public final class C0444h extends C0253b {

    /* renamed from: d */
    public final /* synthetic */ int f1351d;

    public /* synthetic */ C0444h(int i2) {
        this.f1351d = i2;
    }

    @Override // p028K.C0253b
    /* renamed from: c */
    public void mo315c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1351d) {
            case 0:
                super.mo315c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo315c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p028K.C0253b
    /* renamed from: d */
    public final void mo316d(View view, C0341k c0341k) {
        int scrollRange;
        switch (this.f1351d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f832a;
                AccessibilityNodeInfo accessibilityNodeInfo = c0341k.f1085a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c0341k.m929i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0341k.m923b(C0336f.f1073i);
                        c0341k.m923b(C0336f.f1077m);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0341k.m923b(C0336f.f1072h);
                        c0341k.m923b(C0336f.f1078n);
                        break;
                    }
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f832a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0341k.f1085a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (!DrawerLayout.m1583m(view)) {
                    accessibilityNodeInfo2.setParent(null);
                    break;
                }
                break;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f832a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = c0341k.f1085a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo(null);
                break;
            case 3:
                View.AccessibilityDelegate accessibilityDelegate4 = this.f832a;
                AccessibilityNodeInfo accessibilityNodeInfo4 = c0341k.f1085a;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setScrollable(false);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate5 = this.f832a;
                AccessibilityNodeInfo accessibilityNodeInfo5 = c0341k.f1085a;
                accessibilityDelegate5.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                accessibilityNodeInfo5.setCollectionInfo(null);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // p028K.C0253b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo730g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.f1351d
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.mo730g(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.mo730g(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1e
            goto La0
        L1e:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3b
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3b
            int r7 = r2.height()
        L3b:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L75
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4e
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4e
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L75
            goto La0
        L4e:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.m1579u(r1, r6, r0)
            goto La1
        L75:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.m1579u(r1, r6, r0)
            goto La1
        La0:
            r0 = r1
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p045Q.C0444h.mo730g(android.view.View, int, android.os.Bundle):boolean");
    }
}
