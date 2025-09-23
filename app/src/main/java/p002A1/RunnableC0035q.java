package p002A1;

import nfc.share.nfcshare.MainActivity;

/* renamed from: A1.q */
/* loaded from: classes.dex */
public final class RunnableC0035q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f75a;

    /* renamed from: b */
    public final /* synthetic */ C0019a f76b;

    public /* synthetic */ RunnableC0035q(C0019a c0019a, int i2) {
        this.f75a = i2;
        this.f76b = c0019a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f76b.f46b;
                mainActivity.f5001b0.m191g(mainActivity.f4999Z, mainActivity.f5000a0);
                break;
            default:
                MainActivity mainActivity2 = (MainActivity) this.f76b.f46b;
                mainActivity2.f5001b0.m191g(mainActivity2.f4999Z, mainActivity2.f5000a0);
                break;
        }
    }
}
