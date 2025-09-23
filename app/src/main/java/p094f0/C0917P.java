package p094f0;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p028K.C0253b;
import p060V.C0540b;

/* renamed from: f0.P */
/* loaded from: classes.dex */
public final class C0917P {

    /* renamed from: a */
    public final ArrayList f3777a;

    /* renamed from: b */
    public ArrayList f3778b;

    /* renamed from: c */
    public final ArrayList f3779c;

    /* renamed from: d */
    public final List f3780d;

    /* renamed from: e */
    public int f3781e;

    /* renamed from: f */
    public int f3782f;

    /* renamed from: g */
    public C0916O f3783g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f3784h;

    public C0917P(RecyclerView recyclerView) {
        this.f3784h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3777a = arrayList;
        this.f3778b = null;
        this.f3779c = new ArrayList();
        this.f3780d = Collections.unmodifiableList(arrayList);
        this.f3781e = 2;
        this.f3782f = 2;
    }

    /* renamed from: a */
    public final void m2378a(AbstractC0926Z abstractC0926Z, boolean z2) {
        RecyclerView.m1882j(abstractC0926Z);
        RecyclerView recyclerView = this.f3784h;
        C0928a0 c0928a0 = recyclerView.f2826l0;
        if (c0928a0 != null) {
            C0540b c0540b = c0928a0.f3837e;
            View view = abstractC0926Z.f3815a;
            AbstractC0241P.m701m(view, c0540b != null ? (C0253b) ((WeakHashMap) c0540b.f1707f).remove(view) : null);
        }
        if (z2) {
            AbstractC0903B abstractC0903B = recyclerView.f2825l;
            if (abstractC0903B != null) {
                abstractC0903B.mo1059f(abstractC0926Z);
            }
            if (recyclerView.f2812e0 != null) {
                recyclerView.f2813f.m64J(abstractC0926Z);
            }
        }
        abstractC0926Z.f3832r = null;
        C0916O c0916oM2380c = m2380c();
        c0916oM2380c.getClass();
        int i2 = abstractC0926Z.f3820f;
        ArrayList arrayList = c0916oM2380c.m2377a(i2).f3771a;
        if (((C0915N) c0916oM2380c.f3775a.get(i2)).f3772b <= arrayList.size()) {
            return;
        }
        abstractC0926Z.m2406m();
        arrayList.add(abstractC0926Z);
    }

    /* renamed from: b */
    public final int m2379b(int i2) {
        RecyclerView recyclerView = this.f3784h;
        if (i2 >= 0 && i2 < recyclerView.f2812e0.m2391b()) {
            return !recyclerView.f2812e0.f3799g ? i2 : recyclerView.f2809d.m2416g(i2, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f2812e0.m2391b() + recyclerView.m1930y());
    }

    /* renamed from: c */
    public final C0916O m2380c() {
        if (this.f3783g == null) {
            C0916O c0916o = new C0916O();
            c0916o.f3775a = new SparseArray();
            c0916o.f3776b = 0;
            this.f3783g = c0916o;
        }
        return this.f3783g;
    }

    /* renamed from: d */
    public final void m2381d() {
        ArrayList arrayList = this.f3779c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m2382e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f2777u0;
        C0949n c0949n = this.f3784h.f2810d0;
        int[] iArr2 = c0949n.f3965c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0949n.f3966d = 0;
    }

    /* renamed from: e */
    public final void m2382e(int i2) {
        ArrayList arrayList = this.f3779c;
        m2378a((AbstractC0926Z) arrayList.get(i2), true);
        arrayList.remove(i2);
    }

    /* renamed from: f */
    public final void m2383f(View view) {
        AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(view);
        boolean zM2403j = abstractC0926ZM1876I.m2403j();
        RecyclerView recyclerView = this.f3784h;
        if (zM2403j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC0926ZM1876I.m2402i()) {
            abstractC0926ZM1876I.f3828n.m2387j(abstractC0926ZM1876I);
        } else if (abstractC0926ZM1876I.m2409p()) {
            abstractC0926ZM1876I.f3824j &= -33;
        }
        m2384g(abstractC0926ZM1876I);
        if (recyclerView.f2789J == null || abstractC0926ZM1876I.m2400g()) {
            return;
        }
        recyclerView.f2789J.mo2337d(abstractC0926ZM1876I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2384g(p094f0.AbstractC0926Z r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.C0917P.m2384g(f0.Z):void");
    }

    /* renamed from: h */
    public final void m2385h(View view) {
        AbstractC0907F abstractC0907F;
        AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(view);
        boolean z2 = (abstractC0926ZM1876I.f3824j & 12) != 0;
        RecyclerView recyclerView = this.f3784h;
        if (!z2 && abstractC0926ZM1876I.m2404k() && (abstractC0907F = recyclerView.f2789J) != null) {
            C0943i c0943i = (C0943i) abstractC0907F;
            if (abstractC0926ZM1876I.m2396c().isEmpty() && c0943i.f3910g && !abstractC0926ZM1876I.m2399f()) {
                if (this.f3778b == null) {
                    this.f3778b = new ArrayList();
                }
                abstractC0926ZM1876I.f3828n = this;
                abstractC0926ZM1876I.f3829o = true;
                this.f3778b.add(abstractC0926ZM1876I);
                return;
            }
        }
        if (abstractC0926ZM1876I.m2399f() && !abstractC0926ZM1876I.m2401h() && !recyclerView.f2825l.f3739b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.m1930y());
        }
        abstractC0926ZM1876I.f3828n = this;
        abstractC0926ZM1876I.f3829o = false;
        this.f3777a.add(abstractC0926ZM1876I);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x054e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0148  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p094f0.AbstractC0926Z m2386i(int r29, long r30) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.C0917P.m2386i(int, long):f0.Z");
    }

    /* renamed from: j */
    public final void m2387j(AbstractC0926Z abstractC0926Z) {
        if (abstractC0926Z.f3829o) {
            this.f3778b.remove(abstractC0926Z);
        } else {
            this.f3777a.remove(abstractC0926Z);
        }
        abstractC0926Z.f3828n = null;
        abstractC0926Z.f3829o = false;
        abstractC0926Z.f3824j &= -33;
    }

    /* renamed from: k */
    public final void m2388k() {
        AbstractC0911J abstractC0911J = this.f3784h.f2827m;
        this.f3782f = this.f3781e + (abstractC0911J != null ? abstractC0911J.f3761j : 0);
        ArrayList arrayList = this.f3779c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3782f; size--) {
            m2382e(size);
        }
    }
}
