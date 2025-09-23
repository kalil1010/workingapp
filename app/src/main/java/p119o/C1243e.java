package p119o;

/* renamed from: o.e */
/* loaded from: classes.dex */
public final class C1243e implements Cloneable {

    /* renamed from: e */
    public static final Object f5030e = new Object();

    /* renamed from: a */
    public boolean f5031a = false;

    /* renamed from: b */
    public long[] f5032b;

    /* renamed from: c */
    public Object[] f5033c;

    /* renamed from: d */
    public int f5034d;

    public C1243e() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f5032b = new long[i5];
        this.f5033c = new Object[i5];
    }

    /* renamed from: a */
    public final void m2897a() {
        int i2 = this.f5034d;
        Object[] objArr = this.f5033c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f5034d = 0;
        this.f5031a = false;
    }

    /* renamed from: b */
    public final void m2898b() {
        int i2 = this.f5034d;
        long[] jArr = this.f5032b;
        Object[] objArr = this.f5033c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f5030e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f5031a = false;
        this.f5034d = i3;
    }

    /* renamed from: c */
    public final Object m2899c(long j2, Long l2) {
        Object obj;
        int iM2896b = AbstractC1242d.m2896b(this.f5032b, this.f5034d, j2);
        return (iM2896b < 0 || (obj = this.f5033c[iM2896b]) == f5030e) ? l2 : obj;
    }

    public final Object clone() {
        try {
            C1243e c1243e = (C1243e) super.clone();
            c1243e.f5032b = (long[]) this.f5032b.clone();
            c1243e.f5033c = (Object[]) this.f5033c.clone();
            return c1243e;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: d */
    public final void m2900d(long j2, Object obj) {
        int iM2896b = AbstractC1242d.m2896b(this.f5032b, this.f5034d, j2);
        if (iM2896b >= 0) {
            this.f5033c[iM2896b] = obj;
            return;
        }
        int i2 = ~iM2896b;
        int i3 = this.f5034d;
        if (i2 < i3) {
            Object[] objArr = this.f5033c;
            if (objArr[i2] == f5030e) {
                this.f5032b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f5031a && i3 >= this.f5032b.length) {
            m2898b();
            i2 = ~AbstractC1242d.m2896b(this.f5032b, this.f5034d, j2);
        }
        int i4 = this.f5034d;
        if (i4 >= this.f5032b.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.f5032b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f5033c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5032b = jArr;
            this.f5033c = objArr2;
        }
        int i9 = this.f5034d - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f5032b;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f5033c;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f5034d - i2);
        }
        this.f5032b[i2] = j2;
        this.f5033c[i2] = obj;
        this.f5034d++;
    }

    /* renamed from: e */
    public final int m2901e() {
        if (this.f5031a) {
            m2898b();
        }
        return this.f5034d;
    }

    /* renamed from: f */
    public final Object m2902f(int i2) {
        if (this.f5031a) {
            m2898b();
        }
        return this.f5033c[i2];
    }

    public final String toString() {
        if (m2901e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5034d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5034d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f5031a) {
                m2898b();
            }
            sb.append(this.f5032b[i2]);
            sb.append('=');
            Object objM2902f = m2902f(i2);
            if (objM2902f != this) {
                sb.append(objM2902f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
