package p050R1;

import java.io.IOException;
import java.io.OutputStream;
import p021H1.C0189h;
import p033L1.AbstractC0356d;
import p131s1.AbstractC1326c;

/* renamed from: R1.c */
/* loaded from: classes.dex */
public final class C0475c implements InterfaceC0493u {

    /* renamed from: a */
    public final /* synthetic */ int f1460a = 0;

    /* renamed from: b */
    public final C0189h f1461b;

    /* renamed from: c */
    public final Object f1462c;

    public C0475c(OutputStream outputStream, C0189h c0189h) {
        this.f1462c = outputStream;
        this.f1461b = c0189h;
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: a */
    public final C0496x mo480a() {
        switch (this.f1460a) {
        }
        return this.f1461b;
    }

    @Override // p050R1.InterfaceC0493u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f1460a) {
            case 0:
                C0189h c0189h = this.f1461b;
                c0189h.m1162i();
                try {
                    ((C0475c) this.f1462c).close();
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
                ((OutputStream) this.f1462c).close();
                return;
        }
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: f */
    public final void mo481f(C0479g c0479g, long j2) throws IOException {
        switch (this.f1460a) {
            case 0:
                AbstractC0356d.m955e(c0479g.f1480b, 0L, j2);
                long j3 = j2;
                while (true) {
                    long j4 = 0;
                    if (j3 <= 0) {
                        return;
                    }
                    C0490r c0490r = c0479g.f1479a;
                    AbstractC1326c.m3059b(c0490r);
                    while (true) {
                        if (j4 < 65536) {
                            j4 += c0490r.f1506c - c0490r.f1505b;
                            if (j4 >= j3) {
                                j4 = j3;
                            } else {
                                c0490r = c0490r.f1509f;
                                AbstractC1326c.m3059b(c0490r);
                            }
                        }
                    }
                    C0189h c0189h = this.f1461b;
                    c0189h.m1162i();
                    try {
                        try {
                            ((C0475c) this.f1462c).mo481f(c0479g, j4);
                            if (c0189h.m1163j()) {
                                throw c0189h.m494m(null);
                            }
                            j3 -= j4;
                        } catch (IOException e3) {
                            if (!c0189h.m1163j()) {
                                throw e3;
                            }
                            throw c0189h.m494m(e3);
                        }
                    } catch (Throwable th) {
                        c0189h.m1163j();
                        throw th;
                    }
                }
            default:
                AbstractC0356d.m955e(c0479g.f1480b, 0L, j2);
                while (j2 > 0) {
                    this.f1461b.mo1211f();
                    C0490r c0490r2 = c0479g.f1479a;
                    AbstractC1326c.m3059b(c0490r2);
                    int iMin = (int) Math.min(j2, c0490r2.f1506c - c0490r2.f1505b);
                    ((OutputStream) this.f1462c).write(c0490r2.f1504a, c0490r2.f1505b, iMin);
                    int i2 = c0490r2.f1505b + iMin;
                    c0490r2.f1505b = i2;
                    long j5 = iMin;
                    j2 -= j5;
                    c0479g.f1480b -= j5;
                    if (i2 == c0490r2.f1506c) {
                        c0479g.f1479a = c0490r2.m1234a();
                        AbstractC0491s.m1238a(c0490r2);
                    }
                }
                return;
        }
    }

    @Override // p050R1.InterfaceC0493u, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f1460a) {
            case 0:
                C0189h c0189h = this.f1461b;
                c0189h.m1162i();
                try {
                    ((C0475c) this.f1462c).flush();
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
                ((OutputStream) this.f1462c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f1460a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0475c) this.f1462c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f1462c) + ')';
        }
    }

    public C0475c(C0189h c0189h, C0475c c0475c) {
        this.f1461b = c0189h;
        this.f1462c = c0475c;
    }
}
