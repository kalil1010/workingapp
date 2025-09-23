package p129s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p006C.AbstractC0075g;
import p124q.AbstractC1271e;
import p124q.C1272f;
import p132t.AbstractC1339h;
import p132t.C1345n;

/* renamed from: s.c */
/* loaded from: classes.dex */
public final class C1314c {

    /* renamed from: b */
    public int f5478b;

    /* renamed from: c */
    public boolean f5479c;

    /* renamed from: d */
    public final C1315d f5480d;

    /* renamed from: e */
    public final int f5481e;

    /* renamed from: f */
    public C1314c f5482f;

    /* renamed from: i */
    public C1272f f5485i;

    /* renamed from: a */
    public HashSet f5477a = null;

    /* renamed from: g */
    public int f5483g = 0;

    /* renamed from: h */
    public int f5484h = Integer.MIN_VALUE;

    public C1314c(C1315d c1315d, int i2) {
        this.f5480d = c1315d;
        this.f5481e = i2;
    }

    /* renamed from: a */
    public final void m2980a(C1314c c1314c, int i2) {
        m2981b(c1314c, i2, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public final boolean m2981b(C1314c c1314c, int i2, int i3, boolean z2) {
        if (c1314c == null) {
            m2989j();
            return true;
        }
        if (!z2 && !m2988i(c1314c)) {
            return false;
        }
        this.f5482f = c1314c;
        if (c1314c.f5477a == null) {
            c1314c.f5477a = new HashSet();
        }
        HashSet hashSet = this.f5482f.f5477a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f5483g = i2;
        this.f5484h = i3;
        return true;
    }

    /* renamed from: c */
    public final void m2982c(int i2, ArrayList arrayList, C1345n c1345n) {
        HashSet hashSet = this.f5477a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC1339h.m3087b(((C1314c) it.next()).f5480d, i2, arrayList, c1345n);
            }
        }
    }

    /* renamed from: d */
    public final int m2983d() {
        if (this.f5479c) {
            return this.f5478b;
        }
        return 0;
    }

    /* renamed from: e */
    public final int m2984e() {
        C1314c c1314c;
        if (this.f5480d.f5525g0 == 8) {
            return 0;
        }
        int i2 = this.f5484h;
        return (i2 == Integer.MIN_VALUE || (c1314c = this.f5482f) == null || c1314c.f5480d.f5525g0 != 8) ? this.f5483g : i2;
    }

    /* renamed from: f */
    public final C1314c m2985f() {
        int i2 = this.f5481e;
        int iM2966a = AbstractC1271e.m2966a(i2);
        C1315d c1315d = this.f5480d;
        switch (iM2966a) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c1315d.f5496K;
            case 2:
                return c1315d.f5497L;
            case 3:
                return c1315d.f5494I;
            case 4:
                return c1315d.f5495J;
            default:
                throw new AssertionError(AbstractC0075g.m241j(i2));
        }
    }

    /* renamed from: g */
    public final boolean m2986g() {
        HashSet hashSet = this.f5477a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1314c) it.next()).m2985f().m2987h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m2987h() {
        return this.f5482f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2988i(p129s.C1314c r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            r1 = 6
            int r2 = r10.f5481e
            r3 = 1
            s.d r4 = r11.f5480d
            int r11 = r11.f5481e
            if (r11 != r2) goto L1c
            if (r2 != r1) goto L63
            boolean r11 = r4.f5490E
            if (r11 == 0) goto L65
            s.d r11 = r10.f5480d
            boolean r11 = r11.f5490E
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = p124q.AbstractC1271e.m2966a(r2)
            r6 = 8
            r7 = 9
            r8 = 4
            r9 = 2
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = p006C.AbstractC0075g.m241j(r2)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r1) goto L65
            if (r11 == r6) goto L65
            if (r11 == r7) goto L65
            goto L63
        L3a:
            if (r11 == r9) goto L65
            if (r11 != r8) goto L63
            goto L65
        L3f:
            r1 = 3
            if (r11 == r1) goto L48
            r1 = 5
            if (r11 != r1) goto L46
            goto L48
        L46:
            r1 = r0
            goto L49
        L48:
            r1 = r3
        L49:
            boolean r2 = r4 instanceof p129s.C1319h
            if (r2 == 0) goto L52
            if (r1 != 0) goto L63
            if (r11 != r7) goto L65
            goto L63
        L52:
            return r1
        L53:
            if (r11 == r9) goto L5a
            if (r11 != r8) goto L58
            goto L5a
        L58:
            r1 = r0
            goto L5b
        L5a:
            r1 = r3
        L5b:
            boolean r2 = r4 instanceof p129s.C1319h
            if (r2 == 0) goto L64
            if (r1 != 0) goto L63
            if (r11 != r6) goto L65
        L63:
            return r3
        L64:
            return r1
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p129s.C1314c.m2988i(s.c):boolean");
    }

    /* renamed from: j */
    public final void m2989j() {
        HashSet hashSet;
        C1314c c1314c = this.f5482f;
        if (c1314c != null && (hashSet = c1314c.f5477a) != null) {
            hashSet.remove(this);
            if (this.f5482f.f5477a.size() == 0) {
                this.f5482f.f5477a = null;
            }
        }
        this.f5477a = null;
        this.f5482f = null;
        this.f5483g = 0;
        this.f5484h = Integer.MIN_VALUE;
        this.f5479c = false;
        this.f5478b = 0;
    }

    /* renamed from: k */
    public final void m2990k() {
        C1272f c1272f = this.f5485i;
        if (c1272f == null) {
            this.f5485i = new C1272f(1);
        } else {
            c1272f.m2970c();
        }
    }

    /* renamed from: l */
    public final void m2991l(int i2) {
        this.f5478b = i2;
        this.f5479c = true;
    }

    public final String toString() {
        return this.f5480d.f5527h0 + ":" + AbstractC0075g.m241j(this.f5481e);
    }
}
