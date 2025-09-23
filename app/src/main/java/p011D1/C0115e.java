package p011D1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p033L1.AbstractC0364l;
import p110k1.AbstractC1218t;
import p110k1.C1217s;
import p131s1.AbstractC1326c;

/* renamed from: D1.e */
/* loaded from: classes.dex */
public final class C0115e {

    /* renamed from: c */
    public static final C0115e f306c;

    /* renamed from: a */
    public final Set f307a;

    /* renamed from: b */
    public final AbstractC0364l f308b;

    static {
        ArrayList arrayList = new ArrayList();
        Set setSingleton = C1217s.f4906a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                setSingleton = new LinkedHashSet(AbstractC1218t.m2852L(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    setSingleton.add(it.next());
                }
            } else {
                setSingleton = Collections.singleton(arrayList.get(0));
                AbstractC1326c.m3061d(setSingleton, "singleton(element)");
            }
        }
        f306c = new C0115e(setSingleton, null);
    }

    public C0115e(Set set, AbstractC0364l abstractC0364l) {
        this.f307a = set;
        this.f308b = abstractC0364l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0115e)) {
            return false;
        }
        C0115e c0115e = (C0115e) obj;
        return AbstractC1326c.m3058a(c0115e.f307a, this.f307a) && AbstractC1326c.m3058a(c0115e.f308b, this.f308b);
    }

    public final int hashCode() {
        int iHashCode = (this.f307a.hashCode() + 1517) * 41;
        AbstractC0364l abstractC0364l = this.f308b;
        return iHashCode + (abstractC0364l != null ? abstractC0364l.hashCode() : 0);
    }
}
