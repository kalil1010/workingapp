package p030K1;

import java.io.IOException;
import p006C.AbstractC0075g;
import p014E1.AbstractC0145b;
import p050R1.C0479g;
import p050R1.C0496x;
import p050R1.InterfaceC0494v;
import p131s1.AbstractC1326c;

/* renamed from: K1.v */
/* loaded from: classes.dex */
public final class C0326v implements InterfaceC0494v {

    /* renamed from: a */
    public final C0479g f1033a = new C0479g();

    /* renamed from: b */
    public final C0479g f1034b = new C0479g();

    /* renamed from: c */
    public boolean f1035c;

    /* renamed from: d */
    public final long f1036d;

    /* renamed from: e */
    public boolean f1037e;

    /* renamed from: f */
    public final /* synthetic */ C0327w f1038f;

    public C0326v(C0327w c0327w, long j2, boolean z2) {
        this.f1038f = c0327w;
        this.f1036d = j2;
        this.f1037e = z2;
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: a */
    public final C0496x mo485a() {
        return this.f1038f.f1047i;
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: b */
    public final long mo486b(C0479g c0479g, long j2) throws Throwable {
        int i2;
        Throwable c0304c;
        long j3;
        long jMo486b;
        boolean z2;
        int i3;
        AbstractC1326c.m3062e(c0479g, "sink");
        long j4 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        while (true) {
            synchronized (this.f1038f) {
                this.f1038f.f1047i.m1162i();
                try {
                    C0327w c0327w = this.f1038f;
                    synchronized (c0327w) {
                        i2 = c0327w.f1049k;
                    }
                    if (i2 != 0) {
                        c0304c = this.f1038f.f1050l;
                        if (c0304c == null) {
                            C0327w c0327w2 = this.f1038f;
                            synchronized (c0327w2) {
                                i3 = c0327w2.f1049k;
                            }
                            AbstractC0075g.m239h(i3);
                            c0304c = new C0304C(i3);
                        }
                    } else {
                        c0304c = null;
                    }
                    if (this.f1035c) {
                        throw new IOException("stream closed");
                    }
                    C0479g c0479g2 = this.f1034b;
                    long j5 = c0479g2.f1480b;
                    if (j5 > j4) {
                        jMo486b = c0479g2.mo486b(c0479g, Math.min(j2, j5));
                        C0327w c0327w3 = this.f1038f;
                        long j6 = c0327w3.f1039a + jMo486b;
                        c0327w3.f1039a = j6;
                        j3 = -1;
                        long j7 = j6 - c0327w3.f1040b;
                        if (c0304c == null && j7 >= c0327w3.f1052n.f1001q.m829a() / 2) {
                            C0327w c0327w4 = this.f1038f;
                            c0327w4.f1052n.m851n(c0327w4.f1051m, j7);
                            C0327w c0327w5 = this.f1038f;
                            c0327w5.f1040b = c0327w5.f1039a;
                        }
                    } else {
                        j3 = -1;
                        if (this.f1037e || c0304c != null) {
                            jMo486b = -1;
                        } else {
                            this.f1038f.m870k();
                            z2 = true;
                            jMo486b = -1;
                        }
                    }
                    z2 = false;
                } finally {
                    this.f1038f.f1047i.m493l();
                }
            }
            if (!z2) {
                if (jMo486b != j3) {
                    m859g(jMo486b);
                    return jMo486b;
                }
                if (c0304c == null) {
                    return j3;
                }
                throw c0304c;
            }
            j4 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        synchronized (this.f1038f) {
            this.f1035c = true;
            C0479g c0479g = this.f1034b;
            j2 = c0479g.f1480b;
            c0479g.m1187s(j2);
            C0327w c0327w = this.f1038f;
            if (c0327w == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
            c0327w.notifyAll();
        }
        if (j2 > 0) {
            m859g(j2);
        }
        this.f1038f.m860a();
    }

    /* renamed from: g */
    public final void m859g(long j2) {
        byte[] bArr = AbstractC0145b.f495a;
        this.f1038f.f1052n.m848k(j2);
    }
}
