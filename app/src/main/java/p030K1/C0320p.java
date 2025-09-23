package p030K1;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import p006C.AbstractC0075g;
import p014E1.AbstractC0145b;
import p019G1.C0169c;
import p019G1.C0170d;
import p021H1.C0197p;
import p050R1.C0488p;
import p050R1.C0489q;
import p131s1.AbstractC1326c;

/* renamed from: K1.p */
/* loaded from: classes.dex */
public final class C0320p implements Closeable {

    /* renamed from: A */
    public static final C0303B f984A;

    /* renamed from: a */
    public final AbstractC0313i f985a;

    /* renamed from: b */
    public final LinkedHashMap f986b = new LinkedHashMap();

    /* renamed from: c */
    public final String f987c;

    /* renamed from: d */
    public int f988d;

    /* renamed from: e */
    public int f989e;

    /* renamed from: f */
    public boolean f990f;

    /* renamed from: g */
    public final C0170d f991g;

    /* renamed from: h */
    public final C0169c f992h;

    /* renamed from: i */
    public final C0169c f993i;

    /* renamed from: j */
    public final C0169c f994j;

    /* renamed from: k */
    public final C0302A f995k;

    /* renamed from: l */
    public long f996l;

    /* renamed from: m */
    public long f997m;

    /* renamed from: n */
    public long f998n;

    /* renamed from: o */
    public long f999o;

    /* renamed from: p */
    public long f1000p;

    /* renamed from: q */
    public final C0303B f1001q;

    /* renamed from: r */
    public C0303B f1002r;

    /* renamed from: s */
    public long f1003s;

    /* renamed from: t */
    public long f1004t;

    /* renamed from: u */
    public long f1005u;

    /* renamed from: v */
    public long f1006v;

    /* renamed from: w */
    public final Socket f1007w;

    /* renamed from: x */
    public final C0328x f1008x;

    /* renamed from: y */
    public final C0315k f1009y;

    /* renamed from: z */
    public final LinkedHashSet f1010z;

    static {
        C0303B c0303b = new C0303B();
        c0303b.m831c(7, 65535);
        c0303b.m831c(5, 16384);
        f984A = c0303b;
    }

    public C0320p(C0197p c0197p) {
        this.f985a = (AbstractC0313i) c0197p.f739f;
        String str = (String) c0197p.f736c;
        if (str == null) {
            AbstractC1326c.m3065h("connectionName");
            throw null;
        }
        this.f987c = str;
        this.f989e = 3;
        C0170d c0170d = (C0170d) c0197p.f740g;
        this.f991g = c0170d;
        C0169c c0169cM475e = c0170d.m475e();
        this.f992h = c0169cM475e;
        this.f993i = c0170d.m475e();
        this.f994j = c0170d.m475e();
        this.f995k = C0302A.f927a;
        C0303B c0303b = new C0303B();
        c0303b.m831c(7, 16777216);
        this.f1001q = c0303b;
        this.f1002r = f984A;
        this.f1006v = r2.m829a();
        Socket socket = (Socket) c0197p.f735b;
        if (socket == null) {
            AbstractC1326c.m3065h("socket");
            throw null;
        }
        this.f1007w = socket;
        C0488p c0488p = (C0488p) c0197p.f738e;
        if (c0488p == null) {
            AbstractC1326c.m3065h("sink");
            throw null;
        }
        this.f1008x = new C0328x(c0488p);
        C0489q c0489q = (C0489q) c0197p.f737d;
        if (c0489q == null) {
            AbstractC1326c.m3065h("source");
            throw null;
        }
        this.f1009y = new C0315k(this, new C0324t(c0489q));
        this.f1010z = new LinkedHashSet();
        int i2 = c0197p.f734a;
        if (i2 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            c0169cM475e.m468c(new C0311g(str.concat(" ping"), this, nanos), nanos);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m844g(1, 9, null);
    }

    public final void flush() {
        this.f1008x.flush();
    }

    /* renamed from: g */
    public final void m844g(int i2, int i3, IOException iOException) throws IOException {
        int i4;
        C0327w[] c0327wArr;
        AbstractC0075g.m240i("connectionCode", i2);
        AbstractC0075g.m240i("streamCode", i3);
        byte[] bArr = AbstractC0145b.f495a;
        try {
            m847j(i2);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f986b.isEmpty()) {
                    c0327wArr = null;
                } else {
                    Object[] array = this.f986b.values().toArray(new C0327w[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    c0327wArr = (C0327w[]) array;
                    this.f986b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0327wArr != null) {
            for (C0327w c0327w : c0327wArr) {
                try {
                    c0327w.m862c(i3, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f1008x.close();
        } catch (IOException unused3) {
        }
        try {
            this.f1007w.close();
        } catch (IOException unused4) {
        }
        this.f992h.m470e();
        this.f993i.m470e();
        this.f994j.m470e();
    }

    /* renamed from: h */
    public final synchronized C0327w m845h(int i2) {
        return (C0327w) this.f986b.get(Integer.valueOf(i2));
    }

    /* renamed from: i */
    public final synchronized C0327w m846i(int i2) {
        C0327w c0327w;
        c0327w = (C0327w) this.f986b.remove(Integer.valueOf(i2));
        notifyAll();
        return c0327w;
    }

    /* renamed from: j */
    public final void m847j(int i2) {
        AbstractC0075g.m240i("statusCode", i2);
        synchronized (this.f1008x) {
            synchronized (this) {
                if (this.f990f) {
                    return;
                }
                this.f990f = true;
                this.f1008x.m874j(this.f988d, i2, AbstractC0145b.f495a);
            }
        }
    }

    /* renamed from: k */
    public final synchronized void m848k(long j2) {
        long j3 = this.f1003s + j2;
        this.f1003s = j3;
        long j4 = j3 - this.f1004t;
        if (j4 >= this.f1001q.m829a() / 2) {
            m851n(0, j4);
            this.f1004t += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f1008x.f1055b);
        r6 = r2;
        r8.f1005u += r6;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m849l(int r9, boolean r10, p050R1.C0479g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            K1.x r12 = r8.f1008x
            r12.m872h(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f1005u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f1006v     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f986b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            K1.x r4 = r8.f1008x     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f1055b     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f1005u     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f1005u = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            K1.x r4 = r8.f1008x
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.m872h(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030K1.C0320p.m849l(int, boolean, R1.g, long):void");
    }

    /* renamed from: m */
    public final void m850m(int i2, int i3) {
        AbstractC0075g.m240i("errorCode", i3);
        this.f992h.m468c(new C0318n(this.f987c + '[' + i2 + "] writeSynReset", this, i2, i3, 1), 0L);
    }

    /* renamed from: n */
    public final void m851n(int i2, long j2) {
        this.f992h.m468c(new C0319o(this.f987c + '[' + i2 + "] windowUpdate", this, i2, j2), 0L);
    }
}
