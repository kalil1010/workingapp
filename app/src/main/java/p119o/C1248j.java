package p119o;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.j */
/* loaded from: classes.dex */
public final class C1248j implements Collection {

    /* renamed from: a */
    public final /* synthetic */ C1239a f5051a;

    public C1248j(C1239a c1239a) {
        this.f5051a = c1239a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f5051a.m2882a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5051a.m2887f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5051a.m2885d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1245g(this.f5051a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1239a c1239a = this.f5051a;
        int iM2887f = c1239a.m2887f(obj);
        if (iM2887f < 0) {
            return false;
        }
        c1239a.m2888g(iM2887f);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1239a c1239a = this.f5051a;
        int iM2885d = c1239a.m2885d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < iM2885d) {
            if (collection.contains(c1239a.m2883b(i2, 1))) {
                c1239a.m2888g(i2);
                i2--;
                iM2885d--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1239a c1239a = this.f5051a;
        int iM2885d = c1239a.m2885d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < iM2885d) {
            if (!collection.contains(c1239a.m2883b(i2, 1))) {
                c1239a.m2888g(i2);
                i2--;
                iM2885d--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5051a.m2885d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1239a c1239a = this.f5051a;
        int iM2885d = c1239a.m2885d();
        Object[] objArr = new Object[iM2885d];
        for (int i2 = 0; i2 < iM2885d; i2++) {
            objArr[i2] = c1239a.m2883b(i2, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f5051a.m2889i(objArr, 1);
    }
}
