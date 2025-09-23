package p050R1;

import java.util.RandomAccess;
import p110k1.AbstractC1203e;

/* renamed from: R1.o */
/* loaded from: classes.dex */
public final class C0487o extends AbstractC1203e implements RandomAccess {

    /* renamed from: a */
    public final C0482j[] f1496a;

    /* renamed from: b */
    public final int[] f1497b;

    public C0487o(C0482j[] c0482jArr, int[] iArr) {
        this.f1496a = c0482jArr;
        this.f1497b = iArr;
    }

    @Override // p110k1.AbstractC1203e
    /* renamed from: a */
    public final int mo1217a() {
        return this.f1496a.length;
    }

    @Override // p110k1.AbstractC1203e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0482j) {
            return super.contains((C0482j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return this.f1496a[i2];
    }

    @Override // p110k1.AbstractC1203e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0482j) {
            return super.indexOf((C0482j) obj);
        }
        return -1;
    }

    @Override // p110k1.AbstractC1203e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0482j) {
            return super.lastIndexOf((C0482j) obj);
        }
        return -1;
    }
}
