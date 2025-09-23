package p028K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: K.l */
/* loaded from: classes.dex */
public abstract class AbstractC0273l {
    /* renamed from: a */
    public static int m760a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* renamed from: b */
    public static CharSequence m761b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* renamed from: c */
    public static ColorStateList m762c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* renamed from: d */
    public static PorterDuff.Mode m763d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* renamed from: e */
    public static int m764e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* renamed from: f */
    public static CharSequence m765f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* renamed from: g */
    public static MenuItem m766g(MenuItem menuItem, char c3, int i2) {
        return menuItem.setAlphabeticShortcut(c3, i2);
    }

    /* renamed from: h */
    public static MenuItem m767h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* renamed from: i */
    public static MenuItem m768i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* renamed from: j */
    public static MenuItem m769j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* renamed from: k */
    public static MenuItem m770k(MenuItem menuItem, char c3, int i2) {
        return menuItem.setNumericShortcut(c3, i2);
    }

    /* renamed from: l */
    public static MenuItem m771l(MenuItem menuItem, char c3, char c4, int i2, int i3) {
        return menuItem.setShortcut(c3, c4, i2, i3);
    }

    /* renamed from: m */
    public static MenuItem m772m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
