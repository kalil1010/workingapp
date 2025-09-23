package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p100h0.C0985a;
import p100h0.InterfaceC0986b;
import p110k1.C1215q;
import p131s1.AbstractC1326c;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0986b {
    @Override // p100h0.InterfaceC0986b
    /* renamed from: a */
    public final List mo1606a() {
        return C1215q.f4904a;
    }

    @Override // p100h0.InterfaceC0986b
    /* renamed from: b */
    public final Object mo1607b(Context context) {
        AbstractC1326c.m3062e(context, "context");
        C0985a c0985aM2492c = C0985a.m2492c(context);
        AbstractC1326c.m3061d(c0985aM2492c, "getInstance(context)");
        if (!c0985aM2492c.f4136b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0750o.f2727a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC1326c.m3060c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0749n());
        }
        C0725B c0725b = C0725B.f2681i;
        c0725b.getClass();
        c0725b.f2686e = new Handler();
        c0725b.f2687f.m1782d(EnumC0747l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC1326c.m3060c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0724A(c0725b));
        return c0725b;
    }
}
