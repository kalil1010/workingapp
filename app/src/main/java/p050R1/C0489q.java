package p050R1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p033L1.AbstractC0356d;
import p053S1.AbstractC0500a;
import p131s1.AbstractC1326c;

/* renamed from: R1.q */
/* loaded from: classes.dex */
public final class C0489q implements InterfaceC0481i {

    /* renamed from: a */
    public final C0479g f1501a;

    /* renamed from: b */
    public boolean f1502b;

    /* renamed from: c */
    public final InterfaceC0494v f1503c;

    public C0489q(InterfaceC0494v interfaceC0494v) {
        AbstractC1326c.m3062e(interfaceC0494v, "source");
        this.f1503c = interfaceC0494v;
        this.f1501a = new C0479g();
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: a */
    public final C0496x mo485a() {
        return this.f1503c.mo485a();
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: b */
    public final long mo486b(C0479g c0479g, long j2) {
        AbstractC1326c.m3062e(c0479g, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f1502b) {
            throw new IllegalStateException("closed");
        }
        C0479g c0479g2 = this.f1501a;
        if (c0479g2.f1480b == 0) {
            if (this.f1503c.mo486b(c0479g2, 8192) == -1) {
                return -1L;
            }
        }
        return c0479g2.mo486b(c0479g, Math.min(j2, c0479g2.f1480b));
    }

    @Override // p050R1.InterfaceC0481i
    /* renamed from: c */
    public final int mo1172c(C0487o c0487o) throws EOFException {
        AbstractC1326c.m3062e(c0487o, "options");
        if (this.f1502b) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C0479g c0479g = this.f1501a;
            int iM1242b = AbstractC0500a.m1242b(c0479g, c0487o, true);
            if (iM1242b == -2) {
                if (this.f1503c.mo486b(c0479g, 8192) == -1) {
                    break;
                }
            } else if (iM1242b != -1) {
                c0479g.m1187s(c0487o.f1496a[iM1242b].mo1197c());
                return iM1242b;
            }
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f1502b) {
            return;
        }
        this.f1502b = true;
        this.f1503c.close();
        C0479g c0479g = this.f1501a;
        c0479g.m1187s(c0479g.f1480b);
    }

    @Override // p050R1.InterfaceC0481i
    /* renamed from: e */
    public final String mo1174e(Charset charset) {
        C0479g c0479g = this.f1501a;
        c0479g.m1193y(this.f1503c);
        return c0479g.m1185q(c0479g.f1480b, charset);
    }

    /* renamed from: g */
    public final boolean m1221g() {
        if (this.f1502b) {
            throw new IllegalStateException("closed");
        }
        C0479g c0479g = this.f1501a;
        if (c0479g.m1175g()) {
            return this.f1503c.mo486b(c0479g, (long) 8192) == -1;
        }
        return false;
    }

    /* renamed from: h */
    public final long m1222h(byte b, long j2, long j3) {
        C0490r c0490r;
        long j4;
        if (this.f1502b) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j3).toString());
        }
        while (jMax < j3) {
            C0479g c0479g = this.f1501a;
            c0479g.getClass();
            long j5 = 0;
            if (!(0 <= jMax && j3 >= jMax)) {
                throw new IllegalArgumentException(("size=" + c0479g.f1480b + " fromIndex=" + jMax + " toIndex=" + j3).toString());
            }
            long j6 = c0479g.f1480b;
            long j7 = j3 > j6 ? j6 : j3;
            long j8 = -1;
            if (jMax == j7 || (c0490r = c0479g.f1479a) == null) {
                j4 = -1;
            } else if (j6 - jMax >= jMax) {
                j4 = -1;
                while (true) {
                    long j9 = (c0490r.f1506c - c0490r.f1505b) + j5;
                    if (j9 > jMax) {
                        break;
                    }
                    c0490r = c0490r.f1509f;
                    AbstractC1326c.m3059b(c0490r);
                    j5 = j9;
                }
                long j10 = jMax;
                while (true) {
                    if (j5 >= j7) {
                        break;
                    }
                    long j11 = j10;
                    int iMin = (int) Math.min(c0490r.f1506c, (c0490r.f1505b + j7) - j5);
                    for (int i2 = (int) ((c0490r.f1505b + j11) - j5); i2 < iMin; i2++) {
                        if (c0490r.f1504a[i2] == b) {
                            j8 = (i2 - c0490r.f1505b) + j5;
                            break;
                        }
                    }
                    j10 = (c0490r.f1506c - c0490r.f1505b) + j5;
                    c0490r = c0490r.f1509f;
                    AbstractC1326c.m3059b(c0490r);
                    j5 = j10;
                }
            } else {
                while (j6 > jMax) {
                    c0490r = c0490r.f1510g;
                    AbstractC1326c.m3059b(c0490r);
                    j6 -= c0490r.f1506c - c0490r.f1505b;
                }
                long j12 = jMax;
                while (j6 < j7) {
                    j4 = -1;
                    int iMin2 = (int) Math.min(c0490r.f1506c, (c0490r.f1505b + j7) - j6);
                    for (int i3 = (int) ((c0490r.f1505b + j12) - j6); i3 < iMin2; i3++) {
                        if (c0490r.f1504a[i3] == b) {
                            j8 = (i3 - c0490r.f1505b) + j6;
                            break;
                        }
                    }
                    j12 = j6 + (c0490r.f1506c - c0490r.f1505b);
                    c0490r = c0490r.f1509f;
                    AbstractC1326c.m3059b(c0490r);
                    j6 = j12;
                }
                j4 = -1;
            }
            if (j8 != j4) {
                return j8;
            }
            long j13 = c0479g.f1480b;
            if (j13 >= j3) {
                return j4;
            }
            if (this.f1503c.mo486b(c0479g, 8192) == j4) {
                return j4;
            }
            jMax = Math.max(jMax, j13);
        }
        return -1L;
    }

    /* renamed from: i */
    public final byte m1223i() {
        m1232r(1L);
        return this.f1501a.m1179k();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1502b;
    }

    /* renamed from: j */
    public final C0482j m1224j(long j2) {
        m1232r(j2);
        return this.f1501a.m1181m(j2);
    }

    /* renamed from: k */
    public final void m1225k(C0479g c0479g, long j2) throws EOFException {
        C0479g c0479g2 = this.f1501a;
        try {
            m1232r(j2);
            long j3 = c0479g2.f1480b;
            if (j3 >= j2) {
                c0479g.mo481f(c0479g2, j2);
            } else {
                c0479g.mo481f(c0479g2, j3);
                throw new EOFException();
            }
        } catch (EOFException e3) {
            c0479g.m1193y(c0479g2);
            throw e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1 A[LOOP:2: B:28:0x007f->B:47:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1 A[SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m1226l() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p050R1.C0489q.m1226l():long");
    }

    /* renamed from: m */
    public final int m1227m() {
        m1232r(4L);
        return this.f1501a.m1183o();
    }

    /* renamed from: n */
    public final int m1228n() throws EOFException {
        m1232r(4L);
        int iM1183o = this.f1501a.m1183o();
        return ((iM1183o & 255) << 24) | (((-16777216) & iM1183o) >>> 24) | ((16711680 & iM1183o) >>> 8) | ((65280 & iM1183o) << 8);
    }

    /* renamed from: o */
    public final short m1229o() {
        m1232r(2L);
        return this.f1501a.m1184p();
    }

    /* renamed from: p */
    public final String m1230p(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        byte b = (byte) 10;
        long jM1222h = m1222h(b, 0L, j3);
        C0479g c0479g = this.f1501a;
        if (jM1222h != -1) {
            return AbstractC0500a.m1241a(c0479g, jM1222h);
        }
        if (j3 < Long.MAX_VALUE && m1231q(j3) && c0479g.m1176h(j3 - 1) == ((byte) 13) && m1231q(j3 + 1) && c0479g.m1176h(j3) == b) {
            return AbstractC0500a.m1241a(c0479g, j3);
        }
        C0479g c0479g2 = new C0479g();
        long jMin = Math.min(32, c0479g.f1480b);
        long j4 = 0;
        c0479g.getClass();
        AbstractC1326c.m3062e(c0479g2, "out");
        AbstractC0356d.m955e(c0479g.f1480b, 0L, jMin);
        if (jMin != 0) {
            c0479g2.f1480b += jMin;
            C0490r c0490r = c0479g.f1479a;
            while (true) {
                AbstractC1326c.m3059b(c0490r);
                long j5 = c0490r.f1506c - c0490r.f1505b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                c0490r = c0490r.f1509f;
            }
            long j6 = j4;
            long j7 = jMin;
            while (j7 > 0) {
                AbstractC1326c.m3059b(c0490r);
                C0490r c0490rM1236c = c0490r.m1236c();
                int i2 = c0490rM1236c.f1505b + ((int) j6);
                c0490rM1236c.f1505b = i2;
                c0490rM1236c.f1506c = Math.min(i2 + ((int) j7), c0490rM1236c.f1506c);
                C0490r c0490r2 = c0479g2.f1479a;
                if (c0490r2 == null) {
                    c0490rM1236c.f1510g = c0490rM1236c;
                    c0490rM1236c.f1509f = c0490rM1236c;
                    c0479g2.f1479a = c0490rM1236c;
                } else {
                    C0490r c0490r3 = c0490r2.f1510g;
                    AbstractC1326c.m3059b(c0490r3);
                    c0490r3.m1235b(c0490rM1236c);
                }
                j7 -= c0490rM1236c.f1506c - c0490rM1236c.f1505b;
                c0490r = c0490r.f1509f;
                j6 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c0479g.f1480b, j2) + " content=" + c0479g2.m1181m(c0479g2.f1480b).mo1198d() + "…");
    }

    /* renamed from: q */
    public final boolean m1231q(long j2) {
        C0479g c0479g;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f1502b) {
            throw new IllegalStateException("closed");
        }
        do {
            c0479g = this.f1501a;
            if (c0479g.f1480b >= j2) {
                return true;
            }
        } while (this.f1503c.mo486b(c0479g, 8192) != -1);
        return false;
    }

    /* renamed from: r */
    public final void m1232r(long j2) {
        if (!m1231q(j2)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1326c.m3062e(byteBuffer, "sink");
        C0479g c0479g = this.f1501a;
        if (c0479g.f1480b == 0) {
            if (this.f1503c.mo486b(c0479g, 8192) == -1) {
                return -1;
            }
        }
        return c0479g.read(byteBuffer);
    }

    /* renamed from: s */
    public final void m1233s(long j2) {
        if (this.f1502b) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            C0479g c0479g = this.f1501a;
            if (c0479g.f1480b == 0) {
                if (this.f1503c.mo486b(c0479g, 8192) == -1) {
                    throw new EOFException();
                }
            }
            long jMin = Math.min(j2, c0479g.f1480b);
            c0479g.m1187s(jMin);
            j2 -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f1503c + ')';
    }
}
