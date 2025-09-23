package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
import p033L1.AbstractC0364l;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public final class C0708k extends AbstractC0364l {

    /* renamed from: f */
    public final /* synthetic */ C0710m f2584f;

    /* renamed from: g */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0709l f2585g;

    public C0708k(DialogInterfaceOnCancelListenerC0709l dialogInterfaceOnCancelListenerC0709l, C0710m c0710m) {
        this.f2585g = dialogInterfaceOnCancelListenerC0709l;
        this.f2584f = c0710m;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: V */
    public final View mo1021V(int i2) {
        C0710m c0710m = this.f2584f;
        if (c0710m.mo1022W()) {
            return c0710m.mo1021V(i2);
        }
        Dialog dialog = this.f2585g.f2595a0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: W */
    public final boolean mo1022W() {
        return this.f2584f.mo1022W() || this.f2585g.f2598d0;
    }
}
