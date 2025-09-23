package p001A0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p093e2.AbstractC0901d;

/* renamed from: A0.b */
/* loaded from: classes.dex */
public final class C0003b extends AbstractC0901d {

    /* renamed from: c */
    public int f2c;

    /* renamed from: d */
    public int f3d = -1;

    /* renamed from: e */
    public final /* synthetic */ SwipeDismissBehavior f4e;

    public C0003b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4e = swipeDismissBehavior;
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: J */
    public final int mo6J(View view) {
        return view.getWidth();
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: Z */
    public final void mo7Z(View view, int i2) {
        this.f3d = i2;
        this.f2c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4e;
            swipeDismissBehavior.f3046c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f3046c = false;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: a0 */
    public final void mo8a0(int i2) {
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: b0 */
    public final void mo9b0(View view, int i2, int i3) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4e;
        float f = width * swipeDismissBehavior.f3048e;
        float width2 = view.getWidth() * swipeDismissBehavior.f3049f;
        float fAbs = Math.abs(i2 - this.f2c);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    @Override // p093e2.AbstractC0901d
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo10c0(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f3d = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.f4e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = p028K.AbstractC0241P.f815a
            int r5 = r9.getLayoutDirection()
            if (r5 != r3) goto L1a
            r5 = r3
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r2.f3047d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r3) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f2c
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f2c
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r10 = r8.f2c
            int r0 = r10 - r11
            goto L69
        L66:
            int r0 = r8.f2c
            r3 = r4
        L69:
            T.e r10 = r2.f3044a
            int r11 = r9.getTop()
            boolean r10 = r10.m1266p(r0, r11)
            if (r10 == 0) goto L7f
            A0.d r10 = new A0.d
            r10.<init>(r2, r9, r3)
            java.util.WeakHashMap r11 = p028K.AbstractC0241P.f815a
            r9.postOnAnimation(r10)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001A0.C0003b.mo10c0(android.view.View, float, float):void");
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: i */
    public final int mo11i(View view, int i2) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i3 = this.f4e.f3047d;
        if (i3 == 0) {
            if (z2) {
                width = this.f2c - view.getWidth();
                width2 = this.f2c;
            } else {
                width = this.f2c;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i3 != 1) {
            width = this.f2c - view.getWidth();
            width2 = view.getWidth() + this.f2c;
        } else if (z2) {
            width = this.f2c;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f2c - view.getWidth();
            width2 = this.f2c;
        }
        return Math.min(Math.max(width, i2), width2);
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: j */
    public final int mo12j(View view, int i2) {
        return view.getTop();
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: t0 */
    public final boolean mo13t0(View view, int i2) {
        int i3 = this.f3d;
        return (i3 == -1 || i3 == i2) && this.f4e.mo2037v(view);
    }
}
