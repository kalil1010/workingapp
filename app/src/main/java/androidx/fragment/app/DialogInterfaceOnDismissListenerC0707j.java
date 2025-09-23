package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0707j implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0709l f2583a;

    public DialogInterfaceOnDismissListenerC0707j(DialogInterfaceOnCancelListenerC0709l dialogInterfaceOnCancelListenerC0709l) {
        this.f2583a = dialogInterfaceOnCancelListenerC0709l;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0709l dialogInterfaceOnCancelListenerC0709l = this.f2583a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0709l.f2595a0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0709l.onDismiss(dialog);
        }
    }
}
