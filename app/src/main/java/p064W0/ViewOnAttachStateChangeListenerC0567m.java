package p064W0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import p002A1.C0013H;
import p028K.AbstractC0228C;
import p028K.AbstractC0241P;
import p031L.AccessibilityManagerTouchExplorationStateChangeListenerC0332b;
import p102i.ViewOnKeyListenerC0993D;
import p102i.ViewOnKeyListenerC1000f;

/* renamed from: W0.m */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0567m implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f1773a;

    /* renamed from: b */
    public final /* synthetic */ Object f1774b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0567m(int i2, Object obj) {
        this.f1773a = i2;
        this.f1774b = obj;
    }

    /* renamed from: a */
    private final void m1355a(View view) {
    }

    /* renamed from: b */
    private final void m1356b(View view) {
    }

    /* renamed from: c */
    private final void m1357c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f1774b;
        switch (this.f1773a) {
            case 0:
                C0569o c0569o = (C0569o) obj;
                if (c0569o.f1799u != null && (accessibilityManager = c0569o.f1798t) != null) {
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    if (c0569o.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0332b(c0569o.f1799u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                AbstractC0228C.m617c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1773a) {
            case 0:
                C0569o c0569o = (C0569o) this.f1774b;
                C0013H c0013h = c0569o.f1799u;
                if (c0013h != null && (accessibilityManager = c0569o.f1798t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0332b(c0013h));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC1000f viewOnKeyListenerC1000f = (ViewOnKeyListenerC1000f) this.f1774b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1000f.f4233x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1000f.f4233x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1000f.f4233x.removeGlobalOnLayoutListener(viewOnKeyListenerC1000f.f4218i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0993D viewOnKeyListenerC0993D = (ViewOnKeyListenerC0993D) this.f1774b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0993D.f4178o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0993D.f4178o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0993D.f4178o.removeGlobalOnLayoutListener(viewOnKeyListenerC0993D.f4172i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
