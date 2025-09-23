package androidx.fragment.app;

import android.view.View;
import p033L1.AbstractC0364l;

/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public final class C0710m extends AbstractC0364l {

    /* renamed from: f */
    public final /* synthetic */ AbstractComponentCallbacksC0712o f2599f;

    public C0710m(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        this.f2599f = abstractComponentCallbacksC0712o;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: V */
    public final View mo1021V(int i2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = this.f2599f;
        View view = abstractComponentCallbacksC0712o.f2616E;
        if (view != null) {
            return view.findViewById(i2);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0712o + " does not have a view");
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: W */
    public final boolean mo1022W() {
        return this.f2599f.f2616E != null;
    }
}
