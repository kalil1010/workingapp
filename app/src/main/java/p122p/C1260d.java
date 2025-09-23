package p122p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p033L1.AbstractC0364l;

/* renamed from: p.d */
/* loaded from: classes.dex */
public final class C1260d extends AbstractC0364l {

    /* renamed from: f */
    public final AtomicReferenceFieldUpdater f5120f;

    /* renamed from: g */
    public final AtomicReferenceFieldUpdater f5121g;

    /* renamed from: h */
    public final AtomicReferenceFieldUpdater f5122h;

    /* renamed from: i */
    public final AtomicReferenceFieldUpdater f5123i;

    /* renamed from: j */
    public final AtomicReferenceFieldUpdater f5124j;

    public C1260d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5120f = atomicReferenceFieldUpdater;
        this.f5121g = atomicReferenceFieldUpdater2;
        this.f5122h = atomicReferenceFieldUpdater3;
        this.f5123i = atomicReferenceFieldUpdater4;
        this.f5124j = atomicReferenceFieldUpdater5;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: Y */
    public final void mo1024Y(C1262f c1262f, C1262f c1262f2) {
        this.f5121g.lazySet(c1262f, c1262f2);
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: Z */
    public final void mo1025Z(C1262f c1262f, Thread thread) {
        this.f5120f.lazySet(c1262f, thread);
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: l */
    public final boolean mo1028l(AbstractFutureC1263g abstractFutureC1263g, C1259c c1259c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1259c c1259c2 = C1259c.f5118b;
        do {
            atomicReferenceFieldUpdater = this.f5123i;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1263g, c1259c, c1259c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1263g) == c1259c);
        return false;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: m */
    public final boolean mo1029m(AbstractFutureC1263g abstractFutureC1263g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5124j;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1263g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1263g) == obj);
        return false;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: n */
    public final boolean mo1030n(AbstractFutureC1263g abstractFutureC1263g, C1262f c1262f, C1262f c1262f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5122h;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1263g, c1262f, c1262f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1263g) == c1262f);
        return false;
    }
}
