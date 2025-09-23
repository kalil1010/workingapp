package p105j;

import android.view.View;
import p102i.InterfaceC1004j;
import p102i.MenuC1006l;

/* renamed from: j.h */
/* loaded from: classes.dex */
public final class RunnableC1095h implements Runnable {

    /* renamed from: a */
    public final C1089f f4508a;

    /* renamed from: b */
    public final /* synthetic */ C1104k f4509b;

    public RunnableC1095h(C1104k c1104k, C1089f c1089f) {
        this.f4509b = c1104k;
        this.f4508a = c1089f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1004j interfaceC1004j;
        C1104k c1104k = this.f4509b;
        MenuC1006l menuC1006l = c1104k.f4532c;
        if (menuC1006l != null && (interfaceC1004j = menuC1006l.f4255e) != null) {
            interfaceC1004j.mo1073c(menuC1006l);
        }
        View view = (View) c1104k.f4537h;
        if (view != null && view.getWindowToken() != null) {
            C1089f c1089f = this.f4508a;
            if (c1089f.m2594b()) {
                c1104k.f4549t = c1089f;
            } else if (c1089f.f4323e != null) {
                c1089f.m2596d(0, 0, false, false);
                c1104k.f4549t = c1089f;
            }
        }
        c1104k.f4551v = null;
    }
}
