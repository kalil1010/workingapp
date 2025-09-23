package p105j;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p099h.InterfaceC0972b;
import p102i.C1008n;
import p102i.InterfaceC1019y;
import p102i.MenuC1006l;
import p102i.SubMenuC0994E;

/* renamed from: j.h1 */
/* loaded from: classes.dex */
public final class C1097h1 implements InterfaceC1019y {

    /* renamed from: a */
    public MenuC1006l f4510a;

    /* renamed from: b */
    public C1008n f4511b;

    /* renamed from: c */
    public final /* synthetic */ Toolbar f4512c;

    public C1097h1(Toolbar toolbar) {
        this.f4512c = toolbar;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: a */
    public final void mo1062a(MenuC1006l menuC1006l, boolean z2) {
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: c */
    public final int mo1063c() {
        return 0;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: d */
    public final void mo1064d() {
        if (this.f4511b != null) {
            MenuC1006l menuC1006l = this.f4510a;
            if (menuC1006l != null) {
                int size = menuC1006l.f4256f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f4510a.getItem(i2) == this.f4511b) {
                        return;
                    }
                }
            }
            mo1065e(this.f4511b);
        }
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: e */
    public final boolean mo1065e(C1008n c1008n) {
        Toolbar toolbar = this.f4512c;
        KeyEvent.Callback callback = toolbar.f2225i;
        if (callback instanceof InterfaceC0972b) {
            ((InterfaceC0972b) callback).mo1500d();
        }
        toolbar.removeView(toolbar.f2225i);
        toolbar.removeView(toolbar.f2224h);
        toolbar.f2225i = null;
        ArrayList arrayList = toolbar.f2204E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f4511b = null;
        toolbar.requestLayout();
        c1008n.f4280C = false;
        c1008n.f4294n.mo1072p(false);
        toolbar.m1536u();
        return true;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: g */
    public final boolean mo1066g() {
        return false;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: h */
    public final void mo1067h(Context context, MenuC1006l menuC1006l) {
        C1008n c1008n;
        MenuC1006l menuC1006l2 = this.f4510a;
        if (menuC1006l2 != null && (c1008n = this.f4511b) != null) {
            menuC1006l2.mo2553d(c1008n);
        }
        this.f4510a = menuC1006l;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: j */
    public final Parcelable mo1068j() {
        return null;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: l */
    public final boolean mo1069l(C1008n c1008n) {
        Toolbar toolbar = this.f4512c;
        toolbar.m1522c();
        ViewParent parent = toolbar.f2224h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2224h);
            }
            toolbar.addView(toolbar.f2224h);
        }
        View actionView = c1008n.getActionView();
        toolbar.f2225i = actionView;
        this.f4511b = c1008n;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2225i);
            }
            C1100i1 c1100i1M1516h = Toolbar.m1516h();
            c1100i1M1516h.f4514a = (toolbar.f2230n & 112) | 8388611;
            c1100i1M1516h.f4515b = 2;
            toolbar.f2225i.setLayoutParams(c1100i1M1516h);
            toolbar.addView(toolbar.f2225i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1100i1) childAt.getLayoutParams()).f4515b != 2 && childAt != toolbar.f2217a) {
                toolbar.removeViewAt(childCount);
                toolbar.f2204E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1008n.f4280C = true;
        c1008n.f4294n.mo1072p(false);
        KeyEvent.Callback callback = toolbar.f2225i;
        if (callback instanceof InterfaceC0972b) {
            ((InterfaceC0972b) callback).mo1499a();
        }
        toolbar.m1536u();
        return true;
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: m */
    public final void mo1070m(Parcelable parcelable) {
    }

    @Override // p102i.InterfaceC1019y
    /* renamed from: n */
    public final boolean mo1071n(SubMenuC0994E subMenuC0994E) {
        return false;
    }
}
