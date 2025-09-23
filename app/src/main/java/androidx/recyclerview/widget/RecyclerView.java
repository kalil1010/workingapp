package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002A1.C0019a;
import p002A1.C0027i;
import p017G.AbstractC0160i;
import p027J1.C0219a;
import p028K.AbstractC0230E;
import p028K.AbstractC0232G;
import p028K.AbstractC0241P;
import p028K.AbstractC0242Q;
import p028K.AbstractC0245U;
import p028K.C0275m;
import p028K.C0281p;
import p054T.InterpolatorC0505d;
import p091e0.AbstractC0894a;
import p094f0.AbstractC0903B;
import p094f0.AbstractC0907F;
import p094f0.AbstractC0908G;
import p094f0.AbstractC0911J;
import p094f0.AbstractC0913L;
import p094f0.AbstractC0914M;
import p094f0.AbstractC0924X;
import p094f0.AbstractC0926Z;
import p094f0.C0902A;
import p094f0.C0906E;
import p094f0.C0912K;
import p094f0.C0915N;
import p094f0.C0916O;
import p094f0.C0917P;
import p094f0.C0919S;
import p094f0.C0920T;
import p094f0.C0923W;
import p094f0.C0927a;
import p094f0.C0928a0;
import p094f0.C0929b;
import p094f0.C0943i;
import p094f0.C0944i0;
import p094f0.C0948m;
import p094f0.C0949n;
import p094f0.C0958w;
import p094f0.InterfaceC0905D;
import p094f0.InterfaceC0918Q;
import p094f0.RunnableC0925Y;
import p094f0.RunnableC0951p;
import p094f0.RunnableC0961z;
import p119o.C1243e;
import p119o.C1249k;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: u0 */
    public static final int[] f2777u0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: v0 */
    public static final Class[] f2778v0;

    /* renamed from: w0 */
    public static final InterpolatorC0505d f2779w0;

    /* renamed from: A */
    public boolean f2780A;

    /* renamed from: B */
    public boolean f2781B;

    /* renamed from: C */
    public int f2782C;

    /* renamed from: D */
    public int f2783D;

    /* renamed from: E */
    public C0906E f2784E;

    /* renamed from: F */
    public EdgeEffect f2785F;

    /* renamed from: G */
    public EdgeEffect f2786G;

    /* renamed from: H */
    public EdgeEffect f2787H;

    /* renamed from: I */
    public EdgeEffect f2788I;

    /* renamed from: J */
    public AbstractC0907F f2789J;

    /* renamed from: K */
    public int f2790K;

    /* renamed from: L */
    public int f2791L;

    /* renamed from: M */
    public VelocityTracker f2792M;

    /* renamed from: N */
    public int f2793N;

    /* renamed from: O */
    public int f2794O;

    /* renamed from: P */
    public int f2795P;

    /* renamed from: Q */
    public int f2796Q;

    /* renamed from: R */
    public int f2797R;

    /* renamed from: S */
    public AbstractC0913L f2798S;

    /* renamed from: T */
    public final int f2799T;

    /* renamed from: U */
    public final int f2800U;

    /* renamed from: V */
    public final float f2801V;

    /* renamed from: W */
    public final float f2802W;

    /* renamed from: a */
    public final C0919S f2803a;

    /* renamed from: a0 */
    public boolean f2804a0;

    /* renamed from: b */
    public final C0917P f2805b;

    /* renamed from: b0 */
    public final RunnableC0925Y f2806b0;

    /* renamed from: c */
    public C0920T f2807c;

    /* renamed from: c0 */
    public RunnableC0951p f2808c0;

    /* renamed from: d */
    public final C0929b f2809d;

    /* renamed from: d0 */
    public final C0949n f2810d0;

    /* renamed from: e */
    public final C0027i f2811e;

    /* renamed from: e0 */
    public final C0923W f2812e0;

    /* renamed from: f */
    public final C0019a f2813f;

    /* renamed from: f0 */
    public AbstractC0914M f2814f0;

    /* renamed from: g */
    public boolean f2815g;

    /* renamed from: g0 */
    public ArrayList f2816g0;

    /* renamed from: h */
    public final RunnableC0961z f2817h;

    /* renamed from: h0 */
    public boolean f2818h0;

    /* renamed from: i */
    public final Rect f2819i;

    /* renamed from: i0 */
    public boolean f2820i0;

    /* renamed from: j */
    public final Rect f2821j;

    /* renamed from: j0 */
    public final C0902A f2822j0;

    /* renamed from: k */
    public final RectF f2823k;

    /* renamed from: k0 */
    public boolean f2824k0;

    /* renamed from: l */
    public AbstractC0903B f2825l;

    /* renamed from: l0 */
    public C0928a0 f2826l0;

    /* renamed from: m */
    public AbstractC0911J f2827m;

    /* renamed from: m0 */
    public final int[] f2828m0;

    /* renamed from: n */
    public final ArrayList f2829n;

    /* renamed from: n0 */
    public C0275m f2830n0;

    /* renamed from: o */
    public final ArrayList f2831o;

    /* renamed from: o0 */
    public final int[] f2832o0;

    /* renamed from: p */
    public C0948m f2833p;

    /* renamed from: p0 */
    public final int[] f2834p0;

    /* renamed from: q */
    public boolean f2835q;

    /* renamed from: q0 */
    public final int[] f2836q0;

    /* renamed from: r */
    public boolean f2837r;

    /* renamed from: r0 */
    public final ArrayList f2838r0;

    /* renamed from: s */
    public boolean f2839s;

    /* renamed from: s0 */
    public final RunnableC0961z f2840s0;

    /* renamed from: t */
    public int f2841t;

    /* renamed from: t0 */
    public final C0902A f2842t0;

    /* renamed from: u */
    public boolean f2843u;

    /* renamed from: v */
    public boolean f2844v;

    /* renamed from: w */
    public boolean f2845w;

    /* renamed from: x */
    public int f2846x;

    /* renamed from: y */
    public boolean f2847y;

    /* renamed from: z */
    public final AccessibilityManager f2848z;

    static {
        Class cls = Integer.TYPE;
        f2778v0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2779w0 = new InterpolatorC0505d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.recyclerViewStyle);
    }

    /* renamed from: D */
    public static RecyclerView m1875D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewM1875D = m1875D(viewGroup.getChildAt(i2));
            if (recyclerViewM1875D != null) {
                return recyclerViewM1875D;
            }
        }
        return null;
    }

    /* renamed from: I */
    public static AbstractC0926Z m1876I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0912K) view.getLayoutParams()).f3767a;
    }

    /* renamed from: J */
    public static void m1877J(Rect rect, View view) {
        C0912K c0912k = (C0912K) view.getLayoutParams();
        Rect rect2 = c0912k.f3768b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0912k).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0912k).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0912k).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0912k).bottomMargin);
    }

    private C0275m getScrollingChildHelper() {
        if (this.f2830n0 == null) {
            this.f2830n0 = new C0275m(this);
        }
        return this.f2830n0;
    }

    /* renamed from: j */
    public static void m1882j(AbstractC0926Z abstractC0926Z) {
        WeakReference weakReference = abstractC0926Z.f3816b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC0926Z.f3815a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0926Z.f3816b = null;
        }
    }

    /* renamed from: A */
    public final View m1883A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1884B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f2831o
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            f0.m r5 = (p094f0.C0948m) r5
            int r6 = r5.f3958v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.m2450e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.m2449d(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f3959w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3952p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f3959w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3949m = r6
        L55:
            r5.m2451g(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f2833p = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1884B(android.view.MotionEvent):boolean");
    }

    /* renamed from: C */
    public final void m1885C(int[] iArr) {
        int iM142z = this.f2811e.m142z();
        if (iM142z == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iM142z; i4++) {
            AbstractC0926Z abstractC0926ZM1876I = m1876I(this.f2811e.m141y(i4));
            if (!abstractC0926ZM1876I.m2408o()) {
                int iM2395b = abstractC0926ZM1876I.m2395b();
                if (iM2395b < i2) {
                    i2 = iM2395b;
                }
                if (iM2395b > i3) {
                    i3 = iM2395b;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    /* renamed from: E */
    public final AbstractC0926Z m1886E(int i2) {
        AbstractC0926Z abstractC0926Z = null;
        if (this.f2780A) {
            return null;
        }
        int iM106H = this.f2811e.m106H();
        for (int i3 = 0; i3 < iM106H; i3++) {
            AbstractC0926Z abstractC0926ZM1876I = m1876I(this.f2811e.m105G(i3));
            if (abstractC0926ZM1876I != null && !abstractC0926ZM1876I.m2401h() && m1887F(abstractC0926ZM1876I) == i2) {
                if (!((ArrayList) this.f2811e.f67d).contains(abstractC0926ZM1876I.f3815a)) {
                    return abstractC0926ZM1876I;
                }
                abstractC0926Z = abstractC0926ZM1876I;
            }
        }
        return abstractC0926Z;
    }

    /* renamed from: F */
    public final int m1887F(AbstractC0926Z abstractC0926Z) {
        if (((abstractC0926Z.f3824j & 524) != 0) || !abstractC0926Z.m2398e()) {
            return -1;
        }
        C0929b c0929b = this.f2809d;
        int i2 = abstractC0926Z.f3817c;
        ArrayList arrayList = (ArrayList) c0929b.f3840c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0927a c0927a = (C0927a) arrayList.get(i3);
            int i4 = c0927a.f3833a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = c0927a.f3834b;
                    if (i5 <= i2) {
                        int i6 = c0927a.f3835c;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = c0927a.f3834b;
                    if (i7 == i2) {
                        i2 = c0927a.f3835c;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (c0927a.f3835c <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (c0927a.f3834b <= i2) {
                i2 += c0927a.f3835c;
            }
        }
        return i2;
    }

    /* renamed from: G */
    public final long m1888G(AbstractC0926Z abstractC0926Z) {
        return this.f2825l.f3739b ? abstractC0926Z.f3819e : abstractC0926Z.f3817c;
    }

    /* renamed from: H */
    public final AbstractC0926Z m1889H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1876I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: K */
    public final Rect m1890K(View view) {
        C0912K c0912k = (C0912K) view.getLayoutParams();
        boolean z2 = c0912k.f3769c;
        Rect rect = c0912k.f3768b;
        if (!z2 || (this.f2812e0.f3799g && (c0912k.f3767a.m2404k() || c0912k.f3767a.m2399f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2829n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.f2819i;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0908G) arrayList.get(i2)).mo2340a(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0912k.f3769c = false;
        return rect;
    }

    /* renamed from: L */
    public final boolean m1891L() {
        return !this.f2839s || this.f2780A || this.f2809d.m2419j();
    }

    /* renamed from: M */
    public final boolean m1892M() {
        return this.f2782C > 0;
    }

    /* renamed from: N */
    public final void m1893N(int i2) {
        if (this.f2827m == null) {
            return;
        }
        setScrollState(2);
        this.f2827m.mo1871n0(i2);
        awakenScrollBars();
    }

    /* renamed from: O */
    public final void m1894O() {
        int iM106H = this.f2811e.m106H();
        for (int i2 = 0; i2 < iM106H; i2++) {
            ((C0912K) this.f2811e.m105G(i2).getLayoutParams()).f3769c = true;
        }
        ArrayList arrayList = this.f2805b.f3779c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0912K c0912k = (C0912K) ((AbstractC0926Z) arrayList.get(i3)).f3815a.getLayoutParams();
            if (c0912k != null) {
                c0912k.f3769c = true;
            }
        }
    }

    /* renamed from: P */
    public final void m1895P(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int iM106H = this.f2811e.m106H();
        for (int i5 = 0; i5 < iM106H; i5++) {
            AbstractC0926Z abstractC0926ZM1876I = m1876I(this.f2811e.m105G(i5));
            if (abstractC0926ZM1876I != null && !abstractC0926ZM1876I.m2408o()) {
                int i6 = abstractC0926ZM1876I.f3817c;
                C0923W c0923w = this.f2812e0;
                if (i6 >= i4) {
                    abstractC0926ZM1876I.m2405l(-i3, z2);
                    c0923w.f3798f = true;
                } else if (i6 >= i2) {
                    abstractC0926ZM1876I.m2394a(8);
                    abstractC0926ZM1876I.m2405l(-i3, z2);
                    abstractC0926ZM1876I.f3817c = i2 - 1;
                    c0923w.f3798f = true;
                }
            }
        }
        C0917P c0917p = this.f2805b;
        ArrayList arrayList = c0917p.f3779c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0926Z abstractC0926Z = (AbstractC0926Z) arrayList.get(size);
            if (abstractC0926Z != null) {
                int i7 = abstractC0926Z.f3817c;
                if (i7 >= i4) {
                    abstractC0926Z.m2405l(-i3, z2);
                } else if (i7 >= i2) {
                    abstractC0926Z.m2394a(8);
                    c0917p.m2382e(size);
                }
            }
        }
        requestLayout();
    }

    /* renamed from: Q */
    public final void m1896Q() {
        this.f2782C++;
    }

    /* renamed from: R */
    public final void m1897R(boolean z2) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.f2782C - 1;
        this.f2782C = i3;
        if (i3 < 1) {
            this.f2782C = 0;
            if (z2) {
                int i4 = this.f2846x;
                this.f2846x = 0;
                if (i4 != 0 && (accessibilityManager = this.f2848z) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f2838r0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0926Z abstractC0926Z = (AbstractC0926Z) arrayList.get(size);
                    if (abstractC0926Z.f3815a.getParent() == this && !abstractC0926Z.m2408o() && (i2 = abstractC0926Z.f3831q) != -1) {
                        WeakHashMap weakHashMap = AbstractC0241P.f815a;
                        abstractC0926Z.f3815a.setImportantForAccessibility(i2);
                        abstractC0926Z.f3831q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: S */
    public final void m1898S(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2791L) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f2791L = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f2795P = x2;
            this.f2793N = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f2796Q = y2;
            this.f2794O = y2;
        }
    }

    /* renamed from: T */
    public final void m1899T() {
        if (this.f2824k0 || !this.f2835q) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        postOnAnimation(this.f2840s0);
        this.f2824k0 = true;
    }

    /* renamed from: U */
    public final void m1900U() {
        boolean z2;
        boolean z3 = false;
        if (this.f2780A) {
            C0929b c0929b = this.f2809d;
            c0929b.m2426q((ArrayList) c0929b.f3840c);
            c0929b.m2426q((ArrayList) c0929b.f3841d);
            c0929b.f3838a = 0;
            if (this.f2781B) {
                this.f2827m.mo1804X();
            }
        }
        if (this.f2789J == null || !this.f2827m.mo1832z0()) {
            this.f2809d.m2413d();
        } else {
            this.f2809d.m2425p();
        }
        boolean z4 = this.f2818h0 || this.f2820i0;
        boolean z5 = this.f2839s && this.f2789J != null && ((z2 = this.f2780A) || z4 || this.f2827m.f3757f) && (!z2 || this.f2825l.f3739b);
        C0923W c0923w = this.f2812e0;
        c0923w.f3802j = z5;
        if (z5 && z4 && !this.f2780A && this.f2789J != null && this.f2827m.mo1832z0()) {
            z3 = true;
        }
        c0923w.f3803k = z3;
    }

    /* renamed from: V */
    public final void m1901V(boolean z2) {
        this.f2781B = z2 | this.f2781B;
        this.f2780A = true;
        int iM106H = this.f2811e.m106H();
        for (int i2 = 0; i2 < iM106H; i2++) {
            AbstractC0926Z abstractC0926ZM1876I = m1876I(this.f2811e.m105G(i2));
            if (abstractC0926ZM1876I != null && !abstractC0926ZM1876I.m2408o()) {
                abstractC0926ZM1876I.m2394a(6);
            }
        }
        m1894O();
        C0917P c0917p = this.f2805b;
        ArrayList arrayList = c0917p.f3779c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0926Z abstractC0926Z = (AbstractC0926Z) arrayList.get(i3);
            if (abstractC0926Z != null) {
                abstractC0926Z.m2394a(6);
                abstractC0926Z.m2394a(1024);
            }
        }
        AbstractC0903B abstractC0903B = c0917p.f3784h.f2825l;
        if (abstractC0903B == null || !abstractC0903B.f3739b) {
            c0917p.m2381d();
        }
    }

    /* renamed from: W */
    public final void m1902W(AbstractC0926Z abstractC0926Z, C0281p c0281p) {
        abstractC0926Z.f3824j &= -8193;
        boolean z2 = this.f2812e0.f3800h;
        C0019a c0019a = this.f2813f;
        if (z2 && abstractC0926Z.m2404k() && !abstractC0926Z.m2401h() && !abstractC0926Z.m2408o()) {
            ((C1243e) c0019a.f46b).m2900d(m1888G(abstractC0926Z), abstractC0926Z);
        }
        C1249k c1249k = (C1249k) c0019a.f47c;
        C0944i0 c0944i0M2447a = (C0944i0) c1249k.getOrDefault(abstractC0926Z, null);
        if (c0944i0M2447a == null) {
            c0944i0M2447a = C0944i0.m2447a();
            c1249k.put(abstractC0926Z, c0944i0M2447a);
        }
        c0944i0M2447a.f3924b = c0281p;
        c0944i0M2447a.f3923a |= 4;
    }

    /* renamed from: X */
    public final void m1903X(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2819i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0912K) {
            C0912K c0912k = (C0912K) layoutParams;
            if (!c0912k.f3769c) {
                int i2 = rect.left;
                Rect rect2 = c0912k.f3768b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2827m.mo2072k0(this, view, this.f2819i, !this.f2839s, view2 == null);
    }

    /* renamed from: Y */
    public final void m1904Y() {
        VelocityTracker velocityTracker = this.f2792M;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m1912f0(0);
        EdgeEffect edgeEffect = this.f2785F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f2785F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2786G;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f2786G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2787H;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f2787H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2788I;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f2788I.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1905Z(int r18, int r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1905Z(int, int, android.view.MotionEvent):boolean");
    }

    /* renamed from: a0 */
    public final void m1906a0(int i2, int i3, int[] iArr) {
        AbstractC0926Z abstractC0926Z;
        C0027i c0027i = this.f2811e;
        m1909d0();
        m1896Q();
        int i4 = AbstractC0160i.f538a;
        Trace.beginSection("RV Scroll");
        C0923W c0923w = this.f2812e0;
        m1931z(c0923w);
        C0917P c0917p = this.f2805b;
        int iMo1822m0 = i2 != 0 ? this.f2827m.mo1822m0(i2, c0917p, c0923w) : 0;
        int iMo1826o0 = i3 != 0 ? this.f2827m.mo1826o0(i3, c0917p, c0923w) : 0;
        Trace.endSection();
        int iM142z = c0027i.m142z();
        for (int i5 = 0; i5 < iM142z; i5++) {
            View viewM141y = c0027i.m141y(i5);
            AbstractC0926Z abstractC0926ZM1889H = m1889H(viewM141y);
            if (abstractC0926ZM1889H != null && (abstractC0926Z = abstractC0926ZM1889H.f3823i) != null) {
                int left = viewM141y.getLeft();
                int top = viewM141y.getTop();
                View view = abstractC0926Z.f3815a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1897R(true);
        m1910e0(false);
        if (iArr != null) {
            iArr[0] = iMo1822m0;
            iArr[1] = iMo1826o0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null) {
            abstractC0911J.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    /* renamed from: b0 */
    public final void m1907b0(int i2) {
        C0958w c0958w;
        if (this.f2844v) {
            return;
        }
        setScrollState(0);
        RunnableC0925Y runnableC0925Y = this.f2806b0;
        runnableC0925Y.f3813g.removeCallbacks(runnableC0925Y);
        runnableC0925Y.f3809c.abortAnimation();
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null && (c0958w = abstractC0911J.f3756e) != null) {
            c0958w.m2466i();
        }
        AbstractC0911J abstractC0911J2 = this.f2827m;
        if (abstractC0911J2 == null) {
            return;
        }
        abstractC0911J2.mo1871n0(i2);
        awakenScrollBars();
    }

    /* renamed from: c0 */
    public final void m1908c0(int i2, int i3, boolean z2) {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J == null || this.f2844v) {
            return;
        }
        if (!abstractC0911J.mo1862d()) {
            i2 = 0;
        }
        if (!this.f2827m.mo1865e()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (z2) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().m780g(i4, 1);
        }
        this.f2806b0.m2393b(i2, i3, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0912K) && this.f2827m.mo1812f((C0912K) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null && abstractC0911J.mo1862d()) {
            return this.f2827m.mo1869j(this.f2812e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null && abstractC0911J.mo1862d()) {
            return this.f2827m.mo1818k(this.f2812e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null && abstractC0911J.mo1862d()) {
            return this.f2827m.mo1820l(this.f2812e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null && abstractC0911J.mo1865e()) {
            return this.f2827m.mo1870m(this.f2812e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null && abstractC0911J.mo1865e()) {
            return this.f2827m.mo1824n(this.f2812e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null && abstractC0911J.mo1865e()) {
            return this.f2827m.mo1825o(this.f2812e0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public final void m1909d0() {
        int i2 = this.f2841t + 1;
        this.f2841t = i2;
        if (i2 != 1 || this.f2844v) {
            return;
        }
        this.f2843u = false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return getScrollingChildHelper().m774a(f, f2, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m775b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m776c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().m777d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f2829n;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0908G) arrayList.get(i2)).mo384c(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2785F;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f2815g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2785F;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f2786G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f2815g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2786G;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f2787H;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2815g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2787H;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f2788I;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2815g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2788I;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.f2789J == null || arrayList.size() <= 0 || !this.f2789J.mo2339f()) ? z2 : true) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* renamed from: e0 */
    public final void m1910e0(boolean z2) {
        if (this.f2841t < 1) {
            this.f2841t = 1;
        }
        if (!z2 && !this.f2844v) {
            this.f2843u = false;
        }
        if (this.f2841t == 1) {
            if (z2 && this.f2843u && !this.f2844v && this.f2827m != null && this.f2825l != null) {
                m1920o();
            }
            if (!this.f2844v) {
                this.f2843u = false;
            }
        }
        this.f2841t--;
    }

    /* renamed from: f */
    public final void m1911f(AbstractC0926Z abstractC0926Z) {
        View view = abstractC0926Z.f3815a;
        boolean z2 = view.getParent() == this;
        this.f2805b.m2387j(m1889H(view));
        if (abstractC0926Z.m2403j()) {
            this.f2811e.m133q(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f2811e.m132p(view, -1, true);
            return;
        }
        C0027i c0027i = this.f2811e;
        int iIndexOfChild = ((C0902A) c0027i.f65b).f3737a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C0219a) c0027i.f66c).m607i(iIndexOfChild);
            c0027i.m107I(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: f0 */
    public final void m1912f0(int i2) {
        getScrollingChildHelper().m781h(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public final void m1913g(AbstractC0908G abstractC0908G) {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null) {
            abstractC0911J.mo1860c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2829n;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0908G);
        m1894O();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null) {
            return abstractC0911J.mo1827r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1930y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null) {
            return abstractC0911J.mo1829s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1930y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0903B getAdapter() {
        return this.f2825l;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J == null) {
            return super.getBaseline();
        }
        abstractC0911J.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2815g;
    }

    public C0928a0 getCompatAccessibilityDelegate() {
        return this.f2826l0;
    }

    public C0906E getEdgeEffectFactory() {
        return this.f2784E;
    }

    public AbstractC0907F getItemAnimator() {
        return this.f2789J;
    }

    public int getItemDecorationCount() {
        return this.f2829n.size();
    }

    public AbstractC0911J getLayoutManager() {
        return this.f2827m;
    }

    public int getMaxFlingVelocity() {
        return this.f2800U;
    }

    public int getMinFlingVelocity() {
        return this.f2799T;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0913L getOnFlingListener() {
        return this.f2798S;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2804a0;
    }

    public C0916O getRecycledViewPool() {
        return this.f2805b.m2380c();
    }

    public int getScrollState() {
        return this.f2790K;
    }

    /* renamed from: h */
    public final void m1914h(AbstractC0914M abstractC0914M) {
        if (this.f2816g0 == null) {
            this.f2816g0 = new ArrayList();
        }
        this.f2816g0.add(abstractC0914M);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m779f(0);
    }

    /* renamed from: i */
    public final void m1915i(String str) {
        if (m1892M()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m1930y());
        }
        if (this.f2783D > 0) {
            new IllegalStateException("" + m1930y());
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2835q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2844v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f883d;
    }

    /* renamed from: k */
    public final void m1916k() {
        int iM106H = this.f2811e.m106H();
        for (int i2 = 0; i2 < iM106H; i2++) {
            AbstractC0926Z abstractC0926ZM1876I = m1876I(this.f2811e.m105G(i2));
            if (!abstractC0926ZM1876I.m2408o()) {
                abstractC0926ZM1876I.f3818d = -1;
                abstractC0926ZM1876I.f3821g = -1;
            }
        }
        C0917P c0917p = this.f2805b;
        ArrayList arrayList = c0917p.f3779c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0926Z abstractC0926Z = (AbstractC0926Z) arrayList.get(i3);
            abstractC0926Z.f3818d = -1;
            abstractC0926Z.f3821g = -1;
        }
        ArrayList arrayList2 = c0917p.f3777a;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AbstractC0926Z abstractC0926Z2 = (AbstractC0926Z) arrayList2.get(i4);
            abstractC0926Z2.f3818d = -1;
            abstractC0926Z2.f3821g = -1;
        }
        ArrayList arrayList3 = c0917p.f3778b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                AbstractC0926Z abstractC0926Z3 = (AbstractC0926Z) c0917p.f3778b.get(i5);
                abstractC0926Z3.f3818d = -1;
                abstractC0926Z3.f3821g = -1;
            }
        }
    }

    /* renamed from: l */
    public final void m1917l(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f2785F;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.f2785F.onRelease();
            zIsFinished = this.f2785F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2787H;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f2787H.onRelease();
            zIsFinished |= this.f2787H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2786G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f2786G.onRelease();
            zIsFinished |= this.f2786G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2788I;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f2788I.onRelease();
            zIsFinished |= this.f2788I.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: m */
    public final void m1918m() {
        C0027i c0027i = this.f2811e;
        C0929b c0929b = this.f2809d;
        if (!this.f2839s || this.f2780A) {
            int i2 = AbstractC0160i.f538a;
            Trace.beginSection("RV FullInvalidate");
            m1920o();
            Trace.endSection();
            return;
        }
        if (c0929b.m2419j()) {
            int i3 = c0929b.f3838a;
            if ((i3 & 4) == 0 || (i3 & 11) != 0) {
                if (c0929b.m2419j()) {
                    int i4 = AbstractC0160i.f538a;
                    Trace.beginSection("RV FullInvalidate");
                    m1920o();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i5 = AbstractC0160i.f538a;
            Trace.beginSection("RV PartialInvalidate");
            m1909d0();
            m1896Q();
            c0929b.m2425p();
            if (!this.f2843u) {
                int iM142z = c0027i.m142z();
                int i6 = 0;
                while (true) {
                    if (i6 < iM142z) {
                        AbstractC0926Z abstractC0926ZM1876I = m1876I(c0027i.m141y(i6));
                        if (abstractC0926ZM1876I != null && !abstractC0926ZM1876I.m2408o() && abstractC0926ZM1876I.m2404k()) {
                            m1920o();
                            break;
                        }
                        i6++;
                    } else {
                        c0929b.m2412c();
                        break;
                    }
                }
            }
            m1910e0(true);
            m1897R(true);
            Trace.endSection();
        }
    }

    /* renamed from: n */
    public final void m1919n(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        setMeasuredDimension(AbstractC0911J.m2350g(i2, paddingRight, getMinimumWidth()), AbstractC0911J.m2350g(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x036f  */
    /* JADX WARN: Type inference failed for: r10v5, types: [f0.Z] */
    /* JADX WARN: Type inference failed for: r12v10, types: [f0.F] */
    /* JADX WARN: Type inference failed for: r12v8, types: [f0.F, f0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [f0.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [K.p] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1920o() {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1920o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f2782C = r0
            r1 = 1
            r5.f2835q = r1
            boolean r2 = r5.f2839s
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f2839s = r2
            f0.J r2 = r5.f2827m
            if (r2 == 0) goto L21
            r2.f3758g = r1
            r2.mo2071Q(r5)
        L21:
            r5.f2824k0 = r0
            java.lang.ThreadLocal r0 = p094f0.RunnableC0951p.f3972e
            java.lang.Object r1 = r0.get()
            f0.p r1 = (p094f0.RunnableC0951p) r1
            r5.f2808c0 = r1
            if (r1 != 0) goto L6b
            f0.p r1 = new f0.p
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3974a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3977d = r2
            r5.f2808c0 = r1
            java.util.WeakHashMap r1 = p028K.AbstractC0241P.f815a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            f0.p r2 = r5.f2808c0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3976c = r3
            r0.set(r2)
        L6b:
            f0.p r0 = r5.f2808c0
            java.util.ArrayList r0 = r0.f3974a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0958w c0958w;
        super.onDetachedFromWindow();
        AbstractC0907F abstractC0907F = this.f2789J;
        if (abstractC0907F != null) {
            abstractC0907F.mo2338e();
        }
        setScrollState(0);
        RunnableC0925Y runnableC0925Y = this.f2806b0;
        runnableC0925Y.f3813g.removeCallbacks(runnableC0925Y);
        runnableC0925Y.f3809c.abortAnimation();
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null && (c0958w = abstractC0911J.f3756e) != null) {
            c0958w.m2466i();
        }
        this.f2835q = false;
        AbstractC0911J abstractC0911J2 = this.f2827m;
        if (abstractC0911J2 != null) {
            abstractC0911J2.f3758g = false;
            abstractC0911J2.mo1849R(this);
        }
        this.f2838r0.clear();
        removeCallbacks(this.f2840s0);
        this.f2813f.getClass();
        while (C0944i0.f3922d.mo564a() != null) {
        }
        RunnableC0951p runnableC0951p = this.f2808c0;
        if (runnableC0951p != null) {
            runnableC0951p.f3974a.remove(this);
            this.f2808c0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2829n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0908G) arrayList.get(i2)).mo2082b(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            f0.J r0 = r5.f2827m
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.f2844v
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L40
            f0.J r0 = r5.f2827m
            boolean r0 = r0.mo1865e()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            f0.J r3 = r5.f2827m
            boolean r3 = r3.mo1862d()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L64
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            f0.J r3 = r5.f2827m
            boolean r3 = r3.mo1865e()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            f0.J r3 = r5.f2827m
            boolean r3 = r3.mo1862d()
            if (r3 == 0) goto L64
            r3 = r0
            r0 = r2
            goto L66
        L64:
            r0 = r2
            r3 = r0
        L66:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6e:
            float r2 = r5.f2801V
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f2802W
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m1905Z(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.f2844v) {
            this.f2833p = null;
            if (m1884B(motionEvent)) {
                m1904Y();
                setScrollState(0);
                return true;
            }
            AbstractC0911J abstractC0911J = this.f2827m;
            if (abstractC0911J != null) {
                boolean zMo1862d = abstractC0911J.mo1862d();
                boolean zMo1865e = this.f2827m.mo1865e();
                if (this.f2792M == null) {
                    this.f2792M = VelocityTracker.obtain();
                }
                this.f2792M.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f2845w) {
                        this.f2845w = false;
                    }
                    this.f2791L = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.f2795P = x2;
                    this.f2793N = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.f2796Q = y2;
                    this.f2794O = y2;
                    if (this.f2790K == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m1912f0(1);
                    }
                    int[] iArr = this.f2834p0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i2 = zMo1862d;
                    if (zMo1865e) {
                        i2 = (zMo1862d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m780g(i2, 0);
                } else if (actionMasked == 1) {
                    this.f2792M.clear();
                    m1912f0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2791L);
                    if (iFindPointerIndex >= 0) {
                        int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        if (this.f2790K != 1) {
                            int i3 = x3 - this.f2793N;
                            int i4 = y3 - this.f2794O;
                            if (zMo1862d == 0 || Math.abs(i3) <= this.f2797R) {
                                z2 = false;
                            } else {
                                this.f2795P = x3;
                                z2 = true;
                            }
                            if (zMo1865e && Math.abs(i4) > this.f2797R) {
                                this.f2796Q = y3;
                                z2 = true;
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    m1904Y();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f2791L = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f2795P = x4;
                    this.f2793N = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f2796Q = y4;
                    this.f2794O = y4;
                } else if (actionMasked == 6) {
                    m1898S(motionEvent);
                }
                if (this.f2790K == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = AbstractC0160i.f538a;
        Trace.beginSection("RV OnLayout");
        m1920o();
        Trace.endSection();
        this.f2839s = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J == null) {
            m1919n(i2, i3);
            return;
        }
        boolean zMo1843L = abstractC0911J.mo1843L();
        C0923W c0923w = this.f2812e0;
        if (zMo1843L) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f2827m.f3753b.m1919n(i2, i3);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f2825l == null) {
                return;
            }
            if (c0923w.f3796d == 1) {
                m1921p();
            }
            this.f2827m.m2369q0(i2, i3);
            c0923w.f3801i = true;
            m1922q();
            this.f2827m.m2370s0(i2, i3);
            if (this.f2827m.mo1873v0()) {
                this.f2827m.m2369q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c0923w.f3801i = true;
                m1922q();
                this.f2827m.m2370s0(i2, i3);
                return;
            }
            return;
        }
        if (this.f2837r) {
            this.f2827m.f3753b.m1919n(i2, i3);
            return;
        }
        if (this.f2847y) {
            m1909d0();
            m1896Q();
            m1900U();
            m1897R(true);
            if (c0923w.f3803k) {
                c0923w.f3799g = true;
            } else {
                this.f2809d.m2413d();
                c0923w.f3799g = false;
            }
            this.f2847y = false;
            m1910e0(false);
        } else if (c0923w.f3803k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0903B abstractC0903B = this.f2825l;
        if (abstractC0903B != null) {
            c0923w.f3797e = abstractC0903B.mo188a();
        } else {
            c0923w.f3797e = 0;
        }
        m1909d0();
        this.f2827m.f3753b.m1919n(i2, i3);
        m1910e0(false);
        c0923w.f3799g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (m1892M()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0920T)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0920T c0920t = (C0920T) parcelable;
        this.f2807c = c0920t;
        super.onRestoreInstanceState(c0920t.f1521a);
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J == null || (parcelable2 = this.f2807c.f3786c) == null) {
            return;
        }
        abstractC0911J.mo1863d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0920T c0920t = new C0920T(super.onSaveInstanceState());
        C0920T c0920t2 = this.f2807c;
        if (c0920t2 != null) {
            c0920t.f3786c = c0920t2.f3786c;
            return c0920t;
        }
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null) {
            c0920t.f3786c = abstractC0911J.mo1866e0();
            return c0920t;
        }
        c0920t.f3786c = null;
        return c0920t;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f2788I = null;
        this.f2786G = null;
        this.f2787H = null;
        this.f2785F = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01df A[PHI: r1
  0x01df: PHI (r1v52 int) = (r1v37 int), (r1v56 int) binds: [B:88:0x01c8, B:92:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e2  */
    /* JADX WARN: Type inference failed for: r9v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1921p() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1921p():void");
    }

    /* renamed from: q */
    public final void m1922q() {
        m1909d0();
        m1896Q();
        C0923W c0923w = this.f2812e0;
        c0923w.m2390a(6);
        this.f2809d.m2413d();
        c0923w.f3797e = this.f2825l.mo188a();
        c0923w.f3795c = 0;
        c0923w.f3799g = false;
        this.f2827m.mo1809b0(this.f2805b, c0923w);
        c0923w.f3798f = false;
        this.f2807c = null;
        c0923w.f3802j = c0923w.f3802j && this.f2789J != null;
        c0923w.f3796d = 4;
        m1897R(true);
        m1910e0(false);
    }

    /* renamed from: r */
    public final boolean m1923r(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().m776c(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        AbstractC0926Z abstractC0926ZM1876I = m1876I(view);
        if (abstractC0926ZM1876I != null) {
            if (abstractC0926ZM1876I.m2403j()) {
                abstractC0926ZM1876I.f3824j &= -257;
            } else if (!abstractC0926ZM1876I.m2408o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC0926ZM1876I + m1930y());
            }
        }
        view.clearAnimation();
        m1876I(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0958w c0958w = this.f2827m.f3756e;
        if ((c0958w == null || !c0958w.f4017e) && !m1892M() && view2 != null) {
            m1903X(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2827m.mo2072k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2831o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0948m) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2841t != 0 || this.f2844v) {
            this.f2843u = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void m1924s(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().m777d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J == null || this.f2844v) {
            return;
        }
        boolean zMo1862d = abstractC0911J.mo1862d();
        boolean zMo1865e = this.f2827m.mo1865e();
        if (zMo1862d || zMo1865e) {
            if (!zMo1862d) {
                i2 = 0;
            }
            if (!zMo1865e) {
                i3 = 0;
            }
            m1905Z(i2, i3, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1892M()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2846x |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0928a0 c0928a0) {
        this.f2826l0 = c0928a0;
        AbstractC0241P.m701m(this, c0928a0);
    }

    public void setAdapter(AbstractC0903B abstractC0903B) {
        setLayoutFrozen(false);
        AbstractC0903B abstractC0903B2 = this.f2825l;
        C0919S c0919s = this.f2803a;
        if (abstractC0903B2 != null) {
            abstractC0903B2.f3738a.unregisterObserver(c0919s);
            this.f2825l.getClass();
        }
        AbstractC0907F abstractC0907F = this.f2789J;
        if (abstractC0907F != null) {
            abstractC0907F.mo2338e();
        }
        AbstractC0911J abstractC0911J = this.f2827m;
        C0917P c0917p = this.f2805b;
        if (abstractC0911J != null) {
            abstractC0911J.m2362g0(c0917p);
            this.f2827m.m2363h0(c0917p);
        }
        c0917p.f3777a.clear();
        c0917p.m2381d();
        C0929b c0929b = this.f2809d;
        c0929b.m2426q((ArrayList) c0929b.f3840c);
        c0929b.m2426q((ArrayList) c0929b.f3841d);
        c0929b.f3838a = 0;
        AbstractC0903B abstractC0903B3 = this.f2825l;
        this.f2825l = abstractC0903B;
        if (abstractC0903B != null) {
            abstractC0903B.f3738a.registerObserver(c0919s);
        }
        AbstractC0903B abstractC0903B4 = this.f2825l;
        c0917p.f3777a.clear();
        c0917p.m2381d();
        C0916O c0916oM2380c = c0917p.m2380c();
        if (abstractC0903B3 != null) {
            c0916oM2380c.f3776b--;
        }
        if (c0916oM2380c.f3776b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = c0916oM2380c.f3775a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((C0915N) sparseArray.valueAt(i2)).f3771a.clear();
                i2++;
            }
        }
        if (abstractC0903B4 != null) {
            c0916oM2380c.f3776b++;
        }
        this.f2812e0.f3798f = true;
        m1901V(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0905D interfaceC0905D) {
        if (interfaceC0905D == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2815g) {
            this.f2788I = null;
            this.f2786G = null;
            this.f2787H = null;
            this.f2785F = null;
        }
        this.f2815g = z2;
        super.setClipToPadding(z2);
        if (this.f2839s) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0906E c0906e) {
        c0906e.getClass();
        this.f2784E = c0906e;
        this.f2788I = null;
        this.f2786G = null;
        this.f2787H = null;
        this.f2785F = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2837r = z2;
    }

    public void setItemAnimator(AbstractC0907F abstractC0907F) {
        AbstractC0907F abstractC0907F2 = this.f2789J;
        if (abstractC0907F2 != null) {
            abstractC0907F2.mo2338e();
            this.f2789J.f3740a = null;
        }
        this.f2789J = abstractC0907F;
        if (abstractC0907F != null) {
            abstractC0907F.f3740a = this.f2822j0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        C0917P c0917p = this.f2805b;
        c0917p.f3781e = i2;
        c0917p.m2388k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(AbstractC0911J abstractC0911J) {
        RecyclerView recyclerView;
        C0958w c0958w;
        if (abstractC0911J == this.f2827m) {
            return;
        }
        setScrollState(0);
        RunnableC0925Y runnableC0925Y = this.f2806b0;
        runnableC0925Y.f3813g.removeCallbacks(runnableC0925Y);
        runnableC0925Y.f3809c.abortAnimation();
        AbstractC0911J abstractC0911J2 = this.f2827m;
        if (abstractC0911J2 != null && (c0958w = abstractC0911J2.f3756e) != null) {
            c0958w.m2466i();
        }
        AbstractC0911J abstractC0911J3 = this.f2827m;
        C0917P c0917p = this.f2805b;
        if (abstractC0911J3 != null) {
            AbstractC0907F abstractC0907F = this.f2789J;
            if (abstractC0907F != null) {
                abstractC0907F.mo2338e();
            }
            this.f2827m.m2362g0(c0917p);
            this.f2827m.m2363h0(c0917p);
            c0917p.f3777a.clear();
            c0917p.m2381d();
            if (this.f2835q) {
                AbstractC0911J abstractC0911J4 = this.f2827m;
                abstractC0911J4.f3758g = false;
                abstractC0911J4.mo1849R(this);
            }
            this.f2827m.m2371t0(null);
            this.f2827m = null;
        } else {
            c0917p.f3777a.clear();
            c0917p.m2381d();
        }
        C0027i c0027i = this.f2811e;
        ((C0219a) c0027i.f66c).m606h();
        ArrayList arrayList = (ArrayList) c0027i.f67d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0902A) c0027i.f65b).f3737a;
            if (size < 0) {
                break;
            }
            AbstractC0926Z abstractC0926ZM1876I = m1876I((View) arrayList.get(size));
            if (abstractC0926ZM1876I != null) {
                int i2 = abstractC0926ZM1876I.f3830p;
                if (recyclerView.m1892M()) {
                    abstractC0926ZM1876I.f3831q = i2;
                    recyclerView.f2838r0.add(abstractC0926ZM1876I);
                } else {
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    abstractC0926ZM1876I.f3815a.setImportantForAccessibility(i2);
                }
                abstractC0926ZM1876I.f3830p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            m1876I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2827m = abstractC0911J;
        if (abstractC0911J != null) {
            if (abstractC0911J.f3753b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0911J + " is already attached to a RecyclerView:" + abstractC0911J.f3753b.m1930y());
            }
            abstractC0911J.m2371t0(this);
            if (this.f2835q) {
                AbstractC0911J abstractC0911J5 = this.f2827m;
                abstractC0911J5.f3758g = true;
                abstractC0911J5.mo2071Q(this);
            }
        }
        c0917p.m2388k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0275m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f883d) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            AbstractC0230E.m643z(scrollingChildHelper.f882c);
        }
        scrollingChildHelper.f883d = z2;
    }

    public void setOnFlingListener(AbstractC0913L abstractC0913L) {
        this.f2798S = abstractC0913L;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0914M abstractC0914M) {
        this.f2814f0 = abstractC0914M;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2804a0 = z2;
    }

    public void setRecycledViewPool(C0916O c0916o) {
        C0917P c0917p = this.f2805b;
        if (c0917p.f3783g != null) {
            r1.f3776b--;
        }
        c0917p.f3783g = c0916o;
        if (c0916o == null || c0917p.f3784h.getAdapter() == null) {
            return;
        }
        c0917p.f3783g.f3776b++;
    }

    public void setRecyclerListener(InterfaceC0918Q interfaceC0918Q) {
    }

    public void setScrollState(int i2) {
        C0958w c0958w;
        if (i2 == this.f2790K) {
            return;
        }
        this.f2790K = i2;
        if (i2 != 2) {
            RunnableC0925Y runnableC0925Y = this.f2806b0;
            runnableC0925Y.f3813g.removeCallbacks(runnableC0925Y);
            runnableC0925Y.f3809c.abortAnimation();
            AbstractC0911J abstractC0911J = this.f2827m;
            if (abstractC0911J != null && (c0958w = abstractC0911J.f3756e) != null) {
                c0958w.m2466i();
            }
        }
        AbstractC0911J abstractC0911J2 = this.f2827m;
        if (abstractC0911J2 != null) {
            abstractC0911J2.mo1963f0(i2);
        }
        AbstractC0914M abstractC0914M = this.f2814f0;
        if (abstractC0914M != null) {
            abstractC0914M.mo2083a(this, i2);
        }
        ArrayList arrayList = this.f2816g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0914M) this.f2816g0.get(size)).mo2083a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 1) {
            this.f2797R = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f2797R = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(AbstractC0924X abstractC0924X) {
        this.f2805b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().m780g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m781h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        C0958w c0958w;
        if (z2 != this.f2844v) {
            m1915i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f2844v = false;
                if (this.f2843u && this.f2827m != null && this.f2825l != null) {
                    requestLayout();
                }
                this.f2843u = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2844v = true;
            this.f2845w = true;
            setScrollState(0);
            RunnableC0925Y runnableC0925Y = this.f2806b0;
            runnableC0925Y.f3813g.removeCallbacks(runnableC0925Y);
            runnableC0925Y.f3809c.abortAnimation();
            AbstractC0911J abstractC0911J = this.f2827m;
            if (abstractC0911J == null || (c0958w = abstractC0911J.f3756e) == null) {
                return;
            }
            c0958w.m2466i();
        }
    }

    /* renamed from: t */
    public final void m1925t(int i2, int i3) {
        this.f2783D++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        AbstractC0914M abstractC0914M = this.f2814f0;
        if (abstractC0914M != null) {
            abstractC0914M.mo2084b(this, i2, i3);
        }
        ArrayList arrayList = this.f2816g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0914M) this.f2816g0.get(size)).mo2084b(this, i2, i3);
            }
        }
        this.f2783D--;
    }

    /* renamed from: u */
    public final void m1926u() {
        if (this.f2788I != null) {
            return;
        }
        this.f2784E.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2788I = edgeEffect;
        if (this.f2815g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: v */
    public final void m1927v() {
        if (this.f2785F != null) {
            return;
        }
        this.f2784E.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2785F = edgeEffect;
        if (this.f2815g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: w */
    public final void m1928w() {
        if (this.f2787H != null) {
            return;
        }
        this.f2784E.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2787H = edgeEffect;
        if (this.f2815g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: x */
    public final void m1929x() {
        if (this.f2786G != null) {
            return;
        }
        this.f2784E.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2786G = edgeEffect;
        if (this.f2815g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: y */
    public final String m1930y() {
        return " " + super.toString() + ", adapter:" + this.f2825l + ", layout:" + this.f2827m + ", context:" + getContext();
    }

    /* renamed from: z */
    public final void m1931z(C0923W c0923w) {
        if (getScrollState() != 2) {
            c0923w.getClass();
            return;
        }
        OverScroller overScroller = this.f2806b0.f3809c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0923w.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException, SecurityException {
        float fM709a;
        AttributeSet attributeSet2;
        char c3;
        TypedArray typedArray;
        int i3;
        char c4;
        int i4;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i2);
        this.f2803a = new C0919S(this);
        this.f2805b = new C0917P(this);
        this.f2813f = new C0019a(20);
        this.f2817h = new RunnableC0961z(this, 0);
        this.f2819i = new Rect();
        this.f2821j = new Rect();
        this.f2823k = new RectF();
        this.f2829n = new ArrayList();
        this.f2831o = new ArrayList();
        this.f2841t = 0;
        this.f2780A = false;
        this.f2781B = false;
        this.f2782C = 0;
        this.f2783D = 0;
        this.f2784E = new C0906E();
        C0943i c0943i = new C0943i();
        c0943i.f3740a = null;
        c0943i.f3741b = new ArrayList();
        c0943i.f3742c = 120L;
        c0943i.f3743d = 120L;
        c0943i.f3744e = 250L;
        c0943i.f3745f = 250L;
        c0943i.f3910g = true;
        c0943i.f3911h = new ArrayList();
        c0943i.f3912i = new ArrayList();
        c0943i.f3913j = new ArrayList();
        c0943i.f3914k = new ArrayList();
        c0943i.f3915l = new ArrayList();
        c0943i.f3916m = new ArrayList();
        c0943i.f3917n = new ArrayList();
        c0943i.f3918o = new ArrayList();
        c0943i.f3919p = new ArrayList();
        c0943i.f3920q = new ArrayList();
        c0943i.f3921r = new ArrayList();
        this.f2789J = c0943i;
        this.f2790K = 0;
        this.f2791L = -1;
        this.f2801V = Float.MIN_VALUE;
        this.f2802W = Float.MIN_VALUE;
        this.f2804a0 = true;
        this.f2806b0 = new RunnableC0925Y(this);
        this.f2810d0 = new C0949n();
        C0923W c0923w = new C0923W();
        c0923w.f3793a = -1;
        c0923w.f3794b = 0;
        c0923w.f3795c = 0;
        c0923w.f3796d = 1;
        c0923w.f3797e = 0;
        c0923w.f3798f = false;
        c0923w.f3799g = false;
        c0923w.f3800h = false;
        c0923w.f3801i = false;
        c0923w.f3802j = false;
        c0923w.f3803k = false;
        this.f2812e0 = c0923w;
        this.f2818h0 = false;
        this.f2820i0 = false;
        C0902A c0902a = new C0902A(this);
        this.f2822j0 = c0902a;
        this.f2824k0 = false;
        this.f2828m0 = new int[2];
        this.f2832o0 = new int[2];
        this.f2834p0 = new int[2];
        this.f2836q0 = new int[2];
        this.f2838r0 = new ArrayList();
        this.f2840s0 = new RunnableC0961z(this, 1);
        this.f2842t0 = new C0902A(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2797R = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = AbstractC0245U.f821a;
            fM709a = AbstractC0242Q.m703a(viewConfiguration);
        } else {
            fM709a = AbstractC0245U.m709a(viewConfiguration, context);
        }
        this.f2801V = fM709a;
        this.f2802W = i5 >= 26 ? AbstractC0242Q.m704b(viewConfiguration) : AbstractC0245U.m709a(viewConfiguration, context);
        this.f2799T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2800U = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2789J.f3740a = c0902a;
        this.f2809d = new C0929b(new C0902A(this));
        this.f2811e = new C0027i(new C0902A(this));
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if ((i5 >= 26 ? AbstractC0232G.m650c(this) : 0) == 0 && i5 >= 26) {
            AbstractC0232G.m660m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2848z = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0928a0(this));
        int[] iArr = AbstractC0894a.f3721a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (i5 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2815g = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m1930y());
            }
            Resources resources = getContext().getResources();
            c4 = 2;
            i4 = i2;
            c3 = 3;
            i3 = 4;
            typedArray = typedArrayObtainStyledAttributes;
            attributeSet2 = attributeSet;
            new C0948m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(tkbmmn.ghwbbf.irvjzy.R.dimen.fastscroll_margin));
        } else {
            attributeSet2 = attributeSet;
            c3 = 3;
            typedArray = typedArrayObtainStyledAttributes;
            i3 = 4;
            c4 = 2;
            i4 = i2;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0911J.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f2778v0);
                        objArr = new Object[i3];
                        objArr[0] = context;
                        objArr[1] = attributeSet2;
                        objArr[c4] = Integer.valueOf(i4);
                        objArr[c3] = 0;
                    } catch (NoSuchMethodException e3) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e4) {
                            e4.initCause(e3);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e4);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0911J) constructor.newInstance(objArr));
                } catch (ClassCastException e5) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Class is not a LayoutManager " + str, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Unable to find LayoutManager " + str, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Cannot access non-public constructor " + str, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                }
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        int[] iArr2 = f2777u0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i4, 0);
        if (i6 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet2, typedArrayObtainStyledAttributes2, i4, 0);
        }
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0911J abstractC0911J = this.f2827m;
        if (abstractC0911J != null) {
            return abstractC0911J.mo1830t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1930y());
    }
}
