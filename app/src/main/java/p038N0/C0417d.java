package p038N0;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: N0.d */
/* loaded from: classes.dex */
public class C0417d {

    /* renamed from: a */
    public OnBackInvokedCallback f1300a;

    /* renamed from: a */
    public OnBackInvokedCallback mo1089a(InterfaceC0415b interfaceC0415b) {
        Objects.requireNonNull(interfaceC0415b);
        return new C0416c(0, interfaceC0415b);
    }

    /* renamed from: b */
    public void m1090b(InterfaceC0415b interfaceC0415b, View view, boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.f1300a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback onBackInvokedCallbackMo1089a = mo1089a(interfaceC0415b);
            this.f1300a = onBackInvokedCallbackMo1089a;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z2 ? 1000000 : 0, onBackInvokedCallbackMo1089a);
        }
    }

    /* renamed from: c */
    public void m1091c(View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f1300a);
        this.f1300a = null;
    }
}
