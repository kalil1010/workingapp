package p094f0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: f0.n */
/* loaded from: classes.dex */
public final class C0949n {

    /* renamed from: a */
    public int f3963a;

    /* renamed from: b */
    public int f3964b;

    /* renamed from: c */
    public int[] f3965c;

    /* renamed from: d */
    public int f3966d;

    /* renamed from: a */
    public final void m2453a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i4 = this.f3966d;
        int i5 = i4 * 2;
        int[] iArr = this.f3965c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3965c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i5 >= iArr.length) {
            int[] iArr3 = new int[i4 * 4];
            this.f3965c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f3965c;
        iArr4[i5] = i2;
        iArr4[i5 + 1] = i3;
        this.f3966d++;
    }

    /* renamed from: b */
    public final void m2454b(RecyclerView recyclerView, boolean z2) {
        this.f3966d = 0;
        int[] iArr = this.f3965c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0911J abstractC0911J = recyclerView.f2827m;
        if (recyclerView.f2825l == null || abstractC0911J == null || !abstractC0911J.f3760i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f2809d.m2419j()) {
                abstractC0911J.mo1868i(recyclerView.f2825l.mo188a(), this);
            }
        } else if (!recyclerView.m1891L()) {
            abstractC0911J.mo1867h(this.f3963a, this.f3964b, recyclerView.f2812e0, this);
        }
        int i2 = this.f3966d;
        if (i2 > abstractC0911J.f3761j) {
            abstractC0911J.f3761j = i2;
            abstractC0911J.f3762k = z2;
            recyclerView.f2805b.m2388k();
        }
    }
}
