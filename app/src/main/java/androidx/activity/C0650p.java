package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p128r1.InterfaceC1290a;
import p128r1.InterfaceC1301l;
import p131s1.AbstractC1326c;

/* renamed from: androidx.activity.p */
/* loaded from: classes.dex */
public final class C0650p implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1301l f2020a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1301l f2021b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC1290a f2022c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC1290a f2023d;

    public C0650p(InterfaceC1301l interfaceC1301l, InterfaceC1301l interfaceC1301l2, InterfaceC1290a interfaceC1290a, InterfaceC1290a interfaceC1290a2) {
        this.f2020a = interfaceC1301l;
        this.f2021b = interfaceC1301l2;
        this.f2022c = interfaceC1290a;
        this.f2023d = interfaceC1290a2;
    }

    public final void onBackCancelled() {
        this.f2023d.mo349a();
    }

    public final void onBackInvoked() {
        this.f2022c.mo349a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC1326c.m3062e(backEvent, "backEvent");
        this.f2021b.mo1460b(new C0636b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC1326c.m3062e(backEvent, "backEvent");
        this.f2020a.mo1460b(new C0636b(backEvent));
    }
}
