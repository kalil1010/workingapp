package p132t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p129s.AbstractC1320i;
import p129s.C1315d;
import p129s.C1316e;
import p129s.C1319h;
import p138v.C1361f;

/* renamed from: t.e */
/* loaded from: classes.dex */
public final class C1336e {

    /* renamed from: a */
    public C1316e f5664a;

    /* renamed from: b */
    public boolean f5665b;

    /* renamed from: c */
    public boolean f5666c;

    /* renamed from: d */
    public C1316e f5667d;

    /* renamed from: e */
    public ArrayList f5668e;

    /* renamed from: f */
    public C1361f f5669f;

    /* renamed from: g */
    public C1333b f5670g;

    /* renamed from: h */
    public ArrayList f5671h;

    /* renamed from: a */
    public final void m3076a(C1337f c1337f, int i2, ArrayList arrayList, C1343l c1343l) {
        AbstractC1346o abstractC1346o = c1337f.f5675d;
        if (abstractC1346o.f5699c == null) {
            C1316e c1316e = this.f5664a;
            if (abstractC1346o == c1316e.f5518d || abstractC1346o == c1316e.f5520e) {
                return;
            }
            if (c1343l == null) {
                c1343l = new C1343l();
                c1343l.f5687a = null;
                c1343l.f5688b = new ArrayList();
                c1343l.f5687a = abstractC1346o;
                arrayList.add(c1343l);
            }
            abstractC1346o.f5699c = c1343l;
            c1343l.f5688b.add(abstractC1346o);
            C1337f c1337f2 = abstractC1346o.f5704h;
            Iterator it = c1337f2.f5682k.iterator();
            while (it.hasNext()) {
                InterfaceC1335d interfaceC1335d = (InterfaceC1335d) it.next();
                if (interfaceC1335d instanceof C1337f) {
                    m3076a((C1337f) interfaceC1335d, i2, arrayList, c1343l);
                }
            }
            C1337f c1337f3 = abstractC1346o.f5705i;
            Iterator it2 = c1337f3.f5682k.iterator();
            while (it2.hasNext()) {
                InterfaceC1335d interfaceC1335d2 = (InterfaceC1335d) it2.next();
                if (interfaceC1335d2 instanceof C1337f) {
                    m3076a((C1337f) interfaceC1335d2, i2, arrayList, c1343l);
                }
            }
            if (i2 == 1 && (abstractC1346o instanceof C1344m)) {
                Iterator it3 = ((C1344m) abstractC1346o).f5689k.f5682k.iterator();
                while (it3.hasNext()) {
                    InterfaceC1335d interfaceC1335d3 = (InterfaceC1335d) it3.next();
                    if (interfaceC1335d3 instanceof C1337f) {
                        m3076a((C1337f) interfaceC1335d3, i2, arrayList, c1343l);
                    }
                }
            }
            Iterator it4 = c1337f2.f5683l.iterator();
            while (it4.hasNext()) {
                m3076a((C1337f) it4.next(), i2, arrayList, c1343l);
            }
            Iterator it5 = c1337f3.f5683l.iterator();
            while (it5.hasNext()) {
                m3076a((C1337f) it5.next(), i2, arrayList, c1343l);
            }
            if (i2 == 1 && (abstractC1346o instanceof C1344m)) {
                Iterator it6 = ((C1344m) abstractC1346o).f5689k.f5683l.iterator();
                while (it6.hasNext()) {
                    m3076a((C1337f) it6.next(), i2, arrayList, c1343l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3077b(p129s.C1316e r23) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p132t.C1336e.m3077b(s.e):void");
    }

    /* renamed from: c */
    public final void m3078c() {
        ArrayList arrayList = this.f5668e;
        arrayList.clear();
        C1316e c1316e = this.f5667d;
        c1316e.f5518d.mo3071f();
        c1316e.f5520e.mo3071f();
        arrayList.add(c1316e.f5518d);
        arrayList.add(c1316e.f5520e);
        Iterator it = c1316e.f5566q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C1315d c1315d = (C1315d) it.next();
            if (c1315d instanceof C1319h) {
                C1340i c1340i = new C1340i(c1315d);
                c1315d.f5518d.mo3071f();
                c1315d.f5520e.mo3071f();
                c1340i.f5702f = ((C1319h) c1315d).f5634u0;
                arrayList.add(c1340i);
            } else {
                if (c1315d.m3028x()) {
                    if (c1315d.f5514b == null) {
                        c1315d.f5514b = new C1334c(c1315d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1315d.f5514b);
                } else {
                    arrayList.add(c1315d.f5518d);
                }
                if (c1315d.m3029y()) {
                    if (c1315d.f5516c == null) {
                        c1315d.f5516c = new C1334c(c1315d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1315d.f5516c);
                } else {
                    arrayList.add(c1315d.f5520e);
                }
                if (c1315d instanceof AbstractC1320i) {
                    arrayList.add(new C1341j(c1315d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC1346o) it2.next()).mo3071f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC1346o abstractC1346o = (AbstractC1346o) it3.next();
            if (abstractC1346o.f5698b != c1316e) {
                abstractC1346o.mo3069d();
            }
        }
        ArrayList arrayList2 = this.f5671h;
        arrayList2.clear();
        C1316e c1316e2 = this.f5664a;
        m3080e(c1316e2.f5518d, 0, arrayList2);
        m3080e(c1316e2.f5520e, 1, arrayList2);
        this.f5665b = false;
    }

    /* renamed from: d */
    public final int m3079d(C1316e c1316e, int i2) {
        ArrayList arrayList;
        int i3;
        int i4;
        long jMax;
        float f;
        C1316e c1316e2 = c1316e;
        ArrayList arrayList2 = this.f5671h;
        int size = arrayList2.size();
        int i5 = 0;
        long jMax2 = 0;
        while (i5 < size) {
            AbstractC1346o abstractC1346o = ((C1343l) arrayList2.get(i5)).f5687a;
            if (!(abstractC1346o instanceof C1334c) ? !(i2 != 0 ? (abstractC1346o instanceof C1344m) : (abstractC1346o instanceof C1342k)) : ((C1334c) abstractC1346o).f5702f != i2) {
                C1337f c1337f = (i2 == 0 ? c1316e2.f5518d : c1316e2.f5520e).f5704h;
                C1337f c1337f2 = (i2 == 0 ? c1316e2.f5518d : c1316e2.f5520e).f5705i;
                boolean zContains = abstractC1346o.f5704h.f5683l.contains(c1337f);
                C1337f c1337f3 = abstractC1346o.f5705i;
                boolean zContains2 = c1337f3.f5683l.contains(c1337f2);
                long jMo3072j = abstractC1346o.mo3072j();
                C1337f c1337f4 = abstractC1346o.f5704h;
                if (zContains && zContains2) {
                    long jM3100b = C1343l.m3100b(c1337f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i3 = size;
                    long jM3099a = C1343l.m3099a(c1337f3, 0L);
                    long j2 = jM3100b - jMo3072j;
                    int i6 = c1337f3.f5677f;
                    arrayList = arrayList3;
                    i4 = i5;
                    if (j2 >= (-i6)) {
                        j2 += i6;
                    }
                    long j3 = (-jM3099a) - jMo3072j;
                    long j4 = c1337f4.f5677f;
                    long j5 = j3 - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C1315d c1315d = abstractC1346o.f5698b;
                    if (i2 == 0) {
                        f = c1315d.f5519d0;
                    } else if (i2 == 1) {
                        f = c1315d.f5521e0;
                    } else {
                        c1315d.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j5 / f)) : 0L;
                    jMax = (c1337f4.f5677f + ((((long) ((f2 * f) + 0.5f)) + jMo3072j) + ((long) (((1.0f - f) * f2) + 0.5f)))) - c1337f3.f5677f;
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    i4 = i5;
                    jMax = zContains ? Math.max(C1343l.m3100b(c1337f4, c1337f4.f5677f), c1337f4.f5677f + jMo3072j) : zContains2 ? Math.max(-C1343l.m3099a(c1337f3, c1337f3.f5677f), (-c1337f3.f5677f) + jMo3072j) : (abstractC1346o.mo3072j() + c1337f4.f5677f) - c1337f3.f5677f;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                i4 = i5;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i5 = i4 + 1;
            c1316e2 = c1316e;
            size = i3;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    /* renamed from: e */
    public final void m3080e(AbstractC1346o abstractC1346o, int i2, ArrayList arrayList) {
        C1337f c1337f;
        Iterator it = abstractC1346o.f5704h.f5682k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c1337f = abstractC1346o.f5705i;
            if (!zHasNext) {
                break;
            }
            InterfaceC1335d interfaceC1335d = (InterfaceC1335d) it.next();
            if (interfaceC1335d instanceof C1337f) {
                m3076a((C1337f) interfaceC1335d, i2, arrayList, null);
            } else if (interfaceC1335d instanceof AbstractC1346o) {
                m3076a(((AbstractC1346o) interfaceC1335d).f5704h, i2, arrayList, null);
            }
        }
        Iterator it2 = c1337f.f5682k.iterator();
        while (it2.hasNext()) {
            InterfaceC1335d interfaceC1335d2 = (InterfaceC1335d) it2.next();
            if (interfaceC1335d2 instanceof C1337f) {
                m3076a((C1337f) interfaceC1335d2, i2, arrayList, null);
            } else if (interfaceC1335d2 instanceof AbstractC1346o) {
                m3076a(((AbstractC1346o) interfaceC1335d2).f5705i, i2, arrayList, null);
            }
        }
        if (i2 == 1) {
            Iterator it3 = ((C1344m) abstractC1346o).f5689k.f5682k.iterator();
            while (it3.hasNext()) {
                InterfaceC1335d interfaceC1335d3 = (InterfaceC1335d) it3.next();
                if (interfaceC1335d3 instanceof C1337f) {
                    m3076a((C1337f) interfaceC1335d3, i2, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m3081f(int i2, int i3, int i4, int i5, C1315d c1315d) {
        C1333b c1333b = this.f5670g;
        c1333b.f5652a = i2;
        c1333b.f5653b = i4;
        c1333b.f5654c = i3;
        c1333b.f5655d = i5;
        this.f5669f.m3126b(c1315d, c1333b);
        c1315d.m3006O(c1333b.f5656e);
        c1315d.m3003L(c1333b.f5657f);
        c1315d.f5490E = c1333b.f5659h;
        c1315d.m3000I(c1333b.f5658g);
    }

    /* renamed from: g */
    public final void m3082g() {
        C1332a c1332a;
        Iterator it = this.f5664a.f5566q0.iterator();
        while (it.hasNext()) {
            C1315d c1315d = (C1315d) it.next();
            if (!c1315d.f5512a) {
                int[] iArr = c1315d.f5543p0;
                boolean z2 = false;
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = c1315d.f5545r;
                int i5 = c1315d.f5546s;
                boolean z3 = i2 == 2 || (i2 == 3 && i4 == 1);
                if (i3 == 2 || (i3 == 3 && i5 == 1)) {
                    z2 = true;
                }
                C1338g c1338g = c1315d.f5518d.f5701e;
                boolean z4 = c1338g.f5681j;
                C1338g c1338g2 = c1315d.f5520e.f5701e;
                boolean z5 = c1338g2.f5681j;
                boolean z6 = z3;
                if (z4 && z5) {
                    m3081f(1, c1338g.f5678g, 1, c1338g2.f5678g, c1315d);
                    c1315d.f5512a = true;
                } else if (z4 && z2) {
                    m3081f(1, c1338g.f5678g, 2, c1338g2.f5678g, c1315d);
                    if (i3 == 3) {
                        c1315d.f5520e.f5701e.f5684m = c1315d.m3017k();
                    } else {
                        c1315d.f5520e.f5701e.mo3085d(c1315d.m3017k());
                        c1315d.f5512a = true;
                    }
                } else if (z5 && z6) {
                    m3081f(2, c1338g.f5678g, 1, c1338g2.f5678g, c1315d);
                    if (i2 == 3) {
                        c1315d.f5518d.f5701e.f5684m = c1315d.m3021q();
                    } else {
                        c1315d.f5518d.f5701e.mo3085d(c1315d.m3021q());
                        c1315d.f5512a = true;
                    }
                }
                if (c1315d.f5512a && (c1332a = c1315d.f5520e.f5690l) != null) {
                    c1332a.mo3085d(c1315d.f5513a0);
                }
            }
        }
    }
}
