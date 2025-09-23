package androidx.activity;

import android.window.OnBackInvokedCallback;
import p128r1.InterfaceC1290a;
import p128r1.InterfaceC1301l;
import p131s1.AbstractC1326c;

/* renamed from: androidx.activity.q */
/* loaded from: classes.dex */
public final class C0651q {

    /* renamed from: a */
    public static final C0651q f2024a = new C0651q();

    /* renamed from: a */
    public final OnBackInvokedCallback m1464a(InterfaceC1301l interfaceC1301l, InterfaceC1301l interfaceC1301l2, InterfaceC1290a interfaceC1290a, InterfaceC1290a interfaceC1290a2) {
        AbstractC1326c.m3062e(interfaceC1301l, "onBackStarted");
        AbstractC1326c.m3062e(interfaceC1301l2, "onBackProgressed");
        AbstractC1326c.m3062e(interfaceC1290a, "onBackInvoked");
        AbstractC1326c.m3062e(interfaceC1290a2, "onBackCancelled");
        return new C0650p(interfaceC1301l, interfaceC1301l2, interfaceC1290a, interfaceC1290a2);
    }
}
