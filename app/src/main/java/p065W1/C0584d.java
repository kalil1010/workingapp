package p065W1;

import java.util.Iterator;
import java.util.Map;
import p062V1.C0550a;

/* renamed from: W1.d */
/* loaded from: classes.dex */
public final class C0584d implements Iterator {

    /* renamed from: a */
    public final Iterator f1878a;

    /* renamed from: b */
    public final /* synthetic */ C0585e f1879b;

    public C0584d(C0585e c0585e, Iterator it) {
        this.f1879b = c0585e;
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        this.f1878a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1878a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object key = ((Map.Entry) this.f1878a.next()).getKey();
        AbstractC0583c abstractC0583c = this.f1879b.f1881b;
        abstractC0583c.getClass();
        C0582b c0582b = new C0582b(abstractC0583c, key);
        C0550a c0550a = new C0550a();
        c0550a.f1732a = key;
        c0550a.f1733b = c0582b;
        return c0550a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f1878a.remove();
    }
}
