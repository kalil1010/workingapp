package androidx.activity;

import androidx.fragment.app.C0720w;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.EnumC0747l;
import androidx.lifecycle.InterfaceC0751p;
import androidx.lifecycle.InterfaceC0753r;
import p131s1.AbstractC1326c;

/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0751p, InterfaceC0637c {

    /* renamed from: a */
    public final C0755t f1974a;

    /* renamed from: b */
    public final C0720w f1975b;

    /* renamed from: c */
    public C0652r f1976c;

    /* renamed from: d */
    public final /* synthetic */ C0656t f1977d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0656t c0656t, C0755t c0755t, C0720w c0720w) {
        AbstractC1326c.m3062e(c0720w, "onBackPressedCallback");
        this.f1977d = c0656t;
        this.f1974a = c0755t;
        this.f1975b = c0720w;
        c0755t.m1779a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0751p
    /* renamed from: b */
    public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
        if (enumC0747l != EnumC0747l.ON_START) {
            if (enumC0747l != EnumC0747l.ON_STOP) {
                if (enumC0747l == EnumC0747l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0652r c0652r = this.f1976c;
                if (c0652r != null) {
                    c0652r.cancel();
                    return;
                }
                return;
            }
        }
        C0656t c0656t = this.f1977d;
        c0656t.getClass();
        C0720w c0720w = this.f1975b;
        AbstractC1326c.m3062e(c0720w, "onBackPressedCallback");
        c0656t.f2037b.m2837a(c0720w);
        C0652r c0652r2 = new C0652r(c0656t, c0720w);
        c0720w.f2674b.add(c0652r2);
        c0656t.m1469d();
        c0720w.f2675c = new C0655s(1, c0656t);
        this.f1976c = c0652r2;
    }

    @Override // androidx.activity.InterfaceC0637c
    public final void cancel() {
        this.f1974a.m1784f(this);
        this.f1975b.f2674b.remove(this);
        C0652r c0652r = this.f1976c;
        if (c0652r != null) {
            c0652r.cancel();
        }
        this.f1976c = null;
    }
}
