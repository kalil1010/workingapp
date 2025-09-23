package p011D1;

import java.util.Comparator;
import p131s1.AbstractC1326c;

/* renamed from: D1.f */
/* loaded from: classes.dex */
public final class C0116f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        AbstractC1326c.m3062e(str, "a");
        AbstractC1326c.m3062e(str2, "b");
        int iMin = Math.min(str.length(), str2.length());
        for (int i2 = 4; i2 < iMin; i2++) {
            char cCharAt = str.charAt(i2);
            char cCharAt2 = str2.charAt(i2);
            if (cCharAt != cCharAt2) {
                return AbstractC1326c.m3063f(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
