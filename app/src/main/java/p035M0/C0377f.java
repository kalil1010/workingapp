package p035M0;

import android.view.SubMenu;
import p102i.C1008n;
import p102i.MenuC1006l;

/* renamed from: M0.f */
/* loaded from: classes.dex */
public final class C0377f extends MenuC1006l {
    @Override // p102i.MenuC1006l, android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C1008n c1008nM2570a = m2570a(i2, i3, i4, charSequence);
        C0389r c0389r = new C0389r(this.f4251a, this, c1008nM2570a);
        c1008nM2570a.f4295o = c0389r;
        c0389r.setHeaderTitle(c1008nM2570a.f4285e);
        return c0389r;
    }
}
