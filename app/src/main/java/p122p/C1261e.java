package p122p;

import p033L1.AbstractC0364l;

/* renamed from: p.e */
/* loaded from: classes.dex */
public final class C1261e extends AbstractC0364l {
    @Override // p033L1.AbstractC0364l
    /* renamed from: Y */
    public final void mo1024Y(C1262f c1262f, C1262f c1262f2) {
        c1262f.f5127b = c1262f2;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: Z */
    public final void mo1025Z(C1262f c1262f, Thread thread) {
        c1262f.f5126a = thread;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: l */
    public final boolean mo1028l(AbstractFutureC1263g abstractFutureC1263g, C1259c c1259c) {
        C1259c c1259c2 = C1259c.f5118b;
        synchronized (abstractFutureC1263g) {
            try {
                if (abstractFutureC1263g.f5133b != c1259c) {
                    return false;
                }
                abstractFutureC1263g.f5133b = c1259c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: m */
    public final boolean mo1029m(AbstractFutureC1263g abstractFutureC1263g, Object obj, Object obj2) {
        synchronized (abstractFutureC1263g) {
            try {
                if (abstractFutureC1263g.f5132a != obj) {
                    return false;
                }
                abstractFutureC1263g.f5132a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: n */
    public final boolean mo1030n(AbstractFutureC1263g abstractFutureC1263g, C1262f c1262f, C1262f c1262f2) {
        synchronized (abstractFutureC1263g) {
            try {
                if (abstractFutureC1263g.f5134c != c1262f) {
                    return false;
                }
                abstractFutureC1263g.f5134c = c1262f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
