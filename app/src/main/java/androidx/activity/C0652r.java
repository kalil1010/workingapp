package androidx.activity;

import androidx.fragment.app.C0720w;
import p110k1.C1205g;
import p131s1.AbstractC1326c;

/* renamed from: androidx.activity.r */
/* loaded from: classes.dex */
public final class C0652r implements InterfaceC0637c {

    /* renamed from: a */
    public final C0720w f2025a;

    /* renamed from: b */
    public final /* synthetic */ C0656t f2026b;

    public C0652r(C0656t c0656t, C0720w c0720w) {
        AbstractC1326c.m3062e(c0720w, "onBackPressedCallback");
        this.f2026b = c0656t;
        this.f2025a = c0720w;
    }

    @Override // androidx.activity.InterfaceC0637c
    public final void cancel() {
        C0656t c0656t = this.f2026b;
        C1205g c1205g = c0656t.f2037b;
        C0720w c0720w = this.f2025a;
        c1205g.remove(c0720w);
        if (AbstractC1326c.m3058a(c0656t.f2038c, c0720w)) {
            c0720w.getClass();
            c0656t.f2038c = null;
        }
        c0720w.f2674b.remove(this);
        C0655s c0655s = c0720w.f2675c;
        if (c0655s != null) {
            c0655s.mo349a();
        }
        c0720w.f2675c = null;
    }
}
