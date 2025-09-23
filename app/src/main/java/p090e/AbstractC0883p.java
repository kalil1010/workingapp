package p090e;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p031L.AbstractC0335e;
import p038N0.C0416c;

/* renamed from: e.p */
/* loaded from: classes.dex */
public abstract class AbstractC0883p {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m2241a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m2242b(Object obj, LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u) {
        Objects.requireNonNull(layoutInflaterFactory2C0888u);
        C0416c c0416c = new C0416c(2, layoutInflaterFactory2C0888u);
        AbstractC0335e.m890f(obj).registerOnBackInvokedCallback(1000000, c0416c);
        return c0416c;
    }

    /* renamed from: c */
    public static void m2243c(Object obj, Object obj2) {
        AbstractC0335e.m890f(obj).unregisterOnBackInvokedCallback(AbstractC0335e.m886b(obj2));
    }
}
