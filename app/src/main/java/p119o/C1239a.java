package p119o;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: o.a */
/* loaded from: classes.dex */
public final class C1239a {

    /* renamed from: a */
    public C1246h f5012a;

    /* renamed from: b */
    public C1246h f5013b;

    /* renamed from: c */
    public C1248j f5014c;

    /* renamed from: d */
    public final /* synthetic */ int f5015d;

    /* renamed from: e */
    public final /* synthetic */ Object f5016e;

    public /* synthetic */ C1239a(int i2, Object obj) {
        this.f5015d = i2;
        this.f5016e = obj;
    }

    /* renamed from: h */
    public static boolean m2881h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void m2882a() {
        switch (this.f5015d) {
            case 0:
                ((C1240b) this.f5016e).clear();
                break;
            default:
                ((C1241c) this.f5016e).clear();
                break;
        }
    }

    /* renamed from: b */
    public final Object m2883b(int i2, int i3) {
        switch (this.f5015d) {
            case 0:
                return ((C1240b) this.f5016e).f5057b[(i2 << 1) + i3];
            default:
                return ((C1241c) this.f5016e).f5025b[i2];
        }
    }

    /* renamed from: c */
    public final Map m2884c() {
        switch (this.f5015d) {
            case 0:
                return (C1240b) this.f5016e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* renamed from: d */
    public final int m2885d() {
        switch (this.f5015d) {
            case 0:
                return ((C1240b) this.f5016e).f5058c;
            default:
                return ((C1241c) this.f5016e).f5026c;
        }
    }

    /* renamed from: e */
    public final int m2886e(Object obj) {
        switch (this.f5015d) {
            case 0:
                return ((C1240b) this.f5016e).m2909e(obj);
            default:
                C1241c c1241c = (C1241c) this.f5016e;
                return obj == null ? c1241c.m2893d() : c1241c.m2892c(obj.hashCode(), obj);
        }
    }

    /* renamed from: f */
    public final int m2887f(Object obj) {
        switch (this.f5015d) {
            case 0:
                return ((C1240b) this.f5016e).m2911g(obj);
            default:
                C1241c c1241c = (C1241c) this.f5016e;
                return obj == null ? c1241c.m2893d() : c1241c.m2892c(obj.hashCode(), obj);
        }
    }

    /* renamed from: g */
    public final void m2888g(int i2) {
        switch (this.f5015d) {
            case 0:
                ((C1240b) this.f5016e).m2913i(i2);
                break;
            default:
                ((C1241c) this.f5016e).m2894e(i2);
                break;
        }
    }

    /* renamed from: i */
    public final Object[] m2889i(Object[] objArr, int i2) {
        int iM2885d = m2885d();
        if (objArr.length < iM2885d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iM2885d);
        }
        for (int i3 = 0; i3 < iM2885d; i3++) {
            objArr[i3] = m2883b(i3, i2);
        }
        if (objArr.length > iM2885d) {
            objArr[iM2885d] = null;
        }
        return objArr;
    }
}
