package p028K;

import android.view.View;
import android.view.Window;

/* renamed from: K.w0 */
/* loaded from: classes.dex */
public final class C0296w0 extends C0294v0 {
    @Override // p033L1.AbstractC0356d
    /* renamed from: C */
    public final void mo828C(boolean z2) {
        if (!z2) {
            m827L(16);
            return;
        }
        Window window = this.f911n;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
