package p080b1;

import java.util.Map;

/* renamed from: b1.o */
/* loaded from: classes.dex */
public final class C0777o implements Map.Entry {

    /* renamed from: a */
    public C0777o f2906a;

    /* renamed from: b */
    public C0777o f2907b;

    /* renamed from: c */
    public C0777o f2908c;

    /* renamed from: d */
    public C0777o f2909d;

    /* renamed from: e */
    public C0777o f2910e;

    /* renamed from: f */
    public final Object f2911f;

    /* renamed from: g */
    public final boolean f2912g;

    /* renamed from: h */
    public Object f2913h;

    /* renamed from: i */
    public int f2914i;

    public C0777o(boolean z2) {
        this.f2911f = null;
        this.f2912g = z2;
        this.f2910e = this;
        this.f2909d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f2911f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f2913h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2911f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2913h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f2911f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2913h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f2912g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f2913h;
        this.f2913h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2911f + "=" + this.f2913h;
    }

    public C0777o(boolean z2, C0777o c0777o, Object obj, C0777o c0777o2, C0777o c0777o3) {
        this.f2906a = c0777o;
        this.f2911f = obj;
        this.f2912g = z2;
        this.f2914i = 1;
        this.f2909d = c0777o2;
        this.f2910e = c0777o3;
        c0777o3.f2909d = this;
        c0777o2.f2910e = this;
    }
}
