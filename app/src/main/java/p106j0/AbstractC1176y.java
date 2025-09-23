package p106j0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: j0.y */
/* loaded from: classes.dex */
public abstract class AbstractC1176y {
    /* renamed from: a */
    public static void m2826a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: b */
    public static void m2827b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: c */
    public static void m2828c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
