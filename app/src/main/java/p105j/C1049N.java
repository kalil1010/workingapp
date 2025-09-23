package p105j;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p041O0.ViewTreeObserverOnGlobalLayoutListenerC0427c;

/* renamed from: j.N */
/* loaded from: classes.dex */
public final class C1049N implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0427c f4397a;

    /* renamed from: b */
    public final /* synthetic */ C1051O f4398b;

    public C1049N(C1051O c1051o, ViewTreeObserverOnGlobalLayoutListenerC0427c viewTreeObserverOnGlobalLayoutListenerC0427c) {
        this.f4398b = c1051o;
        this.f4397a = viewTreeObserverOnGlobalLayoutListenerC0427c;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f4398b.f4411G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4397a);
        }
    }
}
