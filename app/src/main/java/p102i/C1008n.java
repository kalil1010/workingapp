package p102i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p009D.AbstractC0098a;
import p012E.InterfaceMenuItemC0137a;
import p080b1.C0770h;
import p093e2.AbstractC0901d;

/* renamed from: i.n */
/* loaded from: classes.dex */
public final class C1008n implements InterfaceMenuItemC0137a {

    /* renamed from: A */
    public ActionProviderVisibilityListenerC1009o f4278A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f4279B;

    /* renamed from: a */
    public final int f4281a;

    /* renamed from: b */
    public final int f4282b;

    /* renamed from: c */
    public final int f4283c;

    /* renamed from: d */
    public final int f4284d;

    /* renamed from: e */
    public CharSequence f4285e;

    /* renamed from: f */
    public CharSequence f4286f;

    /* renamed from: g */
    public Intent f4287g;

    /* renamed from: h */
    public char f4288h;

    /* renamed from: j */
    public char f4290j;

    /* renamed from: l */
    public Drawable f4292l;

    /* renamed from: n */
    public final MenuC1006l f4294n;

    /* renamed from: o */
    public SubMenuC0994E f4295o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f4296p;

    /* renamed from: q */
    public CharSequence f4297q;

    /* renamed from: r */
    public CharSequence f4298r;

    /* renamed from: y */
    public int f4305y;

    /* renamed from: z */
    public View f4306z;

    /* renamed from: i */
    public int f4289i = 4096;

    /* renamed from: k */
    public int f4291k = 4096;

    /* renamed from: m */
    public int f4293m = 0;

    /* renamed from: s */
    public ColorStateList f4299s = null;

    /* renamed from: t */
    public PorterDuff.Mode f4300t = null;

    /* renamed from: u */
    public boolean f4301u = false;

    /* renamed from: v */
    public boolean f4302v = false;

    /* renamed from: w */
    public boolean f4303w = false;

    /* renamed from: x */
    public int f4304x = 16;

    /* renamed from: C */
    public boolean f4280C = false;

    public C1008n(MenuC1006l menuC1006l, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f4294n = menuC1006l;
        this.f4281a = i3;
        this.f4282b = i2;
        this.f4283c = i4;
        this.f4284d = i5;
        this.f4285e = charSequence;
        this.f4305y = i6;
    }

    /* renamed from: c */
    public static void m2584c(int i2, int i3, String str, StringBuilder sb) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // p012E.InterfaceMenuItemC0137a
    /* renamed from: a */
    public final ActionProviderVisibilityListenerC1009o mo376a() {
        return this.f4278A;
    }

    @Override // p012E.InterfaceMenuItemC0137a
    /* renamed from: b */
    public final InterfaceMenuItemC0137a mo377b(ActionProviderVisibilityListenerC1009o actionProviderVisibilityListenerC1009o) {
        this.f4306z = null;
        this.f4278A = actionProviderVisibilityListenerC1009o;
        this.f4294n.mo1072p(true);
        ActionProviderVisibilityListenerC1009o actionProviderVisibilityListenerC1009o2 = this.f4278A;
        if (actionProviderVisibilityListenerC1009o2 != null) {
            actionProviderVisibilityListenerC1009o2.f4309c = new C0770h(this);
            actionProviderVisibilityListenerC1009o2.f4307a.setVisibilityListener(actionProviderVisibilityListenerC1009o2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f4305y & 8) == 0) {
            return false;
        }
        if (this.f4306z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4279B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4294n.mo2553d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m2585d(Drawable drawable) {
        if (drawable != null && this.f4303w && (this.f4301u || this.f4302v)) {
            drawable = drawable.mutate();
            if (this.f4301u) {
                AbstractC0098a.m300h(drawable, this.f4299s);
            }
            if (this.f4302v) {
                AbstractC0098a.m301i(drawable, this.f4300t);
            }
            this.f4303w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public final boolean m2586e() {
        ActionProviderVisibilityListenerC1009o actionProviderVisibilityListenerC1009o;
        if ((this.f4305y & 8) == 0) {
            return false;
        }
        if (this.f4306z == null && (actionProviderVisibilityListenerC1009o = this.f4278A) != null) {
            this.f4306z = actionProviderVisibilityListenerC1009o.m2589a(this);
        }
        return this.f4306z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2586e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4279B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4294n.mo2555f(this);
        }
        return false;
    }

    /* renamed from: f */
    public final void m2587f(boolean z2) {
        this.f4304x = (z2 ? 4 : 0) | (this.f4304x & (-5));
    }

    /* renamed from: g */
    public final void m2588g(boolean z2) {
        if (z2) {
            this.f4304x |= 32;
        } else {
            this.f4304x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f4306z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC1009o actionProviderVisibilityListenerC1009o = this.f4278A;
        if (actionProviderVisibilityListenerC1009o == null) {
            return null;
        }
        View viewM2589a = actionProviderVisibilityListenerC1009o.m2589a(this);
        this.f4306z = viewM2589a;
        return viewM2589a;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4291k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4290j;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4297q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4282b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4292l;
        if (drawable != null) {
            return m2585d(drawable);
        }
        int i2 = this.f4293m;
        if (i2 == 0) {
            return null;
        }
        Drawable drawableM2321x = AbstractC0901d.m2321x(this.f4294n.f4251a, i2);
        this.f4293m = 0;
        this.f4292l = drawableM2321x;
        return m2585d(drawableM2321x);
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4299s;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4300t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4287g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4281a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4289i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4288h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4283c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4295o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4285e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4286f;
        return charSequence != null ? charSequence : this.f4285e;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4298r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4295o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f4280C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4304x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4304x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4304x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC1009o actionProviderVisibilityListenerC1009o = this.f4278A;
        return (actionProviderVisibilityListenerC1009o == null || !actionProviderVisibilityListenerC1009o.f4307a.overridesItemVisibility()) ? (this.f4304x & 8) == 0 : (this.f4304x & 8) == 0 && this.f4278A.f4307a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f4306z = view;
        this.f4278A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f4281a) > 0) {
            view.setId(i2);
        }
        MenuC1006l menuC1006l = this.f4294n;
        menuC1006l.f4261k = true;
        menuC1006l.mo1072p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f4290j == c3) {
            return this;
        }
        this.f4290j = Character.toLowerCase(c3);
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f4304x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f4304x = i3;
        if (i2 != i3) {
            this.f4294n.mo1072p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f4304x;
        if ((i2 & 4) == 0) {
            int i3 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f4304x = i3;
            if (i2 != i3) {
                this.f4294n.mo1072p(false);
            }
            return this;
        }
        MenuC1006l menuC1006l = this.f4294n;
        menuC1006l.getClass();
        ArrayList arrayList = menuC1006l.f4256f;
        int size = arrayList.size();
        menuC1006l.m2583w();
        for (int i4 = 0; i4 < size; i4++) {
            C1008n c1008n = (C1008n) arrayList.get(i4);
            if (c1008n.f4282b == this.f4282b && (c1008n.f4304x & 4) != 0 && c1008n.isCheckable()) {
                boolean z3 = c1008n == this;
                int i5 = c1008n.f4304x;
                int i6 = (z3 ? 2 : 0) | (i5 & (-3));
                c1008n.f4304x = i6;
                if (i5 != i6) {
                    c1008n.f4294n.mo1072p(false);
                }
            }
        }
        menuC1006l.m2582v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f4304x |= 16;
        } else {
            this.f4304x &= -17;
        }
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4293m = 0;
        this.f4292l = drawable;
        this.f4303w = true;
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4299s = colorStateList;
        this.f4301u = true;
        this.f4303w = true;
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4300t = mode;
        this.f4302v = true;
        this.f4303w = true;
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4287g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f4288h == c3) {
            return this;
        }
        this.f4288h = c3;
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4279B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4296p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f4288h = c3;
        this.f4290j = Character.toLowerCase(c4);
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4305y = i2;
        MenuC1006l menuC1006l = this.f4294n;
        menuC1006l.f4261k = true;
        menuC1006l.mo1072p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4285e = charSequence;
        this.f4294n.mo1072p(false);
        SubMenuC0994E subMenuC0994E = this.f4295o;
        if (subMenuC0994E != null) {
            subMenuC0994E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4286f = charSequence;
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f4304x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f4304x = i3;
        if (i2 != i3) {
            MenuC1006l menuC1006l = this.f4294n;
            menuC1006l.f4258h = true;
            menuC1006l.mo1072p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f4285e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final InterfaceMenuItemC0137a setContentDescription(CharSequence charSequence) {
        this.f4297q = charSequence;
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final InterfaceMenuItemC0137a setTooltipText(CharSequence charSequence) {
        this.f4298r = charSequence;
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i2) {
        if (this.f4290j == c3 && this.f4291k == i2) {
            return this;
        }
        this.f4290j = Character.toLowerCase(c3);
        this.f4291k = KeyEvent.normalizeMetaState(i2);
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i2) {
        if (this.f4288h == c3 && this.f4289i == i2) {
            return this;
        }
        this.f4288h = c3;
        this.f4289i = KeyEvent.normalizeMetaState(i2);
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i2, int i3) {
        this.f4288h = c3;
        this.f4289i = KeyEvent.normalizeMetaState(i2);
        this.f4290j = Character.toLowerCase(c4);
        this.f4291k = KeyEvent.normalizeMetaState(i3);
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f4292l = null;
        this.f4293m = i2;
        this.f4303w = true;
        this.f4294n.mo1072p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f4294n.f4251a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f4294n.f4251a;
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f4306z = viewInflate;
        this.f4278A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.f4281a) > 0) {
            viewInflate.setId(i3);
        }
        MenuC1006l menuC1006l = this.f4294n;
        menuC1006l.f4261k = true;
        menuC1006l.mo1072p(true);
        return this;
    }
}
