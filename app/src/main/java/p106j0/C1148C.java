package p106j0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: j0.C */
/* loaded from: classes.dex */
public final class C1148C extends C1147B {
    @Override // p033L1.AbstractC0364l
    /* renamed from: L */
    public final float mo1018L(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: h0 */
    public final void mo1026h0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p106j0.C1147B, p033L1.AbstractC0364l
    /* renamed from: i0 */
    public final void mo1027i0(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // p106j0.C1147B
    /* renamed from: m0 */
    public final void mo2765m0(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // p106j0.C1147B
    /* renamed from: n0 */
    public final void mo2766n0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p106j0.C1147B
    /* renamed from: o0 */
    public final void mo2767o0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
