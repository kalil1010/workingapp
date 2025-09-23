package p124q;

import java.util.Arrays;
import p002A1.C0019a;
import p035M0.C0369B;

/* renamed from: q.d */
/* loaded from: classes.dex */
public final class C1270d extends C1268b {

    /* renamed from: f */
    public C1272f[] f5173f;

    /* renamed from: g */
    public C1272f[] f5174g;

    /* renamed from: h */
    public int f5175h;

    /* renamed from: i */
    public C0019a f5176i;

    @Override // p124q.C1268b
    /* renamed from: d */
    public final C1272f mo2938d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f5175h; i3++) {
            C1272f[] c1272fArr = this.f5173f;
            C1272f c1272f = c1272fArr[i3];
            if (!zArr[c1272f.f5179b]) {
                C0019a c0019a = this.f5176i;
                c0019a.f47c = c1272f;
                int i4 = 8;
                if (i2 == -1) {
                    while (i4 >= 0) {
                        float f = ((C1272f) c0019a.f47c).f5185h[i4];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i2 = i3;
                                break;
                            }
                            i4--;
                        }
                    }
                } else {
                    C1272f c1272f2 = c1272fArr[i2];
                    while (true) {
                        if (i4 >= 0) {
                            float f2 = c1272f2.f5185h[i4];
                            float f3 = ((C1272f) c0019a.f47c).f5185h[i4];
                            if (f3 == f2) {
                                i4--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f5173f[i2];
    }

    @Override // p124q.C1268b
    /* renamed from: e */
    public final boolean mo2939e() {
        return this.f5175h == 0;
    }

    @Override // p124q.C1268b
    /* renamed from: i */
    public final void mo2943i(C1269c c1269c, C1268b c1268b, boolean z2) {
        C1272f c1272f = c1268b.f5151a;
        if (c1272f == null) {
            return;
        }
        C1267a c1267a = c1268b.f5154d;
        int iM2930d = c1267a.m2930d();
        for (int i2 = 0; i2 < iM2930d; i2++) {
            C1272f c1272fM2931e = c1267a.m2931e(i2);
            float fM2932f = c1267a.m2932f(i2);
            C0019a c0019a = this.f5176i;
            c0019a.f47c = c1272fM2931e;
            boolean z3 = c1272fM2931e.f5178a;
            float[] fArr = c1272f.f5185h;
            if (z3) {
                boolean z4 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr2 = ((C1272f) c0019a.f47c).f5185h;
                    float f = (fArr[i3] * fM2932f) + fArr2[i3];
                    fArr2[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C1272f) c0019a.f47c).f5185h[i3] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C1270d) c0019a.f46b).m2965k((C1272f) c0019a.f47c);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = fArr[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM2932f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C1272f) c0019a.f47c).f5185h[i4] = f3;
                    } else {
                        ((C1272f) c0019a.f47c).f5185h[i4] = 0.0f;
                    }
                }
                m2964j(c1272fM2931e);
            }
            this.f5152b = (c1268b.f5152b * fM2932f) + this.f5152b;
        }
        m2965k(c1272f);
    }

    /* renamed from: j */
    public final void m2964j(C1272f c1272f) {
        int i2;
        int i3 = this.f5175h + 1;
        C1272f[] c1272fArr = this.f5173f;
        if (i3 > c1272fArr.length) {
            C1272f[] c1272fArr2 = (C1272f[]) Arrays.copyOf(c1272fArr, c1272fArr.length * 2);
            this.f5173f = c1272fArr2;
            this.f5174g = (C1272f[]) Arrays.copyOf(c1272fArr2, c1272fArr2.length * 2);
        }
        C1272f[] c1272fArr3 = this.f5173f;
        int i4 = this.f5175h;
        c1272fArr3[i4] = c1272f;
        int i5 = i4 + 1;
        this.f5175h = i5;
        if (i5 > 1 && c1272fArr3[i4].f5179b > c1272f.f5179b) {
            int i6 = 0;
            while (true) {
                i2 = this.f5175h;
                if (i6 >= i2) {
                    break;
                }
                this.f5174g[i6] = this.f5173f[i6];
                i6++;
            }
            Arrays.sort(this.f5174g, 0, i2, new C0369B(3));
            for (int i7 = 0; i7 < this.f5175h; i7++) {
                this.f5173f[i7] = this.f5174g[i7];
            }
        }
        c1272f.f5178a = true;
        c1272f.m2968a(this);
    }

    /* renamed from: k */
    public final void m2965k(C1272f c1272f) {
        int i2 = 0;
        while (i2 < this.f5175h) {
            if (this.f5173f[i2] == c1272f) {
                while (true) {
                    int i3 = this.f5175h;
                    if (i2 >= i3 - 1) {
                        this.f5175h = i3 - 1;
                        c1272f.f5178a = false;
                        return;
                    } else {
                        C1272f[] c1272fArr = this.f5173f;
                        int i4 = i2 + 1;
                        c1272fArr[i2] = c1272fArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // p124q.C1268b
    public final String toString() {
        String str = " goal -> (" + this.f5152b + ") : ";
        for (int i2 = 0; i2 < this.f5175h; i2++) {
            C1272f c1272f = this.f5173f[i2];
            C0019a c0019a = this.f5176i;
            c0019a.f47c = c1272f;
            str = str + c0019a + " ";
        }
        return str;
    }
}
