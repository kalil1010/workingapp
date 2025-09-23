package p090e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p002A1.C0019a;
import p011D1.C0121k;
import p099h.AbstractC0971a;
import p099h.C0979i;
import p102i.InterfaceC1004j;
import p102i.MenuC1006l;
import p105j.C1104k;

/* renamed from: e.G */
/* loaded from: classes.dex */
public final class C0866G extends AbstractC0971a implements InterfaceC1004j {

    /* renamed from: c */
    public final Context f3535c;

    /* renamed from: d */
    public final MenuC1006l f3536d;

    /* renamed from: e */
    public C0019a f3537e;

    /* renamed from: f */
    public WeakReference f3538f;

    /* renamed from: g */
    public final /* synthetic */ C0867H f3539g;

    public C0866G(C0867H c0867h, Context context, C0019a c0019a) {
        this.f3539g = c0867h;
        this.f3535c = context;
        this.f3537e = c0019a;
        MenuC1006l menuC1006l = new MenuC1006l(context);
        menuC1006l.f4262l = 1;
        this.f3536d = menuC1006l;
        menuC1006l.f4255e = this;
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: a */
    public final void mo2185a() {
        C0867H c0867h = this.f3539g;
        if (c0867h.f3561v != this) {
            return;
        }
        if (c0867h.f3544C) {
            c0867h.f3562w = this;
            c0867h.f3563x = this.f3537e;
        } else {
            this.f3537e.m58D(this);
        }
        this.f3537e = null;
        c0867h.m2199L(false);
        ActionBarContextView actionBarContextView = c0867h.f3558s;
        if (actionBarContextView.f2094k == null) {
            actionBarContextView.m1483e();
        }
        c0867h.f3555p.setHideOnContentScrollEnabled(c0867h.f3549H);
        c0867h.f3561v = null;
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: b */
    public final View mo2186b() {
        WeakReference weakReference = this.f3538f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: c */
    public final void mo1073c(MenuC1006l menuC1006l) {
        if (this.f3537e == null) {
            return;
        }
        mo2191i();
        C1104k c1104k = this.f3539g.f3558s.f2087d;
        if (c1104k != null) {
            c1104k.m2727o();
        }
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: d */
    public final MenuC1006l mo2187d() {
        return this.f3536d;
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: e */
    public final MenuInflater mo2188e() {
        return new C0979i(this.f3535c);
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: f */
    public final CharSequence mo2189f() {
        return this.f3539g.f3558s.getSubtitle();
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: g */
    public final CharSequence mo2190g() {
        return this.f3539g.f3558s.getTitle();
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: h */
    public final boolean mo1074h(MenuC1006l menuC1006l, MenuItem menuItem) {
        C0019a c0019a = this.f3537e;
        if (c0019a != null) {
            return ((C0121k) c0019a.f47c).m343k(this, menuItem);
        }
        return false;
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: i */
    public final void mo2191i() {
        if (this.f3539g.f3561v != this) {
            return;
        }
        MenuC1006l menuC1006l = this.f3536d;
        menuC1006l.m2583w();
        try {
            this.f3537e.m59E(this, menuC1006l);
        } finally {
            menuC1006l.m2582v();
        }
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: j */
    public final boolean mo2192j() {
        return this.f3539g.f3558s.f2102s;
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: k */
    public final void mo2193k(View view) {
        this.f3539g.f3558s.setCustomView(view);
        this.f3538f = new WeakReference(view);
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: l */
    public final void mo2194l(int i2) {
        mo2195m(this.f3539g.f3553n.getResources().getString(i2));
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: m */
    public final void mo2195m(CharSequence charSequence) {
        this.f3539g.f3558s.setSubtitle(charSequence);
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: n */
    public final void mo2196n(int i2) {
        mo2197o(this.f3539g.f3553n.getResources().getString(i2));
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: o */
    public final void mo2197o(CharSequence charSequence) {
        this.f3539g.f3558s.setTitle(charSequence);
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: p */
    public final void mo2198p(boolean z2) {
        this.f4068b = z2;
        this.f3539g.f3558s.setTitleOptional(z2);
    }
}
