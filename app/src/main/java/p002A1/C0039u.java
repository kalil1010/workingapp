package p002A1;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.ArrayList;
import java.util.Iterator;
import nfc.share.nfcshare.MainActivity;
import p005B1.ViewOnClickListenerC0066d;
import p060V.InterfaceC0541c;
import p090e.C0880m;
import p090e.InterfaceC0868a;
import p090e.LayoutInflaterFactory2C0888u;
import p096g.C0964a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: A1.u */
/* loaded from: classes.dex */
public final class C0039u implements InterfaceC0541c {

    /* renamed from: a */
    public final InterfaceC0868a f82a;

    /* renamed from: b */
    public final DrawerLayout f83b;

    /* renamed from: c */
    public final C0964a f84c;

    /* renamed from: d */
    public final Drawable f85d;

    /* renamed from: f */
    public final int f87f;

    /* renamed from: g */
    public final int f88g;

    /* renamed from: i */
    public final /* synthetic */ MainActivity f90i;

    /* renamed from: e */
    public boolean f86e = true;

    /* renamed from: h */
    public boolean f89h = false;

    public C0039u(MainActivity mainActivity, MainActivity mainActivity2, DrawerLayout drawerLayout, Toolbar toolbar) {
        this.f90i = mainActivity;
        if (toolbar != null) {
            this.f82a = new C0027i(toolbar);
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0066d(3, this));
        } else {
            LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) mainActivity2.m2215i();
            layoutInflaterFactory2C0888u.getClass();
            this.f82a = new C0880m(layoutInflaterFactory2C0888u, 2);
        }
        this.f83b = drawerLayout;
        this.f87f = R.string.navigation_drawer_open;
        this.f88g = R.string.navigation_drawer_close;
        this.f84c = new C0964a(this.f82a.mo129m());
        this.f85d = this.f82a.mo130n();
    }

    @Override // p060V.InterfaceC0541c
    /* renamed from: a */
    public final void mo155a(float f) {
        m158d(Math.min(1.0f, Math.max(0.0f, f)));
    }

    @Override // p060V.InterfaceC0541c
    /* renamed from: b */
    public final void mo156b(View view) {
        m158d(1.0f);
        if (this.f86e) {
            this.f82a.mo119b(this.f88g);
        }
        C0027i c0027i = AbstractC0018M.f36b;
        if (c0027i != null) {
            try {
                c0027i.m137u();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        int i2 = MainActivity.f4973g0;
        MainActivity mainActivity = this.f90i;
        mainActivity.m2880y();
        ArrayList arrayList = mainActivity.f4999Z;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = mainActivity.f4999Z.iterator();
        while (it.hasNext()) {
            C0016K c0016k = (C0016K) it.next();
            C0015J c0015j = new C0015J(new C0019a(mainActivity, c0016k, 1, false));
            c0015j.f28e = c0016k.f32d;
            c0015j.m42a(c0016k.f34f);
            mainActivity.f4994U.add(c0015j);
        }
    }

    @Override // p060V.InterfaceC0541c
    /* renamed from: c */
    public final void mo157c(View view) {
        m158d(0.0f);
        if (this.f86e) {
            this.f82a.mo119b(this.f87f);
        }
        MainActivity mainActivity = this.f90i;
        Iterator it = mainActivity.f4994U.iterator();
        while (it.hasNext()) {
            ((C0015J) it.next()).m43b();
        }
        mainActivity.f4994U.clear();
        if (AbstractC0018M.f36b == null || C0027i.f62e) {
            return;
        }
        try {
            String strM89c = AbstractC0020b.m89c(mainActivity);
            if (strM89c != null) {
                mainActivity.f5003d0 = strM89c;
            }
            AbstractC0018M.f36b.m135s(mainActivity.f5003d0);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void m158d(float f) {
        C0964a c0964a = this.f84c;
        if (f == 1.0f) {
            if (!c0964a.f4053i) {
                c0964a.f4053i = true;
                c0964a.invalidateSelf();
            }
        } else if (f == 0.0f && c0964a.f4053i) {
            c0964a.f4053i = false;
            c0964a.invalidateSelf();
        }
        if (c0964a.f4054j != f) {
            c0964a.f4054j = f;
            c0964a.invalidateSelf();
        }
    }
}
