package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.C */
/* loaded from: classes.dex */
public final class C0685C implements InterfaceC0684B {

    /* renamed from: a */
    public final int f2437a;

    /* renamed from: b */
    public final /* synthetic */ C0686D f2438b;

    public C0685C(C0686D c0686d, int i2) {
        this.f2438b = c0686d;
        this.f2437a = i2;
    }

    @Override // androidx.fragment.app.InterfaceC0684B
    /* renamed from: a */
    public final boolean mo1645a(ArrayList arrayList, ArrayList arrayList2) {
        C0686D c0686d = this.f2438b;
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0686d.f2462q;
        int i2 = this.f2437a;
        if (abstractComponentCallbacksC0712o == null || i2 >= 0 || !abstractComponentCallbacksC0712o.m1753g().m1655J()) {
            return c0686d.m1656K(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
