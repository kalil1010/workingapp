package p012E;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p102i.ActionProviderVisibilityListenerC1009o;

/* renamed from: E.a */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC0137a extends MenuItem {
    /* renamed from: a */
    ActionProviderVisibilityListenerC1009o mo376a();

    /* renamed from: b */
    InterfaceMenuItemC0137a mo377b(ActionProviderVisibilityListenerC1009o actionProviderVisibilityListenerC1009o);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c3, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0137a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c3, int i2);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c3, char c4, int i2, int i3);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0137a setTooltipText(CharSequence charSequence);
}
