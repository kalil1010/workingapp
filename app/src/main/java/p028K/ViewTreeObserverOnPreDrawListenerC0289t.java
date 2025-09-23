package p028K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.t */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0289t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f906a;

    /* renamed from: b */
    public ViewTreeObserver f907b;

    /* renamed from: c */
    public final Runnable f908c;

    public ViewTreeObserverOnPreDrawListenerC0289t(View view, Runnable runnable) {
        this.f906a = view;
        this.f907b = view.getViewTreeObserver();
        this.f908c = runnable;
    }

    /* renamed from: a */
    public static void m814a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0289t viewTreeObserverOnPreDrawListenerC0289t = new ViewTreeObserverOnPreDrawListenerC0289t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0289t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0289t);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f907b.isAlive();
        View view = this.f906a;
        if (zIsAlive) {
            this.f907b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f908c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f907b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f907b.isAlive();
        View view2 = this.f906a;
        if (zIsAlive) {
            this.f907b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
