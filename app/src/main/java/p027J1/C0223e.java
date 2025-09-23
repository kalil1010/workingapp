package p027J1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p014E1.AbstractC0145b;
import p021H1.C0194m;
import p021H1.C0197p;
import p050R1.C0479g;
import p131s1.AbstractC1326c;

/* renamed from: J1.e */
/* loaded from: classes.dex */
public final class C0223e extends AbstractC0220b {

    /* renamed from: d */
    public long f795d;

    /* renamed from: e */
    public final /* synthetic */ C0197p f796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0223e(C0197p c0197p, long j2) {
        super(c0197p);
        this.f796e = c0197p;
        this.f795d = j2;
        if (j2 == 0) {
            m608g();
        }
    }

    @Override // p027J1.AbstractC0220b, p050R1.InterfaceC0494v
    /* renamed from: b */
    public final long mo486b(C0479g c0479g, long j2) throws IOException {
        AbstractC1326c.m3062e(c0479g, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f786b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f795d;
        if (j3 == 0) {
            return -1L;
        }
        long jMo486b = super.mo486b(c0479g, Math.min(j3, j2));
        if (jMo486b == -1) {
            ((C0194m) this.f796e.f738e).m516k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m608g();
            throw protocolException;
        }
        long j4 = this.f795d - jMo486b;
        this.f795d = j4;
        if (j4 == 0) {
            m608g();
        }
        return jMo486b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f786b) {
            return;
        }
        if (this.f795d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!AbstractC0145b.m396i(this)) {
                ((C0194m) this.f796e.f738e).m516k();
                m608g();
            }
        }
        this.f786b = true;
    }
}
