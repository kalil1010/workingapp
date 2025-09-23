package p102i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: i.i */
/* loaded from: classes.dex */
public final class C1003i extends BaseAdapter {

    /* renamed from: a */
    public final MenuC1006l f4244a;

    /* renamed from: b */
    public int f4245b = -1;

    /* renamed from: c */
    public boolean f4246c;

    /* renamed from: d */
    public final boolean f4247d;

    /* renamed from: e */
    public final LayoutInflater f4248e;

    /* renamed from: f */
    public final int f4249f;

    public C1003i(MenuC1006l menuC1006l, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f4247d = z2;
        this.f4248e = layoutInflater;
        this.f4244a = menuC1006l;
        this.f4249f = i2;
        m2568a();
    }

    /* renamed from: a */
    public final void m2568a() {
        MenuC1006l menuC1006l = this.f4244a;
        C1008n c1008n = menuC1006l.f4272v;
        if (c1008n != null) {
            menuC1006l.m2575i();
            ArrayList arrayList = menuC1006l.f4260j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C1008n) arrayList.get(i2)) == c1008n) {
                    this.f4245b = i2;
                    return;
                }
            }
        }
        this.f4245b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1008n getItem(int i2) {
        ArrayList arrayListM2576l;
        MenuC1006l menuC1006l = this.f4244a;
        if (this.f4247d) {
            menuC1006l.m2575i();
            arrayListM2576l = menuC1006l.f4260j;
        } else {
            arrayListM2576l = menuC1006l.m2576l();
        }
        int i3 = this.f4245b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C1008n) arrayListM2576l.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM2576l;
        MenuC1006l menuC1006l = this.f4244a;
        if (this.f4247d) {
            menuC1006l.m2575i();
            arrayListM2576l = menuC1006l.f4260j;
        } else {
            arrayListM2576l = menuC1006l.m2576l();
        }
        return this.f4245b < 0 ? arrayListM2576l.size() : arrayListM2576l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f4248e.inflate(this.f4249f, viewGroup, false);
        }
        int i3 = getItem(i2).f4282b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f4282b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4244a.mo2558m() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC1020z interfaceC1020z = (InterfaceC1020z) view;
        if (this.f4246c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1020z.mo1472e(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2568a();
        super.notifyDataSetChanged();
    }
}
