package p132t;

import p129s.C1315d;
import p129s.C1319h;

/* renamed from: t.i */
/* loaded from: classes.dex */
public final class C1340i extends AbstractC1346o {
    @Override // p132t.InterfaceC1335d
    /* renamed from: a */
    public final void mo3068a(InterfaceC1335d interfaceC1335d) {
        C1337f c1337f = this.f5704h;
        if (c1337f.f5674c && !c1337f.f5681j) {
            c1337f.mo3085d((int) ((((C1337f) c1337f.f5683l.get(0)).f5678g * ((C1319h) this.f5698b).f5630q0) + 0.5f));
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: d */
    public final void mo3069d() {
        C1315d c1315d = this.f5698b;
        C1319h c1319h = (C1319h) c1315d;
        int i2 = c1319h.f5631r0;
        int i3 = c1319h.f5632s0;
        int i4 = c1319h.f5634u0;
        C1337f c1337f = this.f5704h;
        if (i4 == 1) {
            if (i2 != -1) {
                c1337f.f5683l.add(c1315d.f5505T.f5518d.f5704h);
                this.f5698b.f5505T.f5518d.f5704h.f5682k.add(c1337f);
                c1337f.f5677f = i2;
            } else if (i3 != -1) {
                c1337f.f5683l.add(c1315d.f5505T.f5518d.f5705i);
                this.f5698b.f5505T.f5518d.f5705i.f5682k.add(c1337f);
                c1337f.f5677f = -i3;
            } else {
                c1337f.f5673b = true;
                c1337f.f5683l.add(c1315d.f5505T.f5518d.f5705i);
                this.f5698b.f5505T.f5518d.f5705i.f5682k.add(c1337f);
            }
            m3095m(this.f5698b.f5518d.f5704h);
            m3095m(this.f5698b.f5518d.f5705i);
            return;
        }
        if (i2 != -1) {
            c1337f.f5683l.add(c1315d.f5505T.f5520e.f5704h);
            this.f5698b.f5505T.f5520e.f5704h.f5682k.add(c1337f);
            c1337f.f5677f = i2;
        } else if (i3 != -1) {
            c1337f.f5683l.add(c1315d.f5505T.f5520e.f5705i);
            this.f5698b.f5505T.f5520e.f5705i.f5682k.add(c1337f);
            c1337f.f5677f = -i3;
        } else {
            c1337f.f5673b = true;
            c1337f.f5683l.add(c1315d.f5505T.f5520e.f5705i);
            this.f5698b.f5505T.f5520e.f5705i.f5682k.add(c1337f);
        }
        m3095m(this.f5698b.f5520e.f5704h);
        m3095m(this.f5698b.f5520e.f5705i);
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: e */
    public final void mo3070e() {
        C1315d c1315d = this.f5698b;
        int i2 = ((C1319h) c1315d).f5634u0;
        C1337f c1337f = this.f5704h;
        if (i2 == 1) {
            c1315d.f5510Y = c1337f.f5678g;
        } else {
            c1315d.f5511Z = c1337f.f5678g;
        }
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: f */
    public final void mo3071f() {
        this.f5704h.m3084c();
    }

    @Override // p132t.AbstractC1346o
    /* renamed from: k */
    public final boolean mo3073k() {
        return false;
    }

    /* renamed from: m */
    public final void m3095m(C1337f c1337f) {
        C1337f c1337f2 = this.f5704h;
        c1337f2.f5682k.add(c1337f);
        c1337f.f5683l.add(c1337f2);
    }
}
