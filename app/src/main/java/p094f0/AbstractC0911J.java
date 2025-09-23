package p094f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002A1.C0019a;
import p002A1.C0027i;
import p027J1.C0219a;
import p028K.AbstractC0241P;
import p031L.C0340j;
import p031L.C0341k;
import p091e0.AbstractC0894a;

/* renamed from: f0.J */
/* loaded from: classes.dex */
public abstract class AbstractC0911J {

    /* renamed from: a */
    public C0027i f3752a;

    /* renamed from: b */
    public RecyclerView f3753b;

    /* renamed from: c */
    public final C0019a f3754c;

    /* renamed from: d */
    public final C0019a f3755d;

    /* renamed from: e */
    public C0958w f3756e;

    /* renamed from: f */
    public boolean f3757f;

    /* renamed from: g */
    public boolean f3758g;

    /* renamed from: h */
    public final boolean f3759h;

    /* renamed from: i */
    public final boolean f3760i;

    /* renamed from: j */
    public int f3761j;

    /* renamed from: k */
    public boolean f3762k;

    /* renamed from: l */
    public int f3763l;

    /* renamed from: m */
    public int f3764m;

    /* renamed from: n */
    public int f3765n;

    /* renamed from: o */
    public int f3766o;

    public AbstractC0911J() {
        C0909H c0909h = new C0909H(this, 0);
        C0909H c0909h2 = new C0909H(this, 1);
        this.f3754c = new C0019a(c0909h);
        this.f3755d = new C0019a(c0909h2);
        this.f3757f = false;
        this.f3758g = false;
        this.f3759h = true;
        this.f3760i = true;
    }

    /* renamed from: A */
    public static int m2345A(View view) {
        Rect rect = ((C0912K) view.getLayoutParams()).f3768b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: H */
    public static int m2346H(View view) {
        return ((C0912K) view.getLayoutParams()).f3767a.m2395b();
    }

    /* renamed from: I */
    public static C0910I m2347I(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0910I c0910i = new C0910I();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0894a.f3721a, i2, i3);
        c0910i.f3748a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0910i.f3749b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0910i.f3750c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0910i.f3751d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0910i;
    }

    /* renamed from: M */
    public static boolean m2348M(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    /* renamed from: N */
    public static void m2349N(View view, int i2, int i3, int i4, int i5) {
        C0912K c0912k = (C0912K) view.getLayoutParams();
        Rect rect = c0912k.f3768b;
        view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) c0912k).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) c0912k).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) c0912k).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0912k).bottomMargin);
    }

    /* renamed from: g */
    public static int m2350g(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m2351w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.AbstractC0911J.m2351w(boolean, int, int, int, int):int");
    }

    /* renamed from: z */
    public static int m2352z(View view) {
        Rect rect = ((C0912K) view.getLayoutParams()).f3768b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: B */
    public final int m2353B() {
        RecyclerView recyclerView = this.f3753b;
        AbstractC0903B adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo188a();
        }
        return 0;
    }

    /* renamed from: C */
    public final int m2354C() {
        RecyclerView recyclerView = this.f3753b;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        return recyclerView.getLayoutDirection();
    }

    /* renamed from: D */
    public final int m2355D() {
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: E */
    public final int m2356E() {
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: F */
    public final int m2357F() {
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: G */
    public final int m2358G() {
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: J */
    public int mo1797J(C0917P c0917p, C0923W c0923w) {
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView == null || recyclerView.f2825l == null || !mo1865e()) {
            return 1;
        }
        return this.f3753b.f2825l.mo188a();
    }

    /* renamed from: K */
    public final void m2359K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C0912K) view.getLayoutParams()).f3768b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3753b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3753b.f2823k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: L */
    public abstract boolean mo1843L();

    /* renamed from: O */
    public void mo1947O(int i2) {
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView != null) {
            int iM142z = recyclerView.f2811e.m142z();
            for (int i3 = 0; i3 < iM142z; i3++) {
                recyclerView.f2811e.m141y(i3).offsetLeftAndRight(i2);
            }
        }
    }

    /* renamed from: P */
    public void mo1949P(int i2) {
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView != null) {
            int iM142z = recyclerView.f2811e.m142z();
            for (int i3 = 0; i3 < iM142z; i3++) {
                recyclerView.f2811e.m141y(i3).offsetTopAndBottom(i2);
            }
        }
    }

    /* renamed from: Q */
    public void mo2071Q(RecyclerView recyclerView) {
    }

    /* renamed from: R */
    public abstract void mo1849R(RecyclerView recyclerView);

    /* renamed from: S */
    public abstract View mo1799S(View view, int i2, C0917P c0917p, C0923W c0923w);

    /* renamed from: T */
    public void mo1852T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3753b;
        C0917P c0917p = recyclerView.f2805b;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3753b.canScrollVertically(-1) && !this.f3753b.canScrollHorizontally(-1) && !this.f3753b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0903B abstractC0903B = this.f3753b.f2825l;
        if (abstractC0903B != null) {
            accessibilityEvent.setItemCount(abstractC0903B.mo188a());
        }
    }

    /* renamed from: U */
    public final void m2360U(View view, C0341k c0341k) {
        AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(view);
        if (abstractC0926ZM1876I == null || abstractC0926ZM1876I.m2401h() || ((ArrayList) this.f3752a.f67d).contains(abstractC0926ZM1876I.f3815a)) {
            return;
        }
        RecyclerView recyclerView = this.f3753b;
        mo1802V(recyclerView.f2805b, recyclerView.f2812e0, view, c0341k);
    }

    /* renamed from: V */
    public void mo1802V(C0917P c0917p, C0923W c0923w, View view, C0341k c0341k) {
        c0341k.m930j(C0340j.m920a(mo1865e() ? m2346H(view) : 0, 1, mo1862d() ? m2346H(view) : 0, 1, false, false));
    }

    /* renamed from: W */
    public void mo1803W(int i2, int i3) {
    }

    /* renamed from: X */
    public void mo1804X() {
    }

    /* renamed from: Y */
    public void mo1805Y(int i2, int i3) {
    }

    /* renamed from: Z */
    public void mo1806Z(int i2, int i3) {
    }

    /* renamed from: a0 */
    public void mo1807a0(int i2, int i3) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2361b(android.view.View r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.AbstractC0911J.m2361b(android.view.View, int, boolean):void");
    }

    /* renamed from: b0 */
    public abstract void mo1809b0(C0917P c0917p, C0923W c0923w);

    /* renamed from: c */
    public void mo1860c(String str) {
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView != null) {
            recyclerView.m1915i(str);
        }
    }

    /* renamed from: c0 */
    public abstract void mo1810c0(C0923W c0923w);

    /* renamed from: d */
    public abstract boolean mo1862d();

    /* renamed from: d0 */
    public void mo1863d0(Parcelable parcelable) {
    }

    /* renamed from: e */
    public abstract boolean mo1865e();

    /* renamed from: e0 */
    public Parcelable mo1866e0() {
        return null;
    }

    /* renamed from: f */
    public boolean mo1812f(C0912K c0912k) {
        return c0912k != null;
    }

    /* renamed from: f0 */
    public void mo1963f0(int i2) {
    }

    /* renamed from: g0 */
    public final void m2362g0(C0917P c0917p) {
        for (int iM2374v = m2374v() - 1; iM2374v >= 0; iM2374v--) {
            if (!RecyclerView.m1876I(m2372u(iM2374v)).m2408o()) {
                View viewM2372u = m2372u(iM2374v);
                m2365j0(iM2374v);
                c0917p.m2383f(viewM2372u);
            }
        }
    }

    /* renamed from: h */
    public void mo1867h(int i2, int i3, C0923W c0923w, C0949n c0949n) {
    }

    /* renamed from: h0 */
    public final void m2363h0(C0917P c0917p) {
        ArrayList arrayList;
        int size = c0917p.f3777a.size();
        int i2 = size - 1;
        while (true) {
            arrayList = c0917p.f3777a;
            if (i2 < 0) {
                break;
            }
            View view = ((AbstractC0926Z) arrayList.get(i2)).f3815a;
            AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(view);
            if (!abstractC0926ZM1876I.m2408o()) {
                abstractC0926ZM1876I.m2407n(false);
                if (abstractC0926ZM1876I.m2403j()) {
                    this.f3753b.removeDetachedView(view, false);
                }
                AbstractC0907F abstractC0907F = this.f3753b.f2789J;
                if (abstractC0907F != null) {
                    abstractC0907F.mo2337d(abstractC0926ZM1876I);
                }
                abstractC0926ZM1876I.m2407n(true);
                AbstractC0926Z abstractC0926ZM1876I2 = RecyclerView.m1876I(view);
                abstractC0926ZM1876I2.f3828n = null;
                abstractC0926ZM1876I2.f3829o = false;
                abstractC0926ZM1876I2.f3824j &= -33;
                c0917p.m2384g(abstractC0926ZM1876I2);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0917p.f3778b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3753b.invalidate();
        }
    }

    /* renamed from: i */
    public void mo1868i(int i2, C0949n c0949n) {
    }

    /* renamed from: i0 */
    public final void m2364i0(View view, C0917P c0917p) {
        C0027i c0027i = this.f3752a;
        C0902A c0902a = (C0902A) c0027i.f65b;
        int iIndexOfChild = c0902a.f3737a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C0219a) c0027i.f66c).m605g(iIndexOfChild)) {
                c0027i.m116T(view);
            }
            c0902a.m2330h(iIndexOfChild);
        }
        c0917p.m2383f(view);
    }

    /* renamed from: j */
    public abstract int mo1869j(C0923W c0923w);

    /* renamed from: j0 */
    public final void m2365j0(int i2) {
        if (m2372u(i2) != null) {
            C0027i c0027i = this.f3752a;
            int iM104F = c0027i.m104F(i2);
            C0902A c0902a = (C0902A) c0027i.f65b;
            View childAt = c0902a.f3737a.getChildAt(iM104F);
            if (childAt == null) {
                return;
            }
            if (((C0219a) c0027i.f66c).m605g(iM104F)) {
                c0027i.m116T(childAt);
            }
            c0902a.m2330h(iM104F);
        }
    }

    /* renamed from: k */
    public abstract int mo1818k(C0923W c0923w);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2072k0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.m2356E()
            int r1 = r8.m2358G()
            int r2 = r8.f3765n
            int r3 = r8.m2357F()
            int r2 = r2 - r3
            int r3 = r8.f3766o
            int r4 = r8.m2355D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.m2354C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.m2356E()
            int r2 = r8.m2358G()
            int r3 = r8.f3765n
            int r4 = r8.m2357F()
            int r3 = r3 - r4
            int r4 = r8.f3766o
            int r5 = r8.m2355D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3753b
            android.graphics.Rect r5 = r5.f2819i
            r8.mo2073y(r5, r13)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.m1908c0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.AbstractC0911J.mo2072k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* renamed from: l */
    public abstract int mo1820l(C0923W c0923w);

    /* renamed from: l0 */
    public final void m2366l0() {
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: m */
    public abstract int mo1870m(C0923W c0923w);

    /* renamed from: m0 */
    public abstract int mo1822m0(int i2, C0917P c0917p, C0923W c0923w);

    /* renamed from: n */
    public abstract int mo1824n(C0923W c0923w);

    /* renamed from: n0 */
    public abstract void mo1871n0(int i2);

    /* renamed from: o */
    public abstract int mo1825o(C0923W c0923w);

    /* renamed from: o0 */
    public abstract int mo1826o0(int i2, C0917P c0917p, C0923W c0923w);

    /* renamed from: p */
    public final void m2367p(C0917P c0917p) {
        for (int iM2374v = m2374v() - 1; iM2374v >= 0; iM2374v--) {
            View viewM2372u = m2372u(iM2374v);
            AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(viewM2372u);
            if (!abstractC0926ZM1876I.m2408o()) {
                if (!abstractC0926ZM1876I.m2399f() || abstractC0926ZM1876I.m2401h() || this.f3753b.f2825l.f3739b) {
                    m2372u(iM2374v);
                    this.f3752a.m136t(iM2374v);
                    c0917p.m2385h(viewM2372u);
                    this.f3753b.f2813f.m63I(abstractC0926ZM1876I);
                } else {
                    m2365j0(iM2374v);
                    c0917p.m2384g(abstractC0926ZM1876I);
                }
            }
        }
    }

    /* renamed from: p0 */
    public final void m2368p0(RecyclerView recyclerView) {
        m2369q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: q */
    public View mo1872q(int i2) {
        int iM2374v = m2374v();
        for (int i3 = 0; i3 < iM2374v; i3++) {
            View viewM2372u = m2372u(i3);
            AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(viewM2372u);
            if (abstractC0926ZM1876I != null && abstractC0926ZM1876I.m2395b() == i2 && !abstractC0926ZM1876I.m2408o() && (this.f3753b.f2812e0.f3799g || !abstractC0926ZM1876I.m2401h())) {
                return viewM2372u;
            }
        }
        return null;
    }

    /* renamed from: q0 */
    public final void m2369q0(int i2, int i3) {
        this.f3765n = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.f3763l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f2777u0;
        }
        this.f3766o = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.f3764m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f2777u0;
        }
    }

    /* renamed from: r */
    public abstract C0912K mo1827r();

    /* renamed from: r0 */
    public void mo1828r0(Rect rect, int i2, int i3) {
        int iM2357F = m2357F() + m2356E() + rect.width();
        int iM2355D = m2355D() + m2358G() + rect.height();
        RecyclerView recyclerView = this.f3753b;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        this.f3753b.setMeasuredDimension(m2350g(i2, iM2357F, recyclerView.getMinimumWidth()), m2350g(i3, iM2355D, this.f3753b.getMinimumHeight()));
    }

    /* renamed from: s */
    public C0912K mo1829s(Context context, AttributeSet attributeSet) {
        return new C0912K(context, attributeSet);
    }

    /* renamed from: s0 */
    public final void m2370s0(int i2, int i3) {
        int iM2374v = m2374v();
        if (iM2374v == 0) {
            this.f3753b.m1919n(i2, i3);
            return;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < iM2374v; i8++) {
            View viewM2372u = m2372u(i8);
            Rect rect = this.f3753b.f2819i;
            mo2073y(rect, viewM2372u);
            int i9 = rect.left;
            if (i9 < i7) {
                i7 = i9;
            }
            int i10 = rect.right;
            if (i10 > i4) {
                i4 = i10;
            }
            int i11 = rect.top;
            if (i11 < i5) {
                i5 = i11;
            }
            int i12 = rect.bottom;
            if (i12 > i6) {
                i6 = i12;
            }
        }
        this.f3753b.f2819i.set(i7, i5, i4, i6);
        mo1828r0(this.f3753b.f2819i, i2, i3);
    }

    /* renamed from: t */
    public C0912K mo1830t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0912K ? new C0912K((C0912K) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0912K((ViewGroup.MarginLayoutParams) layoutParams) : new C0912K(layoutParams);
    }

    /* renamed from: t0 */
    public final void m2371t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3753b = null;
            this.f3752a = null;
            this.f3765n = 0;
            this.f3766o = 0;
        } else {
            this.f3753b = recyclerView;
            this.f3752a = recyclerView.f2811e;
            this.f3765n = recyclerView.getWidth();
            this.f3766o = recyclerView.getHeight();
        }
        this.f3763l = 1073741824;
        this.f3764m = 1073741824;
    }

    /* renamed from: u */
    public final View m2372u(int i2) {
        C0027i c0027i = this.f3752a;
        if (c0027i != null) {
            return c0027i.m141y(i2);
        }
        return null;
    }

    /* renamed from: u0 */
    public final boolean m2373u0(View view, int i2, int i3, C0912K c0912k) {
        return (!view.isLayoutRequested() && this.f3759h && m2348M(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) c0912k).width) && m2348M(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) c0912k).height)) ? false : true;
    }

    /* renamed from: v */
    public final int m2374v() {
        C0027i c0027i = this.f3752a;
        if (c0027i != null) {
            return c0027i.m142z();
        }
        return 0;
    }

    /* renamed from: v0 */
    public boolean mo1873v0() {
        return false;
    }

    /* renamed from: w0 */
    public final boolean m2375w0(View view, int i2, int i3, C0912K c0912k) {
        return (this.f3759h && m2348M(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) c0912k).width) && m2348M(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) c0912k).height)) ? false : true;
    }

    /* renamed from: x */
    public int mo1831x(C0917P c0917p, C0923W c0923w) {
        RecyclerView recyclerView = this.f3753b;
        if (recyclerView == null || recyclerView.f2825l == null || !mo1862d()) {
            return 1;
        }
        return this.f3753b.f2825l.mo188a();
    }

    /* renamed from: x0 */
    public abstract void mo1874x0(RecyclerView recyclerView, int i2);

    /* renamed from: y */
    public void mo2073y(Rect rect, View view) {
        RecyclerView.m1877J(rect, view);
    }

    /* renamed from: y0 */
    public final void m2376y0(C0958w c0958w) {
        C0958w c0958w2 = this.f3756e;
        if (c0958w2 != null && c0958w != c0958w2 && c0958w2.f4017e) {
            c0958w2.m2466i();
        }
        this.f3756e = c0958w;
        RecyclerView recyclerView = this.f3753b;
        RunnableC0925Y runnableC0925Y = recyclerView.f2806b0;
        runnableC0925Y.f3813g.removeCallbacks(runnableC0925Y);
        runnableC0925Y.f3809c.abortAnimation();
        c0958w.f4014b = recyclerView;
        c0958w.f4015c = this;
        int i2 = c0958w.f4013a;
        if (i2 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f2812e0.f3793a = i2;
        c0958w.f4017e = true;
        c0958w.f4016d = true;
        c0958w.f4018f = recyclerView.f2827m.mo1872q(i2);
        c0958w.f4014b.f2806b0.m2392a();
    }

    /* renamed from: z0 */
    public boolean mo1832z0() {
        return false;
    }
}
