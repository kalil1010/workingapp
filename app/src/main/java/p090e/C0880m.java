package p090e;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000A.AbstractC0001b;
import p002A1.C0027i;
import p006C.C0072d;
import p028K.AbstractC0228C;
import p028K.AbstractC0231F;
import p028K.AbstractC0241P;
import p028K.AbstractC0276m0;
import p028K.C0270j0;
import p028K.C0272k0;
import p028K.C0274l0;
import p028K.C0292u0;
import p028K.InterfaceC0283q;
import p102i.InterfaceC1018x;
import p102i.MenuC1006l;
import p105j.AbstractC1133t1;
import p105j.C1112m1;
import p105j.InterfaceC1108l0;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: e.m */
/* loaded from: classes.dex */
public final class C0880m implements InterfaceC0283q, InterfaceC1108l0, InterfaceC0868a, InterfaceC1018x {

    /* renamed from: a */
    public final /* synthetic */ int f3624a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0888u f3625b;

    public /* synthetic */ C0880m(LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u, int i2) {
        this.f3624a = i2;
        this.f3625b = layoutInflaterFactory2C0888u;
    }

    @Override // p102i.InterfaceC1018x
    /* renamed from: a */
    public void mo1977a(MenuC1006l menuC1006l, boolean z2) {
        C0887t c0887t;
        switch (this.f3624a) {
            case 3:
                this.f3625b.m2262q(menuC1006l);
                break;
            default:
                MenuC1006l menuC1006lMo2557k = menuC1006l.mo2557k();
                int i2 = 0;
                boolean z3 = menuC1006lMo2557k != menuC1006l;
                if (z3) {
                    menuC1006l = menuC1006lMo2557k;
                }
                LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = this.f3625b;
                C0887t[] c0887tArr = layoutInflaterFactory2C0888u.f3668L;
                int length = c0887tArr != null ? c0887tArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        c0887t = null;
                    } else {
                        c0887t = c0887tArr[i2];
                        if (c0887t == null || c0887t.f3644h != menuC1006l) {
                            i2++;
                        }
                    }
                }
                if (c0887t != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0888u.m2263r(c0887t, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0888u.m2261p(c0887t.f3637a, c0887t, menuC1006lMo2557k);
                        layoutInflaterFactory2C0888u.m2263r(c0887t, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p090e.InterfaceC0868a
    /* renamed from: b */
    public void mo119b(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = this.f3625b;
        layoutInflaterFactory2C0888u.m2250A();
        C0867H c0867h = layoutInflaterFactory2C0888u.f3695o;
        if (c0867h != null) {
            C1112m1 c1112m1 = (C1112m1) c0867h.f3557r;
            c1112m1.f4577j = i2 == 0 ? null : c1112m1.f4568a.getContext().getString(i2);
            c1112m1.m2729b();
        }
    }

    @Override // p090e.InterfaceC0868a
    /* renamed from: c */
    public boolean mo120c() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = this.f3625b;
        layoutInflaterFactory2C0888u.m2250A();
        C0867H c0867h = layoutInflaterFactory2C0888u.f3695o;
        return (c0867h == null || (((C1112m1) c0867h.f3557r).f4569b & 4) == 0) ? false : true;
    }

    @Override // p028K.InterfaceC0283q
    /* renamed from: d */
    public C0292u0 mo67d(View view, C0292u0 c0292u0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2;
        boolean z3;
        boolean z4;
        C0292u0 c0292u0Mo753b = c0292u0;
        int iM821d = c0292u0Mo753b.m821d();
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = this.f3625b;
        layoutInflaterFactory2C0888u.getClass();
        int iM821d2 = c0292u0Mo753b.m821d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0888u.f3702v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0888u.f3702v.getLayoutParams();
            if (layoutInflaterFactory2C0888u.f3702v.isShown()) {
                if (layoutInflaterFactory2C0888u.f3685c0 == null) {
                    layoutInflaterFactory2C0888u.f3685c0 = new Rect();
                    layoutInflaterFactory2C0888u.f3686d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0888u.f3685c0;
                Rect rect2 = layoutInflaterFactory2C0888u.f3686d0;
                rect.set(c0292u0Mo753b.m819b(), c0292u0Mo753b.m821d(), c0292u0Mo753b.m820c(), c0292u0Mo753b.m818a());
                ViewGroup viewGroup = layoutInflaterFactory2C0888u.f3657A;
                Method method = AbstractC1133t1.f4638a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0888u.f3657A;
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                C0292u0 c0292u0M644a = AbstractC0231F.m644a(viewGroup2);
                int iM819b = c0292u0M644a == null ? 0 : c0292u0M644a.m819b();
                int iM820c = c0292u0M644a == null ? 0 : c0292u0M644a.m820c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z4 = true;
                }
                Context context = layoutInflaterFactory2C0888u.f3691k;
                if (i2 <= 0 || layoutInflaterFactory2C0888u.f3659C != null) {
                    View view2 = layoutInflaterFactory2C0888u.f3659C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iM819b || marginLayoutParams2.rightMargin != iM820c) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iM819b;
                            marginLayoutParams2.rightMargin = iM820c;
                            layoutInflaterFactory2C0888u.f3659C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0888u.f3659C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM819b;
                    layoutParams.rightMargin = iM820c;
                    layoutInflaterFactory2C0888u.f3657A.addView(layoutInflaterFactory2C0888u.f3659C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0888u.f3659C;
                boolean z5 = view4 != null;
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0888u.f3659C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC0001b.m3a(context, R.color.abc_decor_view_status_guard_light) : AbstractC0001b.m3a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0888u.f3664H && z5) {
                    iM821d2 = 0;
                }
                z2 = z5;
                z3 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (z3) {
                layoutInflaterFactory2C0888u.f3702v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0888u.f3659C;
        if (view6 != null) {
            view6.setVisibility(z2 ? 0 : 8);
        }
        if (iM821d != iM821d2) {
            int iM819b2 = c0292u0Mo753b.m819b();
            int iM820c2 = c0292u0Mo753b.m820c();
            int iM818a = c0292u0Mo753b.m818a();
            int i7 = Build.VERSION.SDK_INT;
            AbstractC0276m0 c0274l0 = i7 >= 30 ? new C0274l0(c0292u0Mo753b) : i7 >= 29 ? new C0272k0(c0292u0Mo753b) : new C0270j0(c0292u0Mo753b);
            c0274l0.mo755g(C0072d.m228b(iM819b2, iM821d2, iM820c2, iM818a));
            c0292u0Mo753b = c0274l0.mo753b();
        }
        WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
        WindowInsets windowInsetsM822f = c0292u0Mo753b.m822f();
        if (windowInsetsM822f == null) {
            return c0292u0Mo753b;
        }
        WindowInsets windowInsetsM616b = AbstractC0228C.m616b(view, windowInsetsM822f);
        return !windowInsetsM616b.equals(windowInsetsM822f) ? C0292u0.m817g(view, windowInsetsM616b) : c0292u0Mo753b;
    }

    @Override // p090e.InterfaceC0868a
    /* renamed from: e */
    public void mo122e(Drawable drawable, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = this.f3625b;
        layoutInflaterFactory2C0888u.m2250A();
        C0867H c0867h = layoutInflaterFactory2C0888u.f3695o;
        if (c0867h != null) {
            C1112m1 c1112m1 = (C1112m1) c0867h.f3557r;
            c1112m1.f4573f = drawable;
            int i3 = c1112m1.f4569b & 4;
            Toolbar toolbar = c1112m1.f4568a;
            if (i3 != 0) {
                if (drawable == null) {
                    drawable = c1112m1.f4582o;
                }
                toolbar.setNavigationIcon(drawable);
            } else {
                toolbar.setNavigationIcon((Drawable) null);
            }
            C1112m1 c1112m12 = (C1112m1) c0867h.f3557r;
            c1112m12.f4577j = i2 != 0 ? c1112m12.f4568a.getContext().getString(i2) : null;
            c1112m12.m2729b();
        }
    }

    @Override // p102i.InterfaceC1018x
    /* renamed from: f */
    public boolean mo1979f(MenuC1006l menuC1006l) {
        Window.Callback callback;
        switch (this.f3624a) {
            case 3:
                Window.Callback callback2 = this.f3625b.f3692l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC1006l);
                    break;
                }
                break;
            default:
                if (menuC1006l == menuC1006l.mo2557k()) {
                    LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = this.f3625b;
                    if (layoutInflaterFactory2C0888u.f3662F && (callback = layoutInflaterFactory2C0888u.f3692l.getCallback()) != null && !layoutInflaterFactory2C0888u.f3673Q) {
                        callback.onMenuOpened(108, menuC1006l);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // p090e.InterfaceC0868a
    /* renamed from: m */
    public Context mo129m() {
        return this.f3625b.m2268x();
    }

    @Override // p090e.InterfaceC0868a
    /* renamed from: n */
    public Drawable mo130n() {
        C0027i c0027iM97M = C0027i.m97M(this.f3625b.m2268x(), null, new int[]{R.attr.homeAsUpIndicator});
        Drawable drawableM100B = c0027iM97M.m100B(0);
        c0027iM97M.m114R();
        return drawableM100B;
    }
}
