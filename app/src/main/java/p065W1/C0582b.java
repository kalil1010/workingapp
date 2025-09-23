package p065W1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p056T1.AbstractC0532a;
import p059U1.C0538a;

/* renamed from: W1.b */
/* loaded from: classes.dex */
public final class C0582b implements List, Collection {

    /* renamed from: a */
    public final Object f1873a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0583c f1874b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0583c f1875c;

    public C0582b(AbstractC0583c abstractC0583c, Object obj) {
        this.f1875c = abstractC0583c;
        this.f1874b = abstractC0583c;
        this.f1873a = obj;
    }

    /* renamed from: a */
    public final List m1393a() {
        return (List) this.f1875c.f1877b.get(this.f1873a);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            AbstractC0583c abstractC0583c = this.f1874b;
            ArrayList arrayListM1396c = ((C0587g) abstractC0583c).m1396c();
            abstractC0583c.f1877b.put(this.f1873a, arrayListM1396c);
            listM1393a = arrayListM1396c;
        }
        return listM1393a.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            AbstractC0583c abstractC0583c = this.f1874b;
            ArrayList arrayListM1396c = ((C0587g) abstractC0583c).m1396c();
            abstractC0583c.f1877b.put(this.f1873a, arrayListM1396c);
            listM1393a = arrayListM1396c;
        }
        return listM1393a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        List listM1393a = m1393a();
        if (listM1393a != null) {
            listM1393a.clear();
            this.f1874b.m1395b(this.f1873a);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            return false;
        }
        return listM1393a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            return false;
        }
        return listM1393a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            return Collections.EMPTY_LIST.equals(obj);
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (listM1393a == list) {
            return true;
        }
        if (list != null && listM1393a.size() == list.size()) {
            Iterator it = listM1393a.iterator();
            Iterator it2 = list.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                Object next2 = it2.next();
                if (next == null) {
                    if (next2 != null) {
                        break;
                    }
                } else if (!next.equals(next2)) {
                    break;
                }
            }
            if (it.hasNext() || it2.hasNext()) {
                break;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            listM1393a = Collections.EMPTY_LIST;
        }
        return listM1393a.get(i2);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            return 0;
        }
        Iterator it = listM1393a.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next == null ? 0 : next.hashCode());
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            listM1393a = Collections.EMPTY_LIST;
        }
        return listM1393a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            return true;
        }
        return listM1393a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return m1393a() == null ? C0538a.f1704a : new C0586f(this.f1874b, this.f1873a);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            listM1393a = Collections.EMPTY_LIST;
        }
        return listM1393a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0581a(this.f1875c, this.f1873a);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            return false;
        }
        boolean zRemove = listM1393a.remove(obj);
        if (listM1393a.isEmpty()) {
            this.f1874b.m1395b(this.f1873a);
        }
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            return false;
        }
        boolean zRemoveAll = listM1393a.removeAll(collection);
        if (listM1393a.isEmpty()) {
            this.f1874b.m1395b(this.f1873a);
        }
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            return false;
        }
        boolean zRetainAll = listM1393a.retainAll(collection);
        if (listM1393a.isEmpty()) {
            this.f1874b.m1395b(this.f1873a);
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            listM1393a = Collections.EMPTY_LIST;
        }
        return listM1393a.set(i2, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            return 0;
        }
        return listM1393a.size();
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            listM1393a = Collections.EMPTY_LIST;
        }
        return listM1393a.subList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        List listM1393a = m1393a();
        return listM1393a == null ? AbstractC0532a.f1693a.toArray() : listM1393a.toArray();
    }

    public final String toString() {
        List listM1393a = m1393a();
        return listM1393a == null ? AbstractC0532a.f1693a.toString() : listM1393a.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new C0581a(this.f1875c, this.f1873a, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            return AbstractC0532a.f1693a.toArray(objArr);
        }
        return listM1393a.toArray(objArr);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            listM1393a = Collections.EMPTY_LIST;
        }
        Object objRemove = listM1393a.remove(i2);
        if (listM1393a.isEmpty()) {
            this.f1875c.m1395b(this.f1873a);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            AbstractC0583c abstractC0583c = this.f1875c;
            ArrayList arrayListM1396c = ((C0587g) abstractC0583c).m1396c();
            abstractC0583c.f1877b.put(this.f1873a, arrayListM1396c);
            listM1393a = arrayListM1396c;
        }
        listM1393a.add(i2, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        List listM1393a = m1393a();
        if (listM1393a == null) {
            AbstractC0583c abstractC0583c = this.f1875c;
            ArrayList arrayListM1396c = ((C0587g) abstractC0583c).m1396c();
            boolean zAddAll = arrayListM1396c.addAll(i2, collection);
            if (zAddAll) {
                abstractC0583c.f1877b.put(this.f1873a, arrayListM1396c);
            }
            return zAddAll;
        }
        return listM1393a.addAll(i2, collection);
    }
}
