package p132t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p129s.AbstractC1320i;
import p129s.C1314c;
import p129s.C1315d;
import p129s.C1316e;
import p129s.C1319h;
import p138v.C1361f;

/* renamed from: t.h */
/* loaded from: classes.dex */
public abstract class AbstractC1339h {

    /* renamed from: a */
    public static final C1333b f5685a = new C1333b();

    /* renamed from: a */
    public static boolean m3086a(C1315d c1315d) {
        int[] iArr = c1315d.f5543p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        C1315d c1315d2 = c1315d.f5505T;
        C1316e c1316e = c1315d2 != null ? (C1316e) c1315d2 : null;
        if (c1316e != null) {
            int i4 = c1316e.f5543p0[0];
        }
        if (c1316e != null) {
            int i5 = c1316e.f5543p0[1];
        }
        boolean z2 = i2 == 1 || c1315d.mo2974A() || i2 == 2 || (i2 == 3 && c1315d.f5545r == 0 && c1315d.f5508W == 0.0f && c1315d.m3024t(0)) || (i2 == 3 && c1315d.f5545r == 1 && c1315d.m3025u(0, c1315d.m3021q()));
        boolean z3 = i3 == 1 || c1315d.mo2975B() || i3 == 2 || (i3 == 3 && c1315d.f5546s == 0 && c1315d.f5508W == 0.0f && c1315d.m3024t(1)) || (i3 == 3 && c1315d.f5546s == 1 && c1315d.m3025u(1, c1315d.m3017k()));
        return (c1315d.f5508W > 0.0f && (z2 || z3)) || (z2 && z3);
    }

    /* renamed from: b */
    public static C1345n m3087b(C1315d c1315d, int i2, ArrayList arrayList, C1345n c1345n) {
        int i3;
        int i4 = i2 == 0 ? c1315d.f5539n0 : c1315d.f5541o0;
        if (i4 != -1 && (c1345n == null || i4 != c1345n.f5693b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                C1345n c1345n2 = (C1345n) arrayList.get(i5);
                if (c1345n2.f5693b == i4) {
                    if (c1345n != null) {
                        c1345n.m3104c(i2, c1345n2);
                        arrayList.remove(c1345n);
                    }
                    c1345n = c1345n2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return c1345n;
        }
        if (c1345n == null) {
            if (c1315d instanceof AbstractC1320i) {
                AbstractC1320i abstractC1320i = (AbstractC1320i) c1315d;
                int i6 = 0;
                while (true) {
                    if (i6 >= abstractC1320i.f5637r0) {
                        i3 = -1;
                        break;
                    }
                    C1315d c1315d2 = abstractC1320i.f5636q0[i6];
                    if ((i2 == 0 && (i3 = c1315d2.f5539n0) != -1) || (i2 == 1 && (i3 = c1315d2.f5541o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        C1345n c1345n3 = (C1345n) arrayList.get(i7);
                        if (c1345n3.f5693b == i3) {
                            c1345n = c1345n3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (c1345n == null) {
                c1345n = new C1345n();
                c1345n.f5692a = new ArrayList();
                c1345n.f5695d = null;
                c1345n.f5696e = -1;
                int i8 = C1345n.f5691f;
                C1345n.f5691f = i8 + 1;
                c1345n.f5693b = i8;
                c1345n.f5694c = i2;
            }
            arrayList.add(c1345n);
        }
        ArrayList arrayList2 = c1345n.f5692a;
        if (arrayList2.contains(c1315d)) {
            return c1345n;
        }
        arrayList2.add(c1315d);
        if (c1315d instanceof C1319h) {
            C1319h c1319h = (C1319h) c1315d;
            c1319h.f5633t0.m2982c(c1319h.f5634u0 == 0 ? 1 : 0, arrayList, c1345n);
        }
        int i9 = c1345n.f5693b;
        if (i2 == 0) {
            c1315d.f5539n0 = i9;
            c1315d.f5494I.m2982c(i2, arrayList, c1345n);
            c1315d.f5496K.m2982c(i2, arrayList, c1345n);
        } else {
            c1315d.f5541o0 = i9;
            c1315d.f5495J.m2982c(i2, arrayList, c1345n);
            c1315d.f5498M.m2982c(i2, arrayList, c1345n);
            c1315d.f5497L.m2982c(i2, arrayList, c1345n);
        }
        c1315d.f5501P.m2982c(i2, arrayList, c1345n);
        return c1345n;
    }

    /* renamed from: c */
    public static void m3088c(int i2, C1315d c1315d, C1361f c1361f, boolean z2) {
        C1314c c1314c;
        C1314c c1314c2;
        char c3;
        C1314c c1314c3;
        C1314c c1314c4;
        if (c1315d.f5536m) {
            return;
        }
        if (!(c1315d instanceof C1316e) && c1315d.m3030z() && m3086a(c1315d)) {
            C1316e.m3031V(c1315d, c1361f, new C1333b());
        }
        C1314c c1314cMo3015i = c1315d.mo3015i(2);
        C1314c c1314cMo3015i2 = c1315d.mo3015i(4);
        int iM2983d = c1314cMo3015i.m2983d();
        int iM2983d2 = c1314cMo3015i2.m2983d();
        HashSet hashSet = c1314cMo3015i.f5477a;
        if (hashSet != null && c1314cMo3015i.f5479c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1314c c1314c5 = (C1314c) it.next();
                C1315d c1315d2 = c1314c5.f5480d;
                int i3 = i2 + 1;
                boolean zM3086a = m3086a(c1315d2);
                if (c1315d2.m3030z() && zM3086a) {
                    c3 = 0;
                    C1316e.m3031V(c1315d2, c1361f, new C1333b());
                } else {
                    c3 = 0;
                }
                C1314c c1314c6 = c1315d2.f5494I;
                C1314c c1314c7 = c1315d2.f5496K;
                char c4 = ((c1314c5 == c1314c6 && (c1314c4 = c1314c7.f5482f) != null && c1314c4.f5479c) || (c1314c5 == c1314c7 && (c1314c3 = c1314c6.f5482f) != null && c1314c3.f5479c)) ? (char) 1 : c3;
                int i4 = c1315d2.f5543p0[c3];
                if (i4 != 3 || zM3086a) {
                    if (!c1315d2.m3030z()) {
                        if (c1314c5 == c1314c6 && c1314c7.f5482f == null) {
                            int iM2984e = c1314c6.m2984e() + iM2983d;
                            c1315d2.m3001J(iM2984e, c1315d2.m3021q() + iM2984e);
                            m3088c(i3, c1315d2, c1361f, z2);
                        } else if (c1314c5 == c1314c7 && c1314c6.f5482f == null) {
                            int iM2984e2 = iM2983d - c1314c7.m2984e();
                            c1315d2.m3001J(iM2984e2 - c1315d2.m3021q(), iM2984e2);
                            m3088c(i3, c1315d2, c1361f, z2);
                        } else if (c4 != 0 && !c1315d2.m3028x()) {
                            m3089d(i3, c1315d2, c1361f, z2);
                        }
                    }
                } else if (i4 == 3 && c1315d2.f5549v >= 0 && c1315d2.f5548u >= 0 && (c1315d2.f5525g0 == 8 || (c1315d2.f5545r == 0 && c1315d2.f5508W == 0.0f))) {
                    if (!c1315d2.m3028x() && !c1315d2.f5491F && c4 != 0 && !c1315d2.m3028x()) {
                        m3090e(i3, c1315d, c1361f, c1315d2, z2);
                    }
                }
            }
        }
        if (c1315d instanceof C1319h) {
            return;
        }
        HashSet hashSet2 = c1314cMo3015i2.f5477a;
        if (hashSet2 != null && c1314cMo3015i2.f5479c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C1314c c1314c8 = (C1314c) it2.next();
                C1315d c1315d3 = c1314c8.f5480d;
                int i5 = i2 + 1;
                boolean zM3086a2 = m3086a(c1315d3);
                if (c1315d3.m3030z() && zM3086a2) {
                    C1316e.m3031V(c1315d3, c1361f, new C1333b());
                }
                C1314c c1314c9 = c1315d3.f5494I;
                C1314c c1314c10 = c1315d3.f5496K;
                boolean z3 = (c1314c8 == c1314c9 && (c1314c2 = c1314c10.f5482f) != null && c1314c2.f5479c) || (c1314c8 == c1314c10 && (c1314c = c1314c9.f5482f) != null && c1314c.f5479c);
                int i6 = c1315d3.f5543p0[0];
                if (i6 != 3 || zM3086a2) {
                    if (!c1315d3.m3030z()) {
                        if (c1314c8 == c1314c9 && c1314c10.f5482f == null) {
                            int iM2984e3 = c1314c9.m2984e() + iM2983d2;
                            c1315d3.m3001J(iM2984e3, c1315d3.m3021q() + iM2984e3);
                            m3088c(i5, c1315d3, c1361f, z2);
                        } else if (c1314c8 == c1314c10 && c1314c9.f5482f == null) {
                            int iM2984e4 = iM2983d2 - c1314c10.m2984e();
                            c1315d3.m3001J(iM2984e4 - c1315d3.m3021q(), iM2984e4);
                            m3088c(i5, c1315d3, c1361f, z2);
                        } else if (z3 && !c1315d3.m3028x()) {
                            m3089d(i5, c1315d3, c1361f, z2);
                        }
                    }
                } else if (i6 == 3 && c1315d3.f5549v >= 0 && c1315d3.f5548u >= 0) {
                    if (c1315d3.f5525g0 == 8 || (c1315d3.f5545r == 0 && c1315d3.f5508W == 0.0f)) {
                        if (!c1315d3.m3028x() && !c1315d3.f5491F && z3 && !c1315d3.m3028x()) {
                            m3090e(i5, c1315d, c1361f, c1315d3, z2);
                        }
                    }
                }
            }
        }
        c1315d.f5536m = true;
    }

    /* renamed from: d */
    public static void m3089d(int i2, C1315d c1315d, C1361f c1361f, boolean z2) {
        float f = c1315d.f5519d0;
        C1314c c1314c = c1315d.f5494I;
        int iM2983d = c1314c.f5482f.m2983d();
        C1314c c1314c2 = c1315d.f5496K;
        int iM2983d2 = c1314c2.f5482f.m2983d();
        int iM2984e = c1314c.m2984e() + iM2983d;
        int iM2984e2 = iM2983d2 - c1314c2.m2984e();
        if (iM2983d == iM2983d2) {
            f = 0.5f;
        } else {
            iM2983d = iM2984e;
            iM2983d2 = iM2984e2;
        }
        int iM3021q = c1315d.m3021q();
        int i3 = (iM2983d2 - iM2983d) - iM3021q;
        if (iM2983d > iM2983d2) {
            i3 = (iM2983d - iM2983d2) - iM3021q;
        }
        int i4 = ((int) (i3 > 0 ? (f * i3) + 0.5f : f * i3)) + iM2983d;
        int i5 = i4 + iM3021q;
        if (iM2983d > iM2983d2) {
            i5 = i4 - iM3021q;
        }
        c1315d.m3001J(i4, i5);
        m3088c(i2 + 1, c1315d, c1361f, z2);
    }

    /* renamed from: e */
    public static void m3090e(int i2, C1315d c1315d, C1361f c1361f, C1315d c1315d2, boolean z2) {
        float f = c1315d2.f5519d0;
        C1314c c1314c = c1315d2.f5494I;
        int iM2984e = c1314c.m2984e() + c1314c.f5482f.m2983d();
        C1314c c1314c2 = c1315d2.f5496K;
        int iM2983d = c1314c2.f5482f.m2983d() - c1314c2.m2984e();
        if (iM2983d >= iM2984e) {
            int iM3021q = c1315d2.m3021q();
            if (c1315d2.f5525g0 != 8) {
                int i3 = c1315d2.f5545r;
                if (i3 == 2) {
                    iM3021q = (int) (c1315d2.f5519d0 * 0.5f * (c1315d instanceof C1316e ? c1315d.m3021q() : c1315d.f5505T.m3021q()));
                } else if (i3 == 0) {
                    iM3021q = iM2983d - iM2984e;
                }
                iM3021q = Math.max(c1315d2.f5548u, iM3021q);
                int i4 = c1315d2.f5549v;
                if (i4 > 0) {
                    iM3021q = Math.min(i4, iM3021q);
                }
            }
            int i5 = iM2984e + ((int) ((f * ((iM2983d - iM2984e) - iM3021q)) + 0.5f));
            c1315d2.m3001J(i5, iM3021q + i5);
            m3088c(i2 + 1, c1315d2, c1361f, z2);
        }
    }

    /* renamed from: f */
    public static void m3091f(int i2, C1315d c1315d, C1361f c1361f) {
        float f = c1315d.f5521e0;
        C1314c c1314c = c1315d.f5495J;
        int iM2983d = c1314c.f5482f.m2983d();
        C1314c c1314c2 = c1315d.f5497L;
        int iM2983d2 = c1314c2.f5482f.m2983d();
        int iM2984e = c1314c.m2984e() + iM2983d;
        int iM2984e2 = iM2983d2 - c1314c2.m2984e();
        if (iM2983d == iM2983d2) {
            f = 0.5f;
        } else {
            iM2983d = iM2984e;
            iM2983d2 = iM2984e2;
        }
        int iM3017k = c1315d.m3017k();
        int i3 = (iM2983d2 - iM2983d) - iM3017k;
        if (iM2983d > iM2983d2) {
            i3 = (iM2983d - iM2983d2) - iM3017k;
        }
        int i4 = (int) (i3 > 0 ? (f * i3) + 0.5f : f * i3);
        int i5 = iM2983d + i4;
        int i6 = i5 + iM3017k;
        if (iM2983d > iM2983d2) {
            i5 = iM2983d - i4;
            i6 = i5 - iM3017k;
        }
        c1315d.m3002K(i5, i6);
        m3094i(i2 + 1, c1315d, c1361f);
    }

    /* renamed from: g */
    public static void m3092g(int i2, C1315d c1315d, C1361f c1361f, C1315d c1315d2) {
        float f = c1315d2.f5521e0;
        C1314c c1314c = c1315d2.f5495J;
        int iM2984e = c1314c.m2984e() + c1314c.f5482f.m2983d();
        C1314c c1314c2 = c1315d2.f5497L;
        int iM2983d = c1314c2.f5482f.m2983d() - c1314c2.m2984e();
        if (iM2983d >= iM2984e) {
            int iM3017k = c1315d2.m3017k();
            if (c1315d2.f5525g0 != 8) {
                int i3 = c1315d2.f5546s;
                if (i3 == 2) {
                    iM3017k = (int) (f * 0.5f * (c1315d instanceof C1316e ? c1315d.m3017k() : c1315d.f5505T.m3017k()));
                } else if (i3 == 0) {
                    iM3017k = iM2983d - iM2984e;
                }
                iM3017k = Math.max(c1315d2.f5551x, iM3017k);
                int i4 = c1315d2.f5552y;
                if (i4 > 0) {
                    iM3017k = Math.min(i4, iM3017k);
                }
            }
            int i5 = iM2984e + ((int) ((f * ((iM2983d - iM2984e) - iM3017k)) + 0.5f));
            c1315d2.m3002K(i5, iM3017k + i5);
            m3094i(i2 + 1, c1315d2, c1361f);
        }
    }

    /* renamed from: h */
    public static boolean m3093h(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    /* renamed from: i */
    public static void m3094i(int i2, C1315d c1315d, C1361f c1361f) {
        boolean z2;
        C1314c c1314c;
        C1314c c1314c2;
        C1314c c1314c3;
        C1314c c1314c4;
        if (c1315d.f5538n) {
            return;
        }
        if (!(c1315d instanceof C1316e) && c1315d.m3030z() && m3086a(c1315d)) {
            C1316e.m3031V(c1315d, c1361f, new C1333b());
        }
        C1314c c1314cMo3015i = c1315d.mo3015i(3);
        C1314c c1314cMo3015i2 = c1315d.mo3015i(5);
        int iM2983d = c1314cMo3015i.m2983d();
        int iM2983d2 = c1314cMo3015i2.m2983d();
        HashSet hashSet = c1314cMo3015i.f5477a;
        if (hashSet != null && c1314cMo3015i.f5479c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1314c c1314c5 = (C1314c) it.next();
                C1315d c1315d2 = c1314c5.f5480d;
                int i3 = i2 + 1;
                boolean zM3086a = m3086a(c1315d2);
                if (c1315d2.m3030z() && zM3086a) {
                    C1316e.m3031V(c1315d2, c1361f, new C1333b());
                }
                C1314c c1314c6 = c1315d2.f5495J;
                C1314c c1314c7 = c1315d2.f5497L;
                boolean z3 = (c1314c5 == c1314c6 && (c1314c4 = c1314c7.f5482f) != null && c1314c4.f5479c) || (c1314c5 == c1314c7 && (c1314c3 = c1314c6.f5482f) != null && c1314c3.f5479c);
                int i4 = c1315d2.f5543p0[1];
                if (i4 != 3 || zM3086a) {
                    if (!c1315d2.m3030z()) {
                        if (c1314c5 == c1314c6 && c1314c7.f5482f == null) {
                            int iM2984e = c1314c6.m2984e() + iM2983d;
                            c1315d2.m3002K(iM2984e, c1315d2.m3017k() + iM2984e);
                            m3094i(i3, c1315d2, c1361f);
                        } else if (c1314c5 == c1314c7 && c1314c6.f5482f == null) {
                            int iM2984e2 = iM2983d - c1314c7.m2984e();
                            c1315d2.m3002K(iM2984e2 - c1315d2.m3017k(), iM2984e2);
                            m3094i(i3, c1315d2, c1361f);
                        } else if (z3 && !c1315d2.m3029y()) {
                            m3091f(i3, c1315d2, c1361f);
                        }
                    }
                } else if (i4 == 3 && c1315d2.f5552y >= 0 && c1315d2.f5551x >= 0 && (c1315d2.f5525g0 == 8 || (c1315d2.f5546s == 0 && c1315d2.f5508W == 0.0f))) {
                    if (!c1315d2.m3029y() && !c1315d2.f5491F && z3 && !c1315d2.m3029y()) {
                        m3092g(i3, c1315d, c1361f, c1315d2);
                    }
                }
            }
        }
        boolean z4 = true;
        z4 = true;
        z4 = true;
        if (c1315d instanceof C1319h) {
            return;
        }
        HashSet hashSet2 = c1314cMo3015i2.f5477a;
        if (hashSet2 != null && c1314cMo3015i2.f5479c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C1314c c1314c8 = (C1314c) it2.next();
                C1315d c1315d3 = c1314c8.f5480d;
                int i5 = i2 + 1;
                boolean zM3086a2 = m3086a(c1315d3);
                if (c1315d3.m3030z() && zM3086a2) {
                    C1316e.m3031V(c1315d3, c1361f, new C1333b());
                }
                C1314c c1314c9 = c1315d3.f5495J;
                C1314c c1314c10 = c1315d3.f5497L;
                boolean z5 = (c1314c8 == c1314c9 && (c1314c2 = c1314c10.f5482f) != null && c1314c2.f5479c) || (c1314c8 == c1314c10 && (c1314c = c1314c9.f5482f) != null && c1314c.f5479c);
                int i6 = c1315d3.f5543p0[1];
                if (i6 != 3 || zM3086a2) {
                    if (!c1315d3.m3030z()) {
                        if (c1314c8 == c1314c9 && c1314c10.f5482f == null) {
                            int iM2984e3 = c1314c9.m2984e() + iM2983d2;
                            c1315d3.m3002K(iM2984e3, c1315d3.m3017k() + iM2984e3);
                            m3094i(i5, c1315d3, c1361f);
                        } else if (c1314c8 == c1314c10 && c1314c9.f5482f == null) {
                            int iM2984e4 = iM2983d2 - c1314c10.m2984e();
                            c1315d3.m3002K(iM2984e4 - c1315d3.m3017k(), iM2984e4);
                            m3094i(i5, c1315d3, c1361f);
                        } else if (z5 && !c1315d3.m3029y()) {
                            m3091f(i5, c1315d3, c1361f);
                        }
                    }
                } else if (i6 == 3 && c1315d3.f5552y >= 0 && c1315d3.f5551x >= 0 && (c1315d3.f5525g0 == 8 || (c1315d3.f5546s == 0 && c1315d3.f5508W == 0.0f))) {
                    if (!c1315d3.m3029y() && !c1315d3.f5491F && z5 && !c1315d3.m3029y()) {
                        m3092g(i5, c1315d, c1361f, c1315d3);
                    }
                }
            }
        }
        C1314c c1314cMo3015i3 = c1315d.mo3015i(6);
        if (c1314cMo3015i3.f5477a != null && c1314cMo3015i3.f5479c) {
            int iM2983d3 = c1314cMo3015i3.m2983d();
            Iterator it3 = c1314cMo3015i3.f5477a.iterator();
            while (it3.hasNext()) {
                C1314c c1314c11 = (C1314c) it3.next();
                C1315d c1315d4 = c1314c11.f5480d;
                int i7 = i2 + 1;
                boolean zM3086a3 = m3086a(c1315d4);
                if (c1315d4.m3030z() && zM3086a3) {
                    C1316e.m3031V(c1315d4, c1361f, new C1333b());
                }
                if (c1315d4.f5543p0[z4 ? 1 : 0] != 3 || zM3086a3) {
                    if (!c1315d4.m3030z()) {
                        C1314c c1314c12 = c1315d4.f5498M;
                        if (c1314c11 == c1314c12) {
                            int iM2984e5 = c1314c11.m2984e() + iM2983d3;
                            if (c1315d4.f5490E) {
                                int i8 = iM2984e5 - c1315d4.f5513a0;
                                int i9 = c1315d4.f5507V + i8;
                                c1315d4.f5511Z = i8;
                                c1315d4.f5495J.m2991l(i8);
                                c1315d4.f5497L.m2991l(i9);
                                c1314c12.m2991l(iM2984e5);
                                z2 = z4 ? 1 : 0;
                                c1315d4.f5534l = z2;
                            } else {
                                z2 = z4 ? 1 : 0;
                            }
                            m3094i(i7, c1315d4, c1361f);
                        }
                        z4 = z2;
                    }
                }
                z2 = z4 ? 1 : 0;
                z4 = z2;
            }
        }
        c1315d.f5538n = z4;
    }
}
