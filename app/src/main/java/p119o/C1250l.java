package p119o;

/* renamed from: o.l */
/* loaded from: classes.dex */
public final class C1250l implements Cloneable {

    /* renamed from: d */
    public static final Object f5059d = new Object();

    /* renamed from: a */
    public int[] f5060a;

    /* renamed from: b */
    public Object[] f5061b;

    /* renamed from: c */
    public int f5062c;

    public C1250l() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f5060a = new int[i5];
        this.f5061b = new Object[i5];
    }

    /* renamed from: a */
    public final void m2915a(int i2, Object obj) {
        int i3 = this.f5062c;
        if (i3 != 0 && i2 <= this.f5060a[i3 - 1]) {
            m2917c(i2, obj);
            return;
        }
        if (i3 >= this.f5060a.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.f5060a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f5061b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f5060a = iArr;
            this.f5061b = objArr;
        }
        this.f5060a[i3] = i2;
        this.f5061b[i3] = obj;
        this.f5062c = i3 + 1;
    }

    /* renamed from: b */
    public final Object m2916b(int i2, Integer num) {
        Object obj;
        int iM2895a = AbstractC1242d.m2895a(this.f5062c, i2, this.f5060a);
        return (iM2895a < 0 || (obj = this.f5061b[iM2895a]) == f5059d) ? num : obj;
    }

    /* renamed from: c */
    public final void m2917c(int i2, Object obj) {
        int iM2895a = AbstractC1242d.m2895a(this.f5062c, i2, this.f5060a);
        if (iM2895a >= 0) {
            this.f5061b[iM2895a] = obj;
            return;
        }
        int i3 = ~iM2895a;
        int i4 = this.f5062c;
        if (i3 < i4) {
            Object[] objArr = this.f5061b;
            if (objArr[i3] == f5059d) {
                this.f5060a[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f5060a.length) {
            int i5 = (i4 + 1) * 4;
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
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f5060a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f5061b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5060a = iArr;
            this.f5061b = objArr2;
        }
        int i9 = this.f5062c - i3;
        if (i9 != 0) {
            int[] iArr3 = this.f5060a;
            int i10 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i10, i9);
            Object[] objArr4 = this.f5061b;
            System.arraycopy(objArr4, i3, objArr4, i10, this.f5062c - i3);
        }
        this.f5060a[i3] = i2;
        this.f5061b[i3] = obj;
        this.f5062c++;
    }

    public final Object clone() {
        try {
            C1250l c1250l = (C1250l) super.clone();
            c1250l.f5060a = (int[]) this.f5060a.clone();
            c1250l.f5061b = (Object[]) this.f5061b.clone();
            return c1250l;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public final String toString() {
        int i2 = this.f5062c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f5062c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f5060a[i3]);
            sb.append('=');
            Object obj = this.f5061b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
