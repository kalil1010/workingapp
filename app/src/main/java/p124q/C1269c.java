package p124q;

import java.util.Arrays;
import p002A1.C0019a;
import p002A1.C0027i;
import p025J.C0214a;
import p129s.C1314c;

/* renamed from: q.c */
/* loaded from: classes.dex */
public final class C1269c {

    /* renamed from: p */
    public static boolean f5156p = false;

    /* renamed from: q */
    public static int f5157q = 1000;

    /* renamed from: c */
    public final C1270d f5160c;

    /* renamed from: f */
    public C1268b[] f5163f;

    /* renamed from: l */
    public final C0027i f5169l;

    /* renamed from: o */
    public C1268b f5172o;

    /* renamed from: a */
    public boolean f5158a = false;

    /* renamed from: b */
    public int f5159b = 0;

    /* renamed from: d */
    public int f5161d = 32;

    /* renamed from: e */
    public int f5162e = 32;

    /* renamed from: g */
    public boolean f5164g = false;

    /* renamed from: h */
    public boolean[] f5165h = new boolean[32];

    /* renamed from: i */
    public int f5166i = 1;

    /* renamed from: j */
    public int f5167j = 0;

    /* renamed from: k */
    public int f5168k = 32;

    /* renamed from: m */
    public C1272f[] f5170m = new C1272f[f5157q];

    /* renamed from: n */
    public int f5171n = 0;

    public C1269c() {
        this.f5163f = null;
        this.f5163f = new C1268b[32];
        m2962s();
        C0027i c0027i = new C0027i(10);
        c0027i.f65b = new C0214a();
        c0027i.f66c = new C0214a();
        c0027i.f67d = new C1272f[32];
        this.f5169l = c0027i;
        C1270d c1270d = new C1270d(c0027i);
        c1270d.f5173f = new C1272f[128];
        c1270d.f5174g = new C1272f[128];
        c1270d.f5175h = 0;
        c1270d.f5176i = new C0019a(22, c1270d);
        this.f5160c = c1270d;
        this.f5172o = new C1268b(c0027i);
    }

    /* renamed from: n */
    public static int m2944n(Object obj) {
        C1272f c1272f = ((C1314c) obj).f5485i;
        if (c1272f != null) {
            return (int) (c1272f.f5182e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* renamed from: a */
    public final C1272f m2945a(int i2) {
        C0214a c0214a = (C0214a) this.f5169l.f66c;
        int i3 = c0214a.f780b;
        C1272f c1272f = null;
        if (i3 > 0) {
            int i4 = i3 - 1;
            ?? r3 = c0214a.f779a;
            ?? r4 = r3[i4];
            r3[i4] = 0;
            c0214a.f780b = i4;
            c1272f = r4;
        }
        C1272f c1272f2 = c1272f;
        if (c1272f2 == null) {
            c1272f2 = new C1272f(i2);
            c1272f2.f5189l = i2;
        } else {
            c1272f2.m2970c();
            c1272f2.f5189l = i2;
        }
        int i5 = this.f5171n;
        int i6 = f5157q;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            f5157q = i7;
            this.f5170m = (C1272f[]) Arrays.copyOf(this.f5170m, i7);
        }
        C1272f[] c1272fArr = this.f5170m;
        int i8 = this.f5171n;
        this.f5171n = i8 + 1;
        c1272fArr[i8] = c1272f2;
        return c1272f2;
    }

    /* renamed from: b */
    public final void m2946b(C1272f c1272f, C1272f c1272f2, int i2, float f, C1272f c1272f3, C1272f c1272f4, int i3, int i4) {
        C1268b c1268bM2956l = m2956l();
        if (c1272f2 == c1272f3) {
            c1268bM2956l.f5154d.m2933g(c1272f, 1.0f);
            c1268bM2956l.f5154d.m2933g(c1272f4, 1.0f);
            c1268bM2956l.f5154d.m2933g(c1272f2, -2.0f);
        } else if (f == 0.5f) {
            c1268bM2956l.f5154d.m2933g(c1272f, 1.0f);
            c1268bM2956l.f5154d.m2933g(c1272f2, -1.0f);
            c1268bM2956l.f5154d.m2933g(c1272f3, -1.0f);
            c1268bM2956l.f5154d.m2933g(c1272f4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                c1268bM2956l.f5152b = (-i2) + i3;
            }
        } else if (f <= 0.0f) {
            c1268bM2956l.f5154d.m2933g(c1272f, -1.0f);
            c1268bM2956l.f5154d.m2933g(c1272f2, 1.0f);
            c1268bM2956l.f5152b = i2;
        } else if (f >= 1.0f) {
            c1268bM2956l.f5154d.m2933g(c1272f4, -1.0f);
            c1268bM2956l.f5154d.m2933g(c1272f3, 1.0f);
            c1268bM2956l.f5152b = -i3;
        } else {
            float f2 = 1.0f - f;
            c1268bM2956l.f5154d.m2933g(c1272f, f2 * 1.0f);
            c1268bM2956l.f5154d.m2933g(c1272f2, f2 * (-1.0f));
            c1268bM2956l.f5154d.m2933g(c1272f3, (-1.0f) * f);
            c1268bM2956l.f5154d.m2933g(c1272f4, 1.0f * f);
            if (i2 > 0 || i3 > 0) {
                c1268bM2956l.f5152b = (i3 * f) + ((-i2) * f2);
            }
        }
        if (i4 != 8) {
            c1268bM2956l.m2935a(this, i4);
        }
        m2947c(c1268bM2956l);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2947c(p124q.C1268b r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p124q.C1269c.m2947c(q.b):void");
    }

    /* renamed from: d */
    public final void m2948d(C1272f c1272f, int i2) {
        int i3 = c1272f.f5180c;
        if (i3 == -1) {
            c1272f.m2971d(this, i2);
            for (int i4 = 0; i4 < this.f5159b + 1; i4++) {
                C1272f c1272f2 = ((C1272f[]) this.f5169l.f67d)[i4];
            }
            return;
        }
        if (i3 == -1) {
            C1268b c1268bM2956l = m2956l();
            c1268bM2956l.f5151a = c1272f;
            float f = i2;
            c1272f.f5182e = f;
            c1268bM2956l.f5152b = f;
            c1268bM2956l.f5155e = true;
            m2947c(c1268bM2956l);
            return;
        }
        C1268b c1268b = this.f5163f[i3];
        if (c1268b.f5155e) {
            c1268b.f5152b = i2;
            return;
        }
        if (c1268b.f5154d.m2930d() == 0) {
            c1268b.f5155e = true;
            c1268b.f5152b = i2;
            return;
        }
        C1268b c1268bM2956l2 = m2956l();
        if (i2 < 0) {
            c1268bM2956l2.f5152b = i2 * (-1);
            c1268bM2956l2.f5154d.m2933g(c1272f, 1.0f);
        } else {
            c1268bM2956l2.f5152b = i2;
            c1268bM2956l2.f5154d.m2933g(c1272f, -1.0f);
        }
        m2947c(c1268bM2956l2);
    }

    /* renamed from: e */
    public final void m2949e(C1272f c1272f, C1272f c1272f2, int i2, int i3) {
        if (i3 == 8 && c1272f2.f5183f && c1272f.f5180c == -1) {
            c1272f.m2971d(this, c1272f2.f5182e + i2);
            return;
        }
        C1268b c1268bM2956l = m2956l();
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            c1268bM2956l.f5152b = i2;
        }
        if (z2) {
            c1268bM2956l.f5154d.m2933g(c1272f, 1.0f);
            c1268bM2956l.f5154d.m2933g(c1272f2, -1.0f);
        } else {
            c1268bM2956l.f5154d.m2933g(c1272f, -1.0f);
            c1268bM2956l.f5154d.m2933g(c1272f2, 1.0f);
        }
        if (i3 != 8) {
            c1268bM2956l.m2935a(this, i3);
        }
        m2947c(c1268bM2956l);
    }

    /* renamed from: f */
    public final void m2950f(C1272f c1272f, C1272f c1272f2, int i2, int i3) {
        C1268b c1268bM2956l = m2956l();
        C1272f c1272fM2957m = m2957m();
        c1272fM2957m.f5181d = 0;
        c1268bM2956l.m2936b(c1272f, c1272f2, c1272fM2957m, i2);
        if (i3 != 8) {
            c1268bM2956l.f5154d.m2933g(m2954j(i3), (int) (c1268bM2956l.f5154d.m2929c(c1272fM2957m) * (-1.0f)));
        }
        m2947c(c1268bM2956l);
    }

    /* renamed from: g */
    public final void m2951g(C1272f c1272f, C1272f c1272f2, int i2, int i3) {
        C1268b c1268bM2956l = m2956l();
        C1272f c1272fM2957m = m2957m();
        c1272fM2957m.f5181d = 0;
        c1268bM2956l.m2937c(c1272f, c1272f2, c1272fM2957m, i2);
        if (i3 != 8) {
            c1268bM2956l.f5154d.m2933g(m2954j(i3), (int) (c1268bM2956l.f5154d.m2929c(c1272fM2957m) * (-1.0f)));
        }
        m2947c(c1268bM2956l);
    }

    /* renamed from: h */
    public final void m2952h(C1268b c1268b) {
        int i2;
        if (c1268b.f5155e) {
            c1268b.f5151a.m2971d(this, c1268b.f5152b);
        } else {
            C1268b[] c1268bArr = this.f5163f;
            int i3 = this.f5167j;
            c1268bArr[i3] = c1268b;
            C1272f c1272f = c1268b.f5151a;
            c1272f.f5180c = i3;
            this.f5167j = i3 + 1;
            c1272f.m2972e(this, c1268b);
        }
        if (this.f5158a) {
            int i4 = 0;
            while (i4 < this.f5167j) {
                if (this.f5163f[i4] == null) {
                    System.out.println("WTF");
                }
                C1268b c1268b2 = this.f5163f[i4];
                if (c1268b2 != null && c1268b2.f5155e) {
                    c1268b2.f5151a.m2971d(this, c1268b2.f5152b);
                    ((C0214a) this.f5169l.f65b).m565b(c1268b2);
                    this.f5163f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f5167j;
                        if (i5 >= i2) {
                            break;
                        }
                        C1268b[] c1268bArr2 = this.f5163f;
                        int i7 = i5 - 1;
                        C1268b c1268b3 = c1268bArr2[i5];
                        c1268bArr2[i7] = c1268b3;
                        C1272f c1272f2 = c1268b3.f5151a;
                        if (c1272f2.f5180c == i5) {
                            c1272f2.f5180c = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f5163f[i6] = null;
                    }
                    this.f5167j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f5158a = false;
        }
    }

    /* renamed from: i */
    public final void m2953i() {
        for (int i2 = 0; i2 < this.f5167j; i2++) {
            C1268b c1268b = this.f5163f[i2];
            c1268b.f5151a.f5182e = c1268b.f5152b;
        }
    }

    /* renamed from: j */
    public final C1272f m2954j(int i2) {
        if (this.f5166i + 1 >= this.f5162e) {
            m2958o();
        }
        C1272f c1272fM2945a = m2945a(4);
        int i3 = this.f5159b + 1;
        this.f5159b = i3;
        this.f5166i++;
        c1272fM2945a.f5179b = i3;
        c1272fM2945a.f5181d = i2;
        ((C1272f[]) this.f5169l.f67d)[i3] = c1272fM2945a;
        C1270d c1270d = this.f5160c;
        c1270d.f5176i.f47c = c1272fM2945a;
        float[] fArr = c1272fM2945a.f5185h;
        Arrays.fill(fArr, 0.0f);
        fArr[c1272fM2945a.f5181d] = 1.0f;
        c1270d.m2964j(c1272fM2945a);
        return c1272fM2945a;
    }

    /* renamed from: k */
    public final C1272f m2955k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f5166i + 1 >= this.f5162e) {
            m2958o();
        }
        if (!(obj instanceof C1314c)) {
            return null;
        }
        C1314c c1314c = (C1314c) obj;
        C1272f c1272f = c1314c.f5485i;
        if (c1272f == null) {
            c1314c.m2990k();
            c1272f = c1314c.f5485i;
        }
        int i2 = c1272f.f5179b;
        C0027i c0027i = this.f5169l;
        if (i2 != -1 && i2 <= this.f5159b && ((C1272f[]) c0027i.f67d)[i2] != null) {
            return c1272f;
        }
        if (i2 != -1) {
            c1272f.m2970c();
        }
        int i3 = this.f5159b + 1;
        this.f5159b = i3;
        this.f5166i++;
        c1272f.f5179b = i3;
        c1272f.f5189l = 1;
        ((C1272f[]) c0027i.f67d)[i3] = c1272f;
        return c1272f;
    }

    /* renamed from: l */
    public final C1268b m2956l() {
        Object obj;
        C0027i c0027i = this.f5169l;
        C0214a c0214a = (C0214a) c0027i.f65b;
        int i2 = c0214a.f780b;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = c0214a.f779a;
            obj = objArr[i3];
            objArr[i3] = null;
            c0214a.f780b = i3;
        } else {
            obj = null;
        }
        C1268b c1268b = (C1268b) obj;
        if (c1268b == null) {
            return new C1268b(c0027i);
        }
        c1268b.f5151a = null;
        c1268b.f5154d.m2928b();
        c1268b.f5152b = 0.0f;
        c1268b.f5155e = false;
        return c1268b;
    }

    /* renamed from: m */
    public final C1272f m2957m() {
        if (this.f5166i + 1 >= this.f5162e) {
            m2958o();
        }
        C1272f c1272fM2945a = m2945a(3);
        int i2 = this.f5159b + 1;
        this.f5159b = i2;
        this.f5166i++;
        c1272fM2945a.f5179b = i2;
        ((C1272f[]) this.f5169l.f67d)[i2] = c1272fM2945a;
        return c1272fM2945a;
    }

    /* renamed from: o */
    public final void m2958o() {
        int i2 = this.f5161d * 2;
        this.f5161d = i2;
        this.f5163f = (C1268b[]) Arrays.copyOf(this.f5163f, i2);
        C0027i c0027i = this.f5169l;
        c0027i.f67d = (C1272f[]) Arrays.copyOf((C1272f[]) c0027i.f67d, this.f5161d);
        int i3 = this.f5161d;
        this.f5165h = new boolean[i3];
        this.f5162e = i3;
        this.f5168k = i3;
    }

    /* renamed from: p */
    public final void m2959p() {
        C1270d c1270d = this.f5160c;
        if (c1270d.mo2939e()) {
            m2953i();
            return;
        }
        if (!this.f5164g) {
            m2960q(c1270d);
            return;
        }
        for (int i2 = 0; i2 < this.f5167j; i2++) {
            if (!this.f5163f[i2].f5155e) {
                m2960q(c1270d);
                return;
            }
        }
        m2953i();
    }

    /* renamed from: q */
    public final void m2960q(C1270d c1270d) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f5167j) {
                break;
            }
            C1268b c1268b = this.f5163f[i2];
            int i3 = 1;
            if (c1268b.f5151a.f5189l != 1) {
                float f = 0.0f;
                if (c1268b.f5152b < 0.0f) {
                    boolean z2 = false;
                    int i4 = 0;
                    while (!z2) {
                        i4 += i3;
                        float f2 = Float.MAX_VALUE;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < this.f5167j) {
                            C1268b c1268b2 = this.f5163f[i7];
                            if (c1268b2.f5151a.f5189l != i3 && !c1268b2.f5155e && c1268b2.f5152b < f) {
                                int iM2930d = c1268b2.f5154d.m2930d();
                                int i9 = 0;
                                while (i9 < iM2930d) {
                                    C1272f c1272fM2931e = c1268b2.f5154d.m2931e(i9);
                                    float fM2929c = c1268b2.f5154d.m2929c(c1272fM2931e);
                                    if (fM2929c > f) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f3 = c1272fM2931e.f5184g[i10] / fM2929c;
                                            if ((f3 < f2 && i10 == i8) || i10 > i8) {
                                                i8 = i10;
                                                i6 = c1272fM2931e.f5179b;
                                                i5 = i7;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i9++;
                                    f = 0.0f;
                                }
                            }
                            i7++;
                            f = 0.0f;
                            i3 = 1;
                        }
                        if (i5 != -1) {
                            C1268b c1268b3 = this.f5163f[i5];
                            c1268b3.f5151a.f5180c = -1;
                            c1268b3.m2941g(((C1272f[]) this.f5169l.f67d)[i6]);
                            C1272f c1272f = c1268b3.f5151a;
                            c1272f.f5180c = i5;
                            c1272f.m2972e(this, c1268b3);
                        } else {
                            z2 = true;
                        }
                        if (i4 > this.f5166i / 2) {
                            z2 = true;
                        }
                        f = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        m2961r(c1270d);
        m2953i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2961r(p124q.C1268b r17) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p124q.C1269c.m2961r(q.b):void");
    }

    /* renamed from: s */
    public final void m2962s() {
        for (int i2 = 0; i2 < this.f5167j; i2++) {
            C1268b c1268b = this.f5163f[i2];
            if (c1268b != null) {
                ((C0214a) this.f5169l.f65b).m565b(c1268b);
            }
            this.f5163f[i2] = null;
        }
    }

    /* renamed from: t */
    public final void m2963t() {
        C0027i c0027i;
        int i2 = 0;
        while (true) {
            c0027i = this.f5169l;
            C1272f[] c1272fArr = (C1272f[]) c0027i.f67d;
            if (i2 >= c1272fArr.length) {
                break;
            }
            C1272f c1272f = c1272fArr[i2];
            if (c1272f != null) {
                c1272f.m2970c();
            }
            i2++;
        }
        C0214a c0214a = (C0214a) c0027i.f66c;
        C1272f[] c1272fArr2 = this.f5170m;
        int length = this.f5171n;
        c0214a.getClass();
        if (length > c1272fArr2.length) {
            length = c1272fArr2.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            C1272f c1272f2 = c1272fArr2[i3];
            int i4 = c0214a.f780b;
            Object[] objArr = c0214a.f779a;
            if (i4 < objArr.length) {
                objArr[i4] = c1272f2;
                c0214a.f780b = i4 + 1;
            }
        }
        this.f5171n = 0;
        Arrays.fill((C1272f[]) c0027i.f67d, (Object) null);
        this.f5159b = 0;
        C1270d c1270d = this.f5160c;
        c1270d.f5175h = 0;
        c1270d.f5152b = 0.0f;
        this.f5166i = 1;
        for (int i5 = 0; i5 < this.f5167j; i5++) {
            C1268b c1268b = this.f5163f[i5];
        }
        m2962s();
        this.f5167j = 0;
        this.f5172o = new C1268b(c0027i);
    }
}
