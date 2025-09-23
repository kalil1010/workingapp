package p008C1;

import android.nfc.tech.IsoDep;
import java.util.TimerTask;

/* renamed from: C1.c */
/* loaded from: classes.dex */
public final class C0094c extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ C0095d f225a;

    public C0094c(C0095d c0095d) {
        this.f225a = c0095d;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C0095d c0095d = this.f225a;
        try {
            IsoDep isoDep = c0095d.f226a;
            if (isoDep != null && isoDep.isConnected()) {
                return;
            }
            c0095d.m287d();
            cancel();
        } catch (Exception e3) {
            e3.getMessage();
            c0095d.m287d();
        }
    }
}
