package p019G1;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p014E1.AbstractC0145b;
import p033L1.AbstractC0356d;
import p131s1.AbstractC1326c;

/* renamed from: G1.c */
/* loaded from: classes.dex */
public final class C0169c {

    /* renamed from: a */
    public boolean f613a;

    /* renamed from: b */
    public AbstractC0167a f614b;

    /* renamed from: c */
    public final ArrayList f615c;

    /* renamed from: d */
    public boolean f616d;

    /* renamed from: e */
    public final C0170d f617e;

    /* renamed from: f */
    public final String f618f;

    public C0169c(C0170d c0170d, String str) {
        AbstractC1326c.m3062e(c0170d, "taskRunner");
        AbstractC1326c.m3062e(str, "name");
        this.f617e = c0170d;
        this.f618f = str;
        this.f615c = new ArrayList();
    }

    /* renamed from: a */
    public final void m466a() {
        byte[] bArr = AbstractC0145b.f495a;
        synchronized (this.f617e) {
            if (m467b()) {
                this.f617e.m474d(this);
            }
        }
    }

    /* renamed from: b */
    public final boolean m467b() {
        AbstractC0167a abstractC0167a = this.f614b;
        if (abstractC0167a != null && abstractC0167a.f610d) {
            this.f616d = true;
        }
        ArrayList arrayList = this.f615c;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((AbstractC0167a) arrayList.get(size)).f610d) {
                AbstractC0167a abstractC0167a2 = (AbstractC0167a) arrayList.get(size);
                if (C0170d.f620i.isLoggable(Level.FINE)) {
                    AbstractC0356d.m951a(abstractC0167a2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: c */
    public final void m468c(AbstractC0167a abstractC0167a, long j2) {
        AbstractC1326c.m3062e(abstractC0167a, "task");
        synchronized (this.f617e) {
            if (!this.f613a) {
                if (m469d(abstractC0167a, j2, false)) {
                    this.f617e.m474d(this);
                }
            } else if (abstractC0167a.f610d) {
                if (C0170d.f620i.isLoggable(Level.FINE)) {
                    AbstractC0356d.m951a(abstractC0167a, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C0170d.f620i.isLoggable(Level.FINE)) {
                    AbstractC0356d.m951a(abstractC0167a, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m469d(p019G1.AbstractC0167a r11, long r12, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "task"
            p131s1.AbstractC1326c.m3062e(r11, r0)
            G1.c r0 = r11.f607a
            if (r0 != r10) goto La
            goto Le
        La:
            if (r0 != 0) goto L8e
            r11.f607a = r10
        Le:
            G1.d r0 = r10.f617e
            A0.c r0 = r0.f627g
            long r0 = java.lang.System.nanoTime()
            long r2 = r0 + r12
            java.util.ArrayList r4 = r10.f615c
            int r5 = r4.indexOf(r11)
            r6 = 0
            r7 = -1
            if (r5 == r7) goto L3b
            long r8 = r11.f608b
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto L38
            java.util.logging.Logger r12 = p019G1.C0170d.f620i
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L8d
            java.lang.String r12 = "already scheduled"
            p033L1.AbstractC0356d.m951a(r11, r10, r12)
            return r6
        L38:
            r4.remove(r5)
        L3b:
            r11.f608b = r2
            java.util.logging.Logger r5 = p019G1.C0170d.f620i
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r5 = r5.isLoggable(r8)
            if (r5 == 0) goto L63
            if (r14 == 0) goto L55
            long r2 = r2 - r0
            java.lang.String r14 = p033L1.AbstractC0356d.m967q(r2)
            java.lang.String r2 = "run again after "
            java.lang.String r14 = r2.concat(r14)
            goto L60
        L55:
            long r2 = r2 - r0
            java.lang.String r14 = p033L1.AbstractC0356d.m967q(r2)
            java.lang.String r2 = "scheduled after "
            java.lang.String r14 = r2.concat(r14)
        L60:
            p033L1.AbstractC0356d.m951a(r11, r10, r14)
        L63:
            java.util.Iterator r14 = r4.iterator()
            r2 = r6
        L68:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r14.next()
            G1.a r3 = (p019G1.AbstractC0167a) r3
            long r8 = r3.f608b
            long r8 = r8 - r0
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 <= 0) goto L7c
            goto L80
        L7c:
            int r2 = r2 + 1
            goto L68
        L7f:
            r2 = r7
        L80:
            if (r2 != r7) goto L86
            int r2 = r4.size()
        L86:
            r4.add(r2, r11)
            if (r2 != 0) goto L8d
            r11 = 1
            return r11
        L8d:
            return r6
        L8e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "task is in multiple queues"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p019G1.C0169c.m469d(G1.a, long, boolean):boolean");
    }

    /* renamed from: e */
    public final void m470e() {
        byte[] bArr = AbstractC0145b.f495a;
        synchronized (this.f617e) {
            this.f613a = true;
            if (m467b()) {
                this.f617e.m474d(this);
            }
        }
    }

    public final String toString() {
        return this.f618f;
    }
}
