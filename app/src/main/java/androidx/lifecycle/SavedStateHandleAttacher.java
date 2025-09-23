package androidx.lifecycle;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0751p {

    /* renamed from: a */
    public final C0730G f2710a;

    public SavedStateHandleAttacher(C0730G c0730g) {
        this.f2710a = c0730g;
    }

    @Override // androidx.lifecycle.InterfaceC0751p
    /* renamed from: b */
    public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
        if (enumC0747l != EnumC0747l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0747l).toString());
        }
        interfaceC0753r.mo1453e().m1784f(this);
        C0730G c0730g = this.f2710a;
        if (c0730g.f2699b) {
            return;
        }
        Bundle bundleM2476c = c0730g.f2698a.m2476c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0730g.f2700c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM2476c != null) {
            bundle.putAll(bundleM2476c);
        }
        c0730g.f2700c = bundle;
        c0730g.f2699b = true;
    }
}
