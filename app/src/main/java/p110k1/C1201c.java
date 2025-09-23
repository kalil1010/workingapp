package p110k1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: k1.c */
/* loaded from: classes.dex */
public final class C1201c extends C1200b implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ AbstractC1203e f4893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201c(AbstractC1203e abstractC1203e, int i2) {
        super(0, abstractC1203e);
        this.f4893d = abstractC1203e;
        int iMo1217a = abstractC1203e.mo1217a();
        if (i2 >= 0 && i2 <= iMo1217a) {
            this.f4891b = i2;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + iMo1217a);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4891b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4891b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f4891b - 1;
        this.f4891b = i2;
        return this.f4893d.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4891b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
