package p099h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p012E.InterfaceMenuItemC0137a;
import p028K.AbstractC0273l;
import p102i.ActionProviderVisibilityListenerC1009o;
import p102i.C1008n;
import p102i.MenuItemC1013s;

/* renamed from: h.h */
/* loaded from: classes.dex */
public final class C0978h {

    /* renamed from: A */
    public CharSequence f4086A;

    /* renamed from: B */
    public CharSequence f4087B;

    /* renamed from: E */
    public final /* synthetic */ C0979i f4090E;

    /* renamed from: a */
    public final Menu f4091a;

    /* renamed from: h */
    public boolean f4098h;

    /* renamed from: i */
    public int f4099i;

    /* renamed from: j */
    public int f4100j;

    /* renamed from: k */
    public CharSequence f4101k;

    /* renamed from: l */
    public CharSequence f4102l;

    /* renamed from: m */
    public int f4103m;

    /* renamed from: n */
    public char f4104n;

    /* renamed from: o */
    public int f4105o;

    /* renamed from: p */
    public char f4106p;

    /* renamed from: q */
    public int f4107q;

    /* renamed from: r */
    public int f4108r;

    /* renamed from: s */
    public boolean f4109s;

    /* renamed from: t */
    public boolean f4110t;

    /* renamed from: u */
    public boolean f4111u;

    /* renamed from: v */
    public int f4112v;

    /* renamed from: w */
    public int f4113w;

    /* renamed from: x */
    public String f4114x;

    /* renamed from: y */
    public String f4115y;

    /* renamed from: z */
    public ActionProviderVisibilityListenerC1009o f4116z;

    /* renamed from: C */
    public ColorStateList f4088C = null;

    /* renamed from: D */
    public PorterDuff.Mode f4089D = null;

    /* renamed from: b */
    public int f4092b = 0;

    /* renamed from: c */
    public int f4093c = 0;

    /* renamed from: d */
    public int f4094d = 0;

    /* renamed from: e */
    public int f4095e = 0;

    /* renamed from: f */
    public boolean f4096f = true;

    /* renamed from: g */
    public boolean f4097g = true;

    public C0978h(C0979i c0979i, Menu menu) {
        this.f4090E = c0979i;
        this.f4091a = menu;
    }

    /* renamed from: a */
    public final Object m2482a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f4090E.f4121c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void m2483b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = false;
        menuItem.setChecked(this.f4109s).setVisible(this.f4110t).setEnabled(this.f4111u).setCheckable(this.f4108r >= 1).setTitleCondensed(this.f4102l).setIcon(this.f4103m);
        int i2 = this.f4112v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f4115y;
        C0979i c0979i = this.f4090E;
        if (str != null) {
            if (c0979i.f4121c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0979i.f4122d == null) {
                c0979i.f4122d = C0979i.m2484a(c0979i.f4121c);
            }
            Object obj = c0979i.f4122d;
            String str2 = this.f4115y;
            MenuItemOnMenuItemClickListenerC0977g menuItemOnMenuItemClickListenerC0977g = new MenuItemOnMenuItemClickListenerC0977g();
            menuItemOnMenuItemClickListenerC0977g.f4084a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0977g.f4085b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0977g.f4083c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0977g);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        if (this.f4108r >= 2) {
            if (menuItem instanceof C1008n) {
                ((C1008n) menuItem).m2587f(true);
            } else if (menuItem instanceof MenuItemC1013s) {
                MenuItemC1013s menuItemC1013s = (MenuItemC1013s) menuItem;
                try {
                    Method method = menuItemC1013s.f4316d;
                    InterfaceMenuItemC0137a interfaceMenuItemC0137a = menuItemC1013s.f4315c;
                    if (method == null) {
                        menuItemC1013s.f4316d = interfaceMenuItemC0137a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1013s.f4316d.invoke(interfaceMenuItemC0137a, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.f4114x;
        if (str3 != null) {
            menuItem.setActionView((View) m2482a(str3, C0979i.f4117e, c0979i.f4119a));
            z2 = true;
        }
        int i3 = this.f4113w;
        if (i3 > 0 && !z2) {
            menuItem.setActionView(i3);
        }
        ActionProviderVisibilityListenerC1009o actionProviderVisibilityListenerC1009o = this.f4116z;
        if (actionProviderVisibilityListenerC1009o != null && (menuItem instanceof InterfaceMenuItemC0137a)) {
            ((InterfaceMenuItemC0137a) menuItem).mo377b(actionProviderVisibilityListenerC1009o);
        }
        CharSequence charSequence = this.f4086A;
        boolean z3 = menuItem instanceof InterfaceMenuItemC0137a;
        if (z3) {
            ((InterfaceMenuItemC0137a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0273l.m767h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f4087B;
        if (z3) {
            ((InterfaceMenuItemC0137a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0273l.m772m(menuItem, charSequence2);
        }
        char c3 = this.f4104n;
        int i4 = this.f4105o;
        if (z3) {
            ((InterfaceMenuItemC0137a) menuItem).setAlphabeticShortcut(c3, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0273l.m766g(menuItem, c3, i4);
        }
        char c4 = this.f4106p;
        int i5 = this.f4107q;
        if (z3) {
            ((InterfaceMenuItemC0137a) menuItem).setNumericShortcut(c4, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0273l.m770k(menuItem, c4, i5);
        }
        PorterDuff.Mode mode = this.f4089D;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC0137a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0273l.m769j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f4088C;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC0137a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0273l.m768i(menuItem, colorStateList);
            }
        }
    }
}
