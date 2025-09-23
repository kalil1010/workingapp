package p083c0;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p002A1.C0019a;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public final class HandlerC0787a extends Handler {

    /* renamed from: a */
    public final /* synthetic */ int f2931a = 1;

    /* renamed from: b */
    public Object f2932b;

    public /* synthetic */ HandlerC0787a() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        C0019a[] c0019aArr;
        switch (this.f2931a) {
            case 0:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C0789c c0789c = (C0789c) this.f2932b;
                while (true) {
                    synchronized (c0789c.f2939b) {
                        try {
                            size = c0789c.f2941d.size();
                            if (size <= 0) {
                                return;
                            }
                            c0019aArr = new C0019a[size];
                            c0789c.f2941d.toArray(c0019aArr);
                            c0789c.f2941d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        C0019a c0019a = c0019aArr[i2];
                        int size2 = ((ArrayList) c0019a.f46b).size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            C0788b c0788b = (C0788b) ((ArrayList) c0019a.f46b).get(i3);
                            c0788b.getClass();
                            c0788b.f2934b.onReceive(c0789c.f2938a, (Intent) c0019a.f47c);
                        }
                    }
                }
            default:
                int i4 = message.what;
                if (i4 == -3 || i4 == -2 || i4 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f2932b).get(), message.what);
                    return;
                } else {
                    if (i4 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0787a(C0789c c0789c, Looper looper) {
        super(looper);
        this.f2932b = c0789c;
    }
}
