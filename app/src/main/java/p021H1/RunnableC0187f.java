package p021H1;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p011D1.C0121k;
import p011D1.C0126p;
import p011D1.InterfaceC0114d;
import p033L1.C0366n;
import p093e2.AbstractC0901d;
import p131s1.AbstractC1326c;

/* renamed from: H1.f */
/* loaded from: classes.dex */
public final class RunnableC0187f implements Runnable {

    /* renamed from: a */
    public volatile AtomicInteger f682a = new AtomicInteger(0);

    /* renamed from: b */
    public final InterfaceC0114d f683b;

    /* renamed from: c */
    public final /* synthetic */ C0190i f684c;

    public RunnableC0187f(C0190i c0190i, InterfaceC0114d interfaceC0114d) {
        this.f684c = c0190i;
        this.f683b = interfaceC0114d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0121k c0121k;
        String strConcat = "OkHttp ".concat(((C0126p) this.f684c.f703p.f452d).m363f());
        Thread threadCurrentThread = Thread.currentThread();
        AbstractC1326c.m3061d(threadCurrentThread, "currentThread");
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            this.f684c.f689b.m1162i();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    this.f684c.f702o.f415a.m338f(this);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f683b.mo26m(this.f684c, this.f684c.m502h());
                c0121k = this.f684c.f702o.f415a;
            } catch (IOException e4) {
                e = e4;
                z2 = true;
                if (z2) {
                    C0366n c0366n = C0366n.f1131a;
                    C0366n c0366n2 = C0366n.f1131a;
                    String str = "Callback failure for " + C0190i.m495a(this.f684c);
                    c0366n2.getClass();
                    C0366n.m1032i(str, 4, e);
                } else {
                    this.f683b.mo25l(this.f684c, e);
                }
                c0121k = this.f684c.f702o.f415a;
                c0121k.m338f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                this.f684c.m498d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    AbstractC0901d.m2291a(iOException, th);
                    this.f683b.mo25l(this.f684c, iOException);
                }
                throw th;
            }
            c0121k.m338f(this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
