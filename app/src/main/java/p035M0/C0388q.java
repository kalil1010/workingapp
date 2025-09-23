package p035M0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import p005B1.ViewOnClickListenerC0066d;
import p102i.C1008n;
import p102i.InterfaceC1019y;
import p102i.MenuC1006l;
import p102i.SubMenuC0994E;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: M0.q */
/* loaded from: classes.dex */
public final class C0388q implements InterfaceC1019y {

    /* renamed from: A */
    public int f1220A;

    /* renamed from: a */
    public NavigationMenuView f1223a;

    /* renamed from: b */
    public LinearLayout f1224b;

    /* renamed from: c */
    public MenuC1006l f1225c;

    /* renamed from: d */
    public int f1226d;

    /* renamed from: e */
    public C0380i f1227e;

    /* renamed from: f */
    public LayoutInflater f1228f;

    /* renamed from: h */
    public ColorStateList f1230h;

    /* renamed from: k */
    public ColorStateList f1233k;

    /* renamed from: l */
    public ColorStateList f1234l;

    /* renamed from: m */
    public Drawable f1235m;

    /* renamed from: n */
    public RippleDrawable f1236n;

    /* renamed from: o */
    public int f1237o;

    /* renamed from: p */
    public int f1238p;

    /* renamed from: q */
    public int f1239q;

    /* renamed from: r */
    public int f1240r;

    /* renamed from: s */
    public int f1241s;

    /* renamed from: t */
    public int f1242t;

    /* renamed from: u */
    public int f1243u;

    /* renamed from: v */
    public int f1244v;

    /* renamed from: w */
    public boolean f1245w;

    /* renamed from: y */
    public int f1247y;

    /* renamed from: z */
    public int f1248z;

    /* renamed from: g */
    public int f1229g = 0;

    /* renamed from: i */
    public int f1231i = 0;

    /* renamed from: j */
    public boolean f1232j = true;

    /* renamed from: x */
    public boolean f1246x = true;

    /* renamed from: B */
    public int f1221B = -1;

    /* renamed from: C */
    public final ViewOnClickListenerC0066d f1222C = new ViewOnClickListenerC0066d(1, this);

    @Override // p102i.InterfaceC1019y
    /* renamed from: a */
    public final void mo1062a(MenuC1006l menuC1006l, boolean z2) {
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: c */
    public final int mo1063c() {
        return this.f1226d;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: d */
    public final void mo1064d() {
        C0380i c0380i = this.f1227e;
        if (c0380i != null) {
            c0380i.m1060g();
            c0380i.f3738a.m2332b();
        }
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: e */
    public final boolean mo1065e(C1008n c1008n) {
        return false;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: g */
    public final boolean mo1066g() {
        return false;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: h */
    public final void mo1067h(Context context, MenuC1006l menuC1006l) {
        this.f1228f = LayoutInflater.from(context);
        this.f1225c = menuC1006l;
        this.f1220A = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: j */
    public final Parcelable mo1068j() {
        Bundle bundle = new Bundle();
        if (this.f1223a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1223a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C0380i c0380i = this.f1227e;
        if (c0380i != null) {
            c0380i.getClass();
            Bundle bundle2 = new Bundle();
            C1008n c1008n = c0380i.f1212d;
            if (c1008n != null) {
                bundle2.putInt("android:menu:checked", c1008n.f4281a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList arrayList = c0380i.f1211c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0382k interfaceC0382k = (InterfaceC0382k) arrayList.get(i2);
                if (interfaceC0382k instanceof C0384m) {
                    C1008n c1008n2 = ((C0384m) interfaceC0382k).f1217a;
                    View actionView = c1008n2 != null ? c1008n2.getActionView() : null;
                    if (actionView != null) {
                        C0390s c0390s = new C0390s();
                        actionView.saveHierarchyState(c0390s);
                        sparseArray2.put(c1008n2.f4281a, c0390s);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f1224b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f1224b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: l */
    public final boolean mo1069l(C1008n c1008n) {
        return false;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: m */
    public final void mo1070m(Parcelable parcelable) {
        C1008n c1008n;
        View actionView;
        C0390s c0390s;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f1223a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C0380i c0380i = this.f1227e;
                c0380i.getClass();
                int i2 = bundle2.getInt("android:menu:checked", 0);
                ArrayList arrayList = c0380i.f1211c;
                if (i2 != 0) {
                    c0380i.f1213e = true;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        InterfaceC0382k interfaceC0382k = (InterfaceC0382k) arrayList.get(i3);
                        if (interfaceC0382k instanceof C0384m) {
                            C1008n c1008n2 = ((C0384m) interfaceC0382k).f1217a;
                            if (c1008n2.f4281a == i2) {
                                c0380i.m1061h(c1008n2);
                                break;
                            }
                        }
                        i3++;
                    }
                    c0380i.f1213e = false;
                    c0380i.m1060g();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        InterfaceC0382k interfaceC0382k2 = (InterfaceC0382k) arrayList.get(i4);
                        if ((interfaceC0382k2 instanceof C0384m) && (actionView = (c1008n = ((C0384m) interfaceC0382k2).f1217a).getActionView()) != null && (c0390s = (C0390s) sparseParcelableArray2.get(c1008n.f4281a)) != null) {
                            actionView.restoreHierarchyState(c0390s);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f1224b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: n */
    public final boolean mo1071n(SubMenuC0994E subMenuC0994E) {
        return false;
    }
}
