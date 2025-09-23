package p035M0;

import android.view.View;
import p028K.C0253b;
import p031L.C0340j;
import p031L.C0341k;

/* renamed from: M0.h */
/* loaded from: classes.dex */
public final class C0379h extends C0253b {

    /* renamed from: d */
    public final /* synthetic */ int f1208d;

    /* renamed from: e */
    public final /* synthetic */ boolean f1209e;

    /* renamed from: f */
    public final /* synthetic */ C0380i f1210f;

    public C0379h(C0380i c0380i, int i2, boolean z2) {
        this.f1210f = c0380i;
        this.f1208d = i2;
        this.f1209e = z2;
    }

    @Override // p028K.C0253b
    /* renamed from: d */
    public final void mo316d(View view, C0341k c0341k) {
        this.f832a.onInitializeAccessibilityNodeInfo(view, c0341k.f1085a);
        int i2 = this.f1208d;
        int i3 = 0;
        int i4 = i2;
        while (true) {
            C0380i c0380i = this.f1210f;
            if (i3 >= i2) {
                c0380i.getClass();
                c0341k.m930j(C0340j.m920a(i4, 1, 1, 1, this.f1209e, view.isSelected()));
                return;
            } else {
                C0388q c0388q = c0380i.f1214f;
                if (c0388q.f1227e.mo1058c(i3) == 2 || c0388q.f1227e.mo1058c(i3) == 3) {
                    i4--;
                }
                i3++;
            }
        }
    }
}
