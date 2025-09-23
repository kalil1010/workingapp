package p132t;

import java.util.Iterator;

/* renamed from: t.g */
/* loaded from: classes.dex */
public class C1338g extends C1337f {

    /* renamed from: m */
    public int f5684m;

    public C1338g(AbstractC1346o abstractC1346o) {
        super(abstractC1346o);
        if (abstractC1346o instanceof C1342k) {
            this.f5676e = 2;
        } else {
            this.f5676e = 3;
        }
    }

    @Override // p132t.C1337f
    /* renamed from: d */
    public final void mo3085d(int i2) {
        if (this.f5681j) {
            return;
        }
        this.f5681j = true;
        this.f5678g = i2;
        Iterator it = this.f5682k.iterator();
        while (it.hasNext()) {
            InterfaceC1335d interfaceC1335d = (InterfaceC1335d) it.next();
            interfaceC1335d.mo3068a(interfaceC1335d);
        }
    }
}
