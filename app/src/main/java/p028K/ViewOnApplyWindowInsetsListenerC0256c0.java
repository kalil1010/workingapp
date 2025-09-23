package p028K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p002A1.C0019a;
import p006C.C0072d;
import p020H.RunnableC0181k;

/* renamed from: K.c0 */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0256c0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final C0257d f837a;

    /* renamed from: b */
    public C0292u0 f838b;

    public ViewOnApplyWindowInsetsListenerC0256c0(View view, C0257d c0257d) {
        C0292u0 c0292u0Mo753b;
        this.f837a = c0257d;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        C0292u0 c0292u0M644a = AbstractC0231F.m644a(view);
        if (c0292u0M644a != null) {
            int i2 = Build.VERSION.SDK_INT;
            c0292u0Mo753b = (i2 >= 30 ? new C0274l0(c0292u0M644a) : i2 >= 29 ? new C0272k0(c0292u0M644a) : new C0270j0(c0292u0M644a)).mo753b();
        } else {
            c0292u0Mo753b = null;
        }
        this.f838b = c0292u0Mo753b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0288s0 c0288s0;
        if (!view.isLaidOut()) {
            this.f838b = C0292u0.m817g(view, windowInsets);
            return C0258d0.m738i(view, windowInsets);
        }
        C0292u0 c0292u0M817g = C0292u0.m817g(view, windowInsets);
        if (this.f838b == null) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            this.f838b = AbstractC0231F.m644a(view);
        }
        if (this.f838b == null) {
            this.f838b = c0292u0M817g;
            return C0258d0.m738i(view, windowInsets);
        }
        C0257d c0257dM739j = C0258d0.m739j(view);
        if (c0257dM739j != null && Objects.equals((WindowInsets) c0257dM739j.f840b, windowInsets)) {
            return C0258d0.m738i(view, windowInsets);
        }
        C0292u0 c0292u0 = this.f838b;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            c0288s0 = c0292u0M817g.f910a;
            if (i2 > 256) {
                break;
            }
            if (!c0288s0.mo793f(i2).equals(c0292u0.f910a.mo793f(i2))) {
                i3 |= i2;
            }
            i2 <<= 1;
        }
        if (i3 == 0) {
            return C0258d0.m738i(view, windowInsets);
        }
        C0292u0 c0292u02 = this.f838b;
        C0266h0 c0266h0 = new C0266h0(i3, (i3 & 8) != 0 ? c0288s0.mo793f(8).f175d > c0292u02.f910a.mo793f(8).f175d ? C0258d0.f845e : C0258d0.f846f : C0258d0.f847g, 160L);
        c0266h0.f867a.mo744d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0266h0.f867a.mo741a());
        C0072d c0072dMo793f = c0288s0.mo793f(i3);
        C0072d c0072dMo793f2 = c0292u02.f910a.mo793f(i3);
        int iMin = Math.min(c0072dMo793f.f172a, c0072dMo793f2.f172a);
        int i4 = c0072dMo793f.f173b;
        int i5 = c0072dMo793f2.f173b;
        int iMin2 = Math.min(i4, i5);
        int i6 = c0072dMo793f.f174c;
        int i7 = c0072dMo793f2.f174c;
        int iMin3 = Math.min(i6, i7);
        int i8 = c0072dMo793f.f175d;
        int i9 = c0072dMo793f2.f175d;
        C0019a c0019a = new C0019a(C0072d.m228b(iMin, iMin2, iMin3, Math.min(i8, i9)), 6, C0072d.m228b(Math.max(c0072dMo793f.f172a, c0072dMo793f2.f172a), Math.max(i4, i5), Math.max(i6, i7), Math.max(i8, i9)));
        C0258d0.m735f(view, windowInsets, false);
        duration.addUpdateListener(new C0252a0(c0266h0, c0292u0M817g, c0292u02, i3, view));
        duration.addListener(new C0254b0(c0266h0, view, 0));
        ViewTreeObserverOnPreDrawListenerC0289t.m814a(view, new RunnableC0181k(view, c0266h0, c0019a, duration));
        this.f838b = c0292u0M817g;
        return C0258d0.m738i(view, windowInsets);
    }
}
