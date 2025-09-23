package p105j;

import p102i.InterfaceC0992C;

/* renamed from: j.H */
/* loaded from: classes.dex */
public final class C1037H extends AbstractViewOnTouchListenerC1141x0 {

    /* renamed from: j */
    public final /* synthetic */ C1051O f4383j;

    /* renamed from: k */
    public final /* synthetic */ C1058S f4384k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037H(C1058S c1058s, C1058S c1058s2, C1051O c1051o) {
        super(c1058s2);
        this.f4384k = c1058s;
        this.f4383j = c1051o;
    }

    @Override // p105j.AbstractViewOnTouchListenerC1141x0
    /* renamed from: b */
    public final InterfaceC0992C mo2562b() {
        return this.f4383j;
    }

    @Override // p105j.AbstractViewOnTouchListenerC1141x0
    /* renamed from: c */
    public final boolean mo2563c() {
        C1058S c1058s = this.f4384k;
        if (c1058s.getInternalPopup().mo2646b()) {
            return true;
        }
        c1058s.f4428f.mo2649e(AbstractC1041J.m2640b(c1058s), AbstractC1041J.m2639a(c1058s));
        return true;
    }
}
