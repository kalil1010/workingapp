package p019G1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p001A0.C0004c;
import p002A1.RunnableC0042x;
import p006C.AbstractC0075g;
import p014E1.AbstractC0145b;
import p014E1.ThreadFactoryC0144a;
import p131s1.AbstractC1326c;

/* renamed from: G1.d */
/* loaded from: classes.dex */
public final class C0170d {

    /* renamed from: h */
    public static final C0170d f619h;

    /* renamed from: i */
    public static final Logger f620i;

    /* renamed from: b */
    public boolean f622b;

    /* renamed from: c */
    public long f623c;

    /* renamed from: g */
    public final C0004c f627g;

    /* renamed from: a */
    public int f621a = 10000;

    /* renamed from: d */
    public final ArrayList f624d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f625e = new ArrayList();

    /* renamed from: f */
    public final RunnableC0042x f626f = new RunnableC0042x(3, this);

    static {
        String str = AbstractC0145b.f501g + " TaskRunner";
        AbstractC1326c.m3062e(str, "name");
        f619h = new C0170d(new C0004c(new ThreadFactoryC0144a(str, true)));
        Logger logger = Logger.getLogger(C0170d.class.getName());
        AbstractC1326c.m3061d(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f620i = logger;
    }

    public C0170d(C0004c c0004c) {
        this.f627g = c0004c;
    }

    /* renamed from: a */
    public static final void m471a(C0170d c0170d, AbstractC0167a abstractC0167a) {
        c0170d.getClass();
        byte[] bArr = AbstractC0145b.f495a;
        Thread threadCurrentThread = Thread.currentThread();
        AbstractC1326c.m3061d(threadCurrentThread, "currentThread");
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC0167a.f609c);
        try {
            long jMo465a = abstractC0167a.mo465a();
            synchronized (c0170d) {
                c0170d.m472b(abstractC0167a, jMo465a);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (c0170d) {
                c0170d.m472b(abstractC0167a, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m472b(AbstractC0167a abstractC0167a, long j2) {
        byte[] bArr = AbstractC0145b.f495a;
        C0169c c0169c = abstractC0167a.f607a;
        AbstractC1326c.m3059b(c0169c);
        if (c0169c.f614b != abstractC0167a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = c0169c.f616d;
        c0169c.f616d = false;
        c0169c.f614b = null;
        this.f624d.remove(c0169c);
        if (j2 != -1 && !z2 && !c0169c.f613a) {
            c0169c.m469d(abstractC0167a, j2, true);
        }
        if (c0169c.f615c.isEmpty()) {
            return;
        }
        this.f625e.add(c0169c);
    }

    /* renamed from: c */
    public final AbstractC0167a m473c() {
        long j2;
        AbstractC0167a abstractC0167a;
        boolean z2;
        byte[] bArr = AbstractC0145b.f495a;
        while (true) {
            ArrayList arrayList = this.f625e;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0004c c0004c = this.f627g;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC0167a abstractC0167a2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j2 = jNanoTime;
                    abstractC0167a = null;
                    z2 = false;
                    break;
                }
                AbstractC0167a abstractC0167a3 = (AbstractC0167a) ((C0169c) it.next()).f615c.get(0);
                j2 = jNanoTime;
                abstractC0167a = null;
                long jMax = Math.max(0L, abstractC0167a3.f608b - j2);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC0167a2 != null) {
                        z2 = true;
                        break;
                    }
                    abstractC0167a2 = abstractC0167a3;
                }
                jNanoTime = j2;
            }
            ArrayList arrayList2 = this.f624d;
            if (abstractC0167a2 != null) {
                byte[] bArr2 = AbstractC0145b.f495a;
                abstractC0167a2.f608b = -1L;
                C0169c c0169c = abstractC0167a2.f607a;
                AbstractC1326c.m3059b(c0169c);
                c0169c.f615c.remove(abstractC0167a2);
                arrayList.remove(c0169c);
                c0169c.f614b = abstractC0167a2;
                arrayList2.add(c0169c);
                if (z2 || (!this.f622b && !arrayList.isEmpty())) {
                    RunnableC0042x runnableC0042x = this.f626f;
                    AbstractC1326c.m3062e(runnableC0042x, "runnable");
                    ((ThreadPoolExecutor) c0004c.f7b).execute(runnableC0042x);
                }
                return abstractC0167a2;
            }
            if (this.f622b) {
                if (jMin >= this.f623c - j2) {
                    return abstractC0167a;
                }
                notify();
                return abstractC0167a;
            }
            this.f622b = true;
            this.f623c = j2 + jMin;
            try {
                try {
                    long j3 = jMin / 1000000;
                    long j4 = jMin - (1000000 * j3);
                    if (j3 > 0 || jMin > 0) {
                        wait(j3, (int) j4);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        ((C0169c) arrayList2.get(size)).m467b();
                    }
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        C0169c c0169c2 = (C0169c) arrayList.get(size2);
                        c0169c2.m467b();
                        if (c0169c2.f615c.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f622b = false;
            }
        }
    }

    /* renamed from: d */
    public final void m474d(C0169c c0169c) {
        AbstractC1326c.m3062e(c0169c, "taskQueue");
        byte[] bArr = AbstractC0145b.f495a;
        if (c0169c.f614b == null) {
            boolean zIsEmpty = c0169c.f615c.isEmpty();
            ArrayList arrayList = this.f625e;
            if (zIsEmpty) {
                arrayList.remove(c0169c);
            } else {
                AbstractC1326c.m3062e(arrayList, "$this$addIfAbsent");
                if (!arrayList.contains(c0169c)) {
                    arrayList.add(c0169c);
                }
            }
        }
        boolean z2 = this.f622b;
        C0004c c0004c = this.f627g;
        if (z2) {
            notify();
            return;
        }
        RunnableC0042x runnableC0042x = this.f626f;
        AbstractC1326c.m3062e(runnableC0042x, "runnable");
        ((ThreadPoolExecutor) c0004c.f7b).execute(runnableC0042x);
    }

    /* renamed from: e */
    public final C0169c m475e() {
        int i2;
        synchronized (this) {
            i2 = this.f621a;
            this.f621a = i2 + 1;
        }
        return new C0169c(this, AbstractC0075g.m236e("Q", i2));
    }
}
