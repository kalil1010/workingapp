package p030K1;

import p131s1.AbstractC1326c;

/* renamed from: K1.B */
/* loaded from: classes.dex */
public final class C0303B {

    /* renamed from: a */
    public int f928a;

    /* renamed from: b */
    public final int[] f929b = new int[10];

    /* renamed from: a */
    public final int m829a() {
        if ((this.f928a & 128) != 0) {
            return this.f929b[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public final void m830b(C0303B c0303b) {
        AbstractC1326c.m3062e(c0303b, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (((1 << i2) & c0303b.f928a) != 0) {
                m831c(i2, c0303b.f929b[i2]);
            }
        }
    }

    /* renamed from: c */
    public final void m831c(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f929b;
            if (i2 >= iArr.length) {
                return;
            }
            this.f928a = (1 << i2) | this.f928a;
            iArr[i2] = i3;
        }
    }
}
