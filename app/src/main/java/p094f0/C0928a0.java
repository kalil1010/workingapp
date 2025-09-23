package p094f0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import p028K.C0253b;
import p031L.C0341k;
import p060V.C0540b;

/* renamed from: f0.a0 */
/* loaded from: classes.dex */
public class C0928a0 extends C0253b {

    /* renamed from: d */
    public final RecyclerView f3836d;

    /* renamed from: e */
    public final C0540b f3837e;

    public C0928a0(RecyclerView recyclerView) {
        this.f3836d = recyclerView;
        C0540b c0540b = this.f3837e;
        if (c0540b != null) {
            this.f3837e = c0540b;
        } else {
            this.f3837e = new C0540b(this);
        }
    }

    @Override // p028K.C0253b
    /* renamed from: c */
    public final void mo315c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo315c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f3836d.m1891L()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1852T(accessibilityEvent);
        }
    }

    @Override // p028K.C0253b
    /* renamed from: d */
    public void mo316d(View view, C0341k c0341k) {
        View.AccessibilityDelegate accessibilityDelegate = this.f832a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0341k.f1085a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f3836d;
        if (recyclerView.m1891L() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0911J layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3753b;
        C0917P c0917p = recyclerView2.f2805b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f3753b.canScrollHorizontally(-1)) {
            c0341k.m922a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f3753b.canScrollVertically(1) || layoutManager.f3753b.canScrollHorizontally(1)) {
            c0341k.m922a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        C0923W c0923w = recyclerView2.f2812e0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo1797J(c0917p, c0923w), layoutManager.mo1831x(c0917p, c0923w), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
  0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p028K.C0253b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo730g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.mo730g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f3836d
            boolean r0 = r4.m1891L()
            r1 = 0
            if (r0 != 0) goto L8c
            f0.J r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            f0.J r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3753b
            f0.P r2 = r0.f2805b
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.148E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.f3766o
            int r2 = r4.m2358G()
            int r0 = r0 - r2
            int r2 = r4.m2355D()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f3753b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f3765n
            int r2 = r4.m2356E()
            int r5 = r5 - r2
            int r2 = r4.m2357F()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f3766o
            int r0 = r4.m2358G()
            int r5 = r5 - r0
            int r0 = r4.m2355D()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f3753b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f3765n
            int r2 = r4.m2356E()
            int r5 = r5 - r2
            int r2 = r4.m2357F()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f3753b
            r4.m1908c0(r5, r0, r6)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.C0928a0.mo730g(android.view.View, int, android.os.Bundle):boolean");
    }
}
