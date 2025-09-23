package p065W1;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import p080b1.C0776n;

/* renamed from: W1.e */
/* loaded from: classes.dex */
public final class C0585e extends AbstractMap {

    /* renamed from: a */
    public final transient HashMap f1880a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0583c f1881b;

    public C0585e(AbstractC0583c abstractC0583c, HashMap map) {
        this.f1881b = abstractC0583c;
        this.f1880a = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f1881b.f1877b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f1880a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C0776n(this, 2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f1880a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (((Collection) this.f1880a.get(obj)) == null) {
            return null;
        }
        AbstractC0583c abstractC0583c = this.f1881b;
        abstractC0583c.getClass();
        return new C0582b(abstractC0583c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f1880a.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f1881b.f1877b.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f1880a.remove(obj);
        if (collection == null) {
            return null;
        }
        ArrayList arrayListM1396c = ((C0587g) this.f1881b).m1396c();
        arrayListM1396c.addAll(collection);
        collection.clear();
        return arrayListM1396c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1880a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f1880a.toString();
    }
}
