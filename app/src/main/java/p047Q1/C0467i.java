package p047Q1;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import p027J1.C0224f;
import p050R1.C0478f;
import p050R1.C0479g;
import p050R1.C0482j;
import p050R1.C0488p;
import p050R1.C0490r;
import p093e2.AbstractC0901d;
import p131s1.AbstractC1326c;

/* renamed from: Q1.i */
/* loaded from: classes.dex */
public final class C0467i implements Closeable {

    /* renamed from: a */
    public final C0479g f1436a;

    /* renamed from: b */
    public final C0479g f1437b;

    /* renamed from: c */
    public boolean f1438c;

    /* renamed from: d */
    public C0459a f1439d;

    /* renamed from: e */
    public final byte[] f1440e;

    /* renamed from: f */
    public final C0478f f1441f;

    /* renamed from: g */
    public final C0488p f1442g;

    /* renamed from: h */
    public final Random f1443h;

    /* renamed from: i */
    public final boolean f1444i;

    /* renamed from: j */
    public final boolean f1445j;

    /* renamed from: k */
    public final long f1446k;

    public C0467i(C0488p c0488p, Random random, boolean z2, boolean z3, long j2) {
        AbstractC1326c.m3062e(c0488p, "sink");
        this.f1442g = c0488p;
        this.f1443h = random;
        this.f1444i = z2;
        this.f1445j = z3;
        this.f1446k = j2;
        this.f1436a = new C0479g();
        this.f1437b = c0488p.f1498a;
        this.f1440e = new byte[4];
        this.f1441f = new C0478f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C0459a c0459a = this.f1439d;
        if (c0459a != null) {
            c0459a.close();
        }
    }

    /* renamed from: g */
    public final void m1155g(int i2, C0482j c0482j) {
        if (this.f1438c) {
            throw new IOException("closed");
        }
        int iMo1197c = c0482j.mo1197c();
        if (iMo1197c > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        C0479g c0479g = this.f1437b;
        c0479g.m1194z(i2 | 128);
        c0479g.m1194z(iMo1197c | 128);
        byte[] bArr = this.f1440e;
        AbstractC1326c.m3059b(bArr);
        this.f1443h.nextBytes(bArr);
        c0479g.m1191w(bArr);
        if (iMo1197c > 0) {
            long j2 = c0479g.f1480b;
            c0479g.m1190v(c0482j);
            C0478f c0478f = this.f1441f;
            AbstractC1326c.m3059b(c0478f);
            c0479g.m1178j(c0478f);
            c0478f.m1165h(j2);
            AbstractC0901d.m2317s0(c0478f, bArr);
            c0478f.close();
        }
        this.f1442g.flush();
    }

    /* renamed from: h */
    public final void m1156h(C0482j c0482j) throws IOException {
        long j2;
        int i2;
        if (this.f1438c) {
            throw new IOException("closed");
        }
        C0479g c0479g = this.f1436a;
        c0479g.m1190v(c0482j);
        if (!this.f1444i || c0482j.f1484c.length < this.f1446k) {
            j2 = 0;
            i2 = 129;
        } else {
            C0459a c0459a = this.f1439d;
            if (c0459a == null) {
                c0459a = new C0459a(0, this.f1445j);
                this.f1439d = c0459a;
            }
            C0479g c0479g2 = c0459a.f1383b;
            if (c0479g2.f1480b != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (c0459a.f1384c) {
                ((Deflater) c0459a.f1385d).reset();
            }
            long j3 = c0479g.f1480b;
            C0224f c0224f = (C0224f) c0459a.f1386e;
            c0224f.mo481f(c0479g, j3);
            c0224f.flush();
            C0482j c0482j2 = AbstractC0460b.f1387a;
            long j4 = c0479g2.f1480b;
            byte[] bArr = c0482j2.f1484c;
            long length = j4 - bArr.length;
            int length2 = bArr.length;
            if (length < 0 || length2 < 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (j4 - length >= length2 && bArr.length >= length2) {
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (c0479g2.m1176h(i3 + length) == c0482j2.f1484c[i3]) {
                        }
                    }
                    long j5 = c0479g2.f1480b - 4;
                    C0478f c0478f = new C0478f();
                    c0479g2.m1178j(c0478f);
                    try {
                        c0478f.m1164g(j5);
                        c0478f.close();
                        c0479g.mo481f(c0479g2, c0479g2.f1480b);
                        i2 = 193;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC0901d.m2303k(c0478f, th);
                            throw th2;
                        }
                    }
                }
            }
            c0479g2.m1194z(0);
            c0479g.mo481f(c0479g2, c0479g2.f1480b);
            i2 = 193;
        }
        long j6 = c0479g.f1480b;
        C0479g c0479g3 = this.f1437b;
        c0479g3.m1194z(i2);
        if (j6 <= 125) {
            c0479g3.m1194z(((int) j6) | 128);
        } else if (j6 <= 65535) {
            c0479g3.m1194z(254);
            c0479g3.m1168C((int) j6);
        } else {
            c0479g3.m1194z(255);
            C0490r c0490rM1189u = c0479g3.m1189u(8);
            int i4 = c0490rM1189u.f1506c;
            byte[] bArr2 = c0490rM1189u.f1504a;
            bArr2[i4] = (byte) ((j6 >>> 56) & 255);
            bArr2[i4 + 1] = (byte) ((j6 >>> 48) & 255);
            bArr2[i4 + 2] = (byte) ((j6 >>> 40) & 255);
            bArr2[i4 + 3] = (byte) ((j6 >>> 32) & 255);
            bArr2[i4 + 4] = (byte) ((j6 >>> 24) & 255);
            bArr2[i4 + 5] = (byte) ((j6 >>> 16) & 255);
            bArr2[i4 + 6] = (byte) ((j6 >>> 8) & 255);
            bArr2[i4 + 7] = (byte) (j6 & 255);
            c0490rM1189u.f1506c = i4 + 8;
            c0479g3.f1480b += 8;
        }
        byte[] bArr3 = this.f1440e;
        AbstractC1326c.m3059b(bArr3);
        this.f1443h.nextBytes(bArr3);
        c0479g3.m1191w(bArr3);
        if (j6 > j2) {
            C0478f c0478f2 = this.f1441f;
            AbstractC1326c.m3059b(c0478f2);
            c0479g.m1178j(c0478f2);
            c0478f2.m1165h(j2);
            AbstractC0901d.m2317s0(c0478f2, bArr3);
            c0478f2.close();
        }
        c0479g3.mo481f(c0479g, j6);
        C0488p c0488p = this.f1442g;
        if (c0488p.f1499b) {
            throw new IllegalStateException("closed");
        }
        C0479g c0479g4 = c0488p.f1498a;
        long j7 = c0479g4.f1480b;
        if (j7 > 0) {
            c0488p.f1500c.mo481f(c0479g4, j7);
        }
    }
}
