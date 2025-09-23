package p024I1;

import p011D1.C0134x;
import p014E1.AbstractC0145b;
import p050R1.C0482j;
import p055T0.C0511e;
import p131s1.AbstractC1326c;

/* renamed from: I1.e */
/* loaded from: classes.dex */
public abstract class AbstractC0211e {
    static {
        C0482j c0482j = C0482j.f1481d;
        C0511e.m1275e("\"\\");
        C0511e.m1275e("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m560a(C0134x c0134x) {
        if (AbstractC1326c.m3058a(c0134x.f468a.f450b, "HEAD")) {
            return false;
        }
        int i2 = c0134x.f471d;
        return (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && AbstractC0145b.m399l(c0134x) == -1 && !"chunked".equalsIgnoreCase(C0134x.m370g(c0134x, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m561b(p011D1.C0112b r36, p011D1.C0126p r37, p011D1.C0124n r38) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024I1.AbstractC0211e.m561b(D1.b, D1.p, D1.n):void");
    }
}
