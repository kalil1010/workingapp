package p007C0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p006C.AbstractC0075g;
import p093e2.AbstractC0901d;
import p144x.AbstractC1388a;

/* renamed from: C0.e */
/* loaded from: classes.dex */
public final class C0087e extends AbstractC0901d {

    /* renamed from: c */
    public final /* synthetic */ int f205c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC1388a f206d;

    public /* synthetic */ C0087e(AbstractC1388a abstractC1388a, int i2) {
        this.f205c = i2;
        this.f206d = abstractC1388a;
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: J */
    public int mo6J(View view) {
        switch (this.f205c) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f206d;
                return sideSheetBehavior.f3312l + sideSheetBehavior.f3315o;
            default:
                return super.mo6J(view);
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: K */
    public int mo280K() {
        switch (this.f205c) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f206d;
                return bottomSheetBehavior.f3059I ? bottomSheetBehavior.f3070T : bottomSheetBehavior.f3057G;
            default:
                return super.mo280K();
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: a0 */
    public final void mo8a0(int i2) throws Resources.NotFoundException {
        switch (this.f205c) {
            case 0:
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f206d;
                    if (bottomSheetBehavior.f3061K) {
                        bottomSheetBehavior.m2045G(1);
                        break;
                    }
                }
                break;
            default:
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f206d;
                    if (sideSheetBehavior.f3307g) {
                        sideSheetBehavior.m2108w(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: b0 */
    public final void mo9b0(View view, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f205c) {
            case 0:
                ((BottomSheetBehavior) this.f206d).m2058y(i3);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f206d;
                WeakReference weakReference = sideSheetBehavior.f3317q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f3301a.mo1329v0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f3322v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f3301a.mo1325d(i2);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC0075g.m235d(it);
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // p093e2.AbstractC0901d
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo10c0(android.view.View r6, float r7, float r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007C0.C0087e.mo10c0(android.view.View, float, float):void");
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: i */
    public final int mo11i(View view, int i2) {
        switch (this.f205c) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f206d;
                return AbstractC0901d.m2299h(i2, sideSheetBehavior.f3301a.mo1317E(), sideSheetBehavior.f3301a.mo1316D());
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: j */
    public final int mo12j(View view, int i2) {
        switch (this.f205c) {
            case 0:
                return AbstractC0901d.m2299h(i2, ((BottomSheetBehavior) this.f206d).m2040B(), mo280K());
            default:
                return view.getTop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // p093e2.AbstractC0901d
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo13t0(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f205c
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            x.a r6 = r4.f206d
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f3308h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.f3316p
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            x.a r0 = r4.f206d
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.f3062L
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.f3080b0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.f3076Z
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.f3072V
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r6 = r0.f3071U
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p007C0.C0087e.mo13t0(android.view.View, int):boolean");
    }
}
