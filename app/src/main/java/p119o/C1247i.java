package p119o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o.i */
/* loaded from: classes.dex */
public final class C1247i implements Iterator, Map.Entry {

    /* renamed from: a */
    public int f5047a;

    /* renamed from: d */
    public final /* synthetic */ C1239a f5050d;

    /* renamed from: c */
    public boolean f5049c = false;

    /* renamed from: b */
    public int f5048b = -1;

    public C1247i(C1239a c1239a) {
        this.f5050d = c1239a;
        this.f5047a = c1239a.m2885d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f5049c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f5048b;
        C1239a c1239a = this.f5050d;
        Object objM2883b = c1239a.m2883b(i2, 0);
        if (key != objM2883b && (key == null || !key.equals(objM2883b))) {
            return false;
        }
        Object value = entry.getValue();
        Object objM2883b2 = c1239a.m2883b(this.f5048b, 1);
        return value == objM2883b2 || (value != null && value.equals(objM2883b2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f5049c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f5050d.m2883b(this.f5048b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f5049c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f5050d.m2883b(this.f5048b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5048b < this.f5047a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f5049c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f5048b;
        C1239a c1239a = this.f5050d;
        Object objM2883b = c1239a.m2883b(i2, 0);
        Object objM2883b2 = c1239a.m2883b(this.f5048b, 1);
        return (objM2883b == null ? 0 : objM2883b.hashCode()) ^ (objM2883b2 != null ? objM2883b2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5048b++;
        this.f5049c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5049c) {
            throw new IllegalStateException();
        }
        this.f5050d.m2888g(this.f5048b);
        this.f5048b--;
        this.f5047a--;
        this.f5049c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f5049c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C1239a c1239a = this.f5050d;
        int i2 = this.f5048b;
        switch (c1239a.f5015d) {
            case 0:
                int i3 = (i2 << 1) + 1;
                Object[] objArr = ((C1240b) c1239a.f5016e).f5057b;
                Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
