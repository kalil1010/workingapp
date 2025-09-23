package p028K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p006C.C0072d;

/* renamed from: K.u0 */
/* loaded from: classes.dex */
public final class C0292u0 {

    /* renamed from: b */
    public static final C0292u0 f909b;

    /* renamed from: a */
    public final C0288s0 f910a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f909b = C0286r0.f903q;
        } else {
            f909b = C0288s0.f904b;
        }
    }

    public C0292u0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f910a = new C0286r0(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f910a = new C0284q0(this, windowInsets);
        } else if (i2 >= 28) {
            this.f910a = new C0282p0(this, windowInsets);
        } else {
            this.f910a = new C0280o0(this, windowInsets);
        }
    }

    /* renamed from: e */
    public static C0072d m816e(C0072d c0072d, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, c0072d.f172a - i2);
        int iMax2 = Math.max(0, c0072d.f173b - i3);
        int iMax3 = Math.max(0, c0072d.f174c - i4);
        int iMax4 = Math.max(0, c0072d.f175d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? c0072d : C0072d.m228b(iMax, iMax2, iMax3, iMax4);
    }

    /* renamed from: g */
    public static C0292u0 m817g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0292u0 c0292u0 = new C0292u0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            C0292u0 c0292u0M644a = AbstractC0231F.m644a(view);
            C0288s0 c0288s0 = c0292u0.f910a;
            c0288s0.mo798p(c0292u0M644a);
            c0288s0.mo792d(view.getRootView());
        }
        return c0292u0;
    }

    /* renamed from: a */
    public final int m818a() {
        return this.f910a.mo794j().f175d;
    }

    /* renamed from: b */
    public final int m819b() {
        return this.f910a.mo794j().f172a;
    }

    /* renamed from: c */
    public final int m820c() {
        return this.f910a.mo794j().f174c;
    }

    /* renamed from: d */
    public final int m821d() {
        return this.f910a.mo794j().f173b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0292u0)) {
            return false;
        }
        return Objects.equals(this.f910a, ((C0292u0) obj).f910a);
    }

    /* renamed from: f */
    public final WindowInsets m822f() {
        C0288s0 c0288s0 = this.f910a;
        if (c0288s0 instanceof AbstractC0278n0) {
            return ((AbstractC0278n0) c0288s0).f892c;
        }
        return null;
    }

    public final int hashCode() {
        C0288s0 c0288s0 = this.f910a;
        if (c0288s0 == null) {
            return 0;
        }
        return c0288s0.hashCode();
    }

    public C0292u0() {
        this.f910a = new C0288s0(this);
    }
}
