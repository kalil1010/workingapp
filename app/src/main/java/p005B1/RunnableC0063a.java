package p005B1;

/* renamed from: B1.a */
/* loaded from: classes.dex */
public final class RunnableC0063a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0065c f153a;

    public RunnableC0063a(C0065c c0065c) {
        this.f153a = c0065c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0065c c0065c = this.f153a;
        c0065c.f3738a.m2333c(c0065c.f157c.size());
        if (c0065c.f159e == null || c0065c.f157c.size() <= 0) {
            return;
        }
        c0065c.f159e.m1907b0(c0065c.f157c.size() - 1);
    }
}
