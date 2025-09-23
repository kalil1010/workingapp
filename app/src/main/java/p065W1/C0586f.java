package p065W1;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: W1.f */
/* loaded from: classes.dex */
public final class C0586f implements Iterator {

    /* renamed from: a */
    public final Object f1882a;

    /* renamed from: b */
    public final Collection f1883b;

    /* renamed from: c */
    public final Iterator f1884c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0583c f1885d;

    public C0586f(AbstractC0583c abstractC0583c, Object obj) {
        this.f1885d = abstractC0583c;
        this.f1882a = obj;
        Collection collection = (Collection) abstractC0583c.f1877b.get(obj);
        this.f1883b = collection;
        this.f1884c = collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1884c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1884c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f1884c.remove();
        if (this.f1883b.isEmpty()) {
            this.f1885d.m1395b(this.f1882a);
        }
    }
}
