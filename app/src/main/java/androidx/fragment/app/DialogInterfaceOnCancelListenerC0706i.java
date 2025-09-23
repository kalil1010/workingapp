package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0706i implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0709l f2582a;

    public DialogInterfaceOnCancelListenerC0706i(DialogInterfaceOnCancelListenerC0709l dialogInterfaceOnCancelListenerC0709l) {
        this.f2582a = dialogInterfaceOnCancelListenerC0709l;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0709l dialogInterfaceOnCancelListenerC0709l = this.f2582a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0709l.f2595a0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0709l.onCancel(dialog);
        }
    }
}
