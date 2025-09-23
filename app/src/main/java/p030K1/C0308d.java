package p030K1;

import java.io.EOFException;
import java.util.Arrays;
import p014E1.AbstractC0145b;
import p050R1.C0479g;
import p050R1.C0482j;
import p110k1.AbstractC1206h;
import p131s1.AbstractC1326c;

/* renamed from: K1.d */
/* loaded from: classes.dex */
public final class C0308d {

    /* renamed from: b */
    public boolean f948b;

    /* renamed from: f */
    public int f952f;

    /* renamed from: g */
    public int f953g;

    /* renamed from: h */
    public final C0479g f954h;

    /* renamed from: a */
    public int f947a = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f949c = 4096;

    /* renamed from: d */
    public C0306b[] f950d = new C0306b[8];

    /* renamed from: e */
    public int f951e = 7;

    public C0308d(C0479g c0479g) {
        this.f954h = c0479g;
    }

    /* renamed from: a */
    public final void m837a(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f950d.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f951e;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                C0306b c0306b = this.f950d[length];
                AbstractC1326c.m3059b(c0306b);
                i2 -= c0306b.f937a;
                int i5 = this.f953g;
                C0306b c0306b2 = this.f950d[length];
                AbstractC1326c.m3059b(c0306b2);
                this.f953g = i5 - c0306b2.f937a;
                this.f952f--;
                i4++;
                length--;
            }
            C0306b[] c0306bArr = this.f950d;
            int i6 = i3 + 1;
            System.arraycopy(c0306bArr, i6, c0306bArr, i6 + i4, this.f952f);
            C0306b[] c0306bArr2 = this.f950d;
            int i7 = this.f951e + 1;
            Arrays.fill(c0306bArr2, i7, i7 + i4, (Object) null);
            this.f951e += i4;
        }
    }

    /* renamed from: b */
    public final void m838b(C0306b c0306b) {
        int i2 = this.f949c;
        int i3 = c0306b.f937a;
        if (i3 > i2) {
            C0306b[] c0306bArr = this.f950d;
            AbstractC1206h.m2845p0(c0306bArr, 0, c0306bArr.length);
            this.f951e = this.f950d.length - 1;
            this.f952f = 0;
            this.f953g = 0;
            return;
        }
        m837a((this.f953g + i3) - i2);
        int i4 = this.f952f + 1;
        C0306b[] c0306bArr2 = this.f950d;
        if (i4 > c0306bArr2.length) {
            C0306b[] c0306bArr3 = new C0306b[c0306bArr2.length * 2];
            System.arraycopy(c0306bArr2, 0, c0306bArr3, c0306bArr2.length, c0306bArr2.length);
            this.f951e = this.f950d.length - 1;
            this.f950d = c0306bArr3;
        }
        int i5 = this.f951e;
        this.f951e = i5 - 1;
        this.f950d[i5] = c0306b;
        this.f952f++;
        this.f953g += i3;
    }

    /* renamed from: c */
    public final void m839c(C0482j c0482j) throws EOFException {
        AbstractC1326c.m3062e(c0482j, "data");
        C0479g c0479g = this.f954h;
        int[] iArr = AbstractC0330z.f1062a;
        int iMo1197c = c0482j.mo1197c();
        long j2 = 0;
        for (int i2 = 0; i2 < iMo1197c; i2++) {
            byte bMo1200f = c0482j.mo1200f(i2);
            byte[] bArr = AbstractC0145b.f495a;
            j2 += AbstractC0330z.f1063b[bMo1200f & 255];
        }
        if (((int) ((j2 + 7) >> 3)) >= c0482j.mo1197c()) {
            m841e(c0482j.mo1197c(), 127, 0);
            c0479g.m1190v(c0482j);
            return;
        }
        C0479g c0479g2 = new C0479g();
        int[] iArr2 = AbstractC0330z.f1062a;
        int iMo1197c2 = c0482j.mo1197c();
        long j3 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iMo1197c2; i4++) {
            byte bMo1200f2 = c0482j.mo1200f(i4);
            byte[] bArr2 = AbstractC0145b.f495a;
            int i5 = bMo1200f2 & 255;
            int i6 = AbstractC0330z.f1062a[i5];
            byte b = AbstractC0330z.f1063b[i5];
            j3 = (j3 << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                c0479g2.m1194z((int) (j3 >> i3));
            }
        }
        if (i3 > 0) {
            c0479g2.m1194z((int) ((255 >>> i3) | (j3 << (8 - i3))));
        }
        C0482j c0482jM1181m = c0479g2.m1181m(c0479g2.f1480b);
        m841e(c0482jM1181m.mo1197c(), 127, 128);
        c0479g.m1190v(c0482jM1181m);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m840d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p030K1.C0308d.m840d(java.util.ArrayList):void");
    }

    /* renamed from: e */
    public final void m841e(int i2, int i3, int i4) {
        C0479g c0479g = this.f954h;
        if (i2 < i3) {
            c0479g.m1194z(i2 | i4);
            return;
        }
        c0479g.m1194z(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            c0479g.m1194z(128 | (i5 & 127));
            i5 >>>= 7;
        }
        c0479g.m1194z(i5);
    }
}
