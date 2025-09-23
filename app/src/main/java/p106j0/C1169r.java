package p106j0;

/* renamed from: j0.r */
/* loaded from: classes.dex */
public final class C1169r extends AbstractC1165n {

    /* renamed from: a */
    public final /* synthetic */ int f4787a = 1;

    /* renamed from: b */
    public AbstractC1164m f4788b;

    public /* synthetic */ C1169r() {
    }

    @Override // p106j0.AbstractC1165n, p106j0.InterfaceC1162k
    /* renamed from: c */
    public void mo2770c(AbstractC1164m abstractC1164m) {
        switch (this.f4787a) {
            case 1:
                C1152a c1152a = (C1152a) this.f4788b;
                if (!c1152a.f4721D) {
                    c1152a.m2806G();
                    c1152a.f4721D = true;
                    break;
                }
                break;
        }
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: d */
    public final void mo2771d(AbstractC1164m abstractC1164m) {
        switch (this.f4787a) {
            case 0:
                this.f4788b.mo2792z();
                abstractC1164m.mo2790x(this);
                break;
            default:
                C1152a c1152a = (C1152a) this.f4788b;
                int i2 = c1152a.f4720C - 1;
                c1152a.f4720C = i2;
                if (i2 == 0) {
                    c1152a.f4721D = false;
                    c1152a.m2811m();
                }
                abstractC1164m.mo2790x(this);
                break;
        }
    }

    public C1169r(AbstractC1164m abstractC1164m) {
        this.f4788b = abstractC1164m;
    }
}
