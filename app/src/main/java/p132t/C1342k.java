package p132t;

import p129s.AbstractC1320i;
import p129s.C1314c;
import p129s.C1315d;

/* renamed from: t.k */
/* loaded from: classes.dex */
public final class C1342k extends AbstractC1346o {

    /* renamed from: k */
    public static final int[] f5686k = new int[2];

    /* renamed from: m */
    public static void m3097m(int[] iArr, int i2, int i3, int i4, int i5, float f, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f) + 0.5f);
        int i10 = (int) ((i7 / f) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // p132t.InterfaceC1335d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3068a(p132t.InterfaceC1335d r24) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p132t.C1342k.mo3068a(t.d):void");
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: d */
    public final void mo3069d() {
        C1315d c1315d;
        C1315d c1315d2;
        int i2;
        C1315d c1315d3;
        C1315d c1315d4;
        int i3;
        C1315d c1315d5 = this.f5698b;
        boolean z2 = c1315d5.f5512a;
        C1338g c1338g = this.f5701e;
        if (z2) {
            c1338g.mo3085d(c1315d5.m3021q());
        }
        boolean z3 = c1338g.f5681j;
        C1337f c1337f = this.f5705i;
        C1337f c1337f2 = this.f5704h;
        if (!z3) {
            C1315d c1315d6 = this.f5698b;
            int i4 = c1315d6.f5543p0[0];
            this.f5700d = i4;
            if (i4 != 3) {
                if (i4 == 4 && (c1315d4 = c1315d6.f5505T) != null && ((i3 = c1315d4.f5543p0[0]) == 1 || i3 == 4)) {
                    int iM3021q = (c1315d4.m3021q() - this.f5698b.f5494I.m2984e()) - this.f5698b.f5496K.m2984e();
                    AbstractC1346o.m3105b(c1337f2, c1315d4.f5518d.f5704h, this.f5698b.f5494I.m2984e());
                    AbstractC1346o.m3105b(c1337f, c1315d4.f5518d.f5705i, -this.f5698b.f5496K.m2984e());
                    c1338g.mo3085d(iM3021q);
                    return;
                }
                if (i4 == 1) {
                    c1338g.mo3085d(c1315d6.m3021q());
                }
            }
        } else if (this.f5700d == 4 && (c1315d2 = (c1315d = this.f5698b).f5505T) != null && ((i2 = c1315d2.f5543p0[0]) == 1 || i2 == 4)) {
            AbstractC1346o.m3105b(c1337f2, c1315d2.f5518d.f5704h, c1315d.f5494I.m2984e());
            AbstractC1346o.m3105b(c1337f, c1315d2.f5518d.f5705i, -this.f5698b.f5496K.m2984e());
            return;
        }
        if (c1338g.f5681j) {
            C1315d c1315d7 = this.f5698b;
            if (c1315d7.f5512a) {
                C1314c[] c1314cArr = c1315d7.f5502Q;
                C1314c c1314c = c1314cArr[0];
                C1314c c1314c2 = c1314c.f5482f;
                if (c1314c2 != null && c1314cArr[1].f5482f != null) {
                    if (c1315d7.m3028x()) {
                        c1337f2.f5677f = this.f5698b.f5502Q[0].m2984e();
                        c1337f.f5677f = -this.f5698b.f5502Q[1].m2984e();
                        return;
                    }
                    C1337f c1337fM3106h = AbstractC1346o.m3106h(this.f5698b.f5502Q[0]);
                    if (c1337fM3106h != null) {
                        AbstractC1346o.m3105b(c1337f2, c1337fM3106h, this.f5698b.f5502Q[0].m2984e());
                    }
                    C1337f c1337fM3106h2 = AbstractC1346o.m3106h(this.f5698b.f5502Q[1]);
                    if (c1337fM3106h2 != null) {
                        AbstractC1346o.m3105b(c1337f, c1337fM3106h2, -this.f5698b.f5502Q[1].m2984e());
                    }
                    c1337f2.f5673b = true;
                    c1337f.f5673b = true;
                    return;
                }
                if (c1314c2 != null) {
                    C1337f c1337fM3106h3 = AbstractC1346o.m3106h(c1314c);
                    if (c1337fM3106h3 != null) {
                        AbstractC1346o.m3105b(c1337f2, c1337fM3106h3, this.f5698b.f5502Q[0].m2984e());
                        AbstractC1346o.m3105b(c1337f, c1337f2, c1338g.f5678g);
                        return;
                    }
                    return;
                }
                C1314c c1314c3 = c1314cArr[1];
                if (c1314c3.f5482f != null) {
                    C1337f c1337fM3106h4 = AbstractC1346o.m3106h(c1314c3);
                    if (c1337fM3106h4 != null) {
                        AbstractC1346o.m3105b(c1337f, c1337fM3106h4, -this.f5698b.f5502Q[1].m2984e());
                        AbstractC1346o.m3105b(c1337f2, c1337f, -c1338g.f5678g);
                        return;
                    }
                    return;
                }
                if ((c1315d7 instanceof AbstractC1320i) || c1315d7.f5505T == null || c1315d7.mo3015i(7).f5482f != null) {
                    return;
                }
                C1315d c1315d8 = this.f5698b;
                AbstractC1346o.m3105b(c1337f2, c1315d8.f5505T.f5518d.f5704h, c1315d8.m3022r());
                AbstractC1346o.m3105b(c1337f, c1337f2, c1338g.f5678g);
                return;
            }
        }
        if (this.f5700d == 3) {
            C1315d c1315d9 = this.f5698b;
            int i5 = c1315d9.f5545r;
            if (i5 == 2) {
                C1315d c1315d10 = c1315d9.f5505T;
                if (c1315d10 != null) {
                    C1338g c1338g2 = c1315d10.f5520e.f5701e;
                    c1338g.f5683l.add(c1338g2);
                    c1338g2.f5682k.add(c1338g);
                    c1338g.f5673b = true;
                    c1338g.f5682k.add(c1337f2);
                    c1338g.f5682k.add(c1337f);
                }
            } else if (i5 == 3) {
                if (c1315d9.f5546s == 3) {
                    c1337f2.f5672a = this;
                    c1337f.f5672a = this;
                    C1344m c1344m = c1315d9.f5520e;
                    c1344m.f5704h.f5672a = this;
                    c1344m.f5705i.f5672a = this;
                    c1338g.f5672a = this;
                    if (c1315d9.m3029y()) {
                        c1338g.f5683l.add(this.f5698b.f5520e.f5701e);
                        this.f5698b.f5520e.f5701e.f5682k.add(c1338g);
                        C1344m c1344m2 = this.f5698b.f5520e;
                        c1344m2.f5701e.f5672a = this;
                        c1338g.f5683l.add(c1344m2.f5704h);
                        c1338g.f5683l.add(this.f5698b.f5520e.f5705i);
                        this.f5698b.f5520e.f5704h.f5682k.add(c1338g);
                        this.f5698b.f5520e.f5705i.f5682k.add(c1338g);
                    } else if (this.f5698b.m3028x()) {
                        this.f5698b.f5520e.f5701e.f5683l.add(c1338g);
                        c1338g.f5682k.add(this.f5698b.f5520e.f5701e);
                    } else {
                        this.f5698b.f5520e.f5701e.f5683l.add(c1338g);
                    }
                } else {
                    C1338g c1338g3 = c1315d9.f5520e.f5701e;
                    c1338g.f5683l.add(c1338g3);
                    c1338g3.f5682k.add(c1338g);
                    this.f5698b.f5520e.f5704h.f5682k.add(c1338g);
                    this.f5698b.f5520e.f5705i.f5682k.add(c1338g);
                    c1338g.f5673b = true;
                    c1338g.f5682k.add(c1337f2);
                    c1338g.f5682k.add(c1337f);
                    c1337f2.f5683l.add(c1338g);
                    c1337f.f5683l.add(c1338g);
                }
            }
        }
        C1315d c1315d11 = this.f5698b;
        C1314c[] c1314cArr2 = c1315d11.f5502Q;
        C1314c c1314c4 = c1314cArr2[0];
        C1314c c1314c5 = c1314c4.f5482f;
        if (c1314c5 != null && c1314cArr2[1].f5482f != null) {
            if (c1315d11.m3028x()) {
                c1337f2.f5677f = this.f5698b.f5502Q[0].m2984e();
                c1337f.f5677f = -this.f5698b.f5502Q[1].m2984e();
                return;
            }
            C1337f c1337fM3106h5 = AbstractC1346o.m3106h(this.f5698b.f5502Q[0]);
            C1337f c1337fM3106h6 = AbstractC1346o.m3106h(this.f5698b.f5502Q[1]);
            if (c1337fM3106h5 != null) {
                c1337fM3106h5.m3083b(this);
            }
            if (c1337fM3106h6 != null) {
                c1337fM3106h6.m3083b(this);
            }
            this.f5706j = 4;
            return;
        }
        if (c1314c5 != null) {
            C1337f c1337fM3106h7 = AbstractC1346o.m3106h(c1314c4);
            if (c1337fM3106h7 != null) {
                AbstractC1346o.m3105b(c1337f2, c1337fM3106h7, this.f5698b.f5502Q[0].m2984e());
                m3108c(c1337f, c1337f2, 1, c1338g);
                return;
            }
            return;
        }
        C1314c c1314c6 = c1314cArr2[1];
        if (c1314c6.f5482f != null) {
            C1337f c1337fM3106h8 = AbstractC1346o.m3106h(c1314c6);
            if (c1337fM3106h8 != null) {
                AbstractC1346o.m3105b(c1337f, c1337fM3106h8, -this.f5698b.f5502Q[1].m2984e());
                m3108c(c1337f2, c1337f, -1, c1338g);
                return;
            }
            return;
        }
        if ((c1315d11 instanceof AbstractC1320i) || (c1315d3 = c1315d11.f5505T) == null) {
            return;
        }
        AbstractC1346o.m3105b(c1337f2, c1315d3.f5518d.f5704h, c1315d11.m3022r());
        m3108c(c1337f, c1337f2, 1, c1338g);
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: e */
    public final void mo3070e() {
        C1337f c1337f = this.f5704h;
        if (c1337f.f5681j) {
            this.f5698b.f5510Y = c1337f.f5678g;
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: f */
    public final void mo3071f() {
        this.f5699c = null;
        this.f5704h.m3084c();
        this.f5705i.m3084c();
        this.f5701e.m3084c();
        this.f5703g = false;
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: k */
    public final boolean mo3073k() {
        return this.f5700d != 3 || this.f5698b.f5545r == 0;
    }

    /* renamed from: n */
    public final void m3098n() {
        this.f5703g = false;
        C1337f c1337f = this.f5704h;
        c1337f.m3084c();
        c1337f.f5681j = false;
        C1337f c1337f2 = this.f5705i;
        c1337f2.m3084c();
        c1337f2.f5681j = false;
        this.f5701e.f5681j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f5698b.f5527h0;
    }
}
