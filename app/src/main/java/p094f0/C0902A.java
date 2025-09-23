package p094f0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p028K.C0281p;

/* renamed from: f0.A */
/* loaded from: classes.dex */
public final class C0902A {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3737a;

    public /* synthetic */ C0902A(RecyclerView recyclerView) {
        this.f3737a = recyclerView;
    }

    /* renamed from: a */
    public void m2323a(C0927a c0927a) {
        int i2 = c0927a.f3833a;
        RecyclerView recyclerView = this.f3737a;
        if (i2 == 1) {
            recyclerView.f2827m.mo1803W(c0927a.f3834b, c0927a.f3835c);
            return;
        }
        if (i2 == 2) {
            recyclerView.f2827m.mo1806Z(c0927a.f3834b, c0927a.f3835c);
        } else if (i2 == 4) {
            recyclerView.f2827m.mo1807a0(c0927a.f3834b, c0927a.f3835c);
        } else {
            if (i2 != 8) {
                return;
            }
            recyclerView.f2827m.mo1805Y(c0927a.f3834b, c0927a.f3835c);
        }
    }

    /* renamed from: b */
    public AbstractC0926Z m2324b(int i2) {
        RecyclerView recyclerView = this.f3737a;
        int iM106H = recyclerView.f2811e.m106H();
        int i3 = 0;
        AbstractC0926Z abstractC0926Z = null;
        while (true) {
            if (i3 >= iM106H) {
                break;
            }
            AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(recyclerView.f2811e.m105G(i3));
            if (abstractC0926ZM1876I != null && !abstractC0926ZM1876I.m2401h() && abstractC0926ZM1876I.f3817c == i2) {
                if (!((ArrayList) recyclerView.f2811e.f67d).contains(abstractC0926ZM1876I.f3815a)) {
                    abstractC0926Z = abstractC0926ZM1876I;
                    break;
                }
                abstractC0926Z = abstractC0926ZM1876I;
            }
            i3++;
        }
        if (abstractC0926Z == null || ((ArrayList) recyclerView.f2811e.f67d).contains(abstractC0926Z.f3815a)) {
            return null;
        }
        return abstractC0926Z;
    }

    /* renamed from: c */
    public void m2325c(int i2, int i3) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.f3737a;
        int iM106H = recyclerView.f2811e.m106H();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < iM106H; i7++) {
            View viewM105G = recyclerView.f2811e.m105G(i7);
            AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(viewM105G);
            if (abstractC0926ZM1876I != null && !abstractC0926ZM1876I.m2408o() && (i5 = abstractC0926ZM1876I.f3817c) >= i2 && i5 < i6) {
                abstractC0926ZM1876I.m2394a(2);
                abstractC0926ZM1876I.m2394a(1024);
                ((C0912K) viewM105G.getLayoutParams()).f3769c = true;
            }
        }
        C0917P c0917p = recyclerView.f2805b;
        ArrayList arrayList = c0917p.f3779c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0926Z abstractC0926Z = (AbstractC0926Z) arrayList.get(size);
            if (abstractC0926Z != null && (i4 = abstractC0926Z.f3817c) >= i2 && i4 < i6) {
                abstractC0926Z.m2394a(2);
                c0917p.m2382e(size);
            }
        }
        recyclerView.f2820i0 = true;
    }

    /* renamed from: d */
    public void m2326d(int i2, int i3) {
        RecyclerView recyclerView = this.f3737a;
        int iM106H = recyclerView.f2811e.m106H();
        for (int i4 = 0; i4 < iM106H; i4++) {
            AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(recyclerView.f2811e.m105G(i4));
            if (abstractC0926ZM1876I != null && !abstractC0926ZM1876I.m2408o() && abstractC0926ZM1876I.f3817c >= i2) {
                abstractC0926ZM1876I.m2405l(i3, false);
                recyclerView.f2812e0.f3798f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2805b.f3779c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0926Z abstractC0926Z = (AbstractC0926Z) arrayList.get(i5);
            if (abstractC0926Z != null && abstractC0926Z.f3817c >= i2) {
                abstractC0926Z.m2405l(i3, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2818h0 = true;
    }

    /* renamed from: e */
    public void m2327e(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f3737a;
        int iM106H = recyclerView.f2811e.m106H();
        int i11 = -1;
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i12 = 0; i12 < iM106H; i12++) {
            AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(recyclerView.f2811e.m105G(i12));
            if (abstractC0926ZM1876I != null && (i10 = abstractC0926ZM1876I.f3817c) >= i5 && i10 <= i4) {
                if (i10 == i2) {
                    abstractC0926ZM1876I.m2405l(i3 - i2, false);
                } else {
                    abstractC0926ZM1876I.m2405l(i6, false);
                }
                recyclerView.f2812e0.f3798f = true;
            }
        }
        C0917P c0917p = recyclerView.f2805b;
        c0917p.getClass();
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
            i11 = 1;
        }
        ArrayList arrayList = c0917p.f3779c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC0926Z abstractC0926Z = (AbstractC0926Z) arrayList.get(i13);
            if (abstractC0926Z != null && (i9 = abstractC0926Z.f3817c) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    abstractC0926Z.m2405l(i3 - i2, false);
                } else {
                    abstractC0926Z.m2405l(i11, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2818h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2328f(p094f0.AbstractC0926Z r9, p028K.C0281p r10, p028K.C0281p r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3737a
            r0.getClass()
            r1 = 0
            r9.m2407n(r1)
            f0.F r1 = r0.f2789J
            r2 = r1
            f0.i r2 = (p094f0.C0943i) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f898a
            int r6 = r11.f898a
            if (r4 != r6) goto L22
            int r1 = r10.f899b
            int r3 = r11.f899b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f899b
            int r7 = r11.f899b
            r3 = r9
            boolean r9 = r2.m2442g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.m2446l(r3)
            android.view.View r9 = r3.f3815a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f3912i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.m1899T()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.C0902A.m2328f(f0.Z, K.p, K.p):void");
    }

    /* renamed from: g */
    public void m2329g(AbstractC0926Z abstractC0926Z, C0281p c0281p, C0281p c0281p2) {
        boolean zM2442g;
        RecyclerView recyclerView = this.f3737a;
        recyclerView.f2805b.m2387j(abstractC0926Z);
        recyclerView.m1911f(abstractC0926Z);
        abstractC0926Z.m2407n(false);
        C0943i c0943i = (C0943i) recyclerView.f2789J;
        c0943i.getClass();
        int i2 = c0281p.f898a;
        int i3 = c0281p.f899b;
        View view = abstractC0926Z.f3815a;
        int left = c0281p2 == null ? view.getLeft() : c0281p2.f898a;
        int top = c0281p2 == null ? view.getTop() : c0281p2.f899b;
        if (abstractC0926Z.m2401h() || (i2 == left && i3 == top)) {
            c0943i.m2446l(abstractC0926Z);
            c0943i.f3911h.add(abstractC0926Z);
            zM2442g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM2442g = c0943i.m2442g(abstractC0926Z, i2, i3, left, top);
        }
        if (zM2442g) {
            recyclerView.m1899T();
        }
    }

    /* renamed from: h */
    public void m2330h(int i2) {
        RecyclerView recyclerView = this.f3737a;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.m1876I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }
}
