package p021H1;

import java.io.IOException;
import p007C0.C0088f;
import p011D1.C0109A;
import p011D1.C0111a;
import p011D1.C0126p;
import p030K1.C0304C;
import p030K1.C0305a;
import p131s1.AbstractC1326c;

/* renamed from: H1.e */
/* loaded from: classes.dex */
public final class C0186e {

    /* renamed from: a */
    public C0088f f673a;

    /* renamed from: b */
    public C0197p f674b;

    /* renamed from: c */
    public int f675c;

    /* renamed from: d */
    public int f676d;

    /* renamed from: e */
    public int f677e;

    /* renamed from: f */
    public C0109A f678f;

    /* renamed from: g */
    public final C0195n f679g;

    /* renamed from: h */
    public final C0111a f680h;

    /* renamed from: i */
    public final C0190i f681i;

    public C0186e(C0195n c0195n, C0111a c0111a, C0190i c0190i) {
        AbstractC1326c.m3062e(c0195n, "connectionPool");
        AbstractC1326c.m3062e(c0190i, "call");
        this.f679g = c0195n;
        this.f680h = c0111a;
        this.f681i = c0190i;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x02ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.List] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p021H1.C0194m m489a(int r14, int r15, int r16, int r17, boolean r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p021H1.C0186e.m489a(int, int, int, int, boolean, boolean):H1.m");
    }

    /* renamed from: b */
    public final boolean m490b(C0126p c0126p) {
        AbstractC1326c.m3062e(c0126p, "url");
        C0126p c0126p2 = this.f680h.f279a;
        return c0126p.f377f == c0126p2.f377f && AbstractC1326c.m3058a(c0126p.f376e, c0126p2.f376e);
    }

    /* renamed from: c */
    public final void m491c(IOException iOException) {
        AbstractC1326c.m3062e(iOException, "e");
        this.f678f = null;
        if ((iOException instanceof C0304C) && ((C0304C) iOException).f930a == 8) {
            this.f675c++;
        } else if (iOException instanceof C0305a) {
            this.f676d++;
        } else {
            this.f677e++;
        }
    }
}
