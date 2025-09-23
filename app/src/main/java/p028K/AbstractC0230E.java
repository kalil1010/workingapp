package p028K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import p006C.C0072d;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: K.E */
/* loaded from: classes.dex */
public abstract class AbstractC0230E {
    /* renamed from: a */
    public static void m618a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: b */
    public static C0292u0 m619b(View view, C0292u0 c0292u0, Rect rect) {
        WindowInsets windowInsetsM822f = c0292u0.m822f();
        if (windowInsetsM822f != null) {
            return C0292u0.m817g(view, view.computeSystemWindowInsets(windowInsetsM822f, rect));
        }
        rect.setEmpty();
        return c0292u0;
    }

    /* renamed from: c */
    public static boolean m620c(View view, float f, float f2, boolean z2) {
        return view.dispatchNestedFling(f, f2, z2);
    }

    /* renamed from: d */
    public static boolean m621d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* renamed from: e */
    public static boolean m622e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    /* renamed from: f */
    public static boolean m623f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    /* renamed from: g */
    public static ColorStateList m624g(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: h */
    public static PorterDuff.Mode m625h(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: i */
    public static float m626i(View view) {
        return view.getElevation();
    }

    /* renamed from: j */
    public static C0292u0 m627j(View view) throws IllegalAccessException, IllegalArgumentException {
        if (!AbstractC0268i0.f871d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC0268i0.f868a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC0268i0.f869b.get(obj);
            Rect rect2 = (Rect) AbstractC0268i0.f870c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            AbstractC0276m0 c0274l0 = i2 >= 30 ? new C0274l0() : i2 >= 29 ? new C0272k0() : new C0270j0();
            c0274l0.mo754e(C0072d.m228b(rect.left, rect.top, rect.right, rect.bottom));
            c0274l0.mo755g(C0072d.m228b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C0292u0 c0292u0Mo753b = c0274l0.mo753b();
            c0292u0Mo753b.f910a.mo798p(c0292u0Mo753b);
            c0292u0Mo753b.f910a.mo792d(view.getRootView());
            return c0292u0Mo753b;
        } catch (IllegalAccessException e3) {
            e3.getMessage();
            return null;
        }
    }

    /* renamed from: k */
    public static String m628k(View view) {
        return view.getTransitionName();
    }

    /* renamed from: l */
    public static float m629l(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: m */
    public static float m630m(View view) {
        return view.getZ();
    }

    /* renamed from: n */
    public static boolean m631n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* renamed from: o */
    public static boolean m632o(View view) {
        return view.isImportantForAccessibility();
    }

    /* renamed from: p */
    public static boolean m633p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: q */
    public static void m634q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: r */
    public static void m635r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: s */
    public static void m636s(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: t */
    public static void m637t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    /* renamed from: u */
    public static void m638u(View view, InterfaceC0283q interfaceC0283q) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0283q);
        }
        if (interfaceC0283q == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0229D(view, interfaceC0283q));
        }
    }

    /* renamed from: v */
    public static void m639v(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: w */
    public static void m640w(View view, float f) {
        view.setTranslationZ(f);
    }

    /* renamed from: x */
    public static void m641x(View view, float f) {
        view.setZ(f);
    }

    /* renamed from: y */
    public static boolean m642y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    /* renamed from: z */
    public static void m643z(View view) {
        view.stopNestedScroll();
    }
}
