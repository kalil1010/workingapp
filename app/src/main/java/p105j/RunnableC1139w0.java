package p105j;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: j.w0 */
/* loaded from: classes.dex */
public final class RunnableC1139w0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4661a;

    /* renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC1141x0 f4662b;

    public /* synthetic */ RunnableC1139w0(AbstractViewOnTouchListenerC1141x0 abstractViewOnTouchListenerC1141x0, int i2) {
        this.f4661a = i2;
        this.f4662b = abstractViewOnTouchListenerC1141x0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4661a) {
            case 0:
                ViewParent parent = this.f4662b.f4669d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC1141x0 abstractViewOnTouchListenerC1141x0 = this.f4662b;
                abstractViewOnTouchListenerC1141x0.m2760a();
                View view = abstractViewOnTouchListenerC1141x0.f4669d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1141x0.mo2563c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC1141x0.f4672g = true;
                    break;
                }
                break;
        }
    }
}
