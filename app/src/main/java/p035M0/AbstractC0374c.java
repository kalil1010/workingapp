package p035M0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: M0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0374c {

    /* renamed from: a */
    public static final ThreadLocal f1200a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f1201b = new ThreadLocal();

    /* renamed from: a */
    public static void m1056a(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            m1056a(viewGroup, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
