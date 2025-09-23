package p094f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.k */
/* loaded from: classes.dex */
public final class C0946k extends AbstractC0914M {

    /* renamed from: a */
    public final /* synthetic */ C0948m f3930a;

    public C0946k(C0948m c0948m) {
        this.f3930a = c0948m;
    }

    @Override // p094f0.AbstractC0914M
    /* renamed from: b */
    public final void mo2084b(RecyclerView recyclerView, int i2, int i3) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0948m c0948m = this.f3930a;
        int iComputeVerticalScrollRange = c0948m.f3955s.computeVerticalScrollRange();
        int i4 = c0948m.f3954r;
        int i5 = iComputeVerticalScrollRange - i4;
        int i6 = c0948m.f3937a;
        c0948m.f3956t = i5 > 0 && i4 >= i6;
        int iComputeHorizontalScrollRange = c0948m.f3955s.computeHorizontalScrollRange();
        int i7 = c0948m.f3953q;
        boolean z2 = iComputeHorizontalScrollRange - i7 > 0 && i7 >= i6;
        c0948m.f3957u = z2;
        boolean z3 = c0948m.f3956t;
        if (!z3 && !z2) {
            if (c0948m.f3958v != 0) {
                c0948m.m2451g(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i4;
            c0948m.f3948l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c0948m.f3947k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (c0948m.f3957u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i7;
            c0948m.f3951o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c0948m.f3950n = Math.min(i7, (i7 * i7) / iComputeHorizontalScrollRange);
        }
        int i8 = c0948m.f3958v;
        if (i8 == 0 || i8 == 1) {
            c0948m.m2451g(1);
        }
    }
}
