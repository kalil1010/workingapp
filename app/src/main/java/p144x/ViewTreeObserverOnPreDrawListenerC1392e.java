package p144x;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: x.e */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1392e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f6023a;

    public ViewTreeObserverOnPreDrawListenerC1392e(CoordinatorLayout coordinatorLayout) {
        this.f6023a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f6023a.m1559o(0);
        return true;
    }
}
