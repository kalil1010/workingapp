package p109k0;

import p006C.C0076h;
import p033L1.AbstractC0356d;

/* renamed from: k0.l */
/* loaded from: classes.dex */
public abstract class AbstractC1194l extends AbstractC1193k {

    /* renamed from: a */
    public C0076h[] f4847a;

    /* renamed from: b */
    public String f4848b;

    /* renamed from: c */
    public int f4849c;

    public AbstractC1194l() {
        this.f4847a = null;
        this.f4849c = 0;
    }

    public C0076h[] getPathData() {
        return this.f4847a;
    }

    public String getPathName() {
        return this.f4848b;
    }

    public void setPathData(C0076h[] c0076hArr) {
        C0076h[] c0076hArr2 = this.f4847a;
        boolean z2 = false;
        if (c0076hArr2 != null && c0076hArr != null && c0076hArr2.length == c0076hArr.length) {
            int i2 = 0;
            while (true) {
                if (i2 >= c0076hArr2.length) {
                    z2 = true;
                    break;
                }
                C0076h c0076h = c0076hArr2[i2];
                char c3 = c0076h.f177a;
                C0076h c0076h2 = c0076hArr[i2];
                if (c3 != c0076h2.f177a || c0076h.f178b.length != c0076h2.f178b.length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (!z2) {
            this.f4847a = AbstractC0356d.m963m(c0076hArr);
            return;
        }
        C0076h[] c0076hArr3 = this.f4847a;
        for (int i3 = 0; i3 < c0076hArr.length; i3++) {
            c0076hArr3[i3].f177a = c0076hArr[i3].f177a;
            int i4 = 0;
            while (true) {
                float[] fArr = c0076hArr[i3].f178b;
                if (i4 < fArr.length) {
                    c0076hArr3[i3].f178b[i4] = fArr[i4];
                    i4++;
                }
            }
        }
    }

    public AbstractC1194l(AbstractC1194l abstractC1194l) {
        this.f4847a = null;
        this.f4849c = 0;
        this.f4848b = abstractC1194l.f4848b;
        this.f4847a = AbstractC0356d.m963m(abstractC1194l.f4847a);
    }
}
