package p030K1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p014E1.AbstractC0145b;
import p050R1.C0479g;
import p050R1.C0482j;
import p050R1.C0489q;
import p050R1.C0496x;
import p050R1.InterfaceC0494v;
import p131s1.AbstractC1326c;

/* renamed from: K1.s */
/* loaded from: classes.dex */
public final class C0323s implements InterfaceC0494v {

    /* renamed from: a */
    public int f1019a;

    /* renamed from: b */
    public int f1020b;

    /* renamed from: c */
    public int f1021c;

    /* renamed from: d */
    public int f1022d;

    /* renamed from: e */
    public int f1023e;

    /* renamed from: f */
    public final C0489q f1024f;

    public C0323s(C0489q c0489q) {
        AbstractC1326c.m3062e(c0489q, "source");
        this.f1024f = c0489q;
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: a */
    public final C0496x mo485a() {
        return this.f1024f.f1503c.mo485a();
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: b */
    public final long mo486b(C0479g c0479g, long j2) throws IOException {
        int i2;
        int iM1227m;
        AbstractC1326c.m3062e(c0479g, "sink");
        do {
            int i3 = this.f1022d;
            C0489q c0489q = this.f1024f;
            if (i3 == 0) {
                c0489q.m1233s(this.f1023e);
                this.f1023e = 0;
                if ((this.f1020b & 4) == 0) {
                    i2 = this.f1021c;
                    int iM408u = AbstractC0145b.m408u(c0489q);
                    this.f1022d = iM408u;
                    this.f1019a = iM408u;
                    int iM1223i = c0489q.m1223i() & 255;
                    this.f1020b = c0489q.m1223i() & 255;
                    Logger logger = C0324t.f1025d;
                    if (logger.isLoggable(Level.FINE)) {
                        C0482j c0482j = AbstractC0310f.f957a;
                        logger.fine(AbstractC0310f.m843a(true, this.f1021c, this.f1019a, iM1223i, this.f1020b));
                    }
                    iM1227m = c0489q.m1227m() & Integer.MAX_VALUE;
                    this.f1021c = iM1227m;
                    if (iM1223i != 9) {
                        throw new IOException(iM1223i + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jMo486b = c0489q.mo486b(c0479g, Math.min(j2, i3));
                if (jMo486b != -1) {
                    this.f1022d -= (int) jMo486b;
                    return jMo486b;
                }
            }
            return -1L;
        } while (iM1227m == i2);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
