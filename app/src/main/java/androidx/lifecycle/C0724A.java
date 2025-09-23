package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p131s1.AbstractC1326c;

/* renamed from: androidx.lifecycle.A */
/* loaded from: classes.dex */
public final class C0724A extends AbstractC0741f {
    final /* synthetic */ C0725B this$0;

    /* renamed from: androidx.lifecycle.A$a */
    public static final class a extends AbstractC0741f {
        final /* synthetic */ C0725B this$0;

        public a(C0725B c0725b) {
            this.this$0 = c0725b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
            this.this$0.m1767a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1326c.m3062e(activity, "activity");
            C0725B c0725b = this.this$0;
            int i2 = c0725b.f2682a + 1;
            c0725b.f2682a = i2;
            if (i2 == 1 && c0725b.f2685d) {
                c0725b.f2687f.m1782d(EnumC0747l.ON_START);
                c0725b.f2685d = false;
            }
        }
    }

    public C0724A(C0725B c0725b) {
        this.this$0 = c0725b;
    }

    @Override // androidx.lifecycle.AbstractC0741f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1326c.m3062e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = FragmentC0728E.f2693b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC1326c.m3060c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC0728E) fragmentFindFragmentByTag).f2694a = this.this$0.f2689h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0741f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC1326c.m3062e(activity, "activity");
        C0725B c0725b = this.this$0;
        int i2 = c0725b.f2683b - 1;
        c0725b.f2683b = i2;
        if (i2 == 0) {
            Handler handler = c0725b.f2686e;
            AbstractC1326c.m3059b(handler);
            handler.postDelayed(c0725b.f2688g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC1326c.m3062e(activity, "activity");
        AbstractC0761z.m1795a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0741f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC1326c.m3062e(activity, "activity");
        C0725B c0725b = this.this$0;
        int i2 = c0725b.f2682a - 1;
        c0725b.f2682a = i2;
        if (i2 == 0 && c0725b.f2684c) {
            c0725b.f2687f.m1782d(EnumC0747l.ON_STOP);
            c0725b.f2685d = true;
        }
    }
}
