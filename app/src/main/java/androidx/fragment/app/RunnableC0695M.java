package androidx.fragment.app;

import java.util.ArrayList;
import p006C.AbstractC0075g;

/* renamed from: androidx.fragment.app.M */
/* loaded from: classes.dex */
public final class RunnableC0695M implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2521a;

    /* renamed from: b */
    public final /* synthetic */ C0696N f2522b;

    /* renamed from: c */
    public final /* synthetic */ C0705h f2523c;

    public /* synthetic */ RunnableC0695M(C0705h c0705h, C0696N c0696n, int i2) {
        this.f2521a = i2;
        this.f2523c = c0705h;
        this.f2522b = c0696n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2521a) {
            case 0:
                ArrayList arrayList = this.f2523c.f2578b;
                C0696N c0696n = this.f2522b;
                if (arrayList.contains(c0696n)) {
                    AbstractC0075g.m232a(c0696n.f2526c.f2616E, c0696n.f2524a);
                    break;
                }
                break;
            default:
                C0705h c0705h = this.f2523c;
                ArrayList arrayList2 = c0705h.f2578b;
                C0696N c0696n2 = this.f2522b;
                arrayList2.remove(c0696n2);
                c0705h.f2579c.remove(c0696n2);
                break;
        }
    }
}
