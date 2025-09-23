package p021H1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p019G1.C0168b;
import p030K1.C0320p;
import p030K1.C0327w;
import p050R1.AbstractC0486n;
import p050R1.C0477e;
import p093e2.AbstractC0901d;

/* renamed from: H1.h */
/* loaded from: classes.dex */
public final class C0189h extends C0477e {

    /* renamed from: k */
    public final /* synthetic */ int f686k;

    /* renamed from: l */
    public final Object f687l;

    public /* synthetic */ C0189h(int i2, Object obj) {
        this.f686k = i2;
        this.f687l = obj;
    }

    @Override // p050R1.C0477e
    /* renamed from: k */
    public final void mo492k() throws IOException {
        switch (this.f686k) {
            case 0:
                ((C0190i) this.f687l).m498d();
                return;
            case 1:
                ((C0327w) this.f687l).m864e(9);
                C0320p c0320p = ((C0327w) this.f687l).f1052n;
                synchronized (c0320p) {
                    long j2 = c0320p.f999o;
                    long j3 = c0320p.f998n;
                    if (j2 < j3) {
                        return;
                    }
                    c0320p.f998n = j3 + 1;
                    c0320p.f1000p = System.nanoTime() + 1000000000;
                    c0320p.f992h.m468c(new C0168b(c0320p.f987c + " ping", c0320p), 0L);
                    return;
                }
            default:
                Socket socket = (Socket) this.f687l;
                try {
                    socket.close();
                    return;
                } catch (AssertionError e3) {
                    if (!AbstractC0901d.m2283M(e3)) {
                        throw e3;
                    }
                    AbstractC0486n.f1495a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
                    return;
                } catch (Exception e4) {
                    AbstractC0486n.f1495a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
                    return;
                }
        }
    }

    /* renamed from: l */
    public void m493l() throws IOException {
        if (m1163j()) {
            throw m494m(null);
        }
    }

    /* renamed from: m */
    public IOException m494m(IOException iOException) {
        switch (this.f686k) {
            case 1:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }
}
