package p110k1;

import java.util.ArrayList;
import java.util.Arrays;
import p033L1.AbstractC0364l;
import p131s1.AbstractC1326c;

/* renamed from: k1.h */
/* loaded from: classes.dex */
public abstract class AbstractC1206h extends AbstractC0364l {
    /* renamed from: m0 */
    public static void m2842m0(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        AbstractC1326c.m3062e(bArr, "<this>");
        AbstractC1326c.m3062e(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
    }

    /* renamed from: n0 */
    public static final void m2843n0(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        AbstractC1326c.m3062e(objArr, "<this>");
        AbstractC1326c.m3062e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    /* renamed from: o0 */
    public static byte[] m2844o0(byte[] bArr, int i2) {
        AbstractC1326c.m3062e(bArr, "<this>");
        int length = bArr.length;
        if (i2 <= length) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i2);
            AbstractC1326c.m3061d(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return bArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    /* renamed from: p0 */
    public static void m2845p0(Object[] objArr, int i2, int i3) {
        AbstractC1326c.m3062e(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, (Object) null);
    }

    /* renamed from: q0 */
    public static ArrayList m2846q0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
