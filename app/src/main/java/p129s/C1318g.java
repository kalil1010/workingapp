package p129s;

import java.util.ArrayList;
import p124q.C1269c;
import p132t.C1333b;
import p138v.C1361f;

/* renamed from: s.g */
/* loaded from: classes.dex */
public final class C1318g extends AbstractC1320i {

    /* renamed from: A0 */
    public int f5594A0;

    /* renamed from: B0 */
    public C1333b f5595B0;

    /* renamed from: C0 */
    public C1361f f5596C0;

    /* renamed from: D0 */
    public int f5597D0;

    /* renamed from: E0 */
    public int f5598E0;

    /* renamed from: F0 */
    public int f5599F0;

    /* renamed from: G0 */
    public int f5600G0;

    /* renamed from: H0 */
    public int f5601H0;

    /* renamed from: I0 */
    public int f5602I0;

    /* renamed from: J0 */
    public float f5603J0;

    /* renamed from: K0 */
    public float f5604K0;

    /* renamed from: L0 */
    public float f5605L0;

    /* renamed from: M0 */
    public float f5606M0;

    /* renamed from: N0 */
    public float f5607N0;

    /* renamed from: O0 */
    public float f5608O0;

    /* renamed from: P0 */
    public int f5609P0;

    /* renamed from: Q0 */
    public int f5610Q0;

    /* renamed from: R0 */
    public int f5611R0;

    /* renamed from: S0 */
    public int f5612S0;

    /* renamed from: T0 */
    public int f5613T0;

    /* renamed from: U0 */
    public int f5614U0;

    /* renamed from: V0 */
    public int f5615V0;

    /* renamed from: W0 */
    public ArrayList f5616W0;

    /* renamed from: X0 */
    public C1315d[] f5617X0;

    /* renamed from: Y0 */
    public C1315d[] f5618Y0;

    /* renamed from: Z0 */
    public int[] f5619Z0;

    /* renamed from: a1 */
    public C1315d[] f5620a1;

    /* renamed from: b1 */
    public int f5621b1;

    /* renamed from: s0 */
    public int f5622s0;

    /* renamed from: t0 */
    public int f5623t0;

    /* renamed from: u0 */
    public int f5624u0;

    /* renamed from: v0 */
    public int f5625v0;

    /* renamed from: w0 */
    public int f5626w0;

    /* renamed from: x0 */
    public int f5627x0;

    /* renamed from: y0 */
    public boolean f5628y0;

    /* renamed from: z0 */
    public int f5629z0;

    @Override // p129s.AbstractC1320i
    /* renamed from: S */
    public final void mo3043S() {
        for (int i2 = 0; i2 < this.f5637r0; i2++) {
            C1315d c1315d = this.f5636q0[i2];
            if (c1315d != null) {
                c1315d.f5491F = true;
            }
        }
    }

    /* renamed from: T */
    public final int m3044T(C1315d c1315d, int i2) {
        C1315d c1315d2;
        if (c1315d != null) {
            int[] iArr = c1315d.f5543p0;
            if (iArr[1] == 3) {
                int i3 = c1315d.f5546s;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = (int) (c1315d.f5553z * i2);
                        if (i4 != c1315d.m3017k()) {
                            c1315d.f5524g = true;
                            m3046V(iArr[0], c1315d.m3021q(), 1, i4, c1315d);
                        }
                        return i4;
                    }
                    c1315d2 = c1315d;
                    if (i3 == 1) {
                        return c1315d2.m3017k();
                    }
                    if (i3 == 3) {
                        return (int) ((c1315d2.m3021q() * c1315d2.f5508W) + 0.5f);
                    }
                }
            } else {
                c1315d2 = c1315d;
            }
            return c1315d2.m3017k();
        }
        return 0;
    }

    /* renamed from: U */
    public final int m3045U(C1315d c1315d, int i2) {
        C1315d c1315d2;
        if (c1315d != null) {
            int[] iArr = c1315d.f5543p0;
            if (iArr[0] == 3) {
                int i3 = c1315d.f5545r;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = (int) (c1315d.f5550w * i2);
                        if (i4 != c1315d.m3021q()) {
                            c1315d.f5524g = true;
                            m3046V(1, i4, iArr[1], c1315d.m3017k(), c1315d);
                        }
                        return i4;
                    }
                    c1315d2 = c1315d;
                    if (i3 == 1) {
                        return c1315d2.m3021q();
                    }
                    if (i3 == 3) {
                        return (int) ((c1315d2.m3017k() * c1315d2.f5508W) + 0.5f);
                    }
                }
            } else {
                c1315d2 = c1315d;
            }
            return c1315d2.m3021q();
        }
        return 0;
    }

    /* renamed from: V */
    public final void m3046V(int i2, int i3, int i4, int i5, C1315d c1315d) {
        C1361f c1361f;
        C1315d c1315d2;
        while (true) {
            c1361f = this.f5596C0;
            if (c1361f != null || (c1315d2 = this.f5505T) == null) {
                break;
            } else {
                this.f5596C0 = ((C1316e) c1315d2).f5570u0;
            }
        }
        C1333b c1333b = this.f5595B0;
        c1333b.f5652a = i2;
        c1333b.f5653b = i4;
        c1333b.f5654c = i3;
        c1333b.f5655d = i5;
        c1361f.m3126b(c1315d, c1333b);
        c1315d.m3006O(c1333b.f5656e);
        c1315d.m3003L(c1333b.f5657f);
        c1315d.f5490E = c1333b.f5659h;
        c1315d.m3000I(c1333b.f5658g);
    }

    @Override // p129s.C1315d
    /* renamed from: b */
    public final void mo2978b(C1269c c1269c, boolean z2) {
        C1315d c1315d;
        float f;
        int i2;
        super.mo2978b(c1269c, z2);
        C1315d c1315d2 = this.f5505T;
        boolean z3 = c1315d2 != null && ((C1316e) c1315d2).f5571v0;
        int i3 = this.f5613T0;
        ArrayList arrayList = this.f5616W0;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    ((C1317f) arrayList.get(i4)).m3038b(i4, z3, i4 == size + (-1));
                    i4++;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    int size2 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        ((C1317f) arrayList.get(i5)).m3038b(i5, z3, i5 == size2 + (-1));
                        i5++;
                    }
                }
            } else if (this.f5619Z0 != null && this.f5618Y0 != null && this.f5617X0 != null) {
                for (int i6 = 0; i6 < this.f5621b1; i6++) {
                    this.f5620a1[i6].m2997D();
                }
                int[] iArr = this.f5619Z0;
                int i7 = iArr[0];
                int i8 = iArr[1];
                float f2 = this.f5603J0;
                C1315d c1315d3 = null;
                int i9 = 0;
                while (i9 < i7) {
                    if (z3) {
                        i2 = (i7 - i9) - 1;
                        f = 1.0f - this.f5603J0;
                    } else {
                        f = f2;
                        i2 = i9;
                    }
                    C1315d c1315d4 = this.f5618Y0[i2];
                    if (c1315d4 != null && c1315d4.f5525g0 != 8) {
                        C1314c c1314c = c1315d4.f5494I;
                        if (i9 == 0) {
                            c1315d4.m3012f(c1314c, this.f5494I, this.f5626w0);
                            c1315d4.f5529i0 = this.f5597D0;
                            c1315d4.f5519d0 = f;
                        }
                        if (i9 == i7 - 1) {
                            c1315d4.m3012f(c1315d4.f5496K, this.f5496K, this.f5627x0);
                        }
                        if (i9 > 0 && c1315d3 != null) {
                            int i10 = this.f5609P0;
                            C1314c c1314c2 = c1315d3.f5496K;
                            c1315d4.m3012f(c1314c, c1314c2, i10);
                            c1315d3.m3012f(c1314c2, c1314c, 0);
                        }
                        c1315d3 = c1315d4;
                    }
                    i9++;
                    f2 = f;
                }
                for (int i11 = 0; i11 < i8; i11++) {
                    C1315d c1315d5 = this.f5617X0[i11];
                    if (c1315d5 != null && c1315d5.f5525g0 != 8) {
                        C1314c c1314c3 = c1315d5.f5495J;
                        if (i11 == 0) {
                            c1315d5.m3012f(c1314c3, this.f5495J, this.f5622s0);
                            c1315d5.f5531j0 = this.f5598E0;
                            c1315d5.f5521e0 = this.f5604K0;
                        }
                        if (i11 == i8 - 1) {
                            c1315d5.m3012f(c1315d5.f5497L, this.f5497L, this.f5623t0);
                        }
                        if (i11 > 0 && c1315d3 != null) {
                            int i12 = this.f5610Q0;
                            C1314c c1314c4 = c1315d3.f5497L;
                            c1315d5.m3012f(c1314c3, c1314c4, i12);
                            c1315d3.m3012f(c1314c4, c1314c3, 0);
                        }
                        c1315d3 = c1315d5;
                    }
                }
                for (int i13 = 0; i13 < i7; i13++) {
                    for (int i14 = 0; i14 < i8; i14++) {
                        int i15 = (i14 * i7) + i13;
                        if (this.f5615V0 == 1) {
                            i15 = (i13 * i8) + i14;
                        }
                        C1315d[] c1315dArr = this.f5620a1;
                        if (i15 < c1315dArr.length && (c1315d = c1315dArr[i15]) != null && c1315d.f5525g0 != 8) {
                            C1315d c1315d6 = this.f5618Y0[i13];
                            C1315d c1315d7 = this.f5617X0[i14];
                            if (c1315d != c1315d6) {
                                c1315d.m3012f(c1315d.f5494I, c1315d6.f5494I, 0);
                                c1315d.m3012f(c1315d.f5496K, c1315d6.f5496K, 0);
                            }
                            if (c1315d != c1315d7) {
                                c1315d.m3012f(c1315d.f5495J, c1315d7.f5495J, 0);
                                c1315d.m3012f(c1315d.f5497L, c1315d7.f5497L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C1317f) arrayList.get(0)).m3038b(0, z3, true);
        }
        this.f5628y0 = false;
    }
}
