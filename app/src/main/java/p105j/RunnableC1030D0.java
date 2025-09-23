package p105j;

import java.util.WeakHashMap;
import p028K.AbstractC0241P;

/* renamed from: j.D0 */
/* loaded from: classes.dex */
public final class RunnableC1030D0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4345a;

    /* renamed from: b */
    public final /* synthetic */ C1034F0 f4346b;

    public /* synthetic */ RunnableC1030D0(C1034F0 c1034f0, int i2) {
        this.f4345a = i2;
        this.f4346b = c1034f0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1034F0 c1034f0 = this.f4346b;
        switch (this.f4345a) {
            case 0:
                C1135u0 c1135u0 = c1034f0.f4353c;
                if (c1135u0 != null) {
                    c1135u0.setListSelectionHidden(true);
                    c1135u0.requestLayout();
                    break;
                }
                break;
            default:
                C1135u0 c1135u02 = c1034f0.f4353c;
                if (c1135u02 != null) {
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    if (c1135u02.isAttachedToWindow() && c1034f0.f4353c.getCount() > c1034f0.f4353c.getChildCount() && c1034f0.f4353c.getChildCount() <= c1034f0.f4363m) {
                        c1034f0.f4376z.setInputMethodMode(2);
                        c1034f0.mo2543i();
                        break;
                    }
                }
                break;
        }
    }
}
