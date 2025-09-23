package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0717t implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0691I f2668a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0718u f2669b;

    public ViewOnAttachStateChangeListenerC0717t(LayoutInflaterFactory2C0718u layoutInflaterFactory2C0718u, C0691I c0691i) {
        this.f2669b = layoutInflaterFactory2C0718u;
        this.f2668a = c0691i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0691I c0691i = this.f2668a;
        c0691i.m1708k();
        C0705h.m1733f((ViewGroup) c0691i.f2506c.f2616E.getParent(), this.f2669b.f2670a.m1652C()).m1738e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
