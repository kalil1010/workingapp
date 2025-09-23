package p050R1;

import java.io.IOException;
import java.io.InputStream;
import p021H1.C0189h;
import p093e2.AbstractC0901d;
import p131s1.AbstractC1326c;

/* renamed from: R1.d */
/* loaded from: classes.dex */
public final class C0476d implements InterfaceC0494v {

    /* renamed from: a */
    public final /* synthetic */ int f1463a;

    /* renamed from: b */
    public final Object f1464b;

    /* renamed from: c */
    public final Object f1465c;

    public /* synthetic */ C0476d(Object obj, int i2, Object obj2) {
        this.f1463a = i2;
        this.f1464b = obj;
        this.f1465c = obj2;
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: a */
    public final C0496x mo485a() {
        switch (this.f1463a) {
            case 0:
                return (C0189h) this.f1464b;
            default:
                return (C0496x) this.f1465c;
        }
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: b */
    public final long mo486b(C0479g c0479g, long j2) throws IOException {
        switch (this.f1463a) {
            case 0:
                AbstractC1326c.m3062e(c0479g, "sink");
                C0189h c0189h = (C0189h) this.f1464b;
                c0189h.m1162i();
                try {
                    long jMo486b = ((C0476d) this.f1465c).mo486b(c0479g, j2);
                    if (c0189h.m1163j()) {
                        throw c0189h.m494m(null);
                    }
                    return jMo486b;
                } catch (IOException e3) {
                    if (c0189h.m1163j()) {
                        throw c0189h.m494m(e3);
                    }
                    throw e3;
                } finally {
                    c0189h.m1163j();
                }
            default:
                AbstractC1326c.m3062e(c0479g, "sink");
                if (j2 == 0) {
                    return 0L;
                }
                if (!(j2 >= 0)) {
                    throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
                }
                try {
                    ((C0496x) this.f1465c).mo1211f();
                    C0490r c0490rM1189u = c0479g.m1189u(1);
                    int i2 = ((InputStream) this.f1464b).read(c0490rM1189u.f1504a, c0490rM1189u.f1506c, (int) Math.min(j2, 8192 - c0490rM1189u.f1506c));
                    if (i2 == -1) {
                        if (c0490rM1189u.f1505b == c0490rM1189u.f1506c) {
                            c0479g.f1479a = c0490rM1189u.m1234a();
                            AbstractC0491s.m1238a(c0490rM1189u);
                        }
                        return -1L;
                    }
                    c0490rM1189u.f1506c += i2;
                    long j3 = i2;
                    c0479g.f1480b += j3;
                    return j3;
                } catch (AssertionError e4) {
                    if (AbstractC0901d.m2283M(e4)) {
                        throw new IOException(e4);
                    }
                    throw e4;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f1463a) {
            case 0:
                C0189h c0189h = (C0189h) this.f1464b;
                c0189h.m1162i();
                try {
                    ((C0476d) this.f1465c).close();
                    if (c0189h.m1163j()) {
                        throw c0189h.m494m(null);
                    }
                    return;
                } catch (IOException e3) {
                    if (!c0189h.m1163j()) {
                        throw e3;
                    }
                    throw c0189h.m494m(e3);
                } finally {
                    c0189h.m1163j();
                }
            default:
                ((InputStream) this.f1464b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f1463a) {
            case 0:
                return "AsyncTimeout.source(" + ((C0476d) this.f1465c) + ')';
            default:
                return "source(" + ((InputStream) this.f1464b) + ')';
        }
    }
}
