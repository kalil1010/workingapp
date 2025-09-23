package p028K;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: K.F */
/* loaded from: classes.dex */
public abstract class AbstractC0231F {
    /* renamed from: a */
    public static C0292u0 m644a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0292u0 c0292u0M817g = C0292u0.m817g(null, rootWindowInsets);
        C0288s0 c0288s0 = c0292u0M817g.f910a;
        c0288s0.mo798p(c0292u0M817g);
        c0288s0.mo792d(view.getRootView());
        return c0292u0M817g;
    }

    /* renamed from: b */
    public static int m645b(View view) {
        return view.getScrollIndicators();
    }

    /* renamed from: c */
    public static void m646c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    /* renamed from: d */
    public static void m647d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
