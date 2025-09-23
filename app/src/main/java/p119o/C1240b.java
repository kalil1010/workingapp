package p119o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.b */
/* loaded from: classes.dex */
public final class C1240b extends C1249k implements Map {

    /* renamed from: h */
    public C1239a f5017h;

    public C1240b(C1249k c1249k) {
        int i2 = c1249k.f5058c;
        m2907b(i2);
        if (this.f5058c != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(c1249k.m2912h(i3), c1249k.m2914j(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(c1249k.f5056a, 0, this.f5056a, 0, i2);
            System.arraycopy(c1249k.f5057b, 0, this.f5057b, 0, i2 << 1);
            this.f5058c = i2;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f5017h == null) {
            this.f5017h = new C1239a(0, this);
        }
        C1239a c1239a = this.f5017h;
        if (c1239a.f5012a == null) {
            c1239a.f5012a = new C1246h(c1239a, 0);
        }
        return c1239a.f5012a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f5017h == null) {
            this.f5017h = new C1239a(0, this);
        }
        C1239a c1239a = this.f5017h;
        if (c1239a.f5013b == null) {
            c1239a.f5013b = new C1246h(c1239a, 1);
        }
        return c1239a.f5013b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m2907b(map.size() + this.f5058c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f5017h == null) {
            this.f5017h = new C1239a(0, this);
        }
        C1239a c1239a = this.f5017h;
        if (c1239a.f5014c == null) {
            c1239a.f5014c = new C1248j(c1239a);
        }
        return c1239a.f5014c;
    }
}
