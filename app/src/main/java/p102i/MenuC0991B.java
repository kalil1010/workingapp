package p102i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.fragment.app.AbstractC0703f;
import p012E.InterfaceMenuItemC0137a;
import p119o.C1249k;

/* renamed from: i.B */
/* loaded from: classes.dex */
public class MenuC0991B extends AbstractC0703f implements Menu {

    /* renamed from: c */
    public final MenuC1006l f4164c;

    public MenuC0991B(Context context, MenuC1006l menuC1006l) {
        super(context);
        if (menuC1006l == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f4164c = menuC1006l;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1730g(this.f4164c.m2570a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f4164c.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = m1730g(menuItemArr2[i6]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f4164c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C1249k c1249k = (C1249k) this.f2576b;
        if (c1249k != null) {
            c1249k.clear();
        }
        this.f4164c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f4164c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        return m1730g(this.f4164c.findItem(i2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return m1730g(this.f4164c.getItem(i2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f4164c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f4164c.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return this.f4164c.performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f4164c.performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        if (((C1249k) this.f2576b) != null) {
            int i3 = 0;
            while (true) {
                C1249k c1249k = (C1249k) this.f2576b;
                if (i3 >= c1249k.f5058c) {
                    break;
                }
                if (((InterfaceMenuItemC0137a) c1249k.m2912h(i3)).getGroupId() == i2) {
                    ((C1249k) this.f2576b).m2913i(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f4164c.removeGroup(i2);
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        if (((C1249k) this.f2576b) != null) {
            int i3 = 0;
            while (true) {
                C1249k c1249k = (C1249k) this.f2576b;
                if (i3 >= c1249k.f5058c) {
                    break;
                }
                if (((InterfaceMenuItemC0137a) c1249k.m2912h(i3)).getItemId() == i2) {
                    ((C1249k) this.f2576b).m2913i(i3);
                    break;
                }
                i3++;
            }
        }
        this.f4164c.removeItem(i2);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        this.f4164c.setGroupCheckable(i2, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        this.f4164c.setGroupEnabled(i2, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        this.f4164c.setGroupVisible(i2, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f4164c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4164c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return this.f4164c.addSubMenu(i2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return m1730g(this.f4164c.add(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return this.f4164c.addSubMenu(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m1730g(this.f4164c.m2570a(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return this.f4164c.addSubMenu(i2, i3, i4, i5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return m1730g(this.f4164c.add(i2, i3, i4, i5));
    }
}
