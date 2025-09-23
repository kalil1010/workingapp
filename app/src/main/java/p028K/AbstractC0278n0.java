package p028K;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import p006C.C0072d;
import p093e2.AbstractC0901d;

/* renamed from: K.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC0278n0 extends C0288s0 {

    /* renamed from: h */
    public static boolean f887h;

    /* renamed from: i */
    public static Method f888i;

    /* renamed from: j */
    public static Class f889j;

    /* renamed from: k */
    public static Field f890k;

    /* renamed from: l */
    public static Field f891l;

    /* renamed from: c */
    public final WindowInsets f892c;

    /* renamed from: d */
    public C0072d[] f893d;

    /* renamed from: e */
    public C0072d f894e;

    /* renamed from: f */
    public C0292u0 f895f;

    /* renamed from: g */
    public C0072d f896g;

    public AbstractC0278n0(C0292u0 c0292u0, WindowInsets windowInsets) {
        super(c0292u0);
        this.f894e = null;
        this.f892c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: r */
    private C0072d m788r(int i2, boolean z2) {
        C0072d c0072dM227a = C0072d.f171e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                c0072dM227a = C0072d.m227a(c0072dM227a, m799s(i3, z2));
            }
        }
        return c0072dM227a;
    }

    /* renamed from: t */
    private C0072d m789t() {
        C0292u0 c0292u0 = this.f895f;
        return c0292u0 != null ? c0292u0.f910a.mo804h() : C0072d.f171e;
    }

    /* renamed from: u */
    private C0072d m790u(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f887h) {
            m791v();
        }
        Method method = f888i;
        if (method != null && f889j != null && f890k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke != null) {
                    Rect rect = (Rect) f890k.get(f891l.get(objInvoke));
                    if (rect != null) {
                        return C0072d.m228b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e3) {
                e3.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: v */
    private static void m791v() throws ClassNotFoundException, SecurityException {
        try {
            f888i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f889j = cls;
            f890k = cls.getDeclaredField("mVisibleInsets");
            f891l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f890k.setAccessible(true);
            f891l.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            e3.getMessage();
        }
        f887h = true;
    }

    @Override // p028K.C0288s0
    /* renamed from: d */
    public void mo792d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0072d c0072dM790u = m790u(view);
        if (c0072dM790u == null) {
            c0072dM790u = C0072d.f171e;
        }
        m800w(c0072dM790u);
    }

    @Override // p028K.C0288s0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f896g, ((AbstractC0278n0) obj).f896g);
        }
        return false;
    }

    @Override // p028K.C0288s0
    /* renamed from: f */
    public C0072d mo793f(int i2) {
        return m788r(i2, false);
    }

    @Override // p028K.C0288s0
    /* renamed from: j */
    public final C0072d mo794j() {
        if (this.f894e == null) {
            WindowInsets windowInsets = this.f892c;
            this.f894e = C0072d.m228b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f894e;
    }

    @Override // p028K.C0288s0
    /* renamed from: l */
    public C0292u0 mo795l(int i2, int i3, int i4, int i5) {
        C0292u0 c0292u0M817g = C0292u0.m817g(null, this.f892c);
        int i6 = Build.VERSION.SDK_INT;
        AbstractC0276m0 c0274l0 = i6 >= 30 ? new C0274l0(c0292u0M817g) : i6 >= 29 ? new C0272k0(c0292u0M817g) : new C0270j0(c0292u0M817g);
        c0274l0.mo755g(C0292u0.m816e(mo794j(), i2, i3, i4, i5));
        c0274l0.mo754e(C0292u0.m816e(mo804h(), i2, i3, i4, i5));
        return c0274l0.mo753b();
    }

    @Override // p028K.C0288s0
    /* renamed from: n */
    public boolean mo796n() {
        return this.f892c.isRound();
    }

    @Override // p028K.C0288s0
    /* renamed from: o */
    public void mo797o(C0072d[] c0072dArr) {
        this.f893d = c0072dArr;
    }

    @Override // p028K.C0288s0
    /* renamed from: p */
    public void mo798p(C0292u0 c0292u0) {
        this.f895f = c0292u0;
    }

    /* renamed from: s */
    public C0072d m799s(int i2, boolean z2) {
        C0072d c0072dMo804h;
        int i3;
        if (i2 == 1) {
            return z2 ? C0072d.m228b(0, Math.max(m789t().f173b, mo794j().f173b), 0, 0) : C0072d.m228b(0, mo794j().f173b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C0072d c0072dM789t = m789t();
                C0072d c0072dMo804h2 = mo804h();
                return C0072d.m228b(Math.max(c0072dM789t.f172a, c0072dMo804h2.f172a), 0, Math.max(c0072dM789t.f174c, c0072dMo804h2.f174c), Math.max(c0072dM789t.f175d, c0072dMo804h2.f175d));
            }
            C0072d c0072dMo794j = mo794j();
            C0292u0 c0292u0 = this.f895f;
            c0072dMo804h = c0292u0 != null ? c0292u0.f910a.mo804h() : null;
            int iMin = c0072dMo794j.f175d;
            if (c0072dMo804h != null) {
                iMin = Math.min(iMin, c0072dMo804h.f175d);
            }
            return C0072d.m228b(c0072dMo794j.f172a, 0, c0072dMo794j.f174c, iMin);
        }
        C0072d c0072d = C0072d.f171e;
        if (i2 == 8) {
            C0072d[] c0072dArr = this.f893d;
            c0072dMo804h = c0072dArr != null ? c0072dArr[AbstractC0901d.m2282L(8)] : null;
            if (c0072dMo804h != null) {
                return c0072dMo804h;
            }
            C0072d c0072dMo794j2 = mo794j();
            C0072d c0072dM789t2 = m789t();
            int i4 = c0072dMo794j2.f175d;
            if (i4 > c0072dM789t2.f175d) {
                return C0072d.m228b(0, 0, 0, i4);
            }
            C0072d c0072d2 = this.f896g;
            return (c0072d2 == null || c0072d2.equals(c0072d) || (i3 = this.f896g.f175d) <= c0072dM789t2.f175d) ? c0072d : C0072d.m228b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return mo811i();
        }
        if (i2 == 32) {
            return mo810g();
        }
        if (i2 == 64) {
            return mo812k();
        }
        if (i2 != 128) {
            return c0072d;
        }
        C0292u0 c0292u02 = this.f895f;
        C0269j c0269jMo809e = c0292u02 != null ? c0292u02.f910a.mo809e() : mo809e();
        if (c0269jMo809e == null) {
            return c0072d;
        }
        int i5 = Build.VERSION.SDK_INT;
        return C0072d.m228b(i5 >= 28 ? AbstractC0267i.m749d(c0269jMo809e.f872a) : 0, i5 >= 28 ? AbstractC0267i.m751f(c0269jMo809e.f872a) : 0, i5 >= 28 ? AbstractC0267i.m750e(c0269jMo809e.f872a) : 0, i5 >= 28 ? AbstractC0267i.m748c(c0269jMo809e.f872a) : 0);
    }

    /* renamed from: w */
    public void m800w(C0072d c0072d) {
        this.f896g = c0072d;
    }
}
