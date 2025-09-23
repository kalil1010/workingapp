package p050R1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p131s1.AbstractC1326c;

/* renamed from: R1.l */
/* loaded from: classes.dex */
public final class C0484l implements InterfaceC0494v {

    /* renamed from: a */
    public byte f1486a;

    /* renamed from: b */
    public final C0489q f1487b;

    /* renamed from: c */
    public final Inflater f1488c;

    /* renamed from: d */
    public final C0485m f1489d;

    /* renamed from: e */
    public final CRC32 f1490e;

    public C0484l(InterfaceC0494v interfaceC0494v) {
        AbstractC1326c.m3062e(interfaceC0494v, "source");
        C0489q c0489q = new C0489q(interfaceC0494v);
        this.f1487b = c0489q;
        Inflater inflater = new Inflater(true);
        this.f1488c = inflater;
        this.f1489d = new C0485m(c0489q, inflater);
        this.f1490e = new CRC32();
    }

    /* renamed from: g */
    public static void m1214g(String str, int i2, int i3) throws IOException {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3)));
        }
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: a */
    public final C0496x mo485a() {
        return this.f1487b.f1503c.mo485a();
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: b */
    public final long mo486b(C0479g c0479g, long j2) throws DataFormatException, IOException {
        long j3;
        long j4;
        C0484l c0484l = this;
        AbstractC1326c.m3062e(c0479g, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        byte b = c0484l.f1486a;
        CRC32 crc32 = c0484l.f1490e;
        C0489q c0489q = c0484l.f1487b;
        if (b == 0) {
            c0489q.m1232r(10L);
            C0479g c0479g2 = c0489q.f1501a;
            byte bM1176h = c0479g2.m1176h(3L);
            boolean z2 = ((bM1176h >> 1) & 1) == 1;
            if (z2) {
                c0484l.m1215h(c0479g2, 0L, 10L);
            }
            m1214g("ID1ID2", 8075, c0489q.m1229o());
            c0489q.m1233s(8L);
            if (((bM1176h >> 2) & 1) == 1) {
                c0489q.m1232r(2L);
                if (z2) {
                    m1215h(c0479g2, 0L, 2L);
                }
                short sM1184p = c0479g2.m1184p();
                long j5 = (short) (((sM1184p & 255) << 8) | ((sM1184p & 65280) >>> 8));
                c0489q.m1232r(j5);
                if (z2) {
                    m1215h(c0479g2, 0L, j5);
                }
                c0489q.m1233s(j5);
            }
            if (((bM1176h >> 3) & 1) == 1) {
                long jM1222h = c0489q.m1222h((byte) 0, 0L, Long.MAX_VALUE);
                if (jM1222h == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    j3 = -1;
                    j4 = 2;
                    m1215h(c0479g2, 0L, jM1222h + 1);
                } else {
                    j3 = -1;
                    j4 = 2;
                }
                c0489q.m1233s(jM1222h + 1);
            } else {
                j3 = -1;
                j4 = 2;
            }
            if (((bM1176h >> 4) & 1) == 1) {
                long jM1222h2 = c0489q.m1222h((byte) 0, 0L, Long.MAX_VALUE);
                if (jM1222h2 == j3) {
                    throw new EOFException();
                }
                if (z2) {
                    c0484l = this;
                    c0484l.m1215h(c0479g2, 0L, jM1222h2 + 1);
                } else {
                    c0484l = this;
                }
                c0489q.m1233s(jM1222h2 + 1);
            } else {
                c0484l = this;
            }
            if (z2) {
                c0489q.m1232r(j4);
                short sM1184p2 = c0479g2.m1184p();
                m1214g("FHCRC", (short) (((sM1184p2 & 255) << 8) | ((sM1184p2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            c0484l.f1486a = (byte) 1;
        } else {
            j3 = -1;
        }
        if (c0484l.f1486a == 1) {
            long j6 = c0479g.f1480b;
            long jMo486b = c0484l.f1489d.mo486b(c0479g, j2);
            if (jMo486b != j3) {
                c0484l.m1215h(c0479g, j6, jMo486b);
                return jMo486b;
            }
            c0484l.f1486a = (byte) 2;
        }
        if (c0484l.f1486a == 2) {
            m1214g("CRC", c0489q.m1228n(), (int) crc32.getValue());
            m1214g("ISIZE", c0489q.m1228n(), (int) c0484l.f1488c.getBytesWritten());
            c0484l.f1486a = (byte) 3;
            if (!c0489q.m1221g()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1489d.close();
    }

    /* renamed from: h */
    public final void m1215h(C0479g c0479g, long j2, long j3) {
        C0490r c0490r = c0479g.f1479a;
        AbstractC1326c.m3059b(c0490r);
        while (true) {
            int i2 = c0490r.f1506c;
            int i3 = c0490r.f1505b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            c0490r = c0490r.f1509f;
            AbstractC1326c.m3059b(c0490r);
        }
        while (j3 > 0) {
            int iMin = (int) Math.min(c0490r.f1506c - r6, j3);
            this.f1490e.update(c0490r.f1504a, (int) (c0490r.f1505b + j2), iMin);
            j3 -= iMin;
            c0490r = c0490r.f1509f;
            AbstractC1326c.m3059b(c0490r);
            j2 = 0;
        }
    }
}
