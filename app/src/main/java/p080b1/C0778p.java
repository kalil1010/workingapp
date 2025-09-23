package p080b1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
import p035M0.C0369B;

/* renamed from: b1.p */
/* loaded from: classes.dex */
public final class C0778p extends AbstractMap implements Serializable {

    /* renamed from: i */
    public static final C0369B f2915i = new C0369B(1);

    /* renamed from: a */
    public final Comparator f2916a;

    /* renamed from: b */
    public final boolean f2917b;

    /* renamed from: c */
    public C0777o f2918c;

    /* renamed from: d */
    public int f2919d;

    /* renamed from: e */
    public int f2920e;

    /* renamed from: f */
    public final C0777o f2921f;

    /* renamed from: g */
    public C0776n f2922g;

    /* renamed from: h */
    public C0776n f2923h;

    public C0778p(boolean z2) {
        C0369B c0369b = f2915i;
        this.f2919d = 0;
        this.f2920e = 0;
        this.f2916a = c0369b;
        this.f2917b = z2;
        this.f2921f = new C0777o(z2);
    }

    /* renamed from: a */
    public final C0777o m1991a(Object obj, boolean z2) {
        int iCompareTo;
        C0777o c0777o;
        C0777o c0777o2 = this.f2918c;
        C0369B c0369b = f2915i;
        Comparator comparator = this.f2916a;
        if (c0777o2 != null) {
            Comparable comparable = comparator == c0369b ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c0777o2.f2911f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c0777o2;
                }
                C0777o c0777o3 = iCompareTo < 0 ? c0777o2.f2907b : c0777o2.f2908c;
                if (c0777o3 == null) {
                    break;
                }
                c0777o2 = c0777o3;
            }
        } else {
            iCompareTo = 0;
        }
        C0777o c0777o4 = c0777o2;
        if (!z2) {
            return null;
        }
        C0777o c0777o5 = this.f2921f;
        if (c0777o4 != null) {
            c0777o = new C0777o(this.f2917b, c0777o4, obj, c0777o5, c0777o5.f2910e);
            if (iCompareTo < 0) {
                c0777o4.f2907b = c0777o;
            } else {
                c0777o4.f2908c = c0777o;
            }
            m1992b(c0777o4, true);
        } else {
            if (comparator == c0369b && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c0777o = new C0777o(this.f2917b, c0777o4, obj, c0777o5, c0777o5.f2910e);
            this.f2918c = c0777o;
        }
        this.f2919d++;
        this.f2920e++;
        return c0777o;
    }

    /* renamed from: b */
    public final void m1992b(C0777o c0777o, boolean z2) {
        while (c0777o != null) {
            C0777o c0777o2 = c0777o.f2907b;
            C0777o c0777o3 = c0777o.f2908c;
            int i2 = c0777o2 != null ? c0777o2.f2914i : 0;
            int i3 = c0777o3 != null ? c0777o3.f2914i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C0777o c0777o4 = c0777o3.f2907b;
                C0777o c0777o5 = c0777o3.f2908c;
                int i5 = (c0777o4 != null ? c0777o4.f2914i : 0) - (c0777o5 != null ? c0777o5.f2914i : 0);
                if (i5 == -1 || (i5 == 0 && !z2)) {
                    m1995e(c0777o);
                } else {
                    m1996f(c0777o3);
                    m1995e(c0777o);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 2) {
                C0777o c0777o6 = c0777o2.f2907b;
                C0777o c0777o7 = c0777o2.f2908c;
                int i6 = (c0777o6 != null ? c0777o6.f2914i : 0) - (c0777o7 != null ? c0777o7.f2914i : 0);
                if (i6 == 1 || (i6 == 0 && !z2)) {
                    m1996f(c0777o);
                } else {
                    m1995e(c0777o2);
                    m1996f(c0777o);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 0) {
                c0777o.f2914i = i2 + 1;
                if (z2) {
                    return;
                }
            } else {
                c0777o.f2914i = Math.max(i2, i3) + 1;
                if (!z2) {
                    return;
                }
            }
            c0777o = c0777o.f2906a;
        }
    }

    /* renamed from: c */
    public final void m1993c(C0777o c0777o, boolean z2) {
        C0777o c0777o2;
        C0777o c0777o3;
        int i2;
        if (z2) {
            C0777o c0777o4 = c0777o.f2910e;
            c0777o4.f2909d = c0777o.f2909d;
            c0777o.f2909d.f2910e = c0777o4;
        }
        C0777o c0777o5 = c0777o.f2907b;
        C0777o c0777o6 = c0777o.f2908c;
        C0777o c0777o7 = c0777o.f2906a;
        int i3 = 0;
        if (c0777o5 == null || c0777o6 == null) {
            if (c0777o5 != null) {
                m1994d(c0777o, c0777o5);
                c0777o.f2907b = null;
            } else if (c0777o6 != null) {
                m1994d(c0777o, c0777o6);
                c0777o.f2908c = null;
            } else {
                m1994d(c0777o, null);
            }
            m1992b(c0777o7, false);
            this.f2919d--;
            this.f2920e++;
            return;
        }
        if (c0777o5.f2914i > c0777o6.f2914i) {
            C0777o c0777o8 = c0777o5.f2908c;
            while (true) {
                C0777o c0777o9 = c0777o8;
                c0777o3 = c0777o5;
                c0777o5 = c0777o9;
                if (c0777o5 == null) {
                    break;
                } else {
                    c0777o8 = c0777o5.f2908c;
                }
            }
        } else {
            C0777o c0777o10 = c0777o6.f2907b;
            while (true) {
                c0777o2 = c0777o6;
                c0777o6 = c0777o10;
                if (c0777o6 == null) {
                    break;
                } else {
                    c0777o10 = c0777o6.f2907b;
                }
            }
            c0777o3 = c0777o2;
        }
        m1993c(c0777o3, false);
        C0777o c0777o11 = c0777o.f2907b;
        if (c0777o11 != null) {
            i2 = c0777o11.f2914i;
            c0777o3.f2907b = c0777o11;
            c0777o11.f2906a = c0777o3;
            c0777o.f2907b = null;
        } else {
            i2 = 0;
        }
        C0777o c0777o12 = c0777o.f2908c;
        if (c0777o12 != null) {
            i3 = c0777o12.f2914i;
            c0777o3.f2908c = c0777o12;
            c0777o12.f2906a = c0777o3;
            c0777o.f2908c = null;
        }
        c0777o3.f2914i = Math.max(i2, i3) + 1;
        m1994d(c0777o, c0777o3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f2918c = null;
        this.f2919d = 0;
        this.f2920e++;
        C0777o c0777o = this.f2921f;
        c0777o.f2910e = c0777o;
        c0777o.f2909d = c0777o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C0777o c0777oM1991a = null;
        if (obj != null) {
            try {
                c0777oM1991a = m1991a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c0777oM1991a != null;
    }

    /* renamed from: d */
    public final void m1994d(C0777o c0777o, C0777o c0777o2) {
        C0777o c0777o3 = c0777o.f2906a;
        c0777o.f2906a = null;
        if (c0777o2 != null) {
            c0777o2.f2906a = c0777o3;
        }
        if (c0777o3 == null) {
            this.f2918c = c0777o2;
        } else if (c0777o3.f2907b == c0777o) {
            c0777o3.f2907b = c0777o2;
        } else {
            c0777o3.f2908c = c0777o2;
        }
    }

    /* renamed from: e */
    public final void m1995e(C0777o c0777o) {
        C0777o c0777o2 = c0777o.f2907b;
        C0777o c0777o3 = c0777o.f2908c;
        C0777o c0777o4 = c0777o3.f2907b;
        C0777o c0777o5 = c0777o3.f2908c;
        c0777o.f2908c = c0777o4;
        if (c0777o4 != null) {
            c0777o4.f2906a = c0777o;
        }
        m1994d(c0777o, c0777o3);
        c0777o3.f2907b = c0777o;
        c0777o.f2906a = c0777o3;
        int iMax = Math.max(c0777o2 != null ? c0777o2.f2914i : 0, c0777o4 != null ? c0777o4.f2914i : 0) + 1;
        c0777o.f2914i = iMax;
        c0777o3.f2914i = Math.max(iMax, c0777o5 != null ? c0777o5.f2914i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0776n c0776n = this.f2922g;
        if (c0776n != null) {
            return c0776n;
        }
        C0776n c0776n2 = new C0776n(this, 0);
        this.f2922g = c0776n2;
        return c0776n2;
    }

    /* renamed from: f */
    public final void m1996f(C0777o c0777o) {
        C0777o c0777o2 = c0777o.f2907b;
        C0777o c0777o3 = c0777o.f2908c;
        C0777o c0777o4 = c0777o2.f2907b;
        C0777o c0777o5 = c0777o2.f2908c;
        c0777o.f2907b = c0777o5;
        if (c0777o5 != null) {
            c0777o5.f2906a = c0777o;
        }
        m1994d(c0777o, c0777o2);
        c0777o2.f2908c = c0777o;
        c0777o.f2906a = c0777o2;
        int iMax = Math.max(c0777o3 != null ? c0777o3.f2914i : 0, c0777o5 != null ? c0777o5.f2914i : 0) + 1;
        c0777o.f2914i = iMax;
        c0777o2.f2914i = Math.max(iMax, c0777o4 != null ? c0777o4.f2914i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C0777o c0777oM1991a;
        if (obj != null) {
            try {
                c0777oM1991a = m1991a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            c0777oM1991a = null;
        }
        if (c0777oM1991a != null) {
            return c0777oM1991a.f2913h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0776n c0776n = this.f2923h;
        if (c0776n != null) {
            return c0776n;
        }
        C0776n c0776n2 = new C0776n(this, 1);
        this.f2923h = c0776n2;
        return c0776n2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f2917b) {
            throw new NullPointerException("value == null");
        }
        C0777o c0777oM1991a = m1991a(obj, true);
        Object obj3 = c0777oM1991a.f2913h;
        c0777oM1991a.f2913h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C0777o c0777oM1991a;
        if (obj != null) {
            try {
                c0777oM1991a = m1991a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            c0777oM1991a = null;
        }
        if (c0777oM1991a != null) {
            m1993c(c0777oM1991a, true);
        }
        if (c0777oM1991a != null) {
            return c0777oM1991a.f2913h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2919d;
    }
}
