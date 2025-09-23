package p132t;

import p124q.AbstractC1271e;
import p129s.C1314c;
import p129s.C1315d;

/* renamed from: t.o */
/* loaded from: classes.dex */
public abstract class AbstractC1346o implements InterfaceC1335d {

    /* renamed from: a */
    public int f5697a;

    /* renamed from: b */
    public C1315d f5698b;

    /* renamed from: c */
    public C1343l f5699c;

    /* renamed from: d */
    public int f5700d;

    /* renamed from: e */
    public final C1338g f5701e = new C1338g(this);

    /* renamed from: f */
    public int f5702f = 0;

    /* renamed from: g */
    public boolean f5703g = false;

    /* renamed from: h */
    public final C1337f f5704h = new C1337f(this);

    /* renamed from: i */
    public final C1337f f5705i = new C1337f(this);

    /* renamed from: j */
    public int f5706j = 1;

    public AbstractC1346o(C1315d c1315d) {
        this.f5698b = c1315d;
    }

    /* renamed from: b */
    public static void m3105b(C1337f c1337f, C1337f c1337f2, int i2) {
        c1337f.f5683l.add(c1337f2);
        c1337f.f5677f = i2;
        c1337f2.f5682k.add(c1337f);
    }

    /* renamed from: h */
    public static C1337f m3106h(C1314c c1314c) {
        C1314c c1314c2 = c1314c.f5482f;
        if (c1314c2 == null) {
            return null;
        }
        int iM2966a = AbstractC1271e.m2966a(c1314c2.f5481e);
        C1315d c1315d = c1314c2.f5480d;
        if (iM2966a == 1) {
            return c1315d.f5518d.f5704h;
        }
        if (iM2966a == 2) {
            return c1315d.f5520e.f5704h;
        }
        if (iM2966a == 3) {
            return c1315d.f5518d.f5705i;
        }
        if (iM2966a == 4) {
            return c1315d.f5520e.f5705i;
        }
        if (iM2966a != 5) {
            return null;
        }
        return c1315d.f5520e.f5689k;
    }

    /* renamed from: i */
    public static C1337f m3107i(C1314c c1314c, int i2) {
        C1314c c1314c2 = c1314c.f5482f;
        if (c1314c2 == null) {
            return null;
        }
        C1315d c1315d = c1314c2.f5480d;
        AbstractC1346o abstractC1346o = i2 == 0 ? c1315d.f5518d : c1315d.f5520e;
        int iM2966a = AbstractC1271e.m2966a(c1314c2.f5481e);
        if (iM2966a == 1 || iM2966a == 2) {
            return abstractC1346o.f5704h;
        }
        if (iM2966a == 3 || iM2966a == 4) {
            return abstractC1346o.f5705i;
        }
        return null;
    }

    /* renamed from: c */
    public final void m3108c(C1337f c1337f, C1337f c1337f2, int i2, C1338g c1338g) {
        c1337f.f5683l.add(c1337f2);
        c1337f.f5683l.add(this.f5701e);
        c1337f.f5679h = i2;
        c1337f.f5680i = c1338g;
        c1337f2.f5682k.add(c1337f);
        c1338g.f5682k.add(c1337f);
    }

    /* renamed from: d */
    public abstract void mo3069d();

    /* renamed from: e */
    public abstract void mo3070e();

    /* renamed from: f */
    public abstract void mo3071f();

    /* renamed from: g */
    public final int m3109g(int i2, int i3) {
        if (i3 == 0) {
            C1315d c1315d = this.f5698b;
            int i4 = c1315d.f5549v;
            int iMax = Math.max(c1315d.f5548u, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax != i2) {
                return iMax;
            }
        } else {
            C1315d c1315d2 = this.f5698b;
            int i5 = c1315d2.f5552y;
            int iMax2 = Math.max(c1315d2.f5551x, i2);
            if (i5 > 0) {
                iMax2 = Math.min(i5, i2);
            }
            if (iMax2 != i2) {
                return iMax2;
            }
        }
        return i2;
    }

    /* renamed from: j */
    public long mo3072j() {
        if (this.f5701e.f5681j) {
            return r0.f5678g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo3073k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3110l(p129s.C1314c r12, p129s.C1314c r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p132t.AbstractC1346o.m3110l(s.c, s.c, int):void");
    }
}
