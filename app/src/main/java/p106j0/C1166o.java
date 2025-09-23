package p106j0;

import java.util.ArrayList;
import p119o.C1240b;

/* renamed from: j0.o */
/* loaded from: classes.dex */
public final class C1166o extends AbstractC1165n {

    /* renamed from: a */
    public final /* synthetic */ C1240b f4780a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC1167p f4781b;

    public C1166o(ViewTreeObserverOnPreDrawListenerC1167p viewTreeObserverOnPreDrawListenerC1167p, C1240b c1240b) {
        this.f4781b = viewTreeObserverOnPreDrawListenerC1167p;
        this.f4780a = c1240b;
    }

    @Override // p106j0.InterfaceC1162k
    /* renamed from: d */
    public final void mo2771d(AbstractC1164m abstractC1164m) {
        ((ArrayList) this.f4780a.getOrDefault(this.f4781b.f4783b, null)).remove(abstractC1164m);
        abstractC1164m.mo2790x(this);
    }
}
