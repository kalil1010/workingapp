package p030K1;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import p014E1.AbstractC0145b;
import p050R1.C0489q;
import p131s1.AbstractC1326c;

/* renamed from: K1.t */
/* loaded from: classes.dex */
public final class C0324t implements Closeable {

    /* renamed from: d */
    public static final Logger f1025d;

    /* renamed from: a */
    public final C0323s f1026a;

    /* renamed from: b */
    public final C0307c f1027b;

    /* renamed from: c */
    public final C0489q f1028c;

    static {
        Logger logger = Logger.getLogger(AbstractC0310f.class.getName());
        AbstractC1326c.m3061d(logger, "Logger.getLogger(Http2::class.java.name)");
        f1025d = logger;
    }

    public C0324t(C0489q c0489q) {
        AbstractC1326c.m3062e(c0489q, "source");
        this.f1028c = c0489q;
        C0323s c0323s = new C0323s(c0489q);
        this.f1026a = c0323s;
        this.f1027b = new C0307c(c0323s);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1028c.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0256, code lost:
    
        throw new java.io.IOException(p006C.AbstractC0075g.m236e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r7));
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m853g(boolean r20, p030K1.C0315k r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p030K1.C0324t.m853g(boolean, K1.k):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0124, code lost:
    
        if (r8 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0126, code lost:
    
        r4.m868i(p014E1.AbstractC0145b.f496b, true);
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m854h(p030K1.C0315k r17, int r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p030K1.C0324t.m854h(K1.k, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        throw new java.io.IOException(p006C.AbstractC0075g.m236e("Header index too large ", r7));
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m855i(int r6, int r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p030K1.C0324t.m855i(int, int, int, int):java.util.List");
    }

    /* renamed from: j */
    public final void m856j(C0315k c0315k, int i2, int i3, int i4) throws IOException {
        int i5;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte bM1223i = this.f1028c.m1223i();
            byte[] bArr = AbstractC0145b.f495a;
            i5 = bM1223i & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            C0489q c0489q = this.f1028c;
            c0489q.m1227m();
            c0489q.m1223i();
            byte[] bArr2 = AbstractC0145b.f495a;
            c0315k.getClass();
            i2 -= 5;
        }
        List listM855i = m855i(AbstractC0322r.m852a(i2, i3, i5), i5, i3, i4);
        c0315k.getClass();
        c0315k.f969b.getClass();
        if (i4 != 0 && (i4 & 1) == 0) {
            C0320p c0320p = c0315k.f969b;
            c0320p.getClass();
            c0320p.f993i.m468c(new C0317m(c0320p.f987c + '[' + i4 + "] onHeaders", c0320p, i4, listM855i, z2), 0L);
            return;
        }
        synchronized (c0315k.f969b) {
            C0327w c0327wM845h = c0315k.f969b.m845h(i4);
            if (c0327wM845h != null) {
                c0327wM845h.m868i(AbstractC0145b.m410w(listM855i), z2);
                return;
            }
            C0320p c0320p2 = c0315k.f969b;
            if (c0320p2.f990f) {
                return;
            }
            if (i4 <= c0320p2.f988d) {
                return;
            }
            if (i4 % 2 == c0320p2.f989e % 2) {
                return;
            }
            C0327w c0327w = new C0327w(i4, c0315k.f969b, false, z2, AbstractC0145b.m410w(listM855i));
            C0320p c0320p3 = c0315k.f969b;
            c0320p3.f988d = i4;
            c0320p3.f986b.put(Integer.valueOf(i4), c0327w);
            c0315k.f969b.f991g.m475e().m468c(new C0314j(c0315k.f969b.f987c + '[' + i4 + "] onStream", c0327w, c0315k), 0L);
        }
    }

    /* renamed from: k */
    public final void m857k(C0315k c0315k, int i2, int i3, int i4) throws IOException {
        int i5;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i3 & 8) != 0) {
            byte bM1223i = this.f1028c.m1223i();
            byte[] bArr = AbstractC0145b.f495a;
            i5 = bM1223i & 255;
        } else {
            i5 = 0;
        }
        int iM1227m = this.f1028c.m1227m() & Integer.MAX_VALUE;
        List listM855i = m855i(AbstractC0322r.m852a(i2 - 4, i3, i5), i5, i3, i4);
        c0315k.getClass();
        C0320p c0320p = c0315k.f969b;
        c0320p.getClass();
        synchronized (c0320p) {
            if (c0320p.f1010z.contains(Integer.valueOf(iM1227m))) {
                c0320p.m850m(iM1227m, 2);
                return;
            }
            c0320p.f1010z.add(Integer.valueOf(iM1227m));
            c0320p.f993i.m468c(new C0317m(c0320p.f987c + '[' + iM1227m + "] onRequest", c0320p, iM1227m, listM855i), 0L);
        }
    }
}
