package p021H1;

import java.io.IOException;
import java.net.ProtocolException;
import p011D1.C0121k;
import p050R1.C0479g;
import p050R1.C0496x;
import p050R1.InterfaceC0494v;
import p131s1.AbstractC1326c;

/* renamed from: H1.d */
/* loaded from: classes.dex */
public final class C0185d implements InterfaceC0494v {

    /* renamed from: a */
    public final InterfaceC0494v f666a;

    /* renamed from: b */
    public long f667b;

    /* renamed from: c */
    public boolean f668c;

    /* renamed from: d */
    public boolean f669d;

    /* renamed from: e */
    public boolean f670e;

    /* renamed from: f */
    public final long f671f;

    /* renamed from: g */
    public final /* synthetic */ C0121k f672g;

    public C0185d(C0121k c0121k, InterfaceC0494v interfaceC0494v, long j2) {
        AbstractC1326c.m3062e(interfaceC0494v, "delegate");
        this.f672g = c0121k;
        this.f666a = interfaceC0494v;
        this.f671f = j2;
        this.f668c = true;
        if (j2 == 0) {
            m488h(null);
        }
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: a */
    public final C0496x mo485a() {
        return this.f666a.mo485a();
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: b */
    public final long mo486b(C0479g c0479g, long j2) throws IOException {
        AbstractC1326c.m3062e(c0479g, "sink");
        if (this.f670e) {
            throw new IllegalStateException("closed");
        }
        try {
            long jMo486b = this.f666a.mo486b(c0479g, j2);
            if (this.f668c) {
                this.f668c = false;
                C0121k c0121k = this.f672g;
                c0121k.getClass();
                AbstractC1326c.m3062e((C0190i) c0121k.f353b, "call");
            }
            if (jMo486b == -1) {
                m488h(null);
                return -1L;
            }
            long j3 = this.f667b + jMo486b;
            long j4 = this.f671f;
            if (j4 == -1 || j3 <= j4) {
                this.f667b = j3;
                if (j3 == j4) {
                    m488h(null);
                }
                return jMo486b;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e3) {
            throw m488h(e3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f670e) {
            return;
        }
        this.f670e = true;
        try {
            m487g();
            m488h(null);
        } catch (IOException e3) {
            throw m488h(e3);
        }
    }

    /* renamed from: g */
    public final void m487g() throws IOException {
        this.f666a.close();
    }

    /* renamed from: h */
    public final IOException m488h(IOException iOException) {
        if (this.f669d) {
            return iOException;
        }
        this.f669d = true;
        C0121k c0121k = this.f672g;
        if (iOException == null && this.f668c) {
            this.f668c = false;
            c0121k.getClass();
            AbstractC1326c.m3062e((C0190i) c0121k.f353b, "call");
        }
        return c0121k.m333a(true, false, iOException);
    }

    public final String toString() {
        return C0185d.class.getSimpleName() + '(' + this.f666a + ')';
    }
}
