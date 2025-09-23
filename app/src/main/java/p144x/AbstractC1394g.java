package p144x;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: x.g */
/* loaded from: classes.dex */
public abstract class AbstractC1394g {

    /* renamed from: a */
    public static final ThreadLocal f6025a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f6026b = new ThreadLocal();

    /* renamed from: a */
    public static void m3163a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            m3163a(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
