package p030K1;

import java.io.IOException;
import p014E1.AbstractC0145b;
import p050R1.C0479g;
import p050R1.C0496x;
import p050R1.InterfaceC0493u;

/* renamed from: K1.u */
/* loaded from: classes.dex */
public final class C0325u implements InterfaceC0493u {

    /* renamed from: a */
    public final C0479g f1029a = new C0479g();

    /* renamed from: b */
    public boolean f1030b;

    /* renamed from: c */
    public final boolean f1031c;

    /* renamed from: d */
    public final /* synthetic */ C0327w f1032d;

    public C0325u(C0327w c0327w, boolean z2) {
        this.f1032d = c0327w;
        this.f1031c = z2;
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: a */
    public final C0496x mo480a() {
        return this.f1032d.f1048j;
    }

    @Override // p050R1.InterfaceC0493u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i2;
        C0327w c0327w = this.f1032d;
        byte[] bArr = AbstractC0145b.f495a;
        synchronized (c0327w) {
            if (this.f1030b) {
                return;
            }
            C0327w c0327w2 = this.f1032d;
            synchronized (c0327w2) {
                i2 = c0327w2.f1049k;
            }
            boolean z2 = i2 == 0;
            C0327w c0327w3 = this.f1032d;
            if (!c0327w3.f1046h.f1031c) {
                if (this.f1029a.f1480b > 0) {
                    while (this.f1029a.f1480b > 0) {
                        m858g(true);
                    }
                } else if (z2) {
                    c0327w3.f1052n.m849l(c0327w3.f1051m, true, null, 0L);
                }
            }
            synchronized (this.f1032d) {
                this.f1030b = true;
            }
            this.f1032d.f1052n.flush();
            this.f1032d.m860a();
        }
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: f */
    public final void mo481f(C0479g c0479g, long j2) throws IOException {
        byte[] bArr = AbstractC0145b.f495a;
        C0479g c0479g2 = this.f1029a;
        c0479g2.mo481f(c0479g, j2);
        while (c0479g2.f1480b >= 16384) {
            m858g(false);
        }
    }

    @Override // p050R1.InterfaceC0493u, java.io.Flushable
    public final void flush() throws IOException {
        C0327w c0327w = this.f1032d;
        byte[] bArr = AbstractC0145b.f495a;
        synchronized (c0327w) {
            this.f1032d.m861b();
        }
        while (this.f1029a.f1480b > 0) {
            m858g(false);
            this.f1032d.f1052n.flush();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: g */
    public final void m858g(boolean z2) throws IOException {
        long jMin;
        C0327w c0327w;
        boolean z3;
        int i2;
        synchronized (this.f1032d) {
            this.f1032d.f1048j.m1162i();
            while (true) {
                try {
                    C0327w c0327w2 = this.f1032d;
                    if (c0327w2.f1041c >= c0327w2.f1042d && !this.f1031c && !this.f1030b) {
                        synchronized (c0327w2) {
                            i2 = c0327w2.f1049k;
                        }
                        if (i2 != 0) {
                            break;
                        } else {
                            this.f1032d.m870k();
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f1032d.f1048j.m493l();
            this.f1032d.m861b();
            C0327w c0327w3 = this.f1032d;
            jMin = Math.min(c0327w3.f1042d - c0327w3.f1041c, this.f1029a.f1480b);
            c0327w = this.f1032d;
            c0327w.f1041c += jMin;
            z3 = z2 && jMin == this.f1029a.f1480b;
        }
        c0327w.f1048j.m1162i();
        try {
            C0327w c0327w4 = this.f1032d;
            c0327w4.f1052n.m849l(c0327w4.f1051m, z3, this.f1029a, jMin);
        } finally {
            this.f1032d.f1048j.m493l();
        }
    }
}
