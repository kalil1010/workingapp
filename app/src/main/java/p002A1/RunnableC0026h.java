package p002A1;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import nfc.share.nfcshare.LoginActivity;
import nfc.share.nfcshare.model.WSMessage;
import p003B.AbstractC0046b;
import p008C1.C0097f;
import p087d0.AbstractC0853j;
import p087d0.RunnableC0850g;
import p090e.ExecutorC0860A;

/* renamed from: A1.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0026h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f59a;

    /* renamed from: b */
    public final /* synthetic */ Object f60b;

    /* renamed from: c */
    public final /* synthetic */ Object f61c;

    public /* synthetic */ RunnableC0026h(Object obj, int i2, Object obj2) {
        this.f59a = i2;
        this.f60b = obj;
        this.f61c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f59a) {
            case 0:
                LoginActivity loginActivity = (LoginActivity) ((C0027i) this.f60b).f67d;
                if (loginActivity.f4971y.isShowing()) {
                    loginActivity.f4971y.dismiss();
                }
                Toast.makeText(loginActivity, (String) this.f61c, 0).show();
                return;
            case 1:
                ((AbstractC0046b) this.f60b).mo173h((Typeface) this.f61c);
                return;
            case 2:
                WSMessage wSMessage = (WSMessage) this.f61c;
                try {
                    C0097f c0097f = (C0097f) ((C0027i) this.f60b).f67d;
                    if (c0097f.f237e) {
                        c0097f.m292c(AbstractC0018M.f35a.m1411d(wSMessage));
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    e3.getMessage();
                    return;
                }
            case 3:
                ((ProfileInstallerInitializer) this.f60b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0853j.m2172a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0850g((Context) this.f61c, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                Runnable runnable = (Runnable) this.f61c;
                ExecutorC0860A executorC0860A = (ExecutorC0860A) this.f60b;
                executorC0860A.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0860A.m2182a();
                }
        }
    }
}
