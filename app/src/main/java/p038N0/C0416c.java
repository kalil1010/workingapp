package p038N0;

import android.window.OnBackInvokedCallback;
import java.lang.reflect.InvocationTargetException;
import p090e.LayoutInflaterFactory2C0888u;
import p128r1.InterfaceC1290a;

/* renamed from: N0.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0416c implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f1298a;

    /* renamed from: b */
    public final /* synthetic */ Object f1299b;

    public /* synthetic */ C0416c(int i2, Object obj) {
        this.f1298a = i2;
        this.f1299b = obj;
    }

    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f1298a) {
            case 0:
                ((InterfaceC0415b) this.f1299b).mo1085a();
                break;
            case 1:
                ((InterfaceC1290a) this.f1299b).mo349a();
                break;
            case 2:
                ((LayoutInflaterFactory2C0888u) this.f1299b).m2253D();
                break;
            default:
                ((Runnable) this.f1299b).run();
                break;
        }
    }
}
