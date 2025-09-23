package p105j;

import androidx.appcompat.widget.SearchView;
import p048R.AbstractC0470c;

/* renamed from: j.S0 */
/* loaded from: classes.dex */
public final class RunnableC1059S0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4431a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f4432b;

    public /* synthetic */ RunnableC1059S0(SearchView searchView, int i2) {
        this.f4431a = i2;
        this.f4432b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4431a) {
            case 0:
                this.f4432b.m1510u();
                break;
            default:
                AbstractC0470c abstractC0470c = this.f4432b.f2170O;
                if (abstractC0470c instanceof ViewOnClickListenerC1076a1) {
                    abstractC0470c.mo1158b(null);
                    break;
                }
                break;
        }
    }
}
