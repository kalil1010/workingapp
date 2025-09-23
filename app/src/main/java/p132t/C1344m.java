package p132t;

import p124q.AbstractC1271e;
import p129s.AbstractC1320i;
import p129s.C1314c;
import p129s.C1315d;

/* renamed from: t.m */
/* loaded from: classes.dex */
public final class C1344m extends AbstractC1346o {

    /* renamed from: k */
    public C1337f f5689k;

    /* renamed from: l */
    public C1332a f5690l;

    @Override // p132t.InterfaceC1335d
    /* renamed from: a */
    public final void mo3068a(InterfaceC1335d interfaceC1335d) {
        float f;
        float f2;
        float f3;
        int i2;
        if (AbstractC1271e.m2966a(this.f5706j) == 3) {
            C1315d c1315d = this.f5698b;
            m3110l(c1315d.f5495J, c1315d.f5497L, 1);
            return;
        }
        C1338g c1338g = this.f5701e;
        if (c1338g.f5674c && !c1338g.f5681j && this.f5700d == 3) {
            C1315d c1315d2 = this.f5698b;
            int i3 = c1315d2.f5546s;
            if (i3 == 2) {
                C1315d c1315d3 = c1315d2.f5505T;
                if (c1315d3 != null) {
                    if (c1315d3.f5520e.f5701e.f5681j) {
                        c1338g.mo3085d((int) ((r5.f5678g * c1315d2.f5553z) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                C1338g c1338g2 = c1315d2.f5518d.f5701e;
                if (c1338g2.f5681j) {
                    int i4 = c1315d2.f5509X;
                    if (i4 == -1) {
                        f = c1338g2.f5678g;
                        f2 = c1315d2.f5508W;
                    } else if (i4 == 0) {
                        f3 = c1338g2.f5678g * c1315d2.f5508W;
                        i2 = (int) (f3 + 0.5f);
                        c1338g.mo3085d(i2);
                    } else if (i4 != 1) {
                        i2 = 0;
                        c1338g.mo3085d(i2);
                    } else {
                        f = c1338g2.f5678g;
                        f2 = c1315d2.f5508W;
                    }
                    f3 = f / f2;
                    i2 = (int) (f3 + 0.5f);
                    c1338g.mo3085d(i2);
                }
            }
        }
        C1337f c1337f = this.f5704h;
        if (c1337f.f5674c) {
            C1337f c1337f2 = this.f5705i;
            if (c1337f2.f5674c) {
                if (c1337f.f5681j && c1337f2.f5681j && c1338g.f5681j) {
                    return;
                }
                if (!c1338g.f5681j && this.f5700d == 3) {
                    C1315d c1315d4 = this.f5698b;
                    if (c1315d4.f5545r == 0 && !c1315d4.m3029y()) {
                        C1337f c1337f3 = (C1337f) c1337f.f5683l.get(0);
                        C1337f c1337f4 = (C1337f) c1337f2.f5683l.get(0);
                        int i5 = c1337f3.f5678g + c1337f.f5677f;
                        int i6 = c1337f4.f5678g + c1337f2.f5677f;
                        c1337f.mo3085d(i5);
                        c1337f2.mo3085d(i6);
                        c1338g.mo3085d(i6 - i5);
                        return;
                    }
                }
                if (!c1338g.f5681j && this.f5700d == 3 && this.f5697a == 1 && c1337f.f5683l.size() > 0 && c1337f2.f5683l.size() > 0) {
                    C1337f c1337f5 = (C1337f) c1337f.f5683l.get(0);
                    int i7 = (((C1337f) c1337f2.f5683l.get(0)).f5678g + c1337f2.f5677f) - (c1337f5.f5678g + c1337f.f5677f);
                    int i8 = c1338g.f5684m;
                    if (i7 < i8) {
                        c1338g.mo3085d(i7);
                    } else {
                        c1338g.mo3085d(i8);
                    }
                }
                if (c1338g.f5681j && c1337f.f5683l.size() > 0 && c1337f2.f5683l.size() > 0) {
                    C1337f c1337f6 = (C1337f) c1337f.f5683l.get(0);
                    C1337f c1337f7 = (C1337f) c1337f2.f5683l.get(0);
                    int i9 = c1337f6.f5678g;
                    int i10 = c1337f.f5677f + i9;
                    int i11 = c1337f7.f5678g;
                    int i12 = c1337f2.f5677f + i11;
                    float f4 = this.f5698b.f5521e0;
                    if (c1337f6 == c1337f7) {
                        f4 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    c1337f.mo3085d((int) ((((i11 - i9) - c1338g.f5678g) * f4) + i9 + 0.5f));
                    c1337f2.mo3085d(c1337f.f5678g + c1338g.f5678g);
                }
            }
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: d */
    public final void mo3069d() {
        C1315d c1315d;
        C1315d c1315d2;
        C1315d c1315d3;
        C1315d c1315d4;
        C1315d c1315d5 = this.f5698b;
        boolean z2 = c1315d5.f5512a;
        C1338g c1338g = this.f5701e;
        if (z2) {
            c1338g.mo3085d(c1315d5.m3017k());
        }
        boolean z3 = c1338g.f5681j;
        C1337f c1337f = this.f5705i;
        C1337f c1337f2 = this.f5704h;
        if (!z3) {
            C1315d c1315d6 = this.f5698b;
            this.f5700d = c1315d6.f5543p0[1];
            if (c1315d6.f5490E) {
                this.f5690l = new C1332a(this);
            }
            int i2 = this.f5700d;
            if (i2 != 3) {
                if (i2 == 4 && (c1315d4 = this.f5698b.f5505T) != null && c1315d4.f5543p0[1] == 1) {
                    int iM3017k = (c1315d4.m3017k() - this.f5698b.f5495J.m2984e()) - this.f5698b.f5497L.m2984e();
                    AbstractC1346o.m3105b(c1337f2, c1315d4.f5520e.f5704h, this.f5698b.f5495J.m2984e());
                    AbstractC1346o.m3105b(c1337f, c1315d4.f5520e.f5705i, -this.f5698b.f5497L.m2984e());
                    c1338g.mo3085d(iM3017k);
                    return;
                }
                if (i2 == 1) {
                    c1338g.mo3085d(this.f5698b.m3017k());
                }
            }
        } else if (this.f5700d == 4 && (c1315d2 = (c1315d = this.f5698b).f5505T) != null && c1315d2.f5543p0[1] == 1) {
            AbstractC1346o.m3105b(c1337f2, c1315d2.f5520e.f5704h, c1315d.f5495J.m2984e());
            AbstractC1346o.m3105b(c1337f, c1315d2.f5520e.f5705i, -this.f5698b.f5497L.m2984e());
            return;
        }
        boolean z4 = c1338g.f5681j;
        C1337f c1337f3 = this.f5689k;
        if (z4) {
            C1315d c1315d7 = this.f5698b;
            if (c1315d7.f5512a) {
                C1314c[] c1314cArr = c1315d7.f5502Q;
                C1314c c1314c = c1314cArr[2];
                C1314c c1314c2 = c1314c.f5482f;
                if (c1314c2 != null && c1314cArr[3].f5482f != null) {
                    if (c1315d7.m3029y()) {
                        c1337f2.f5677f = this.f5698b.f5502Q[2].m2984e();
                        c1337f.f5677f = -this.f5698b.f5502Q[3].m2984e();
                    } else {
                        C1337f c1337fM3106h = AbstractC1346o.m3106h(this.f5698b.f5502Q[2]);
                        if (c1337fM3106h != null) {
                            AbstractC1346o.m3105b(c1337f2, c1337fM3106h, this.f5698b.f5502Q[2].m2984e());
                        }
                        C1337f c1337fM3106h2 = AbstractC1346o.m3106h(this.f5698b.f5502Q[3]);
                        if (c1337fM3106h2 != null) {
                            AbstractC1346o.m3105b(c1337f, c1337fM3106h2, -this.f5698b.f5502Q[3].m2984e());
                        }
                        c1337f2.f5673b = true;
                        c1337f.f5673b = true;
                    }
                    C1315d c1315d8 = this.f5698b;
                    if (c1315d8.f5490E) {
                        AbstractC1346o.m3105b(c1337f3, c1337f2, c1315d8.f5513a0);
                        return;
                    }
                    return;
                }
                if (c1314c2 != null) {
                    C1337f c1337fM3106h3 = AbstractC1346o.m3106h(c1314c);
                    if (c1337fM3106h3 != null) {
                        AbstractC1346o.m3105b(c1337f2, c1337fM3106h3, this.f5698b.f5502Q[2].m2984e());
                        AbstractC1346o.m3105b(c1337f, c1337f2, c1338g.f5678g);
                        C1315d c1315d9 = this.f5698b;
                        if (c1315d9.f5490E) {
                            AbstractC1346o.m3105b(c1337f3, c1337f2, c1315d9.f5513a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1314c c1314c3 = c1314cArr[3];
                if (c1314c3.f5482f != null) {
                    C1337f c1337fM3106h4 = AbstractC1346o.m3106h(c1314c3);
                    if (c1337fM3106h4 != null) {
                        AbstractC1346o.m3105b(c1337f, c1337fM3106h4, -this.f5698b.f5502Q[3].m2984e());
                        AbstractC1346o.m3105b(c1337f2, c1337f, -c1338g.f5678g);
                    }
                    C1315d c1315d10 = this.f5698b;
                    if (c1315d10.f5490E) {
                        AbstractC1346o.m3105b(c1337f3, c1337f2, c1315d10.f5513a0);
                        return;
                    }
                    return;
                }
                C1314c c1314c4 = c1314cArr[4];
                if (c1314c4.f5482f != null) {
                    C1337f c1337fM3106h5 = AbstractC1346o.m3106h(c1314c4);
                    if (c1337fM3106h5 != null) {
                        AbstractC1346o.m3105b(c1337f3, c1337fM3106h5, 0);
                        AbstractC1346o.m3105b(c1337f2, c1337f3, -this.f5698b.f5513a0);
                        AbstractC1346o.m3105b(c1337f, c1337f2, c1338g.f5678g);
                        return;
                    }
                    return;
                }
                if ((c1315d7 instanceof AbstractC1320i) || c1315d7.f5505T == null || c1315d7.mo3015i(7).f5482f != null) {
                    return;
                }
                C1315d c1315d11 = this.f5698b;
                AbstractC1346o.m3105b(c1337f2, c1315d11.f5505T.f5520e.f5704h, c1315d11.m3023s());
                AbstractC1346o.m3105b(c1337f, c1337f2, c1338g.f5678g);
                C1315d c1315d12 = this.f5698b;
                if (c1315d12.f5490E) {
                    AbstractC1346o.m3105b(c1337f3, c1337f2, c1315d12.f5513a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f5700d != 3) {
            c1338g.m3083b(this);
        } else {
            C1315d c1315d13 = this.f5698b;
            int i3 = c1315d13.f5546s;
            if (i3 == 2) {
                C1315d c1315d14 = c1315d13.f5505T;
                if (c1315d14 != null) {
                    C1338g c1338g2 = c1315d14.f5520e.f5701e;
                    c1338g.f5683l.add(c1338g2);
                    c1338g2.f5682k.add(c1338g);
                    c1338g.f5673b = true;
                    c1338g.f5682k.add(c1337f2);
                    c1338g.f5682k.add(c1337f);
                }
            } else if (i3 == 3 && !c1315d13.m3029y()) {
                C1315d c1315d15 = this.f5698b;
                if (c1315d15.f5545r != 3) {
                    C1338g c1338g3 = c1315d15.f5518d.f5701e;
                    c1338g.f5683l.add(c1338g3);
                    c1338g3.f5682k.add(c1338g);
                    c1338g.f5673b = true;
                    c1338g.f5682k.add(c1337f2);
                    c1338g.f5682k.add(c1337f);
                }
            }
        }
        C1315d c1315d16 = this.f5698b;
        C1314c[] c1314cArr2 = c1315d16.f5502Q;
        C1314c c1314c5 = c1314cArr2[2];
        C1314c c1314c6 = c1314c5.f5482f;
        if (c1314c6 != null && c1314cArr2[3].f5482f != null) {
            if (c1315d16.m3029y()) {
                c1337f2.f5677f = this.f5698b.f5502Q[2].m2984e();
                c1337f.f5677f = -this.f5698b.f5502Q[3].m2984e();
            } else {
                C1337f c1337fM3106h6 = AbstractC1346o.m3106h(this.f5698b.f5502Q[2]);
                C1337f c1337fM3106h7 = AbstractC1346o.m3106h(this.f5698b.f5502Q[3]);
                if (c1337fM3106h6 != null) {
                    c1337fM3106h6.m3083b(this);
                }
                if (c1337fM3106h7 != null) {
                    c1337fM3106h7.m3083b(this);
                }
                this.f5706j = 4;
            }
            if (this.f5698b.f5490E) {
                m3108c(c1337f3, c1337f2, 1, this.f5690l);
            }
        } else if (c1314c6 != null) {
            C1337f c1337fM3106h8 = AbstractC1346o.m3106h(c1314c5);
            if (c1337fM3106h8 != null) {
                AbstractC1346o.m3105b(c1337f2, c1337fM3106h8, this.f5698b.f5502Q[2].m2984e());
                m3108c(c1337f, c1337f2, 1, c1338g);
                if (this.f5698b.f5490E) {
                    m3108c(c1337f3, c1337f2, 1, this.f5690l);
                }
                if (this.f5700d == 3) {
                    C1315d c1315d17 = this.f5698b;
                    if (c1315d17.f5508W > 0.0f) {
                        C1342k c1342k = c1315d17.f5518d;
                        if (c1342k.f5700d == 3) {
                            c1342k.f5701e.f5682k.add(c1338g);
                            c1338g.f5683l.add(this.f5698b.f5518d.f5701e);
                            c1338g.f5672a = this;
                        }
                    }
                }
            }
        } else {
            C1314c c1314c7 = c1314cArr2[3];
            if (c1314c7.f5482f != null) {
                C1337f c1337fM3106h9 = AbstractC1346o.m3106h(c1314c7);
                if (c1337fM3106h9 != null) {
                    AbstractC1346o.m3105b(c1337f, c1337fM3106h9, -this.f5698b.f5502Q[3].m2984e());
                    m3108c(c1337f2, c1337f, -1, c1338g);
                    if (this.f5698b.f5490E) {
                        m3108c(c1337f3, c1337f2, 1, this.f5690l);
                    }
                }
            } else {
                C1314c c1314c8 = c1314cArr2[4];
                if (c1314c8.f5482f != null) {
                    C1337f c1337fM3106h10 = AbstractC1346o.m3106h(c1314c8);
                    if (c1337fM3106h10 != null) {
                        AbstractC1346o.m3105b(c1337f3, c1337fM3106h10, 0);
                        m3108c(c1337f2, c1337f3, -1, this.f5690l);
                        m3108c(c1337f, c1337f2, 1, c1338g);
                    }
                } else if (!(c1315d16 instanceof AbstractC1320i) && (c1315d3 = c1315d16.f5505T) != null) {
                    AbstractC1346o.m3105b(c1337f2, c1315d3.f5520e.f5704h, c1315d16.m3023s());
                    m3108c(c1337f, c1337f2, 1, c1338g);
                    if (this.f5698b.f5490E) {
                        m3108c(c1337f3, c1337f2, 1, this.f5690l);
                    }
                    if (this.f5700d == 3) {
                        C1315d c1315d18 = this.f5698b;
                        if (c1315d18.f5508W > 0.0f) {
                            C1342k c1342k2 = c1315d18.f5518d;
                            if (c1342k2.f5700d == 3) {
                                c1342k2.f5701e.f5682k.add(c1338g);
                                c1338g.f5683l.add(this.f5698b.f5518d.f5701e);
                                c1338g.f5672a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c1338g.f5683l.size() == 0) {
            c1338g.f5674c = true;
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: e */
    public final void mo3070e() {
        C1337f c1337f = this.f5704h;
        if (c1337f.f5681j) {
            this.f5698b.f5511Z = c1337f.f5678g;
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: f */
    public final void mo3071f() {
        this.f5699c = null;
        this.f5704h.m3084c();
        this.f5705i.m3084c();
        this.f5689k.m3084c();
        this.f5701e.m3084c();
        this.f5703g = false;
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: k */
    public final boolean mo3073k() {
        return this.f5700d != 3 || this.f5698b.f5546s == 0;
    }

    /* renamed from: m */
    public final void m3101m() {
        this.f5703g = false;
        C1337f c1337f = this.f5704h;
        c1337f.m3084c();
        c1337f.f5681j = false;
        C1337f c1337f2 = this.f5705i;
        c1337f2.m3084c();
        c1337f2.f5681j = false;
        C1337f c1337f3 = this.f5689k;
        c1337f3.m3084c();
        c1337f3.f5681j = false;
        this.f5701e.f5681j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f5698b.f5527h0;
    }
}
