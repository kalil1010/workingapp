package p035M0;

import android.view.View;
import java.util.WeakHashMap;
import p028K.AbstractC0228C;
import p028K.AbstractC0241P;

/* renamed from: M0.C */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0370C implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        AbstractC0228C.m617c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
