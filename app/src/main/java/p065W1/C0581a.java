package p065W1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

/* renamed from: W1.a */
/* loaded from: classes.dex */
public final class C0581a implements ListIterator {

    /* renamed from: a */
    public final Object f1869a;

    /* renamed from: b */
    public List f1870b;

    /* renamed from: c */
    public ListIterator f1871c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0583c f1872d;

    public C0581a(AbstractC0583c abstractC0583c, Object obj) {
        this.f1872d = abstractC0583c;
        this.f1869a = obj;
        List list = (List) abstractC0583c.f1877b.get(obj);
        list = list == null ? Collections.EMPTY_LIST : list;
        this.f1870b = list;
        this.f1871c = list.listIterator();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        AbstractC0583c abstractC0583c = this.f1872d;
        HashMap map = abstractC0583c.f1877b;
        Object obj2 = this.f1869a;
        if (map.get(obj2) == null) {
            ArrayList arrayListM1396c = ((C0587g) abstractC0583c).m1396c();
            abstractC0583c.f1877b.put(obj2, arrayListM1396c);
            this.f1870b = arrayListM1396c;
            this.f1871c = arrayListM1396c.listIterator();
        }
        this.f1871c.add(obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1871c.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1871c.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f1871c.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1871c.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f1871c.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1871c.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f1871c.remove();
        if (this.f1870b.isEmpty()) {
            this.f1872d.f1877b.remove(this.f1869a);
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f1871c.set(obj);
    }

    public C0581a(AbstractC0583c abstractC0583c, Object obj, int i2) {
        this.f1872d = abstractC0583c;
        this.f1869a = obj;
        List list = (List) abstractC0583c.f1877b.get(obj);
        list = list == null ? Collections.EMPTY_LIST : list;
        this.f1870b = list;
        this.f1871c = list.listIterator(i2);
    }
}
