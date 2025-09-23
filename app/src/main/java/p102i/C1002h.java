package p102i;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p007C0.C0088f;
import p090e.C0870c;
import p090e.DialogC0873f;

/* renamed from: i.h */
/* loaded from: classes.dex */
public final class C1002h implements InterfaceC1019y, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Context f4238a;

    /* renamed from: b */
    public LayoutInflater f4239b;

    /* renamed from: c */
    public MenuC1006l f4240c;

    /* renamed from: d */
    public ExpandedMenuView f4241d;

    /* renamed from: e */
    public InterfaceC1018x f4242e;

    /* renamed from: f */
    public C1001g f4243f;

    public C1002h(ContextWrapper contextWrapper) {
        this.f4238a = contextWrapper;
        this.f4239b = LayoutInflater.from(contextWrapper);
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: a */
    public final void mo1062a(MenuC1006l menuC1006l, boolean z2) {
        InterfaceC1018x interfaceC1018x = this.f4242e;
        if (interfaceC1018x != null) {
            interfaceC1018x.mo1977a(menuC1006l, z2);
        }
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: c */
    public final int mo1063c() {
        return 0;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: d */
    public final void mo1064d() {
        C1001g c1001g = this.f4243f;
        if (c1001g != null) {
            c1001g.notifyDataSetChanged();
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
        if (this.f4238a != null) {
            this.f4238a = context;
            if (this.f4239b == null) {
                this.f4239b = LayoutInflater.from(context);
            }
        }
        this.f4240c = menuC1006l;
        C1001g c1001g = this.f4243f;
        if (c1001g != null) {
            c1001g.notifyDataSetChanged();
        }
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: j */
    public final Parcelable mo1068j() {
        if (this.f4241d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f4241d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
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
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f4241d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: n */
    public final boolean mo1071n(SubMenuC0994E subMenuC0994E) {
        if (!subMenuC0994E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC1007m dialogInterfaceOnKeyListenerC1007m = new DialogInterfaceOnKeyListenerC1007m();
        dialogInterfaceOnKeyListenerC1007m.f4275a = subMenuC0994E;
        Context context = subMenuC0994E.f4251a;
        C0088f c0088f = new C0088f(context);
        C0870c c0870c = (C0870c) c0088f.f208b;
        C1002h c1002h = new C1002h(c0870c.f3568a);
        dialogInterfaceOnKeyListenerC1007m.f4277c = c1002h;
        c1002h.f4242e = dialogInterfaceOnKeyListenerC1007m;
        subMenuC0994E.m2571b(c1002h, context);
        C1002h c1002h2 = dialogInterfaceOnKeyListenerC1007m.f4277c;
        if (c1002h2.f4243f == null) {
            c1002h2.f4243f = new C1001g(c1002h2);
        }
        c0870c.f3574g = c1002h2.f4243f;
        c0870c.f3575h = dialogInterfaceOnKeyListenerC1007m;
        View view = subMenuC0994E.f4265o;
        if (view != null) {
            c0870c.f3572e = view;
        } else {
            c0870c.f3570c = subMenuC0994E.f4264n;
            c0870c.f3571d = subMenuC0994E.f4263m;
        }
        c0870c.f3573f = dialogInterfaceOnKeyListenerC1007m;
        DialogC0873f dialogC0873fM281a = c0088f.m281a();
        dialogInterfaceOnKeyListenerC1007m.f4276b = dialogC0873fM281a;
        dialogC0873fM281a.setOnDismissListener(dialogInterfaceOnKeyListenerC1007m);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC1007m.f4276b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC1007m.f4276b.show();
        InterfaceC1018x interfaceC1018x = this.f4242e;
        if (interfaceC1018x == null) {
            return true;
        }
        interfaceC1018x.mo1979f(subMenuC0994E);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f4240c.m2577q(this.f4243f.getItem(i2), this, 0);
    }
}
