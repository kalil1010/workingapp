package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import p131s1.AbstractC1326c;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public abstract class AbstractC0761z {
    /* renamed from: a */
    public static final void m1795a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC1326c.m3062e(activity, "activity");
        AbstractC1326c.m3062e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
