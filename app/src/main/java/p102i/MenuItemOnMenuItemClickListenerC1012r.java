package p102i;

import android.view.MenuItem;

/* renamed from: i.r */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1012r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final MenuItem.OnMenuItemClickListener f4313a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC1013s f4314b;

    public MenuItemOnMenuItemClickListenerC1012r(MenuItemC1013s menuItemC1013s, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4314b = menuItemC1013s;
        this.f4313a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f4313a.onMenuItemClick(this.f4314b.m1730g(menuItem));
    }
}
