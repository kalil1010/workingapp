package p047Q1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import p001A0.C0004c;
import p001A0.RunnableC0005d;
import p008C1.C0097f;
import p011D1.C0121k;
import p011D1.C0132v;
import p011D1.C0134x;
import p011D1.EnumC0131u;
import p014E1.AbstractC0145b;
import p019G1.C0169c;
import p019G1.C0170d;
import p021H1.C0190i;
import p021H1.C0193l;
import p030K1.C0311g;
import p050R1.C0479g;
import p050R1.C0482j;
import p050R1.C0485m;
import p055T0.C0511e;
import p093e2.AbstractC0901d;
import p131s1.AbstractC1326c;

/* renamed from: Q1.f */
/* loaded from: classes.dex */
public final class C0464f {

    /* renamed from: w */
    public static final List f1393w = AbstractC0901d.m2287T(EnumC0131u.HTTP_1_1);

    /* renamed from: a */
    public final String f1394a;

    /* renamed from: b */
    public C0190i f1395b;

    /* renamed from: c */
    public C0463e f1396c;

    /* renamed from: d */
    public C0466h f1397d;

    /* renamed from: e */
    public C0467i f1398e;

    /* renamed from: f */
    public final C0169c f1399f;

    /* renamed from: g */
    public String f1400g;

    /* renamed from: h */
    public C0193l f1401h;

    /* renamed from: i */
    public final ArrayDeque f1402i;

    /* renamed from: j */
    public final ArrayDeque f1403j;

    /* renamed from: k */
    public long f1404k;

    /* renamed from: l */
    public boolean f1405l;

    /* renamed from: m */
    public int f1406m;

    /* renamed from: n */
    public String f1407n;

    /* renamed from: o */
    public boolean f1408o;

    /* renamed from: p */
    public int f1409p;

    /* renamed from: q */
    public boolean f1410q;

    /* renamed from: r */
    public final C0004c f1411r;

    /* renamed from: s */
    public final Random f1412s;

    /* renamed from: t */
    public final long f1413t;

    /* renamed from: u */
    public C0465g f1414u;

    /* renamed from: v */
    public final long f1415v;

    public C0464f(C0170d c0170d, C0132v c0132v, C0004c c0004c, Random random, long j2, long j3) {
        AbstractC1326c.m3062e(c0170d, "taskRunner");
        AbstractC1326c.m3062e(c0132v, "originalRequest");
        AbstractC1326c.m3062e(c0004c, "listener");
        this.f1411r = c0004c;
        this.f1412s = random;
        this.f1413t = j2;
        this.f1414u = null;
        this.f1415v = j3;
        this.f1399f = c0170d.m475e();
        this.f1402i = new ArrayDeque();
        this.f1403j = new ArrayDeque();
        this.f1406m = -1;
        String str = c0132v.f450b;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(("Request must be GET: " + str).toString());
        }
        C0482j c0482j = C0482j.f1481d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f1394a = C0511e.m1278k(bArr).mo1195a();
    }

    /* renamed from: a */
    public final void m1146a(C0134x c0134x, C0121k c0121k) {
        int i2 = c0134x.f471d;
        if (i2 != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + i2 + ' ' + c0134x.f470c + '\'');
        }
        String strM370g = C0134x.m370g(c0134x, "Connection");
        if (!"Upgrade".equalsIgnoreCase(strM370g)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strM370g + '\'');
        }
        String strM370g2 = C0134x.m370g(c0134x, "Upgrade");
        if (!"websocket".equalsIgnoreCase(strM370g2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strM370g2 + '\'');
        }
        String strM370g3 = C0134x.m370g(c0134x, "Sec-WebSocket-Accept");
        C0482j c0482j = C0482j.f1481d;
        String strMo1195a = C0511e.m1275e(this.f1394a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").mo1196b("SHA-1").mo1195a();
        if (AbstractC1326c.m3058a(strMo1195a, strM370g3)) {
            if (c0121k == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strMo1195a + "' but was '" + strM370g3 + '\'');
    }

    /* renamed from: b */
    public final void m1147b(String str, int i2) {
        String str2;
        synchronized (this) {
            C0482j c0482jM1275e = null;
            try {
                if (i2 < 1000 || i2 >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i2;
                } else if ((1004 > i2 || 1006 < i2) && (1015 > i2 || 2999 < i2)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i2 + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    C0482j c0482j = C0482j.f1481d;
                    c0482jM1275e = C0511e.m1275e(str);
                    if (c0482jM1275e.f1484c.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f1408o && !this.f1405l) {
                    this.f1405l = true;
                    this.f1403j.add(new C0461c(i2, c0482jM1275e));
                    m1151f();
                }
            } finally {
            }
        }
    }

    /* renamed from: c */
    public final void m1148c(Exception exc) {
        synchronized (this) {
            if (this.f1408o) {
                return;
            }
            this.f1408o = true;
            C0193l c0193l = this.f1401h;
            this.f1401h = null;
            C0466h c0466h = this.f1397d;
            this.f1397d = null;
            C0467i c0467i = this.f1398e;
            this.f1398e = null;
            this.f1399f.m470e();
            try {
                C0004c c0004c = this.f1411r;
                c0004c.getClass();
                exc.printStackTrace();
                C0097f c0097f = (C0097f) c0004c.f7b;
                c0097f.f237e = false;
                if (c0097f.f239g != null) {
                    C0097f.m290a(c0097f, new RunnableC0005d(c0004c, exc, 4));
                }
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
        }
    }

    /* renamed from: d */
    public final void m1149d(String str, C0193l c0193l) {
        AbstractC1326c.m3062e(str, "name");
        C0465g c0465g = this.f1414u;
        AbstractC1326c.m3059b(c0465g);
        synchronized (this) {
            try {
                this.f1400g = str;
                this.f1401h = c0193l;
                this.f1398e = new C0467i(c0193l.f710b, this.f1412s, c0465g.f1416a, c0465g.f1418c, this.f1415v);
                this.f1396c = new C0463e(this);
                long j2 = this.f1413t;
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                    this.f1399f.m468c(new C0311g(str.concat(" ping"), nanos, this), nanos);
                }
                if (!this.f1403j.isEmpty()) {
                    m1151f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1397d = new C0466h(c0193l.f709a, this, c0465g.f1416a, c0465g.f1420e);
    }

    /* renamed from: e */
    public final void m1150e() {
        while (this.f1406m == -1) {
            C0466h c0466h = this.f1397d;
            AbstractC1326c.m3059b(c0466h);
            c0466h.m1154h();
            if (!c0466h.f1426e) {
                int i2 = c0466h.f1423b;
                if (i2 != 1 && i2 != 2) {
                    byte[] bArr = AbstractC0145b.f495a;
                    String hexString = Integer.toHexString(i2);
                    AbstractC1326c.m3061d(hexString, "Integer.toHexString(this)");
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (!c0466h.f1422a) {
                    long j2 = c0466h.f1424c;
                    C0479g c0479g = c0466h.f1429h;
                    if (j2 > 0) {
                        c0466h.f1432k.m1225k(c0479g, j2);
                    }
                    if (c0466h.f1425d) {
                        if (c0466h.f1427f) {
                            C0459a c0459a = c0466h.f1430i;
                            if (c0459a == null) {
                                c0459a = new C0459a(1, c0466h.f1435n);
                                c0466h.f1430i = c0459a;
                            }
                            C0479g c0479g2 = c0459a.f1383b;
                            if (c0479g2.f1480b != 0) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            Inflater inflater = (Inflater) c0459a.f1385d;
                            if (c0459a.f1384c) {
                                inflater.reset();
                            }
                            c0479g2.m1193y(c0479g);
                            c0479g2.m1167B(65535);
                            long bytesRead = inflater.getBytesRead() + c0479g2.f1480b;
                            do {
                                ((C0485m) c0459a.f1386e).m1216g(c0479g, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        C0004c c0004c = c0466h.f1433l.f1411r;
                        if (i2 == 1) {
                            String strM1186r = c0479g.m1186r();
                            c0004c.getClass();
                            C0097f c0097f = (C0097f) c0004c.f7b;
                            if (c0097f.f239g != null) {
                                C0097f.m290a(c0097f, new RunnableC0005d(c0004c, strM1186r, 3));
                            }
                        } else {
                            AbstractC1326c.m3062e(c0479g.m1181m(c0479g.f1480b), "bytes");
                            c0004c.getClass();
                        }
                    } else {
                        while (!c0466h.f1422a) {
                            c0466h.m1154h();
                            if (!c0466h.f1426e) {
                                break;
                            } else {
                                c0466h.m1153g();
                            }
                        }
                        if (c0466h.f1423b != 0) {
                            int i3 = c0466h.f1423b;
                            byte[] bArr2 = AbstractC0145b.f495a;
                            String hexString2 = Integer.toHexString(i3);
                            AbstractC1326c.m3061d(hexString2, "Integer.toHexString(this)");
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    }
                }
                throw new IOException("closed");
            }
            c0466h.m1153g();
        }
    }

    /* renamed from: f */
    public final void m1151f() {
        byte[] bArr = AbstractC0145b.f495a;
        C0463e c0463e = this.f1396c;
        if (c0463e != null) {
            this.f1399f.m468c(c0463e, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #3 {all -> 0x008b, blocks: (B:31:0x0081, B:34:0x008e, B:37:0x0094, B:38:0x00a1, B:40:0x00ad, B:43:0x00b1, B:44:0x00b2, B:45:0x00b3, B:46:0x00ba, B:47:0x00bb, B:50:0x00c1, B:64:0x00e6, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:73:0x0122, B:75:0x0126, B:77:0x0138, B:86:0x0151, B:87:0x0153, B:88:0x0154, B:89:0x015d, B:65:0x00fa, B:90:0x015e, B:91:0x0165, B:92:0x0166, B:93:0x016b, B:72:0x011f, B:39:0x00a2), top: B:108:0x007f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[Catch: all -> 0x008b, TryCatch #3 {all -> 0x008b, blocks: (B:31:0x0081, B:34:0x008e, B:37:0x0094, B:38:0x00a1, B:40:0x00ad, B:43:0x00b1, B:44:0x00b2, B:45:0x00b3, B:46:0x00ba, B:47:0x00bb, B:50:0x00c1, B:64:0x00e6, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:73:0x0122, B:75:0x0126, B:77:0x0138, B:86:0x0151, B:87:0x0153, B:88:0x0154, B:89:0x015d, B:65:0x00fa, B:90:0x015e, B:91:0x0165, B:92:0x0166, B:93:0x016b, B:72:0x011f, B:39:0x00a2), top: B:108:0x007f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Q1.i] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1152g() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p047Q1.C0464f.m1152g():boolean");
    }
}
