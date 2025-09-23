package p035M0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p005B1.ViewOnClickListenerC0066d;
import p028K.AbstractC0241P;
import p094f0.AbstractC0903B;
import p094f0.AbstractC0926Z;
import p102i.C1008n;
import p102i.SubMenuC0994E;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: M0.i */
/* loaded from: classes.dex */
public final class C0380i extends AbstractC0903B {

    /* renamed from: c */
    public final ArrayList f1211c = new ArrayList();

    /* renamed from: d */
    public C1008n f1212d;

    /* renamed from: e */
    public boolean f1213e;

    /* renamed from: f */
    public final /* synthetic */ C0388q f1214f;

    public C0380i(C0388q c0388q) {
        this.f1214f = c0388q;
        m1060g();
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: a */
    public final int mo188a() {
        return this.f1211c.size();
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: b */
    public final long mo1057b(int i2) {
        return i2;
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: c */
    public final int mo1058c(int i2) {
        InterfaceC0382k interfaceC0382k = (InterfaceC0382k) this.f1211c.get(i2);
        if (interfaceC0382k instanceof C0383l) {
            return 2;
        }
        if (interfaceC0382k instanceof C0381j) {
            return 3;
        }
        if (interfaceC0382k instanceof C0384m) {
            return ((C0384m) interfaceC0382k).f1217a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: d */
    public final void mo189d(AbstractC0926Z abstractC0926Z, int i2) {
        int iMo1058c = mo1058c(i2);
        ArrayList arrayList = this.f1211c;
        C0388q c0388q = this.f1214f;
        View view = ((AbstractC0387p) abstractC0926Z).f3815a;
        if (iMo1058c != 0) {
            if (iMo1058c != 1) {
                if (iMo1058c != 2) {
                    return;
                }
                C0383l c0383l = (C0383l) arrayList.get(i2);
                view.setPadding(c0388q.f1241s, c0383l.f1215a, c0388q.f1242t, c0383l.f1216b);
                return;
            }
            TextView textView = (TextView) view;
            textView.setText(((C0384m) arrayList.get(i2)).f1217a.f4285e);
            textView.setTextAppearance(c0388q.f1229g);
            textView.setPadding(c0388q.f1243u, textView.getPaddingTop(), c0388q.f1244v, textView.getPaddingBottom());
            ColorStateList colorStateList = c0388q.f1230h;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            AbstractC0241P.m701m(textView, new C0379h(this, i2, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        navigationMenuItemView.setIconTintList(c0388q.f1234l);
        navigationMenuItemView.setTextAppearance(c0388q.f1231i);
        ColorStateList colorStateList2 = c0388q.f1233k;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = c0388q.f1235m;
        Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        navigationMenuItemView.setBackground(drawableNewDrawable);
        RippleDrawable rippleDrawable = c0388q.f1236n;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        C0384m c0384m = (C0384m) arrayList.get(i2);
        navigationMenuItemView.setNeedsEmptyIcon(c0384m.f1218b);
        int i3 = c0388q.f1237o;
        int i4 = c0388q.f1238p;
        navigationMenuItemView.setPadding(i3, i4, i3, i4);
        navigationMenuItemView.setIconPadding(c0388q.f1239q);
        if (c0388q.f1245w) {
            navigationMenuItemView.setIconSize(c0388q.f1240r);
        }
        navigationMenuItemView.setMaxLines(c0388q.f1247y);
        navigationMenuItemView.f3281y = c0388q.f1232j;
        navigationMenuItemView.mo1472e(c0384m.f1217a);
        AbstractC0241P.m701m(navigationMenuItemView, new C0379h(this, i2, false));
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: e */
    public final AbstractC0926Z mo190e(ViewGroup viewGroup, int i2) {
        C0388q c0388q = this.f1214f;
        if (i2 == 0) {
            LayoutInflater layoutInflater = c0388q.f1228f;
            ViewOnClickListenerC0066d viewOnClickListenerC0066d = c0388q.f1222C;
            View viewInflate = layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false);
            C0386o c0386o = new C0386o(viewInflate);
            viewInflate.setOnClickListener(viewOnClickListenerC0066d);
            return c0386o;
        }
        if (i2 == 1) {
            return new C0378g(c0388q.f1228f.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i2 == 2) {
            return new C0378g(c0388q.f1228f.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i2 != 3) {
            return null;
        }
        return new C0378g(c0388q.f1224b);
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: f */
    public final void mo1059f(AbstractC0926Z abstractC0926Z) {
        AbstractC0387p abstractC0387p = (AbstractC0387p) abstractC0926Z;
        if (abstractC0387p instanceof C0386o) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC0387p.f3815a;
            FrameLayout frameLayout = navigationMenuItemView.f3272A;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f3282z.setCompoundDrawables(null, null, null, null);
        }
    }

    /* renamed from: g */
    public final void m1060g() {
        boolean z2;
        if (this.f1213e) {
            return;
        }
        this.f1213e = true;
        ArrayList arrayList = this.f1211c;
        arrayList.clear();
        arrayList.add(new C0381j());
        C0388q c0388q = this.f1214f;
        int size = c0388q.f1225c.m2576l().size();
        boolean z3 = false;
        int i2 = -1;
        int i3 = 0;
        boolean z4 = false;
        int size2 = 0;
        while (i3 < size) {
            C1008n c1008n = (C1008n) c0388q.f1225c.m2576l().get(i3);
            if (c1008n.isChecked()) {
                m1061h(c1008n);
            }
            if (c1008n.isCheckable()) {
                c1008n.m2587f(z3);
            }
            if (c1008n.hasSubMenu()) {
                SubMenuC0994E subMenuC0994E = c1008n.f4295o;
                if (subMenuC0994E.hasVisibleItems()) {
                    if (i3 != 0) {
                        arrayList.add(new C0383l(c0388q.f1220A, z3 ? 1 : 0));
                    }
                    arrayList.add(new C0384m(c1008n));
                    int size3 = subMenuC0994E.f4256f.size();
                    int i4 = z3 ? 1 : 0;
                    int i5 = i4;
                    while (i4 < size3) {
                        C1008n c1008n2 = (C1008n) subMenuC0994E.getItem(i4);
                        if (c1008n2.isVisible()) {
                            if (i5 == 0 && c1008n2.getIcon() != null) {
                                i5 = 1;
                            }
                            if (c1008n2.isCheckable()) {
                                c1008n2.m2587f(z3);
                            }
                            if (c1008n.isChecked()) {
                                m1061h(c1008n);
                            }
                            arrayList.add(new C0384m(c1008n2));
                        }
                        i4++;
                        z3 = false;
                    }
                    if (i5 != 0) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((C0384m) arrayList.get(size5)).f1218b = true;
                        }
                    }
                }
                z2 = true;
            } else {
                int i6 = c1008n.f4282b;
                if (i6 != i2) {
                    size2 = arrayList.size();
                    z4 = c1008n.getIcon() != null;
                    if (i3 != 0) {
                        size2++;
                        int i7 = c0388q.f1220A;
                        arrayList.add(new C0383l(i7, i7));
                    }
                } else {
                    if (!z4 && c1008n.getIcon() != null) {
                        int size6 = arrayList.size();
                        for (int i8 = size2; i8 < size6; i8++) {
                            ((C0384m) arrayList.get(i8)).f1218b = true;
                        }
                        z2 = true;
                        z4 = true;
                    }
                    C0384m c0384m = new C0384m(c1008n);
                    c0384m.f1218b = z4;
                    arrayList.add(c0384m);
                    i2 = i6;
                }
                z2 = true;
                C0384m c0384m2 = new C0384m(c1008n);
                c0384m2.f1218b = z4;
                arrayList.add(c0384m2);
                i2 = i6;
            }
            i3++;
            z3 = false;
        }
        this.f1213e = z3 ? 1 : 0;
    }

    /* renamed from: h */
    public final void m1061h(C1008n c1008n) {
        if (this.f1212d == c1008n || !c1008n.isCheckable()) {
            return;
        }
        C1008n c1008n2 = this.f1212d;
        if (c1008n2 != null) {
            c1008n2.setChecked(false);
        }
        this.f1212d = c1008n;
        c1008n.setChecked(true);
    }
}
