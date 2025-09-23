package p020H;

import java.util.Comparator;

/* renamed from: H.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0172b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            byte b3 = bArr2[i2];
            if (b != b3) {
                return b - b3;
            }
        }
        return 0;
    }
}
