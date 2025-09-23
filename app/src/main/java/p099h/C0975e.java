package p099h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p002A1.C0019a;
import p011D1.C0121k;
import p102i.InterfaceC1004j;
import p102i.MenuC1006l;
import p105j.C1104k;

/* renamed from: h.e */
/* loaded from: classes.dex */
public final class C0975e extends AbstractC0971a implements InterfaceC1004j {

    /* renamed from: c */
    public Context f4075c;

    /* renamed from: d */
    public ActionBarContextView f4076d;

    /* renamed from: e */
    public C0019a f4077e;

    /* renamed from: f */
    public WeakReference f4078f;

    /* renamed from: g */
    public boolean f4079g;

    /* renamed from: h */
    public MenuC1006l f4080h;

    @Override // p099h.AbstractC0971a
    /* renamed from: a */
    public final void mo2185a() {
        if (this.f4079g) {
            return;
        }
        this.f4079g = true;
        this.f4077e.m58D(this);
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: b */
    public final View mo2186b() {
        WeakReference weakReference = this.f4078f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: c */
    public final void mo1073c(MenuC1006l menuC1006l) {
        mo2191i();
        C1104k c1104k = this.f4076d.f2087d;
        if (c1104k != null) {
            c1104k.m2727o();
        }
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: d */
    public final MenuC1006l mo2187d() {
        return this.f4080h;
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: e */
    public final MenuInflater mo2188e() {
        return new C0979i(this.f4076d.getContext());
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: f */
    public final CharSequence mo2189f() {
        return this.f4076d.getSubtitle();
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: g */
    public final CharSequence mo2190g() {
        return this.f4076d.getTitle();
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: h */
    public final boolean mo1074h(MenuC1006l menuC1006l, MenuItem menuItem) {
        return ((C0121k) this.f4077e.f47c).m343k(this, menuItem);
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: i */
    public final void mo2191i() {
        this.f4077e.m59E(this, this.f4080h);
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: j */
    public final boolean mo2192j() {
        return this.f4076d.f2102s;
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: k */
    public final void mo2193k(View view) {
        this.f4076d.setCustomView(view);
        this.f4078f = view != null ? new WeakReference(view) : null;
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: l */
    public final void mo2194l(int i2) {
        mo2195m(this.f4075c.getString(i2));
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: m */
    public final void mo2195m(CharSequence charSequence) {
        this.f4076d.setSubtitle(charSequence);
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: n */
    public final void mo2196n(int i2) {
        mo2197o(this.f4075c.getString(i2));
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: o */
    public final void mo2197o(CharSequence charSequence) {
        this.f4076d.setTitle(charSequence);
    }

    @Override // p099h.AbstractC0971a
    /* renamed from: p */
    public final void mo2198p(boolean z2) {
        this.f4068b = z2;
        this.f4076d.setTitleOptional(z2);
    }
}
