package p110k1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p146x1.C1396a;

/* renamed from: k1.b */
/* loaded from: classes.dex */
public class C1200b implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f4890a;

    /* renamed from: b */
    public int f4891b;

    /* renamed from: c */
    public final Object f4892c;

    public /* synthetic */ C1200b(int i2, Object obj) {
        this.f4890a = i2;
        this.f4892c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f4890a) {
            case 0:
                return this.f4891b < ((AbstractC1203e) this.f4892c).mo1217a();
            case 1:
                return this.f4891b < ((Object[]) this.f4892c).length;
        }
        while (true) {
            int i2 = this.f4891b;
            it = (Iterator) this.f4892c;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f4891b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f4890a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f4891b;
                this.f4891b = i2 + 1;
                return ((AbstractC1203e) this.f4892c).get(i2);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f4892c;
                    int i3 = this.f4891b;
                    this.f4891b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f4891b--;
                    throw new NoSuchElementException(e3.getMessage());
                }
        }
        while (true) {
            int i4 = this.f4891b;
            it = (Iterator) this.f4892c;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f4891b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4890a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1200b(C1396a c1396a) {
        this.f4890a = 2;
        this.f4892c = c1396a.f6058a.iterator();
        this.f4891b = c1396a.f6059b;
    }
}
