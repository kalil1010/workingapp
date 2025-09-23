package p038N0;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.activity.C0636b;

/* renamed from: N0.e */
/* loaded from: classes.dex */
public final class C0418e implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0415b f1301a;

    /* renamed from: b */
    public final /* synthetic */ C0419f f1302b;

    public C0418e(C0419f c0419f, InterfaceC0415b interfaceC0415b) {
        this.f1302b = c0419f;
        this.f1301a = interfaceC0415b;
    }

    public final void onBackCancelled() {
        if (this.f1302b.f1300a != null) {
            this.f1301a.mo1088d();
        }
    }

    public final void onBackInvoked() {
        this.f1301a.mo1085a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f1302b.f1300a != null) {
            this.f1301a.mo1087c(new C0636b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f1302b.f1300a != null) {
            this.f1301a.mo1086b(new C0636b(backEvent));
        }
    }
}
