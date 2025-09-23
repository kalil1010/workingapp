package p080b1;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p065W1.C0584d;
import p065W1.C0585e;

/* renamed from: b1.n */
/* loaded from: classes.dex */
public final class C0776n extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f2904a;

    /* renamed from: b */
    public final /* synthetic */ AbstractMap f2905b;

    public /* synthetic */ C0776n(AbstractMap abstractMap, int i2) {
        this.f2904a = i2;
        this.f2905b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2904a) {
            case 0:
                ((C0778p) this.f2905b).clear();
                break;
            case 1:
                ((C0778p) this.f2905b).clear();
                break;
            default:
                ((C0585e) this.f2905b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C0777o c0777oM1991a;
        switch (this.f2904a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                C0778p c0778p = (C0778p) this.f2905b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0777o c0777o = null;
                if (key != null) {
                    try {
                        c0777oM1991a = c0778p.m1991a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c0777oM1991a = null;
                }
                if (c0777oM1991a != null && Objects.equals(c0777oM1991a.f2913h, entry.getValue())) {
                    c0777o = c0777oM1991a;
                }
                return c0777o != null;
            case 1:
                return ((C0778p) this.f2905b).containsKey(obj);
            default:
                return ((C0585e) this.f2905b).f1880a.entrySet().contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2904a) {
            case 0:
                return new C0775m((C0778p) this.f2905b, 0);
            case 1:
                return new C0775m((C0778p) this.f2905b, 1);
            default:
                C0585e c0585e = (C0585e) this.f2905b;
                return new C0584d(c0585e, c0585e.f1880a.entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0777o c0777oM1991a;
        switch (this.f2904a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C0778p c0778p = (C0778p) this.f2905b;
                    Object key = entry.getKey();
                    C0777o c0777o = null;
                    if (key != null) {
                        try {
                            c0777oM1991a = c0778p.m1991a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        c0777oM1991a = null;
                    }
                    if (c0777oM1991a != null && Objects.equals(c0777oM1991a.f2913h, entry.getValue())) {
                        c0777o = c0777oM1991a;
                    }
                    if (c0777o != null) {
                        c0778p.m1993c(c0777o, true);
                        break;
                    }
                }
                break;
            case 1:
                C0778p c0778p2 = (C0778p) this.f2905b;
                C0777o c0777oM1991a2 = null;
                if (obj != null) {
                    try {
                        c0777oM1991a2 = c0778p2.m1991a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c0777oM1991a2 != null) {
                    c0778p2.m1993c(c0777oM1991a2, true);
                }
                if (c0777oM1991a2 != null) {
                    break;
                }
                break;
            default:
                if (contains(obj)) {
                    ((C0585e) this.f2905b).f1881b.m1395b(((Map.Entry) obj).getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2904a) {
            case 0:
                return ((C0778p) this.f2905b).f2919d;
            case 1:
                return ((C0778p) this.f2905b).f2919d;
            default:
                return ((C0585e) this.f2905b).f1880a.size();
        }
    }
}
