package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0686D;
import androidx.fragment.app.C0720w;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.EnumC0748m;
import androidx.lifecycle.InterfaceC0753r;
import java.util.Iterator;
import java.util.ListIterator;
import p110k1.C1205g;
import p131s1.AbstractC1326c;

/* renamed from: androidx.activity.t */
/* loaded from: classes.dex */
public final class C0656t {

    /* renamed from: a */
    public final Runnable f2036a;

    /* renamed from: b */
    public final C1205g f2037b = new C1205g();

    /* renamed from: c */
    public C0720w f2038c;

    /* renamed from: d */
    public final OnBackInvokedCallback f2039d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f2040e;

    /* renamed from: f */
    public boolean f2041f;

    /* renamed from: g */
    public boolean f2042g;

    public C0656t(Runnable runnable) {
        this.f2036a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f2039d = i2 >= 34 ? C0651q.f2024a.m1464a(new C0647m(this, 0), new C0647m(this, 1), new C0648n(this, 0), new C0648n(this, 1)) : C0649o.f2019a.m1461a(new C0648n(this, 2));
        }
    }

    /* renamed from: a */
    public final void m1466a(InterfaceC0753r interfaceC0753r, C0720w c0720w) {
        AbstractC1326c.m3062e(c0720w, "onBackPressedCallback");
        C0755t c0755tMo1453e = interfaceC0753r.mo1453e();
        if (c0755tMo1453e.f2732c == EnumC0748m.f2721a) {
            return;
        }
        c0720w.f2674b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, c0755tMo1453e, c0720w));
        m1469d();
        c0720w.f2675c = new C0655s(0, this);
    }

    /* renamed from: b */
    public final void m1467b() {
        Object objPrevious;
        C1205g c1205g = this.f2037b;
        c1205g.getClass();
        ListIterator listIterator = c1205g.listIterator(c1205g.f4902c);
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((C0720w) objPrevious).f2673a) {
                    break;
                }
            }
        }
        C0720w c0720w = (C0720w) objPrevious;
        this.f2038c = null;
        if (c0720w == null) {
            this.f2036a.run();
            return;
        }
        C0686D c0686d = c0720w.f2676d;
        c0686d.m1691x(true);
        if (c0686d.f2453h.f2673a) {
            c0686d.m1655J();
        } else {
            c0686d.f2452g.m1467b();
        }
    }

    /* renamed from: c */
    public final void m1468c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f2040e;
        OnBackInvokedCallback onBackInvokedCallback = this.f2039d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0649o c0649o = C0649o.f2019a;
        if (z2 && !this.f2041f) {
            c0649o.m1462b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f2041f = true;
        } else {
            if (z2 || !this.f2041f) {
                return;
            }
            c0649o.m1463c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2041f = false;
        }
    }

    /* renamed from: d */
    public final void m1469d() {
        boolean z2 = this.f2042g;
        boolean z3 = false;
        C1205g c1205g = this.f2037b;
        if (c1205g == null || !c1205g.isEmpty()) {
            Iterator it = c1205g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0720w) it.next()).f2673a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f2042g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m1468c(z3);
    }
}
