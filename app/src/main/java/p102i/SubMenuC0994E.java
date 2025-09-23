package p102i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p006C.AbstractC0075g;

/* renamed from: i.E */
/* loaded from: classes.dex */
public class SubMenuC0994E extends MenuC1006l implements SubMenu {

    /* renamed from: A */
    public final C1008n f4184A;

    /* renamed from: z */
    public final MenuC1006l f4185z;

    public SubMenuC0994E(Context context, MenuC1006l menuC1006l, C1008n c1008n) {
        super(context);
        this.f4185z = menuC1006l;
        this.f4184A = c1008n;
    }

    @Override // p102i.MenuC1006l
    /* renamed from: d */
    public final boolean mo2553d(C1008n c1008n) {
        return this.f4185z.mo2553d(c1008n);
    }

    @Override // p102i.MenuC1006l
    /* renamed from: e */
    public final boolean mo2554e(MenuC1006l menuC1006l, MenuItem menuItem) {
        return super.mo2554e(menuC1006l, menuItem) || this.f4185z.mo2554e(menuC1006l, menuItem);
    }

    @Override // p102i.MenuC1006l
    /* renamed from: f */
    public final boolean mo2555f(C1008n c1008n) {
        return this.f4185z.mo2555f(c1008n);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4184A;
    }

    @Override // p102i.MenuC1006l
    /* renamed from: j */
    public final String mo2556j() {
        C1008n c1008n = this.f4184A;
        int i2 = c1008n != null ? c1008n.f4281a : 0;
        if (i2 == 0) {
            return null;
        }
        return AbstractC0075g.m236e("android:menu:actionviewstates:", i2);
    }

    @Override // p102i.MenuC1006l
    /* renamed from: k */
    public final MenuC1006l mo2557k() {
        return this.f4185z.mo2557k();
    }

    @Override // p102i.MenuC1006l
    /* renamed from: m */
    public final boolean mo2558m() {
        return this.f4185z.mo2558m();
    }

    @Override // p102i.MenuC1006l
    /* renamed from: n */
    public final boolean mo2559n() {
        return this.f4185z.mo2559n();
    }

    @Override // p102i.MenuC1006l
    /* renamed from: o */
    public final boolean mo2560o() {
        return this.f4185z.mo2560o();
    }

    @Override // p102i.MenuC1006l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f4185z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m2581u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m2581u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m2581u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4184A.setIcon(drawable);
        return this;
    }

    @Override // p102i.MenuC1006l, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f4185z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        m2581u(0, null, i2, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        m2581u(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f4184A.setIcon(i2);
        return this;
    }
}
