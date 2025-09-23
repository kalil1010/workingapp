package p094f0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002A1.C0027i;
import p011D1.C0118h;
import p025J.C0214a;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p080b1.C0770h;
import p086d.AbstractC0843a;
import p105j.AbstractC1117o0;
import p105j.C1131t;

/* renamed from: f0.b */
/* loaded from: classes.dex */
public final class C0929b {

    /* renamed from: a */
    public int f3838a;

    /* renamed from: b */
    public final Object f3839b;

    /* renamed from: c */
    public final Object f3840c;

    /* renamed from: d */
    public Object f3841d;

    /* renamed from: e */
    public Object f3842e;

    /* renamed from: f */
    public Object f3843f;

    public C0929b(View view) {
        this.f3838a = -1;
        this.f3839b = view;
        this.f3840c = C1131t.m2749a();
    }

    /* renamed from: a */
    public void m2410a() {
        View view = (View) this.f3839b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0118h) this.f3841d) != null) {
                if (((C0118h) this.f3843f) == null) {
                    this.f3843f = new C0118h();
                }
                C0118h c0118h = (C0118h) this.f3843f;
                c0118h.f331c = null;
                c0118h.f330b = false;
                c0118h.f332d = null;
                c0118h.f329a = false;
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                ColorStateList colorStateListM624g = AbstractC0230E.m624g(view);
                if (colorStateListM624g != null) {
                    c0118h.f330b = true;
                    c0118h.f331c = colorStateListM624g;
                }
                PorterDuff.Mode modeM625h = AbstractC0230E.m625h(view);
                if (modeM625h != null) {
                    c0118h.f329a = true;
                    c0118h.f332d = modeM625h;
                }
                if (c0118h.f330b || c0118h.f329a) {
                    C1131t.m2752e(background, c0118h, view.getDrawableState());
                    return;
                }
            }
            C0118h c0118h2 = (C0118h) this.f3842e;
            if (c0118h2 != null) {
                C1131t.m2752e(background, c0118h2, view.getDrawableState());
                return;
            }
            C0118h c0118h3 = (C0118h) this.f3841d;
            if (c0118h3 != null) {
                C1131t.m2752e(background, c0118h3, view.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public boolean m2411b(int i2) {
        ArrayList arrayList = (ArrayList) this.f3841d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0927a c0927a = (C0927a) arrayList.get(i3);
            int i4 = c0927a.f3833a;
            if (i4 != 8) {
                if (i4 == 1) {
                    int i5 = c0927a.f3834b;
                    int i6 = c0927a.f3835c + i5;
                    while (i5 < i6) {
                        if (m2416g(i5, i3 + 1) == i2) {
                            return true;
                        }
                        i5++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m2416g(c0927a.f3835c, i3 + 1) == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m2412c() {
        ArrayList arrayList = (ArrayList) this.f3841d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0902A) this.f3842e).m2323a((C0927a) arrayList.get(i2));
        }
        m2426q(arrayList);
        this.f3838a = 0;
    }

    /* renamed from: d */
    public void m2413d() {
        m2412c();
        ArrayList arrayList = (ArrayList) this.f3840c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0927a c0927a = (C0927a) arrayList.get(i2);
            int i3 = c0927a.f3833a;
            C0902A c0902a = (C0902A) this.f3842e;
            if (i3 == 1) {
                c0902a.m2323a(c0927a);
                c0902a.m2326d(c0927a.f3834b, c0927a.f3835c);
            } else if (i3 == 2) {
                c0902a.m2323a(c0927a);
                int i4 = c0927a.f3834b;
                int i5 = c0927a.f3835c;
                RecyclerView recyclerView = c0902a.f3737a;
                recyclerView.m1895P(i4, i5, true);
                recyclerView.f2818h0 = true;
                recyclerView.f2812e0.f3795c += i5;
            } else if (i3 == 4) {
                c0902a.m2323a(c0927a);
                c0902a.m2325c(c0927a.f3834b, c0927a.f3835c);
            } else if (i3 == 8) {
                c0902a.m2323a(c0927a);
                c0902a.m2327e(c0927a.f3834b, c0927a.f3835c);
            }
        }
        m2426q(arrayList);
        this.f3838a = 0;
    }

    /* renamed from: e */
    public void m2414e(C0927a c0927a) {
        int i2;
        C0214a c0214a;
        int i3 = c0927a.f3833a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM2430u = m2430u(c0927a.f3834b, i3);
        int i4 = c0927a.f3834b;
        int i5 = c0927a.f3833a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0927a);
            }
            i2 = 1;
        }
        int i6 = 1;
        int i7 = 1;
        while (true) {
            int i8 = c0927a.f3835c;
            c0214a = (C0214a) this.f3839b;
            if (i6 >= i8) {
                break;
            }
            int iM2430u2 = m2430u((i2 * i6) + c0927a.f3834b, c0927a.f3833a);
            int i9 = c0927a.f3833a;
            if (i9 == 2 ? iM2430u2 != iM2430u : !(i9 == 4 && iM2430u2 == iM2430u + 1)) {
                C0927a c0927aM2421l = m2421l(i9, iM2430u, i7);
                m2415f(c0927aM2421l, i4);
                c0214a.mo566c(c0927aM2421l);
                if (c0927a.f3833a == 4) {
                    i4 += i7;
                }
                i7 = 1;
                iM2430u = iM2430u2;
            } else {
                i7++;
            }
            i6++;
        }
        c0214a.mo566c(c0927a);
        if (i7 > 0) {
            C0927a c0927aM2421l2 = m2421l(c0927a.f3833a, iM2430u, i7);
            m2415f(c0927aM2421l2, i4);
            c0214a.mo566c(c0927aM2421l2);
        }
    }

    /* renamed from: f */
    public void m2415f(C0927a c0927a, int i2) {
        C0902A c0902a = (C0902A) this.f3842e;
        c0902a.m2323a(c0927a);
        int i3 = c0927a.f3833a;
        if (i3 != 2) {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0902a.m2325c(i2, c0927a.f3835c);
        } else {
            int i4 = c0927a.f3835c;
            RecyclerView recyclerView = c0902a.f3737a;
            recyclerView.m1895P(i2, i4, true);
            recyclerView.f2818h0 = true;
            recyclerView.f2812e0.f3795c += i4;
        }
    }

    /* renamed from: g */
    public int m2416g(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f3841d;
        int size = arrayList.size();
        while (i3 < size) {
            C0927a c0927a = (C0927a) arrayList.get(i3);
            int i4 = c0927a.f3833a;
            if (i4 == 8) {
                int i5 = c0927a.f3834b;
                if (i5 == i2) {
                    i2 = c0927a.f3835c;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (c0927a.f3835c <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = c0927a.f3834b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = c0927a.f3835c;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += c0927a.f3835c;
                }
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: h */
    public ColorStateList m2417h() {
        C0118h c0118h = (C0118h) this.f3842e;
        if (c0118h != null) {
            return (ColorStateList) c0118h.f331c;
        }
        return null;
    }

    /* renamed from: i */
    public PorterDuff.Mode m2418i() {
        C0118h c0118h = (C0118h) this.f3842e;
        if (c0118h != null) {
            return (PorterDuff.Mode) c0118h.f332d;
        }
        return null;
    }

    /* renamed from: j */
    public boolean m2419j() {
        return ((ArrayList) this.f3840c).size() > 0;
    }

    /* renamed from: k */
    public void m2420k(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListM2661f;
        View view = (View) this.f3839b;
        Context context = view.getContext();
        int[] iArr = AbstractC0843a.f3449A;
        C0027i c0027iM98N = C0027i.m98N(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
        View view2 = (View) this.f3839b;
        AbstractC0241P.m700l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0027iM98N.f66c, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.f3838a = typedArray.getResourceId(0, -1);
                C1131t c1131t = (C1131t) this.f3840c;
                Context context2 = view.getContext();
                int i3 = this.f3838a;
                synchronized (c1131t) {
                    colorStateListM2661f = c1131t.f4636a.m2661f(context2, i3);
                }
                if (colorStateListM2661f != null) {
                    m2427r(colorStateListM2661f);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0230E.m634q(view, c0027iM98N.m99A(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0230E.m635r(view, AbstractC1117o0.m2733b(typedArray.getInt(2, -1), null));
            }
            c0027iM98N.m114R();
        } catch (Throwable th) {
            c0027iM98N.m114R();
            throw th;
        }
    }

    /* renamed from: l */
    public C0927a m2421l(int i2, int i3, int i4) {
        C0927a c0927a = (C0927a) ((C0214a) this.f3839b).mo564a();
        if (c0927a != null) {
            c0927a.f3833a = i2;
            c0927a.f3834b = i3;
            c0927a.f3835c = i4;
            return c0927a;
        }
        C0927a c0927a2 = new C0927a();
        c0927a2.f3833a = i2;
        c0927a2.f3834b = i3;
        c0927a2.f3835c = i4;
        return c0927a2;
    }

    /* renamed from: m */
    public void m2422m() {
        this.f3838a = -1;
        m2427r(null);
        m2410a();
    }

    /* renamed from: n */
    public void m2423n(int i2) {
        ColorStateList colorStateListM2661f;
        this.f3838a = i2;
        C1131t c1131t = (C1131t) this.f3840c;
        if (c1131t != null) {
            Context context = ((View) this.f3839b).getContext();
            synchronized (c1131t) {
                colorStateListM2661f = c1131t.f4636a.m2661f(context, i2);
            }
        } else {
            colorStateListM2661f = null;
        }
        m2427r(colorStateListM2661f);
        m2410a();
    }

    /* renamed from: o */
    public void m2424o(C0927a c0927a) {
        ((ArrayList) this.f3841d).add(c0927a);
        int i2 = c0927a.f3833a;
        C0902A c0902a = (C0902A) this.f3842e;
        if (i2 == 1) {
            c0902a.m2326d(c0927a.f3834b, c0927a.f3835c);
            return;
        }
        if (i2 == 2) {
            int i3 = c0927a.f3834b;
            int i4 = c0927a.f3835c;
            RecyclerView recyclerView = c0902a.f3737a;
            recyclerView.m1895P(i3, i4, false);
            recyclerView.f2818h0 = true;
            return;
        }
        if (i2 == 4) {
            c0902a.m2325c(c0927a.f3834b, c0927a.f3835c);
        } else if (i2 == 8) {
            c0902a.m2327e(c0927a.f3834b, c0927a.f3835c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0927a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2425p() {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.C0929b.m2425p():void");
    }

    /* renamed from: q */
    public void m2426q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0927a c0927a = (C0927a) arrayList.get(i2);
            c0927a.getClass();
            ((C0214a) this.f3839b).mo566c(c0927a);
        }
        arrayList.clear();
    }

    /* renamed from: r */
    public void m2427r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0118h) this.f3841d) == null) {
                this.f3841d = new C0118h();
            }
            C0118h c0118h = (C0118h) this.f3841d;
            c0118h.f331c = colorStateList;
            c0118h.f330b = true;
        } else {
            this.f3841d = null;
        }
        m2410a();
    }

    /* renamed from: s */
    public void m2428s(ColorStateList colorStateList) {
        if (((C0118h) this.f3842e) == null) {
            this.f3842e = new C0118h();
        }
        C0118h c0118h = (C0118h) this.f3842e;
        c0118h.f331c = colorStateList;
        c0118h.f330b = true;
        m2410a();
    }

    /* renamed from: t */
    public void m2429t(PorterDuff.Mode mode) {
        if (((C0118h) this.f3842e) == null) {
            this.f3842e = new C0118h();
        }
        C0118h c0118h = (C0118h) this.f3842e;
        c0118h.f332d = mode;
        c0118h.f329a = true;
        m2410a();
    }

    /* renamed from: u */
    public int m2430u(int i2, int i3) {
        int i4;
        int i5;
        ArrayList arrayList = (ArrayList) this.f3841d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0927a c0927a = (C0927a) arrayList.get(size);
            int i6 = c0927a.f3833a;
            if (i6 == 8) {
                int i7 = c0927a.f3834b;
                int i8 = c0927a.f3835c;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            c0927a.f3834b = i7 + 1;
                            c0927a.f3835c = i8 + 1;
                        } else if (i3 == 2) {
                            c0927a.f3834b = i7 - 1;
                            c0927a.f3835c = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        c0927a.f3835c = i8 + 1;
                    } else if (i3 == 2) {
                        c0927a.f3835c = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        c0927a.f3834b = i7 + 1;
                    } else if (i3 == 2) {
                        c0927a.f3834b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = c0927a.f3834b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= c0927a.f3835c;
                    } else if (i6 == 2) {
                        i2 += c0927a.f3835c;
                    }
                } else if (i3 == 1) {
                    c0927a.f3834b = i9 + 1;
                } else if (i3 == 2) {
                    c0927a.f3834b = i9 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0927a c0927a2 = (C0927a) arrayList.get(size2);
            int i10 = c0927a2.f3833a;
            C0214a c0214a = (C0214a) this.f3839b;
            if (i10 == 8) {
                int i11 = c0927a2.f3835c;
                if (i11 == c0927a2.f3834b || i11 < 0) {
                    arrayList.remove(size2);
                    c0214a.mo566c(c0927a2);
                }
            } else if (c0927a2.f3835c <= 0) {
                arrayList.remove(size2);
                c0214a.mo566c(c0927a2);
            }
        }
        return i2;
    }

    public C0929b(C0902A c0902a) {
        this.f3839b = new C0214a(30);
        this.f3840c = new ArrayList();
        this.f3841d = new ArrayList();
        this.f3838a = 0;
        this.f3842e = c0902a;
        this.f3843f = new C0770h(this);
    }
}
