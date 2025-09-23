package p028K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p033L1.AbstractC0356d;
import p055T0.C0511e;

/* renamed from: K.x0 */
/* loaded from: classes.dex */
public final class C0298x0 extends AbstractC0356d {

    /* renamed from: n */
    public final WindowInsetsController f918n;

    /* renamed from: o */
    public Window f919o;

    public C0298x0(WindowInsetsController windowInsetsController, C0511e c0511e) {
        this.f918n = windowInsetsController;
    }

    @Override // p033L1.AbstractC0356d
    /* renamed from: C */
    public final void mo828C(boolean z2) {
        Window window = this.f919o;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f918n.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f918n.setSystemBarsAppearance(0, 16);
    }

    @Override // p033L1.AbstractC0356d
    /* renamed from: D */
    public final void mo826D(boolean z2) {
        Window window = this.f919o;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f918n.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f918n.setSystemBarsAppearance(0, 8);
    }
}
