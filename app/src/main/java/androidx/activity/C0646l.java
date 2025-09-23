package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.EnumC0747l;
import androidx.lifecycle.EnumC0748m;
import androidx.lifecycle.InterfaceC0751p;
import androidx.lifecycle.InterfaceC0753r;
import androidx.savedstate.Recreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import p085c2.InterfaceC0807a;
import p093e2.C0899b;
import p097g0.C0968d;
import p097g0.InterfaceC0967c;
import p097g0.InterfaceC0969e;
import p111l.C1222d;
import p111l.C1224f;
import p131s1.AbstractC1326c;

/* renamed from: androidx.activity.l */
/* loaded from: classes.dex */
public final class C0646l implements ILoggerFactory {

    /* renamed from: a */
    public boolean f2012a;

    /* renamed from: b */
    public final Object f2013b;

    /* renamed from: c */
    public final Object f2014c;

    public C0646l(InterfaceC0969e interfaceC0969e) {
        this.f2013b = interfaceC0969e;
        this.f2014c = new C0968d();
    }

    /* renamed from: a */
    public void m1456a() {
        InterfaceC0969e interfaceC0969e = (InterfaceC0969e) this.f2013b;
        C0755t c0755tMo1453e = interfaceC0969e.mo1453e();
        if (c0755tMo1453e.f2732c != EnumC0748m.f2722b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0755tMo1453e.m1779a(new Recreator(interfaceC0969e));
        final C0968d c0968d = (C0968d) this.f2014c;
        c0968d.getClass();
        if (c0968d.f4058a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0755tMo1453e.m1779a(new InterfaceC0751p() { // from class: g0.a
            @Override // androidx.lifecycle.InterfaceC0751p
            /* renamed from: b */
            public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
                C0968d c0968d2 = c0968d;
                AbstractC1326c.m3062e(c0968d2, "this$0");
                if (enumC0747l == EnumC0747l.ON_START) {
                    c0968d2.f4060c = true;
                } else if (enumC0747l == EnumC0747l.ON_STOP) {
                    c0968d2.f4060c = false;
                }
            }
        });
        c0968d.f4058a = true;
        this.f2012a = true;
    }

    @Override // org.slf4j.ILoggerFactory
    /* renamed from: b */
    public synchronized InterfaceC0807a mo1457b(String str) {
        C0899b c0899b;
        c0899b = (C0899b) ((HashMap) this.f2013b).get(str);
        if (c0899b == null) {
            c0899b = new C0899b(str, (LinkedBlockingQueue) this.f2014c, this.f2012a);
            ((HashMap) this.f2013b).put(str, c0899b);
        }
        return c0899b;
    }

    /* renamed from: c */
    public void m1458c(Bundle bundle) {
        if (!this.f2012a) {
            m1456a();
        }
        C0755t c0755tMo1453e = ((InterfaceC0969e) this.f2013b).mo1453e();
        if (c0755tMo1453e.f2732c.compareTo(EnumC0748m.f2724d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0755tMo1453e.f2732c).toString());
        }
        C0968d c0968d = (C0968d) this.f2014c;
        if (!c0968d.f4058a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0968d.f4059b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0968d.f4062e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0968d.f4059b = true;
    }

    /* renamed from: d */
    public void m1459d(Bundle bundle) {
        C0968d c0968d = (C0968d) this.f2014c;
        c0968d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0968d.f4062e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1224f c1224f = (C1224f) c0968d.f4061d;
        c1224f.getClass();
        C1222d c1222d = new C1222d(c1224f);
        c1224f.f4920c.put(c1222d, Boolean.FALSE);
        while (c1222d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1222d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0967c) entry.getValue()).mo1445a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public C0646l() {
        this.f2012a = false;
        this.f2013b = new HashMap();
        this.f2014c = new LinkedBlockingQueue();
    }

    public C0646l(ExecutorC0644j executorC0644j, C0638d c0638d) {
        this.f2013b = new Object();
        this.f2014c = new ArrayList();
    }
}
