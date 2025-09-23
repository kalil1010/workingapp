package p111l;

import java.util.Map;

/* renamed from: l.c */
/* loaded from: classes.dex */
public final class C1221c implements Map.Entry {

    /* renamed from: a */
    public final Object f4911a;

    /* renamed from: b */
    public final Object f4912b;

    /* renamed from: c */
    public C1221c f4913c;

    /* renamed from: d */
    public C1221c f4914d;

    public C1221c(Object obj, Object obj2) {
        this.f4911a = obj;
        this.f4912b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1221c)) {
            return false;
        }
        C1221c c1221c = (C1221c) obj;
        return this.f4911a.equals(c1221c.f4911a) && this.f4912b.equals(c1221c.f4912b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4911a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4912b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4911a.hashCode() ^ this.f4912b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4911a + "=" + this.f4912b;
    }
}
