package androidx.lifecycle;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0751p {

    /* renamed from: a */
    public final InterfaceC0739d f2691a;

    /* renamed from: b */
    public final InterfaceC0751p f2692b;

    public DefaultLifecycleObserverAdapter(InterfaceC0739d interfaceC0739d, InterfaceC0751p interfaceC0751p) {
        this.f2691a = interfaceC0739d;
        this.f2692b = interfaceC0751p;
    }

    @Override // androidx.lifecycle.InterfaceC0751p
    /* renamed from: b */
    public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
        int i2 = AbstractC0740e.f2719a[enumC0747l.ordinal()];
        InterfaceC0739d interfaceC0739d = this.f2691a;
        if (i2 == 3) {
            interfaceC0739d.mo1608a();
        } else if (i2 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0751p interfaceC0751p = this.f2692b;
        if (interfaceC0751p != null) {
            interfaceC0751p.mo1439b(interfaceC0753r, enumC0747l);
        }
    }
}
