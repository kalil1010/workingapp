package p111l;

import java.util.Iterator;

/* renamed from: l.b */
/* loaded from: classes.dex */
public final class C1220b extends AbstractC1223e implements Iterator {

    /* renamed from: a */
    public C1221c f4908a;

    /* renamed from: b */
    public C1221c f4909b;

    /* renamed from: c */
    public final /* synthetic */ int f4910c;

    public C1220b(C1221c c1221c, C1221c c1221c2, int i2) {
        this.f4910c = i2;
        this.f4908a = c1221c2;
        this.f4909b = c1221c;
    }

    @Override // p111l.AbstractC1223e
    /* renamed from: a */
    public final void mo2856a(C1221c c1221c) {
        C1221c c1221c2;
        C1221c c1221cM2857b = null;
        if (this.f4908a == c1221c && c1221c == this.f4909b) {
            this.f4909b = null;
            this.f4908a = null;
        }
        C1221c c1221c3 = this.f4908a;
        if (c1221c3 == c1221c) {
            switch (this.f4910c) {
                case 0:
                    c1221c2 = c1221c3.f4914d;
                    break;
                default:
                    c1221c2 = c1221c3.f4913c;
                    break;
            }
            this.f4908a = c1221c2;
        }
        C1221c c1221c4 = this.f4909b;
        if (c1221c4 == c1221c) {
            C1221c c1221c5 = this.f4908a;
            if (c1221c4 != c1221c5 && c1221c5 != null) {
                c1221cM2857b = m2857b(c1221c4);
            }
            this.f4909b = c1221cM2857b;
        }
    }

    /* renamed from: b */
    public final C1221c m2857b(C1221c c1221c) {
        switch (this.f4910c) {
            case 0:
                return c1221c.f4913c;
            default:
                return c1221c.f4914d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4909b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1221c c1221c = this.f4909b;
        C1221c c1221c2 = this.f4908a;
        this.f4909b = (c1221c == c1221c2 || c1221c2 == null) ? null : m2857b(c1221c);
        return c1221c;
    }
}
