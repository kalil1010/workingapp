package p061V0;

import android.os.Handler;
import android.os.Message;
import p001A0.C0004c;

/* renamed from: V0.e */
/* loaded from: classes.dex */
public final class C0549e implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C0004c f1731a;

    public C0549e(C0004c c0004c) {
        this.f1731a = c0004c;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0004c c0004c = this.f1731a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (c0004c.f7b) {
            throw null;
        }
    }
}
