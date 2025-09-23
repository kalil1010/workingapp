package p102i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: i.w */
/* loaded from: classes.dex */
public class C1017w {

    /* renamed from: a */
    public final Context f4319a;

    /* renamed from: b */
    public final MenuC1006l f4320b;

    /* renamed from: c */
    public final boolean f4321c;

    /* renamed from: d */
    public final int f4322d;

    /* renamed from: e */
    public View f4323e;

    /* renamed from: g */
    public boolean f4325g;

    /* renamed from: h */
    public InterfaceC1018x f4326h;

    /* renamed from: i */
    public AbstractC1014t f4327i;

    /* renamed from: j */
    public C1015u f4328j;

    /* renamed from: f */
    public int f4324f = 8388611;

    /* renamed from: k */
    public final C1015u f4329k = new C1015u(this);

    public C1017w(int i2, Context context, View view, MenuC1006l menuC1006l, boolean z2) {
        this.f4319a = context;
        this.f4320b = menuC1006l;
        this.f4323e = view;
        this.f4321c = z2;
        this.f4322d = i2;
    }

    /* renamed from: a */
    public final AbstractC1014t m2593a() {
        AbstractC1014t viewOnKeyListenerC0993D;
        if (this.f4327i == null) {
            Context context = this.f4319a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC1016v.m2592a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0993D = new ViewOnKeyListenerC1000f(context, this.f4323e, this.f4322d, this.f4321c);
            } else {
                View view = this.f4323e;
                Context context2 = this.f4319a;
                boolean z2 = this.f4321c;
                viewOnKeyListenerC0993D = new ViewOnKeyListenerC0993D(this.f4322d, context2, view, this.f4320b, z2);
            }
            viewOnKeyListenerC0993D.mo2545o(this.f4320b);
            viewOnKeyListenerC0993D.mo2550u(this.f4329k);
            viewOnKeyListenerC0993D.mo2546q(this.f4323e);
            viewOnKeyListenerC0993D.mo2544k(this.f4326h);
            viewOnKeyListenerC0993D.mo2547r(this.f4325g);
            viewOnKeyListenerC0993D.mo2548s(this.f4324f);
            this.f4327i = viewOnKeyListenerC0993D;
        }
        return this.f4327i;
    }

    /* renamed from: b */
    public final boolean m2594b() {
        AbstractC1014t abstractC1014t = this.f4327i;
        return abstractC1014t != null && abstractC1014t.mo2541b();
    }

    /* renamed from: c */
    public void mo2595c() {
        this.f4327i = null;
        C1015u c1015u = this.f4328j;
        if (c1015u != null) {
            c1015u.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m2596d(int i2, int i3, boolean z2, boolean z3) {
        AbstractC1014t abstractC1014tM2593a = m2593a();
        abstractC1014tM2593a.mo2551v(z3);
        if (z2) {
            int i4 = this.f4324f;
            View view = this.f4323e;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f4323e.getWidth();
            }
            abstractC1014tM2593a.mo2549t(i2);
            abstractC1014tM2593a.mo2552w(i3);
            int i5 = (int) ((this.f4319a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1014tM2593a.f4317a = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        abstractC1014tM2593a.mo2543i();
    }
}
