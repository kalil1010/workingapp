package p124q;

import java.util.Arrays;
import p002A1.C0027i;
import p006C.AbstractC0075g;

/* renamed from: q.a */
/* loaded from: classes.dex */
public final class C1267a {

    /* renamed from: b */
    public final C1268b f5142b;

    /* renamed from: c */
    public final C0027i f5143c;

    /* renamed from: a */
    public int f5141a = 0;

    /* renamed from: d */
    public int f5144d = 8;

    /* renamed from: e */
    public int[] f5145e = new int[8];

    /* renamed from: f */
    public int[] f5146f = new int[8];

    /* renamed from: g */
    public float[] f5147g = new float[8];

    /* renamed from: h */
    public int f5148h = -1;

    /* renamed from: i */
    public int f5149i = -1;

    /* renamed from: j */
    public boolean f5150j = false;

    public C1267a(C1268b c1268b, C0027i c0027i) {
        this.f5142b = c1268b;
        this.f5143c = c0027i;
    }

    /* renamed from: a */
    public final void m2927a(C1272f c1272f, float f, boolean z2) {
        if (f <= -0.001f || f >= 0.001f) {
            int i2 = this.f5148h;
            C1268b c1268b = this.f5142b;
            if (i2 == -1) {
                this.f5148h = 0;
                this.f5147g[0] = f;
                this.f5145e[0] = c1272f.f5179b;
                this.f5146f[0] = -1;
                c1272f.f5188k++;
                c1272f.m2968a(c1268b);
                this.f5141a++;
                if (this.f5150j) {
                    return;
                }
                int i3 = this.f5149i + 1;
                this.f5149i = i3;
                int[] iArr = this.f5145e;
                if (i3 >= iArr.length) {
                    this.f5150j = true;
                    this.f5149i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f5141a; i5++) {
                int i6 = this.f5145e[i2];
                int i7 = c1272f.f5179b;
                if (i6 == i7) {
                    float[] fArr = this.f5147g;
                    float f2 = fArr[i2] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i2] = f2;
                    if (f2 == 0.0f) {
                        if (i2 == this.f5148h) {
                            this.f5148h = this.f5146f[i2];
                        } else {
                            int[] iArr2 = this.f5146f;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            c1272f.m2969b(c1268b);
                        }
                        if (this.f5150j) {
                            this.f5149i = i2;
                        }
                        c1272f.f5188k--;
                        this.f5141a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f5146f[i2];
            }
            int length = this.f5149i;
            int i8 = length + 1;
            if (this.f5150j) {
                int[] iArr3 = this.f5145e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f5145e;
            if (length >= iArr4.length && this.f5141a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f5145e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f5145e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f5144d * 2;
                this.f5144d = i10;
                this.f5150j = false;
                this.f5149i = length - 1;
                this.f5147g = Arrays.copyOf(this.f5147g, i10);
                this.f5145e = Arrays.copyOf(this.f5145e, this.f5144d);
                this.f5146f = Arrays.copyOf(this.f5146f, this.f5144d);
            }
            this.f5145e[length] = c1272f.f5179b;
            this.f5147g[length] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f5146f;
                iArr7[length] = iArr7[i4];
                iArr7[i4] = length;
            } else {
                this.f5146f[length] = this.f5148h;
                this.f5148h = length;
            }
            c1272f.f5188k++;
            c1272f.m2968a(c1268b);
            this.f5141a++;
            if (!this.f5150j) {
                this.f5149i++;
            }
            int i11 = this.f5149i;
            int[] iArr8 = this.f5145e;
            if (i11 >= iArr8.length) {
                this.f5150j = true;
                this.f5149i = iArr8.length - 1;
            }
        }
    }

    /* renamed from: b */
    public final void m2928b() {
        int i2 = this.f5148h;
        for (int i3 = 0; i2 != -1 && i3 < this.f5141a; i3++) {
            C1272f c1272f = ((C1272f[]) this.f5143c.f67d)[this.f5145e[i2]];
            if (c1272f != null) {
                c1272f.m2969b(this.f5142b);
            }
            i2 = this.f5146f[i2];
        }
        this.f5148h = -1;
        this.f5149i = -1;
        this.f5150j = false;
        this.f5141a = 0;
    }

    /* renamed from: c */
    public final float m2929c(C1272f c1272f) {
        int i2 = this.f5148h;
        for (int i3 = 0; i2 != -1 && i3 < this.f5141a; i3++) {
            if (this.f5145e[i2] == c1272f.f5179b) {
                return this.f5147g[i2];
            }
            i2 = this.f5146f[i2];
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final int m2930d() {
        return this.f5141a;
    }

    /* renamed from: e */
    public final C1272f m2931e(int i2) {
        int i3 = this.f5148h;
        for (int i4 = 0; i3 != -1 && i4 < this.f5141a; i4++) {
            if (i4 == i2) {
                return ((C1272f[]) this.f5143c.f67d)[this.f5145e[i3]];
            }
            i3 = this.f5146f[i3];
        }
        return null;
    }

    /* renamed from: f */
    public final float m2932f(int i2) {
        int i3 = this.f5148h;
        for (int i4 = 0; i3 != -1 && i4 < this.f5141a; i4++) {
            if (i4 == i2) {
                return this.f5147g[i3];
            }
            i3 = this.f5146f[i3];
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final void m2933g(C1272f c1272f, float f) {
        if (f == 0.0f) {
            m2934h(c1272f, true);
            return;
        }
        int i2 = this.f5148h;
        C1268b c1268b = this.f5142b;
        if (i2 == -1) {
            this.f5148h = 0;
            this.f5147g[0] = f;
            this.f5145e[0] = c1272f.f5179b;
            this.f5146f[0] = -1;
            c1272f.f5188k++;
            c1272f.m2968a(c1268b);
            this.f5141a++;
            if (this.f5150j) {
                return;
            }
            int i3 = this.f5149i + 1;
            this.f5149i = i3;
            int[] iArr = this.f5145e;
            if (i3 >= iArr.length) {
                this.f5150j = true;
                this.f5149i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f5141a; i5++) {
            int i6 = this.f5145e[i2];
            int i7 = c1272f.f5179b;
            if (i6 == i7) {
                this.f5147g[i2] = f;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f5146f[i2];
        }
        int length = this.f5149i;
        int i8 = length + 1;
        if (this.f5150j) {
            int[] iArr2 = this.f5145e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i8;
        }
        int[] iArr3 = this.f5145e;
        if (length >= iArr3.length && this.f5141a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f5145e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f5145e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i10 = this.f5144d * 2;
            this.f5144d = i10;
            this.f5150j = false;
            this.f5149i = length - 1;
            this.f5147g = Arrays.copyOf(this.f5147g, i10);
            this.f5145e = Arrays.copyOf(this.f5145e, this.f5144d);
            this.f5146f = Arrays.copyOf(this.f5146f, this.f5144d);
        }
        this.f5145e[length] = c1272f.f5179b;
        this.f5147g[length] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f5146f;
            iArr6[length] = iArr6[i4];
            iArr6[i4] = length;
        } else {
            this.f5146f[length] = this.f5148h;
            this.f5148h = length;
        }
        c1272f.f5188k++;
        c1272f.m2968a(c1268b);
        int i11 = this.f5141a + 1;
        this.f5141a = i11;
        if (!this.f5150j) {
            this.f5149i++;
        }
        int[] iArr7 = this.f5145e;
        if (i11 >= iArr7.length) {
            this.f5150j = true;
        }
        if (this.f5149i >= iArr7.length) {
            this.f5150j = true;
            this.f5149i = iArr7.length - 1;
        }
    }

    /* renamed from: h */
    public final float m2934h(C1272f c1272f, boolean z2) {
        int i2 = this.f5148h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f5141a) {
            if (this.f5145e[i2] == c1272f.f5179b) {
                if (i2 == this.f5148h) {
                    this.f5148h = this.f5146f[i2];
                } else {
                    int[] iArr = this.f5146f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    c1272f.m2969b(this.f5142b);
                }
                c1272f.f5188k--;
                this.f5141a--;
                this.f5145e[i2] = -1;
                if (this.f5150j) {
                    this.f5149i = i2;
                }
                return this.f5147g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f5146f[i2];
        }
        return 0.0f;
    }

    public final String toString() {
        int i2 = this.f5148h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f5141a; i3++) {
            str = (AbstractC0075g.m237f(str, " -> ") + this.f5147g[i2] + " : ") + ((C1272f[]) this.f5143c.f67d)[this.f5145e[i2]];
            i2 = this.f5146f[i2];
        }
        return str;
    }
}
