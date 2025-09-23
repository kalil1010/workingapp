package p002A1;

import java.util.Timer;

/* renamed from: A1.J */
/* loaded from: classes.dex */
public final class C0015J {

    /* renamed from: a */
    public final InterfaceC0012G f24a;

    /* renamed from: b */
    public Timer f25b = new Timer();

    /* renamed from: c */
    public boolean f26c = false;

    /* renamed from: d */
    public AsyncTaskC0011F f27d;

    /* renamed from: e */
    public int f28e;

    public C0015J(InterfaceC0012G interfaceC0012G) {
        this.f24a = interfaceC0012G;
    }

    /* renamed from: a */
    public final void m42a(String str) {
        this.f26c = true;
        Timer timer = this.f25b;
        if (timer != null) {
            timer.cancel();
        }
        C0014I c0014i = new C0014I(this, str);
        Timer timer2 = new Timer();
        this.f25b = timer2;
        timer2.schedule(c0014i, 0L, 2000L);
    }

    /* renamed from: b */
    public final void m43b() {
        this.f26c = false;
        Timer timer = this.f25b;
        if (timer != null) {
            timer.cancel();
            this.f25b.purge();
        }
        AsyncTaskC0011F asyncTaskC0011F = this.f27d;
        if (asyncTaskC0011F != null) {
            asyncTaskC0011F.cancel(true);
            this.f27d = null;
        }
    }
}
