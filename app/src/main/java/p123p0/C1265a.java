package p123p0;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import p074Z1.AbstractC0618a;
import p093e2.AbstractC0901d;
import p120o0.AbstractC1252b;
import p120o0.C1254d;
import p127r0.EnumC1284a;
import p127r0.EnumC1285b;

/* renamed from: p0.a */
/* loaded from: classes.dex */
public final class C1265a {

    /* renamed from: a */
    public static final SecureRandom f5135a = new SecureRandom();

    /* renamed from: a */
    public final byte[] m2926a(C1254d c1254d) {
        byte[] bArrM2314r;
        int i2 = c1254d.f5106b;
        byte[] bArr = new byte[i2];
        C1266b c1266b = AbstractC1252b.f5070F;
        C1266b c1266b2 = c1254d.f5105a;
        if (c1266b2 == c1266b) {
            byte[] bArr2 = new byte[4];
            bArr2[0] = AbstractC0901d.m2309n0(bArr2[0], 6, true);
            bArr2[0] = AbstractC0901d.m2309n0(bArr2[0], 5, false);
            byte bM2309n0 = AbstractC0901d.m2309n0(bArr2[0], 4, true);
            bArr2[0] = bM2309n0;
            bArr2[0] = AbstractC0901d.m2309n0(bM2309n0, 7, true);
            bArr2[0] = AbstractC0901d.m2309n0(bArr2[0], 5, true);
            byte bM2309n02 = AbstractC0901d.m2309n0(bArr2[0], 2, true);
            bArr2[0] = bM2309n02;
            byte bM2309n03 = AbstractC0901d.m2309n0(bM2309n02, 3, false);
            bArr2[0] = bM2309n03;
            bArr2[0] = AbstractC0901d.m2309n0(bM2309n03, 1, true);
            bArr2[1] = AbstractC0901d.m2309n0(bArr2[1], 5, true);
            byte bM2309n04 = AbstractC0901d.m2309n0(bArr2[2], 7, true);
            bArr2[2] = bM2309n04;
            bArr2[2] = AbstractC0901d.m2309n0(bM2309n04, 6, true);
            bArrM2314r = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            C1266b c1266b3 = AbstractC1252b.f5097u;
            int i3 = c1254d.f5106b;
            if (c1266b2 == c1266b3) {
                bArrM2314r = AbstractC0901d.m2314r(AbstractC0618a.m1421e(String.valueOf(250), i3 * 2, "0"));
            } else {
                EnumC1285b enumC1285b = null;
                if (c1266b2 == AbstractC1252b.f5091o) {
                    EnumC1284a enumC1284a = EnumC1284a.FR;
                    EnumC1285b enumC1285b2 = EnumC1285b.f5444d;
                    int i4 = 0;
                    EnumC1285b enumC1285b3 = null;
                    loop0: while (true) {
                        if (i4 >= EnumC1285b.values().length) {
                            enumC1285b = enumC1285b3;
                            break;
                        }
                        for (EnumC1284a enumC1284a2 : EnumC1285b.values()[i4].f5449c) {
                            if (enumC1284a2 == enumC1284a) {
                                if (enumC1285b3 != null) {
                                    break loop0;
                                }
                                enumC1285b3 = EnumC1285b.values()[i4];
                            }
                        }
                        i4++;
                    }
                    if (enumC1285b != null) {
                        enumC1285b2 = enumC1285b;
                    }
                    bArrM2314r = AbstractC0901d.m2314r(AbstractC0618a.m1421e(String.valueOf(enumC1285b2.f5448b), i3 * 2, "0"));
                } else if (c1266b2 == AbstractC1252b.f5088l) {
                    bArrM2314r = AbstractC0901d.m2314r(new SimpleDateFormat("yyMMdd").format(new Date()));
                } else if (c1266b2 == AbstractC1252b.f5089m || c1266b2 == AbstractC1252b.f5075K) {
                    bArrM2314r = new byte[]{(byte) 0};
                } else if (c1266b2 == AbstractC1252b.f5094r) {
                    bArrM2314r = AbstractC0901d.m2314r("01");
                } else if (c1266b2 == AbstractC1252b.f5099w) {
                    bArrM2314r = new byte[]{34};
                } else if (c1266b2 == AbstractC1252b.f5098v) {
                    bArrM2314r = new byte[]{-32, -96, 0};
                } else if (c1266b2 == AbstractC1252b.f5065A) {
                    bArrM2314r = new byte[]{-114, 0, -80, 80, 5};
                } else if (c1266b2 == AbstractC1252b.f5076L) {
                    bArrM2314r = AbstractC0901d.m2314r("7A45123EE59C7F40");
                } else {
                    if (c1266b2 == AbstractC1252b.f5101y) {
                        f5135a.nextBytes(bArr);
                    } else if (c1266b2 == AbstractC1252b.f5073I) {
                        bArrM2314r = new byte[]{1};
                    } else if (c1266b2 == AbstractC1252b.f5074J) {
                        bArrM2314r = new byte[]{-64, -128, 0};
                    }
                    bArrM2314r = null;
                }
            }
        }
        if (bArrM2314r != null) {
            System.arraycopy(bArrM2314r, 0, bArr, Math.max(i2 - bArrM2314r.length, 0), Math.min(bArrM2314r.length, i2));
        }
        return bArr;
    }
}
