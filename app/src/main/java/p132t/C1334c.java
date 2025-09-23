package p132t;

import java.util.ArrayList;
import java.util.Iterator;
import p129s.C1314c;
import p129s.C1315d;
import p129s.C1316e;

/* renamed from: t.c */
/* loaded from: classes.dex */
public final class C1334c extends AbstractC1346o {

    /* renamed from: k */
    public final ArrayList f5662k;

    /* renamed from: l */
    public int f5663l;

    public C1334c(C1315d c1315d, int i2) {
        C1315d c1315d2;
        super(c1315d);
        this.f5662k = new ArrayList();
        this.f5702f = i2;
        C1315d c1315d3 = this.f5698b;
        C1315d c1315dM3019m = c1315d3.m3019m(i2);
        while (true) {
            C1315d c1315d4 = c1315dM3019m;
            c1315d2 = c1315d3;
            c1315d3 = c1315d4;
            if (c1315d3 == null) {
                break;
            } else {
                c1315dM3019m = c1315d3.m3019m(this.f5702f);
            }
        }
        this.f5698b = c1315d2;
        int i3 = this.f5702f;
        AbstractC1346o abstractC1346o = i3 == 0 ? c1315d2.f5518d : i3 == 1 ? c1315d2.f5520e : null;
        ArrayList arrayList = this.f5662k;
        arrayList.add(abstractC1346o);
        C1315d c1315dM3018l = c1315d2.m3018l(this.f5702f);
        while (c1315dM3018l != null) {
            int i4 = this.f5702f;
            arrayList.add(i4 == 0 ? c1315dM3018l.f5518d : i4 == 1 ? c1315dM3018l.f5520e : null);
            c1315dM3018l = c1315dM3018l.m3018l(this.f5702f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1346o abstractC1346o2 = (AbstractC1346o) it.next();
            int i5 = this.f5702f;
            if (i5 == 0) {
                abstractC1346o2.f5698b.f5514b = this;
            } else if (i5 == 1) {
                abstractC1346o2.f5698b.f5516c = this;
            }
        }
        if (this.f5702f == 0 && ((C1316e) this.f5698b.f5505T).f5571v0 && arrayList.size() > 1) {
            this.f5698b = ((AbstractC1346o) arrayList.get(arrayList.size() - 1)).f5698b;
        }
        this.f5663l = this.f5702f == 0 ? this.f5698b.f5529i0 : this.f5698b.f5531j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    @Override // p132t.InterfaceC1335d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3068a(p132t.InterfaceC1335d r28) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p132t.C1334c.mo3068a(t.d):void");
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: d */
    public final void mo3069d() {
        ArrayList arrayList = this.f5662k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1346o) it.next()).mo3069d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C1315d c1315d = ((AbstractC1346o) arrayList.get(0)).f5698b;
        C1315d c1315d2 = ((AbstractC1346o) arrayList.get(size - 1)).f5698b;
        int i2 = this.f5702f;
        C1337f c1337f = this.f5705i;
        C1337f c1337f2 = this.f5704h;
        if (i2 == 0) {
            C1314c c1314c = c1315d.f5494I;
            C1314c c1314c2 = c1315d2.f5496K;
            C1337f c1337fM3107i = AbstractC1346o.m3107i(c1314c, 0);
            int iM2984e = c1314c.m2984e();
            C1315d c1315dM3074m = m3074m();
            if (c1315dM3074m != null) {
                iM2984e = c1315dM3074m.f5494I.m2984e();
            }
            if (c1337fM3107i != null) {
                AbstractC1346o.m3105b(c1337f2, c1337fM3107i, iM2984e);
            }
            C1337f c1337fM3107i2 = AbstractC1346o.m3107i(c1314c2, 0);
            int iM2984e2 = c1314c2.m2984e();
            C1315d c1315dM3075n = m3075n();
            if (c1315dM3075n != null) {
                iM2984e2 = c1315dM3075n.f5496K.m2984e();
            }
            if (c1337fM3107i2 != null) {
                AbstractC1346o.m3105b(c1337f, c1337fM3107i2, -iM2984e2);
            }
        } else {
            C1314c c1314c3 = c1315d.f5495J;
            C1314c c1314c4 = c1315d2.f5497L;
            C1337f c1337fM3107i3 = AbstractC1346o.m3107i(c1314c3, 1);
            int iM2984e3 = c1314c3.m2984e();
            C1315d c1315dM3074m2 = m3074m();
            if (c1315dM3074m2 != null) {
                iM2984e3 = c1315dM3074m2.f5495J.m2984e();
            }
            if (c1337fM3107i3 != null) {
                AbstractC1346o.m3105b(c1337f2, c1337fM3107i3, iM2984e3);
            }
            C1337f c1337fM3107i4 = AbstractC1346o.m3107i(c1314c4, 1);
            int iM2984e4 = c1314c4.m2984e();
            C1315d c1315dM3075n2 = m3075n();
            if (c1315dM3075n2 != null) {
                iM2984e4 = c1315dM3075n2.f5497L.m2984e();
            }
            if (c1337fM3107i4 != null) {
                AbstractC1346o.m3105b(c1337f, c1337fM3107i4, -iM2984e4);
            }
        }
        c1337f2.f5672a = this;
        c1337f.f5672a = this;
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: e */
    public final void mo3070e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f5662k;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((AbstractC1346o) arrayList.get(i2)).mo3070e();
            i2++;
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: f */
    public final void mo3071f() {
        this.f5699c = null;
        Iterator it = this.f5662k.iterator();
        while (it.hasNext()) {
            ((AbstractC1346o) it.next()).mo3071f();
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: j */
    public final long mo3072j() {
        ArrayList arrayList = this.f5662k;
        int size = arrayList.size();
        long jMo3072j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMo3072j = r5.f5705i.f5677f + ((AbstractC1346o) arrayList.get(i2)).mo3072j() + jMo3072j + r5.f5704h.f5677f;
        }
        return jMo3072j;
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: k */
    public final boolean mo3073k() {
        ArrayList arrayList = this.f5662k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((AbstractC1346o) arrayList.get(i2)).mo3073k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C1315d m3074m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f5662k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C1315d c1315d = ((AbstractC1346o) arrayList.get(i2)).f5698b;
            if (c1315d.f5525g0 != 8) {
                return c1315d;
            }
            i2++;
        }
    }

    /* renamed from: n */
    public final C1315d m3075n() {
        ArrayList arrayList = this.f5662k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1315d c1315d = ((AbstractC1346o) arrayList.get(size)).f5698b;
            if (c1315d.f5525g0 != 8) {
                return c1315d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f5702f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f5662k.iterator();
        while (it.hasNext()) {
            AbstractC1346o abstractC1346o = (AbstractC1346o) it.next();
            sb.append("<");
            sb.append(abstractC1346o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
