package p140v1;

import java.util.Iterator;

/* renamed from: v1.a */
/* loaded from: classes.dex */
public class C1378a implements Iterable {

    /* renamed from: a */
    public final int f5989a;

    /* renamed from: b */
    public final int f5990b;

    /* renamed from: c */
    public final int f5991c;

    public C1378a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f5989a = i2;
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                int i6 = i2 % i4;
                int i7 = ((i5 < 0 ? i5 + i4 : i5) - (i6 < 0 ? i6 + i4 : i6)) % i4;
                i3 -= i7 < 0 ? i7 + i4 : i7;
            }
        } else {
            if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                int i10 = i3 % i8;
                int i11 = ((i9 < 0 ? i9 + i8 : i9) - (i10 < 0 ? i10 + i8 : i10)) % i8;
                i3 += i11 < 0 ? i11 + i8 : i11;
            }
        }
        this.f5990b = i3;
        this.f5991c = i4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1378a)) {
            return false;
        }
        if (isEmpty() && ((C1378a) obj).isEmpty()) {
            return true;
        }
        C1378a c1378a = (C1378a) obj;
        return this.f5989a == c1378a.f5989a && this.f5990b == c1378a.f5990b && this.f5991c == c1378a.f5991c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f5989a * 31) + this.f5990b) * 31) + this.f5991c;
    }

    public boolean isEmpty() {
        int i2 = this.f5991c;
        int i3 = this.f5990b;
        int i4 = this.f5989a;
        return i2 > 0 ? i4 > i3 : i4 < i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1379b(this.f5989a, this.f5990b, this.f5991c);
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.f5990b;
        int i3 = this.f5989a;
        int i4 = this.f5991c;
        if (i4 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i4);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i4);
        }
        return sb.toString();
    }
}
