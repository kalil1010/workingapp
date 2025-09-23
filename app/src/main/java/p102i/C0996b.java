package p102i;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p105j.AbstractViewOnTouchListenerC1141x0;
import p105j.C1089f;
import p105j.C1092g;
import p105j.C1098i;
import p105j.C1104k;

/* renamed from: i.b */
/* loaded from: classes.dex */
public final class C0996b extends AbstractViewOnTouchListenerC1141x0 {

    /* renamed from: j */
    public final /* synthetic */ int f4202j = 0;

    /* renamed from: k */
    public final /* synthetic */ View f4203k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0996b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f4203k = actionMenuItemView;
    }

    @Override // p105j.AbstractViewOnTouchListenerC1141x0
    /* renamed from: b */
    public final InterfaceC0992C mo2562b() {
        C1089f c1089f;
        switch (this.f4202j) {
            case 0:
                AbstractC0997c abstractC0997c = ((ActionMenuItemView) this.f4203k).f2050m;
                if (abstractC0997c == null || (c1089f = ((C1092g) abstractC0997c).f4507a.f4550u) == null) {
                    return null;
                }
                return c1089f.m2593a();
            default:
                C1089f c1089f2 = ((C1098i) this.f4203k).f4513d.f4549t;
                if (c1089f2 == null) {
                    return null;
                }
                return c1089f2.m2593a();
        }
    }

    @Override // p105j.AbstractViewOnTouchListenerC1141x0
    /* renamed from: c */
    public final boolean mo2563c() {
        InterfaceC0992C interfaceC0992CMo2562b;
        switch (this.f4202j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f4203k;
                InterfaceC1005k interfaceC1005k = actionMenuItemView.f2048k;
                return interfaceC1005k != null && interfaceC1005k.mo1476c(actionMenuItemView.f2045h) && (interfaceC0992CMo2562b = mo2562b()) != null && interfaceC0992CMo2562b.mo2541b();
            default:
                ((C1098i) this.f4203k).f4513d.m2727o();
                return true;
        }
    }

    @Override // p105j.AbstractViewOnTouchListenerC1141x0
    /* renamed from: d */
    public boolean mo2564d() {
        switch (this.f4202j) {
            case 1:
                C1104k c1104k = ((C1098i) this.f4203k).f4513d;
                if (c1104k.f4551v != null) {
                    return false;
                }
                c1104k.m2725f();
                return true;
            default:
                return super.mo2564d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0996b(C1098i c1098i, C1098i c1098i2) {
        super(c1098i2);
        this.f4203k = c1098i;
    }
}
