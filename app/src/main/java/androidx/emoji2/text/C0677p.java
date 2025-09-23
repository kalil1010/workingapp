package androidx.emoji2.text;

import android.util.SparseArray;

/* renamed from: androidx.emoji2.text.p */
/* loaded from: classes.dex */
public final class C0677p {

    /* renamed from: a */
    public final SparseArray f2424a;

    /* renamed from: b */
    public C0673l f2425b;

    public C0677p(int i2) {
        this.f2424a = new SparseArray(i2);
    }

    /* renamed from: a */
    public final void m1638a(C0673l c0673l, int i2, int i3) {
        int iM1631a = c0673l.m1631a(i2);
        SparseArray sparseArray = this.f2424a;
        C0677p c0677p = sparseArray == null ? null : (C0677p) sparseArray.get(iM1631a);
        if (c0677p == null) {
            c0677p = new C0677p(1);
            sparseArray.put(c0673l.m1631a(i2), c0677p);
        }
        if (i3 > i2) {
            c0677p.m1638a(c0673l, i2 + 1, i3);
        } else {
            c0677p.f2425b = c0673l;
        }
    }
}
