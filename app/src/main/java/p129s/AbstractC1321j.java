package p129s;

import p124q.C1269c;
import p124q.C1272f;

/* renamed from: s.j */
/* loaded from: classes.dex */
public abstract class AbstractC1321j {

    /* renamed from: a */
    public static final boolean[] f5638a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:189:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0685 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x06ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3050a(p129s.C1316e r39, p124q.C1269c r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instructions count: 1787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p129s.AbstractC1321j.m3050a(s.e, q.c, java.util.ArrayList, int):void");
    }

    /* renamed from: b */
    public static void m3051b(C1316e c1316e, C1269c c1269c, C1315d c1315d) {
        c1315d.f5540o = -1;
        c1315d.f5542p = -1;
        int i2 = c1316e.f5543p0[0];
        int[] iArr = c1315d.f5543p0;
        if (i2 != 2 && iArr[0] == 4) {
            C1314c c1314c = c1315d.f5494I;
            int i3 = c1314c.f5483g;
            int iM3021q = c1316e.m3021q();
            C1314c c1314c2 = c1315d.f5496K;
            int i4 = iM3021q - c1314c2.f5483g;
            c1314c.f5485i = c1269c.m2955k(c1314c);
            c1314c2.f5485i = c1269c.m2955k(c1314c2);
            c1269c.m2948d(c1314c.f5485i, i3);
            c1269c.m2948d(c1314c2.f5485i, i4);
            c1315d.f5540o = 2;
            c1315d.f5510Y = i3;
            int i5 = i4 - i3;
            c1315d.f5506U = i5;
            int i6 = c1315d.f5515b0;
            if (i5 < i6) {
                c1315d.f5506U = i6;
            }
        }
        if (c1316e.f5543p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C1314c c1314c3 = c1315d.f5495J;
        int i7 = c1314c3.f5483g;
        int iM3017k = c1316e.m3017k();
        C1314c c1314c4 = c1315d.f5497L;
        int i8 = iM3017k - c1314c4.f5483g;
        c1314c3.f5485i = c1269c.m2955k(c1314c3);
        c1314c4.f5485i = c1269c.m2955k(c1314c4);
        c1269c.m2948d(c1314c3.f5485i, i7);
        c1269c.m2948d(c1314c4.f5485i, i8);
        if (c1315d.f5513a0 > 0 || c1315d.f5525g0 == 8) {
            C1314c c1314c5 = c1315d.f5498M;
            C1272f c1272fM2955k = c1269c.m2955k(c1314c5);
            c1314c5.f5485i = c1272fM2955k;
            c1269c.m2948d(c1272fM2955k, c1315d.f5513a0 + i7);
        }
        c1315d.f5542p = 2;
        c1315d.f5511Z = i7;
        int i9 = i8 - i7;
        c1315d.f5507V = i9;
        int i10 = c1315d.f5517c0;
        if (i9 < i10) {
            c1315d.f5507V = i10;
        }
    }

    /* renamed from: c */
    public static final boolean m3052c(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
