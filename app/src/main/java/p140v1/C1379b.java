package p140v1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: v1.b */
/* loaded from: classes.dex */
public final class C1379b implements Iterator {

    /* renamed from: a */
    public final int f5992a;

    /* renamed from: b */
    public final int f5993b;

    /* renamed from: c */
    public boolean f5994c;

    /* renamed from: d */
    public int f5995d;

    public C1379b(int i2, int i3, int i4) {
        this.f5992a = i4;
        this.f5993b = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f5994c = z2;
        this.f5995d = z2 ? i2 : i3;
    }

    /* renamed from: a */
    public final int m3153a() {
        int i2 = this.f5995d;
        if (i2 != this.f5993b) {
            this.f5995d = this.f5992a + i2;
            return i2;
        }
        if (!this.f5994c) {
            throw new NoSuchElementException();
        }
        this.f5994c = false;
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5994c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(m3153a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
