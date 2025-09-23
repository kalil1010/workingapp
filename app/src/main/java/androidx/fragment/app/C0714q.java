package androidx.fragment.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import p001A0.C0004c;
import p002A1.AbstractActivityC0021c;
import p075a.InterfaceC0623b;
import p090e.AbstractC0878k;
import p090e.LayoutInflaterFactory2C0888u;
import p097g0.C0968d;

/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public final class C0714q implements InterfaceC0623b {

    /* renamed from: a */
    public final /* synthetic */ int f2656a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0021c f2657b;

    public /* synthetic */ C0714q(AbstractActivityC0021c abstractActivityC0021c, int i2) {
        this.f2656a = i2;
        this.f2657b = abstractActivityC0021c;
    }

    @Override // p075a.InterfaceC0623b
    /* renamed from: a */
    public final void mo1431a() {
        switch (this.f2656a) {
            case 0:
                AbstractActivityC0021c abstractActivityC0021c = this.f2657b;
                C0004c c0004c = abstractActivityC0021c.f3607p;
                C0715r c0715r = (C0715r) c0004c.f7b;
                c0715r.f2661i.m1669b(c0715r, c0715r, null);
                Bundle bundleM2476c = ((C0968d) abstractActivityC0021c.f2001e.f2014c).m2476c("android:support:fragments");
                if (bundleM2476c != null) {
                    ((C0715r) c0004c.f7b).f2661i.m1659N(bundleM2476c.getParcelable("android:support:fragments"));
                    break;
                }
                break;
            default:
                AbstractActivityC0021c abstractActivityC0021c2 = this.f2657b;
                AbstractC0878k abstractC0878kM2215i = abstractActivityC0021c2.m2215i();
                LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) abstractC0878kM2215i;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C0888u.f3691k);
                if (layoutInflaterFrom.getFactory() == null) {
                    layoutInflaterFrom.setFactory2(layoutInflaterFactory2C0888u);
                } else {
                    boolean z2 = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0888u;
                }
                ((C0968d) abstractActivityC0021c2.f2001e.f2014c).m2476c("androidx:appcompat");
                abstractC0878kM2215i.mo2230d();
                break;
        }
    }
}
