package p062V1;

import java.util.Map;
import p065W1.C0582b;

/* renamed from: V1.a */
/* loaded from: classes.dex */
public final class C0550a implements Map.Entry {

    /* renamed from: a */
    public Object f1732a;

    /* renamed from: b */
    public C0582b f1733b;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f1732a;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        C0582b c0582b = this.f1733b;
        Object value = entry.getValue();
        return c0582b == null ? value == null : c0582b.equals(value);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1732a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1733b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f1732a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        C0582b c0582b = this.f1733b;
        return iHashCode ^ (c0582b != null ? c0582b.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("setValue() is not supported");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1732a);
        sb.append('=');
        sb.append(this.f1733b);
        return sb.toString();
    }
}
