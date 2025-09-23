package p011D1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p001A0.C0004c;
import p014E1.AbstractC0145b;
import p033L1.AbstractC0364l;
import p107j1.C1178a;
import p110k1.C1200b;
import p131s1.AbstractC1326c;
import p140v1.C1378a;

/* renamed from: D1.n */
/* loaded from: classes.dex */
public final class C0124n implements Iterable {

    /* renamed from: a */
    public final String[] f362a;

    public C0124n(String[] strArr) {
        this.f362a = strArr;
    }

    /* renamed from: a */
    public final String m351a(String str) {
        AbstractC1326c.m3062e(str, "name");
        String[] strArr = this.f362a;
        C1378a c1378aM1004j0 = AbstractC0364l.m1004j0(new C1378a(strArr.length - 2, 0, -1), 2);
        int i2 = c1378aM1004j0.f5989a;
        int i3 = c1378aM1004j0.f5990b;
        int i4 = c1378aM1004j0.f5991c;
        if (i4 >= 0) {
            if (i2 > i3) {
                return null;
            }
        } else if (i2 < i3) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[i2])) {
            if (i2 == i3) {
                return null;
            }
            i2 += i4;
        }
        return strArr[i2 + 1];
    }

    /* renamed from: b */
    public final String m352b(int i2) {
        return this.f362a[i2 * 2];
    }

    /* renamed from: c */
    public final C0004c m353c() {
        C0004c c0004c = new C0004c(8);
        ArrayList arrayList = (ArrayList) c0004c.f7b;
        AbstractC1326c.m3062e(arrayList, "<this>");
        List listAsList = Arrays.asList(this.f362a);
        AbstractC1326c.m3061d(listAsList, "asList(this)");
        arrayList.addAll(listAsList);
        return c0004c;
    }

    /* renamed from: d */
    public final String m354d(int i2) {
        return this.f362a[(i2 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0124n) {
            return Arrays.equals(this.f362a, ((C0124n) obj).f362a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f362a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C1178a[] c1178aArr = new C1178a[size];
        for (int i2 = 0; i2 < size; i2++) {
            c1178aArr[i2] = new C1178a(m352b(i2), m354d(i2));
        }
        return new C1200b(1, c1178aArr);
    }

    public final int size() {
        return this.f362a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM352b = m352b(i2);
            String strM354d = m354d(i2);
            sb.append(strM352b);
            sb.append(": ");
            if (AbstractC0145b.m405r(strM352b)) {
                strM354d = "██";
            }
            sb.append(strM354d);
            sb.append("\n");
        }
        String string = sb.toString();
        AbstractC1326c.m3061d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
