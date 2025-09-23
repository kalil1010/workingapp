package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p001A0.C0004c;
import p131s1.AbstractC1326c;

/* renamed from: androidx.lifecycle.E */
/* loaded from: classes.dex */
public class FragmentC0728E extends Fragment {

    /* renamed from: b */
    public static final /* synthetic */ int f2693b = 0;

    /* renamed from: a */
    public C0004c f2694a;

    /* renamed from: androidx.lifecycle.E$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C0727D Companion = new C0727D();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC1326c.m3062e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC1326c.m3062e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC1326c.m3062e(activity, "activity");
            int i2 = FragmentC0728E.f2693b;
            AbstractC0726C.m1768a(activity, EnumC0747l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
            int i2 = FragmentC0728E.f2693b;
            AbstractC0726C.m1768a(activity, EnumC0747l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
            int i2 = FragmentC0728E.f2693b;
            AbstractC0726C.m1768a(activity, EnumC0747l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
            int i2 = FragmentC0728E.f2693b;
            AbstractC0726C.m1768a(activity, EnumC0747l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
            int i2 = FragmentC0728E.f2693b;
            AbstractC0726C.m1768a(activity, EnumC0747l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
            int i2 = FragmentC0728E.f2693b;
            AbstractC0726C.m1768a(activity, EnumC0747l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC1326c.m3062e(activity, "activity");
            AbstractC1326c.m3062e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
        }
    }

    /* renamed from: a */
    public final void m1770a(EnumC0747l enumC0747l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC1326c.m3061d(activity, "activity");
            AbstractC0726C.m1768a(activity, enumC0747l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1770a(EnumC0747l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1770a(EnumC0747l.ON_DESTROY);
        this.f2694a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m1770a(EnumC0747l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0004c c0004c = this.f2694a;
        if (c0004c != null) {
            ((C0725B) c0004c.f7b).m1767a();
        }
        m1770a(EnumC0747l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0004c c0004c = this.f2694a;
        if (c0004c != null) {
            C0725B c0725b = (C0725B) c0004c.f7b;
            int i2 = c0725b.f2682a + 1;
            c0725b.f2682a = i2;
            if (i2 == 1 && c0725b.f2685d) {
                c0725b.f2687f.m1782d(EnumC0747l.ON_START);
                c0725b.f2685d = false;
            }
        }
        m1770a(EnumC0747l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1770a(EnumC0747l.ON_STOP);
    }
}
