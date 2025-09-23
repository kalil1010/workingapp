package p150z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p001A0.RunnableC0005d;

/* renamed from: z.a */
/* loaded from: classes.dex */
public final class C1412a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Object f6085a;

    /* renamed from: b */
    public Activity f6086b;

    /* renamed from: c */
    public final int f6087c;

    /* renamed from: d */
    public boolean f6088d = false;

    /* renamed from: e */
    public boolean f6089e = false;

    /* renamed from: f */
    public boolean f6090f = false;

    public C1412a(Activity activity) {
        this.f6086b = activity;
        this.f6087c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f6086b == activity) {
            this.f6086b = null;
            this.f6089e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f6089e || this.f6090f || this.f6088d) {
            return;
        }
        Object obj = this.f6085a;
        try {
            Object obj2 = AbstractC1413b.f6093c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f6087c) {
                AbstractC1413b.f6097g.postAtFrontOfQueue(new RunnableC0005d(AbstractC1413b.f6092b.get(activity), 9, obj2));
                this.f6090f = true;
                this.f6085a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f6086b == activity) {
            this.f6088d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
