package p021H1;

import java.io.IOException;
import java.net.ProtocolException;
import p011D1.C0121k;
import p050R1.C0479g;
import p050R1.C0496x;
import p050R1.InterfaceC0493u;
import p131s1.AbstractC1326c;

/* renamed from: H1.c */
/* loaded from: classes.dex */
public final class C0184c implements InterfaceC0493u {

    /* renamed from: a */
    public final InterfaceC0493u f660a;

    /* renamed from: b */
    public boolean f661b;

    /* renamed from: c */
    public long f662c;

    /* renamed from: d */
    public boolean f663d;

    /* renamed from: e */
    public final long f664e;

    /* renamed from: f */
    public final /* synthetic */ C0121k f665f;

    public C0184c(C0121k c0121k, InterfaceC0493u interfaceC0493u, long j2) {
        AbstractC1326c.m3062e(interfaceC0493u, "delegate");
        this.f665f = c0121k;
        this.f660a = interfaceC0493u;
        this.f664e = j2;
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: a */
    public final C0496x mo480a() {
        return this.f660a.mo480a();
    }

    @Override // p050R1.InterfaceC0493u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f663d) {
            return;
        }
        this.f663d = true;
        long j2 = this.f664e;
        if (j2 != -1 && this.f662c != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m482g();
            m483h(null);
        } catch (IOException e3) {
            throw m483h(e3);
        }
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: f */
    public final void mo481f(C0479g c0479g, long j2) throws IOException {
        if (this.f663d) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f664e;
        if (j3 == -1 || this.f662c + j2 <= j3) {
            try {
                this.f660a.mo481f(c0479g, j2);
                this.f662c += j2;
                return;
            } catch (IOException e3) {
                throw m483h(e3);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.f662c + j2));
    }

    @Override // p050R1.InterfaceC0493u, java.io.Flushable
    public final void flush() throws IOException {
        try {
            m484i();
        } catch (IOException e3) {
            throw m483h(e3);
        }
    }

    /* renamed from: g */
    public final void m482g() {
        this.f660a.close();
    }

    /* renamed from: h */
    public final IOException m483h(IOException iOException) {
        if (this.f661b) {
            return iOException;
        }
        this.f661b = true;
        return this.f665f.m333a(false, true, iOException);
    }

    /* renamed from: i */
    public final void m484i() {
        this.f660a.flush();
    }

    public final String toString() {
        return C0184c.class.getSimpleName() + '(' + this.f660a + ')';
    }
}
