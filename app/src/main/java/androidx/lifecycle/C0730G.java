package androidx.lifecycle;

import android.os.Bundle;
import androidx.activity.AbstractActivityC0645k;
import java.util.Iterator;
import java.util.Map;
import p011D1.C0122l;
import p097g0.C0968d;
import p097g0.InterfaceC0967c;
import p107j1.C1179b;
import p131s1.AbstractC1326c;

/* renamed from: androidx.lifecycle.G */
/* loaded from: classes.dex */
public final class C0730G implements InterfaceC0967c {

    /* renamed from: a */
    public final C0968d f2698a;

    /* renamed from: b */
    public boolean f2699b;

    /* renamed from: c */
    public Bundle f2700c;

    /* renamed from: d */
    public final C1179b f2701d;

    public C0730G(C0968d c0968d, AbstractActivityC0645k abstractActivityC0645k) {
        AbstractC1326c.m3062e(c0968d, "savedStateRegistry");
        this.f2698a = c0968d;
        this.f2701d = new C1179b(new C0122l(2, abstractActivityC0645k));
    }

    @Override // p097g0.InterfaceC0967c
    /* renamed from: a */
    public final Bundle mo1445a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2700c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((C0731H) this.f2701d.m2830a()).f2702c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f2699b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
