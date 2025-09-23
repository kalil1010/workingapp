package p129s;

/* renamed from: s.f */
/* loaded from: classes.dex */
public final class C1317f {

    /* renamed from: a */
    public int f5576a;

    /* renamed from: d */
    public C1314c f5579d;

    /* renamed from: e */
    public C1314c f5580e;

    /* renamed from: f */
    public C1314c f5581f;

    /* renamed from: g */
    public C1314c f5582g;

    /* renamed from: h */
    public int f5583h;

    /* renamed from: i */
    public int f5584i;

    /* renamed from: j */
    public int f5585j;

    /* renamed from: k */
    public int f5586k;

    /* renamed from: q */
    public int f5592q;

    /* renamed from: r */
    public final /* synthetic */ C1318g f5593r;

    /* renamed from: b */
    public C1315d f5577b = null;

    /* renamed from: c */
    public int f5578c = 0;

    /* renamed from: l */
    public int f5587l = 0;

    /* renamed from: m */
    public int f5588m = 0;

    /* renamed from: n */
    public int f5589n = 0;

    /* renamed from: o */
    public int f5590o = 0;

    /* renamed from: p */
    public int f5591p = 0;

    public C1317f(C1318g c1318g, int i2, C1314c c1314c, C1314c c1314c2, C1314c c1314c3, C1314c c1314c4, int i3) {
        this.f5593r = c1318g;
        this.f5576a = i2;
        this.f5579d = c1314c;
        this.f5580e = c1314c2;
        this.f5581f = c1314c3;
        this.f5582g = c1314c4;
        this.f5583h = c1318g.f5626w0;
        this.f5584i = c1318g.f5622s0;
        this.f5585j = c1318g.f5627x0;
        this.f5586k = c1318g.f5623t0;
        this.f5592q = i3;
    }

    /* renamed from: a */
    public final void m3037a(C1315d c1315d) {
        int i2 = this.f5576a;
        C1318g c1318g = this.f5593r;
        if (i2 == 0) {
            int iM3045U = c1318g.m3045U(c1315d, this.f5592q);
            if (c1315d.f5543p0[0] == 3) {
                this.f5591p++;
                iM3045U = 0;
            }
            this.f5587l = iM3045U + (c1315d.f5525g0 != 8 ? c1318g.f5609P0 : 0) + this.f5587l;
            int iM3044T = c1318g.m3044T(c1315d, this.f5592q);
            if (this.f5577b == null || this.f5578c < iM3044T) {
                this.f5577b = c1315d;
                this.f5578c = iM3044T;
                this.f5588m = iM3044T;
            }
        } else {
            int iM3045U2 = c1318g.m3045U(c1315d, this.f5592q);
            int iM3044T2 = c1318g.m3044T(c1315d, this.f5592q);
            if (c1315d.f5543p0[1] == 3) {
                this.f5591p++;
                iM3044T2 = 0;
            }
            this.f5588m = iM3044T2 + (c1315d.f5525g0 != 8 ? c1318g.f5610Q0 : 0) + this.f5588m;
            if (this.f5577b == null || this.f5578c < iM3045U2) {
                this.f5577b = c1315d;
                this.f5578c = iM3045U2;
                this.f5587l = iM3045U2;
            }
        }
        this.f5590o++;
    }

    /* renamed from: b */
    public final void m3038b(int i2, boolean z2, boolean z3) {
        C1318g c1318g;
        int i3;
        C1315d c1315d;
        boolean z4;
        char c3;
        float f;
        float f2;
        int i4;
        float f3;
        float f4;
        int i5;
        int i6 = this.f5590o;
        int i7 = 0;
        while (true) {
            c1318g = this.f5593r;
            if (i7 >= i6 || (i5 = this.f5589n + i7) >= c1318g.f5621b1) {
                break;
            }
            C1315d c1315d2 = c1318g.f5620a1[i5];
            if (c1315d2 != null) {
                c1315d2.m2997D();
            }
            i7++;
        }
        if (i6 == 0 || this.f5577b == null) {
            return;
        }
        boolean z5 = z3 && i2 == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.f5589n + (z2 ? (i6 - 1) - i10 : i10);
            if (i11 >= c1318g.f5621b1) {
                break;
            }
            C1315d c1315d3 = c1318g.f5620a1[i11];
            if (c1315d3 != null && c1315d3.f5525g0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        if (this.f5576a != 0) {
            boolean z6 = z5;
            C1315d c1315d4 = this.f5577b;
            c1315d4.f5529i0 = c1318g.f5597D0;
            int i12 = this.f5583h;
            if (i2 > 0) {
                i12 += c1318g.f5609P0;
            }
            C1314c c1314c = c1315d4.f5494I;
            C1314c c1314c2 = c1315d4.f5496K;
            if (z2) {
                c1314c2.m2980a(this.f5581f, i12);
                if (z3) {
                    c1314c.m2980a(this.f5579d, this.f5585j);
                }
                if (i2 > 0) {
                    this.f5581f.f5480d.f5494I.m2980a(c1314c2, 0);
                }
            } else {
                c1314c.m2980a(this.f5579d, i12);
                if (z3) {
                    c1314c2.m2980a(this.f5581f, this.f5585j);
                }
                if (i2 > 0) {
                    this.f5579d.f5480d.f5496K.m2980a(c1314c, 0);
                }
            }
            C1315d c1315d5 = null;
            for (int i13 = 0; i13 < i6; i13++) {
                int i14 = this.f5589n + i13;
                if (i14 >= c1318g.f5621b1) {
                    return;
                }
                C1315d c1315d6 = c1318g.f5620a1[i14];
                if (c1315d6 != null) {
                    C1314c c1314c3 = c1315d6.f5495J;
                    if (i13 == 0) {
                        c1315d6.m3012f(c1314c3, this.f5580e, this.f5584i);
                        int i15 = c1318g.f5598E0;
                        float f5 = c1318g.f5604K0;
                        if (this.f5589n == 0) {
                            int i16 = c1318g.f5600G0;
                            i3 = -1;
                            if (i16 != -1) {
                                f5 = c1318g.f5606M0;
                            }
                            i15 = i16;
                            c1315d6.f5531j0 = i15;
                            c1315d6.f5521e0 = f5;
                        } else {
                            i3 = -1;
                        }
                        if (z3 && (i16 = c1318g.f5602I0) != i3) {
                            f5 = c1318g.f5608O0;
                            i15 = i16;
                        }
                        c1315d6.f5531j0 = i15;
                        c1315d6.f5521e0 = f5;
                    }
                    if (i13 == i6 - 1) {
                        c1315d6.m3012f(c1315d6.f5497L, this.f5582g, this.f5586k);
                    }
                    if (c1315d5 != null) {
                        int i17 = c1318g.f5610Q0;
                        C1314c c1314c4 = c1315d5.f5497L;
                        c1314c3.m2980a(c1314c4, i17);
                        if (i13 == i8) {
                            int i18 = this.f5584i;
                            if (c1314c3.m2987h()) {
                                c1314c3.f5484h = i18;
                            }
                        }
                        c1314c4.m2980a(c1314c3, 0);
                        if (i13 == i9 + 1) {
                            int i19 = this.f5586k;
                            if (c1314c4.m2987h()) {
                                c1314c4.f5484h = i19;
                            }
                        }
                    }
                    if (c1315d6 != c1315d4) {
                        C1314c c1314c5 = c1315d6.f5496K;
                        C1314c c1314c6 = c1315d6.f5494I;
                        if (z2) {
                            int i20 = c1318g.f5611R0;
                            if (i20 == 0) {
                                c1314c5.m2980a(c1314c2, 0);
                            } else if (i20 == 1) {
                                c1314c6.m2980a(c1314c, 0);
                            } else if (i20 == 2) {
                                c1314c6.m2980a(c1314c, 0);
                                c1314c5.m2980a(c1314c2, 0);
                            }
                            c1315d5 = c1315d6;
                        } else {
                            int i21 = c1318g.f5611R0;
                            if (i21 == 0) {
                                c1314c6.m2980a(c1314c, 0);
                            } else if (i21 == 1) {
                                c1314c5.m2980a(c1314c2, 0);
                            } else if (i21 == 2) {
                                if (z6) {
                                    c1314c6.m2980a(this.f5579d, this.f5583h);
                                    c1314c5.m2980a(this.f5581f, this.f5585j);
                                } else {
                                    c1314c6.m2980a(c1314c, 0);
                                    c1314c5.m2980a(c1314c2, 0);
                                }
                            }
                            c1315d5 = c1315d6;
                        }
                    } else {
                        c1315d5 = c1315d6;
                    }
                }
            }
            return;
        }
        C1315d c1315d7 = this.f5577b;
        c1315d7.f5531j0 = c1318g.f5598E0;
        int i22 = this.f5584i;
        if (i2 > 0) {
            i22 += c1318g.f5610Q0;
        }
        C1314c c1314c7 = this.f5580e;
        C1314c c1314c8 = c1315d7.f5495J;
        c1314c8.m2980a(c1314c7, i22);
        C1314c c1314c9 = c1315d7.f5497L;
        if (z3) {
            c1314c9.m2980a(this.f5582g, this.f5586k);
        }
        if (i2 > 0) {
            this.f5580e.f5480d.f5497L.m2980a(c1314c8, 0);
        }
        if (c1318g.f5612S0 != 3 || c1315d7.f5490E) {
            c1315d = c1315d7;
        } else {
            for (int i23 = 0; i23 < i6; i23++) {
                int i24 = this.f5589n + (z2 ? (i6 - 1) - i23 : i23);
                if (i24 >= c1318g.f5621b1) {
                    break;
                }
                c1315d = c1318g.f5620a1[i24];
                if (c1315d.f5490E) {
                    break;
                }
            }
            c1315d = c1315d7;
        }
        int i25 = 0;
        C1315d c1315d8 = null;
        while (i25 < i6) {
            int i26 = z2 ? (i6 - 1) - i25 : i25;
            int i27 = this.f5589n + i26;
            if (i27 >= c1318g.f5621b1) {
                return;
            }
            C1315d c1315d9 = c1318g.f5620a1[i27];
            if (c1315d9 == null) {
                z4 = z5;
                c3 = 3;
            } else {
                C1314c c1314c10 = c1315d9.f5494I;
                if (i25 == 0) {
                    c1315d9.m3012f(c1314c10, this.f5579d, this.f5583h);
                }
                if (i26 == 0) {
                    int i28 = c1318g.f5597D0;
                    if (z2) {
                        f = 1.0f;
                        f2 = 1.0f - c1318g.f5603J0;
                    } else {
                        f = 1.0f;
                        f2 = c1318g.f5603J0;
                    }
                    if (this.f5589n == 0) {
                        i4 = c1318g.f5599F0;
                        z4 = z5;
                        if (i4 != -1) {
                            if (z2) {
                                f4 = c1318g.f5605L0;
                                f2 = f - f4;
                            } else {
                                f3 = c1318g.f5605L0;
                                f2 = f3;
                            }
                        }
                        c1315d9.f5529i0 = i4;
                        c1315d9.f5519d0 = f2;
                    } else {
                        z4 = z5;
                    }
                    if (!z3 || (i4 = c1318g.f5601H0) == -1) {
                        i4 = i28;
                        c1315d9.f5529i0 = i4;
                        c1315d9.f5519d0 = f2;
                    } else if (z2) {
                        f4 = c1318g.f5607N0;
                        f2 = f - f4;
                        c1315d9.f5529i0 = i4;
                        c1315d9.f5519d0 = f2;
                    } else {
                        f3 = c1318g.f5607N0;
                        f2 = f3;
                        c1315d9.f5529i0 = i4;
                        c1315d9.f5519d0 = f2;
                    }
                } else {
                    z4 = z5;
                }
                if (i25 == i6 - 1) {
                    c1315d9.m3012f(c1315d9.f5496K, this.f5581f, this.f5585j);
                }
                if (c1315d8 != null) {
                    int i29 = c1318g.f5609P0;
                    C1314c c1314c11 = c1315d8.f5496K;
                    c1314c10.m2980a(c1314c11, i29);
                    if (i25 == i8) {
                        int i30 = this.f5583h;
                        if (c1314c10.m2987h()) {
                            c1314c10.f5484h = i30;
                        }
                    }
                    c1314c11.m2980a(c1314c10, 0);
                    if (i25 == i9 + 1) {
                        int i31 = this.f5585j;
                        if (c1314c11.m2987h()) {
                            c1314c11.f5484h = i31;
                        }
                    }
                }
                if (c1315d9 != c1315d7) {
                    int i32 = c1318g.f5612S0;
                    c3 = 3;
                    if (i32 == 3 && c1315d.f5490E && c1315d9 != c1315d && c1315d9.f5490E) {
                        c1315d9.f5498M.m2980a(c1315d.f5498M, 0);
                    } else {
                        C1314c c1314c12 = c1315d9.f5495J;
                        if (i32 != 0) {
                            C1314c c1314c13 = c1315d9.f5497L;
                            if (i32 == 1) {
                                c1314c13.m2980a(c1314c9, 0);
                            } else if (z4) {
                                c1314c12.m2980a(this.f5580e, this.f5584i);
                                c1314c13.m2980a(this.f5582g, this.f5586k);
                            } else {
                                c1314c12.m2980a(c1314c8, 0);
                                c1314c13.m2980a(c1314c9, 0);
                            }
                        } else {
                            c1314c12.m2980a(c1314c8, 0);
                        }
                    }
                } else {
                    c3 = 3;
                }
                c1315d8 = c1315d9;
            }
            i25++;
            z5 = z4;
        }
    }

    /* renamed from: c */
    public final int m3039c() {
        return this.f5576a == 1 ? this.f5588m - this.f5593r.f5610Q0 : this.f5588m;
    }

    /* renamed from: d */
    public final int m3040d() {
        return this.f5576a == 0 ? this.f5587l - this.f5593r.f5609P0 : this.f5587l;
    }

    /* renamed from: e */
    public final void m3041e(int i2) {
        C1318g c1318g;
        int i3;
        int i4 = this.f5591p;
        if (i4 == 0) {
            return;
        }
        int i5 = this.f5590o;
        int i6 = i2 / i4;
        int i7 = 0;
        while (true) {
            c1318g = this.f5593r;
            if (i7 >= i5 || (i3 = this.f5589n + i7) >= c1318g.f5621b1) {
                break;
            }
            C1315d c1315d = c1318g.f5620a1[i3];
            if (this.f5576a == 0) {
                if (c1315d != null) {
                    int[] iArr = c1315d.f5543p0;
                    if (iArr[0] == 3 && c1315d.f5545r == 0) {
                        c1318g.m3046V(1, i6, iArr[1], c1315d.m3017k(), c1315d);
                    }
                }
            } else if (c1315d != null) {
                int[] iArr2 = c1315d.f5543p0;
                if (iArr2[1] == 3 && c1315d.f5546s == 0) {
                    int i8 = iArr2[0];
                    int i9 = i6;
                    c1318g.m3046V(i8, c1315d.m3021q(), 1, i9, c1315d);
                    i6 = i9;
                }
            }
            i7++;
        }
        this.f5587l = 0;
        this.f5588m = 0;
        this.f5577b = null;
        this.f5578c = 0;
        int i10 = this.f5590o;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f5589n + i11;
            if (i12 >= c1318g.f5621b1) {
                return;
            }
            C1315d c1315d2 = c1318g.f5620a1[i12];
            if (this.f5576a == 0) {
                int iM3021q = c1315d2.m3021q();
                int i13 = c1318g.f5609P0;
                if (c1315d2.f5525g0 == 8) {
                    i13 = 0;
                }
                this.f5587l = iM3021q + i13 + this.f5587l;
                int iM3044T = c1318g.m3044T(c1315d2, this.f5592q);
                if (this.f5577b == null || this.f5578c < iM3044T) {
                    this.f5577b = c1315d2;
                    this.f5578c = iM3044T;
                    this.f5588m = iM3044T;
                }
            } else {
                int iM3045U = c1318g.m3045U(c1315d2, this.f5592q);
                int iM3044T2 = c1318g.m3044T(c1315d2, this.f5592q);
                int i14 = c1318g.f5610Q0;
                if (c1315d2.f5525g0 == 8) {
                    i14 = 0;
                }
                this.f5588m = iM3044T2 + i14 + this.f5588m;
                if (this.f5577b == null || this.f5578c < iM3045U) {
                    this.f5577b = c1315d2;
                    this.f5578c = iM3045U;
                    this.f5587l = iM3045U;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m3042f(int i2, C1314c c1314c, C1314c c1314c2, C1314c c1314c3, C1314c c1314c4, int i3, int i4, int i5, int i6, int i7) {
        this.f5576a = i2;
        this.f5579d = c1314c;
        this.f5580e = c1314c2;
        this.f5581f = c1314c3;
        this.f5582g = c1314c4;
        this.f5583h = i3;
        this.f5584i = i4;
        this.f5585j = i5;
        this.f5586k = i6;
        this.f5592q = i7;
    }
}
