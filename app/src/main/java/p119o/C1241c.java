package p119o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.c */
/* loaded from: classes.dex */
public final class C1241c implements Collection, Set {

    /* renamed from: e */
    public static final int[] f5018e = new int[0];

    /* renamed from: f */
    public static final Object[] f5019f = new Object[0];

    /* renamed from: g */
    public static Object[] f5020g;

    /* renamed from: h */
    public static int f5021h;

    /* renamed from: i */
    public static Object[] f5022i;

    /* renamed from: j */
    public static int f5023j;

    /* renamed from: a */
    public int[] f5024a = f5018e;

    /* renamed from: b */
    public Object[] f5025b = f5019f;

    /* renamed from: c */
    public int f5026c = 0;

    /* renamed from: d */
    public C1239a f5027d;

    /* renamed from: b */
    public static void m2890b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C1241c.class) {
                try {
                    if (f5023j < 10) {
                        objArr[0] = f5022i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f5022i = objArr;
                        f5023j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1241c.class) {
                try {
                    if (f5021h < 10) {
                        objArr[0] = f5020g;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f5020g = objArr;
                        f5021h++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2891a(int i2) {
        if (i2 == 8) {
            synchronized (C1241c.class) {
                try {
                    Object[] objArr = f5022i;
                    if (objArr != null) {
                        this.f5025b = objArr;
                        f5022i = (Object[]) objArr[0];
                        this.f5024a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5023j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C1241c.class) {
                try {
                    Object[] objArr2 = f5020g;
                    if (objArr2 != null) {
                        this.f5025b = objArr2;
                        f5020g = (Object[]) objArr2[0];
                        this.f5024a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5021h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f5024a = new int[i2];
        this.f5025b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iM2892c;
        if (obj == null) {
            iM2892c = m2893d();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iM2892c = m2892c(iHashCode, obj);
        }
        if (iM2892c >= 0) {
            return false;
        }
        int i3 = ~iM2892c;
        int i4 = this.f5026c;
        int[] iArr = this.f5024a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f5025b;
            m2891a(i5);
            int[] iArr2 = this.f5024a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f5025b, 0, objArr.length);
            }
            m2890b(iArr, objArr, this.f5026c);
        }
        int i6 = this.f5026c;
        if (i3 < i6) {
            int[] iArr3 = this.f5024a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f5025b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f5026c - i3);
        }
        this.f5024a[i3] = i2;
        this.f5025b[i3] = obj;
        this.f5026c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f5026c;
        int[] iArr = this.f5024a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f5025b;
            m2891a(size);
            int i2 = this.f5026c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f5024a, 0, i2);
                System.arraycopy(objArr, 0, this.f5025b, 0, this.f5026c);
            }
            m2890b(iArr, objArr, this.f5026c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* renamed from: c */
    public final int m2892c(int i2, Object obj) {
        int i3 = this.f5026c;
        if (i3 == 0) {
            return -1;
        }
        int iM2895a = AbstractC1242d.m2895a(i3, i2, this.f5024a);
        if (iM2895a < 0 || obj.equals(this.f5025b[iM2895a])) {
            return iM2895a;
        }
        int i4 = iM2895a + 1;
        while (i4 < i3 && this.f5024a[i4] == i2) {
            if (obj.equals(this.f5025b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iM2895a - 1; i5 >= 0 && this.f5024a[i5] == i2; i5--) {
            if (obj.equals(this.f5025b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.f5026c;
        if (i2 != 0) {
            m2890b(this.f5024a, this.f5025b, i2);
            this.f5024a = f5018e;
            this.f5025b = f5019f;
            this.f5026c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m2893d() : m2892c(obj.hashCode(), obj)) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int m2893d() {
        int i2 = this.f5026c;
        if (i2 == 0) {
            return -1;
        }
        int iM2895a = AbstractC1242d.m2895a(i2, 0, this.f5024a);
        if (iM2895a < 0 || this.f5025b[iM2895a] == null) {
            return iM2895a;
        }
        int i3 = iM2895a + 1;
        while (i3 < i2 && this.f5024a[i3] == 0) {
            if (this.f5025b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM2895a - 1; i4 >= 0 && this.f5024a[i4] == 0; i4--) {
            if (this.f5025b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: e */
    public final void m2894e(int i2) {
        Object[] objArr = this.f5025b;
        Object obj = objArr[i2];
        int i3 = this.f5026c;
        if (i3 <= 1) {
            m2890b(this.f5024a, objArr, i3);
            this.f5024a = f5018e;
            this.f5025b = f5019f;
            this.f5026c = 0;
            return;
        }
        int[] iArr = this.f5024a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.f5026c = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                Object[] objArr2 = this.f5025b;
                System.arraycopy(objArr2, i5, objArr2, i2, this.f5026c - i2);
            }
            this.f5025b[this.f5026c] = null;
            return;
        }
        m2891a(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.f5026c--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.f5024a, 0, i2);
            System.arraycopy(objArr, 0, this.f5025b, 0, i2);
        }
        int i6 = this.f5026c;
        if (i2 < i6) {
            int i7 = i2 + 1;
            System.arraycopy(iArr, i7, this.f5024a, i2, i6 - i2);
            System.arraycopy(objArr, i7, this.f5025b, i2, this.f5026c - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f5026c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f5026c; i2++) {
                try {
                    if (!set.contains(this.f5025b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f5024a;
        int i2 = this.f5026c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5026c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f5027d == null) {
            this.f5027d = new C1239a(1, this);
        }
        C1239a c1239a = this.f5027d;
        if (c1239a.f5013b == null) {
            c1239a.f5013b = new C1246h(c1239a, 1);
        }
        return c1239a.f5013b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM2893d = obj == null ? m2893d() : m2892c(obj.hashCode(), obj);
        if (iM2893d < 0) {
            return false;
        }
        m2894e(iM2893d);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i2 = this.f5026c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f5025b[i2])) {
                m2894e(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f5026c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.f5026c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f5025b, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5026c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5026c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f5025b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f5026c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f5026c);
        }
        System.arraycopy(this.f5025b, 0, objArr, 0, this.f5026c);
        int length = objArr.length;
        int i2 = this.f5026c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
