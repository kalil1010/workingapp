package p102i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p041O0.ViewTreeObserverOnGlobalLayoutListenerC0427c;
import p064W0.ViewOnAttachStateChangeListenerC0567m;
import p080b1.C0770h;
import p105j.AbstractC1038H0;
import p105j.C1046L0;
import p105j.C1135u0;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: i.f */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1000f extends AbstractC1014t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b */
    public final Context f4211b;

    /* renamed from: c */
    public final int f4212c;

    /* renamed from: d */
    public final int f4213d;

    /* renamed from: e */
    public final boolean f4214e;

    /* renamed from: f */
    public final Handler f4215f;

    /* renamed from: n */
    public View f4223n;

    /* renamed from: o */
    public View f4224o;

    /* renamed from: p */
    public int f4225p;

    /* renamed from: q */
    public boolean f4226q;

    /* renamed from: r */
    public boolean f4227r;

    /* renamed from: s */
    public int f4228s;

    /* renamed from: t */
    public int f4229t;

    /* renamed from: v */
    public boolean f4231v;

    /* renamed from: w */
    public InterfaceC1018x f4232w;

    /* renamed from: x */
    public ViewTreeObserver f4233x;

    /* renamed from: y */
    public C1015u f4234y;

    /* renamed from: z */
    public boolean f4235z;

    /* renamed from: g */
    public final ArrayList f4216g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f4217h = new ArrayList();

    /* renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0427c f4218i = new ViewTreeObserverOnGlobalLayoutListenerC0427c(1, this);

    /* renamed from: j */
    public final ViewOnAttachStateChangeListenerC0567m f4219j = new ViewOnAttachStateChangeListenerC0567m(2, this);

    /* renamed from: k */
    public final C0770h f4220k = new C0770h(this);

    /* renamed from: l */
    public int f4221l = 0;

    /* renamed from: m */
    public int f4222m = 0;

    /* renamed from: u */
    public boolean f4230u = false;

    public ViewOnKeyListenerC1000f(Context context, View view, int i2, boolean z2) {
        this.f4211b = context;
        this.f4223n = view;
        this.f4213d = i2;
        this.f4214e = z2;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        this.f4225p = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f4212c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4215f = new Handler();
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: a */
    public final void mo1062a(MenuC1006l menuC1006l, boolean z2) {
        ArrayList arrayList = this.f4217h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC1006l == ((C0999e) arrayList.get(i2)).f4209b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0999e) arrayList.get(i3)).f4209b.m2572c(false);
        }
        C0999e c0999e = (C0999e) arrayList.remove(i2);
        c0999e.f4209b.m2578r(this);
        boolean z3 = this.f4235z;
        C1046L0 c1046l0 = c0999e.f4208a;
        if (z3) {
            AbstractC1038H0.m2636b(c1046l0.f4376z, null);
            c1046l0.f4376z.setAnimationStyle(0);
        }
        c1046l0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4225p = ((C0999e) arrayList.get(size2 - 1)).f4210c;
        } else {
            View view = this.f4223n;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            this.f4225p = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0999e) arrayList.get(0)).f4209b.m2572c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1018x interfaceC1018x = this.f4232w;
        if (interfaceC1018x != null) {
            interfaceC1018x.mo1977a(menuC1006l, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4233x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4233x.removeGlobalOnLayoutListener(this.f4218i);
            }
            this.f4233x = null;
        }
        this.f4224o.removeOnAttachStateChangeListener(this.f4219j);
        this.f4234y.onDismiss();
    }

    @Override // p102i.InterfaceC0992C
    /* renamed from: b */
    public final boolean mo2541b() {
        ArrayList arrayList = this.f4217h;
        return arrayList.size() > 0 && ((C0999e) arrayList.get(0)).f4208a.f4376z.isShowing();
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: d */
    public final void mo1064d() {
        Iterator it = this.f4217h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0999e) it.next()).f4208a.f4353c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1003i) adapter).notifyDataSetChanged();
        }
    }

    @Override // p102i.InterfaceC0992C
    public final void dismiss() {
        ArrayList arrayList = this.f4217h;
        int size = arrayList.size();
        if (size > 0) {
            C0999e[] c0999eArr = (C0999e[]) arrayList.toArray(new C0999e[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0999e c0999e = c0999eArr[i2];
                if (c0999e.f4208a.f4376z.isShowing()) {
                    c0999e.f4208a.dismiss();
                }
            }
        }
    }

    @Override // p102i.InterfaceC0992C
    /* renamed from: f */
    public final C1135u0 mo2542f() {
        ArrayList arrayList = this.f4217h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0999e) arrayList.get(arrayList.size() - 1)).f4208a.f4353c;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: g */
    public final boolean mo1066g() {
        return false;
    }

    @Override // p102i.InterfaceC0992C
    /* renamed from: i */
    public final void mo2543i() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mo2541b()) {
            return;
        }
        ArrayList arrayList = this.f4216g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2565y((MenuC1006l) it.next());
        }
        arrayList.clear();
        View view = this.f4223n;
        this.f4224o = view;
        if (view != null) {
            boolean z2 = this.f4233x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4233x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4218i);
            }
            this.f4224o.addOnAttachStateChangeListener(this.f4219j);
        }
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: j */
    public final Parcelable mo1068j() {
        return null;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: k */
    public final void mo2544k(InterfaceC1018x interfaceC1018x) {
        this.f4232w = interfaceC1018x;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: m */
    public final void mo1070m(Parcelable parcelable) {
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: n */
    public final boolean mo1071n(SubMenuC0994E subMenuC0994E) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.f4217h.iterator();
        while (it.hasNext()) {
            C0999e c0999e = (C0999e) it.next();
            if (subMenuC0994E == c0999e.f4209b) {
                c0999e.f4208a.f4353c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0994E.hasVisibleItems()) {
            return false;
        }
        mo2545o(subMenuC0994E);
        InterfaceC1018x interfaceC1018x = this.f4232w;
        if (interfaceC1018x != null) {
            interfaceC1018x.mo1979f(subMenuC0994E);
        }
        return true;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: o */
    public final void mo2545o(MenuC1006l menuC1006l) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        menuC1006l.m2571b(this, this.f4211b);
        if (mo2541b()) {
            m2565y(menuC1006l);
        } else {
            this.f4216g.add(menuC1006l);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0999e c0999e;
        ArrayList arrayList = this.f4217h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0999e = null;
                break;
            }
            c0999e = (C0999e) arrayList.get(i2);
            if (!c0999e.f4208a.f4376z.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0999e != null) {
            c0999e.f4209b.m2572c(false);
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
        if (this.f4223n != view) {
            this.f4223n = view;
            int i2 = this.f4221l;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            this.f4222m = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: r */
    public final void mo2547r(boolean z2) {
        this.f4230u = z2;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: s */
    public final void mo2548s(int i2) {
        if (this.f4221l != i2) {
            this.f4221l = i2;
            View view = this.f4223n;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            this.f4222m = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: t */
    public final void mo2549t(int i2) {
        this.f4226q = true;
        this.f4228s = i2;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: u */
    public final void mo2550u(PopupWindow.OnDismissListener onDismissListener) {
        this.f4234y = (C1015u) onDismissListener;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: v */
    public final void mo2551v(boolean z2) {
        this.f4231v = z2;
    }

    @Override // p102i.AbstractC1014t
    /* renamed from: w */
    public final void mo2552w(int i2) {
        this.f4227r = true;
        this.f4229t = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2565y(p102i.MenuC1006l r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p102i.ViewOnKeyListenerC1000f.m2565y(i.l):void");
    }
}
