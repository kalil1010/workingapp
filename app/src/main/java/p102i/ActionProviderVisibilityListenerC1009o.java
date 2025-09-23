package p102i;

import android.view.ActionProvider;
import android.view.View;
import p080b1.C0770h;

/* renamed from: i.o */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC1009o implements ActionProvider.VisibilityListener {

    /* renamed from: a */
    public final ActionProvider f4307a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC1013s f4308b;

    /* renamed from: c */
    public C0770h f4309c;

    public ActionProviderVisibilityListenerC1009o(MenuItemC1013s menuItemC1013s, ActionProvider actionProvider) {
        this.f4308b = menuItemC1013s;
        this.f4307a = actionProvider;
    }

    /* renamed from: a */
    public final View m2589a(C1008n c1008n) {
        return this.f4307a.onCreateActionView(c1008n);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C0770h c0770h = this.f4309c;
        if (c0770h != null) {
            MenuC1006l menuC1006l = ((C1008n) c0770h.f2887a).f4294n;
            menuC1006l.f4258h = true;
            menuC1006l.mo1072p(true);
        }
    }
}
