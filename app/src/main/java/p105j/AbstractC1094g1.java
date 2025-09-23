package p105j;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p038N0.C0416c;

/* renamed from: j.g1 */
/* loaded from: classes.dex */
public abstract class AbstractC1094g1 {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m2708a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m2709b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0416c(3, runnable);
    }

    /* renamed from: c */
    public static void m2710c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: d */
    public static void m2711d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
