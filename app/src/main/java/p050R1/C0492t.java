package p050R1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p033L1.AbstractC0356d;
import p053S1.AbstractC0501b;
import p110k1.AbstractC1206h;
import p131s1.AbstractC1326c;

/* renamed from: R1.t */
/* loaded from: classes.dex */
public final class C0492t extends C0482j {

    /* renamed from: e */
    public final transient byte[][] f1514e;

    /* renamed from: f */
    public final transient int[] f1515f;

    public C0492t(byte[][] bArr, int[] iArr) {
        super(C0482j.f1481d.f1484c);
        this.f1514e = bArr;
        this.f1515f = iArr;
    }

    @Override // p050R1.C0482j
    /* renamed from: a */
    public final String mo1195a() {
        throw null;
    }

    @Override // p050R1.C0482j
    /* renamed from: b */
    public final C0482j mo1196b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f1514e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f1515f;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            messageDigest.update(bArr[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC1326c.m3061d(bArrDigest, "digest.digest()");
        return new C0482j(bArrDigest);
    }

    @Override // p050R1.C0482j
    /* renamed from: c */
    public final int mo1197c() {
        return this.f1515f[this.f1514e.length - 1];
    }

    @Override // p050R1.C0482j
    /* renamed from: d */
    public final String mo1198d() {
        return new C0482j(m1240l()).mo1198d();
    }

    @Override // p050R1.C0482j
    /* renamed from: e */
    public final byte[] mo1199e() {
        return m1240l();
    }

    @Override // p050R1.C0482j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0482j)) {
            return false;
        }
        C0482j c0482j = (C0482j) obj;
        return c0482j.mo1197c() == mo1197c() && mo1201g(mo1197c(), c0482j);
    }

    @Override // p050R1.C0482j
    /* renamed from: f */
    public final byte mo1200f(int i2) {
        byte[][] bArr = this.f1514e;
        int length = bArr.length - 1;
        int[] iArr = this.f1515f;
        AbstractC0356d.m955e(iArr[length], i2, 1L);
        int iM1244b = AbstractC0501b.m1244b(this, i2);
        return bArr[iM1244b][(i2 - (iM1244b == 0 ? 0 : iArr[iM1244b - 1])) + iArr[bArr.length + iM1244b]];
    }

    @Override // p050R1.C0482j
    /* renamed from: g */
    public final boolean mo1201g(int i2, C0482j c0482j) {
        AbstractC1326c.m3062e(c0482j, "other");
        if (mo1197c() - i2 >= 0) {
            int iM1244b = AbstractC0501b.m1244b(this, 0);
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int[] iArr = this.f1515f;
                int i5 = iM1244b == 0 ? 0 : iArr[iM1244b - 1];
                int i6 = iArr[iM1244b] - i5;
                byte[][] bArr = this.f1514e;
                int i7 = iArr[bArr.length + iM1244b];
                int iMin = Math.min(i2, i6 + i5) - i3;
                if (c0482j.mo1202h(i4, bArr[iM1244b], (i3 - i5) + i7, iMin)) {
                    i4 += iMin;
                    i3 += iMin;
                    iM1244b++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p050R1.C0482j
    /* renamed from: h */
    public final boolean mo1202h(int i2, byte[] bArr, int i3, int i4) {
        AbstractC1326c.m3062e(bArr, "other");
        if (i2 < 0 || i2 > mo1197c() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iM1244b = AbstractC0501b.m1244b(this, i2);
        while (i2 < i5) {
            int[] iArr = this.f1515f;
            int i6 = iM1244b == 0 ? 0 : iArr[iM1244b - 1];
            int i7 = iArr[iM1244b] - i6;
            byte[][] bArr2 = this.f1514e;
            int i8 = iArr[bArr2.length + iM1244b];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!AbstractC0356d.m953c((i2 - i6) + i8, i3, iMin, bArr2[iM1244b], bArr)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iM1244b++;
        }
        return true;
    }

    @Override // p050R1.C0482j
    public final int hashCode() {
        int i2 = this.f1482a;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f1514e;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f1515f;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr2 = bArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr2[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f1482a = i4;
        return i4;
    }

    @Override // p050R1.C0482j
    /* renamed from: i */
    public final C0482j mo1203i() {
        return new C0482j(m1240l()).mo1203i();
    }

    @Override // p050R1.C0482j
    /* renamed from: k */
    public final void mo1205k(C0479g c0479g, int i2) {
        AbstractC1326c.m3062e(c0479g, "buffer");
        int iM1244b = AbstractC0501b.m1244b(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int[] iArr = this.f1515f;
            int i4 = iM1244b == 0 ? 0 : iArr[iM1244b - 1];
            int i5 = iArr[iM1244b] - i4;
            byte[][] bArr = this.f1514e;
            int i6 = iArr[bArr.length + iM1244b];
            int iMin = Math.min(i2, i5 + i4) - i3;
            int i7 = (i3 - i4) + i6;
            C0490r c0490r = new C0490r(bArr[iM1244b], i7, i7 + iMin, true, false);
            C0490r c0490r2 = c0479g.f1479a;
            if (c0490r2 == null) {
                c0490r.f1510g = c0490r;
                c0490r.f1509f = c0490r;
                c0479g.f1479a = c0490r;
            } else {
                C0490r c0490r3 = c0490r2.f1510g;
                AbstractC1326c.m3059b(c0490r3);
                c0490r3.m1235b(c0490r);
            }
            i3 += iMin;
            iM1244b++;
        }
        c0479g.f1480b += mo1197c();
    }

    /* renamed from: l */
    public final byte[] m1240l() {
        byte[] bArr = new byte[mo1197c()];
        byte[][] bArr2 = this.f1514e;
        int length = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f1515f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            AbstractC1206h.m2842m0(i4, i5, i5 + i7, bArr2[i2], bArr);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // p050R1.C0482j
    public final String toString() {
        return new C0482j(m1240l()).toString();
    }
}
