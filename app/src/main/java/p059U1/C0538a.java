package p059U1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: U1.a */
/* loaded from: classes.dex */
public final class C0538a implements Iterator {

    /* renamed from: a */
    public static final C0538a f1704a = new C0538a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException("Iterator contains no elements");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("Iterator contains no elements");
    }
}
