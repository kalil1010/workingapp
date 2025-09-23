package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p038N0.C0416c;
import p128r1.InterfaceC1290a;
import p131s1.AbstractC1326c;

/* renamed from: androidx.activity.o */
/* loaded from: classes.dex */
public final class C0649o {

    /* renamed from: a */
    public static final C0649o f2019a = new C0649o();

    /* renamed from: a */
    public final OnBackInvokedCallback m1461a(InterfaceC1290a interfaceC1290a) {
        AbstractC1326c.m3062e(interfaceC1290a, "onBackInvoked");
        return new C0416c(1, interfaceC1290a);
    }

    /* renamed from: b */
    public final void m1462b(Object obj, int i2, Object obj2) {
        AbstractC1326c.m3062e(obj, "dispatcher");
        AbstractC1326c.m3062e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: c */
    public final void m1463c(Object obj, Object obj2) {
        AbstractC1326c.m3062e(obj, "dispatcher");
        AbstractC1326c.m3062e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
