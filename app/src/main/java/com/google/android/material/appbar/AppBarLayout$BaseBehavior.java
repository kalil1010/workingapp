package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p151z0.AbstractC1417a;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC1417a {

    /* renamed from: b */
    public boolean f3024b;

    /* renamed from: d */
    public int f3026d;

    /* renamed from: f */
    public VelocityTracker f3028f;

    /* renamed from: c */
    public int f3025c = -1;

    /* renamed from: e */
    public int f3027e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // p144x.AbstractC1388a
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2021j(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.MotionEvent r6) {
        /*
            r3 = this;
            int r5 = r3.f3027e
            if (r5 >= 0) goto L12
            android.content.Context r4 = r4.getContext()
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r4 = r4.getScaledTouchSlop()
            r3.f3027e = r4
        L12:
            int r4 = r6.getActionMasked()
            r5 = 2
            r0 = -1
            r1 = 0
            if (r4 != r5) goto L40
            boolean r4 = r3.f3024b
            if (r4 == 0) goto L40
            int r4 = r3.f3025c
            if (r4 != r0) goto L24
            goto L4d
        L24:
            int r4 = r6.findPointerIndex(r4)
            if (r4 != r0) goto L2b
            goto L4d
        L2b:
            float r4 = r6.getY(r4)
            int r4 = (int) r4
            int r5 = r3.f3026d
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r2 = r3.f3027e
            if (r5 <= r2) goto L40
            r3.f3026d = r4
            r4 = 1
            return r4
        L40:
            int r4 = r6.getActionMasked()
            if (r4 == 0) goto L4e
            android.view.VelocityTracker r4 = r3.f3028f
            if (r4 == 0) goto L4d
            r4.addMovement(r6)
        L4d:
            return r1
        L4e:
            r3.f3025c = r0
            r6.getX()
            r6.getY()
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.mo2021j(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // p151z0.AbstractC1417a, p144x.AbstractC1388a
    /* renamed from: k */
    public final boolean mo2022k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: l */
    public final boolean mo2023l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: n */
    public final /* synthetic */ void mo2024n(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: o */
    public final void mo2025o(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: q */
    public final void mo2026q(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: r */
    public final Parcelable mo2027r(View view) {
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: s */
    public final boolean mo2028s(View view, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: t */
    public final void mo2029t(View view, View view2, int i2) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[RETURN] */
    @Override // p144x.AbstractC1388a
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2030u(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L46
            r4 = 2
            if (r0 == r4) goto L2d
            r6 = 3
            if (r0 == r6) goto L4a
            r6 = 6
            if (r0 == r6) goto L13
            goto L58
        L13:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L1b
            r6 = r2
            goto L1c
        L1b:
            r6 = r3
        L1c:
            int r0 = r7.getPointerId(r6)
            r5.f3025c = r0
            float r6 = r7.getY(r6)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.f3026d = r6
            goto L58
        L2d:
            int r0 = r5.f3025c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L36
            goto L63
        L36:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.f3026d = r7
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        L46:
            android.view.VelocityTracker r0 = r5.f3028f
            if (r0 != 0) goto L65
        L4a:
            r5.f3024b = r3
            r5.f3025c = r1
            android.view.VelocityTracker r6 = r5.f3028f
            if (r6 == 0) goto L58
            r6.recycle()
            r6 = 0
            r5.f3028f = r6
        L58:
            android.view.VelocityTracker r6 = r5.f3028f
            if (r6 == 0) goto L5f
            r6.addMovement(r7)
        L5f:
            boolean r6 = r5.f3024b
            if (r6 != 0) goto L64
        L63:
            return r3
        L64:
            return r2
        L65:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f3028f
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f3028f
            int r0 = r5.f3025c
            r7.getYVelocity(r0)
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.mo2030u(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
