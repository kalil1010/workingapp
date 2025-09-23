package p106j0;

import android.view.ViewGroup;
import p033L1.AbstractC0356d;

/* renamed from: j0.d */
/* loaded from: classes.dex */
public final class C1155d extends AbstractC1165n {

    /* renamed from: a */
    public boolean f4724a = false;

    /* renamed from: b */
    public final ViewGroup f4725b;

    public C1155d(ViewGroup viewGroup) {
        this.f4725b = viewGroup;
    }

    @Override // p106j0.AbstractC1165n, p106j0.InterfaceC1162k
    /* renamed from: a */
    public final void mo2768a(AbstractC1164m abstractC1164m) {
        AbstractC0356d.m948I(this.f4725b, false);
        this.f4724a = true;
    }

    @Override // p106j0.AbstractC1165n, p106j0.InterfaceC1162k
    /* renamed from: b */
    public final void mo2769b() {
        AbstractC0356d.m948I(this.f4725b, false);
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: d */
    public final void mo2771d(AbstractC1164m abstractC1164m) {
        if (!this.f4724a) {
            AbstractC0356d.m948I(this.f4725b, false);
        }
        abstractC1164m.mo2790x(this);
    }

    @Override // p106j0.AbstractC1165n, p106j0.InterfaceC1162k
    /* renamed from: e */
    public final void mo2772e() {
        AbstractC0356d.m948I(this.f4725b, true);
    }
}
