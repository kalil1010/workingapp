package p129s;

import p006C.AbstractC0075g;
import p124q.C1268b;
import p124q.C1269c;
import p124q.C1272f;

/* renamed from: s.a */
/* loaded from: classes.dex */
public final class C1312a extends AbstractC1320i {

    /* renamed from: s0 */
    public int f5456s0;

    /* renamed from: t0 */
    public boolean f5457t0;

    /* renamed from: u0 */
    public int f5458u0;

    /* renamed from: v0 */
    public boolean f5459v0;

    @Override // p129s.C1315d
    /* renamed from: A */
    public final boolean mo2974A() {
        return this.f5459v0;
    }

    @Override // p129s.C1315d
    /* renamed from: B */
    public final boolean mo2975B() {
        return this.f5459v0;
    }

    /* renamed from: T */
    public final boolean m2976T() {
        int i2;
        int i3;
        int i4;
        boolean z2 = true;
        int i5 = 0;
        while (true) {
            i2 = this.f5637r0;
            if (i5 >= i2) {
                break;
            }
            C1315d c1315d = this.f5636q0[i5];
            if ((this.f5457t0 || c1315d.mo2979c()) && ((((i3 = this.f5456s0) == 0 || i3 == 1) && !c1315d.mo2974A()) || (((i4 = this.f5456s0) == 2 || i4 == 3) && !c1315d.mo2975B()))) {
                z2 = false;
            }
            i5++;
        }
        if (!z2 || i2 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f5637r0; i6++) {
            C1315d c1315d2 = this.f5636q0[i6];
            if (this.f5457t0 || c1315d2.mo2979c()) {
                if (!z3) {
                    int i7 = this.f5456s0;
                    if (i7 == 0) {
                        iMax = c1315d2.mo3015i(2).m2983d();
                    } else if (i7 == 1) {
                        iMax = c1315d2.mo3015i(4).m2983d();
                    } else if (i7 == 2) {
                        iMax = c1315d2.mo3015i(3).m2983d();
                    } else if (i7 == 3) {
                        iMax = c1315d2.mo3015i(5).m2983d();
                    }
                    z3 = true;
                }
                int i8 = this.f5456s0;
                if (i8 == 0) {
                    iMax = Math.min(iMax, c1315d2.mo3015i(2).m2983d());
                } else if (i8 == 1) {
                    iMax = Math.max(iMax, c1315d2.mo3015i(4).m2983d());
                } else if (i8 == 2) {
                    iMax = Math.min(iMax, c1315d2.mo3015i(3).m2983d());
                } else if (i8 == 3) {
                    iMax = Math.max(iMax, c1315d2.mo3015i(5).m2983d());
                }
            }
        }
        int i9 = iMax + this.f5458u0;
        int i10 = this.f5456s0;
        if (i10 == 0 || i10 == 1) {
            m3001J(i9, i9);
        } else {
            m3002K(i9, i9);
        }
        this.f5459v0 = true;
        return true;
    }

    /* renamed from: U */
    public final int m2977U() {
        int i2 = this.f5456s0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // p129s.C1315d
    /* renamed from: b */
    public final void mo2978b(C1269c c1269c, boolean z2) {
        boolean z3;
        int i2;
        int i3;
        C1314c[] c1314cArr = this.f5502Q;
        C1314c c1314c = this.f5494I;
        c1314cArr[0] = c1314c;
        C1314c c1314c2 = this.f5495J;
        int i4 = 2;
        c1314cArr[2] = c1314c2;
        C1314c c1314c3 = this.f5496K;
        c1314cArr[1] = c1314c3;
        C1314c c1314c4 = this.f5497L;
        c1314cArr[3] = c1314c4;
        for (C1314c c1314c5 : c1314cArr) {
            c1314c5.f5485i = c1269c.m2955k(c1314c5);
        }
        int i5 = this.f5456s0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C1314c c1314c6 = c1314cArr[i5];
        if (!this.f5459v0) {
            m2976T();
        }
        if (this.f5459v0) {
            this.f5459v0 = false;
            int i6 = this.f5456s0;
            if (i6 == 0 || i6 == 1) {
                c1269c.m2948d(c1314c.f5485i, this.f5510Y);
                c1269c.m2948d(c1314c3.f5485i, this.f5510Y);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    c1269c.m2948d(c1314c2.f5485i, this.f5511Z);
                    c1269c.m2948d(c1314c4.f5485i, this.f5511Z);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.f5637r0; i7++) {
            C1315d c1315d = this.f5636q0[i7];
            if ((this.f5457t0 || c1315d.mo2979c()) && ((((i3 = this.f5456s0) == 0 || i3 == 1) && c1315d.f5543p0[0] == 3 && c1315d.f5494I.f5482f != null && c1315d.f5496K.f5482f != null) || ((i3 == 2 || i3 == 3) && c1315d.f5543p0[1] == 3 && c1315d.f5495J.f5482f != null && c1315d.f5497L.f5482f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c1314c.m2986g() || c1314c3.m2986g();
        boolean z5 = c1314c2.m2986g() || c1314c4.m2986g();
        int i8 = (z3 || !(((i2 = this.f5456s0) == 0 && z4) || ((i2 == 2 && z5) || ((i2 == 1 && z4) || (i2 == 3 && z5))))) ? 4 : 5;
        int i9 = 0;
        while (i9 < this.f5637r0) {
            C1315d c1315d2 = this.f5636q0[i9];
            if (this.f5457t0 || c1315d2.mo2979c()) {
                C1272f c1272fM2955k = c1269c.m2955k(c1315d2.f5502Q[this.f5456s0]);
                int i10 = this.f5456s0;
                C1314c c1314c7 = c1315d2.f5502Q[i10];
                c1314c7.f5485i = c1272fM2955k;
                C1314c c1314c8 = c1314c7.f5482f;
                int i11 = (c1314c8 == null || c1314c8.f5480d != this) ? 0 : c1314c7.f5483g;
                if (i10 == 0 || i10 == i4) {
                    C1272f c1272f = c1314c6.f5485i;
                    int i12 = this.f5458u0 - i11;
                    C1268b c1268bM2956l = c1269c.m2956l();
                    C1272f c1272fM2957m = c1269c.m2957m();
                    c1272fM2957m.f5181d = 0;
                    c1268bM2956l.m2937c(c1272f, c1272fM2955k, c1272fM2957m, i12);
                    c1269c.m2947c(c1268bM2956l);
                } else {
                    C1272f c1272f2 = c1314c6.f5485i;
                    int i13 = this.f5458u0 + i11;
                    C1268b c1268bM2956l2 = c1269c.m2956l();
                    C1272f c1272fM2957m2 = c1269c.m2957m();
                    c1272fM2957m2.f5181d = 0;
                    c1268bM2956l2.m2936b(c1272f2, c1272fM2955k, c1272fM2957m2, i13);
                    c1269c.m2947c(c1268bM2956l2);
                }
                c1269c.m2949e(c1314c6.f5485i, c1272fM2955k, this.f5458u0 + i11, i8);
            }
            i9++;
            i4 = 2;
        }
        int i14 = this.f5456s0;
        if (i14 == 0) {
            c1269c.m2949e(c1314c3.f5485i, c1314c.f5485i, 0, 8);
            c1269c.m2949e(c1314c.f5485i, this.f5505T.f5496K.f5485i, 0, 4);
            c1269c.m2949e(c1314c.f5485i, this.f5505T.f5494I.f5485i, 0, 0);
            return;
        }
        if (i14 == 1) {
            c1269c.m2949e(c1314c.f5485i, c1314c3.f5485i, 0, 8);
            c1269c.m2949e(c1314c.f5485i, this.f5505T.f5494I.f5485i, 0, 4);
            c1269c.m2949e(c1314c.f5485i, this.f5505T.f5496K.f5485i, 0, 0);
        } else if (i14 == 2) {
            c1269c.m2949e(c1314c4.f5485i, c1314c2.f5485i, 0, 8);
            c1269c.m2949e(c1314c2.f5485i, this.f5505T.f5497L.f5485i, 0, 4);
            c1269c.m2949e(c1314c2.f5485i, this.f5505T.f5495J.f5485i, 0, 0);
        } else if (i14 == 3) {
            c1269c.m2949e(c1314c2.f5485i, c1314c4.f5485i, 0, 8);
            c1269c.m2949e(c1314c2.f5485i, this.f5505T.f5495J.f5485i, 0, 4);
            c1269c.m2949e(c1314c2.f5485i, this.f5505T.f5497L.f5485i, 0, 0);
        }
    }

    @Override // p129s.C1315d
    /* renamed from: c */
    public final boolean mo2979c() {
        return true;
    }

    @Override // p129s.C1315d
    public final String toString() {
        String strM237f = "[Barrier] " + this.f5527h0 + " {";
        for (int i2 = 0; i2 < this.f5637r0; i2++) {
            C1315d c1315d = this.f5636q0[i2];
            if (i2 > 0) {
                strM237f = AbstractC0075g.m237f(strM237f, ", ");
            }
            strM237f = strM237f + c1315d.f5527h0;
        }
        return AbstractC0075g.m237f(strM237f, "}");
    }
}
