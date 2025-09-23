package p119o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.h */
/* loaded from: classes.dex */
public final class C1246h implements Set {

    /* renamed from: a */
    public final /* synthetic */ int f5045a;

    /* renamed from: b */
    public final /* synthetic */ C1239a f5046b;

    public /* synthetic */ C1246h(C1239a c1239a, int i2) {
        this.f5045a = i2;
        this.f5046b = c1239a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5045a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5045a) {
            case 0:
                C1239a c1239a = this.f5046b;
                int iM2885d = c1239a.m2885d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c1239a.f5015d) {
                        case 0:
                            ((C1240b) c1239a.f5016e).put(key, value);
                            break;
                        default:
                            ((C1241c) c1239a.f5016e).add(key);
                            break;
                    }
                }
                return iM2885d != c1239a.m2885d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f5045a) {
            case 0:
                this.f5046b.m2882a();
                break;
            default:
                this.f5046b.m2882a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5045a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C1239a c1239a = this.f5046b;
                int iM2886e = c1239a.m2886e(key);
                if (iM2886e < 0) {
                    return false;
                }
                Object objM2883b = c1239a.m2883b(iM2886e, 1);
                Object value = entry.getValue();
                return objM2883b == value || (objM2883b != null && objM2883b.equals(value));
            default:
                return this.f5046b.m2886e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f5045a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map mapM2884c = this.f5046b.m2884c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapM2884c.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f5045a) {
        }
        return C1239a.m2881h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f5045a) {
            case 0:
                C1239a c1239a = this.f5046b;
                int iHashCode = 0;
                for (int iM2885d = c1239a.m2885d() - 1; iM2885d >= 0; iM2885d--) {
                    Object objM2883b = c1239a.m2883b(iM2885d, 0);
                    Object objM2883b2 = c1239a.m2883b(iM2885d, 1);
                    iHashCode += (objM2883b == null ? 0 : objM2883b.hashCode()) ^ (objM2883b2 == null ? 0 : objM2883b2.hashCode());
                }
                return iHashCode;
            default:
                C1239a c1239a2 = this.f5046b;
                int iHashCode2 = 0;
                for (int iM2885d2 = c1239a2.m2885d() - 1; iM2885d2 >= 0; iM2885d2--) {
                    Object objM2883b3 = c1239a2.m2883b(iM2885d2, 0);
                    iHashCode2 += objM2883b3 == null ? 0 : objM2883b3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5045a) {
            case 0:
                if (this.f5046b.m2885d() == 0) {
                }
                break;
            default:
                if (this.f5046b.m2885d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5045a) {
            case 0:
                return new C1247i(this.f5046b);
            default:
                return new C1245g(this.f5046b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5045a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C1239a c1239a = this.f5046b;
                int iM2886e = c1239a.m2886e(obj);
                if (iM2886e < 0) {
                    return false;
                }
                c1239a.m2888g(iM2886e);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5045a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapM2884c = this.f5046b.m2884c();
                int size = mapM2884c.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapM2884c.remove(it.next());
                }
                return size != mapM2884c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f5045a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapM2884c = this.f5046b.m2884c();
                int size = mapM2884c.size();
                Iterator it = mapM2884c.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != mapM2884c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f5045a) {
        }
        return this.f5046b.m2885d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5045a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f5046b.m2889i(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f5045a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C1239a c1239a = this.f5046b;
                int iM2885d = c1239a.m2885d();
                Object[] objArr = new Object[iM2885d];
                for (int i2 = 0; i2 < iM2885d; i2++) {
                    objArr[i2] = c1239a.m2883b(i2, 0);
                }
                return objArr;
        }
    }
}
