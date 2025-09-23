package androidx.lifecycle;

import p001A0.C0004c;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public abstract class AbstractC0758w {

    /* renamed from: a */
    public final C0004c f2740a;

    /* renamed from: b */
    public boolean f2741b;

    /* renamed from: c */
    public int f2742c = -1;

    /* renamed from: d */
    public final /* synthetic */ C0759x f2743d;

    public AbstractC0758w(C0759x c0759x, C0004c c0004c) {
        this.f2743d = c0759x;
        this.f2740a = c0004c;
    }

    /* renamed from: c */
    public final void m1789c(boolean z2) {
        if (z2 == this.f2741b) {
            return;
        }
        this.f2741b = z2;
        int i2 = z2 ? 1 : -1;
        C0759x c0759x = this.f2743d;
        int i3 = c0759x.f2747c;
        c0759x.f2747c = i2 + i3;
        if (!c0759x.f2748d) {
            c0759x.f2748d = true;
            while (true) {
                try {
                    int i4 = c0759x.f2747c;
                    if (i3 == i4) {
                        break;
                    } else {
                        i3 = i4;
                    }
                } finally {
                    c0759x.f2748d = false;
                }
            }
        }
        if (this.f2741b) {
            c0759x.m1792c(this);
        }
    }

    /* renamed from: d */
    public void mo1772d() {
    }

    /* renamed from: e */
    public abstract boolean mo1773e();
}
