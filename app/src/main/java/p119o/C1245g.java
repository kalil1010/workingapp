package p119o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.g */
/* loaded from: classes.dex */
public final class C1245g implements Iterator {

    /* renamed from: a */
    public final int f5040a;

    /* renamed from: b */
    public int f5041b;

    /* renamed from: c */
    public int f5042c;

    /* renamed from: d */
    public boolean f5043d = false;

    /* renamed from: e */
    public final /* synthetic */ C1239a f5044e;

    public C1245g(C1239a c1239a, int i2) {
        this.f5044e = c1239a;
        this.f5040a = i2;
        this.f5041b = c1239a.m2885d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5042c < this.f5041b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM2883b = this.f5044e.m2883b(this.f5042c, this.f5040a);
        this.f5042c++;
        this.f5043d = true;
        return objM2883b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5043d) {
            throw new IllegalStateException();
        }
        int i2 = this.f5042c - 1;
        this.f5042c = i2;
        this.f5041b--;
        this.f5043d = false;
        this.f5044e.m2888g(i2);
    }
}
