package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.WeakHashMap;
import p002A1.C0019a;
import p006C.AbstractC0075g;
import p028K.AbstractC0241P;
import p031L.C0340j;
import p031L.C0341k;
import p094f0.AbstractC0911J;
import p094f0.C0912K;
import p094f0.C0917P;
import p094f0.C0923W;
import p094f0.C0949n;
import p094f0.C0952q;
import p094f0.C0954s;
import p094f0.C0955t;
import p094f0.C0956u;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f2754E;

    /* renamed from: F */
    public int f2755F;

    /* renamed from: G */
    public int[] f2756G;

    /* renamed from: H */
    public View[] f2757H;

    /* renamed from: I */
    public final SparseIntArray f2758I;

    /* renamed from: J */
    public final SparseIntArray f2759J;

    /* renamed from: K */
    public final C0019a f2760K;

    /* renamed from: L */
    public final Rect f2761L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f2754E = false;
        this.f2755F = -1;
        this.f2758I = new SparseIntArray();
        this.f2759J = new SparseIntArray();
        this.f2760K = new C0019a(17);
        this.f2761L = new Rect();
        m1821l1(AbstractC0911J.m2347I(context, attributeSet, i2, i3).f3749b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: B0 */
    public final void mo1796B0(C0923W c0923w, C0956u c0956u, C0949n c0949n) {
        int i2;
        int i3 = this.f2755F;
        for (int i4 = 0; i4 < this.f2755F && (i2 = c0956u.f4001d) >= 0 && i2 < c0923w.m2391b() && i3 > 0; i4++) {
            c0949n.m2453a(c0956u.f4001d, Math.max(0, c0956u.f4004g));
            this.f2760K.getClass();
            i3--;
            c0956u.f4001d += c0956u.f4002e;
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: J */
    public final int mo1797J(C0917P c0917p, C0923W c0923w) {
        if (this.f2766p == 0) {
            return this.f2755F;
        }
        if (c0923w.m2391b() < 1) {
            return 0;
        }
        return m1815h1(c0923w.m2391b() - 1, c0917p, c0923w) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N0 */
    public final View mo1798N0(C0917P c0917p, C0923W c0923w, int i2, int i3, int i4) {
        m1838G0();
        int iMo1620k = this.f2768r.mo1620k();
        int iMo1616g = this.f2768r.mo1616g();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View viewM2372u = m2372u(i2);
            int iM2346H = AbstractC0911J.m2346H(viewM2372u);
            if (iM2346H >= 0 && iM2346H < i4 && m1816i1(iM2346H, c0917p, c0923w) == 0) {
                if (((C0912K) viewM2372u.getLayoutParams()).f3767a.m2401h()) {
                    if (view2 == null) {
                        view2 = viewM2372u;
                    }
                } else {
                    if (this.f2768r.mo1614e(viewM2372u) < iMo1616g && this.f2768r.mo1611b(viewM2372u) >= iMo1620k) {
                        return viewM2372u;
                    }
                    if (view == null) {
                        view = viewM2372u;
                    }
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1799S(android.view.View r23, int r24, p094f0.C0917P r25, p094f0.C0923W r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1799S(android.view.View, int, f0.P, f0.W):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v39 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: T0 */
    public final void mo1800T0(C0917P c0917p, C0923W c0923w, C0956u c0956u, C0955t c0955t) {
        int i2;
        int i3;
        int i4;
        int iMo1613d;
        int iM2356E;
        int iMo1613d2;
        int i5;
        int iM2351w;
        int iM2351w2;
        ?? r8;
        int i6;
        View viewM2463b;
        int iMo1619j = this.f2768r.mo1619j();
        boolean z2 = iMo1619j != 1073741824;
        int i7 = m2374v() > 0 ? this.f2756G[this.f2755F] : 0;
        if (z2) {
            m1823m1();
        }
        boolean z3 = c0956u.f4002e == 1;
        int iM1816i1 = this.f2755F;
        if (!z3) {
            iM1816i1 = m1816i1(c0956u.f4001d, c0917p, c0923w) + m1817j1(c0956u.f4001d, c0917p, c0923w);
        }
        int i8 = 0;
        while (i8 < this.f2755F && (i6 = c0956u.f4001d) >= 0 && i6 < c0923w.m2391b() && iM1816i1 > 0) {
            int i9 = c0956u.f4001d;
            int iM1817j1 = m1817j1(i9, c0917p, c0923w);
            if (iM1817j1 > this.f2755F) {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + iM1817j1 + " spans but GridLayoutManager has only " + this.f2755F + " spans.");
            }
            iM1816i1 -= iM1817j1;
            if (iM1816i1 < 0 || (viewM2463b = c0956u.m2463b(c0917p)) == null) {
                break;
            }
            this.f2757H[i8] = viewM2463b;
            i8++;
        }
        if (i8 == 0) {
            c0955t.f3995b = true;
            return;
        }
        if (z3) {
            i4 = 1;
            i3 = i8;
            i2 = 0;
        } else {
            i2 = i8 - 1;
            i3 = -1;
            i4 = -1;
        }
        int i10 = 0;
        while (i2 != i3) {
            View view = this.f2757H[i2];
            C0952q c0952q = (C0952q) view.getLayoutParams();
            int iM1817j12 = m1817j1(AbstractC0911J.m2346H(view), c0917p, c0923w);
            c0952q.f3979f = iM1817j12;
            c0952q.f3978e = i10;
            i10 += iM1817j12;
            i2 += i4;
        }
        float f = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            View view2 = this.f2757H[i12];
            if (c0956u.f4008k != null) {
                r8 = 0;
                r8 = 0;
                if (z3) {
                    m2361b(view2, -1, true);
                } else {
                    m2361b(view2, 0, true);
                }
            } else if (z3) {
                r8 = 0;
                m2361b(view2, -1, false);
            } else {
                r8 = 0;
                m2361b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f3753b;
            Rect rect = this.f2761L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.m1890K(view2));
            }
            m1819k1(view2, iMo1619j, r8);
            int iMo1612c = this.f2768r.mo1612c(view2);
            if (iMo1612c > i11) {
                i11 = iMo1612c;
            }
            float fMo1613d = (this.f2768r.mo1613d(view2) * 1.0f) / ((C0952q) view2.getLayoutParams()).f3979f;
            if (fMo1613d > f) {
                f = fMo1613d;
            }
        }
        if (z2) {
            m1811e1(Math.max(Math.round(f * this.f2755F), i7));
            i11 = 0;
            for (int i13 = 0; i13 < i8; i13++) {
                View view3 = this.f2757H[i13];
                m1819k1(view3, 1073741824, true);
                int iMo1612c2 = this.f2768r.mo1612c(view3);
                if (iMo1612c2 > i11) {
                    i11 = iMo1612c2;
                }
            }
        }
        for (int i14 = 0; i14 < i8; i14++) {
            View view4 = this.f2757H[i14];
            if (this.f2768r.mo1612c(view4) != i11) {
                C0952q c0952q2 = (C0952q) view4.getLayoutParams();
                Rect rect2 = c0952q2.f3768b;
                int i15 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0952q2).topMargin + ((ViewGroup.MarginLayoutParams) c0952q2).bottomMargin;
                int i16 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0952q2).leftMargin + ((ViewGroup.MarginLayoutParams) c0952q2).rightMargin;
                int iM1814g1 = m1814g1(c0952q2.f3978e, c0952q2.f3979f);
                if (this.f2766p == 1) {
                    iM2351w2 = AbstractC0911J.m2351w(false, iM1814g1, 1073741824, i16, ((ViewGroup.MarginLayoutParams) c0952q2).width);
                    iM2351w = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    iM2351w = AbstractC0911J.m2351w(false, iM1814g1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) c0952q2).height);
                    iM2351w2 = iMakeMeasureSpec;
                }
                if (m2375w0(view4, iM2351w2, iM2351w, (C0912K) view4.getLayoutParams())) {
                    view4.measure(iM2351w2, iM2351w);
                }
            }
        }
        c0955t.f3994a = i11;
        if (this.f2766p == 1) {
            if (c0956u.f4003f == -1) {
                int i17 = c0956u.f3999b;
                i5 = i17 - i11;
                iMo1613d2 = i17;
            } else {
                i5 = c0956u.f3999b;
                iMo1613d2 = i5 + i11;
            }
            iM2356E = 0;
            iMo1613d = 0;
        } else {
            if (c0956u.f4003f == -1) {
                int i18 = c0956u.f3999b;
                iM2356E = i18 - i11;
                iMo1613d = i18;
            } else {
                int i19 = c0956u.f3999b;
                iMo1613d = i19 + i11;
                iM2356E = i19;
            }
            iMo1613d2 = 0;
            i5 = 0;
        }
        for (int i20 = 0; i20 < i8; i20++) {
            View view5 = this.f2757H[i20];
            C0952q c0952q3 = (C0952q) view5.getLayoutParams();
            if (this.f2766p != 1) {
                int iM2358G = m2358G() + this.f2756G[c0952q3.f3978e];
                i5 = iM2358G;
                iMo1613d2 = this.f2768r.mo1613d(view5) + iM2358G;
            } else if (m1851S0()) {
                int iM2356E2 = m2356E() + this.f2756G[this.f2755F - c0952q3.f3978e];
                iMo1613d = iM2356E2;
                iM2356E = iM2356E2 - this.f2768r.mo1613d(view5);
            } else {
                iM2356E = m2356E() + this.f2756G[c0952q3.f3978e];
                iMo1613d = this.f2768r.mo1613d(view5) + iM2356E;
            }
            AbstractC0911J.m2349N(view5, iM2356E, i5, iMo1613d, iMo1613d2);
            if (c0952q3.f3767a.m2401h() || c0952q3.f3767a.m2404k()) {
                c0955t.f3996c = true;
            }
            c0955t.f3997d = view5.hasFocusable() | c0955t.f3997d;
        }
        Arrays.fill(this.f2757H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: U0 */
    public final void mo1801U0(C0917P c0917p, C0923W c0923w, C0954s c0954s, int i2) {
        m1823m1();
        if (c0923w.m2391b() > 0 && !c0923w.f3799g) {
            boolean z2 = i2 == 1;
            int iM1816i1 = m1816i1(c0954s.f3990b, c0917p, c0923w);
            if (z2) {
                while (iM1816i1 > 0) {
                    int i3 = c0954s.f3990b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    c0954s.f3990b = i4;
                    iM1816i1 = m1816i1(i4, c0917p, c0923w);
                }
            } else {
                int iM2391b = c0923w.m2391b() - 1;
                int i5 = c0954s.f3990b;
                while (i5 < iM2391b) {
                    int i6 = i5 + 1;
                    int iM1816i12 = m1816i1(i6, c0917p, c0923w);
                    if (iM1816i12 <= iM1816i1) {
                        break;
                    }
                    i5 = i6;
                    iM1816i1 = iM1816i12;
                }
                c0954s.f3990b = i5;
            }
        }
        m1813f1();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: V */
    public final void mo1802V(C0917P c0917p, C0923W c0923w, View view, C0341k c0341k) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0952q)) {
            m2360U(view, c0341k);
            return;
        }
        C0952q c0952q = (C0952q) layoutParams;
        int iM1815h1 = m1815h1(c0952q.f3767a.m2395b(), c0917p, c0923w);
        if (this.f2766p == 0) {
            c0341k.m930j(C0340j.m920a(c0952q.f3978e, c0952q.f3979f, iM1815h1, 1, false, false));
        } else {
            c0341k.m930j(C0340j.m920a(iM1815h1, 1, c0952q.f3978e, c0952q.f3979f, false, false));
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: W */
    public final void mo1803W(int i2, int i3) {
        C0019a c0019a = this.f2760K;
        c0019a.m86z();
        ((SparseIntArray) c0019a.f46b).clear();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: X */
    public final void mo1804X() {
        C0019a c0019a = this.f2760K;
        c0019a.m86z();
        ((SparseIntArray) c0019a.f46b).clear();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: Y */
    public final void mo1805Y(int i2, int i3) {
        C0019a c0019a = this.f2760K;
        c0019a.m86z();
        ((SparseIntArray) c0019a.f46b).clear();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: Z */
    public final void mo1806Z(int i2, int i3) {
        C0019a c0019a = this.f2760K;
        c0019a.m86z();
        ((SparseIntArray) c0019a.f46b).clear();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: a0 */
    public final void mo1807a0(int i2, int i3) {
        C0019a c0019a = this.f2760K;
        c0019a.m86z();
        ((SparseIntArray) c0019a.f46b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a1 */
    public final void mo1808a1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1808a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: b0 */
    public final void mo1809b0(C0917P c0917p, C0923W c0923w) {
        boolean z2 = c0923w.f3799g;
        SparseIntArray sparseIntArray = this.f2759J;
        SparseIntArray sparseIntArray2 = this.f2758I;
        if (z2) {
            int iM2374v = m2374v();
            for (int i2 = 0; i2 < iM2374v; i2++) {
                C0952q c0952q = (C0952q) m2372u(i2).getLayoutParams();
                int iM2395b = c0952q.f3767a.m2395b();
                sparseIntArray2.put(iM2395b, c0952q.f3979f);
                sparseIntArray.put(iM2395b, c0952q.f3978e);
            }
        }
        super.mo1809b0(c0917p, c0923w);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: c0 */
    public final void mo1810c0(C0923W c0923w) {
        super.mo1810c0(c0923w);
        this.f2754E = false;
    }

    /* renamed from: e1 */
    public final void m1811e1(int i2) {
        int i3;
        int[] iArr = this.f2756G;
        int i4 = this.f2755F;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.f2756G = iArr;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: f */
    public final boolean mo1812f(C0912K c0912k) {
        return c0912k instanceof C0952q;
    }

    /* renamed from: f1 */
    public final void m1813f1() {
        View[] viewArr = this.f2757H;
        if (viewArr == null || viewArr.length != this.f2755F) {
            this.f2757H = new View[this.f2755F];
        }
    }

    /* renamed from: g1 */
    public final int m1814g1(int i2, int i3) {
        if (this.f2766p != 1 || !m1851S0()) {
            int[] iArr = this.f2756G;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f2756G;
        int i4 = this.f2755F;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    /* renamed from: h1 */
    public final int m1815h1(int i2, C0917P c0917p, C0923W c0923w) {
        boolean z2 = c0923w.f3799g;
        C0019a c0019a = this.f2760K;
        if (!z2) {
            int i3 = this.f2755F;
            c0019a.getClass();
            return C0019a.m54x(i2, i3);
        }
        int iM2379b = c0917p.m2379b(i2);
        if (iM2379b == -1) {
            return 0;
        }
        int i4 = this.f2755F;
        c0019a.getClass();
        return C0019a.m54x(iM2379b, i4);
    }

    /* renamed from: i1 */
    public final int m1816i1(int i2, C0917P c0917p, C0923W c0923w) {
        boolean z2 = c0923w.f3799g;
        C0019a c0019a = this.f2760K;
        if (!z2) {
            int i3 = this.f2755F;
            c0019a.getClass();
            return i2 % i3;
        }
        int i4 = this.f2759J.get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int iM2379b = c0917p.m2379b(i2);
        if (iM2379b == -1) {
            return 0;
        }
        int i5 = this.f2755F;
        c0019a.getClass();
        return iM2379b % i5;
    }

    /* renamed from: j1 */
    public final int m1817j1(int i2, C0917P c0917p, C0923W c0923w) {
        boolean z2 = c0923w.f3799g;
        C0019a c0019a = this.f2760K;
        if (!z2) {
            c0019a.getClass();
            return 1;
        }
        int i3 = this.f2758I.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (c0917p.m2379b(i2) == -1) {
            return 1;
        }
        c0019a.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: k */
    public final int mo1818k(C0923W c0923w) {
        return m1835D0(c0923w);
    }

    /* renamed from: k1 */
    public final void m1819k1(View view, int i2, boolean z2) {
        int iM2351w;
        int iM2351w2;
        C0952q c0952q = (C0952q) view.getLayoutParams();
        Rect rect = c0952q.f3768b;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0952q).topMargin + ((ViewGroup.MarginLayoutParams) c0952q).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0952q).leftMargin + ((ViewGroup.MarginLayoutParams) c0952q).rightMargin;
        int iM1814g1 = m1814g1(c0952q.f3978e, c0952q.f3979f);
        if (this.f2766p == 1) {
            iM2351w2 = AbstractC0911J.m2351w(false, iM1814g1, i2, i4, ((ViewGroup.MarginLayoutParams) c0952q).width);
            iM2351w = AbstractC0911J.m2351w(true, this.f2768r.mo1621l(), this.f3764m, i3, ((ViewGroup.MarginLayoutParams) c0952q).height);
        } else {
            int iM2351w3 = AbstractC0911J.m2351w(false, iM1814g1, i2, i3, ((ViewGroup.MarginLayoutParams) c0952q).height);
            int iM2351w4 = AbstractC0911J.m2351w(true, this.f2768r.mo1621l(), this.f3763l, i4, ((ViewGroup.MarginLayoutParams) c0952q).width);
            iM2351w = iM2351w3;
            iM2351w2 = iM2351w4;
        }
        C0912K c0912k = (C0912K) view.getLayoutParams();
        if (z2 ? m2375w0(view, iM2351w2, iM2351w, c0912k) : m2373u0(view, iM2351w2, iM2351w, c0912k)) {
            view.measure(iM2351w2, iM2351w);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: l */
    public final int mo1820l(C0923W c0923w) {
        return m1836E0(c0923w);
    }

    /* renamed from: l1 */
    public final void m1821l1(int i2) {
        if (i2 == this.f2755F) {
            return;
        }
        this.f2754E = true;
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC0075g.m236e("Span count should be at least 1. Provided ", i2));
        }
        this.f2755F = i2;
        this.f2760K.m86z();
        m2366l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: m0 */
    public final int mo1822m0(int i2, C0917P c0917p, C0923W c0923w) {
        m1823m1();
        m1813f1();
        return super.mo1822m0(i2, c0917p, c0923w);
    }

    /* renamed from: m1 */
    public final void m1823m1() {
        int iM2355D;
        int iM2358G;
        if (this.f2766p == 1) {
            iM2355D = this.f3765n - m2357F();
            iM2358G = m2356E();
        } else {
            iM2355D = this.f3766o - m2355D();
            iM2358G = m2358G();
        }
        m1811e1(iM2355D - iM2358G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: n */
    public final int mo1824n(C0923W c0923w) {
        return m1835D0(c0923w);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: o */
    public final int mo1825o(C0923W c0923w) {
        return m1836E0(c0923w);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: o0 */
    public final int mo1826o0(int i2, C0917P c0917p, C0923W c0923w) {
        m1823m1();
        m1813f1();
        return super.mo1826o0(i2, c0917p, c0923w);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: r */
    public final C0912K mo1827r() {
        return this.f2766p == 0 ? new C0952q(-2, -1) : new C0952q(-1, -2);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: r0 */
    public final void mo1828r0(Rect rect, int i2, int i3) {
        int iM2350g;
        int iM2350g2;
        if (this.f2756G == null) {
            super.mo1828r0(rect, i2, i3);
        }
        int iM2357F = m2357F() + m2356E();
        int iM2355D = m2355D() + m2358G();
        if (this.f2766p == 1) {
            int iHeight = rect.height() + iM2355D;
            RecyclerView recyclerView = this.f3753b;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            iM2350g2 = AbstractC0911J.m2350g(i3, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f2756G;
            iM2350g = AbstractC0911J.m2350g(i2, iArr[iArr.length - 1] + iM2357F, this.f3753b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2357F;
            RecyclerView recyclerView2 = this.f3753b;
            WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
            iM2350g = AbstractC0911J.m2350g(i2, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f2756G;
            iM2350g2 = AbstractC0911J.m2350g(i3, iArr2[iArr2.length - 1] + iM2355D, this.f3753b.getMinimumHeight());
        }
        this.f3753b.setMeasuredDimension(iM2350g, iM2350g2);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: s */
    public final C0912K mo1829s(Context context, AttributeSet attributeSet) {
        C0952q c0952q = new C0952q(context, attributeSet);
        c0952q.f3978e = -1;
        c0952q.f3979f = 0;
        return c0952q;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: t */
    public final C0912K mo1830t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0952q c0952q = new C0952q((ViewGroup.MarginLayoutParams) layoutParams);
            c0952q.f3978e = -1;
            c0952q.f3979f = 0;
            return c0952q;
        }
        C0952q c0952q2 = new C0952q(layoutParams);
        c0952q2.f3978e = -1;
        c0952q2.f3979f = 0;
        return c0952q2;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: x */
    public final int mo1831x(C0917P c0917p, C0923W c0923w) {
        if (this.f2766p == 1) {
            return this.f2755F;
        }
        if (c0923w.m2391b() < 1) {
            return 0;
        }
        return m1815h1(c0923w.m2391b() - 1, c0917p, c0923w) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: z0 */
    public final boolean mo1832z0() {
        return this.f2776z == null && !this.f2754E;
    }

    public GridLayoutManager(int i2) {
        super(1);
        this.f2754E = false;
        this.f2755F = -1;
        this.f2758I = new SparseIntArray();
        this.f2759J = new SparseIntArray();
        this.f2760K = new C0019a(17);
        this.f2761L = new Rect();
        m1821l1(i2);
    }
}
