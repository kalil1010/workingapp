package androidx.activity;

import androidx.fragment.app.C0720w;
import java.util.ListIterator;
import p107j1.C1180c;
import p110k1.C1205g;
import p128r1.InterfaceC1301l;
import p131s1.AbstractC1326c;
import p131s1.AbstractC1327d;

/* renamed from: androidx.activity.m */
/* loaded from: classes.dex */
public final class C0647m extends AbstractC1327d implements InterfaceC1301l {

    /* renamed from: a */
    public final /* synthetic */ int f2015a;

    /* renamed from: b */
    public final /* synthetic */ C0656t f2016b;

    public /* synthetic */ C0647m(C0656t c0656t, int i2) {
        this.f2015a = i2;
        this.f2016b = c0656t;
    }

    @Override // p128r1.InterfaceC1301l
    /* renamed from: b */
    public final Object mo1460b(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f2015a) {
            case 0:
                AbstractC1326c.m3062e((C0636b) obj, "backEvent");
                C0656t c0656t = this.f2016b;
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
                c0656t.f2038c = (C0720w) objPrevious;
                break;
            default:
                AbstractC1326c.m3062e((C0636b) obj, "backEvent");
                C1205g c1205g2 = this.f2016b.f2037b;
                ListIterator listIterator2 = c1205g2.listIterator(c1205g2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious2 = listIterator2.previous();
                        if (((C0720w) objPrevious2).f2673a) {
                        }
                    } else {
                        objPrevious2 = null;
                    }
                }
                break;
        }
        return C1180c.f4801c;
    }
}
