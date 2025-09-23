package p017G;

/* renamed from: G.d */
/* loaded from: classes.dex */
public final class C0155d {

    /* renamed from: a */
    public boolean f531a;

    /* renamed from: b */
    public InterfaceC0154c f532b;

    /* renamed from: c */
    public boolean f533c;

    /* renamed from: a */
    public final void m419a(InterfaceC0154c interfaceC0154c) {
        synchronized (this) {
            while (this.f533c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f532b == interfaceC0154c) {
                return;
            }
            this.f532b = interfaceC0154c;
            if (this.f531a) {
                interfaceC0154c.mo21h();
            }
        }
    }
}
