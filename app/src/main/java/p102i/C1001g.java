package p102i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: i.g */
/* loaded from: classes.dex */
public final class C1001g extends BaseAdapter {

    /* renamed from: a */
    public int f4236a = -1;

    /* renamed from: b */
    public final /* synthetic */ C1002h f4237b;

    public C1001g(C1002h c1002h) {
        this.f4237b = c1002h;
        m2566a();
    }

    /* renamed from: a */
    public final void m2566a() {
        MenuC1006l menuC1006l = this.f4237b.f4240c;
        C1008n c1008n = menuC1006l.f4272v;
        if (c1008n != null) {
            menuC1006l.m2575i();
            ArrayList arrayList = menuC1006l.f4260j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C1008n) arrayList.get(i2)) == c1008n) {
                    this.f4236a = i2;
                    return;
                }
            }
        }
        this.f4236a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1008n getItem(int i2) {
        C1002h c1002h = this.f4237b;
        MenuC1006l menuC1006l = c1002h.f4240c;
        menuC1006l.m2575i();
        ArrayList arrayList = menuC1006l.f4260j;
        c1002h.getClass();
        int i3 = this.f4236a;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C1008n) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1002h c1002h = this.f4237b;
        MenuC1006l menuC1006l = c1002h.f4240c;
        menuC1006l.m2575i();
        int size = menuC1006l.f4260j.size();
        c1002h.getClass();
        return this.f4236a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f4237b.f4239b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC1020z) view).mo1472e(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2566a();
        super.notifyDataSetChanged();
    }
}
