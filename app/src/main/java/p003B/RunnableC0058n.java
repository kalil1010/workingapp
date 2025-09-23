package p003B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: B.n */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0058n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f134a;

    /* renamed from: b */
    public final /* synthetic */ int f135b;

    /* renamed from: c */
    public final /* synthetic */ Object f136c;

    public /* synthetic */ RunnableC0058n(Object obj, int i2, int i3) {
        this.f134a = i3;
        this.f136c = obj;
        this.f135b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f134a) {
            case 0:
                ((AbstractC0046b) this.f136c).mo172g(this.f135b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f136c;
                View view = (View) sideSheetBehavior.f3316p.get();
                if (view != null) {
                    sideSheetBehavior.m2110y(view, this.f135b, false);
                    break;
                }
                break;
        }
    }
}
