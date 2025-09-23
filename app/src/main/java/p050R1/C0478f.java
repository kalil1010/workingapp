package p050R1;

import java.io.Closeable;
import java.util.Arrays;
import p131s1.AbstractC1326c;

/* renamed from: R1.f */
/* loaded from: classes.dex */
public final class C0478f implements Closeable {

    /* renamed from: a */
    public C0479g f1472a;

    /* renamed from: b */
    public boolean f1473b;

    /* renamed from: c */
    public C0490r f1474c;

    /* renamed from: e */
    public byte[] f1476e;

    /* renamed from: d */
    public long f1475d = -1;

    /* renamed from: f */
    public int f1477f = -1;

    /* renamed from: g */
    public int f1478g = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!(this.f1472a != null)) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f1472a = null;
        this.f1474c = null;
        this.f1475d = -1L;
        this.f1476e = null;
        this.f1477f = -1;
        this.f1478g = -1;
    }

    /* renamed from: g */
    public final void m1164g(long j2) {
        C0479g c0479g = this.f1472a;
        if (c0479g == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f1473b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j3 = c0479g.f1480b;
        if (j2 <= j3) {
            if (j2 < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
            }
            long j4 = j3 - j2;
            while (true) {
                if (j4 <= 0) {
                    break;
                }
                C0490r c0490r = c0479g.f1479a;
                AbstractC1326c.m3059b(c0490r);
                C0490r c0490r2 = c0490r.f1510g;
                AbstractC1326c.m3059b(c0490r2);
                int i2 = c0490r2.f1506c;
                long j5 = i2 - c0490r2.f1505b;
                if (j5 > j4) {
                    c0490r2.f1506c = i2 - ((int) j4);
                    break;
                } else {
                    c0479g.f1479a = c0490r2.m1234a();
                    AbstractC0491s.m1238a(c0490r2);
                    j4 -= j5;
                }
            }
            this.f1474c = null;
            this.f1475d = j2;
            this.f1476e = null;
            this.f1477f = -1;
            this.f1478g = -1;
        } else if (j2 > j3) {
            long j6 = j2 - j3;
            int i3 = 1;
            boolean z2 = true;
            for (long j7 = 0; j6 > j7; j7 = 0) {
                C0490r c0490rM1189u = c0479g.m1189u(i3);
                int iMin = (int) Math.min(j6, 8192 - c0490rM1189u.f1506c);
                int i4 = c0490rM1189u.f1506c + iMin;
                c0490rM1189u.f1506c = i4;
                j6 -= iMin;
                if (z2) {
                    this.f1474c = c0490rM1189u;
                    this.f1475d = j3;
                    this.f1476e = c0490rM1189u.f1504a;
                    this.f1477f = i4 - iMin;
                    this.f1478g = i4;
                    z2 = false;
                }
                i3 = 1;
            }
        }
        c0479g.f1480b = j2;
    }

    /* renamed from: h */
    public final int m1165h(long j2) {
        C0479g c0479g = this.f1472a;
        if (c0479g == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j2 >= -1) {
            long j3 = c0479g.f1480b;
            if (j2 <= j3) {
                if (j2 == -1 || j2 == j3) {
                    this.f1474c = null;
                    this.f1475d = j2;
                    this.f1476e = null;
                    this.f1477f = -1;
                    this.f1478g = -1;
                    return -1;
                }
                C0490r c0490r = c0479g.f1479a;
                C0490r c0490r2 = this.f1474c;
                long j4 = 0;
                if (c0490r2 != null) {
                    long j5 = this.f1475d - (this.f1477f - c0490r2.f1505b);
                    if (j5 > j2) {
                        c0490r2 = c0490r;
                        c0490r = c0490r2;
                        j3 = j5;
                    } else {
                        j4 = j5;
                    }
                } else {
                    c0490r2 = c0490r;
                }
                if (j3 - j2 > j2 - j4) {
                    while (true) {
                        AbstractC1326c.m3059b(c0490r2);
                        long j6 = (c0490r2.f1506c - c0490r2.f1505b) + j4;
                        if (j2 < j6) {
                            break;
                        }
                        c0490r2 = c0490r2.f1509f;
                        j4 = j6;
                    }
                } else {
                    while (j3 > j2) {
                        AbstractC1326c.m3059b(c0490r);
                        c0490r = c0490r.f1510g;
                        AbstractC1326c.m3059b(c0490r);
                        j3 -= c0490r.f1506c - c0490r.f1505b;
                    }
                    c0490r2 = c0490r;
                    j4 = j3;
                }
                if (this.f1473b) {
                    AbstractC1326c.m3059b(c0490r2);
                    if (c0490r2.f1507d) {
                        byte[] bArr = c0490r2.f1504a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        AbstractC1326c.m3061d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                        C0490r c0490r3 = new C0490r(bArrCopyOf, c0490r2.f1505b, c0490r2.f1506c, false, true);
                        if (c0479g.f1479a == c0490r2) {
                            c0479g.f1479a = c0490r3;
                        }
                        c0490r2.m1235b(c0490r3);
                        C0490r c0490r4 = c0490r3.f1510g;
                        AbstractC1326c.m3059b(c0490r4);
                        c0490r4.m1234a();
                        c0490r2 = c0490r3;
                    }
                }
                this.f1474c = c0490r2;
                this.f1475d = j2;
                AbstractC1326c.m3059b(c0490r2);
                this.f1476e = c0490r2.f1504a;
                int i2 = c0490r2.f1505b + ((int) (j2 - j4));
                this.f1477f = i2;
                int i3 = c0490r2.f1506c;
                this.f1478g = i3;
                return i3 - i2;
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(c0479g.f1480b)}, 2)));
    }
}
