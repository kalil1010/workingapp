package p102i;

import p080b1.C0770h;

/* renamed from: i.d */
/* loaded from: classes.dex */
public final class RunnableC0998d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0999e f4204a;

    /* renamed from: b */
    public final /* synthetic */ C1008n f4205b;

    /* renamed from: c */
    public final /* synthetic */ MenuC1006l f4206c;

    /* renamed from: d */
    public final /* synthetic */ C0770h f4207d;

    public RunnableC0998d(C0770h c0770h, C0999e c0999e, C1008n c1008n, MenuC1006l menuC1006l) {
        this.f4207d = c0770h;
        this.f4204a = c0999e;
        this.f4205b = c1008n;
        this.f4206c = menuC1006l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0999e c0999e = this.f4204a;
        if (c0999e != null) {
            C0770h c0770h = this.f4207d;
            ((ViewOnKeyListenerC1000f) c0770h.f2887a).f4235z = true;
            c0999e.f4209b.m2572c(false);
            ((ViewOnKeyListenerC1000f) c0770h.f2887a).f4235z = false;
        }
        C1008n c1008n = this.f4205b;
        if (c1008n.isEnabled() && c1008n.hasSubMenu()) {
            this.f4206c.m2577q(c1008n, null, 4);
        }
    }
}
