package p050R1;

import java.nio.ByteBuffer;
import p131s1.AbstractC1326c;

/* renamed from: R1.p */
/* loaded from: classes.dex */
public final class C0488p implements InterfaceC0480h {

    /* renamed from: a */
    public final C0479g f1498a;

    /* renamed from: b */
    public boolean f1499b;

    /* renamed from: c */
    public final InterfaceC0493u f1500c;

    public C0488p(InterfaceC0493u interfaceC0493u) {
        AbstractC1326c.m3062e(interfaceC0493u, "sink");
        this.f1500c = interfaceC0493u;
        this.f1498a = new C0479g();
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: a */
    public final C0496x mo480a() {
        return this.f1500c.mo480a();
    }

    @Override // p050R1.InterfaceC0493u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC0493u interfaceC0493u = this.f1500c;
        if (this.f1499b) {
            return;
        }
        try {
            C0479g c0479g = this.f1498a;
            long j2 = c0479g.f1480b;
            if (j2 > 0) {
                interfaceC0493u.mo481f(c0479g, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC0493u.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f1499b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p050R1.InterfaceC0480h
    /* renamed from: d */
    public final InterfaceC0480h mo1173d(String str) {
        AbstractC1326c.m3062e(str, "string");
        if (this.f1499b) {
            throw new IllegalStateException("closed");
        }
        this.f1498a.m1169D(str);
        m1218g();
        return this;
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: f */
    public final void mo481f(C0479g c0479g, long j2) {
        AbstractC1326c.m3062e(c0479g, "source");
        if (this.f1499b) {
            throw new IllegalStateException("closed");
        }
        this.f1498a.mo481f(c0479g, j2);
        m1218g();
    }

    @Override // p050R1.InterfaceC0493u, java.io.Flushable
    public final void flush() {
        if (this.f1499b) {
            throw new IllegalStateException("closed");
        }
        C0479g c0479g = this.f1498a;
        long j2 = c0479g.f1480b;
        InterfaceC0493u interfaceC0493u = this.f1500c;
        if (j2 > 0) {
            interfaceC0493u.mo481f(c0479g, j2);
        }
        interfaceC0493u.flush();
    }

    /* renamed from: g */
    public final InterfaceC0480h m1218g() {
        if (this.f1499b) {
            throw new IllegalStateException("closed");
        }
        C0479g c0479g = this.f1498a;
        long j2 = c0479g.f1480b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            C0490r c0490r = c0479g.f1479a;
            AbstractC1326c.m3059b(c0490r);
            C0490r c0490r2 = c0490r.f1510g;
            AbstractC1326c.m3059b(c0490r2);
            if (c0490r2.f1506c < 8192 && c0490r2.f1508e) {
                j2 -= r6 - c0490r2.f1505b;
            }
        }
        if (j2 > 0) {
            this.f1500c.mo481f(c0479g, j2);
        }
        return this;
    }

    /* renamed from: h */
    public final InterfaceC0480h m1219h(int i2) {
        if (this.f1499b) {
            throw new IllegalStateException("closed");
        }
        this.f1498a.m1194z(i2);
        m1218g();
        return this;
    }

    /* renamed from: i */
    public final InterfaceC0480h m1220i(int i2) {
        if (this.f1499b) {
            throw new IllegalStateException("closed");
        }
        this.f1498a.m1167B(i2);
        m1218g();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1499b;
    }

    public final String toString() {
        return "buffer(" + this.f1500c + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1326c.m3062e(byteBuffer, "source");
        if (this.f1499b) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f1498a.write(byteBuffer);
        m1218g();
        return iWrite;
    }
}
