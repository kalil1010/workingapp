package p132t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f */
/* loaded from: classes.dex */
public class C1337f implements InterfaceC1335d {

    /* renamed from: d */
    public final AbstractC1346o f5675d;

    /* renamed from: f */
    public int f5677f;

    /* renamed from: g */
    public int f5678g;

    /* renamed from: a */
    public AbstractC1346o f5672a = null;

    /* renamed from: b */
    public boolean f5673b = false;

    /* renamed from: c */
    public boolean f5674c = false;

    /* renamed from: e */
    public int f5676e = 1;

    /* renamed from: h */
    public int f5679h = 1;

    /* renamed from: i */
    public C1338g f5680i = null;

    /* renamed from: j */
    public boolean f5681j = false;

    /* renamed from: k */
    public final ArrayList f5682k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f5683l = new ArrayList();

    public C1337f(AbstractC1346o abstractC1346o) {
        this.f5675d = abstractC1346o;
    }

    @Override // p132t.InterfaceC1335d
    /* renamed from: a */
    public final void mo3068a(InterfaceC1335d interfaceC1335d) {
        ArrayList arrayList = this.f5683l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1337f) it.next()).f5681j) {
                return;
            }
        }
        this.f5674c = true;
        AbstractC1346o abstractC1346o = this.f5672a;
        if (abstractC1346o != null) {
            abstractC1346o.mo3068a(this);
        }
        if (this.f5673b) {
            this.f5675d.mo3068a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C1337f c1337f = null;
        int i2 = 0;
        while (it2.hasNext()) {
            C1337f c1337f2 = (C1337f) it2.next();
            if (!(c1337f2 instanceof C1338g)) {
                i2++;
                c1337f = c1337f2;
            }
        }
        if (c1337f != null && i2 == 1 && c1337f.f5681j) {
            C1338g c1338g = this.f5680i;
            if (c1338g != null) {
                if (!c1338g.f5681j) {
                    return;
                } else {
                    this.f5677f = this.f5679h * c1338g.f5678g;
                }
            }
            mo3085d(c1337f.f5678g + this.f5677f);
        }
        AbstractC1346o abstractC1346o2 = this.f5672a;
        if (abstractC1346o2 != null) {
            abstractC1346o2.mo3068a(this);
        }
    }

    /* renamed from: b */
    public final void m3083b(AbstractC1346o abstractC1346o) {
        this.f5682k.add(abstractC1346o);
        if (this.f5681j) {
            abstractC1346o.mo3068a(abstractC1346o);
        }
    }

    /* renamed from: c */
    public final void m3084c() {
        this.f5683l.clear();
        this.f5682k.clear();
        this.f5681j = false;
        this.f5678g = 0;
        this.f5674c = false;
        this.f5673b = false;
    }

    /* renamed from: d */
    public void mo3085d(int i2) {
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

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5675d.f5698b.f5527h0);
        sb.append(":");
        switch (this.f5676e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f5681j ? Integer.valueOf(this.f5678g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f5683l.size());
        sb.append(":d=");
        sb.append(this.f5682k.size());
        sb.append(">");
        return sb.toString();
    }
}
