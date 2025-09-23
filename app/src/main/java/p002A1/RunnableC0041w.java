package p002A1;

import nfc.share.nfcshare.MainActivity;

/* renamed from: A1.w */
/* loaded from: classes.dex */
public final class RunnableC0041w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ double f92a;

    /* renamed from: b */
    public final /* synthetic */ C0038t f93b;

    public RunnableC0041w(C0038t c0038t, double d3) {
        this.f93b = c0038t;
        this.f92a = d3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f93b.f81a;
        MainActivity.m2874s(mainActivity, mainActivity.f5009y, this.f92a);
    }
}
