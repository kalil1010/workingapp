package p028K;

import android.view.VelocityTracker;

/* renamed from: K.v */
/* loaded from: classes.dex */
public abstract class AbstractC0293v {
    /* renamed from: a */
    public static float m823a(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    /* renamed from: b */
    public static float m824b(VelocityTracker velocityTracker, int i2, int i3) {
        return velocityTracker.getAxisVelocity(i2, i3);
    }

    /* renamed from: c */
    public static boolean m825c(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.isAxisSupported(i2);
    }
}
