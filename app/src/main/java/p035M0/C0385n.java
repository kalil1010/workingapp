package p035M0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;
import p031L.C0341k;
import p094f0.C0928a0;

/* renamed from: M0.n */
/* loaded from: classes.dex */
public final class C0385n extends C0928a0 {

    /* renamed from: f */
    public final /* synthetic */ C0388q f1219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0385n(C0388q c0388q, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f1219f = c0388q;
    }

    @Override // p094f0.C0928a0, p028K.C0253b
    /* renamed from: d */
    public final void mo316d(View view, C0341k c0341k) {
        super.mo316d(view, c0341k);
        C0380i c0380i = this.f1219f.f1227e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C0388q c0388q = c0380i.f1214f;
            if (i2 >= c0388q.f1227e.f1211c.size()) {
                c0341k.f1085a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i3, 1, false));
                return;
            } else {
                int iMo1058c = c0388q.f1227e.mo1058c(i2);
                if (iMo1058c == 0 || iMo1058c == 1) {
                    i3++;
                }
                i2++;
            }
        }
    }
}
