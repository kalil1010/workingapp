package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.FragmentC0728E;
import p131s1.AbstractC1326c;

/* renamed from: androidx.lifecycle.C */
/* loaded from: classes.dex */
public abstract class AbstractC0726C {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1768a(Activity activity, EnumC0747l enumC0747l) {
        C0755t c0755tMo1453e;
        AbstractC1326c.m3062e(enumC0747l, "event");
        if (!(activity instanceof InterfaceC0753r) || (c0755tMo1453e = ((InterfaceC0753r) activity).mo1453e()) == null) {
            return;
        }
        c0755tMo1453e.m1782d(enumC0747l);
    }

    /* renamed from: b */
    public static void m1769b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0728E.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC0728E.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0728E(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
