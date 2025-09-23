package p030K1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import p006C.AbstractC0075g;
import p011D1.C0124n;
import p014E1.AbstractC0145b;
import p021H1.C0189h;
import p131s1.AbstractC1326c;

/* renamed from: K1.w */
/* loaded from: classes.dex */
public final class C0327w {

    /* renamed from: a */
    public long f1039a;

    /* renamed from: b */
    public long f1040b;

    /* renamed from: c */
    public long f1041c;

    /* renamed from: d */
    public long f1042d;

    /* renamed from: e */
    public final ArrayDeque f1043e;

    /* renamed from: f */
    public boolean f1044f;

    /* renamed from: g */
    public final C0326v f1045g;

    /* renamed from: h */
    public final C0325u f1046h;

    /* renamed from: i */
    public final C0189h f1047i;

    /* renamed from: j */
    public final C0189h f1048j;

    /* renamed from: k */
    public int f1049k;

    /* renamed from: l */
    public IOException f1050l;

    /* renamed from: m */
    public final int f1051m;

    /* renamed from: n */
    public final C0320p f1052n;

    public C0327w(int i2, C0320p c0320p, boolean z2, boolean z3, C0124n c0124n) {
        AbstractC1326c.m3062e(c0320p, "connection");
        this.f1051m = i2;
        this.f1052n = c0320p;
        this.f1042d = c0320p.f1002r.m829a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1043e = arrayDeque;
        this.f1045g = new C0326v(this, c0320p.f1001q.m829a(), z3);
        this.f1046h = new C0325u(this, z2);
        int i3 = 1;
        this.f1047i = new C0189h(i3, this);
        this.f1048j = new C0189h(i3, this);
        if (c0124n == null) {
            if (!m866g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m866g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c0124n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m860a() {
        /*
            r2 = this;
            byte[] r0 = p014E1.AbstractC0145b.f495a
            monitor-enter(r2)
            K1.v r0 = r2.f1045g     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f1037e     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            boolean r0 = r0.f1035c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            K1.u r0 = r2.f1046h     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f1031c     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            boolean r0 = r0.f1030b     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
        L17:
            r0 = 1
            goto L1c
        L19:
            r0 = move-exception
            goto L34
        L1b:
            r0 = 0
        L1c:
            boolean r1 = r2.m867h()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r0 == 0) goto L2a
            r0 = 9
            r1 = 0
            r2.m862c(r0, r1)
            return
        L2a:
            if (r1 != 0) goto L33
            K1.p r0 = r2.f1052n
            int r1 = r2.f1051m
            r0.m846i(r1)
        L33:
            return
        L34:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030K1.C0327w.m860a():void");
    }

    /* renamed from: b */
    public final void m861b() throws IOException {
        C0325u c0325u = this.f1046h;
        if (c0325u.f1030b) {
            throw new IOException("stream closed");
        }
        if (c0325u.f1031c) {
            throw new IOException("stream finished");
        }
        if (this.f1049k != 0) {
            IOException iOException = this.f1050l;
            if (iOException != null) {
                throw iOException;
            }
            int i2 = this.f1049k;
            AbstractC0075g.m239h(i2);
            throw new C0304C(i2);
        }
    }

    /* renamed from: c */
    public final void m862c(int i2, IOException iOException) {
        AbstractC0075g.m240i("rstStatusCode", i2);
        if (m863d(i2, iOException)) {
            C0320p c0320p = this.f1052n;
            c0320p.getClass();
            AbstractC0075g.m240i("statusCode", i2);
            c0320p.f1008x.m877m(this.f1051m, i2);
        }
    }

    /* renamed from: d */
    public final boolean m863d(int i2, IOException iOException) {
        byte[] bArr = AbstractC0145b.f495a;
        synchronized (this) {
            if (this.f1049k != 0) {
                return false;
            }
            if (this.f1045g.f1037e && this.f1046h.f1031c) {
                return false;
            }
            this.f1049k = i2;
            this.f1050l = iOException;
            notifyAll();
            this.f1052n.m846i(this.f1051m);
            return true;
        }
    }

    /* renamed from: e */
    public final void m864e(int i2) {
        AbstractC0075g.m240i("errorCode", i2);
        if (m863d(i2, null)) {
            this.f1052n.m850m(this.f1051m, i2);
        }
    }

    /* renamed from: f */
    public final C0325u m865f() {
        synchronized (this) {
            if (!this.f1044f && !m866g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f1046h;
    }

    /* renamed from: g */
    public final boolean m866g() {
        boolean z2 = (this.f1051m & 1) == 1;
        this.f1052n.getClass();
        return true == z2;
    }

    /* renamed from: h */
    public final synchronized boolean m867h() {
        if (this.f1049k != 0) {
            return false;
        }
        C0326v c0326v = this.f1045g;
        if (c0326v.f1037e || c0326v.f1035c) {
            C0325u c0325u = this.f1046h;
            if (c0325u.f1031c || c0325u.f1030b) {
                if (this.f1044f) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: i */
    public final void m868i(C0124n c0124n, boolean z2) {
        boolean zM867h;
        AbstractC1326c.m3062e(c0124n, "headers");
        byte[] bArr = AbstractC0145b.f495a;
        synchronized (this) {
            try {
                if (this.f1044f && z2) {
                    this.f1045g.getClass();
                } else {
                    this.f1044f = true;
                    this.f1043e.add(c0124n);
                }
                if (z2) {
                    this.f1045g.f1037e = true;
                }
                zM867h = m867h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM867h) {
            return;
        }
        this.f1052n.m846i(this.f1051m);
    }

    /* renamed from: j */
    public final synchronized void m869j(int i2) {
        AbstractC0075g.m240i("errorCode", i2);
        if (this.f1049k == 0) {
            this.f1049k = i2;
            notifyAll();
        }
    }

    /* renamed from: k */
    public final void m870k() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
