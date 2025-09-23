package p105j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p080b1.C0770h;
import p102i.AbstractC1014t;
import p102i.ActionProviderVisibilityListenerC1009o;
import p102i.C1008n;
import p102i.InterfaceC0990A;
import p102i.InterfaceC1018x;
import p102i.InterfaceC1019y;
import p102i.InterfaceC1020z;
import p102i.MenuC1006l;
import p102i.SubMenuC0994E;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.k */
/* loaded from: classes.dex */
public final class C1104k implements InterfaceC1019y {

    /* renamed from: a */
    public final Context f4530a;

    /* renamed from: b */
    public Context f4531b;

    /* renamed from: c */
    public MenuC1006l f4532c;

    /* renamed from: d */
    public final LayoutInflater f4533d;

    /* renamed from: e */
    public InterfaceC1018x f4534e;

    /* renamed from: h */
    public InterfaceC0990A f4537h;

    /* renamed from: i */
    public int f4538i;

    /* renamed from: j */
    public C1098i f4539j;

    /* renamed from: k */
    public Drawable f4540k;

    /* renamed from: l */
    public boolean f4541l;

    /* renamed from: m */
    public boolean f4542m;

    /* renamed from: n */
    public boolean f4543n;

    /* renamed from: o */
    public int f4544o;

    /* renamed from: p */
    public int f4545p;

    /* renamed from: q */
    public int f4546q;

    /* renamed from: r */
    public boolean f4547r;

    /* renamed from: t */
    public C1089f f4549t;

    /* renamed from: u */
    public C1089f f4550u;

    /* renamed from: v */
    public RunnableC1095h f4551v;

    /* renamed from: w */
    public C1092g f4552w;

    /* renamed from: y */
    public int f4554y;

    /* renamed from: f */
    public final int f4535f = R.layout.abc_action_menu_layout;

    /* renamed from: g */
    public final int f4536g = R.layout.abc_action_menu_item_layout;

    /* renamed from: s */
    public final SparseBooleanArray f4548s = new SparseBooleanArray();

    /* renamed from: x */
    public final C0770h f4553x = new C0770h(this);

    public C1104k(Context context) {
        this.f4530a = context;
        this.f4533d = LayoutInflater.from(context);
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: a */
    public final void mo1062a(MenuC1006l menuC1006l, boolean z2) {
        m2725f();
        C1089f c1089f = this.f4550u;
        if (c1089f != null && c1089f.m2594b()) {
            c1089f.f4327i.dismiss();
        }
        InterfaceC1018x interfaceC1018x = this.f4534e;
        if (interfaceC1018x != null) {
            interfaceC1018x.mo1977a(menuC1006l, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [i.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: b */
    public final View m2724b(C1008n c1008n, View view, ViewGroup viewGroup) {
        View actionView = c1008n.getActionView();
        if (actionView == null || c1008n.m2586e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC1020z ? (InterfaceC1020z) view : (InterfaceC1020z) this.f4533d.inflate(this.f4536g, viewGroup, false);
            actionMenuItemView.mo1472e(c1008n);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f4537h);
            if (this.f4552w == null) {
                this.f4552w = new C1092g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f4552w);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c1008n.f4280C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1110m)) {
            actionView.setLayoutParams(ActionMenuView.m1493m(layoutParams));
        }
        return actionView;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: c */
    public final int mo1063c() {
        return this.f4538i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p102i.InterfaceC1019y
    /* renamed from: d */
    public final void mo1064d() {
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f4537h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC1006l menuC1006l = this.f4532c;
            if (menuC1006l != null) {
                menuC1006l.m2575i();
                ArrayList arrayListM2576l = this.f4532c.m2576l();
                int size = arrayListM2576l.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C1008n c1008n = (C1008n) arrayListM2576l.get(i3);
                    if ((c1008n.f4304x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        C1008n itemData = childAt instanceof InterfaceC1020z ? ((InterfaceC1020z) childAt).getItemData() : null;
                        View viewM2724b = m2724b(c1008n, childAt, viewGroup);
                        if (c1008n != itemData) {
                            viewM2724b.setPressed(false);
                            viewM2724b.jumpDrawablesToCurrentState();
                        }
                        if (viewM2724b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM2724b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM2724b);
                            }
                            ((ViewGroup) this.f4537h).addView(viewM2724b, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f4539j) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f4537h).requestLayout();
        MenuC1006l menuC1006l2 = this.f4532c;
        if (menuC1006l2 != null) {
            menuC1006l2.m2575i();
            ArrayList arrayList2 = menuC1006l2.f4259i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ActionProviderVisibilityListenerC1009o actionProviderVisibilityListenerC1009o = ((C1008n) arrayList2.get(i4)).f4278A;
            }
        }
        MenuC1006l menuC1006l3 = this.f4532c;
        if (menuC1006l3 != null) {
            menuC1006l3.m2575i();
            arrayList = menuC1006l3.f4260j;
        }
        if (this.f4542m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C1008n) arrayList.get(0)).f4280C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f4539j == null) {
                this.f4539j = new C1098i(this, this.f4530a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f4539j.getParent();
            if (viewGroup3 != this.f4537h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f4539j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4537h;
                C1098i c1098i = this.f4539j;
                actionMenuView.getClass();
                C1110m c1110mM1492l = ActionMenuView.m1492l();
                c1110mM1492l.f4562a = true;
                actionMenuView.addView(c1098i, c1110mM1492l);
            }
        } else {
            C1098i c1098i2 = this.f4539j;
            if (c1098i2 != null) {
                Object parent = c1098i2.getParent();
                Object obj = this.f4537h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f4539j);
                }
            }
        }
        ((ActionMenuView) this.f4537h).setOverflowReserved(this.f4542m);
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: e */
    public final boolean mo1065e(C1008n c1008n) {
        return false;
    }

    /* renamed from: f */
    public final boolean m2725f() {
        Object obj;
        RunnableC1095h runnableC1095h = this.f4551v;
        if (runnableC1095h != null && (obj = this.f4537h) != null) {
            ((View) obj).removeCallbacks(runnableC1095h);
            this.f4551v = null;
            return true;
        }
        C1089f c1089f = this.f4549t;
        if (c1089f == null) {
            return false;
        }
        if (c1089f.m2594b()) {
            c1089f.f4327i.dismiss();
        }
        return true;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: g */
    public final boolean mo1066g() {
        int size;
        ArrayList arrayListM2576l;
        int i2;
        boolean z2;
        C1104k c1104k = this;
        MenuC1006l menuC1006l = c1104k.f4532c;
        if (menuC1006l != null) {
            arrayListM2576l = menuC1006l.m2576l();
            size = arrayListM2576l.size();
        } else {
            size = 0;
            arrayListM2576l = null;
        }
        int i3 = c1104k.f4546q;
        int i4 = c1104k.f4545p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1104k.f4537h;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= size) {
                break;
            }
            C1008n c1008n = (C1008n) arrayListM2576l.get(i5);
            int i8 = c1008n.f4305y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (c1104k.f4547r && c1008n.f4280C) {
                i3 = 0;
            }
            i5++;
        }
        if (c1104k.f4542m && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = c1104k.f4548s;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C1008n c1008n2 = (C1008n) arrayListM2576l.get(i10);
            int i12 = c1008n2.f4305y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c1008n2.f4282b;
            if (z4) {
                View viewM2724b = c1104k.m2724b(c1008n2, null, viewGroup);
                viewM2724b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM2724b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c1008n2.m2588g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View viewM2724b2 = c1104k.m2724b(c1008n2, null, viewGroup);
                    viewM2724b2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM2724b2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        C1008n c1008n3 = (C1008n) arrayListM2576l.get(i14);
                        if (c1008n3.f4282b == i13) {
                            if ((c1008n3.f4304x & 32) == 32) {
                                i9++;
                            }
                            c1008n3.m2588g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c1008n2.m2588g(z6);
            } else {
                c1008n2.m2588g(false);
                i10++;
                i2 = 2;
                c1104k = this;
                z2 = true;
            }
            i10++;
            i2 = 2;
            c1104k = this;
            z2 = true;
        }
        return z2;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: h */
    public final void mo1067h(Context context, MenuC1006l menuC1006l) {
        this.f4531b = context;
        LayoutInflater.from(context);
        this.f4532c = menuC1006l;
        Resources resources = context.getResources();
        if (!this.f4543n) {
            this.f4542m = true;
        }
        int i2 = 2;
        this.f4544o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f4546q = i2;
        int measuredWidth = this.f4544o;
        if (this.f4542m) {
            if (this.f4539j == null) {
                C1098i c1098i = new C1098i(this, this.f4530a);
                this.f4539j = c1098i;
                if (this.f4541l) {
                    c1098i.setImageDrawable(this.f4540k);
                    this.f4540k = null;
                    this.f4541l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4539j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f4539j.getMeasuredWidth();
        } else {
            this.f4539j = null;
        }
        this.f4545p = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: i */
    public final boolean m2726i() {
        C1089f c1089f = this.f4549t;
        return c1089f != null && c1089f.m2594b();
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: j */
    public final Parcelable mo1068j() {
        C1101j c1101j = new C1101j();
        c1101j.f4516a = this.f4554y;
        return c1101j;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: k */
    public final void mo2544k(InterfaceC1018x interfaceC1018x) {
        throw null;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: l */
    public final boolean mo1069l(C1008n c1008n) {
        return false;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: m */
    public final void mo1070m(Parcelable parcelable) {
        int i2;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C1101j) && (i2 = ((C1101j) parcelable).f4516a) > 0 && (menuItemFindItem = this.f4532c.findItem(i2)) != null) {
            mo1071n((SubMenuC0994E) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p102i.InterfaceC1019y
    /* renamed from: n */
    public final boolean mo1071n(SubMenuC0994E subMenuC0994E) {
        boolean z2;
        if (subMenuC0994E.hasVisibleItems()) {
            SubMenuC0994E subMenuC0994E2 = subMenuC0994E;
            while (true) {
                MenuC1006l menuC1006l = subMenuC0994E2.f4185z;
                if (menuC1006l == this.f4532c) {
                    break;
                }
                subMenuC0994E2 = (SubMenuC0994E) menuC1006l;
            }
            ViewGroup viewGroup = (ViewGroup) this.f4537h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof InterfaceC1020z) && ((InterfaceC1020z) childAt).getItemData() == subMenuC0994E2.f4184A) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                this.f4554y = subMenuC0994E.f4184A.f4281a;
                int size = subMenuC0994E.f4256f.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = subMenuC0994E.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                C1089f c1089f = new C1089f(this, this.f4531b, subMenuC0994E, view);
                this.f4550u = c1089f;
                c1089f.f4325g = z2;
                AbstractC1014t abstractC1014t = c1089f.f4327i;
                if (abstractC1014t != null) {
                    abstractC1014t.mo2547r(z2);
                }
                C1089f c1089f2 = this.f4550u;
                if (!c1089f2.m2594b()) {
                    if (c1089f2.f4323e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1089f2.m2596d(0, 0, false, false);
                }
                InterfaceC1018x interfaceC1018x = this.f4534e;
                if (interfaceC1018x != null) {
                    interfaceC1018x.mo1979f(subMenuC0994E);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m2727o() {
        MenuC1006l menuC1006l;
        if (!this.f4542m || m2726i() || (menuC1006l = this.f4532c) == null || this.f4537h == null || this.f4551v != null) {
            return false;
        }
        menuC1006l.m2575i();
        if (menuC1006l.f4260j.isEmpty()) {
            return false;
        }
        RunnableC1095h runnableC1095h = new RunnableC1095h(this, new C1089f(this, this.f4531b, this.f4532c, this.f4539j));
        this.f4551v = runnableC1095h;
        ((View) this.f4537h).post(runnableC1095h);
        return true;
    }
}
