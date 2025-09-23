package p105j;

import androidx.appcompat.widget.Toolbar;
import p102i.C1008n;

/* renamed from: j.e1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1088e1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4502a;

    /* renamed from: b */
    public final /* synthetic */ Toolbar f4503b;

    public /* synthetic */ RunnableC1088e1(Toolbar toolbar, int i2) {
        this.f4502a = i2;
        this.f4503b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4502a) {
            case 0:
                C1097h1 c1097h1 = this.f4503b.f2211L;
                C1008n c1008n = c1097h1 == null ? null : c1097h1.f4511b;
                if (c1008n != null) {
                    c1008n.collapseActionView();
                    break;
                }
                break;
            default:
                this.f4503b.m1529n();
                break;
        }
    }
}
