package p129s;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p002A1.C0027i;
import p124q.C1269c;
import p132t.AbstractC1346o;
import p132t.C1333b;
import p132t.C1334c;
import p132t.C1336e;
import p138v.C1361f;

/* renamed from: s.e */
/* loaded from: classes.dex */
public final class C1316e extends C1315d {

    /* renamed from: A0 */
    public int f5554A0;

    /* renamed from: B0 */
    public C1313b[] f5555B0;

    /* renamed from: C0 */
    public C1313b[] f5556C0;

    /* renamed from: D0 */
    public int f5557D0;

    /* renamed from: E0 */
    public boolean f5558E0;

    /* renamed from: F0 */
    public boolean f5559F0;

    /* renamed from: G0 */
    public WeakReference f5560G0;

    /* renamed from: H0 */
    public WeakReference f5561H0;

    /* renamed from: I0 */
    public WeakReference f5562I0;

    /* renamed from: J0 */
    public WeakReference f5563J0;

    /* renamed from: K0 */
    public final HashSet f5564K0;

    /* renamed from: L0 */
    public final C1333b f5565L0;

    /* renamed from: q0 */
    public ArrayList f5566q0 = new ArrayList();

    /* renamed from: r0 */
    public final C0027i f5567r0 = new C0027i(this);

    /* renamed from: s0 */
    public final C1336e f5568s0;

    /* renamed from: t0 */
    public int f5569t0;

    /* renamed from: u0 */
    public C1361f f5570u0;

    /* renamed from: v0 */
    public boolean f5571v0;

    /* renamed from: w0 */
    public final C1269c f5572w0;

    /* renamed from: x0 */
    public int f5573x0;

    /* renamed from: y0 */
    public int f5574y0;

    /* renamed from: z0 */
    public int f5575z0;

    public C1316e() {
        C1336e c1336e = new C1336e();
        c1336e.f5665b = true;
        c1336e.f5666c = true;
        c1336e.f5668e = new ArrayList();
        new ArrayList();
        c1336e.f5669f = null;
        c1336e.f5670g = new C1333b();
        c1336e.f5671h = new ArrayList();
        c1336e.f5664a = this;
        c1336e.f5667d = this;
        this.f5568s0 = c1336e;
        this.f5570u0 = null;
        this.f5571v0 = false;
        this.f5572w0 = new C1269c();
        this.f5575z0 = 0;
        this.f5554A0 = 0;
        this.f5555B0 = new C1313b[4];
        this.f5556C0 = new C1313b[4];
        this.f5557D0 = 257;
        this.f5558E0 = false;
        this.f5559F0 = false;
        this.f5560G0 = null;
        this.f5561H0 = null;
        this.f5562I0 = null;
        this.f5563J0 = null;
        this.f5564K0 = new HashSet();
        this.f5565L0 = new C1333b();
    }

    /* renamed from: V */
    public static void m3031V(C1315d c1315d, C1361f c1361f, C1333b c1333b) {
        int i2;
        int i3;
        if (c1361f == null) {
            return;
        }
        if (c1315d.f5525g0 == 8 || (c1315d instanceof C1319h) || (c1315d instanceof C1312a)) {
            c1333b.f5656e = 0;
            c1333b.f5657f = 0;
            return;
        }
        int[] iArr = c1315d.f5543p0;
        c1333b.f5652a = iArr[0];
        c1333b.f5653b = iArr[1];
        c1333b.f5654c = c1315d.m3021q();
        c1333b.f5655d = c1315d.m3017k();
        c1333b.f5660i = false;
        c1333b.f5661j = 0;
        boolean z2 = c1333b.f5652a == 3;
        boolean z3 = c1333b.f5653b == 3;
        boolean z4 = z2 && c1315d.f5508W > 0.0f;
        boolean z5 = z3 && c1315d.f5508W > 0.0f;
        if (z2 && c1315d.m3024t(0) && c1315d.f5545r == 0 && !z4) {
            c1333b.f5652a = 2;
            if (z3 && c1315d.f5546s == 0) {
                c1333b.f5652a = 1;
            }
            z2 = false;
        }
        if (z3 && c1315d.m3024t(1) && c1315d.f5546s == 0 && !z5) {
            c1333b.f5653b = 2;
            if (z2 && c1315d.f5545r == 0) {
                c1333b.f5653b = 1;
            }
            z3 = false;
        }
        if (c1315d.mo2974A()) {
            c1333b.f5652a = 1;
            z2 = false;
        }
        if (c1315d.mo2975B()) {
            c1333b.f5653b = 1;
            z3 = false;
        }
        int[] iArr2 = c1315d.f5547t;
        if (z4) {
            if (iArr2[0] == 4) {
                c1333b.f5652a = 1;
            } else if (!z3) {
                if (c1333b.f5653b == 1) {
                    i3 = c1333b.f5655d;
                } else {
                    c1333b.f5652a = 2;
                    c1361f.m3126b(c1315d, c1333b);
                    i3 = c1333b.f5657f;
                }
                c1333b.f5652a = 1;
                c1333b.f5654c = (int) (c1315d.f5508W * i3);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c1333b.f5653b = 1;
            } else if (!z2) {
                if (c1333b.f5652a == 1) {
                    i2 = c1333b.f5654c;
                } else {
                    c1333b.f5653b = 2;
                    c1361f.m3126b(c1315d, c1333b);
                    i2 = c1333b.f5656e;
                }
                c1333b.f5653b = 1;
                if (c1315d.f5509X == -1) {
                    c1333b.f5655d = (int) (i2 / c1315d.f5508W);
                } else {
                    c1333b.f5655d = (int) (c1315d.f5508W * i2);
                }
            }
        }
        c1361f.m3126b(c1315d, c1333b);
        c1315d.m3006O(c1333b.f5656e);
        c1315d.m3003L(c1333b.f5657f);
        c1315d.f5490E = c1333b.f5659h;
        c1315d.m3000I(c1333b.f5658g);
        c1333b.f5661j = 0;
    }

    @Override // p129s.C1315d
    /* renamed from: C */
    public final void mo2996C() {
        this.f5572w0.m2963t();
        this.f5573x0 = 0;
        this.f5574y0 = 0;
        this.f5566q0.clear();
        super.mo2996C();
    }

    @Override // p129s.C1315d
    /* renamed from: F */
    public final void mo2999F(C0027i c0027i) {
        super.mo2999F(c0027i);
        int size = this.f5566q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C1315d) this.f5566q0.get(i2)).mo2999F(c0027i);
        }
    }

    @Override // p129s.C1315d
    /* renamed from: P */
    public final void mo3007P(boolean z2, boolean z3) {
        super.mo3007P(z2, z3);
        int size = this.f5566q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C1315d) this.f5566q0.get(i2)).mo3007P(z2, z3);
        }
    }

    /* renamed from: R */
    public final void m3032R(C1315d c1315d, int i2) {
        if (i2 == 0) {
            int i3 = this.f5575z0 + 1;
            C1313b[] c1313bArr = this.f5556C0;
            if (i3 >= c1313bArr.length) {
                this.f5556C0 = (C1313b[]) Arrays.copyOf(c1313bArr, c1313bArr.length * 2);
            }
            C1313b[] c1313bArr2 = this.f5556C0;
            int i4 = this.f5575z0;
            c1313bArr2[i4] = new C1313b(c1315d, 0, this.f5571v0);
            this.f5575z0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.f5554A0 + 1;
            C1313b[] c1313bArr3 = this.f5555B0;
            if (i5 >= c1313bArr3.length) {
                this.f5555B0 = (C1313b[]) Arrays.copyOf(c1313bArr3, c1313bArr3.length * 2);
            }
            C1313b[] c1313bArr4 = this.f5555B0;
            int i6 = this.f5554A0;
            c1313bArr4[i6] = new C1313b(c1315d, 1, this.f5571v0);
            this.f5554A0 = i6 + 1;
        }
    }

    /* renamed from: S */
    public final void m3033S(C1269c c1269c) {
        C1316e c1316e;
        C1269c c1269c2;
        boolean zM3036W = m3036W(64);
        mo2978b(c1269c, zM3036W);
        int size = this.f5566q0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1315d c1315d = (C1315d) this.f5566q0.get(i2);
            boolean[] zArr = c1315d.f5504S;
            zArr[0] = false;
            zArr[1] = false;
            if (c1315d instanceof C1312a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                C1315d c1315d2 = (C1315d) this.f5566q0.get(i3);
                if (c1315d2 instanceof C1312a) {
                    C1312a c1312a = (C1312a) c1315d2;
                    for (int i4 = 0; i4 < c1312a.f5637r0; i4++) {
                        C1315d c1315d3 = c1312a.f5636q0[i4];
                        if (c1312a.f5457t0 || c1315d3.mo2979c()) {
                            int i5 = c1312a.f5456s0;
                            if (i5 == 0 || i5 == 1) {
                                c1315d3.f5504S[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                c1315d3.f5504S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f5564K0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            C1315d c1315d4 = (C1315d) this.f5566q0.get(i6);
            c1315d4.getClass();
            boolean z3 = c1315d4 instanceof C1318g;
            if (z3 || (c1315d4 instanceof C1319h)) {
                if (z3) {
                    hashSet.add(c1315d4);
                } else {
                    c1315d4.mo2978b(c1269c, zM3036W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1318g c1318g = (C1318g) ((C1315d) it.next());
                for (int i7 = 0; i7 < c1318g.f5637r0; i7++) {
                    if (hashSet.contains(c1318g.f5636q0[i7])) {
                        c1318g.mo2978b(c1269c, zM3036W);
                        hashSet.remove(c1318g);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C1315d) it2.next()).mo2978b(c1269c, zM3036W);
                }
                hashSet.clear();
            }
        }
        if (C1269c.f5156p) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                C1315d c1315d5 = (C1315d) this.f5566q0.get(i8);
                c1315d5.getClass();
                if (!(c1315d5 instanceof C1318g) && !(c1315d5 instanceof C1319h)) {
                    hashSet2.add(c1315d5);
                }
            }
            c1316e = this;
            c1269c2 = c1269c;
            c1316e.m3009a(this, c1269c2, hashSet2, this.f5543p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C1315d c1315d6 = (C1315d) it3.next();
                AbstractC1321j.m3051b(this, c1269c2, c1315d6);
                c1315d6.mo2978b(c1269c2, zM3036W);
            }
        } else {
            c1316e = this;
            c1269c2 = c1269c;
            for (int i9 = 0; i9 < size; i9++) {
                C1315d c1315d7 = (C1315d) c1316e.f5566q0.get(i9);
                if (c1315d7 instanceof C1316e) {
                    int[] iArr = c1315d7.f5543p0;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        c1315d7.m3004M(1);
                    }
                    if (i11 == 2) {
                        c1315d7.m3005N(1);
                    }
                    c1315d7.mo2978b(c1269c2, zM3036W);
                    if (i10 == 2) {
                        c1315d7.m3004M(i10);
                    }
                    if (i11 == 2) {
                        c1315d7.m3005N(i11);
                    }
                } else {
                    AbstractC1321j.m3051b(this, c1269c2, c1315d7);
                    if (!(c1315d7 instanceof C1318g) && !(c1315d7 instanceof C1319h)) {
                        c1315d7.mo2978b(c1269c2, zM3036W);
                    }
                }
            }
        }
        if (c1316e.f5575z0 > 0) {
            AbstractC1321j.m3050a(this, c1269c2, null, 0);
        }
        if (c1316e.f5554A0 > 0) {
            AbstractC1321j.m3050a(this, c1269c2, null, 1);
        }
    }

    /* renamed from: T */
    public final boolean m3034T(int i2, boolean z2) {
        boolean z3;
        C1336e c1336e = this.f5568s0;
        C1316e c1316e = c1336e.f5664a;
        boolean z4 = false;
        int iM3016j = c1316e.m3016j(0);
        int iM3016j2 = c1316e.m3016j(1);
        int iM3022r = c1316e.m3022r();
        int iM3023s = c1316e.m3023s();
        ArrayList arrayList = c1336e.f5668e;
        if (z2 && (iM3016j == 2 || iM3016j2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1346o abstractC1346o = (AbstractC1346o) it.next();
                if (abstractC1346o.f5702f == i2 && !abstractC1346o.mo3073k()) {
                    z2 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z2 && iM3016j == 2) {
                    c1316e.m3004M(1);
                    c1316e.m3006O(c1336e.m3079d(c1316e, 0));
                    c1316e.f5518d.f5701e.mo3085d(c1316e.m3021q());
                }
            } else if (z2 && iM3016j2 == 2) {
                c1316e.m3005N(1);
                c1316e.m3003L(c1336e.m3079d(c1316e, 1));
                c1316e.f5520e.f5701e.mo3085d(c1316e.m3017k());
            }
        }
        int[] iArr = c1316e.f5543p0;
        if (i2 == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iM3021q = c1316e.m3021q() + iM3022r;
                c1316e.f5518d.f5705i.mo3085d(iM3021q);
                c1316e.f5518d.f5701e.mo3085d(iM3021q - iM3022r);
                z3 = true;
            }
            z3 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int iM3017k = c1316e.m3017k() + iM3023s;
                c1316e.f5520e.f5705i.mo3085d(iM3017k);
                c1316e.f5520e.f5701e.mo3085d(iM3017k - iM3023s);
                z3 = true;
            }
            z3 = false;
        }
        c1336e.m3082g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC1346o abstractC1346o2 = (AbstractC1346o) it2.next();
            if (abstractC1346o2.f5702f == i2 && (abstractC1346o2.f5698b != c1316e || abstractC1346o2.f5703g)) {
                abstractC1346o2.mo3070e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC1346o abstractC1346o3 = (AbstractC1346o) it3.next();
            if (abstractC1346o3.f5702f == i2 && (z3 || abstractC1346o3.f5698b != c1316e)) {
                if (!abstractC1346o3.f5704h.f5681j || !abstractC1346o3.f5705i.f5681j || (!(abstractC1346o3 instanceof C1334c) && !abstractC1346o3.f5701e.f5681j)) {
                    break;
                }
            }
        }
        c1316e.m3004M(iM3016j);
        c1316e.m3005N(iM3016j2);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x084f A[LOOP:14: B:500:0x084d->B:501:0x084f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3035U() {
        /*
            Method dump skipped, instructions count: 2364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p129s.C1316e.m3035U():void");
    }

    /* renamed from: W */
    public final boolean m3036W(int i2) {
        return (this.f5557D0 & i2) == i2;
    }

    @Override // p129s.C1315d
    /* renamed from: n */
    public final void mo3020n(StringBuilder sb) {
        sb.append(this.f5530j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f5506U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f5507V);
        sb.append("\n");
        Iterator it = this.f5566q0.iterator();
        while (it.hasNext()) {
            ((C1315d) it.next()).mo3020n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
