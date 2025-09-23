package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.AbstractC0668g;
import p006C.AbstractC0075g;
import p033L1.AbstractC0356d;
import p094f0.AbstractC0911J;
import p094f0.C0910I;
import p094f0.C0912K;
import p094f0.C0917P;
import p094f0.C0923W;
import p094f0.C0949n;
import p094f0.C0954s;
import p094f0.C0955t;
import p094f0.C0956u;
import p094f0.C0957v;
import p094f0.C0958w;
import p094f0.InterfaceC0922V;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0911J implements InterfaceC0922V {

    /* renamed from: A */
    public final C0954s f2762A;

    /* renamed from: B */
    public final C0955t f2763B;

    /* renamed from: C */
    public final int f2764C;

    /* renamed from: D */
    public final int[] f2765D;

    /* renamed from: p */
    public int f2766p;

    /* renamed from: q */
    public C0956u f2767q;

    /* renamed from: r */
    public AbstractC0668g f2768r;

    /* renamed from: s */
    public boolean f2769s;

    /* renamed from: t */
    public final boolean f2770t;

    /* renamed from: u */
    public boolean f2771u;

    /* renamed from: v */
    public boolean f2772v;

    /* renamed from: w */
    public final boolean f2773w;

    /* renamed from: x */
    public int f2774x;

    /* renamed from: y */
    public int f2775y;

    /* renamed from: z */
    public C0957v f2776z;

    public LinearLayoutManager(int i2) {
        this.f2766p = 1;
        this.f2770t = false;
        this.f2771u = false;
        this.f2772v = false;
        this.f2773w = true;
        this.f2774x = -1;
        this.f2775y = Integer.MIN_VALUE;
        this.f2776z = null;
        this.f2762A = new C0954s();
        this.f2763B = new C0955t();
        this.f2764C = 2;
        this.f2765D = new int[2];
        m1857Z0(i2);
        mo1860c(null);
        if (this.f2770t) {
            this.f2770t = false;
            m2366l0();
        }
    }

    /* renamed from: A0 */
    public void mo1833A0(C0923W c0923w, int[] iArr) {
        int i2;
        int iMo1621l = c0923w.f3793a != -1 ? this.f2768r.mo1621l() : 0;
        if (this.f2767q.f4003f == -1) {
            i2 = 0;
        } else {
            i2 = iMo1621l;
            iMo1621l = 0;
        }
        iArr[0] = iMo1621l;
        iArr[1] = i2;
    }

    /* renamed from: B0 */
    public void mo1796B0(C0923W c0923w, C0956u c0956u, C0949n c0949n) {
        int i2 = c0956u.f4001d;
        if (i2 < 0 || i2 >= c0923w.m2391b()) {
            return;
        }
        c0949n.m2453a(i2, Math.max(0, c0956u.f4004g));
    }

    /* renamed from: C0 */
    public final int m1834C0(C0923W c0923w) {
        if (m2374v() == 0) {
            return 0;
        }
        m1838G0();
        AbstractC0668g abstractC0668g = this.f2768r;
        boolean z2 = !this.f2773w;
        return AbstractC0356d.m956f(c0923w, abstractC0668g, m1841J0(z2), m1840I0(z2), this, this.f2773w);
    }

    /* renamed from: D0 */
    public final int m1835D0(C0923W c0923w) {
        if (m2374v() == 0) {
            return 0;
        }
        m1838G0();
        AbstractC0668g abstractC0668g = this.f2768r;
        boolean z2 = !this.f2773w;
        return AbstractC0356d.m957g(c0923w, abstractC0668g, m1841J0(z2), m1840I0(z2), this, this.f2773w, this.f2771u);
    }

    /* renamed from: E0 */
    public final int m1836E0(C0923W c0923w) {
        if (m2374v() == 0) {
            return 0;
        }
        m1838G0();
        AbstractC0668g abstractC0668g = this.f2768r;
        boolean z2 = !this.f2773w;
        return AbstractC0356d.m958h(c0923w, abstractC0668g, m1841J0(z2), m1840I0(z2), this, this.f2773w);
    }

    /* renamed from: F0 */
    public final int m1837F0(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f2766p == 1) ? 1 : Integer.MIN_VALUE : this.f2766p == 0 ? 1 : Integer.MIN_VALUE : this.f2766p == 1 ? -1 : Integer.MIN_VALUE : this.f2766p == 0 ? -1 : Integer.MIN_VALUE : (this.f2766p != 1 && m1851S0()) ? -1 : 1 : (this.f2766p != 1 && m1851S0()) ? 1 : -1;
    }

    /* renamed from: G0 */
    public final void m1838G0() {
        if (this.f2767q == null) {
            C0956u c0956u = new C0956u();
            c0956u.f3998a = true;
            c0956u.f4005h = 0;
            c0956u.f4006i = 0;
            c0956u.f4008k = null;
            this.f2767q = c0956u;
        }
    }

    /* renamed from: H0 */
    public final int m1839H0(C0917P c0917p, C0956u c0956u, C0923W c0923w, boolean z2) {
        int i2;
        int i3 = c0956u.f4000c;
        int i4 = c0956u.f4004g;
        if (i4 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                c0956u.f4004g = i4 + i3;
            }
            m1853V0(c0917p, c0956u);
        }
        int i5 = c0956u.f4000c + c0956u.f4005h;
        while (true) {
            if ((!c0956u.f4009l && i5 <= 0) || (i2 = c0956u.f4001d) < 0 || i2 >= c0923w.m2391b()) {
                break;
            }
            C0955t c0955t = this.f2763B;
            c0955t.f3994a = 0;
            c0955t.f3995b = false;
            c0955t.f3996c = false;
            c0955t.f3997d = false;
            mo1800T0(c0917p, c0923w, c0956u, c0955t);
            if (!c0955t.f3995b) {
                int i6 = c0956u.f3999b;
                int i7 = c0955t.f3994a;
                c0956u.f3999b = (c0956u.f4003f * i7) + i6;
                if (!c0955t.f3996c || c0956u.f4008k != null || !c0923w.f3799g) {
                    c0956u.f4000c -= i7;
                    i5 -= i7;
                }
                int i8 = c0956u.f4004g;
                if (i8 != Integer.MIN_VALUE) {
                    int i9 = i8 + i7;
                    c0956u.f4004g = i9;
                    int i10 = c0956u.f4000c;
                    if (i10 < 0) {
                        c0956u.f4004g = i9 + i10;
                    }
                    m1853V0(c0917p, c0956u);
                }
                if (z2 && c0955t.f3997d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - c0956u.f4000c;
    }

    /* renamed from: I0 */
    public final View m1840I0(boolean z2) {
        return this.f2771u ? m1845M0(0, m2374v(), z2) : m1845M0(m2374v() - 1, -1, z2);
    }

    /* renamed from: J0 */
    public final View m1841J0(boolean z2) {
        return this.f2771u ? m1845M0(m2374v() - 1, -1, z2) : m1845M0(0, m2374v(), z2);
    }

    /* renamed from: K0 */
    public final int m1842K0() {
        View viewM1845M0 = m1845M0(m2374v() - 1, -1, false);
        if (viewM1845M0 == null) {
            return -1;
        }
        return AbstractC0911J.m2346H(viewM1845M0);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: L */
    public final boolean mo1843L() {
        return true;
    }

    /* renamed from: L0 */
    public final View m1844L0(int i2, int i3) {
        int i4;
        int i5;
        m1838G0();
        if (i3 <= i2 && i3 >= i2) {
            return m2372u(i2);
        }
        if (this.f2768r.mo1614e(m2372u(i2)) < this.f2768r.mo1620k()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.f2766p == 0 ? this.f3754c.m84w(i2, i3, i4, i5) : this.f3755d.m84w(i2, i3, i4, i5);
    }

    /* renamed from: M0 */
    public final View m1845M0(int i2, int i3, boolean z2) {
        m1838G0();
        int i4 = z2 ? 24579 : 320;
        return this.f2766p == 0 ? this.f3754c.m84w(i2, i3, i4, 320) : this.f3755d.m84w(i2, i3, i4, 320);
    }

    /* renamed from: N0 */
    public View mo1798N0(C0917P c0917p, C0923W c0923w, int i2, int i3, int i4) {
        m1838G0();
        int iMo1620k = this.f2768r.mo1620k();
        int iMo1616g = this.f2768r.mo1616g();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View viewM2372u = m2372u(i2);
            int iM2346H = AbstractC0911J.m2346H(viewM2372u);
            if (iM2346H >= 0 && iM2346H < i4) {
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

    /* renamed from: O0 */
    public final int m1846O0(int i2, C0917P c0917p, C0923W c0923w, boolean z2) {
        int iMo1616g;
        int iMo1616g2 = this.f2768r.mo1616g() - i2;
        if (iMo1616g2 <= 0) {
            return 0;
        }
        int i3 = -m1856Y0(-iMo1616g2, c0917p, c0923w);
        int i4 = i2 + i3;
        if (!z2 || (iMo1616g = this.f2768r.mo1616g() - i4) <= 0) {
            return i3;
        }
        this.f2768r.mo1624o(iMo1616g);
        return iMo1616g + i3;
    }

    /* renamed from: P0 */
    public final int m1847P0(int i2, C0917P c0917p, C0923W c0923w, boolean z2) {
        int iMo1620k;
        int iMo1620k2 = i2 - this.f2768r.mo1620k();
        if (iMo1620k2 <= 0) {
            return 0;
        }
        int i3 = -m1856Y0(iMo1620k2, c0917p, c0923w);
        int i4 = i2 + i3;
        if (!z2 || (iMo1620k = i4 - this.f2768r.mo1620k()) <= 0) {
            return i3;
        }
        this.f2768r.mo1624o(-iMo1620k);
        return i3 - iMo1620k;
    }

    /* renamed from: Q0 */
    public final View m1848Q0() {
        return m2372u(this.f2771u ? 0 : m2374v() - 1);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: R */
    public final void mo1849R(RecyclerView recyclerView) {
    }

    /* renamed from: R0 */
    public final View m1850R0() {
        return m2372u(this.f2771u ? m2374v() - 1 : 0);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: S */
    public View mo1799S(View view, int i2, C0917P c0917p, C0923W c0923w) {
        int iM1837F0;
        m1855X0();
        if (m2374v() != 0 && (iM1837F0 = m1837F0(i2)) != Integer.MIN_VALUE) {
            m1838G0();
            m1859b1(iM1837F0, (int) (this.f2768r.mo1621l() * 0.33333334f), false, c0923w);
            C0956u c0956u = this.f2767q;
            c0956u.f4004g = Integer.MIN_VALUE;
            c0956u.f3998a = false;
            m1839H0(c0917p, c0956u, c0923w, true);
            View viewM1844L0 = iM1837F0 == -1 ? this.f2771u ? m1844L0(m2374v() - 1, -1) : m1844L0(0, m2374v()) : this.f2771u ? m1844L0(0, m2374v()) : m1844L0(m2374v() - 1, -1);
            View viewM1850R0 = iM1837F0 == -1 ? m1850R0() : m1848Q0();
            if (!viewM1850R0.hasFocusable()) {
                return viewM1844L0;
            }
            if (viewM1844L0 != null) {
                return viewM1850R0;
            }
        }
        return null;
    }

    /* renamed from: S0 */
    public final boolean m1851S0() {
        return m2354C() == 1;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: T */
    public final void mo1852T(AccessibilityEvent accessibilityEvent) {
        super.mo1852T(accessibilityEvent);
        if (m2374v() > 0) {
            View viewM1845M0 = m1845M0(0, m2374v(), false);
            accessibilityEvent.setFromIndex(viewM1845M0 == null ? -1 : AbstractC0911J.m2346H(viewM1845M0));
            accessibilityEvent.setToIndex(m1842K0());
        }
    }

    /* renamed from: T0 */
    public void mo1800T0(C0917P c0917p, C0923W c0923w, C0956u c0956u, C0955t c0955t) {
        int iM2356E;
        int i2;
        int i3;
        int iMo1613d;
        View viewM2463b = c0956u.m2463b(c0917p);
        if (viewM2463b == null) {
            c0955t.f3995b = true;
            return;
        }
        C0912K c0912k = (C0912K) viewM2463b.getLayoutParams();
        if (c0956u.f4008k == null) {
            if (this.f2771u == (c0956u.f4003f == -1)) {
                m2361b(viewM2463b, -1, false);
            } else {
                m2361b(viewM2463b, 0, false);
            }
        } else {
            if (this.f2771u == (c0956u.f4003f == -1)) {
                m2361b(viewM2463b, -1, true);
            } else {
                m2361b(viewM2463b, 0, true);
            }
        }
        C0912K c0912k2 = (C0912K) viewM2463b.getLayoutParams();
        Rect rectM1890K = this.f3753b.m1890K(viewM2463b);
        int i4 = rectM1890K.left + rectM1890K.right;
        int i5 = rectM1890K.top + rectM1890K.bottom;
        int iM2351w = AbstractC0911J.m2351w(mo1862d(), this.f3765n, this.f3763l, m2357F() + m2356E() + ((ViewGroup.MarginLayoutParams) c0912k2).leftMargin + ((ViewGroup.MarginLayoutParams) c0912k2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) c0912k2).width);
        int iM2351w2 = AbstractC0911J.m2351w(mo1865e(), this.f3766o, this.f3764m, m2355D() + m2358G() + ((ViewGroup.MarginLayoutParams) c0912k2).topMargin + ((ViewGroup.MarginLayoutParams) c0912k2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) c0912k2).height);
        if (m2373u0(viewM2463b, iM2351w, iM2351w2, c0912k2)) {
            viewM2463b.measure(iM2351w, iM2351w2);
        }
        c0955t.f3994a = this.f2768r.mo1612c(viewM2463b);
        if (this.f2766p == 1) {
            if (m1851S0()) {
                iMo1613d = this.f3765n - m2357F();
                iM2356E = iMo1613d - this.f2768r.mo1613d(viewM2463b);
            } else {
                iM2356E = m2356E();
                iMo1613d = this.f2768r.mo1613d(viewM2463b) + iM2356E;
            }
            if (c0956u.f4003f == -1) {
                i2 = c0956u.f3999b;
                i3 = i2 - c0955t.f3994a;
            } else {
                i3 = c0956u.f3999b;
                i2 = c0955t.f3994a + i3;
            }
        } else {
            int iM2358G = m2358G();
            int iMo1613d2 = this.f2768r.mo1613d(viewM2463b) + iM2358G;
            if (c0956u.f4003f == -1) {
                int i6 = c0956u.f3999b;
                int i7 = i6 - c0955t.f3994a;
                iMo1613d = i6;
                i2 = iMo1613d2;
                iM2356E = i7;
                i3 = iM2358G;
            } else {
                int i8 = c0956u.f3999b;
                int i9 = c0955t.f3994a + i8;
                iM2356E = i8;
                i2 = iMo1613d2;
                i3 = iM2358G;
                iMo1613d = i9;
            }
        }
        AbstractC0911J.m2349N(viewM2463b, iM2356E, i3, iMo1613d, i2);
        if (c0912k.f3767a.m2401h() || c0912k.f3767a.m2404k()) {
            c0955t.f3996c = true;
        }
        c0955t.f3997d = viewM2463b.hasFocusable();
    }

    /* renamed from: U0 */
    public void mo1801U0(C0917P c0917p, C0923W c0923w, C0954s c0954s, int i2) {
    }

    /* renamed from: V0 */
    public final void m1853V0(C0917P c0917p, C0956u c0956u) {
        if (!c0956u.f3998a || c0956u.f4009l) {
            return;
        }
        int i2 = c0956u.f4004g;
        int i3 = c0956u.f4006i;
        if (c0956u.f4003f == -1) {
            int iM2374v = m2374v();
            if (i2 < 0) {
                return;
            }
            int iMo1615f = (this.f2768r.mo1615f() - i2) + i3;
            if (this.f2771u) {
                for (int i4 = 0; i4 < iM2374v; i4++) {
                    View viewM2372u = m2372u(i4);
                    if (this.f2768r.mo1614e(viewM2372u) < iMo1615f || this.f2768r.mo1623n(viewM2372u) < iMo1615f) {
                        m1854W0(c0917p, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = iM2374v - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View viewM2372u2 = m2372u(i6);
                if (this.f2768r.mo1614e(viewM2372u2) < iMo1615f || this.f2768r.mo1623n(viewM2372u2) < iMo1615f) {
                    m1854W0(c0917p, i5, i6);
                    return;
                }
            }
            return;
        }
        if (i2 < 0) {
            return;
        }
        int i7 = i2 - i3;
        int iM2374v2 = m2374v();
        if (!this.f2771u) {
            for (int i8 = 0; i8 < iM2374v2; i8++) {
                View viewM2372u3 = m2372u(i8);
                if (this.f2768r.mo1611b(viewM2372u3) > i7 || this.f2768r.mo1622m(viewM2372u3) > i7) {
                    m1854W0(c0917p, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = iM2374v2 - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View viewM2372u4 = m2372u(i10);
            if (this.f2768r.mo1611b(viewM2372u4) > i7 || this.f2768r.mo1622m(viewM2372u4) > i7) {
                m1854W0(c0917p, i9, i10);
                return;
            }
        }
    }

    /* renamed from: W0 */
    public final void m1854W0(C0917P c0917p, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                View viewM2372u = m2372u(i2);
                m2365j0(i2);
                c0917p.m2383f(viewM2372u);
                i2--;
            }
            return;
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            View viewM2372u2 = m2372u(i4);
            m2365j0(i4);
            c0917p.m2383f(viewM2372u2);
        }
    }

    /* renamed from: X0 */
    public final void m1855X0() {
        if (this.f2766p == 1 || !m1851S0()) {
            this.f2771u = this.f2770t;
        } else {
            this.f2771u = !this.f2770t;
        }
    }

    /* renamed from: Y0 */
    public final int m1856Y0(int i2, C0917P c0917p, C0923W c0923w) {
        if (m2374v() != 0 && i2 != 0) {
            m1838G0();
            this.f2767q.f3998a = true;
            int i3 = i2 > 0 ? 1 : -1;
            int iAbs = Math.abs(i2);
            m1859b1(i3, iAbs, true, c0923w);
            C0956u c0956u = this.f2767q;
            int iM1839H0 = m1839H0(c0917p, c0956u, c0923w, false) + c0956u.f4004g;
            if (iM1839H0 >= 0) {
                if (iAbs > iM1839H0) {
                    i2 = i3 * iM1839H0;
                }
                this.f2768r.mo1624o(-i2);
                this.f2767q.f4007j = i2;
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: Z0 */
    public final void m1857Z0(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(AbstractC0075g.m236e("invalid orientation:", i2));
        }
        mo1860c(null);
        if (i2 != this.f2766p || this.f2768r == null) {
            AbstractC0668g abstractC0668gM1610a = AbstractC0668g.m1610a(this, i2);
            this.f2768r = abstractC0668gM1610a;
            this.f2762A.f3989a = abstractC0668gM1610a;
            this.f2766p = i2;
            m2366l0();
        }
    }

    @Override // p094f0.InterfaceC0922V
    /* renamed from: a */
    public final PointF mo1858a(int i2) {
        if (m2374v() == 0) {
            return null;
        }
        int i3 = (i2 < AbstractC0911J.m2346H(m2372u(0))) != this.f2771u ? -1 : 1;
        return this.f2766p == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    /* renamed from: a1 */
    public void mo1808a1(boolean z2) {
        mo1860c(null);
        if (this.f2772v == z2) {
            return;
        }
        this.f2772v = z2;
        m2366l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0196  */
    @Override // p094f0.AbstractC0911J
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1809b0(p094f0.C0917P r18, p094f0.C0923W r19) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1809b0(f0.P, f0.W):void");
    }

    /* renamed from: b1 */
    public final void m1859b1(int i2, int i3, boolean z2, C0923W c0923w) {
        int iMo1620k;
        this.f2767q.f4009l = this.f2768r.mo1618i() == 0 && this.f2768r.mo1615f() == 0;
        this.f2767q.f4003f = i2;
        int[] iArr = this.f2765D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1833A0(c0923w, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z3 = i2 == 1;
        C0956u c0956u = this.f2767q;
        int i4 = z3 ? iMax2 : iMax;
        c0956u.f4005h = i4;
        if (!z3) {
            iMax = iMax2;
        }
        c0956u.f4006i = iMax;
        if (z3) {
            c0956u.f4005h = this.f2768r.mo1617h() + i4;
            View viewM1848Q0 = m1848Q0();
            C0956u c0956u2 = this.f2767q;
            c0956u2.f4002e = this.f2771u ? -1 : 1;
            int iM2346H = AbstractC0911J.m2346H(viewM1848Q0);
            C0956u c0956u3 = this.f2767q;
            c0956u2.f4001d = iM2346H + c0956u3.f4002e;
            c0956u3.f3999b = this.f2768r.mo1611b(viewM1848Q0);
            iMo1620k = this.f2768r.mo1611b(viewM1848Q0) - this.f2768r.mo1616g();
        } else {
            View viewM1850R0 = m1850R0();
            C0956u c0956u4 = this.f2767q;
            c0956u4.f4005h = this.f2768r.mo1620k() + c0956u4.f4005h;
            C0956u c0956u5 = this.f2767q;
            c0956u5.f4002e = this.f2771u ? 1 : -1;
            int iM2346H2 = AbstractC0911J.m2346H(viewM1850R0);
            C0956u c0956u6 = this.f2767q;
            c0956u5.f4001d = iM2346H2 + c0956u6.f4002e;
            c0956u6.f3999b = this.f2768r.mo1614e(viewM1850R0);
            iMo1620k = (-this.f2768r.mo1614e(viewM1850R0)) + this.f2768r.mo1620k();
        }
        C0956u c0956u7 = this.f2767q;
        c0956u7.f4000c = i3;
        if (z2) {
            c0956u7.f4000c = i3 - iMo1620k;
        }
        c0956u7.f4004g = iMo1620k;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: c */
    public final void mo1860c(String str) {
        if (this.f2776z == null) {
            super.mo1860c(str);
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: c0 */
    public void mo1810c0(C0923W c0923w) {
        this.f2776z = null;
        this.f2774x = -1;
        this.f2775y = Integer.MIN_VALUE;
        this.f2762A.m2461d();
    }

    /* renamed from: c1 */
    public final void m1861c1(int i2, int i3) {
        this.f2767q.f4000c = this.f2768r.mo1616g() - i3;
        C0956u c0956u = this.f2767q;
        c0956u.f4002e = this.f2771u ? -1 : 1;
        c0956u.f4001d = i2;
        c0956u.f4003f = 1;
        c0956u.f3999b = i3;
        c0956u.f4004g = Integer.MIN_VALUE;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: d */
    public final boolean mo1862d() {
        return this.f2766p == 0;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: d0 */
    public final void mo1863d0(Parcelable parcelable) {
        if (parcelable instanceof C0957v) {
            this.f2776z = (C0957v) parcelable;
            m2366l0();
        }
    }

    /* renamed from: d1 */
    public final void m1864d1(int i2, int i3) {
        this.f2767q.f4000c = i3 - this.f2768r.mo1620k();
        C0956u c0956u = this.f2767q;
        c0956u.f4001d = i2;
        c0956u.f4002e = this.f2771u ? 1 : -1;
        c0956u.f4003f = -1;
        c0956u.f3999b = i3;
        c0956u.f4004g = Integer.MIN_VALUE;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: e */
    public final boolean mo1865e() {
        return this.f2766p == 1;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: e0 */
    public final Parcelable mo1866e0() {
        C0957v c0957v = this.f2776z;
        if (c0957v != null) {
            C0957v c0957v2 = new C0957v();
            c0957v2.f4010a = c0957v.f4010a;
            c0957v2.f4011b = c0957v.f4011b;
            c0957v2.f4012c = c0957v.f4012c;
            return c0957v2;
        }
        C0957v c0957v3 = new C0957v();
        if (m2374v() <= 0) {
            c0957v3.f4010a = -1;
            return c0957v3;
        }
        m1838G0();
        boolean z2 = this.f2769s ^ this.f2771u;
        c0957v3.f4012c = z2;
        if (z2) {
            View viewM1848Q0 = m1848Q0();
            c0957v3.f4011b = this.f2768r.mo1616g() - this.f2768r.mo1611b(viewM1848Q0);
            c0957v3.f4010a = AbstractC0911J.m2346H(viewM1848Q0);
            return c0957v3;
        }
        View viewM1850R0 = m1850R0();
        c0957v3.f4010a = AbstractC0911J.m2346H(viewM1850R0);
        c0957v3.f4011b = this.f2768r.mo1614e(viewM1850R0) - this.f2768r.mo1620k();
        return c0957v3;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: h */
    public final void mo1867h(int i2, int i3, C0923W c0923w, C0949n c0949n) {
        if (this.f2766p != 0) {
            i2 = i3;
        }
        if (m2374v() == 0 || i2 == 0) {
            return;
        }
        m1838G0();
        m1859b1(i2 > 0 ? 1 : -1, Math.abs(i2), true, c0923w);
        mo1796B0(c0923w, this.f2767q, c0949n);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: i */
    public final void mo1868i(int i2, C0949n c0949n) {
        boolean z2;
        int i3;
        C0957v c0957v = this.f2776z;
        if (c0957v == null || (i3 = c0957v.f4010a) < 0) {
            m1855X0();
            z2 = this.f2771u;
            i3 = this.f2774x;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            z2 = c0957v.f4012c;
        }
        int i4 = z2 ? -1 : 1;
        for (int i5 = 0; i5 < this.f2764C && i3 >= 0 && i3 < i2; i5++) {
            c0949n.m2453a(i3, 0);
            i3 += i4;
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: j */
    public final int mo1869j(C0923W c0923w) {
        return m1834C0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: k */
    public int mo1818k(C0923W c0923w) {
        return m1835D0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: l */
    public int mo1820l(C0923W c0923w) {
        return m1836E0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: m */
    public final int mo1870m(C0923W c0923w) {
        return m1834C0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: m0 */
    public int mo1822m0(int i2, C0917P c0917p, C0923W c0923w) {
        if (this.f2766p == 1) {
            return 0;
        }
        return m1856Y0(i2, c0917p, c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: n */
    public int mo1824n(C0923W c0923w) {
        return m1835D0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: n0 */
    public final void mo1871n0(int i2) {
        this.f2774x = i2;
        this.f2775y = Integer.MIN_VALUE;
        C0957v c0957v = this.f2776z;
        if (c0957v != null) {
            c0957v.f4010a = -1;
        }
        m2366l0();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: o */
    public int mo1825o(C0923W c0923w) {
        return m1836E0(c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: o0 */
    public int mo1826o0(int i2, C0917P c0917p, C0923W c0923w) {
        if (this.f2766p == 0) {
            return 0;
        }
        return m1856Y0(i2, c0917p, c0923w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: q */
    public final View mo1872q(int i2) {
        int iM2374v = m2374v();
        if (iM2374v == 0) {
            return null;
        }
        int iM2346H = i2 - AbstractC0911J.m2346H(m2372u(0));
        if (iM2346H >= 0 && iM2346H < iM2374v) {
            View viewM2372u = m2372u(iM2346H);
            if (AbstractC0911J.m2346H(viewM2372u) == i2) {
                return viewM2372u;
            }
        }
        return super.mo1872q(i2);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: r */
    public C0912K mo1827r() {
        return new C0912K(-2, -2);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: v0 */
    public final boolean mo1873v0() {
        if (this.f3764m != 1073741824 && this.f3763l != 1073741824) {
            int iM2374v = m2374v();
            for (int i2 = 0; i2 < iM2374v; i2++) {
                ViewGroup.LayoutParams layoutParams = m2372u(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: x0 */
    public void mo1874x0(RecyclerView recyclerView, int i2) {
        C0958w c0958w = new C0958w(recyclerView.getContext());
        c0958w.f4013a = i2;
        m2376y0(c0958w);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: z0 */
    public boolean mo1832z0() {
        return this.f2776z == null && this.f2769s == this.f2772v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f2766p = 1;
        this.f2770t = false;
        this.f2771u = false;
        this.f2772v = false;
        this.f2773w = true;
        this.f2774x = -1;
        this.f2775y = Integer.MIN_VALUE;
        this.f2776z = null;
        this.f2762A = new C0954s();
        this.f2763B = new C0955t();
        this.f2764C = 2;
        this.f2765D = new int[2];
        C0910I c0910iM2347I = AbstractC0911J.m2347I(context, attributeSet, i2, i3);
        m1857Z0(c0910iM2347I.f3748a);
        boolean z2 = c0910iM2347I.f3750c;
        mo1860c(null);
        if (z2 != this.f2770t) {
            this.f2770t = z2;
            m2366l0();
        }
        mo1808a1(c0910iM2347I.f3751d);
    }
}
