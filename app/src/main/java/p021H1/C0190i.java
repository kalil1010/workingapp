package p021H1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p002A1.C0009D;
import p011D1.C0121k;
import p011D1.C0126p;
import p011D1.C0130t;
import p011D1.C0132v;
import p011D1.C0134x;
import p011D1.InterfaceC0114d;
import p014E1.AbstractC0145b;
import p016F1.C0151b;
import p019G1.C0169c;
import p024I1.C0207a;
import p024I1.C0212f;
import p024I1.InterfaceC0210d;
import p033L1.C0366n;
import p110k1.AbstractC1213o;
import p131s1.AbstractC1326c;

/* renamed from: H1.i */
/* loaded from: classes.dex */
public final class C0190i implements Cloneable {

    /* renamed from: a */
    public final C0195n f688a;

    /* renamed from: b */
    public final C0189h f689b;

    /* renamed from: c */
    public final AtomicBoolean f690c;

    /* renamed from: d */
    public Object f691d;

    /* renamed from: e */
    public C0186e f692e;

    /* renamed from: f */
    public C0194m f693f;

    /* renamed from: g */
    public boolean f694g;

    /* renamed from: h */
    public C0121k f695h;

    /* renamed from: i */
    public boolean f696i;

    /* renamed from: j */
    public boolean f697j;

    /* renamed from: k */
    public boolean f698k;

    /* renamed from: l */
    public volatile boolean f699l;

    /* renamed from: m */
    public volatile C0121k f700m;

    /* renamed from: n */
    public volatile C0194m f701n;

    /* renamed from: o */
    public final C0130t f702o;

    /* renamed from: p */
    public final C0132v f703p;

    /* renamed from: q */
    public final boolean f704q;

    public C0190i(C0130t c0130t, C0132v c0132v, boolean z2) {
        AbstractC1326c.m3062e(c0130t, "client");
        this.f702o = c0130t;
        this.f703p = c0132v;
        this.f704q = z2;
        this.f688a = (C0195n) c0130t.f416b.f7b;
        c0130t.f419e.getClass();
        C0189h c0189h = new C0189h(0, this);
        c0189h.mo1212g(0, TimeUnit.MILLISECONDS);
        this.f689b = c0189h;
        this.f690c = new AtomicBoolean();
        this.f698k = true;
    }

    /* renamed from: a */
    public static final String m495a(C0190i c0190i) {
        StringBuilder sb = new StringBuilder();
        sb.append(c0190i.f699l ? "canceled " : "");
        sb.append(c0190i.f704q ? "web socket" : "call");
        sb.append(" to ");
        sb.append(((C0126p) c0190i.f703p.f452d).m363f());
        return sb.toString();
    }

    /* renamed from: b */
    public final void m496b(C0194m c0194m) {
        byte[] bArr = AbstractC0145b.f495a;
        if (this.f693f != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f693f = c0194m;
        c0194m.f725o.add(new C0188g(this, this.f691d));
    }

    /* renamed from: c */
    public final IOException m497c(IOException iOException) throws IOException {
        IOException interruptedIOException;
        Socket socketM505k;
        byte[] bArr = AbstractC0145b.f495a;
        C0194m c0194m = this.f693f;
        if (c0194m != null) {
            synchronized (c0194m) {
                socketM505k = m505k();
            }
            if (this.f693f == null) {
                if (socketM505k != null) {
                    AbstractC0145b.m392e(socketM505k);
                }
            } else if (socketM505k != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f694g && this.f689b.m1163j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            AbstractC1326c.m3059b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new C0190i(this.f702o, this.f703p, this.f704q);
    }

    /* renamed from: d */
    public final void m498d() {
        Socket socket;
        if (this.f699l) {
            return;
        }
        this.f699l = true;
        C0121k c0121k = this.f700m;
        if (c0121k != null) {
            ((InterfaceC0210d) c0121k.f355d).cancel();
        }
        C0194m c0194m = this.f701n;
        if (c0194m == null || (socket = c0194m.f712b) == null) {
            return;
        }
        AbstractC0145b.m392e(socket);
    }

    /* renamed from: e */
    public final void m499e(InterfaceC0114d interfaceC0114d) {
        RunnableC0187f runnableC0187f;
        if (!this.f690c.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        C0366n c0366n = C0366n.f1131a;
        this.f691d = C0366n.f1131a.mo940g();
        C0121k c0121k = this.f702o.f415a;
        RunnableC0187f runnableC0187f2 = new RunnableC0187f(this, interfaceC0114d);
        c0121k.getClass();
        synchronized (c0121k) {
            ((ArrayDeque) c0121k.f353b).add(runnableC0187f2);
            if (!this.f704q) {
                String str = ((C0126p) this.f703p.f452d).f376e;
                Iterator it = ((ArrayDeque) c0121k.f354c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) c0121k.f353b).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                runnableC0187f = null;
                                break;
                            } else {
                                runnableC0187f = (RunnableC0187f) it2.next();
                                if (AbstractC1326c.m3058a(((C0126p) runnableC0187f.f684c.f703p.f452d).f376e, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        runnableC0187f = (RunnableC0187f) it.next();
                        if (AbstractC1326c.m3058a(((C0126p) runnableC0187f.f684c.f703p.f452d).f376e, str)) {
                            break;
                        }
                    }
                }
                if (runnableC0187f != null) {
                    runnableC0187f2.f682a = runnableC0187f.f682a;
                }
            }
        }
        c0121k.m345m();
    }

    /* renamed from: f */
    public final C0134x m500f() {
        if (!this.f690c.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f689b.m1162i();
        C0366n c0366n = C0366n.f1131a;
        this.f691d = C0366n.f1131a.mo940g();
        try {
            C0121k c0121k = this.f702o.f415a;
            synchronized (c0121k) {
                ((ArrayDeque) c0121k.f355d).add(this);
            }
            return m502h();
        } finally {
            C0121k c0121k2 = this.f702o.f415a;
            c0121k2.getClass();
            c0121k2.m337e((ArrayDeque) c0121k2.f355d, this);
        }
    }

    /* renamed from: g */
    public final void m501g(boolean z2) {
        C0121k c0121k;
        synchronized (this) {
            if (!this.f698k) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (c0121k = this.f700m) != null) {
            ((InterfaceC0210d) c0121k.f355d).cancel();
            ((C0190i) c0121k.f353b).m503i(c0121k, true, true, null);
        }
        this.f695h = null;
    }

    /* renamed from: h */
    public final C0134x m502h() {
        ArrayList arrayList = new ArrayList();
        AbstractC1213o.m2851y0(arrayList, this.f702o.f417c);
        arrayList.add(new C0009D(this.f702o));
        arrayList.add(new C0009D(this.f702o.f424j));
        this.f702o.getClass();
        arrayList.add(new C0151b());
        arrayList.add(C0182a.f655a);
        if (!this.f704q) {
            AbstractC1213o.m2851y0(arrayList, this.f702o.f418d);
        }
        arrayList.add(new C0207a(this.f704q));
        C0132v c0132v = this.f703p;
        C0130t c0130t = this.f702o;
        try {
            try {
                C0134x c0134xM563b = new C0212f(this, arrayList, 0, null, c0132v, c0130t.f436v, c0130t.f437w, c0130t.f438x).m563b(this.f703p);
                if (this.f699l) {
                    AbstractC0145b.m391d(c0134xM563b);
                    throw new IOException("Canceled");
                }
                m504j(null);
                return c0134xM563b;
            } catch (IOException e3) {
                IOException iOExceptionM504j = m504j(e3);
                if (iOExceptionM504j == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionM504j;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                m504j(null);
            }
            throw th;
        }
    }

    /* renamed from: i */
    public final IOException m503i(C0121k c0121k, boolean z2, boolean z3, IOException iOException) {
        boolean z4;
        boolean z5;
        AbstractC1326c.m3062e(c0121k, "exchange");
        if (c0121k.equals(this.f700m)) {
            synchronized (this) {
                z4 = false;
                if (z2) {
                    try {
                        if (!this.f696i) {
                            if (z3 || !this.f697j) {
                                z5 = false;
                            }
                        }
                        if (z2) {
                            this.f696i = false;
                        }
                        if (z3) {
                            this.f697j = false;
                        }
                        boolean z6 = this.f696i;
                        boolean z7 = (z6 || this.f697j) ? false : true;
                        if (!z6 && !this.f697j) {
                            if (!this.f698k) {
                                z4 = true;
                            }
                        }
                        z5 = z4;
                        z4 = z7;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z3) {
                    }
                    z5 = false;
                }
            }
            if (z4) {
                this.f700m = null;
                C0194m c0194m = this.f693f;
                if (c0194m != null) {
                    synchronized (c0194m) {
                        c0194m.f722l++;
                    }
                }
            }
            if (z5) {
                return m497c(iOException);
            }
        }
        return iOException;
    }

    /* renamed from: j */
    public final IOException m504j(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f698k) {
                this.f698k = false;
                if (!this.f696i) {
                    if (!this.f697j) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? m497c(iOException) : iOException;
    }

    /* renamed from: k */
    public final Socket m505k() {
        C0194m c0194m = this.f693f;
        AbstractC1326c.m3059b(c0194m);
        byte[] bArr = AbstractC0145b.f495a;
        ArrayList arrayList = c0194m.f725o;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (AbstractC1326c.m3058a((C0190i) ((Reference) it.next()).get(), this)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i2);
        this.f693f = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c0194m.f726p = System.nanoTime();
        C0195n c0195n = this.f688a;
        c0195n.getClass();
        byte[] bArr2 = AbstractC0145b.f495a;
        boolean z2 = c0194m.f719i;
        C0169c c0169c = c0195n.f729b;
        if (!z2) {
            c0169c.m468c(c0195n.f730c, 0L);
            return null;
        }
        c0194m.f719i = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = c0195n.f731d;
        concurrentLinkedQueue.remove(c0194m);
        if (concurrentLinkedQueue.isEmpty()) {
            c0169c.m466a();
        }
        Socket socket = c0194m.f713c;
        AbstractC1326c.m3059b(socket);
        return socket;
    }
}
