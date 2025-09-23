package p047Q1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p001A0.C0004c;
import p006C.AbstractC0075g;
import p008C1.C0097f;
import p008C1.RunnableC0096e;
import p014E1.AbstractC0145b;
import p021H1.C0193l;
import p050R1.AbstractC0491s;
import p050R1.C0479g;
import p050R1.C0482j;
import p050R1.C0489q;
import p050R1.C0490r;
import p050R1.InterfaceC0494v;
import p131s1.AbstractC1326c;

/* renamed from: Q1.h */
/* loaded from: classes.dex */
public final class C0466h implements Closeable {

    /* renamed from: a */
    public boolean f1422a;

    /* renamed from: b */
    public int f1423b;

    /* renamed from: c */
    public long f1424c;

    /* renamed from: d */
    public boolean f1425d;

    /* renamed from: e */
    public boolean f1426e;

    /* renamed from: f */
    public boolean f1427f;

    /* renamed from: g */
    public final C0479g f1428g;

    /* renamed from: h */
    public final C0479g f1429h;

    /* renamed from: i */
    public C0459a f1430i;

    /* renamed from: j */
    public final byte[] f1431j;

    /* renamed from: k */
    public final C0489q f1432k;

    /* renamed from: l */
    public final C0464f f1433l;

    /* renamed from: m */
    public final boolean f1434m;

    /* renamed from: n */
    public final boolean f1435n;

    public C0466h(C0489q c0489q, C0464f c0464f, boolean z2, boolean z3) {
        AbstractC1326c.m3062e(c0489q, "source");
        this.f1432k = c0489q;
        this.f1433l = c0464f;
        this.f1434m = z2;
        this.f1435n = z3;
        this.f1428g = new C0479g();
        this.f1429h = new C0479g();
        this.f1431j = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C0459a c0459a = this.f1430i;
        if (c0459a != null) {
            c0459a.close();
        }
    }

    /* renamed from: g */
    public final void m1153g() throws IOException {
        String strM1186r;
        short sM1184p;
        C0466h c0466h;
        C0467i c0467i;
        String strM236e;
        int i2 = 1;
        long j2 = this.f1424c;
        if (j2 > 0) {
            this.f1432k.m1225k(this.f1428g, j2);
        }
        switch (this.f1423b) {
            case 8:
                C0479g c0479g = this.f1428g;
                long j3 = c0479g.f1480b;
                if (j3 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                C0193l c0193l = null;
                if (j3 != 0) {
                    sM1184p = c0479g.m1184p();
                    strM1186r = this.f1428g.m1186r();
                    if (sM1184p < 1000 || sM1184p >= 5000) {
                        strM236e = AbstractC0075g.m236e("Code must be in range [1000,5000): ", sM1184p);
                    } else if ((1004 > sM1184p || 1006 < sM1184p) && (1015 > sM1184p || 2999 < sM1184p)) {
                        strM236e = null;
                    } else {
                        strM236e = "Code " + ((int) sM1184p) + " is reserved and may not be used.";
                    }
                    if (strM236e != null) {
                        throw new ProtocolException(strM236e);
                    }
                } else {
                    strM1186r = "";
                    sM1184p = 1005;
                }
                C0464f c0464f = this.f1433l;
                if (sM1184p == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (c0464f) {
                    if (c0464f.f1406m != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    c0464f.f1406m = sM1184p;
                    c0464f.f1407n = strM1186r;
                    if (c0464f.f1405l && c0464f.f1403j.isEmpty()) {
                        C0193l c0193l2 = c0464f.f1401h;
                        c0464f.f1401h = null;
                        c0466h = c0464f.f1397d;
                        c0464f.f1397d = null;
                        c0467i = c0464f.f1398e;
                        c0464f.f1398e = null;
                        c0464f.f1399f.m470e();
                        c0193l = c0193l2;
                    } else {
                        c0466h = null;
                        c0467i = null;
                    }
                }
                try {
                    c0464f.f1411r.getClass();
                    if (c0193l != null) {
                        C0004c c0004c = c0464f.f1411r;
                        c0004c.getClass();
                        C0097f c0097f = (C0097f) c0004c.f7b;
                        c0097f.f237e = false;
                        if (c0097f.f239g != null) {
                            C0097f.m290a(c0097f, new RunnableC0096e(c0004c, i2));
                        }
                    }
                    this.f1422a = true;
                    return;
                } finally {
                    if (c0193l != null) {
                        AbstractC0145b.m391d(c0193l);
                    }
                    if (c0466h != null) {
                        AbstractC0145b.m391d(c0466h);
                    }
                    if (c0467i != null) {
                        AbstractC0145b.m391d(c0467i);
                    }
                }
            case 9:
                C0464f c0464f2 = this.f1433l;
                C0479g c0479g2 = this.f1428g;
                C0482j c0482jM1181m = c0479g2.m1181m(c0479g2.f1480b);
                synchronized (c0464f2) {
                    try {
                        AbstractC1326c.m3062e(c0482jM1181m, "payload");
                        if (!c0464f2.f1408o && (!c0464f2.f1405l || !c0464f2.f1403j.isEmpty())) {
                            c0464f2.f1402i.add(c0482jM1181m);
                            c0464f2.m1151f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                C0464f c0464f3 = this.f1433l;
                C0479g c0479g3 = this.f1428g;
                C0482j c0482jM1181m2 = c0479g3.m1181m(c0479g3.f1480b);
                synchronized (c0464f3) {
                    AbstractC1326c.m3062e(c0482jM1181m2, "payload");
                    c0464f3.f1410q = false;
                }
                return;
            default:
                int i3 = this.f1423b;
                byte[] bArr = AbstractC0145b.f495a;
                String hexString = Integer.toHexString(i3);
                AbstractC1326c.m3061d(hexString, "Integer.toHexString(this)");
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    /* renamed from: h */
    public final void m1154h() throws IOException {
        boolean z2;
        long jM1183o;
        C0466h c0466h = this;
        if (c0466h.f1422a) {
            throw new IOException("closed");
        }
        C0489q c0489q = c0466h.f1432k;
        long jMo1213h = c0489q.f1503c.mo485a().mo1213h();
        InterfaceC0494v interfaceC0494v = c0489q.f1503c;
        interfaceC0494v.mo485a().mo1207b();
        try {
            byte bM1223i = c0489q.m1223i();
            byte[] bArr = AbstractC0145b.f495a;
            interfaceC0494v.mo485a().mo1212g(jMo1213h, TimeUnit.NANOSECONDS);
            int i2 = bM1223i & 15;
            c0466h.f1423b = i2;
            boolean z3 = (bM1223i & 128) != 0;
            c0466h.f1425d = z3;
            boolean z4 = (bM1223i & 8) != 0;
            c0466h.f1426e = z4;
            if (z4 && !z3) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z5 = (bM1223i & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z5) {
                    z2 = false;
                } else {
                    if (!c0466h.f1434m) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z2 = true;
                }
                c0466h.f1427f = z2;
            } else if (z5) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((bM1223i & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((bM1223i & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte bM1223i2 = c0489q.m1223i();
            boolean z6 = (bM1223i2 & 128) != 0;
            if (z6) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j2 = bM1223i2 & 127;
            c0466h.f1424c = j2;
            long j3 = 126;
            C0479g c0479g = c0489q.f1501a;
            if (j2 == j3) {
                c0466h.f1424c = c0489q.m1229o() & 65535;
            } else if (j2 == 127) {
                c0489q.m1232r(8L);
                if (c0479g.f1480b < 8) {
                    throw new EOFException();
                }
                C0490r c0490r = c0479g.f1479a;
                AbstractC1326c.m3059b(c0490r);
                int i3 = c0490r.f1505b;
                int i4 = c0490r.f1506c;
                if (i4 - i3 < 8) {
                    jM1183o = ((c0479g.m1183o() & 4294967295L) << 32) | (4294967295L & c0479g.m1183o());
                } else {
                    byte[] bArr2 = c0490r.f1504a;
                    int i5 = i3 + 7;
                    long j4 = ((bArr2[i3 + 2] & 255) << 40) | ((bArr2[i3] & 255) << 56) | ((bArr2[i3 + 1] & 255) << 48) | ((bArr2[i3 + 3] & 255) << 32) | ((bArr2[i3 + 4] & 255) << 24) | ((bArr2[i3 + 5] & 255) << 16) | ((bArr2[i3 + 6] & 255) << 8);
                    int i6 = i3 + 8;
                    jM1183o = (bArr2[i5] & 255) | j4;
                    c0479g.f1480b -= 8;
                    if (i6 == i4) {
                        c0479g.f1479a = c0490r.m1234a();
                        AbstractC0491s.m1238a(c0490r);
                    } else {
                        c0490r.f1505b = i6;
                    }
                    c0466h = this;
                }
                c0466h.f1424c = jM1183o;
                if (jM1183o < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(c0466h.f1424c);
                    AbstractC1326c.m3061d(hexString, "java.lang.Long.toHexString(this)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (c0466h.f1426e && c0466h.f1424c > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (!z6) {
                return;
            }
            byte[] bArr3 = c0466h.f1431j;
            AbstractC1326c.m3059b(bArr3);
            try {
                c0489q.m1232r(bArr3.length);
                c0479g.m1182n(bArr3);
            } catch (EOFException e3) {
                int i7 = 0;
                while (true) {
                    long j5 = c0479g.f1480b;
                    if (j5 <= 0) {
                        throw e3;
                    }
                    int iM1177i = c0479g.m1177i(i7, (int) j5, bArr3);
                    if (iM1177i == -1) {
                        throw new AssertionError();
                    }
                    i7 += iM1177i;
                }
            }
        } catch (Throwable th) {
            interfaceC0494v.mo485a().mo1212g(jMo1213h, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
