package p030K1;

import p014E1.AbstractC0145b;
import p050R1.C0482j;
import p055T0.C0511e;
import p131s1.AbstractC1326c;

/* renamed from: K1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0310f {

    /* renamed from: a */
    public static final C0482j f957a;

    /* renamed from: b */
    public static final String[] f958b;

    /* renamed from: c */
    public static final String[] f959c;

    /* renamed from: d */
    public static final String[] f960d;

    static {
        C0482j c0482j = C0482j.f1481d;
        f957a = C0511e.m1275e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f958b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f959c = new String[64];
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            AbstractC1326c.m3061d(binaryString, "Integer.toBinaryString(it)");
            String strReplace = AbstractC0145b.m397j("%8s", binaryString).replace(' ', '0');
            AbstractC1326c.m3061d(strReplace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i2] = strReplace;
        }
        f960d = strArr;
        String[] strArr2 = f959c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = strArr2[i3] + ((Object) "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f959c;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + "|" + strArr3[i5];
            strArr3[i7 | 8] = strArr3[i6] + "|" + strArr3[i5] + "|PADDED";
        }
        int length = f959c.length;
        for (int i8 = 0; i8 < length; i8++) {
            String[] strArr4 = f959c;
            if (strArr4[i8] == null) {
                strArr4[i8] = f960d[i8];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m843a(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            java.lang.String[] r0 = p030K1.AbstractC0310f.f958b
            int r1 = r0.length
            if (r7 >= r1) goto L8
            r0 = r0[r7]
            goto L16
        L8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = p014E1.AbstractC0145b.m397j(r1, r0)
        L16:
            if (r8 != 0) goto L1b
            java.lang.String r7 = ""
            goto L69
        L1b:
            r1 = 2
            java.lang.String[] r2 = p030K1.AbstractC0310f.f960d
            if (r7 == r1) goto L67
            r1 = 3
            if (r7 == r1) goto L67
            r1 = 4
            if (r7 == r1) goto L5e
            r1 = 6
            if (r7 == r1) goto L5e
            r1 = 7
            if (r7 == r1) goto L67
            r1 = 8
            if (r7 == r1) goto L67
            java.lang.String[] r1 = p030K1.AbstractC0310f.f959c
            int r3 = r1.length
            if (r8 >= r3) goto L3b
            r1 = r1[r8]
            p131s1.AbstractC1326c.m3059b(r1)
            goto L3d
        L3b:
            r1 = r2[r8]
        L3d:
            r2 = 5
            if (r7 != r2) goto L4d
            r2 = r8 & 4
            if (r2 == 0) goto L4d
            java.lang.String r7 = "PUSH_PROMISE"
            java.lang.String r8 = "HEADERS"
            java.lang.String r7 = p149y1.AbstractC1411i.m3185Z(r1, r8, r7)
            goto L69
        L4d:
            if (r7 != 0) goto L5c
            r7 = r8 & 32
            if (r7 == 0) goto L5c
            java.lang.String r7 = "COMPRESSED"
            java.lang.String r8 = "PRIORITY"
            java.lang.String r7 = p149y1.AbstractC1411i.m3185Z(r1, r8, r7)
            goto L69
        L5c:
            r7 = r1
            goto L69
        L5e:
            r7 = 1
            if (r8 != r7) goto L64
            java.lang.String r7 = "ACK"
            goto L69
        L64:
            r7 = r2[r8]
            goto L69
        L67:
            r7 = r2[r8]
        L69:
            if (r4 == 0) goto L6e
            java.lang.String r4 = "<<"
            goto L70
        L6e:
            java.lang.String r4 = ">>"
        L70:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = p014E1.AbstractC0145b.m397j(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p030K1.AbstractC0310f.m843a(boolean, int, int, int, int):java.lang.String");
    }
}
