package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import p002A1.RunnableC0030l;
import p006C.AbstractC0075g;
import p013E0.C0139b;
import p013E0.C0140c;
import p013E0.C0141d;
import p013E0.C0143f;
import p094f0.AbstractC0911J;
import p094f0.C0912K;
import p094f0.C0917P;
import p094f0.C0923W;
import p094f0.InterfaceC0922V;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0911J implements InterfaceC0922V {

    /* renamed from: p */
    public final C0143f f3135p;

    /* renamed from: q */
    public C0141d f3136q;

    /* renamed from: r */
    public final View.OnLayoutChangeListener f3137r;

    public CarouselLayoutManager() {
        C0143f c0143f = new C0143f();
        new C0140c();
        this.f3137r = new View.OnLayoutChangeListener() { // from class: E0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager carouselLayoutManager = this.f483a;
                if (i2 == i6 && i3 == i7 && i4 == i8 && i5 == i9) {
                    return;
                }
                view.post(new RunnableC0030l(1, carouselLayoutManager));
            }
        };
        this.f3135p = c0143f;
        m2366l0();
        m2070C0(0);
    }

    /* renamed from: A0 */
    public final boolean m2068A0() {
        return this.f3136q.f488a == 0;
    }

    /* renamed from: B0 */
    public final boolean m2069B0() {
        return m2068A0() && m2354C() == 1;
    }

    /* renamed from: C0 */
    public final void m2070C0(int i2) {
        C0141d c0141d;
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(AbstractC0075g.m236e("invalid orientation:", i2));
        }
        mo1860c(null);
        C0141d c0141d2 = this.f3136q;
        if (c0141d2 == null || i2 != c0141d2.f488a) {
            if (i2 == 0) {
                c0141d = new C0141d(this, 1);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0141d = new C0141d(this, 0);
            }
            this.f3136q = c0141d;
            m2366l0();
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: L */
    public final boolean mo1843L() {
        return true;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: Q */
    public final void mo2071Q(RecyclerView recyclerView) throws Resources.NotFoundException {
        C0143f c0143f = this.f3135p;
        Context context = recyclerView.getContext();
        float dimension = c0143f.f491a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0143f.f491a = dimension;
        float dimension2 = c0143f.f492b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0143f.f492b = dimension2;
        m2366l0();
        recyclerView.addOnLayoutChangeListener(this.f3137r);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: R */
    public final void mo1849R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f3137r);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    @Override // p094f0.AbstractC0911J
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1799S(android.view.View r4, int r5, p094f0.C0917P r6, p094f0.C0923W r7) {
        /*
            r3 = this;
            int r6 = r3.m2374v()
            if (r6 != 0) goto L8
            goto L83
        L8:
            E0.d r6 = r3.f3136q
            int r6 = r6.f488a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L33
            r2 = 2
            if (r5 == r2) goto L29
            r2 = 17
            if (r5 == r2) goto L38
            r2 = 33
            if (r5 == r2) goto L35
            r2 = 66
            if (r5 == r2) goto L2b
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L27
        L25:
            r5 = r7
            goto L41
        L27:
            if (r6 != r1) goto L25
        L29:
            r5 = r1
            goto L41
        L2b:
            if (r6 != 0) goto L25
            boolean r5 = r3.m2069B0()
            if (r5 == 0) goto L29
        L33:
            r5 = r0
            goto L41
        L35:
            if (r6 != r1) goto L25
            goto L33
        L38:
            if (r6 != 0) goto L25
            boolean r5 = r3.m2069B0()
            if (r5 == 0) goto L33
            goto L29
        L41:
            if (r5 != r7) goto L44
            goto L83
        L44:
            r6 = 0
            if (r5 != r0) goto L78
            int r4 = p094f0.AbstractC0911J.m2346H(r4)
            if (r4 != 0) goto L4e
            goto L83
        L4e:
            android.view.View r4 = r3.m2372u(r6)
            int r4 = p094f0.AbstractC0911J.m2346H(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L67
            int r5 = r3.m2353B()
            if (r4 < r5) goto L60
            goto L67
        L60:
            E0.d r4 = r3.f3136q
            r4.m385a()
            r4 = 0
            throw r4
        L67:
            boolean r4 = r3.m2069B0()
            if (r4 == 0) goto L73
            int r4 = r3.m2374v()
            int r6 = r4 + (-1)
        L73:
            android.view.View r4 = r3.m2372u(r6)
            return r4
        L78:
            int r4 = p094f0.AbstractC0911J.m2346H(r4)
            int r5 = r3.m2353B()
            int r5 = r5 - r1
            if (r4 != r5) goto L85
        L83:
            r4 = 0
            return r4
        L85:
            int r4 = r3.m2374v()
            int r4 = r4 - r1
            android.view.View r4 = r3.m2372u(r4)
            int r4 = p094f0.AbstractC0911J.m2346H(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto La3
            int r5 = r3.m2353B()
            if (r4 < r5) goto L9c
            goto La3
        L9c:
            E0.d r4 = r3.f3136q
            r4.m385a()
            r4 = 0
            throw r4
        La3:
            boolean r4 = r3.m2069B0()
            if (r4 == 0) goto Laa
            goto Lb0
        Laa:
            int r4 = r3.m2374v()
            int r6 = r4 + (-1)
        Lb0:
            android.view.View r4 = r3.m2372u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.mo1799S(android.view.View, int, f0.P, f0.W):android.view.View");
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: T */
    public final void mo1852T(AccessibilityEvent accessibilityEvent) {
        super.mo1852T(accessibilityEvent);
        if (m2374v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0911J.m2346H(m2372u(0)));
            accessibilityEvent.setToIndex(AbstractC0911J.m2346H(m2372u(m2374v() - 1)));
        }
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: W */
    public final void mo1803W(int i2, int i3) {
        m2353B();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: Z */
    public final void mo1806Z(int i2, int i3) {
        m2353B();
    }

    @Override // p094f0.InterfaceC0922V
    /* renamed from: a */
    public final PointF mo1858a(int i2) {
        return null;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: b0 */
    public final void mo1809b0(C0917P c0917p, C0923W c0923w) {
        if (c0923w.m2391b() > 0) {
            if ((m2068A0() ? this.f3765n : this.f3766o) > 0.0f) {
                m2069B0();
                View view = c0917p.m2386i(0, Long.MAX_VALUE).f3815a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m2362g0(c0917p);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: c0 */
    public final void mo1810c0(C0923W c0923w) {
        if (m2374v() == 0) {
            return;
        }
        AbstractC0911J.m2346H(m2372u(0));
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: d */
    public final boolean mo1862d() {
        return m2068A0();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: e */
    public final boolean mo1865e() {
        return !m2068A0();
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: j */
    public final int mo1869j(C0923W c0923w) {
        m2374v();
        return 0;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: k */
    public final int mo1818k(C0923W c0923w) {
        return 0;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: k0 */
    public final boolean mo2072k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: l */
    public final int mo1820l(C0923W c0923w) {
        return 0;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: m */
    public final int mo1870m(C0923W c0923w) {
        m2374v();
        return 0;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: m0 */
    public final int mo1822m0(int i2, C0917P c0917p, C0923W c0923w) {
        if (!m2068A0() || m2374v() == 0 || i2 == 0) {
            return 0;
        }
        View view = c0917p.m2386i(0, Long.MAX_VALUE).f3815a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: n */
    public final int mo1824n(C0923W c0923w) {
        return 0;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: n0 */
    public final void mo1871n0(int i2) {
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: o */
    public final int mo1825o(C0923W c0923w) {
        return 0;
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: o0 */
    public final int mo1826o0(int i2, C0917P c0917p, C0923W c0923w) {
        if (!mo1865e() || m2374v() == 0 || i2 == 0) {
            return 0;
        }
        View view = c0917p.m2386i(0, Long.MAX_VALUE).f3815a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: r */
    public final C0912K mo1827r() {
        return new C0912K(-2, -2);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: x0 */
    public final void mo1874x0(RecyclerView recyclerView, int i2) {
        C0139b c0139b = new C0139b(this, recyclerView.getContext(), 0);
        c0139b.f4013a = i2;
        m2376y0(c0139b);
    }

    @Override // p094f0.AbstractC0911J
    /* renamed from: y */
    public final void mo2073y(Rect rect, View view) {
        RecyclerView.m1877J(rect, view);
        rect.centerY();
        if (m2068A0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        new C0140c();
        this.f3137r = new View.OnLayoutChangeListener() { // from class: E0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i32, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager carouselLayoutManager = this.f483a;
                if (i22 == i6 && i32 == i7 && i4 == i8 && i5 == i9) {
                    return;
                }
                view.post(new RunnableC0030l(1, carouselLayoutManager));
            }
        };
        this.f3135p = new C0143f();
        m2366l0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1395a.f6033b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m2366l0();
            m2070C0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
