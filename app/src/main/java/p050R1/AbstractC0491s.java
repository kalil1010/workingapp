package p050R1;

import java.util.concurrent.atomic.AtomicReference;
import p131s1.AbstractC1326c;

/* renamed from: R1.s */
/* loaded from: classes.dex */
public abstract class AbstractC0491s {

    /* renamed from: a */
    public static final C0490r f1511a = new C0490r(new byte[0], 0, 0, false, false);

    /* renamed from: b */
    public static final int f1512b;

    /* renamed from: c */
    public static final AtomicReference[] f1513c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1512b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i2 = 0; i2 < iHighestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f1513c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m1238a(C0490r c0490r) {
        AbstractC1326c.m3062e(c0490r, "segment");
        if (c0490r.f1509f != null || c0490r.f1510g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c0490r.f1507d) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        AbstractC1326c.m3061d(threadCurrentThread, "Thread.currentThread()");
        AtomicReference atomicReference = f1513c[(int) (threadCurrentThread.getId() & (f1512b - 1))];
        C0490r c0490r2 = (C0490r) atomicReference.get();
        if (c0490r2 == f1511a) {
            return;
        }
        int i2 = c0490r2 != null ? c0490r2.f1506c : 0;
        if (i2 >= 65536) {
            return;
        }
        c0490r.f1509f = c0490r2;
        c0490r.f1505b = 0;
        c0490r.f1506c = i2 + 8192;
        while (!atomicReference.compareAndSet(c0490r2, c0490r)) {
            if (atomicReference.get() != c0490r2) {
                c0490r.f1509f = null;
                return;
            }
        }
    }

    /* renamed from: b */
    public static final C0490r m1239b() {
        Thread threadCurrentThread = Thread.currentThread();
        AbstractC1326c.m3061d(threadCurrentThread, "Thread.currentThread()");
        AtomicReference atomicReference = f1513c[(int) (threadCurrentThread.getId() & (f1512b - 1))];
        C0490r c0490r = f1511a;
        C0490r c0490r2 = (C0490r) atomicReference.getAndSet(c0490r);
        if (c0490r2 == c0490r) {
            return new C0490r();
        }
        if (c0490r2 == null) {
            atomicReference.set(null);
            return new C0490r();
        }
        atomicReference.set(c0490r2.f1509f);
        c0490r2.f1509f = null;
        c0490r2.f1506c = 0;
        return c0490r2;
    }
}
