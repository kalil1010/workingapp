package p079b0;

import androidx.lifecycle.AbstractC0732I;
import p119o.C1250l;

/* renamed from: b0.a */
/* loaded from: classes.dex */
public class C0762a extends AbstractC0732I {

    /* renamed from: c */
    public final C1250l f2873c = new C1250l();

    @Override // androidx.lifecycle.AbstractC0732I
    /* renamed from: a */
    public final void mo1694a() {
        C1250l c1250l = this.f2873c;
        int i2 = c1250l.f5062c;
        if (i2 > 0) {
            c1250l.f5061b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c1250l.f5061b;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        c1250l.f5062c = 0;
    }
}
