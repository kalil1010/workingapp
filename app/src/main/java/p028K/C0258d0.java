package p028K;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import p002A1.C0019a;
import p072Z.C0603a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: K.d0 */
/* loaded from: classes.dex */
public final class C0258d0 extends AbstractC0264g0 {

    /* renamed from: e */
    public static final PathInterpolator f845e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f */
    public static final C0603a f846f = new C0603a(0);

    /* renamed from: g */
    public static final DecelerateInterpolator f847g = new DecelerateInterpolator();

    /* renamed from: e */
    public static void m734e(View view) {
        C0257d c0257dM739j = m739j(view);
        if (c0257dM739j != null) {
            ((View) c0257dM739j.f843e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m734e(viewGroup.getChildAt(i2));
            }
        }
    }

    /* renamed from: f */
    public static void m735f(View view, WindowInsets windowInsets, boolean z2) {
        C0257d c0257dM739j = m739j(view);
        if (c0257dM739j != null) {
            c0257dM739j.f840b = windowInsets;
            if (!z2) {
                View view2 = (View) c0257dM739j.f843e;
                int[] iArr = (int[]) c0257dM739j.f844f;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                c0257dM739j.f841c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m735f(viewGroup.getChildAt(i2), windowInsets, z2);
            }
        }
    }

    /* renamed from: g */
    public static void m736g(View view, C0292u0 c0292u0, List list) {
        C0257d c0257dM739j = m739j(view);
        if (c0257dM739j != null) {
            c0257dM739j.m733d(c0292u0, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m736g(viewGroup.getChildAt(i2), c0292u0, list);
            }
        }
    }

    /* renamed from: h */
    public static void m737h(View view, C0019a c0019a) {
        C0257d c0257dM739j = m739j(view);
        if (c0257dM739j != null) {
            View view2 = (View) c0257dM739j.f843e;
            int[] iArr = (int[]) c0257dM739j.f844f;
            view2.getLocationOnScreen(iArr);
            int i2 = c0257dM739j.f841c - iArr[1];
            c0257dM739j.f842d = i2;
            view2.setTranslationY(i2);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                m737h(viewGroup.getChildAt(i3), c0019a);
            }
        }
    }

    /* renamed from: i */
    public static WindowInsets m738i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: j */
    public static C0257d m739j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0256c0) {
            return ((ViewOnApplyWindowInsetsListenerC0256c0) tag).f837a;
        }
        return null;
    }
}
