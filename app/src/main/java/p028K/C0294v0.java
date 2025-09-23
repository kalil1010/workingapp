package p028K;

import android.view.View;
import android.view.Window;
import p033L1.AbstractC0356d;
import p055T0.C0511e;

/* renamed from: K.v0 */
/* loaded from: classes.dex */
public class C0294v0 extends AbstractC0356d {

    /* renamed from: n */
    public final Window f911n;

    public C0294v0(Window window, C0511e c0511e) {
        this.f911n = window;
    }

    @Override // p033L1.AbstractC0356d
    /* renamed from: D */
    public final void mo826D(boolean z2) {
        if (!z2) {
            m827L(8192);
            return;
        }
        Window window = this.f911n;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    /* renamed from: L */
    public final void m827L(int i2) {
        View decorView = this.f911n.getDecorView();
        decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
    }
}
