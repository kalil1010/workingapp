package p094f0;

import android.util.SparseArray;

/* renamed from: f0.O */
/* loaded from: classes.dex */
public final class C0916O {

    /* renamed from: a */
    public SparseArray f3775a;

    /* renamed from: b */
    public int f3776b;

    /* renamed from: a */
    public final C0915N m2377a(int i2) {
        SparseArray sparseArray = this.f3775a;
        C0915N c0915n = (C0915N) sparseArray.get(i2);
        if (c0915n != null) {
            return c0915n;
        }
        C0915N c0915n2 = new C0915N();
        sparseArray.put(i2, c0915n2);
        return c0915n2;
    }
}
