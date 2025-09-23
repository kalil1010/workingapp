package androidx.activity;

import androidx.fragment.app.C0720w;
import java.util.ListIterator;
import p107j1.C1180c;
import p110k1.C1205g;
import p128r1.InterfaceC1290a;
import p131s1.AbstractC1327d;

/* renamed from: androidx.activity.n */
/* loaded from: classes.dex */
public final class C0648n extends AbstractC1327d implements InterfaceC1290a {

    /* renamed from: a */
    public final /* synthetic */ int f2017a;

    /* renamed from: b */
    public final /* synthetic */ C0656t f2018b;

    public /* synthetic */ C0648n(C0656t c0656t, int i2) {
        this.f2017a = i2;
        this.f2018b = c0656t;
    }

    @Override // p128r1.InterfaceC1290a
    /* renamed from: a */
    public final Object mo349a() {
        Object objPrevious;
        switch (this.f2017a) {
            case 0:
                this.f2018b.m1467b();
                break;
            case 1:
                C0656t c0656t = this.f2018b;
                C1205g c1205g = c0656t.f2037b;
                ListIterator listIterator = c1205g.listIterator(c1205g.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0720w) objPrevious).f2673a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                c0656t.f2038c = null;
                break;
            default:
                this.f2018b.m1467b();
                break;
        }
        return C1180c.f4801c;
    }
}
