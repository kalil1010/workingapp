package p002A1;

import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: A1.s */
/* loaded from: classes.dex */
public final class RunnableC0037s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f79a;

    /* renamed from: b */
    public final /* synthetic */ C0038t f80b;

    public RunnableC0037s(C0038t c0038t, boolean z2) {
        this.f80b = c0038t;
        this.f79a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f79a;
        C0038t c0038t = this.f80b;
        if (z2) {
            c0038t.f81a.f5010z.setImageResource(R.drawable.switch_selector_on);
            return;
        }
        if (C0027i.f62e) {
            AbstractC0018M.f36b.m137u();
        }
        c0038t.f81a.f5010z.setImageResource(R.drawable.switch_selector_off);
    }
}
