package p102i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p041O0.ViewTreeObserverOnGlobalLayoutListenerC0427c;
import p064W0.ViewOnAttachStateChangeListenerC0567m;
import p105j.C1046L0;
import p105j.C1135u0;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: i.D */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0993D extends AbstractC1014t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b */
    public final Context f4165b;

    /* renamed from: c */
    public final MenuC1006l f4166c;

    /* renamed from: d */
    public final C1003i f4167d;

    /* renamed from: e */
    public final boolean f4168e;

    /* renamed from: f */
    public final int f4169f;

    /* renamed from: g */
    public final int f4170g;

    /* renamed from: h */
    public final C1046L0 f4171h;

    /* renamed from: k */
    public C1015u f4174k;

    /* renamed from: l */
    public View f4175l;

    /* renamed from: m */
    public View f4176m;

    /* renamed from: n */
    public InterfaceC1018x f4177n;

    /* renamed from: o */
    public ViewTreeObserver f4178o;

    /* renamed from: p */
    public boolean f4179p;

    /* renamed from: q */
    public boolean f4180q;

    /* renamed from: r */
    public int f4181r;

    /* renamed from: t */
    public boolean f4183t;

    /* renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0427c f4172i = new ViewTreeObserverOnGlobalLayoutListenerC0427c(2, this);

    /* renamed from: j */
    public final ViewOnAttachStateChangeListenerC0567m f4173j = new ViewOnAttachStateChangeListenerC0567m(3, this);

    /* renamed from: s */
    public int f4182s = 0;

    public ViewOnKeyListenerC0993D(int i2, Context context, View view, MenuC1006l menuC1006l, boolean z2) {
        this.f4165b = context;
        this.f4166c = menuC1006l;
        this.f4168e = z2;
        this.f4167d = new C1003i(menuC1006l, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f4170g = i2;
        Resources resources = context.getResources();
        this.f4169f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4175l = view;
        this.f4171h = new C1046L0(context, null, i2);
        menuC1006l.m2571b(this, context);
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: a */
    public final void mo1062a(MenuC1006l menuC1006l, boolean z2) {
        if (menuC1006l != this.f4166c) {
            return;
        }
        dismiss();
        InterfaceC1018x interfaceC1018x = this.f4177n;
        if (interfaceC1018x != null) {
            interfaceC1018x.mo1977a(menuC1006l, z2);
        }
    }

    @Override // p102i.InterfaceC0992C
    /* renamed from: b */
    public final boolean mo2541b() {
        return !this.f4179p && this.f4171h.f4376z.isShowing();
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: d */
    public final void mo1064d() {
        this.f4180q = false;
        C1003i c1003i = this.f4167d;
        if (c1003i != null) {
            c1003i.notifyDataSetChanged();
        }
    }

    @Override // p102i.InterfaceC0992C
    public final void dismiss() {
        if (mo2541b()) {
            this.f4171h.dismiss();
        }
    }

    @Override // p102i.InterfaceC0992C
    /* renamed from: f */
    public final C1135u0 mo2542f() {
        return this.f4171h.f4353c;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: g */
    public final boolean mo1066g() {
        return false;
    }

    @Override // p102i.InterfaceC0992C
    /* renamed from: i */
    public final void mo2543i() {
        View view;
        if (mo2541b()) {
            return;
        }
        if (this.f4179p || (view = this.f4175l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f4176m = view;
        C1046L0 c1046l0 = this.f4171h;
        c1046l0.f4376z.setOnDismissListener(this);
        c1046l0.f4366p = this;
        c1046l0.f4375y = true;
        c1046l0.f4376z.setFocusable(true);
        View view2 = this.f4176m;
        boolean z2 = this.f4178o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4178o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4172i);
        }
        view2.addOnAttachStateChangeListener(this.f4173j);
        c1046l0.f4365o = view2;
        c1046l0.f4362l = this.f4182s;
        boolean z3 = this.f4180q;
        Context context = this.f4165b;
        C1003i c1003i = this.f4167d;
        if (!z3) {
            this.f4181r = AbstractC1014t.m2590p(c1003i, context, this.f4169f);
            this.f4180q = true;
        }
        c1046l0.m2632r(this.f4181r);
        c1046l0.f4376z.setInputMethodMode(2);
        Rect rect = this.f4317a;
        c1046l0.f4374x = rect != null ? new Rect(rect) : null;
        c1046l0.mo2543i();
        C1135u0 c1135u0 = c1046l0.f4353c;
        c1135u0.setOnKeyListener(this);
        if (this.f4183t) {
            MenuC1006l menuC1006l = this.f4166c;
            if (menuC1006l.f4263m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1135u0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1006l.f4263m);
                }
                frameLayout.setEnabled(false);
                c1135u0.addHeaderView(frameLayout, null, false);
            }
        }
        c1046l0.mo2630o(c1003i);
        c1046l0.mo2543i();
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: j */
    public final Parcelable mo1068j() {
        return null;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: k */
    public final void mo2544k(InterfaceC1018x interfaceC1018x) {
        this.f4177n = interfaceC1018x;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: m */
    public final void mo1070m(Parcelable parcelable) {
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: n */
    public final boolean mo1071n(SubMenuC0994E subMenuC0994E) {
        if (subMenuC0994E.hasVisibleItems()) {
            View view = this.f4176m;
            C1017w c1017w = new C1017w(this.f4170g, this.f4165b, view, subMenuC0994E, this.f4168e);
            InterfaceC1018x interfaceC1018x = this.f4177n;
            c1017w.f4326h = interfaceC1018x;
            AbstractC1014t abstractC1014t = c1017w.f4327i;
            if (abstractC1014t != null) {
                abstractC1014t.mo2544k(interfaceC1018x);
            }
            boolean zM2591x = AbstractC1014t.m2591x(subMenuC0994E);
            c1017w.f4325g = zM2591x;
            AbstractC1014t abstractC1014t2 = c1017w.f4327i;
            if (abstractC1014t2 != null) {
                abstractC1014t2.mo2547r(zM2591x);
            }
            c1017w.f4328j = this.f4174k;
            this.f4174k = null;
            this.f4166c.m2572c(false);
            C1046L0 c1046l0 = this.f4171h;
            int width = c1046l0.f4356f;
            int iM2626j = c1046l0.m2626j();
            int i2 = this.f4182s;
            View view2 = this.f4175l;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            if ((Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 7) == 5) {
                width += this.f4175l.getWidth();
            }
            if (!c1017w.m2594b()) {
                if (c1017w.f4323e != null) {
                    c1017w.m2596d(width, iM2626j, true, true);
                }
            }
            InterfaceC1018x interfaceC1018x2 = this.f4177n;
            if (interfaceC1018x2 != null) {
                interfaceC1018x2.mo1979f(subMenuC0994E);
            }
            return true;
        }
        return false;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: o */
    public final void mo2545o(MenuC1006l menuC1006l) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4179p = true;
        this.f4166c.m2572c(true);
        ViewTreeObserver viewTreeObserver = this.f4178o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4178o = this.f4176m.getViewTreeObserver();
            }
            this.f4178o.removeGlobalOnLayoutListener(this.f4172i);
            this.f4178o = null;
        }
        this.f4176m.removeOnAttachStateChangeListener(this.f4173j);
        C1015u c1015u = this.f4174k;
        if (c1015u != null) {
            c1015u.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: q */
    public final void mo2546q(View view) {
        this.f4175l = view;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: r */
    public final void mo2547r(boolean z2) {
        this.f4167d.f4246c = z2;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: s */
    public final void mo2548s(int i2) {
        this.f4182s = i2;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: t */
    public final void mo2549t(int i2) {
        this.f4171h.f4356f = i2;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: u */
    public final void mo2550u(PopupWindow.OnDismissListener onDismissListener) {
        this.f4174k = (C1015u) onDismissListener;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: v */
    public final void mo2551v(boolean z2) {
        this.f4183t = z2;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: w */
    public final void mo2552w(int i2) {
        this.f4171h.m2628m(i2);
    }
}
