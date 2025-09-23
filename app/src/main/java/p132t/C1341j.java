package p132t;

import java.util.Iterator;
import p129s.C1312a;
import p129s.C1315d;

/* renamed from: t.j */
/* loaded from: classes.dex */
public final class C1341j extends AbstractC1346o {
    @Override // p132t.InterfaceC1335d
    /* renamed from: a */
    public final void mo3068a(InterfaceC1335d interfaceC1335d) {
        C1312a c1312a = (C1312a) this.f5698b;
        int i2 = c1312a.f5456s0;
        C1337f c1337f = this.f5704h;
        Iterator it = c1337f.f5683l.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((C1337f) it.next()).f5678g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            c1337f.mo3085d(i4 + c1312a.f5458u0);
        } else {
            c1337f.mo3085d(i3 + c1312a.f5458u0);
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: d */
    public final void mo3069d() {
        C1315d c1315d = this.f5698b;
        if (c1315d instanceof C1312a) {
            C1337f c1337f = this.f5704h;
            c1337f.f5673b = true;
            C1312a c1312a = (C1312a) c1315d;
            int i2 = c1312a.f5456s0;
            boolean z2 = c1312a.f5457t0;
            int i3 = 0;
            if (i2 == 0) {
                c1337f.f5676e = 4;
                while (i3 < c1312a.f5637r0) {
                    C1315d c1315d2 = c1312a.f5636q0[i3];
                    if (z2 || c1315d2.f5525g0 != 8) {
                        C1337f c1337f2 = c1315d2.f5518d.f5704h;
                        c1337f2.f5682k.add(c1337f);
                        c1337f.f5683l.add(c1337f2);
                    }
                    i3++;
                }
                m3096m(this.f5698b.f5518d.f5704h);
                m3096m(this.f5698b.f5518d.f5705i);
                return;
            }
            if (i2 == 1) {
                c1337f.f5676e = 5;
                while (i3 < c1312a.f5637r0) {
                    C1315d c1315d3 = c1312a.f5636q0[i3];
                    if (z2 || c1315d3.f5525g0 != 8) {
                        C1337f c1337f3 = c1315d3.f5518d.f5705i;
                        c1337f3.f5682k.add(c1337f);
                        c1337f.f5683l.add(c1337f3);
                    }
                    i3++;
                }
                m3096m(this.f5698b.f5518d.f5704h);
                m3096m(this.f5698b.f5518d.f5705i);
                return;
            }
            if (i2 == 2) {
                c1337f.f5676e = 6;
                while (i3 < c1312a.f5637r0) {
                    C1315d c1315d4 = c1312a.f5636q0[i3];
                    if (z2 || c1315d4.f5525g0 != 8) {
                        C1337f c1337f4 = c1315d4.f5520e.f5704h;
                        c1337f4.f5682k.add(c1337f);
                        c1337f.f5683l.add(c1337f4);
                    }
                    i3++;
                }
                m3096m(this.f5698b.f5520e.f5704h);
                m3096m(this.f5698b.f5520e.f5705i);
                return;
            }
            if (i2 != 3) {
                return;
            }
            c1337f.f5676e = 7;
            while (i3 < c1312a.f5637r0) {
                C1315d c1315d5 = c1312a.f5636q0[i3];
                if (z2 || c1315d5.f5525g0 != 8) {
                    C1337f c1337f5 = c1315d5.f5520e.f5705i;
                    c1337f5.f5682k.add(c1337f);
                    c1337f.f5683l.add(c1337f5);
                }
                i3++;
            }
            m3096m(this.f5698b.f5520e.f5704h);
            m3096m(this.f5698b.f5520e.f5705i);
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: e */
    public final void mo3070e() {
        C1315d c1315d = this.f5698b;
        if (c1315d instanceof C1312a) {
            int i2 = ((C1312a) c1315d).f5456s0;
            C1337f c1337f = this.f5704h;
            if (i2 == 0 || i2 == 1) {
                c1315d.f5510Y = c1337f.f5678g;
            } else {
                c1315d.f5511Z = c1337f.f5678g;
            }
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: f */
    public final void mo3071f() {
        this.f5699c = null;
        this.f5704h.m3084c();
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: k */
    public final boolean mo3073k() {
        return false;
    }

    /* renamed from: m */
    public final void m3096m(C1337f c1337f) {
        C1337f c1337f2 = this.f5704h;
        c1337f2.f5682k.add(c1337f);
        c1337f.f5683l.add(c1337f2);
    }
}
