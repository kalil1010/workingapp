package p065W1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: W1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0583c {

    /* renamed from: a */
    public transient C0585e f1876a;

    /* renamed from: b */
    public transient HashMap f1877b;

    /* renamed from: a */
    public final boolean m1394a(String str, String str2) {
        HashMap map = this.f1877b;
        Collection collection = (Collection) map.get(str);
        if (collection != null) {
            return collection.add(str2);
        }
        ArrayList arrayListM1396c = ((C0587g) this).m1396c();
        if (!arrayListM1396c.add(str2)) {
            return false;
        }
        map.put(str, arrayListM1396c);
        return true;
    }

    /* renamed from: b */
    public final List m1395b(Object obj) {
        List list = (List) this.f1877b.remove(obj);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0583c)) {
            return false;
        }
        C0585e c0585e = this.f1876a;
        if (c0585e == null) {
            c0585e = new C0585e(this, this.f1877b);
            this.f1876a = c0585e;
        }
        AbstractC0583c abstractC0583c = (AbstractC0583c) obj;
        C0585e c0585e2 = abstractC0583c.f1876a;
        if (c0585e2 == null) {
            c0585e2 = new C0585e(abstractC0583c, abstractC0583c.f1877b);
            abstractC0583c.f1876a = c0585e2;
        }
        return c0585e.equals(c0585e2);
    }

    public final int hashCode() {
        return this.f1877b.hashCode();
    }

    public final String toString() {
        return this.f1877b.toString();
    }
}
