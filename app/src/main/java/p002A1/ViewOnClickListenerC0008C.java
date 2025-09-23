package p002A1;

import android.view.View;
import nfc.share.nfcshare.model.WSMessage;

/* renamed from: A1.C */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0008C implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0027i c0027i = AbstractC0018M.f36b;
        if (c0027i != null) {
            new Thread(new RunnableC0026h(c0027i, 2, new WSMessage("join", AbstractC0018M.f42h, "ssss", "", 2))).start();
        }
    }
}
