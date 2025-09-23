package p094f0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: f0.g0 */
/* loaded from: classes.dex */
public final class C0940g0 {

    /* renamed from: a */
    public final ArrayList f3893a = new ArrayList();

    /* renamed from: b */
    public int f3894b = Integer.MIN_VALUE;

    /* renamed from: c */
    public int f3895c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f3896d = 0;

    /* renamed from: e */
    public final int f3897e;

    /* renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f3898f;

    public C0940g0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f3898f = staggeredGridLayoutManager;
        this.f3897e = i2;
    }

    /* renamed from: a */
    public final void m2432a() {
        View view = (View) this.f3893a.get(r0.size() - 1);
        C0934d0 c0934d0 = (C0934d0) view.getLayoutParams();
        this.f3895c = this.f3898f.f2862r.mo1611b(view);
        c0934d0.getClass();
    }

    /* renamed from: b */
    public final void m2433b() {
        this.f3893a.clear();
        this.f3894b = Integer.MIN_VALUE;
        this.f3895c = Integer.MIN_VALUE;
        this.f3896d = 0;
    }

    /* renamed from: c */
    public final int m2434c() {
        return this.f3898f.f2867w ? m2436e(r1.size() - 1, -1) : m2436e(0, this.f3893a.size());
    }

    /* renamed from: d */
    public final int m2435d() {
        return this.f3898f.f2867w ? m2436e(0, this.f3893a.size()) : m2436e(r1.size() - 1, -1);
    }

    /* renamed from: e */
    public final int m2436e(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3898f;
        int iMo1620k = staggeredGridLayoutManager.f2862r.mo1620k();
        int iMo1616g = staggeredGridLayoutManager.f2862r.mo1616g();
        int i4 = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View view = (View) this.f3893a.get(i2);
            int iMo1614e = staggeredGridLayoutManager.f2862r.mo1614e(view);
            int iMo1611b = staggeredGridLayoutManager.f2862r.mo1611b(view);
            boolean z2 = iMo1614e <= iMo1616g;
            boolean z3 = iMo1611b >= iMo1620k;
            if (z2 && z3 && (iMo1614e < iMo1620k || iMo1611b > iMo1616g)) {
                return AbstractC0911J.m2346H(view);
            }
            i2 += i4;
        }
        return -1;
    }

    /* renamed from: f */
    public final int m2437f(int i2) {
        int i3 = this.f3895c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f3893a.size() == 0) {
            return i2;
        }
        m2432a();
        return this.f3895c;
    }

    /* renamed from: g */
    public final View m2438g(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3898f;
        ArrayList arrayList = this.f3893a;
        View view = null;
        if (i3 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2867w && AbstractC0911J.m2346H(view2) >= i2) || ((!staggeredGridLayoutManager.f2867w && AbstractC0911J.m2346H(view2) <= i2) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            View view3 = (View) arrayList.get(i4);
            if ((staggeredGridLayoutManager.f2867w && AbstractC0911J.m2346H(view3) <= i2) || ((!staggeredGridLayoutManager.f2867w && AbstractC0911J.m2346H(view3) >= i2) || !view3.hasFocusable())) {
                break;
            }
            i4++;
            view = view3;
        }
        return view;
    }

    /* renamed from: h */
    public final int m2439h(int i2) {
        int i3 = this.f3894b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f3893a.size() == 0) {
            return i2;
        }
        View view = (View) this.f3893a.get(0);
        C0934d0 c0934d0 = (C0934d0) view.getLayoutParams();
        this.f3894b = this.f3898f.f2862r.mo1614e(view);
        c0934d0.getClass();
        return this.f3894b;
    }
}
