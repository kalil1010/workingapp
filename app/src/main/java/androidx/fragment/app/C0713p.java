package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0747l;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p001A0.C0004c;
import p002A1.AbstractActivityC0021c;
import p090e.AbstractActivityC0874g;
import p097g0.C0968d;
import p097g0.InterfaceC0967c;
import p131s1.AbstractC1326c;

/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public final class C0713p implements InterfaceC0967c {

    /* renamed from: a */
    public final /* synthetic */ int f2654a;

    /* renamed from: b */
    public final Object f2655b;

    public /* synthetic */ C0713p(AbstractActivityC0021c abstractActivityC0021c, int i2) {
        this.f2654a = i2;
        this.f2655b = abstractActivityC0021c;
    }

    @Override // p097g0.InterfaceC0967c
    /* renamed from: a */
    public final Bundle mo1445a() {
        C0004c c0004c;
        switch (this.f2654a) {
            case 0:
                Bundle bundle = new Bundle();
                AbstractActivityC0021c abstractActivityC0021c = (AbstractActivityC0021c) this.f2655b;
                do {
                    c0004c = abstractActivityC0021c.f3607p;
                } while (AbstractActivityC0874g.m2214k(((C0715r) c0004c.f7b).f2661i));
                abstractActivityC0021c.f3608q.m1782d(EnumC0747l.ON_STOP);
                C0687E c0687eM1660O = ((C0715r) c0004c.f7b).f2661i.m1660O();
                if (c0687eM1660O != null) {
                    bundle.putParcelable("android:support:fragments", c0687eM1660O);
                }
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                ((AbstractActivityC0021c) this.f2655b).m2215i().getClass();
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2655b));
                return bundle3;
        }
    }

    public C0713p(C0968d c0968d) {
        this.f2654a = 2;
        AbstractC1326c.m3062e(c0968d, "registry");
        this.f2655b = new LinkedHashSet();
        c0968d.m2478e("androidx.savedstate.Restarter", this);
    }
}
