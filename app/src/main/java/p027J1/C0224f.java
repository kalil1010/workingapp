package p027J1;

import java.util.zip.Deflater;
import p014E1.AbstractC0145b;
import p021H1.C0197p;
import p033L1.AbstractC0356d;
import p050R1.AbstractC0491s;
import p050R1.C0479g;
import p050R1.C0483k;
import p050R1.C0488p;
import p050R1.C0490r;
import p050R1.C0496x;
import p050R1.InterfaceC0493u;
import p131s1.AbstractC1326c;

/* renamed from: J1.f */
/* loaded from: classes.dex */
public final class C0224f implements InterfaceC0493u {

    /* renamed from: a */
    public final /* synthetic */ int f797a = 0;

    /* renamed from: b */
    public boolean f798b;

    /* renamed from: c */
    public final Object f799c;

    /* renamed from: d */
    public final Object f800d;

    public C0224f(C0479g c0479g, Deflater deflater) {
        this.f799c = new C0488p(c0479g);
        this.f800d = deflater;
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: a */
    public final C0496x mo480a() {
        switch (this.f797a) {
            case 0:
                return (C0483k) this.f799c;
            default:
                return ((C0488p) this.f799c).f1500c.mo480a();
        }
    }

    @Override // p050R1.InterfaceC0493u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f797a) {
            case 0:
                if (this.f798b) {
                    return;
                }
                this.f798b = true;
                C0197p c0197p = (C0197p) this.f800d;
                c0197p.getClass();
                C0483k c0483k = (C0483k) this.f799c;
                C0496x c0496x = c0483k.f1485e;
                c0483k.f1485e = C0496x.f1516d;
                c0496x.mo1206a();
                c0496x.mo1207b();
                c0197p.f734a = 3;
                return;
            default:
                Deflater deflater = (Deflater) this.f800d;
                if (this.f798b) {
                    return;
                }
                try {
                    deflater.finish();
                    m609g(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((C0488p) this.f799c).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.f798b = true;
                if (th != null) {
                    throw th;
                }
                return;
        }
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: f */
    public final void mo481f(C0479g c0479g, long j2) {
        switch (this.f797a) {
            case 0:
                if (this.f798b) {
                    throw new IllegalStateException("closed");
                }
                AbstractC0145b.m390c(c0479g.f1480b, 0L, j2);
                ((C0488p) ((C0197p) this.f800d).f740g).mo481f(c0479g, j2);
                return;
            default:
                AbstractC0356d.m955e(c0479g.f1480b, 0L, j2);
                while (j2 > 0) {
                    C0490r c0490r = c0479g.f1479a;
                    AbstractC1326c.m3059b(c0490r);
                    int iMin = (int) Math.min(j2, c0490r.f1506c - c0490r.f1505b);
                    ((Deflater) this.f800d).setInput(c0490r.f1504a, c0490r.f1505b, iMin);
                    m609g(false);
                    long j3 = iMin;
                    c0479g.f1480b -= j3;
                    int i2 = c0490r.f1505b + iMin;
                    c0490r.f1505b = i2;
                    if (i2 == c0490r.f1506c) {
                        c0479g.f1479a = c0490r.m1234a();
                        AbstractC0491s.m1238a(c0490r);
                    }
                    j2 -= j3;
                }
                return;
        }
    }

    @Override // p050R1.InterfaceC0493u, java.io.Flushable
    public final void flush() {
        switch (this.f797a) {
            case 0:
                if (!this.f798b) {
                    ((C0488p) ((C0197p) this.f800d).f740g).flush();
                    break;
                }
                break;
            default:
                m609g(true);
                ((C0488p) this.f799c).flush();
                break;
        }
    }

    /* renamed from: g */
    public void m609g(boolean z2) {
        C0490r c0490rM1189u;
        int iDeflate;
        C0488p c0488p = (C0488p) this.f799c;
        C0479g c0479g = c0488p.f1498a;
        while (true) {
            c0490rM1189u = c0479g.m1189u(1);
            Deflater deflater = (Deflater) this.f800d;
            byte[] bArr = c0490rM1189u.f1504a;
            if (z2) {
                int i2 = c0490rM1189u.f1506c;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                int i3 = c0490rM1189u.f1506c;
                iDeflate = deflater.deflate(bArr, i3, 8192 - i3);
            }
            if (iDeflate > 0) {
                c0490rM1189u.f1506c += iDeflate;
                c0479g.f1480b += iDeflate;
                c0488p.m1218g();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c0490rM1189u.f1505b == c0490rM1189u.f1506c) {
            c0479g.f1479a = c0490rM1189u.m1234a();
            AbstractC0491s.m1238a(c0490rM1189u);
        }
    }

    public String toString() {
        switch (this.f797a) {
            case 1:
                return "DeflaterSink(" + ((C0488p) this.f799c) + ')';
            default:
                return super.toString();
        }
    }

    public C0224f(C0197p c0197p) {
        this.f800d = c0197p;
        this.f799c = new C0483k(((C0488p) c0197p.f740g).f1500c.mo480a());
    }
}
