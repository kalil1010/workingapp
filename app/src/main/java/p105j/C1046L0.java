package p105j;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p080b1.C0770h;
import p102i.C1008n;
import p102i.MenuC1006l;

/* renamed from: j.L0 */
/* loaded from: classes.dex */
public final class C1046L0 extends C1034F0 implements InterfaceC1036G0 {

    /* renamed from: D */
    public static final Method f4393D;

    /* renamed from: C */
    public C0770h f4394C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f4393D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p105j.InterfaceC1036G0
    /* renamed from: g */
    public final void mo1983g(MenuC1006l menuC1006l, C1008n c1008n) {
        C0770h c0770h = this.f4394C;
        if (c0770h != null) {
            c0770h.mo1983g(menuC1006l, c1008n);
        }
    }

    @Override // p105j.InterfaceC1036G0
    /* renamed from: k */
    public final void mo1985k(MenuC1006l menuC1006l, C1008n c1008n) {
        C0770h c0770h = this.f4394C;
        if (c0770h != null) {
            c0770h.mo1985k(menuC1006l, c1008n);
        }
    }

    @Override // p105j.C1034F0
    /* renamed from: q */
    public final C1135u0 mo2631q(Context context, boolean z2) {
        C1044K0 c1044k0 = new C1044K0(context, z2);
        c1044k0.setHoverListener(this);
        return c1044k0;
    }
}
