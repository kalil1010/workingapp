package p111l;

import java.util.Iterator;

/* renamed from: l.d */
/* loaded from: classes.dex */
public final class C1222d extends AbstractC1223e implements Iterator {

    /* renamed from: a */
    public C1221c f4915a;

    /* renamed from: b */
    public boolean f4916b = true;

    /* renamed from: c */
    public final /* synthetic */ C1224f f4917c;

    public C1222d(C1224f c1224f) {
        this.f4917c = c1224f;
    }

    @Override // p111l.AbstractC1223e
    /* renamed from: a */
    public final void mo2856a(C1221c c1221c) {
        C1221c c1221c2 = this.f4915a;
        if (c1221c == c1221c2) {
            C1221c c1221c3 = c1221c2.f4914d;
            this.f4915a = c1221c3;
            this.f4916b = c1221c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4916b) {
            return this.f4917c.f4918a != null;
        }
        C1221c c1221c = this.f4915a;
        return (c1221c == null || c1221c.f4913c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4916b) {
            this.f4916b = false;
            this.f4915a = this.f4917c.f4918a;
        } else {
            C1221c c1221c = this.f4915a;
            this.f4915a = c1221c != null ? c1221c.f4913c : null;
        }
        return this.f4915a;
    }
}
