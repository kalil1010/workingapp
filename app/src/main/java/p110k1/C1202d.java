package p110k1;

import java.util.RandomAccess;

/* renamed from: k1.d */
/* loaded from: classes.dex */
public final class C1202d extends AbstractC1203e implements RandomAccess {

    /* renamed from: a */
    public final AbstractC1203e f4894a;

    /* renamed from: b */
    public final int f4895b;

    /* renamed from: c */
    public final int f4896c;

    public C1202d(AbstractC1203e abstractC1203e, int i2, int i3) {
        this.f4894a = abstractC1203e;
        this.f4895b = i2;
        int iMo1217a = abstractC1203e.mo1217a();
        if (i2 < 0 || i3 > iMo1217a) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + iMo1217a);
        }
        if (i2 <= i3) {
            this.f4896c = i3 - i2;
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
    }

    @Override // p110k1.AbstractC1203e
    /* renamed from: a */
    public final int mo1217a() {
        return this.f4896c;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        int i3 = this.f4896c;
        if (i2 >= 0 && i2 < i3) {
            return this.f4894a.get(this.f4895b + i2);
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }
}
