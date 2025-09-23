package p050R1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p006C.AbstractC0075g;
import p033L1.AbstractC0356d;
import p053S1.AbstractC0500a;
import p053S1.AbstractC0501b;
import p110k1.AbstractC1206h;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1403a;

/* renamed from: R1.g */
/* loaded from: classes.dex */
public final class C0479g implements InterfaceC0481i, InterfaceC0480h, Cloneable, ByteChannel {

    /* renamed from: a */
    public C0490r f1479a;

    /* renamed from: b */
    public long f1480b;

    /* renamed from: A */
    public final void m1166A(long j2) {
        if (j2 == 0) {
            m1194z(48);
            return;
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        C0490r c0490rM1189u = m1189u(i2);
        int i3 = c0490rM1189u.f1506c;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            c0490rM1189u.f1504a[i4] = AbstractC0500a.f1534a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        c0490rM1189u.f1506c += i2;
        this.f1480b += i2;
    }

    /* renamed from: B */
    public final void m1167B(int i2) {
        C0490r c0490rM1189u = m1189u(4);
        int i3 = c0490rM1189u.f1506c;
        byte[] bArr = c0490rM1189u.f1504a;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i2 & 255);
        c0490rM1189u.f1506c = i3 + 4;
        this.f1480b += 4;
    }

    /* renamed from: C */
    public final void m1168C(int i2) {
        C0490r c0490rM1189u = m1189u(2);
        int i3 = c0490rM1189u.f1506c;
        byte[] bArr = c0490rM1189u.f1504a;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 1] = (byte) (i2 & 255);
        c0490rM1189u.f1506c = i3 + 2;
        this.f1480b += 2;
    }

    /* renamed from: D */
    public final void m1169D(String str) {
        AbstractC1326c.m3062e(str, "string");
        m1170E(str, 0, str.length());
    }

    /* renamed from: E */
    public final void m1170E(String str, int i2, int i3) {
        AbstractC1326c.m3062e(str, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0075g.m236e("beginIndex < 0: ", i2).toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (i3 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                C0490r c0490rM1189u = m1189u(1);
                int i4 = c0490rM1189u.f1506c - i2;
                int iMin = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                byte[] bArr = c0490rM1189u.f1504a;
                bArr[i2 + i4] = (byte) cCharAt;
                while (i5 < iMin) {
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i5 + i4] = (byte) cCharAt2;
                    i5++;
                }
                int i6 = c0490rM1189u.f1506c;
                int i7 = (i4 + i5) - i6;
                c0490rM1189u.f1506c = i6 + i7;
                this.f1480b += i7;
                i2 = i5;
            } else {
                if (cCharAt < 2048) {
                    C0490r c0490rM1189u2 = m1189u(2);
                    int i8 = c0490rM1189u2.f1506c;
                    byte[] bArr2 = c0490rM1189u2.f1504a;
                    bArr2[i8] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((cCharAt & '?') | 128);
                    c0490rM1189u2.f1506c = i8 + 2;
                    this.f1480b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    C0490r c0490rM1189u3 = m1189u(3);
                    int i9 = c0490rM1189u3.f1506c;
                    byte[] bArr3 = c0490rM1189u3.f1504a;
                    bArr3[i9] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt & '?') | 128);
                    c0490rM1189u3.f1506c = i9 + 3;
                    this.f1480b += 3;
                } else {
                    int i10 = i2 + 1;
                    char cCharAt3 = i10 < i3 ? str.charAt(i10) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        m1194z(63);
                        i2 = i10;
                    } else {
                        int i11 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C0490r c0490rM1189u4 = m1189u(4);
                        int i12 = c0490rM1189u4.f1506c;
                        byte[] bArr4 = c0490rM1189u4.f1504a;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        c0490rM1189u4.f1506c = i12 + 4;
                        this.f1480b += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    /* renamed from: F */
    public final void m1171F(int i2) {
        String str;
        int i3 = 0;
        if (i2 < 128) {
            m1194z(i2);
            return;
        }
        if (i2 < 2048) {
            C0490r c0490rM1189u = m1189u(2);
            int i4 = c0490rM1189u.f1506c;
            byte[] bArr = c0490rM1189u.f1504a;
            bArr[i4] = (byte) ((i2 >> 6) | 192);
            bArr[1 + i4] = (byte) ((i2 & 63) | 128);
            c0490rM1189u.f1506c = i4 + 2;
            this.f1480b += 2;
            return;
        }
        if (55296 <= i2 && 57343 >= i2) {
            m1194z(63);
            return;
        }
        if (i2 < 65536) {
            C0490r c0490rM1189u2 = m1189u(3);
            int i5 = c0490rM1189u2.f1506c;
            byte[] bArr2 = c0490rM1189u2.f1504a;
            bArr2[i5] = (byte) ((i2 >> 12) | 224);
            bArr2[1 + i5] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[2 + i5] = (byte) ((i2 & 63) | 128);
            c0490rM1189u2.f1506c = i5 + 3;
            this.f1480b += 3;
            return;
        }
        if (i2 <= 1114111) {
            C0490r c0490rM1189u3 = m1189u(4);
            int i6 = c0490rM1189u3.f1506c;
            byte[] bArr3 = c0490rM1189u3.f1504a;
            bArr3[i6] = (byte) ((i2 >> 18) | 240);
            bArr3[1 + i6] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[2 + i6] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[3 + i6] = (byte) ((i2 & 63) | 128);
            c0490rM1189u3.f1506c = i6 + 4;
            this.f1480b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i2 != 0) {
            char[] cArr = AbstractC0501b.f1535a;
            char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            str = new String(cArr2, i3, 8 - i3);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: a */
    public final C0496x mo485a() {
        return C0496x.f1516d;
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: b */
    public final long mo486b(C0479g c0479g, long j2) {
        AbstractC1326c.m3062e(c0479g, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f1480b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        c0479g.mo481f(this, j2);
        return j2;
    }

    @Override // p050R1.InterfaceC0481i
    /* renamed from: c */
    public final int mo1172c(C0487o c0487o) throws EOFException {
        AbstractC1326c.m3062e(c0487o, "options");
        int iM1242b = AbstractC0500a.m1242b(this, c0487o, false);
        if (iM1242b == -1) {
            return -1;
        }
        m1187s(c0487o.f1496a[iM1242b].mo1197c());
        return iM1242b;
    }

    public final Object clone() {
        C0479g c0479g = new C0479g();
        if (this.f1480b == 0) {
            return c0479g;
        }
        C0490r c0490r = this.f1479a;
        AbstractC1326c.m3059b(c0490r);
        C0490r c0490rM1236c = c0490r.m1236c();
        c0479g.f1479a = c0490rM1236c;
        c0490rM1236c.f1510g = c0490rM1236c;
        c0490rM1236c.f1509f = c0490rM1236c;
        for (C0490r c0490r2 = c0490r.f1509f; c0490r2 != c0490r; c0490r2 = c0490r2.f1509f) {
            C0490r c0490r3 = c0490rM1236c.f1510g;
            AbstractC1326c.m3059b(c0490r3);
            AbstractC1326c.m3059b(c0490r2);
            c0490r3.m1235b(c0490r2.m1236c());
        }
        c0479g.f1480b = this.f1480b;
        return c0479g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p050R1.InterfaceC0493u
    public final void close() {
    }

    @Override // p050R1.InterfaceC0480h
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC0480h mo1173d(String str) {
        m1169D(str);
        return this;
    }

    @Override // p050R1.InterfaceC0481i
    /* renamed from: e */
    public final String mo1174e(Charset charset) {
        return m1185q(this.f1480b, charset);
    }

    public final boolean equals(Object obj) {
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        boolean z3 = false;
        if (!(obj instanceof C0479g)) {
            return false;
        }
        long j2 = this.f1480b;
        C0479g c0479g = (C0479g) obj;
        if (j2 != c0479g.f1480b) {
            return false;
        }
        if (j2 == 0) {
            return true;
        }
        C0490r c0490r = this.f1479a;
        AbstractC1326c.m3059b(c0490r);
        C0490r c0490r2 = c0479g.f1479a;
        AbstractC1326c.m3059b(c0490r2);
        int i2 = c0490r.f1505b;
        int i3 = c0490r2.f1505b;
        long j3 = 0;
        while (j3 < this.f1480b) {
            long jMin = Math.min(c0490r.f1506c - i2, c0490r2.f1506c - i3);
            long j4 = 0;
            while (j4 < jMin) {
                int i4 = i2 + 1;
                boolean z4 = z2;
                byte b = c0490r.f1504a[i2];
                int i5 = i3 + 1;
                boolean z5 = z3;
                if (b != c0490r2.f1504a[i3]) {
                    return z5;
                }
                j4++;
                i3 = i5;
                i2 = i4;
                z2 = z4;
                z3 = z5;
            }
            boolean z6 = z2;
            boolean z7 = z3;
            if (i2 == c0490r.f1506c) {
                C0490r c0490r3 = c0490r.f1509f;
                AbstractC1326c.m3059b(c0490r3);
                i2 = c0490r3.f1505b;
                c0490r = c0490r3;
            }
            if (i3 == c0490r2.f1506c) {
                c0490r2 = c0490r2.f1509f;
                AbstractC1326c.m3059b(c0490r2);
                i3 = c0490r2.f1505b;
            }
            j3 += jMin;
            z2 = z6;
            z3 = z7;
        }
        return z2;
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: f */
    public final void mo481f(C0479g c0479g, long j2) {
        C0490r c0490rM1239b;
        AbstractC1326c.m3062e(c0479g, "source");
        if (c0479g == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0356d.m955e(c0479g.f1480b, 0L, j2);
        while (j2 > 0) {
            C0490r c0490r = c0479g.f1479a;
            AbstractC1326c.m3059b(c0490r);
            int i2 = c0490r.f1506c;
            C0490r c0490r2 = c0479g.f1479a;
            AbstractC1326c.m3059b(c0490r2);
            long j3 = i2 - c0490r2.f1505b;
            int i3 = 0;
            if (j2 < j3) {
                C0490r c0490r3 = this.f1479a;
                C0490r c0490r4 = c0490r3 != null ? c0490r3.f1510g : null;
                if (c0490r4 != null && c0490r4.f1508e) {
                    if ((c0490r4.f1506c + j2) - (c0490r4.f1507d ? 0 : c0490r4.f1505b) <= 8192) {
                        C0490r c0490r5 = c0479g.f1479a;
                        AbstractC1326c.m3059b(c0490r5);
                        c0490r5.m1237d(c0490r4, (int) j2);
                        c0479g.f1480b -= j2;
                        this.f1480b += j2;
                        return;
                    }
                }
                C0490r c0490r6 = c0479g.f1479a;
                AbstractC1326c.m3059b(c0490r6);
                int i4 = (int) j2;
                if (i4 <= 0 || i4 > c0490r6.f1506c - c0490r6.f1505b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    c0490rM1239b = c0490r6.m1236c();
                } else {
                    c0490rM1239b = AbstractC0491s.m1239b();
                    int i5 = c0490r6.f1505b;
                    AbstractC1206h.m2842m0(0, i5, i5 + i4, c0490r6.f1504a, c0490rM1239b.f1504a);
                }
                c0490rM1239b.f1506c = c0490rM1239b.f1505b + i4;
                c0490r6.f1505b += i4;
                C0490r c0490r7 = c0490r6.f1510g;
                AbstractC1326c.m3059b(c0490r7);
                c0490r7.m1235b(c0490rM1239b);
                c0479g.f1479a = c0490rM1239b;
            }
            C0490r c0490r8 = c0479g.f1479a;
            AbstractC1326c.m3059b(c0490r8);
            long j4 = c0490r8.f1506c - c0490r8.f1505b;
            c0479g.f1479a = c0490r8.m1234a();
            C0490r c0490r9 = this.f1479a;
            if (c0490r9 == null) {
                this.f1479a = c0490r8;
                c0490r8.f1510g = c0490r8;
                c0490r8.f1509f = c0490r8;
            } else {
                C0490r c0490r10 = c0490r9.f1510g;
                AbstractC1326c.m3059b(c0490r10);
                c0490r10.m1235b(c0490r8);
                C0490r c0490r11 = c0490r8.f1510g;
                if (c0490r11 == c0490r8) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC1326c.m3059b(c0490r11);
                if (c0490r11.f1508e) {
                    int i6 = c0490r8.f1506c - c0490r8.f1505b;
                    C0490r c0490r12 = c0490r8.f1510g;
                    AbstractC1326c.m3059b(c0490r12);
                    int i7 = 8192 - c0490r12.f1506c;
                    C0490r c0490r13 = c0490r8.f1510g;
                    AbstractC1326c.m3059b(c0490r13);
                    if (!c0490r13.f1507d) {
                        C0490r c0490r14 = c0490r8.f1510g;
                        AbstractC1326c.m3059b(c0490r14);
                        i3 = c0490r14.f1505b;
                    }
                    if (i6 <= i7 + i3) {
                        C0490r c0490r15 = c0490r8.f1510g;
                        AbstractC1326c.m3059b(c0490r15);
                        c0490r8.m1237d(c0490r15, i6);
                        c0490r8.m1234a();
                        AbstractC0491s.m1238a(c0490r8);
                    }
                }
            }
            c0479g.f1480b -= j4;
            this.f1480b += j4;
            j2 -= j4;
        }
    }

    @Override // p050R1.InterfaceC0493u, java.io.Flushable
    public final void flush() {
    }

    /* renamed from: g */
    public final boolean m1175g() {
        return this.f1480b == 0;
    }

    /* renamed from: h */
    public final byte m1176h(long j2) {
        AbstractC0356d.m955e(this.f1480b, j2, 1L);
        C0490r c0490r = this.f1479a;
        if (c0490r == null) {
            AbstractC1326c.m3059b(null);
            throw null;
        }
        long j3 = this.f1480b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                c0490r = c0490r.f1510g;
                AbstractC1326c.m3059b(c0490r);
                j3 -= c0490r.f1506c - c0490r.f1505b;
            }
            return c0490r.f1504a[(int) ((c0490r.f1505b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i2 = c0490r.f1506c;
            int i3 = c0490r.f1505b;
            long j5 = (i2 - i3) + j4;
            if (j5 > j2) {
                return c0490r.f1504a[(int) ((i3 + j2) - j4)];
            }
            c0490r = c0490r.f1509f;
            AbstractC1326c.m3059b(c0490r);
            j4 = j5;
        }
    }

    public final int hashCode() {
        C0490r c0490r = this.f1479a;
        if (c0490r == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = c0490r.f1506c;
            for (int i4 = c0490r.f1505b; i4 < i3; i4++) {
                i2 = (i2 * 31) + c0490r.f1504a[i4];
            }
            c0490r = c0490r.f1509f;
            AbstractC1326c.m3059b(c0490r);
        } while (c0490r != this.f1479a);
        return i2;
    }

    /* renamed from: i */
    public final int m1177i(int i2, int i3, byte[] bArr) {
        AbstractC1326c.m3062e(bArr, "sink");
        AbstractC0356d.m955e(bArr.length, i2, i3);
        C0490r c0490r = this.f1479a;
        if (c0490r == null) {
            return -1;
        }
        int iMin = Math.min(i3, c0490r.f1506c - c0490r.f1505b);
        int i4 = c0490r.f1505b;
        AbstractC1206h.m2842m0(i2, i4, i4 + iMin, c0490r.f1504a, bArr);
        int i5 = c0490r.f1505b + iMin;
        c0490r.f1505b = i5;
        this.f1480b -= iMin;
        if (i5 == c0490r.f1506c) {
            this.f1479a = c0490r.m1234a();
            AbstractC0491s.m1238a(c0490r);
        }
        return iMin;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final void m1178j(C0478f c0478f) {
        AbstractC1326c.m3062e(c0478f, "unsafeCursor");
        if (c0478f.f1472a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c0478f.f1472a = this;
        c0478f.f1473b = true;
    }

    /* renamed from: k */
    public final byte m1179k() throws EOFException {
        if (this.f1480b == 0) {
            throw new EOFException();
        }
        C0490r c0490r = this.f1479a;
        AbstractC1326c.m3059b(c0490r);
        int i2 = c0490r.f1505b;
        int i3 = c0490r.f1506c;
        int i4 = i2 + 1;
        byte b = c0490r.f1504a[i2];
        this.f1480b--;
        if (i4 != i3) {
            c0490r.f1505b = i4;
            return b;
        }
        this.f1479a = c0490r.m1234a();
        AbstractC0491s.m1238a(c0490r);
        return b;
    }

    /* renamed from: l */
    public final byte[] m1180l(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1480b < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        m1182n(bArr);
        return bArr;
    }

    /* renamed from: m */
    public final C0482j m1181m(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1480b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new C0482j(m1180l(j2));
        }
        C0482j c0482jM1188t = m1188t((int) j2);
        m1187s(j2);
        return c0482jM1188t;
    }

    /* renamed from: n */
    public final void m1182n(byte[] bArr) throws EOFException {
        AbstractC1326c.m3062e(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int iM1177i = m1177i(i2, bArr.length - i2, bArr);
            if (iM1177i == -1) {
                throw new EOFException();
            }
            i2 += iM1177i;
        }
    }

    /* renamed from: o */
    public final int m1183o() throws EOFException {
        if (this.f1480b < 4) {
            throw new EOFException();
        }
        C0490r c0490r = this.f1479a;
        AbstractC1326c.m3059b(c0490r);
        int i2 = c0490r.f1505b;
        int i3 = c0490r.f1506c;
        if (i3 - i2 < 4) {
            return ((m1179k() & 255) << 24) | ((m1179k() & 255) << 16) | ((m1179k() & 255) << 8) | (m1179k() & 255);
        }
        byte[] bArr = c0490r.f1504a;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 2] & 255) << 8);
        int i6 = i2 + 4;
        int i7 = i5 | (bArr[i4] & 255);
        this.f1480b -= 4;
        if (i6 != i3) {
            c0490r.f1505b = i6;
            return i7;
        }
        this.f1479a = c0490r.m1234a();
        AbstractC0491s.m1238a(c0490r);
        return i7;
    }

    /* renamed from: p */
    public final short m1184p() throws EOFException {
        if (this.f1480b < 2) {
            throw new EOFException();
        }
        C0490r c0490r = this.f1479a;
        AbstractC1326c.m3059b(c0490r);
        int i2 = c0490r.f1505b;
        int i3 = c0490r.f1506c;
        if (i3 - i2 < 2) {
            return (short) (((m1179k() & 255) << 8) | (m1179k() & 255));
        }
        int i4 = i2 + 1;
        byte[] bArr = c0490r.f1504a;
        int i5 = (bArr[i2] & 255) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & 255) | i5;
        this.f1480b -= 2;
        if (i6 == i3) {
            this.f1479a = c0490r.m1234a();
            AbstractC0491s.m1238a(c0490r);
        } else {
            c0490r.f1505b = i6;
        }
        return (short) i7;
    }

    /* renamed from: q */
    public final String m1185q(long j2, Charset charset) throws EOFException {
        AbstractC1326c.m3062e(charset, "charset");
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1480b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        C0490r c0490r = this.f1479a;
        AbstractC1326c.m3059b(c0490r);
        int i2 = c0490r.f1505b;
        if (i2 + j2 > c0490r.f1506c) {
            return new String(m1180l(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(c0490r.f1504a, i2, i3, charset);
        int i4 = c0490r.f1505b + i3;
        c0490r.f1505b = i4;
        this.f1480b -= j2;
        if (i4 == c0490r.f1506c) {
            this.f1479a = c0490r.m1234a();
            AbstractC0491s.m1238a(c0490r);
        }
        return str;
    }

    /* renamed from: r */
    public final String m1186r() {
        return m1185q(this.f1480b, AbstractC1403a.f6077a);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1326c.m3062e(byteBuffer, "sink");
        C0490r c0490r = this.f1479a;
        if (c0490r == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c0490r.f1506c - c0490r.f1505b);
        byteBuffer.put(c0490r.f1504a, c0490r.f1505b, iMin);
        int i2 = c0490r.f1505b + iMin;
        c0490r.f1505b = i2;
        this.f1480b -= iMin;
        if (i2 == c0490r.f1506c) {
            this.f1479a = c0490r.m1234a();
            AbstractC0491s.m1238a(c0490r);
        }
        return iMin;
    }

    /* renamed from: s */
    public final void m1187s(long j2) throws EOFException {
        while (j2 > 0) {
            C0490r c0490r = this.f1479a;
            if (c0490r == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, c0490r.f1506c - c0490r.f1505b);
            long j3 = iMin;
            this.f1480b -= j3;
            j2 -= j3;
            int i2 = c0490r.f1505b + iMin;
            c0490r.f1505b = i2;
            if (i2 == c0490r.f1506c) {
                this.f1479a = c0490r.m1234a();
                AbstractC0491s.m1238a(c0490r);
            }
        }
    }

    /* renamed from: t */
    public final C0482j m1188t(int i2) {
        if (i2 == 0) {
            return C0482j.f1481d;
        }
        AbstractC0356d.m955e(this.f1480b, 0L, i2);
        C0490r c0490r = this.f1479a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            AbstractC1326c.m3059b(c0490r);
            int i6 = c0490r.f1506c;
            int i7 = c0490r.f1505b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            c0490r = c0490r.f1509f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        C0490r c0490r2 = this.f1479a;
        int i8 = 0;
        while (i3 < i2) {
            AbstractC1326c.m3059b(c0490r2);
            bArr[i8] = c0490r2.f1504a;
            i3 += c0490r2.f1506c - c0490r2.f1505b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = c0490r2.f1505b;
            c0490r2.f1507d = true;
            i8++;
            c0490r2 = c0490r2.f1509f;
        }
        return new C0492t(bArr, iArr);
    }

    public final String toString() {
        long j2 = this.f1480b;
        if (j2 <= Integer.MAX_VALUE) {
            return m1188t((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f1480b).toString());
    }

    /* renamed from: u */
    public final C0490r m1189u(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C0490r c0490r = this.f1479a;
        if (c0490r == null) {
            C0490r c0490rM1239b = AbstractC0491s.m1239b();
            this.f1479a = c0490rM1239b;
            c0490rM1239b.f1510g = c0490rM1239b;
            c0490rM1239b.f1509f = c0490rM1239b;
            return c0490rM1239b;
        }
        C0490r c0490r2 = c0490r.f1510g;
        AbstractC1326c.m3059b(c0490r2);
        if (c0490r2.f1506c + i2 <= 8192 && c0490r2.f1508e) {
            return c0490r2;
        }
        C0490r c0490rM1239b2 = AbstractC0491s.m1239b();
        c0490r2.m1235b(c0490rM1239b2);
        return c0490rM1239b2;
    }

    /* renamed from: v */
    public final void m1190v(C0482j c0482j) {
        AbstractC1326c.m3062e(c0482j, "byteString");
        c0482j.mo1205k(this, c0482j.mo1197c());
    }

    /* renamed from: w */
    public final void m1191w(byte[] bArr) {
        AbstractC1326c.m3062e(bArr, "source");
        m1192x(bArr, bArr.length);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1326c.m3062e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            C0490r c0490rM1189u = m1189u(1);
            int iMin = Math.min(i2, 8192 - c0490rM1189u.f1506c);
            byteBuffer.get(c0490rM1189u.f1504a, c0490rM1189u.f1506c, iMin);
            i2 -= iMin;
            c0490rM1189u.f1506c += iMin;
        }
        this.f1480b += iRemaining;
        return iRemaining;
    }

    /* renamed from: x */
    public final void m1192x(byte[] bArr, int i2) {
        AbstractC1326c.m3062e(bArr, "source");
        int i3 = 0;
        long j2 = i2;
        AbstractC0356d.m955e(bArr.length, 0, j2);
        while (i3 < i2) {
            C0490r c0490rM1189u = m1189u(1);
            int iMin = Math.min(i2 - i3, 8192 - c0490rM1189u.f1506c);
            int i4 = i3 + iMin;
            AbstractC1206h.m2842m0(c0490rM1189u.f1506c, i3, i4, bArr, c0490rM1189u.f1504a);
            c0490rM1189u.f1506c += iMin;
            i3 = i4;
        }
        this.f1480b += j2;
    }

    /* renamed from: y */
    public final void m1193y(InterfaceC0494v interfaceC0494v) {
        AbstractC1326c.m3062e(interfaceC0494v, "source");
        while (interfaceC0494v.mo486b(this, 8192) != -1) {
        }
    }

    /* renamed from: z */
    public final void m1194z(int i2) {
        C0490r c0490rM1189u = m1189u(1);
        int i3 = c0490rM1189u.f1506c;
        c0490rM1189u.f1506c = i3 + 1;
        c0490rM1189u.f1504a[i3] = (byte) i2;
        this.f1480b++;
    }
}
