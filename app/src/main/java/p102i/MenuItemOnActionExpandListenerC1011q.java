package p102i;

import android.view.MenuItem;

/* renamed from: i.q */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC1011q implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    public final MenuItem.OnActionExpandListener f4311a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC1013s f4312b;

    public MenuItemOnActionExpandListenerC1011q(MenuItemC1013s menuItemC1013s, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4312b = menuItemC1013s;
        this.f4311a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f4311a.onMenuItemActionCollapse(this.f4312b.m1730g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f4311a.onMenuItemActionExpand(this.f4312b.m1730g(menuItem));
    }
}
