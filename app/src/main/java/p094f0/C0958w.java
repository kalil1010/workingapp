package p094f0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.w */
/* loaded from: classes.dex */
public class C0958w {

    /* renamed from: a */
    public int f4013a = -1;

    /* renamed from: b */
    public RecyclerView f4014b;

    /* renamed from: c */
    public AbstractC0911J f4015c;

    /* renamed from: d */
    public boolean f4016d;

    /* renamed from: e */
    public boolean f4017e;

    /* renamed from: f */
    public View f4018f;

    /* renamed from: g */
    public final C0921U f4019g;

    /* renamed from: h */
    public final LinearInterpolator f4020h;

    /* renamed from: i */
    public final DecelerateInterpolator f4021i;

    /* renamed from: j */
    public PointF f4022j;

    /* renamed from: k */
    public final DisplayMetrics f4023k;

    /* renamed from: l */
    public boolean f4024l;

    /* renamed from: m */
    public float f4025m;

    /* renamed from: n */
    public int f4026n;

    /* renamed from: o */
    public int f4027o;

    public C0958w(Context context) {
        C0921U c0921u = new C0921U();
        c0921u.f3790d = -1;
        c0921u.f3792f = false;
        c0921u.f3787a = 0;
        c0921u.f3788b = 0;
        c0921u.f3789c = Integer.MIN_VALUE;
        c0921u.f3791e = null;
        this.f4019g = c0921u;
        this.f4020h = new LinearInterpolator();
        this.f4021i = new DecelerateInterpolator();
        this.f4024l = false;
        this.f4026n = 0;
        this.f4027o = 0;
        this.f4023k = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public static int m2464a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                return i5 - i3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    /* renamed from: b */
    public int mo378b(View view, int i2) {
        AbstractC0911J abstractC0911J = this.f4015c;
        if (abstractC0911J == null || !abstractC0911J.mo1862d()) {
            return 0;
        }
        C0912K c0912k = (C0912K) view.getLayoutParams();
        return m2464a((view.getLeft() - ((C0912K) view.getLayoutParams()).f3768b.left) - ((ViewGroup.MarginLayoutParams) c0912k).leftMargin, view.getRight() + ((C0912K) view.getLayoutParams()).f3768b.right + ((ViewGroup.MarginLayoutParams) c0912k).rightMargin, abstractC0911J.m2356E(), abstractC0911J.f3765n - abstractC0911J.m2357F(), i2);
    }

    /* renamed from: c */
    public int mo379c(View view, int i2) {
        AbstractC0911J abstractC0911J = this.f4015c;
        if (abstractC0911J == null || !abstractC0911J.mo1865e()) {
            return 0;
        }
        C0912K c0912k = (C0912K) view.getLayoutParams();
        return m2464a((view.getTop() - ((C0912K) view.getLayoutParams()).f3768b.top) - ((ViewGroup.MarginLayoutParams) c0912k).topMargin, view.getBottom() + ((C0912K) view.getLayoutParams()).f3768b.bottom + ((ViewGroup.MarginLayoutParams) c0912k).bottomMargin, abstractC0911J.m2358G(), abstractC0911J.f3766o - abstractC0911J.m2355D(), i2);
    }

    /* renamed from: d */
    public float mo380d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: e */
    public int mo381e(int i2) {
        float fAbs = Math.abs(i2);
        if (!this.f4024l) {
            this.f4025m = mo380d(this.f4023k);
            this.f4024l = true;
        }
        return (int) Math.ceil(fAbs * this.f4025m);
    }

    /* renamed from: f */
    public PointF mo382f(int i2) {
        Object obj = this.f4015c;
        if (obj instanceof InterfaceC0922V) {
            return ((InterfaceC0922V) obj).mo1858a(i2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2465g(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.C0958w.m2465g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo383h(android.view.View r7, p094f0.C0921U r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f4022j
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.mo378b(r7, r0)
            android.graphics.PointF r5 = r6.f4022j
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.mo379c(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.mo381e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r3 = r6.f4021i
            r8.f3787a = r0
            r8.f3788b = r7
            r8.f3789c = r2
            r8.f3791e = r3
            r8.f3792f = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.C0958w.mo383h(android.view.View, f0.U):void");
    }

    /* renamed from: i */
    public final void m2466i() {
        if (this.f4017e) {
            this.f4017e = false;
            this.f4027o = 0;
            this.f4026n = 0;
            this.f4022j = null;
            this.f4014b.f2812e0.f3793a = -1;
            this.f4018f = null;
            this.f4013a = -1;
            this.f4016d = false;
            AbstractC0911J abstractC0911J = this.f4015c;
            if (abstractC0911J.f3756e == this) {
                abstractC0911J.f3756e = null;
            }
            this.f4015c = null;
            this.f4014b = null;
        }
    }
}
