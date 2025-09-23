package p110k1;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p131s1.AbstractC1326c;

/* renamed from: k1.g */
/* loaded from: classes.dex */
public final class C1205g extends AbstractList implements List {

    /* renamed from: d */
    public static final Object[] f4899d = new Object[0];

    /* renamed from: a */
    public int f4900a;

    /* renamed from: b */
    public Object[] f4901b = f4899d;

    /* renamed from: c */
    public int f4902c;

    /* renamed from: a */
    public final void m2837a(Object obj) {
        m2839c(this.f4902c + 1);
        this.f4901b[m2841e(this.f4900a + this.f4902c)] = obj;
        this.f4902c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int length;
        int i3 = this.f4902c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == i3) {
            m2837a(obj);
            return;
        }
        if (i2 == 0) {
            m2839c(i3 + 1);
            int length2 = this.f4900a;
            if (length2 == 0) {
                Object[] objArr = this.f4901b;
                AbstractC1326c.m3062e(objArr, "<this>");
                length2 = objArr.length;
            }
            int i4 = length2 - 1;
            this.f4900a = i4;
            this.f4901b[i4] = obj;
            this.f4902c++;
            return;
        }
        m2839c(i3 + 1);
        int iM2841e = m2841e(this.f4900a + i2);
        int i5 = this.f4902c;
        if (i2 < ((i5 + 1) >> 1)) {
            if (iM2841e == 0) {
                Object[] objArr2 = this.f4901b;
                AbstractC1326c.m3062e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = iM2841e - 1;
            }
            int length3 = this.f4900a;
            if (length3 == 0) {
                Object[] objArr3 = this.f4901b;
                AbstractC1326c.m3062e(objArr3, "<this>");
                length3 = objArr3.length;
            }
            int i6 = length3 - 1;
            int i7 = this.f4900a;
            if (length >= i7) {
                Object[] objArr4 = this.f4901b;
                objArr4[i6] = objArr4[i7];
                AbstractC1206h.m2843n0(objArr4, objArr4, i7, i7 + 1, length + 1);
            } else {
                Object[] objArr5 = this.f4901b;
                AbstractC1206h.m2843n0(objArr5, objArr5, i7 - 1, i7, objArr5.length);
                Object[] objArr6 = this.f4901b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC1206h.m2843n0(objArr6, objArr6, 0, 1, length + 1);
            }
            this.f4901b[length] = obj;
            this.f4900a = i6;
        } else {
            int iM2841e2 = m2841e(this.f4900a + i5);
            if (iM2841e < iM2841e2) {
                Object[] objArr7 = this.f4901b;
                AbstractC1206h.m2843n0(objArr7, objArr7, iM2841e + 1, iM2841e, iM2841e2);
            } else {
                Object[] objArr8 = this.f4901b;
                AbstractC1206h.m2843n0(objArr8, objArr8, 1, 0, iM2841e2);
                Object[] objArr9 = this.f4901b;
                objArr9[0] = objArr9[objArr9.length - 1];
                AbstractC1206h.m2843n0(objArr9, objArr9, iM2841e + 1, iM2841e, objArr9.length - 1);
            }
            this.f4901b[iM2841e] = obj;
        }
        this.f4902c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        AbstractC1326c.m3062e(collection, "elements");
        int i3 = this.f4902c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i4 = this.f4902c;
        if (i2 == i4) {
            return addAll(collection);
        }
        m2839c(collection.size() + i4);
        int iM2841e = m2841e(this.f4900a + this.f4902c);
        int iM2841e2 = m2841e(this.f4900a + i2);
        int size = collection.size();
        if (i2 >= ((this.f4902c + 1) >> 1)) {
            int i5 = iM2841e2 + size;
            if (iM2841e2 < iM2841e) {
                int i6 = size + iM2841e;
                Object[] objArr = this.f4901b;
                if (i6 <= objArr.length) {
                    AbstractC1206h.m2843n0(objArr, objArr, i5, iM2841e2, iM2841e);
                } else if (i5 >= objArr.length) {
                    AbstractC1206h.m2843n0(objArr, objArr, i5 - objArr.length, iM2841e2, iM2841e);
                } else {
                    int length = iM2841e - (i6 - objArr.length);
                    AbstractC1206h.m2843n0(objArr, objArr, 0, length, iM2841e);
                    Object[] objArr2 = this.f4901b;
                    AbstractC1206h.m2843n0(objArr2, objArr2, i5, iM2841e2, length);
                }
            } else {
                Object[] objArr3 = this.f4901b;
                AbstractC1206h.m2843n0(objArr3, objArr3, size, 0, iM2841e);
                Object[] objArr4 = this.f4901b;
                if (i5 >= objArr4.length) {
                    AbstractC1206h.m2843n0(objArr4, objArr4, i5 - objArr4.length, iM2841e2, objArr4.length);
                } else {
                    AbstractC1206h.m2843n0(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f4901b;
                    AbstractC1206h.m2843n0(objArr5, objArr5, i5, iM2841e2, objArr5.length - size);
                }
            }
            m2838b(iM2841e2, collection);
            return true;
        }
        int i7 = this.f4900a;
        int length2 = i7 - size;
        if (iM2841e2 < i7) {
            Object[] objArr6 = this.f4901b;
            AbstractC1206h.m2843n0(objArr6, objArr6, length2, i7, objArr6.length);
            if (size >= iM2841e2) {
                Object[] objArr7 = this.f4901b;
                AbstractC1206h.m2843n0(objArr7, objArr7, objArr7.length - size, 0, iM2841e2);
            } else {
                Object[] objArr8 = this.f4901b;
                AbstractC1206h.m2843n0(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f4901b;
                AbstractC1206h.m2843n0(objArr9, objArr9, 0, size, iM2841e2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f4901b;
            AbstractC1206h.m2843n0(objArr10, objArr10, length2, i7, iM2841e2);
        } else {
            Object[] objArr11 = this.f4901b;
            length2 += objArr11.length;
            int i8 = iM2841e2 - i7;
            int length3 = objArr11.length - length2;
            if (length3 >= i8) {
                AbstractC1206h.m2843n0(objArr11, objArr11, length2, i7, iM2841e2);
            } else {
                AbstractC1206h.m2843n0(objArr11, objArr11, length2, i7, i7 + length3);
                Object[] objArr12 = this.f4901b;
                AbstractC1206h.m2843n0(objArr12, objArr12, 0, this.f4900a + length3, iM2841e2);
            }
        }
        this.f4900a = length2;
        int length4 = iM2841e2 - size;
        if (length4 < 0) {
            length4 += this.f4901b.length;
        }
        m2838b(length4, collection);
        return true;
    }

    /* renamed from: b */
    public final void m2838b(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f4901b.length;
        while (i2 < length && it.hasNext()) {
            this.f4901b[i2] = it.next();
            i2++;
        }
        int i3 = this.f4900a;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f4901b[i4] = it.next();
        }
        this.f4902c = collection.size() + this.f4902c;
    }

    /* renamed from: c */
    public final void m2839c(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f4901b;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f4899d) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f4901b = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        AbstractC1206h.m2843n0(objArr, objArr2, 0, this.f4900a, objArr.length);
        Object[] objArr3 = this.f4901b;
        int length2 = objArr3.length;
        int i4 = this.f4900a;
        AbstractC1206h.m2843n0(objArr3, objArr2, length2 - i4, 0, i4);
        this.f4900a = 0;
        this.f4901b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iM2841e = m2841e(this.f4900a + this.f4902c);
        int i2 = this.f4900a;
        if (i2 < iM2841e) {
            AbstractC1206h.m2845p0(this.f4901b, i2, iM2841e);
        } else if (!isEmpty()) {
            Object[] objArr = this.f4901b;
            AbstractC1206h.m2845p0(objArr, this.f4900a, objArr.length);
            AbstractC1206h.m2845p0(this.f4901b, 0, iM2841e);
        }
        this.f4900a = 0;
        this.f4902c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int m2840d(int i2) {
        AbstractC1326c.m3062e(this.f4901b, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    /* renamed from: e */
    public final int m2841e(int i2) {
        Object[] objArr = this.f4901b;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f4902c;
        if (i2 >= 0 && i2 < i3) {
            return this.f4901b[m2841e(this.f4900a + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iM2841e = m2841e(this.f4900a + this.f4902c);
        int length = this.f4900a;
        if (length < iM2841e) {
            while (length < iM2841e) {
                if (AbstractC1326c.m3058a(obj, this.f4901b[length])) {
                    i2 = this.f4900a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM2841e) {
            return -1;
        }
        int length2 = this.f4901b.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < iM2841e; i3++) {
                    if (AbstractC1326c.m3058a(obj, this.f4901b[i3])) {
                        length = i3 + this.f4901b.length;
                        i2 = this.f4900a;
                    }
                }
                return -1;
            }
            if (AbstractC1326c.m3058a(obj, this.f4901b[length])) {
                i2 = this.f4900a;
                break;
            }
            length++;
        }
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4902c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int iM2841e = m2841e(this.f4900a + this.f4902c);
        int i3 = this.f4900a;
        if (i3 < iM2841e) {
            length = iM2841e - 1;
            if (i3 <= length) {
                while (!AbstractC1326c.m3058a(obj, this.f4901b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f4900a;
                return length - i2;
            }
            return -1;
        }
        if (i3 > iM2841e) {
            int i4 = iM2841e - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f4901b;
                    AbstractC1326c.m3062e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f4900a;
                    if (i5 <= length) {
                        while (!AbstractC1326c.m3058a(obj, this.f4901b[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f4900a;
                    }
                } else {
                    if (AbstractC1326c.m3058a(obj, this.f4901b[i4])) {
                        length = i4 + this.f4901b.length;
                        i2 = this.f4900a;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3 = this.f4902c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == size() - 1) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int iM2841e = m2841e((size() - 1) + this.f4900a);
            Object[] objArr = this.f4901b;
            Object obj = objArr[iM2841e];
            objArr[iM2841e] = null;
            this.f4902c--;
            return obj;
        }
        if (i2 == 0) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            Object[] objArr2 = this.f4901b;
            int i4 = this.f4900a;
            Object obj2 = objArr2[i4];
            objArr2[i4] = null;
            this.f4900a = m2840d(i4);
            this.f4902c--;
            return obj2;
        }
        int iM2841e2 = m2841e(this.f4900a + i2);
        Object[] objArr3 = this.f4901b;
        Object obj3 = objArr3[iM2841e2];
        if (i2 < (this.f4902c >> 1)) {
            int i5 = this.f4900a;
            if (iM2841e2 >= i5) {
                AbstractC1206h.m2843n0(objArr3, objArr3, i5 + 1, i5, iM2841e2);
            } else {
                AbstractC1206h.m2843n0(objArr3, objArr3, 1, 0, iM2841e2);
                Object[] objArr4 = this.f4901b;
                objArr4[0] = objArr4[objArr4.length - 1];
                int i6 = this.f4900a;
                AbstractC1206h.m2843n0(objArr4, objArr4, i6 + 1, i6, objArr4.length - 1);
            }
            Object[] objArr5 = this.f4901b;
            int i7 = this.f4900a;
            objArr5[i7] = null;
            this.f4900a = m2840d(i7);
        } else {
            int iM2841e3 = m2841e((size() - 1) + this.f4900a);
            if (iM2841e2 <= iM2841e3) {
                Object[] objArr6 = this.f4901b;
                AbstractC1206h.m2843n0(objArr6, objArr6, iM2841e2, iM2841e2 + 1, iM2841e3 + 1);
            } else {
                Object[] objArr7 = this.f4901b;
                AbstractC1206h.m2843n0(objArr7, objArr7, iM2841e2, iM2841e2 + 1, objArr7.length);
                Object[] objArr8 = this.f4901b;
                objArr8[objArr8.length - 1] = objArr8[0];
                AbstractC1206h.m2843n0(objArr8, objArr8, 0, 1, iM2841e3 + 1);
            }
            this.f4901b[iM2841e3] = null;
        }
        this.f4902c--;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM2841e;
        AbstractC1326c.m3062e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f4901b.length != 0) {
            int iM2841e2 = m2841e(this.f4900a + this.f4902c);
            int i2 = this.f4900a;
            if (i2 < iM2841e2) {
                iM2841e = i2;
                while (i2 < iM2841e2) {
                    Object obj = this.f4901b[i2];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f4901b[iM2841e] = obj;
                        iM2841e++;
                    }
                    i2++;
                }
                AbstractC1206h.m2845p0(this.f4901b, iM2841e, iM2841e2);
            } else {
                int length = this.f4901b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f4901b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f4901b[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iM2841e = m2841e(i3);
                for (int i4 = 0; i4 < iM2841e2; i4++) {
                    Object[] objArr2 = this.f4901b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f4901b[iM2841e] = obj3;
                        iM2841e = m2840d(iM2841e);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int length2 = iM2841e - this.f4900a;
                if (length2 < 0) {
                    length2 += this.f4901b.length;
                }
                this.f4902c = length2;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM2841e;
        AbstractC1326c.m3062e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f4901b.length != 0) {
            int iM2841e2 = m2841e(this.f4900a + this.f4902c);
            int i2 = this.f4900a;
            if (i2 < iM2841e2) {
                iM2841e = i2;
                while (i2 < iM2841e2) {
                    Object obj = this.f4901b[i2];
                    if (collection.contains(obj)) {
                        this.f4901b[iM2841e] = obj;
                        iM2841e++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                AbstractC1206h.m2845p0(this.f4901b, iM2841e, iM2841e2);
            } else {
                int length = this.f4901b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f4901b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f4901b[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                iM2841e = m2841e(i3);
                for (int i4 = 0; i4 < iM2841e2; i4++) {
                    Object[] objArr2 = this.f4901b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f4901b[iM2841e] = obj3;
                        iM2841e = m2840d(iM2841e);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int length2 = iM2841e - this.f4900a;
                if (length2 < 0) {
                    length2 += this.f4901b.length;
                }
                this.f4902c = length2;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.f4902c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int iM2841e = m2841e(this.f4900a + i2);
        Object[] objArr = this.f4901b;
        Object obj2 = objArr[iM2841e];
        objArr[iM2841e] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4902c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f4902c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        AbstractC1326c.m3062e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f4902c;
        if (length < i2) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            AbstractC1326c.m3060c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM2841e = m2841e(this.f4900a + this.f4902c);
        int i3 = this.f4900a;
        if (i3 < iM2841e) {
            AbstractC1206h.m2843n0(this.f4901b, objArr, 0, i3, iM2841e);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f4901b;
            AbstractC1206h.m2843n0(objArr2, objArr, 0, this.f4900a, objArr2.length);
            Object[] objArr3 = this.f4901b;
            AbstractC1206h.m2843n0(objArr3, objArr, objArr3.length - this.f4900a, 0, iM2841e);
        }
        int length2 = objArr.length;
        int i4 = this.f4902c;
        if (length2 > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2837a(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1326c.m3062e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m2839c(collection.size() + this.f4902c);
        m2838b(m2841e(this.f4900a + this.f4902c), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
