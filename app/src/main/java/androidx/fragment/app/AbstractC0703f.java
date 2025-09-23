package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import p002A1.C0043y;
import p012E.InterfaceMenuItemC0137a;
import p017G.C0155d;
import p090e.LayoutInflaterFactory2C0888u;
import p102i.MenuItemC1013s;
import p119o.C1249k;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public abstract class AbstractC0703f {

    /* renamed from: a */
    public Object f2575a;

    /* renamed from: b */
    public Object f2576b;

    public AbstractC0703f(Context context) {
        this.f2575a = context;
    }

    /* renamed from: c */
    public void m1726c() {
        C0043y c0043y = (C0043y) this.f2575a;
        if (c0043y != null) {
            try {
                ((LayoutInflaterFactory2C0888u) this.f2576b).f3691k.unregisterReceiver(c0043y);
            } catch (IllegalArgumentException unused) {
            }
            this.f2575a = null;
        }
    }

    /* renamed from: d */
    public void m1727d() {
        C0696N c0696n = (C0696N) this.f2575a;
        HashSet hashSet = c0696n.f2528e;
        if (hashSet.remove((C0155d) this.f2576b) && hashSet.isEmpty()) {
            c0696n.m1719b();
        }
    }

    /* renamed from: e */
    public abstract IntentFilter mo1728e();

    /* renamed from: f */
    public abstract int mo1729f();

    /* renamed from: g */
    public MenuItem m1730g(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0137a)) {
            return menuItem;
        }
        InterfaceMenuItemC0137a interfaceMenuItemC0137a = (InterfaceMenuItemC0137a) menuItem;
        if (((C1249k) this.f2576b) == null) {
            this.f2576b = new C1249k();
        }
        MenuItem menuItem2 = (MenuItem) ((C1249k) this.f2576b).getOrDefault(interfaceMenuItemC0137a, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1013s menuItemC1013s = new MenuItemC1013s((Context) this.f2575a, interfaceMenuItemC0137a);
        ((C1249k) this.f2576b).put(interfaceMenuItemC0137a, menuItemC1013s);
        return menuItemC1013s;
    }

    /* renamed from: h */
    public abstract void mo1731h();

    /* renamed from: i */
    public void m1732i() {
        m1726c();
        IntentFilter intentFilterMo1728e = mo1728e();
        if (intentFilterMo1728e.countActions() == 0) {
            return;
        }
        if (((C0043y) this.f2575a) == null) {
            this.f2575a = new C0043y(1, this);
        }
        ((LayoutInflaterFactory2C0888u) this.f2576b).f3691k.registerReceiver((C0043y) this.f2575a, intentFilterMo1728e);
    }

    public AbstractC0703f(C0696N c0696n, C0155d c0155d) {
        this.f2575a = c0696n;
        this.f2576b = c0155d;
    }

    public AbstractC0703f(LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u) {
        this.f2576b = layoutInflaterFactory2C0888u;
    }
}
