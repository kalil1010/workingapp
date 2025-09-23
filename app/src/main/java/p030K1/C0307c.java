package p030K1;

import java.io.IOException;
import java.util.ArrayList;
import p014E1.AbstractC0145b;
import p050R1.C0479g;
import p050R1.C0482j;
import p050R1.C0489q;
import p110k1.AbstractC1206h;
import p131s1.AbstractC1326c;

/* renamed from: K1.c */
/* loaded from: classes.dex */
public final class C0307c {

    /* renamed from: b */
    public final C0489q f941b;

    /* renamed from: e */
    public int f944e;

    /* renamed from: f */
    public int f945f;

    /* renamed from: g */
    public int f946g = 4096;

    /* renamed from: a */
    public final ArrayList f940a = new ArrayList();

    /* renamed from: c */
    public C0306b[] f942c = new C0306b[8];

    /* renamed from: d */
    public int f943d = 7;

    public C0307c(C0323s c0323s) {
        this.f941b = new C0489q(c0323s);
    }

    /* renamed from: a */
    public final int m832a(int i2) {
        int i3;
        int i4 = 0;
        if (i2 > 0) {
            int length = this.f942c.length;
            while (true) {
                length--;
                i3 = this.f943d;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                C0306b c0306b = this.f942c[length];
                AbstractC1326c.m3059b(c0306b);
                int i5 = c0306b.f937a;
                i2 -= i5;
                this.f945f -= i5;
                this.f944e--;
                i4++;
            }
            C0306b[] c0306bArr = this.f942c;
            System.arraycopy(c0306bArr, i3 + 1, c0306bArr, i3 + 1 + i4, this.f944e);
            this.f943d += i4;
        }
        return i4;
    }

    /* renamed from: b */
    public final C0482j m833b(int i2) throws IOException {
        if (i2 >= 0) {
            C0306b[] c0306bArr = AbstractC0309e.f955a;
            if (i2 <= c0306bArr.length - 1) {
                return c0306bArr[i2].f938b;
            }
        }
        int length = this.f943d + 1 + (i2 - AbstractC0309e.f955a.length);
        if (length >= 0) {
            C0306b[] c0306bArr2 = this.f942c;
            if (length < c0306bArr2.length) {
                C0306b c0306b = c0306bArr2[length];
                AbstractC1326c.m3059b(c0306b);
                return c0306b.f938b;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    /* renamed from: c */
    public final void m834c(C0306b c0306b) {
        this.f940a.add(c0306b);
        int i2 = this.f946g;
        int i3 = c0306b.f937a;
        if (i3 > i2) {
            C0306b[] c0306bArr = this.f942c;
            AbstractC1206h.m2845p0(c0306bArr, 0, c0306bArr.length);
            this.f943d = this.f942c.length - 1;
            this.f944e = 0;
            this.f945f = 0;
            return;
        }
        m832a((this.f945f + i3) - i2);
        int i4 = this.f944e + 1;
        C0306b[] c0306bArr2 = this.f942c;
        if (i4 > c0306bArr2.length) {
            C0306b[] c0306bArr3 = new C0306b[c0306bArr2.length * 2];
            System.arraycopy(c0306bArr2, 0, c0306bArr3, c0306bArr2.length, c0306bArr2.length);
            this.f943d = this.f942c.length - 1;
            this.f942c = c0306bArr3;
        }
        int i5 = this.f943d;
        this.f943d = i5 - 1;
        this.f942c[i5] = c0306b;
        this.f944e++;
        this.f945f += i3;
    }

    /* renamed from: d */
    public final C0482j m835d() {
        int i2;
        C0489q c0489q = this.f941b;
        byte bM1223i = c0489q.m1223i();
        byte[] bArr = AbstractC0145b.f495a;
        int i3 = bM1223i & 255;
        int i4 = 0;
        boolean z2 = (bM1223i & 128) == 128;
        long jM836e = m836e(i3, 127);
        if (!z2) {
            return c0489q.m1224j(jM836e);
        }
        C0479g c0479g = new C0479g();
        int[] iArr = AbstractC0330z.f1062a;
        AbstractC1326c.m3062e(c0489q, "source");
        C0329y c0329y = AbstractC0330z.f1064c;
        C0329y c0329y2 = c0329y;
        int i5 = 0;
        for (long j2 = 0; j2 < jM836e; j2++) {
            byte bM1223i2 = c0489q.m1223i();
            byte[] bArr2 = AbstractC0145b.f495a;
            i4 = (i4 << 8) | (bM1223i2 & 255);
            i5 += 8;
            while (i5 >= 8) {
                int i6 = i5 - 8;
                C0329y[] c0329yArr = (C0329y[]) c0329y2.f1061c;
                AbstractC1326c.m3059b(c0329yArr);
                c0329y2 = c0329yArr[(i4 >>> i6) & 255];
                AbstractC1326c.m3059b(c0329y2);
                if (((C0329y[]) c0329y2.f1061c) == null) {
                    c0479g.m1194z(c0329y2.f1059a);
                    i5 -= c0329y2.f1060b;
                    c0329y2 = c0329y;
                } else {
                    i5 = i6;
                }
            }
        }
        while (i5 > 0) {
            C0329y[] c0329yArr2 = (C0329y[]) c0329y2.f1061c;
            AbstractC1326c.m3059b(c0329yArr2);
            C0329y c0329y3 = c0329yArr2[(i4 << (8 - i5)) & 255];
            AbstractC1326c.m3059b(c0329y3);
            if (((C0329y[]) c0329y3.f1061c) != null || (i2 = c0329y3.f1060b) > i5) {
                break;
            }
            c0479g.m1194z(c0329y3.f1059a);
            i5 -= i2;
            c0329y2 = c0329y;
        }
        return c0479g.m1181m(c0479g.f1480b);
    }

    /* renamed from: e */
    public final int m836e(int i2, int i3) {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        while (true) {
            byte bM1223i = this.f941b.m1223i();
            byte[] bArr = AbstractC0145b.f495a;
            int i6 = bM1223i & 255;
            if ((bM1223i & 128) == 0) {
                return i3 + (i6 << i5);
            }
            i3 += (bM1223i & 127) << i5;
            i5 += 7;
        }
    }
}
