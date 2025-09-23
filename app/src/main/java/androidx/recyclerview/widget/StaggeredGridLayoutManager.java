package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.AbstractC0668g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p002A1.C0019a;
import p002A1.RunnableC0042x;
import p028K.AbstractC0241P;
import p031L.C0340j;
import p031L.C0341k;
import p033L1.AbstractC0356d;
import p094f0.AbstractC0911J;
import p094f0.C0910I;
import p094f0.C0912K;
import p094f0.C0917P;
import p094f0.C0923W;
import p094f0.C0932c0;
import p094f0.C0934d0;
import p094f0.C0938f0;
import p094f0.C0940g0;
import p094f0.C0949n;
import p094f0.C0953r;
import p094f0.C0958w;
import p094f0.InterfaceC0922V;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0911J implements InterfaceC0922V {

    /* renamed from: B */
    public final C0019a f2850B;

    /* renamed from: C */
    public final int f2851C;

    /* renamed from: D */
    public boolean f2852D;

    /* renamed from: E */
    public boolean f2853E;

    /* renamed from: F */
    public C0938f0 f2854F;

    /* renamed from: G */
    public final Rect f2855G;

    /* renamed from: H */
    public final C0932c0 f2856H;

    /* renamed from: I */
    public final boolean f2857I;

    /* renamed from: J */
    public int[] f2858J;

    /* renamed from: K */
    public final RunnableC0042x f2859K;

    /* renamed from: p */
    public final int f2860p;

    /* renamed from: q */
    public final C0940g0[] f2861q;

    /* renamed from: r */
    public final AbstractC0668g f2862r;

    /* renamed from: s */
    public final AbstractC0668g f2863s;

    /* renamed from: t */
    public final int f2864t;

    /* renamed from: u */
    public int f2865u;

    /* renamed from: v */
    public final C0953r f2866v;

    /* renamed from: w */
    public boolean f2867w;

    /* renamed from: y */
    public final BitSet f2869y;

    /* renamed from: x */
    public boolean f2868x = false;

    /* renamed from: z */
    public int f2870z = -1;

    /* renamed from: A */
    public int f2849A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f2860p = -1;
        this.f2867w = false;
        C0019a c0019a = new C0019a(18, false);
        this.f2850B = c0019a;
        this.f2851C = 2;
        this.f2855G = new Rect();
        this.f2856H = new C0932c0(this);
        this.f2857I = true;
        this.f2859K = new RunnableC0042x(13, this);
        C0910I c0910iM2347I = AbstractC0911J.m2347I(context, attributeSet, i2, i3);
        int i4 = c0910iM2347I.f3748a;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1860c(null);
        if (i4 != this.f2864t) {
            this.f2864t = i4;
            AbstractC0668g abstractC0668g = this.f2862r;
            this.f2862r = this.f2863s;
            this.f2863s = abstractC0668g;
            m2366l0();
        }
        int i5 = c0910iM2347I.f3749b;
        mo1860c(null);
        if (i5 != this.f2860p) {
            int[] iArr = (int[]) c0019a.f47c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0019a.f46b = null;
            m2366l0();
            this.f2860p = i5;
            this.f2869y = new BitSet(this.f2860p);
            this.f2861q = new C0940g0[this.f2860p];
            for (int i6 = 0; i6 < this.f2860p; i6++) {
                this.f2861q[i6] = new C0940g0(this, i6);
            }
            m2366l0();
        }
        boolean z2 = c0910iM2347I.f3750c;
        mo1860c(null);
        C0938f0 c0938f0 = this.f2854F;
        if (c0938f0 != null && c0938f0.f3884h != z2) {
            c0938f0.f3884h = z2;
        }
        this.f2867w = z2;
        m2366l0();
        C0953r c0953r = new C0953r();
        c0953r.f3980a = true;
        c0953r.f3985f = 0;
        c0953r.f3986g = 0;
        this.f2866v = c0953r;
        this.f2862r = AbstractC0668g.m1610a(this, this.f2864t);
        this.f2863s = AbstractC0668g.m1610a(this, 1 - this.f2864t);
    }

    /* renamed from: c1 */
    public static int m1932c1(int i2, int i3, int i4) {
        int mode;
        return (!(i3 == 0 && i4 == 0) && ((mode = View.MeasureSpec.getMode(i2)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    /* renamed from: A0 */
    public final boolean m1933A0() {
        int iM1942J0;
        if (m2374v() != 0 && this.f2851C != 0 && this.f3758g) {
            if (this.f2868x) {
                iM1942J0 = m1943K0();
                m1942J0();
            } else {
                iM1942J0 = m1942J0();
                m1943K0();
            }
            C0019a c0019a = this.f2850B;
            if (iM1942J0 == 0 && m1948O0() != null) {
                int[] iArr = (int[]) c0019a.f47c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0019a.f46b = null;
                this.f3757f = true;
                m2366l0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: B0 */
    public final int m1934B0(C0923W c0923w) {
        if (m2374v() == 0) {
            return 0;
        }
        AbstractC0668g abstractC0668g = this.f2862r;
        boolean z2 = !this.f2857I;
        return AbstractC0356d.m956f(c0923w, abstractC0668g, m1939G0(z2), m1938F0(z2), this, this.f2857I);
    }

    /* renamed from: C0 */
    public final int m1935C0(C0923W c0923w) {
        if (m2374v() == 0) {
            return 0;
        }
        AbstractC0668g abstractC0668g = this.f2862r;
        boolean z2 = !this.f2857I;
        return AbstractC0356d.m957g(c0923w, abstractC0668g, m1939G0(z2), m1938F0(z2), this, this.f2857I, this.f2868x);
    }

    /* renamed from: D0 */
    public final int m1936D0(C0923W c0923w) {
        if (m2374v() == 0) {
            return 0;
        }
        AbstractC0668g abstractC0668g = this.f2862r;
        boolean z2 = !this.f2857I;
        return AbstractC0356d.m958h(c0923w, abstractC0668g, m1939G0(z2), m1938F0(z2), this, this.f2857I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* renamed from: E0 */
    public final int m1937E0(C0917P c0917p, C0953r c0953r, C0923W c0923w) {
        C0940g0 c0940g0;
        ?? r6;
        int i2;
        int iM2439h;
        int iMo1612c;
        int iMo1620k;
        int iMo1612c2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.f2869y.set(0, this.f2860p, true);
        C0953r c0953r2 = this.f2866v;
        int i8 = c0953r2.f3988i ? c0953r.f3984e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0953r.f3984e == 1 ? c0953r.f3986g + c0953r.f3981b : c0953r.f3985f - c0953r.f3981b;
        int i9 = c0953r.f3984e;
        for (int i10 = 0; i10 < this.f2860p; i10++) {
            if (!this.f2861q[i10].f3893a.isEmpty()) {
                m1962b1(this.f2861q[i10], i9, i8);
            }
        }
        int iMo1616g = this.f2868x ? this.f2862r.mo1616g() : this.f2862r.mo1620k();
        boolean z2 = false;
        while (true) {
            int i11 = c0953r.f3982c;
            if (((i11 < 0 || i11 >= c0923w.m2391b()) ? i6 : i7) == 0 || (!c0953r2.f3988i && this.f2869y.isEmpty())) {
                break;
            }
            View view = c0917p.m2386i(c0953r.f3982c, Long.MAX_VALUE).f3815a;
            c0953r.f3982c += c0953r.f3983d;
            C0934d0 c0934d0 = (C0934d0) view.getLayoutParams();
            int iM2395b = c0934d0.f3767a.m2395b();
            C0019a c0019a = this.f2850B;
            int[] iArr = (int[]) c0019a.f47c;
            int i12 = (iArr == null || iM2395b >= iArr.length) ? -1 : iArr[iM2395b];
            if (i12 == -1) {
                if (m1953S0(c0953r.f3984e)) {
                    i5 = this.f2860p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f2860p;
                    i5 = i6;
                }
                C0940g0 c0940g02 = null;
                if (c0953r.f3984e == i7) {
                    int iMo1620k2 = this.f2862r.mo1620k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        C0940g0 c0940g03 = this.f2861q[i5];
                        int iM2437f = c0940g03.m2437f(iMo1620k2);
                        if (iM2437f < i13) {
                            i13 = iM2437f;
                            c0940g02 = c0940g03;
                        }
                        i5 += i3;
                    }
                } else {
                    int iMo1616g2 = this.f2862r.mo1616g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        C0940g0 c0940g04 = this.f2861q[i5];
                        int iM2439h2 = c0940g04.m2439h(iMo1616g2);
                        if (iM2439h2 > i14) {
                            c0940g02 = c0940g04;
                            i14 = iM2439h2;
                        }
                        i5 += i3;
                    }
                }
                c0940g0 = c0940g02;
                c0019a.m83v(iM2395b);
                ((int[]) c0019a.f47c)[iM2395b] = c0940g0.f3897e;
            } else {
                c0940g0 = this.f2861q[i12];
            }
            c0934d0.f3861e = c0940g0;
            if (c0953r.f3984e == 1) {
                r6 = 0;
                m2361b(view, -1, false);
            } else {
                r6 = 0;
                m2361b(view, 0, false);
            }
            if (this.f2864t == 1) {
                i2 = 1;
                m1951Q0(view, AbstractC0911J.m2351w(r6, this.f2865u, this.f3763l, r6, ((ViewGroup.MarginLayoutParams) c0934d0).width), AbstractC0911J.m2351w(true, this.f3766o, this.f3764m, m2355D() + m2358G(), ((ViewGroup.MarginLayoutParams) c0934d0).height));
            } else {
                i2 = 1;
                m1951Q0(view, AbstractC0911J.m2351w(true, this.f3765n, this.f3763l, m2357F() + m2356E(), ((ViewGroup.MarginLayoutParams) c0934d0).width), AbstractC0911J.m2351w(false, this.f2865u, this.f3764m, 0, ((ViewGroup.MarginLayoutParams) c0934d0).height));
            }
            if (c0953r.f3984e == i2) {
                iMo1612c = c0940g0.m2437f(iMo1616g);
                iM2439h = this.f2862r.mo1612c(view) + iMo1612c;
            } else {
                iM2439h = c0940g0.m2439h(iMo1616g);
                iMo1612c = iM2439h - this.f2862r.mo1612c(view);
            }
            if (c0953r.f3984e == 1) {
                C0940g0 c0940g05 = c0934d0.f3861e;
                c0940g05.getClass();
                C0934d0 c0934d02 = (C0934d0) view.getLayoutParams();
                c0934d02.f3861e = c0940g05;
                ArrayList arrayList = c0940g05.f3893a;
                arrayList.add(view);
                c0940g05.f3895c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c0940g05.f3894b = Integer.MIN_VALUE;
                }
                if (c0934d02.f3767a.m2401h() || c0934d02.f3767a.m2404k()) {
                    c0940g05.f3896d = c0940g05.f3898f.f2862r.mo1612c(view) + c0940g05.f3896d;
                }
            } else {
                C0940g0 c0940g06 = c0934d0.f3861e;
                c0940g06.getClass();
                C0934d0 c0934d03 = (C0934d0) view.getLayoutParams();
                c0934d03.f3861e = c0940g06;
                ArrayList arrayList2 = c0940g06.f3893a;
                arrayList2.add(0, view);
                c0940g06.f3894b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c0940g06.f3895c = Integer.MIN_VALUE;
                }
                if (c0934d03.f3767a.m2401h() || c0934d03.f3767a.m2404k()) {
                    c0940g06.f3896d = c0940g06.f3898f.f2862r.mo1612c(view) + c0940g06.f3896d;
                }
            }
            if (m1950P0() && this.f2864t == 1) {
                iMo1612c2 = this.f2863s.mo1616g() - (((this.f2860p - 1) - c0940g0.f3897e) * this.f2865u);
                iMo1620k = iMo1612c2 - this.f2863s.mo1612c(view);
            } else {
                iMo1620k = this.f2863s.mo1620k() + (c0940g0.f3897e * this.f2865u);
                iMo1612c2 = this.f2863s.mo1612c(view) + iMo1620k;
            }
            if (this.f2864t == 1) {
                AbstractC0911J.m2349N(view, iMo1620k, iMo1612c, iMo1612c2, iM2439h);
            } else {
                AbstractC0911J.m2349N(view, iMo1612c, iMo1620k, iM2439h, iMo1612c2);
            }
            m1962b1(c0940g0, c0953r2.f3984e, i8);
            m1955U0(c0917p, c0953r2);
            if (c0953r2.f3987h && view.hasFocusable()) {
                this.f2869y.set(c0940g0.f3897e, false);
            }
            i7 = 1;
            z2 = true;
            i6 = 0;
        }
        if (!z2) {
            m1955U0(c0917p, c0953r2);
        }
        int iMo1620k3 = c0953r2.f3984e == -1 ? this.f2862r.mo1620k() - m1945M0(this.f2862r.mo1620k()) : m1944L0(this.f2862r.mo1616g()) - this.f2862r.mo1616g();
        if (iMo1620k3 > 0) {
            return Math.min(c0953r.f3981b, iMo1620k3);
        }
        return 0;
    }

    /* renamed from: F0 */
    public final View m1938F0(boolean z2) {
        int iMo1620k = this.f2862r.mo1620k();
        int iMo1616g = this.f2862r.mo1616g();
        View view = null;
        for (int iM2374v = m2374v() - 1; iM2374v >= 0; iM2374v--) {
            View viewM2372u = m2372u(iM2374v);
            int iMo1614e = this.f2862r.mo1614e(viewM2372u);
            int iMo1611b = this.f2862r.mo1611b(viewM2372u);
            if (iMo1611b > iMo1620k && iMo1614e < iMo1616g) {
                if (iMo1611b <= iMo1616g || !z2) {
                    return viewM2372u;
                }
                if (view == null) {
                    view = viewM2372u;
                }
            }
        }
        return view;
    }

    /* renamed from: G0 */
    public final View m1939G0(boolean z2) {
        int iMo1620k = this.f2862r.mo1620k();
        int iMo1616g = this.f2862r.mo1616g();
        int iM2374v = m2374v();
        View view = null;
        for (int i2 = 0; i2 < iM2374v; i2++) {
            View viewM2372u = m2372u(i2);
            int iMo1614e = this.f2862r.mo1614e(viewM2372u);
            if (this.f2862r.mo1611b(viewM2372u) > iMo1620k && iMo1614e < iMo1616g) {
                if (iMo1614e >= iMo1620k || !z2) {
                    return viewM2372u;
                }
                if (view == null) {
                    view = viewM2372u;
                }
            }
        }
        return view;
    }

    /* renamed from: H0 */
    public final void m1940H0(C0917P c0917p, C0923W c0923w, boolean z2) {
        int iMo1616g;
        int iM1944L0 = m1944L0(Integer.MIN_VALUE);
        if (iM1944L0 != Integer.MIN_VALUE && (iMo1616g = this.f2862r.mo1616g() - iM1944L0) > 0) {
            int i2 = iMo1616g - (-m1959Y0(-iMo1616g, c0917p, c0923w));
            if (!z2 || i2 <= 0) {
                return;
            }
            this.f2862r.mo1624o(i2);
        }
    }

    /* renamed from: I0 */
    public final void m1941I0(C0917P c0917p, C0923W c0923w, boolean z2) {
        int iMo1620k;
        int iM1945M0 = m1945M0(Integer.MAX_VALUE);
        if (iM1945M0 != Integer.MAX_VALUE && (iMo1620k = iM1945M0 - this.f2862r.mo1620k()) > 0) {
            int iM1959Y0 = iMo1620k - m1959Y0(iMo1620k, c0917p, c0923w);
            if (!z2 || iM1959Y0 <= 0) {
                return;
            }
            this.f2862r.mo1624o(-iM1959Y0);
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: J */
    public final int mo1797J(C0917P c0917p, C0923W c0923w) {
        return this.f2864t == 0 ? this.f2860p : super.mo1797J(c0917p, c0923w);
    }

    /* renamed from: J0 */
    public final int m1942J0() {
        if (m2374v() == 0) {
            return 0;
        }
        return AbstractC0911J.m2346H(m2372u(0));
    }

    /* renamed from: K0 */
    public final int m1943K0() {
        int iM2374v = m2374v();
        if (iM2374v == 0) {
            return 0;
        }
        return AbstractC0911J.m2346H(m2372u(iM2374v - 1));
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: L */
    public final boolean mo1843L() {
        return this.f2851C != 0;
    }

    /* renamed from: L0 */
    public final int m1944L0(int i2) {
        int iM2437f = this.f2861q[0].m2437f(i2);
        for (int i3 = 1; i3 < this.f2860p; i3++) {
            int iM2437f2 = this.f2861q[i3].m2437f(i2);
            if (iM2437f2 > iM2437f) {
                iM2437f = iM2437f2;
            }
        }
        return iM2437f;
    }

    /* renamed from: M0 */
    public final int m1945M0(int i2) {
        int iM2439h = this.f2861q[0].m2439h(i2);
        for (int i3 = 1; i3 < this.f2860p; i3++) {
            int iM2439h2 = this.f2861q[i3].m2439h(i2);
            if (iM2439h2 < iM2439h) {
                iM2439h = iM2439h2;
            }
        }
        return iM2439h;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1946N0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1946N0(int, int, int):void");
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: O */
    public final void mo1947O(int i2) {
        super.mo1947O(i2);
        for (int i3 = 0; i3 < this.f2860p; i3++) {
            C0940g0 c0940g0 = this.f2861q[i3];
            int i4 = c0940g0.f3894b;
            if (i4 != Integer.MIN_VALUE) {
                c0940g0.f3894b = i4 + i2;
            }
            int i5 = c0940g0.f3895c;
            if (i5 != Integer.MIN_VALUE) {
                c0940g0.f3895c = i5 + i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m1948O0() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1948O0():android.view.View");
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: P */
    public final void mo1949P(int i2) {
        super.mo1949P(i2);
        for (int i3 = 0; i3 < this.f2860p; i3++) {
            C0940g0 c0940g0 = this.f2861q[i3];
            int i4 = c0940g0.f3894b;
            if (i4 != Integer.MIN_VALUE) {
                c0940g0.f3894b = i4 + i2;
            }
            int i5 = c0940g0.f3895c;
            if (i5 != Integer.MIN_VALUE) {
                c0940g0.f3895c = i5 + i2;
            }
        }
    }

    /* renamed from: P0 */
    public final boolean m1950P0() {
        return m2354C() == 1;
    }

    /* renamed from: Q0 */
    public final void m1951Q0(View view, int i2, int i3) {
        RecyclerView recyclerView = this.f3753b;
        Rect rect = this.f2855G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1890K(view));
        }
        C0934d0 c0934d0 = (C0934d0) view.getLayoutParams();
        int iM1932c1 = m1932c1(i2, ((ViewGroup.MarginLayoutParams) c0934d0).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0934d0).rightMargin + rect.right);
        int iM1932c12 = m1932c1(i3, ((ViewGroup.MarginLayoutParams) c0934d0).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0934d0).bottomMargin + rect.bottom);
        if (m2373u0(view, iM1932c1, iM1932c12, c0934d0)) {
            view.measure(iM1932c1, iM1932c12);
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: R */
    public final void mo1849R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3753b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2859K);
        }
        for (int i2 = 0; i2 < this.f2860p; i2++) {
            this.f2861q[i2].m2433b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x041f  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1952R0(p094f0.C0917P r17, p094f0.C0923W r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1952R0(f0.P, f0.W, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // p094f0.AbstractC0911J
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1799S(android.view.View r9, int r10, p094f0.C0917P r11, p094f0.C0923W r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1799S(android.view.View, int, f0.P, f0.W):android.view.View");
    }

    /* renamed from: S0 */
    public final boolean m1953S0(int i2) {
        if (this.f2864t == 0) {
            return (i2 == -1) != this.f2868x;
        }
        return ((i2 == -1) == this.f2868x) == m1950P0();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: T */
    public final void mo1852T(AccessibilityEvent accessibilityEvent) {
        super.mo1852T(accessibilityEvent);
        if (m2374v() > 0) {
            View viewM1939G0 = m1939G0(false);
            View viewM1938F0 = m1938F0(false);
            if (viewM1939G0 == null || viewM1938F0 == null) {
                return;
            }
            int iM2346H = AbstractC0911J.m2346H(viewM1939G0);
            int iM2346H2 = AbstractC0911J.m2346H(viewM1938F0);
            if (iM2346H < iM2346H2) {
                accessibilityEvent.setFromIndex(iM2346H);
                accessibilityEvent.setToIndex(iM2346H2);
            } else {
                accessibilityEvent.setFromIndex(iM2346H2);
                accessibilityEvent.setToIndex(iM2346H);
            }
        }
    }

    /* renamed from: T0 */
    public final void m1954T0(int i2, C0923W c0923w) {
        int iM1942J0;
        int i3;
        if (i2 > 0) {
            iM1942J0 = m1943K0();
            i3 = 1;
        } else {
            iM1942J0 = m1942J0();
            i3 = -1;
        }
        C0953r c0953r = this.f2866v;
        c0953r.f3980a = true;
        m1961a1(iM1942J0, c0923w);
        m1960Z0(i3);
        c0953r.f3982c = iM1942J0 + c0953r.f3983d;
        c0953r.f3981b = Math.abs(i2);
    }

    /* renamed from: U0 */
    public final void m1955U0(C0917P c0917p, C0953r c0953r) {
        if (!c0953r.f3980a || c0953r.f3988i) {
            return;
        }
        if (c0953r.f3981b == 0) {
            if (c0953r.f3984e == -1) {
                m1956V0(c0917p, c0953r.f3986g);
                return;
            } else {
                m1957W0(c0917p, c0953r.f3985f);
                return;
            }
        }
        int i2 = 1;
        if (c0953r.f3984e == -1) {
            int i3 = c0953r.f3985f;
            int iM2439h = this.f2861q[0].m2439h(i3);
            while (i2 < this.f2860p) {
                int iM2439h2 = this.f2861q[i2].m2439h(i3);
                if (iM2439h2 > iM2439h) {
                    iM2439h = iM2439h2;
                }
                i2++;
            }
            int i4 = i3 - iM2439h;
            m1956V0(c0917p, i4 < 0 ? c0953r.f3986g : c0953r.f3986g - Math.min(i4, c0953r.f3981b));
            return;
        }
        int i5 = c0953r.f3986g;
        int iM2437f = this.f2861q[0].m2437f(i5);
        while (i2 < this.f2860p) {
            int iM2437f2 = this.f2861q[i2].m2437f(i5);
            if (iM2437f2 < iM2437f) {
                iM2437f = iM2437f2;
            }
            i2++;
        }
        int i6 = iM2437f - c0953r.f3986g;
        m1957W0(c0917p, i6 < 0 ? c0953r.f3985f : Math.min(i6, c0953r.f3981b) + c0953r.f3985f);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: V */
    public final void mo1802V(C0917P c0917p, C0923W c0923w, View view, C0341k c0341k) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0934d0)) {
            m2360U(view, c0341k);
            return;
        }
        C0934d0 c0934d0 = (C0934d0) layoutParams;
        if (this.f2864t == 0) {
            C0940g0 c0940g0 = c0934d0.f3861e;
            c0341k.m930j(C0340j.m920a(c0940g0 != null ? c0940g0.f3897e : -1, 1, -1, -1, false, false));
        } else {
            C0940g0 c0940g02 = c0934d0.f3861e;
            c0341k.m930j(C0340j.m920a(-1, -1, c0940g02 != null ? c0940g02.f3897e : -1, 1, false, false));
        }
    }

    /* renamed from: V0 */
    public final void m1956V0(C0917P c0917p, int i2) {
        for (int iM2374v = m2374v() - 1; iM2374v >= 0; iM2374v--) {
            View viewM2372u = m2372u(iM2374v);
            if (this.f2862r.mo1614e(viewM2372u) < i2 || this.f2862r.mo1623n(viewM2372u) < i2) {
                return;
            }
            C0934d0 c0934d0 = (C0934d0) viewM2372u.getLayoutParams();
            c0934d0.getClass();
            if (c0934d0.f3861e.f3893a.size() == 1) {
                return;
            }
            C0940g0 c0940g0 = c0934d0.f3861e;
            ArrayList arrayList = c0940g0.f3893a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C0934d0 c0934d02 = (C0934d0) view.getLayoutParams();
            c0934d02.f3861e = null;
            if (c0934d02.f3767a.m2401h() || c0934d02.f3767a.m2404k()) {
                c0940g0.f3896d -= c0940g0.f3898f.f2862r.mo1612c(view);
            }
            if (size == 1) {
                c0940g0.f3894b = Integer.MIN_VALUE;
            }
            c0940g0.f3895c = Integer.MIN_VALUE;
            m2364i0(viewM2372u, c0917p);
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: W */
    public final void mo1803W(int i2, int i3) {
        m1946N0(i2, i3, 1);
    }

    /* renamed from: W0 */
    public final void m1957W0(C0917P c0917p, int i2) {
        while (m2374v() > 0) {
            View viewM2372u = m2372u(0);
            if (this.f2862r.mo1611b(viewM2372u) > i2 || this.f2862r.mo1622m(viewM2372u) > i2) {
                return;
            }
            C0934d0 c0934d0 = (C0934d0) viewM2372u.getLayoutParams();
            c0934d0.getClass();
            if (c0934d0.f3861e.f3893a.size() == 1) {
                return;
            }
            C0940g0 c0940g0 = c0934d0.f3861e;
            ArrayList arrayList = c0940g0.f3893a;
            View view = (View) arrayList.remove(0);
            C0934d0 c0934d02 = (C0934d0) view.getLayoutParams();
            c0934d02.f3861e = null;
            if (arrayList.size() == 0) {
                c0940g0.f3895c = Integer.MIN_VALUE;
            }
            if (c0934d02.f3767a.m2401h() || c0934d02.f3767a.m2404k()) {
                c0940g0.f3896d -= c0940g0.f3898f.f2862r.mo1612c(view);
            }
            c0940g0.f3894b = Integer.MIN_VALUE;
            m2364i0(viewM2372u, c0917p);
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: X */
    public final void mo1804X() {
        C0019a c0019a = this.f2850B;
        int[] iArr = (int[]) c0019a.f47c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c0019a.f46b = null;
        m2366l0();
    }

    /* renamed from: X0 */
    public final void m1958X0() {
        if (this.f2864t == 1 || !m1950P0()) {
            this.f2868x = this.f2867w;
        } else {
            this.f2868x = !this.f2867w;
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: Y */
    public final void mo1805Y(int i2, int i3) {
        m1946N0(i2, i3, 8);
    }

    /* renamed from: Y0 */
    public final int m1959Y0(int i2, C0917P c0917p, C0923W c0923w) {
        if (m2374v() == 0 || i2 == 0) {
            return 0;
        }
        m1954T0(i2, c0923w);
        C0953r c0953r = this.f2866v;
        int iM1937E0 = m1937E0(c0917p, c0953r, c0923w);
        if (c0953r.f3981b >= iM1937E0) {
            i2 = i2 < 0 ? -iM1937E0 : iM1937E0;
        }
        this.f2862r.mo1624o(-i2);
        this.f2852D = this.f2868x;
        c0953r.f3981b = 0;
        m1955U0(c0917p, c0953r);
        return i2;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: Z */
    public final void mo1806Z(int i2, int i3) {
        m1946N0(i2, i3, 2);
    }

    /* renamed from: Z0 */
    public final void m1960Z0(int i2) {
        C0953r c0953r = this.f2866v;
        c0953r.f3984e = i2;
        c0953r.f3983d = this.f2868x != (i2 == -1) ? -1 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // p094f0.InterfaceC0922V
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF mo1858a(int r4) {
        /*
            r3 = this;
            int r0 = r3.m2374v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f2868x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.m1942J0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f2868x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f2864t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1858a(int):android.graphics.PointF");
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: a0 */
    public final void mo1807a0(int i2, int i3) {
        m1946N0(i2, i3, 4);
    }

    /* renamed from: a1 */
    public final void m1961a1(int i2, C0923W c0923w) {
        int iMo1621l;
        int iMo1621l2;
        int i3;
        C0953r c0953r = this.f2866v;
        boolean z2 = false;
        c0953r.f3981b = 0;
        c0953r.f3982c = i2;
        C0958w c0958w = this.f3756e;
        if (!(c0958w != null && c0958w.f4017e) || (i3 = c0923w.f3793a) == -1) {
            iMo1621l = 0;
            iMo1621l2 = 0;
        } else {
            if (this.f2868x == (i3 < i2)) {
                iMo1621l = this.f2862r.mo1621l();
                iMo1621l2 = 0;
            } else {
                iMo1621l2 = this.f2862r.mo1621l();
                iMo1621l = 0;
            }
        }
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView == null || !recyclerView.f2815g) {
            c0953r.f3986g = this.f2862r.mo1615f() + iMo1621l;
            c0953r.f3985f = -iMo1621l2;
        } else {
            c0953r.f3985f = this.f2862r.mo1620k() - iMo1621l2;
            c0953r.f3986g = this.f2862r.mo1616g() + iMo1621l;
        }
        c0953r.f3987h = false;
        c0953r.f3980a = true;
        if (this.f2862r.mo1618i() == 0 && this.f2862r.mo1615f() == 0) {
            z2 = true;
        }
        c0953r.f3988i = z2;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: b0 */
    public final void mo1809b0(C0917P c0917p, C0923W c0923w) {
        m1952R0(c0917p, c0923w, true);
    }

    /* renamed from: b1 */
    public final void m1962b1(C0940g0 c0940g0, int i2, int i3) {
        int i4 = c0940g0.f3896d;
        int i5 = c0940g0.f3897e;
        if (i2 != -1) {
            int i6 = c0940g0.f3895c;
            if (i6 == Integer.MIN_VALUE) {
                c0940g0.m2432a();
                i6 = c0940g0.f3895c;
            }
            if (i6 - i4 >= i3) {
                this.f2869y.set(i5, false);
                return;
            }
            return;
        }
        int i7 = c0940g0.f3894b;
        if (i7 == Integer.MIN_VALUE) {
            View view = (View) c0940g0.f3893a.get(0);
            C0934d0 c0934d0 = (C0934d0) view.getLayoutParams();
            c0940g0.f3894b = c0940g0.f3898f.f2862r.mo1614e(view);
            c0934d0.getClass();
            i7 = c0940g0.f3894b;
        }
        if (i7 + i4 <= i3) {
            this.f2869y.set(i5, false);
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: c */
    public final void mo1860c(String str) {
        if (this.f2854F == null) {
            super.mo1860c(str);
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: c0 */
    public final void mo1810c0(C0923W c0923w) {
        this.f2870z = -1;
        this.f2849A = Integer.MIN_VALUE;
        this.f2854F = null;
        this.f2856H.m2431a();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: d */
    public final boolean mo1862d() {
        return this.f2864t == 0;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: d0 */
    public final void mo1863d0(Parcelable parcelable) {
        if (parcelable instanceof C0938f0) {
            this.f2854F = (C0938f0) parcelable;
            m2366l0();
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: e */
    public final boolean mo1865e() {
        return this.f2864t == 1;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: e0 */
    public final Parcelable mo1866e0() {
        int iM2439h;
        int iMo1620k;
        int[] iArr;
        C0938f0 c0938f0 = this.f2854F;
        if (c0938f0 != null) {
            C0938f0 c0938f02 = new C0938f0();
            c0938f02.f3879c = c0938f0.f3879c;
            c0938f02.f3877a = c0938f0.f3877a;
            c0938f02.f3878b = c0938f0.f3878b;
            c0938f02.f3880d = c0938f0.f3880d;
            c0938f02.f3881e = c0938f0.f3881e;
            c0938f02.f3882f = c0938f0.f3882f;
            c0938f02.f3884h = c0938f0.f3884h;
            c0938f02.f3885i = c0938f0.f3885i;
            c0938f02.f3886j = c0938f0.f3886j;
            c0938f02.f3883g = c0938f0.f3883g;
            return c0938f02;
        }
        C0938f0 c0938f03 = new C0938f0();
        c0938f03.f3884h = this.f2867w;
        c0938f03.f3885i = this.f2852D;
        c0938f03.f3886j = this.f2853E;
        C0019a c0019a = this.f2850B;
        if (c0019a == null || (iArr = (int[]) c0019a.f47c) == null) {
            c0938f03.f3881e = 0;
        } else {
            c0938f03.f3882f = iArr;
            c0938f03.f3881e = iArr.length;
            c0938f03.f3883g = (ArrayList) c0019a.f46b;
        }
        if (m2374v() <= 0) {
            c0938f03.f3877a = -1;
            c0938f03.f3878b = -1;
            c0938f03.f3879c = 0;
            return c0938f03;
        }
        c0938f03.f3877a = this.f2852D ? m1943K0() : m1942J0();
        View viewM1938F0 = this.f2868x ? m1938F0(true) : m1939G0(true);
        c0938f03.f3878b = viewM1938F0 != null ? AbstractC0911J.m2346H(viewM1938F0) : -1;
        int i2 = this.f2860p;
        c0938f03.f3879c = i2;
        c0938f03.f3880d = new int[i2];
        for (int i3 = 0; i3 < this.f2860p; i3++) {
            if (this.f2852D) {
                iM2439h = this.f2861q[i3].m2437f(Integer.MIN_VALUE);
                if (iM2439h != Integer.MIN_VALUE) {
                    iMo1620k = this.f2862r.mo1616g();
                    iM2439h -= iMo1620k;
                }
            } else {
                iM2439h = this.f2861q[i3].m2439h(Integer.MIN_VALUE);
                if (iM2439h != Integer.MIN_VALUE) {
                    iMo1620k = this.f2862r.mo1620k();
                    iM2439h -= iMo1620k;
                }
            }
            c0938f03.f3880d[i3] = iM2439h;
        }
        return c0938f03;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: f */
    public final boolean mo1812f(C0912K c0912k) {
        return c0912k instanceof C0934d0;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: f0 */
    public final void mo1963f0(int i2) {
        if (i2 == 0) {
            m1933A0();
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: h */
    public final void mo1867h(int i2, int i3, C0923W c0923w, C0949n c0949n) {
        C0953r c0953r;
        int iM2437f;
        int iM2439h;
        if (this.f2864t != 0) {
            i2 = i3;
        }
        if (m2374v() == 0 || i2 == 0) {
            return;
        }
        m1954T0(i2, c0923w);
        int[] iArr = this.f2858J;
        if (iArr == null || iArr.length < this.f2860p) {
            this.f2858J = new int[this.f2860p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f2860p;
            c0953r = this.f2866v;
            if (i4 >= i6) {
                break;
            }
            if (c0953r.f3983d == -1) {
                iM2437f = c0953r.f3985f;
                iM2439h = this.f2861q[i4].m2439h(iM2437f);
            } else {
                iM2437f = this.f2861q[i4].m2437f(c0953r.f3986g);
                iM2439h = c0953r.f3986g;
            }
            int i7 = iM2437f - iM2439h;
            if (i7 >= 0) {
                this.f2858J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f2858J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0953r.f3982c;
            if (i9 < 0 || i9 >= c0923w.m2391b()) {
                return;
            }
            c0949n.m2453a(c0953r.f3982c, this.f2858J[i8]);
            c0953r.f3982c += c0953r.f3983d;
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: j */
    public final int mo1869j(C0923W c0923w) {
        return m1934B0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: k */
    public final int mo1818k(C0923W c0923w) {
        return m1935C0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: l */
    public final int mo1820l(C0923W c0923w) {
        return m1936D0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: m */
    public final int mo1870m(C0923W c0923w) {
        return m1934B0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: m0 */
    public final int mo1822m0(int i2, C0917P c0917p, C0923W c0923w) {
        return m1959Y0(i2, c0917p, c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: n */
    public final int mo1824n(C0923W c0923w) {
        return m1935C0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: n0 */
    public final void mo1871n0(int i2) {
        C0938f0 c0938f0 = this.f2854F;
        if (c0938f0 != null && c0938f0.f3877a != i2) {
            c0938f0.f3880d = null;
            c0938f0.f3879c = 0;
            c0938f0.f3877a = -1;
            c0938f0.f3878b = -1;
        }
        this.f2870z = i2;
        this.f2849A = Integer.MIN_VALUE;
        m2366l0();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: o */
    public final int mo1825o(C0923W c0923w) {
        return m1936D0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: o0 */
    public final int mo1826o0(int i2, C0917P c0917p, C0923W c0923w) {
        return m1959Y0(i2, c0917p, c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: r */
    public final C0912K mo1827r() {
        return this.f2864t == 0 ? new C0934d0(-2, -1) : new C0934d0(-1, -2);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: r0 */
    public final void mo1828r0(Rect rect, int i2, int i3) {
        int iM2350g;
        int iM2350g2;
        int i4 = this.f2860p;
        int iM2357F = m2357F() + m2356E();
        int iM2355D = m2355D() + m2358G();
        if (this.f2864t == 1) {
            int iHeight = rect.height() + iM2355D;
            RecyclerView recyclerView = this.f3753b;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            iM2350g2 = AbstractC0911J.m2350g(i3, iHeight, recyclerView.getMinimumHeight());
            iM2350g = AbstractC0911J.m2350g(i2, (this.f2865u * i4) + iM2357F, this.f3753b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2357F;
            RecyclerView recyclerView2 = this.f3753b;
            WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
            iM2350g = AbstractC0911J.m2350g(i2, iWidth, recyclerView2.getMinimumWidth());
            iM2350g2 = AbstractC0911J.m2350g(i3, (this.f2865u * i4) + iM2355D, this.f3753b.getMinimumHeight());
        }
        this.f3753b.setMeasuredDimension(iM2350g, iM2350g2);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: s */
    public final C0912K mo1829s(Context context, AttributeSet attributeSet) {
        return new C0934d0(context, attributeSet);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: t */
    public final C0912K mo1830t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0934d0((ViewGroup.MarginLayoutParams) layoutParams) : new C0934d0(layoutParams);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: x */
    public final int mo1831x(C0917P c0917p, C0923W c0923w) {
        return this.f2864t == 1 ? this.f2860p : super.mo1831x(c0917p, c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: x0 */
    public final void mo1874x0(RecyclerView recyclerView, int i2) {
        C0958w c0958w = new C0958w(recyclerView.getContext());
        c0958w.f4013a = i2;
        m2376y0(c0958w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: z0 */
    public final boolean mo1832z0() {
        return this.f2854F == null;
    }
}
