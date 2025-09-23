package p099h;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p102i.MenuC0991B;

/* renamed from: h.f */
/* loaded from: classes.dex */
public final class C0976f extends ActionMode {

    /* renamed from: a */
    public final Context f4081a;

    /* renamed from: b */
    public final AbstractC0971a f4082b;

    public C0976f(Context context, AbstractC0971a abstractC0971a) {
        this.f4081a = context;
        this.f4082b = abstractC0971a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f4082b.mo2185a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f4082b.mo2186b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0991B(this.f4081a, this.f4082b.mo2187d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f4082b.mo2188e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f4082b.mo2189f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f4082b.f4067a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f4082b.mo2190g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f4082b.f4068b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f4082b.mo2191i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f4082b.mo2192j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f4082b.mo2193k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f4082b.mo2195m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f4082b.f4067a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f4082b.mo2197o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f4082b.mo2198p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f4082b.mo2194l(i2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f4082b.mo2196n(i2);
    }
}
