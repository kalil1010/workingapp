package p129s;

import java.util.ArrayList;
import p132t.AbstractC1339h;
import p132t.C1345n;

/* renamed from: s.i */
/* loaded from: classes.dex */
public abstract class AbstractC1320i extends C1315d {

    /* renamed from: q0 */
    public C1315d[] f5636q0 = new C1315d[4];

    /* renamed from: r0 */
    public int f5637r0 = 0;

    /* renamed from: R */
    public final void m3049R(int i2, ArrayList arrayList, C1345n c1345n) {
        for (int i3 = 0; i3 < this.f5637r0; i3++) {
            C1315d c1315d = this.f5636q0[i3];
            ArrayList arrayList2 = c1345n.f5692a;
            if (!arrayList2.contains(c1315d)) {
                arrayList2.add(c1315d);
            }
        }
        for (int i4 = 0; i4 < this.f5637r0; i4++) {
            AbstractC1339h.m3087b(this.f5636q0[i4], i2, arrayList, c1345n);
        }
    }

    /* renamed from: S */
    public void mo3043S() {
    }
}
