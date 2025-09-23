package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0751p {

    /* renamed from: a */
    public boolean f2711a;

    @Override // androidx.lifecycle.InterfaceC0751p
    /* renamed from: b */
    public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
        if (enumC0747l == EnumC0747l.ON_DESTROY) {
            this.f2711a = false;
            interfaceC0753r.mo1453e().m1784f(this);
        }
    }
}
