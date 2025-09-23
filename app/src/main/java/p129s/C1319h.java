package p129s;

import java.util.ArrayList;
import p124q.AbstractC1271e;
import p124q.C1268b;
import p124q.C1269c;
import p124q.C1272f;

/* renamed from: s.h */
/* loaded from: classes.dex */
public final class C1319h extends C1315d {

    /* renamed from: q0 */
    public float f5630q0 = -1.0f;

    /* renamed from: r0 */
    public int f5631r0 = -1;

    /* renamed from: s0 */
    public int f5632s0 = -1;

    /* renamed from: t0 */
    public C1314c f5633t0 = this.f5495J;

    /* renamed from: u0 */
    public int f5634u0 = 0;

    /* renamed from: v0 */
    public boolean f5635v0;

    public C1319h() {
        this.f5503R.clear();
        this.f5503R.add(this.f5633t0);
        int length = this.f5502Q.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f5502Q[i2] = this.f5633t0;
        }
    }

    @Override // p129s.C1315d
    /* renamed from: A */
    public final boolean mo2974A() {
        return this.f5635v0;
    }

    @Override // p129s.C1315d
    /* renamed from: B */
    public final boolean mo2975B() {
        return this.f5635v0;
    }

    @Override // p129s.C1315d
    /* renamed from: Q */
    public final void mo3008Q(C1269c c1269c, boolean z2) {
        if (this.f5505T == null) {
            return;
        }
        C1314c c1314c = this.f5633t0;
        c1269c.getClass();
        int iM2944n = C1269c.m2944n(c1314c);
        if (this.f5634u0 == 1) {
            this.f5510Y = iM2944n;
            this.f5511Z = 0;
            m3003L(this.f5505T.m3017k());
            m3006O(0);
            return;
        }
        this.f5510Y = 0;
        this.f5511Z = iM2944n;
        m3006O(this.f5505T.m3021q());
        m3003L(0);
    }

    /* renamed from: R */
    public final void m3047R(int i2) {
        this.f5633t0.m2991l(i2);
        this.f5635v0 = true;
    }

    /* renamed from: S */
    public final void m3048S(int i2) {
        if (this.f5634u0 == i2) {
            return;
        }
        this.f5634u0 = i2;
        ArrayList arrayList = this.f5503R;
        arrayList.clear();
        if (this.f5634u0 == 1) {
            this.f5633t0 = this.f5494I;
        } else {
            this.f5633t0 = this.f5495J;
        }
        arrayList.add(this.f5633t0);
        C1314c[] c1314cArr = this.f5502Q;
        int length = c1314cArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            c1314cArr[i3] = this.f5633t0;
        }
    }

    @Override // p129s.C1315d
    /* renamed from: b */
    public final void mo2978b(C1269c c1269c, boolean z2) {
        C1316e c1316e = (C1316e) this.f5505T;
        if (c1316e == null) {
            return;
        }
        Object objMo3015i = c1316e.mo3015i(2);
        Object objMo3015i2 = c1316e.mo3015i(4);
        C1315d c1315d = this.f5505T;
        boolean z3 = c1315d != null && c1315d.f5543p0[0] == 2;
        if (this.f5634u0 == 0) {
            objMo3015i = c1316e.mo3015i(3);
            objMo3015i2 = c1316e.mo3015i(5);
            C1315d c1315d2 = this.f5505T;
            z3 = c1315d2 != null && c1315d2.f5543p0[1] == 2;
        }
        if (this.f5635v0) {
            C1314c c1314c = this.f5633t0;
            if (c1314c.f5479c) {
                C1272f c1272fM2955k = c1269c.m2955k(c1314c);
                c1269c.m2948d(c1272fM2955k, this.f5633t0.m2983d());
                if (this.f5631r0 != -1) {
                    if (z3) {
                        c1269c.m2950f(c1269c.m2955k(objMo3015i2), c1272fM2955k, 0, 5);
                    }
                } else if (this.f5632s0 != -1 && z3) {
                    C1272f c1272fM2955k2 = c1269c.m2955k(objMo3015i2);
                    c1269c.m2950f(c1272fM2955k, c1269c.m2955k(objMo3015i), 0, 5);
                    c1269c.m2950f(c1272fM2955k2, c1272fM2955k, 0, 5);
                }
                this.f5635v0 = false;
                return;
            }
        }
        if (this.f5631r0 != -1) {
            C1272f c1272fM2955k3 = c1269c.m2955k(this.f5633t0);
            c1269c.m2949e(c1272fM2955k3, c1269c.m2955k(objMo3015i), this.f5631r0, 8);
            if (z3) {
                c1269c.m2950f(c1269c.m2955k(objMo3015i2), c1272fM2955k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f5632s0 != -1) {
            C1272f c1272fM2955k4 = c1269c.m2955k(this.f5633t0);
            C1272f c1272fM2955k5 = c1269c.m2955k(objMo3015i2);
            c1269c.m2949e(c1272fM2955k4, c1272fM2955k5, -this.f5632s0, 8);
            if (z3) {
                c1269c.m2950f(c1272fM2955k4, c1269c.m2955k(objMo3015i), 0, 5);
                c1269c.m2950f(c1272fM2955k5, c1272fM2955k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f5630q0 != -1.0f) {
            C1272f c1272fM2955k6 = c1269c.m2955k(this.f5633t0);
            C1272f c1272fM2955k7 = c1269c.m2955k(objMo3015i2);
            float f = this.f5630q0;
            C1268b c1268bM2956l = c1269c.m2956l();
            c1268bM2956l.f5154d.m2933g(c1272fM2955k6, -1.0f);
            c1268bM2956l.f5154d.m2933g(c1272fM2955k7, f);
            c1269c.m2947c(c1268bM2956l);
        }
    }

    @Override // p129s.C1315d
    /* renamed from: c */
    public final boolean mo2979c() {
        return true;
    }

    @Override // p129s.C1315d
    /* renamed from: i */
    public final C1314c mo3015i(int i2) {
        int iM2966a = AbstractC1271e.m2966a(i2);
        if (iM2966a != 1) {
            if (iM2966a != 2) {
                if (iM2966a != 3) {
                    if (iM2966a != 4) {
                        return null;
                    }
                }
            }
            if (this.f5634u0 == 0) {
                return this.f5633t0;
            }
            return null;
        }
        if (this.f5634u0 == 1) {
            return this.f5633t0;
        }
        return null;
    }
}
