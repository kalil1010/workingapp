package p027J1;

import java.io.IOException;
import p050R1.C0479g;
import p131s1.AbstractC1326c;

/* renamed from: J1.g */
/* loaded from: classes.dex */
public final class C0225g extends AbstractC0220b {

    /* renamed from: d */
    public boolean f801d;

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
        if (this.f801d) {
            return -1L;
        }
        long jMo486b = super.mo486b(c0479g, j2);
        if (jMo486b != -1) {
            return jMo486b;
        }
        this.f801d = true;
        m608g();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f786b) {
            return;
        }
        if (!this.f801d) {
            m608g();
        }
        this.f786b = true;
    }
}
