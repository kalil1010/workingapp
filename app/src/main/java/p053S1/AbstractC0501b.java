package p053S1;

import p050R1.C0492t;
import p131s1.AbstractC1326c;

/* renamed from: S1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0501b {

    /* renamed from: a */
    public static final char[] f1535a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static final int m1243a(char c3) {
        if ('0' <= c3 && '9' >= c3) {
            return c3 - '0';
        }
        if ('a' <= c3 && 'f' >= c3) {
            return c3 - 'W';
        }
        if ('A' <= c3 && 'F' >= c3) {
            return c3 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c3);
    }

    /* renamed from: b */
    public static final int m1244b(C0492t c0492t, int i2) {
        int i3;
        AbstractC1326c.m3062e(c0492t, "$this$segment");
        int i4 = i2 + 1;
        int length = c0492t.f1514e.length;
        int[] iArr = c0492t.f1515f;
        AbstractC1326c.m3062e(iArr, "$this$binarySearch");
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }
}
