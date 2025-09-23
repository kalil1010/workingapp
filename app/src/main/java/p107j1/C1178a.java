package p107j1;

import java.io.Serializable;
import p131s1.AbstractC1326c;

/* renamed from: j1.a */
/* loaded from: classes.dex */
public final class C1178a implements Serializable {

    /* renamed from: a */
    public final Object f4795a;

    /* renamed from: b */
    public final Object f4796b;

    public C1178a(Object obj, Object obj2) {
        this.f4795a = obj;
        this.f4796b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1178a)) {
            return false;
        }
        C1178a c1178a = (C1178a) obj;
        return AbstractC1326c.m3058a(this.f4795a, c1178a.f4795a) && AbstractC1326c.m3058a(this.f4796b, c1178a.f4796b);
    }

    public final int hashCode() {
        Object obj = this.f4795a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4796b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f4795a + ", " + this.f4796b + ')';
    }
}
