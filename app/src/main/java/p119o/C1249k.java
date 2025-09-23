package p119o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: o.k */
/* loaded from: classes.dex */
public class C1249k {

    /* renamed from: d */
    public static Object[] f5052d;

    /* renamed from: e */
    public static int f5053e;

    /* renamed from: f */
    public static Object[] f5054f;

    /* renamed from: g */
    public static int f5055g;

    /* renamed from: a */
    public int[] f5056a = AbstractC1242d.f5028a;

    /* renamed from: b */
    public Object[] f5057b = AbstractC1242d.f5029b;

    /* renamed from: c */
    public int f5058c = 0;

    /* renamed from: c */
    public static void m2905c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C1249k.class) {
                try {
                    if (f5055g < 10) {
                        objArr[0] = f5054f;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f5054f = objArr;
                        f5055g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1249k.class) {
                try {
                    if (f5053e < 10) {
                        objArr[0] = f5052d;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f5052d = objArr;
                        f5053e++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2906a(int i2) {
        if (i2 == 8) {
            synchronized (C1249k.class) {
                try {
                    Object[] objArr = f5054f;
                    if (objArr != null) {
                        this.f5057b = objArr;
                        f5054f = (Object[]) objArr[0];
                        this.f5056a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5055g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C1249k.class) {
                try {
                    Object[] objArr2 = f5052d;
                    if (objArr2 != null) {
                        this.f5057b = objArr2;
                        f5052d = (Object[]) objArr2[0];
                        this.f5056a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5053e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f5056a = new int[i2];
        this.f5057b = new Object[i2 << 1];
    }

    /* renamed from: b */
    public final void m2907b(int i2) {
        int i3 = this.f5058c;
        int[] iArr = this.f5056a;
        if (iArr.length < i2) {
            Object[] objArr = this.f5057b;
            m2906a(i2);
            if (this.f5058c > 0) {
                System.arraycopy(iArr, 0, this.f5056a, 0, i3);
                System.arraycopy(objArr, 0, this.f5057b, 0, i3 << 1);
            }
            m2905c(iArr, objArr, i3);
        }
        if (this.f5058c != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i2 = this.f5058c;
        if (i2 > 0) {
            int[] iArr = this.f5056a;
            Object[] objArr = this.f5057b;
            this.f5056a = AbstractC1242d.f5028a;
            this.f5057b = AbstractC1242d.f5029b;
            this.f5058c = 0;
            m2905c(iArr, objArr, i2);
        }
        if (this.f5058c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m2909e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m2911g(obj) >= 0;
    }

    /* renamed from: d */
    public final int m2908d(int i2, Object obj) {
        int i3 = this.f5058c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iM2895a = AbstractC1242d.m2895a(i3, i2, this.f5056a);
            if (iM2895a < 0 || obj.equals(this.f5057b[iM2895a << 1])) {
                return iM2895a;
            }
            int i4 = iM2895a + 1;
            while (i4 < i3 && this.f5056a[i4] == i2) {
                if (obj.equals(this.f5057b[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iM2895a - 1; i5 >= 0 && this.f5056a[i5] == i2; i5--) {
                if (obj.equals(this.f5057b[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public final int m2909e(Object obj) {
        return obj == null ? m2910f() : m2908d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1249k) {
            C1249k c1249k = (C1249k) obj;
            if (this.f5058c != c1249k.f5058c) {
                return false;
            }
            for (int i2 = 0; i2 < this.f5058c; i2++) {
                try {
                    Object objM2912h = m2912h(i2);
                    Object objM2914j = m2914j(i2);
                    Object orDefault = c1249k.getOrDefault(objM2912h, null);
                    if (objM2914j == null) {
                        if (orDefault != null || !c1249k.containsKey(objM2912h)) {
                            return false;
                        }
                    } else if (!objM2914j.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f5058c != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f5058c; i3++) {
                try {
                    Object objM2912h2 = m2912h(i3);
                    Object objM2914j2 = m2914j(i3);
                    Object obj2 = map.get(objM2912h2);
                    if (objM2914j2 == null) {
                        if (obj2 != null || !map.containsKey(objM2912h2)) {
                            return false;
                        }
                    } else if (!objM2914j2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m2910f() {
        int i2 = this.f5058c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM2895a = AbstractC1242d.m2895a(i2, 0, this.f5056a);
            if (iM2895a < 0 || this.f5057b[iM2895a << 1] == null) {
                return iM2895a;
            }
            int i3 = iM2895a + 1;
            while (i3 < i2 && this.f5056a[i3] == 0) {
                if (this.f5057b[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM2895a - 1; i4 >= 0 && this.f5056a[i4] == 0; i4--) {
                if (this.f5057b[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public final int m2911g(Object obj) {
        int i2 = this.f5058c * 2;
        Object[] objArr = this.f5057b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM2909e = m2909e(obj);
        return iM2909e >= 0 ? this.f5057b[(iM2909e << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public final Object m2912h(int i2) {
        return this.f5057b[i2 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f5056a;
        Object[] objArr = this.f5057b;
        int i2 = this.f5058c;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    /* renamed from: i */
    public final Object m2913i(int i2) {
        Object[] objArr = this.f5057b;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f5058c;
        int i5 = 0;
        if (i4 <= 1) {
            m2905c(this.f5056a, objArr, i4);
            this.f5056a = AbstractC1242d.f5028a;
            this.f5057b = AbstractC1242d.f5029b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f5056a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f5057b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f5057b;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                m2906a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f5058c) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f5056a, 0, i2);
                    System.arraycopy(objArr, 0, this.f5057b, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f5056a, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f5057b, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f5058c) {
            throw new ConcurrentModificationException();
        }
        this.f5058c = i5;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f5058c <= 0;
    }

    /* renamed from: j */
    public final Object m2914j(int i2) {
        return this.f5057b[(i2 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int iM2908d;
        int i3 = this.f5058c;
        if (obj == null) {
            iM2908d = m2910f();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iM2908d = m2908d(iHashCode, obj);
        }
        if (iM2908d >= 0) {
            int i4 = (iM2908d << 1) + 1;
            Object[] objArr = this.f5057b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~iM2908d;
        int[] iArr = this.f5056a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f5057b;
            m2906a(i6);
            if (i3 != this.f5058c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f5056a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f5057b, 0, objArr2.length);
            }
            m2905c(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f5056a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f5057b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f5058c - i5) << 1);
        }
        int i8 = this.f5058c;
        if (i3 == i8) {
            int[] iArr4 = this.f5056a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f5057b;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f5058c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iM2909e = m2909e(obj);
        if (iM2909e >= 0) {
            return m2913i(iM2909e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM2909e = m2909e(obj);
        if (iM2909e < 0) {
            return null;
        }
        int i2 = (iM2909e << 1) + 1;
        Object[] objArr = this.f5057b;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f5058c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5058c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5058c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM2912h = m2912h(i2);
            if (objM2912h != this) {
                sb.append(objM2912h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM2914j = m2914j(i2);
            if (objM2914j != this) {
                sb.append(objM2914j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM2909e = m2909e(obj);
        if (iM2909e < 0) {
            return false;
        }
        Object objM2914j = m2914j(iM2909e);
        if (obj2 != objM2914j && (obj2 == null || !obj2.equals(objM2914j))) {
            return false;
        }
        m2913i(iM2909e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM2909e = m2909e(obj);
        if (iM2909e < 0) {
            return false;
        }
        Object objM2914j = m2914j(iM2909e);
        if (objM2914j != obj2 && (obj2 == null || !obj2.equals(objM2914j))) {
            return false;
        }
        int i2 = (iM2909e << 1) + 1;
        Object[] objArr = this.f5057b;
        Object obj4 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
