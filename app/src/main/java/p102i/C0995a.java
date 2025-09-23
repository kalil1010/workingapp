package p102i;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000A.AbstractC0000a;
import p009D.AbstractC0098a;
import p012E.InterfaceMenuItemC0137a;

/* renamed from: i.a */
/* loaded from: classes.dex */
public final class C0995a implements InterfaceMenuItemC0137a {

    /* renamed from: a */
    public CharSequence f4186a;

    /* renamed from: b */
    public CharSequence f4187b;

    /* renamed from: c */
    public Intent f4188c;

    /* renamed from: d */
    public char f4189d;

    /* renamed from: e */
    public int f4190e;

    /* renamed from: f */
    public char f4191f;

    /* renamed from: g */
    public int f4192g;

    /* renamed from: h */
    public Drawable f4193h;

    /* renamed from: i */
    public Context f4194i;

    /* renamed from: j */
    public CharSequence f4195j;

    /* renamed from: k */
    public CharSequence f4196k;

    /* renamed from: l */
    public ColorStateList f4197l;

    /* renamed from: m */
    public PorterDuff.Mode f4198m;

    /* renamed from: n */
    public boolean f4199n;

    /* renamed from: o */
    public boolean f4200o;

    /* renamed from: p */
    public int f4201p;

    @Override // p012E.InterfaceMenuItemC0137a
    /* renamed from: a */
    public final ActionProviderVisibilityListenerC1009o mo376a() {
        return null;
    }

    @Override // p012E.InterfaceMenuItemC0137a
    /* renamed from: b */
    public final InterfaceMenuItemC0137a mo377b(ActionProviderVisibilityListenerC1009o actionProviderVisibilityListenerC1009o) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m2561c() {
        Drawable drawable = this.f4193h;
        if (drawable != null) {
            if (this.f4199n || this.f4200o) {
                this.f4193h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f4193h = drawableMutate;
                if (this.f4199n) {
                    AbstractC0098a.m300h(drawableMutate, this.f4197l);
                }
                if (this.f4200o) {
                    AbstractC0098a.m301i(this.f4193h, this.f4198m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4192g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4191f;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4195j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f4193h;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4197l;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4198m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4188c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4190e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4189d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4186a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4187b;
        return charSequence != null ? charSequence : this.f4186a;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4196k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4201p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4201p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4201p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f4201p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f4191f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f4201p = (z2 ? 1 : 0) | (this.f4201p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f4201p = (z2 ? 2 : 0) | (this.f4201p & (-3));
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final InterfaceMenuItemC0137a setContentDescription(CharSequence charSequence) {
        this.f4195j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f4201p = (z2 ? 16 : 0) | (this.f4201p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4193h = drawable;
        m2561c();
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4197l = colorStateList;
        this.f4199n = true;
        m2561c();
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4198m = mode;
        this.f4200o = true;
        m2561c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4188c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.f4189d = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f4189d = c3;
        this.f4191f = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4186a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4187b = charSequence;
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final InterfaceMenuItemC0137a setTooltipText(CharSequence charSequence) {
        this.f4196k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f4201p = (this.f4201p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i2) {
        this.f4191f = Character.toLowerCase(c3);
        this.f4192g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f4195j = charSequence;
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i2) {
        this.f4189d = c3;
        this.f4190e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.f4186a = this.f4194i.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f4196k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f4193h = AbstractC0000a.m1b(this.f4194i, i2);
        m2561c();
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0137a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i2, int i3) {
        this.f4189d = c3;
        this.f4190e = KeyEvent.normalizeMetaState(i2);
        this.f4191f = Character.toLowerCase(c4);
        this.f4192g = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
