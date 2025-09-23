package p124q;

import java.util.Arrays;

/* renamed from: q.f */
/* loaded from: classes.dex */
public final class C1272f implements Comparable {

    /* renamed from: a */
    public boolean f5178a;

    /* renamed from: e */
    public float f5182e;

    /* renamed from: l */
    public int f5189l;

    /* renamed from: b */
    public int f5179b = -1;

    /* renamed from: c */
    public int f5180c = -1;

    /* renamed from: d */
    public int f5181d = 0;

    /* renamed from: f */
    public boolean f5183f = false;

    /* renamed from: g */
    public final float[] f5184g = new float[9];

    /* renamed from: h */
    public final float[] f5185h = new float[9];

    /* renamed from: i */
    public C1268b[] f5186i = new C1268b[16];

    /* renamed from: j */
    public int f5187j = 0;

    /* renamed from: k */
    public int f5188k = 0;

    public C1272f(int i2) {
        this.f5189l = i2;
    }

    /* renamed from: a */
    public final void m2968a(C1268b c1268b) {
        int i2 = 0;
        while (true) {
            int i3 = this.f5187j;
            if (i2 >= i3) {
                C1268b[] c1268bArr = this.f5186i;
                if (i3 >= c1268bArr.length) {
                    this.f5186i = (C1268b[]) Arrays.copyOf(c1268bArr, c1268bArr.length * 2);
                }
                C1268b[] c1268bArr2 = this.f5186i;
                int i4 = this.f5187j;
                c1268bArr2[i4] = c1268b;
                this.f5187j = i4 + 1;
                return;
            }
            if (this.f5186i[i2] == c1268b) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* renamed from: b */
    public final void m2969b(C1268b c1268b) {
        int i2 = this.f5187j;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f5186i[i3] == c1268b) {
                while (i3 < i2 - 1) {
                    C1268b[] c1268bArr = this.f5186i;
                    int i4 = i3 + 1;
                    c1268bArr[i3] = c1268bArr[i4];
                    i3 = i4;
                }
                this.f5187j--;
                return;
            }
            i3++;
        }
    }

    /* renamed from: c */
    public final void m2970c() {
        this.f5189l = 5;
        this.f5181d = 0;
        this.f5179b = -1;
        this.f5180c = -1;
        this.f5182e = 0.0f;
        this.f5183f = false;
        int i2 = this.f5187j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5186i[i3] = null;
        }
        this.f5187j = 0;
        this.f5188k = 0;
        this.f5178a = false;
        Arrays.fill(this.f5185h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5179b - ((C1272f) obj).f5179b;
    }

    /* renamed from: d */
    public final void m2971d(C1269c c1269c, float f) {
        this.f5182e = f;
        this.f5183f = true;
        int i2 = this.f5187j;
        this.f5180c = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5186i[i3].m2942h(c1269c, this, false);
        }
        this.f5187j = 0;
    }

    /* renamed from: e */
    public final void m2972e(C1269c c1269c, C1268b c1268b) {
        int i2 = this.f5187j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5186i[i3].mo2943i(c1269c, c1268b, false);
        }
        this.f5187j = 0;
    }

    public final String toString() {
        return "" + this.f5179b;
    }
}
