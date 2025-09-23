package p090e;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p017G.C0158g;
import p119o.C1241c;
import p119o.C1245g;

/* renamed from: e.k */
/* loaded from: classes.dex */
public abstract class AbstractC0878k {

    /* renamed from: a */
    public static final ExecutorC0860A f3613a = new ExecutorC0860A(new ExecutorC0861B());

    /* renamed from: b */
    public static final int f3614b = -100;

    /* renamed from: c */
    public static C0158g f3615c = null;

    /* renamed from: d */
    public static C0158g f3616d = null;

    /* renamed from: e */
    public static Boolean f3617e = null;

    /* renamed from: f */
    public static boolean f3618f = false;

    /* renamed from: g */
    public static final C1241c f3619g = new C1241c();

    /* renamed from: h */
    public static final Object f3620h = new Object();

    /* renamed from: i */
    public static final Object f3621i = new Object();

    /* renamed from: b */
    public static boolean m2227b(Context context) {
        if (f3617e == null) {
            try {
                int i2 = AbstractServiceC0893z.f3720a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0893z.class), AbstractC0892y.m2272a() | 128).metaData;
                if (bundle != null) {
                    f3617e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f3617e = Boolean.FALSE;
            }
        }
        return f3617e.booleanValue();
    }

    /* renamed from: f */
    public static void m2228f(LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u) {
        synchronized (f3620h) {
            try {
                Iterator it = f3619g.iterator();
                while (true) {
                    C1245g c1245g = (C1245g) it;
                    if (c1245g.hasNext()) {
                        AbstractC0878k abstractC0878k = (AbstractC0878k) ((WeakReference) c1245g.next()).get();
                        if (abstractC0878k == layoutInflaterFactory2C0888u || abstractC0878k == null) {
                            c1245g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public abstract void mo2229a();

    /* renamed from: d */
    public abstract void mo2230d();

    /* renamed from: e */
    public abstract void mo2231e();

    /* renamed from: g */
    public abstract boolean mo2232g(int i2);

    /* renamed from: i */
    public abstract void mo2233i(int i2);

    /* renamed from: j */
    public abstract void mo2234j(View view);

    /* renamed from: k */
    public abstract void mo2235k(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: l */
    public abstract void mo2236l(CharSequence charSequence);
}
