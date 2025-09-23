package androidx.lifecycle;

import android.os.Handler;
import p001A0.C0004c;
import p002A1.RunnableC0030l;
import p131s1.AbstractC1326c;

/* renamed from: androidx.lifecycle.B */
/* loaded from: classes.dex */
public final class C0725B implements InterfaceC0753r {

    /* renamed from: i */
    public static final C0725B f2681i = new C0725B();

    /* renamed from: a */
    public int f2682a;

    /* renamed from: b */
    public int f2683b;

    /* renamed from: e */
    public Handler f2686e;

    /* renamed from: c */
    public boolean f2684c = true;

    /* renamed from: d */
    public boolean f2685d = true;

    /* renamed from: f */
    public final C0755t f2687f = new C0755t(this);

    /* renamed from: g */
    public final RunnableC0030l f2688g = new RunnableC0030l(12, this);

    /* renamed from: h */
    public final C0004c f2689h = new C0004c(28, this);

    /* renamed from: a */
    public final void m1767a() {
        int i2 = this.f2683b + 1;
        this.f2683b = i2;
        if (i2 == 1) {
            if (this.f2684c) {
                this.f2687f.m1782d(EnumC0747l.ON_RESUME);
                this.f2684c = false;
            } else {
                Handler handler = this.f2686e;
                AbstractC1326c.m3059b(handler);
                handler.removeCallbacks(this.f2688g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0753r
    /* renamed from: e */
    public final C0755t mo1453e() {
        return this.f2687f;
    }
}
