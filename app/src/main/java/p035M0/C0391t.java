package p035M0;

import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import p006C.C0072d;
import p028K.AbstractC0241P;
import p028K.C0288s0;
import p028K.C0292u0;
import p028K.InterfaceC0283q;
import p102i.InterfaceC1004j;
import p102i.MenuC1006l;

/* renamed from: M0.t */
/* loaded from: classes.dex */
public final class C0391t implements InterfaceC0283q, InterfaceC1004j {

    /* renamed from: a */
    public final /* synthetic */ NavigationView f1249a;

    public /* synthetic */ C0391t(NavigationView navigationView) {
        this.f1249a = navigationView;
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: c */
    public void mo1073c(MenuC1006l menuC1006l) {
    }

    @Override // p028K.InterfaceC0283q
    /* renamed from: d */
    public C0292u0 mo67d(View view, C0292u0 c0292u0) {
        NavigationView navigationView = this.f1249a;
        if (navigationView.f1251b == null) {
            navigationView.f1251b = new Rect();
        }
        navigationView.f1251b.set(c0292u0.m819b(), c0292u0.m821d(), c0292u0.m820c(), c0292u0.m818a());
        C0388q c0388q = navigationView.f3287i;
        c0388q.getClass();
        int iM821d = c0292u0.m821d();
        if (c0388q.f1248z != iM821d) {
            c0388q.f1248z = iM821d;
            int i2 = (c0388q.f1224b.getChildCount() <= 0 && c0388q.f1246x) ? c0388q.f1248z : 0;
            NavigationMenuView navigationMenuView = c0388q.f1223a;
            navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = c0388q.f1223a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, c0292u0.m818a());
        AbstractC0241P.m690b(c0388q.f1224b, c0292u0);
        C0288s0 c0288s0 = c0292u0.f910a;
        navigationView.setWillNotDraw(c0288s0.mo794j().equals(C0072d.f171e) || navigationView.f1250a == null);
        navigationView.postInvalidateOnAnimation();
        return c0288s0.mo803c();
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: h */
    public boolean mo1074h(MenuC1006l menuC1006l, MenuItem menuItem) {
        this.f1249a.getClass();
        return false;
    }
}
