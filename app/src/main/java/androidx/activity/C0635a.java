package androidx.activity;

import android.window.BackEvent;
import p131s1.AbstractC1326c;

/* renamed from: androidx.activity.a */
/* loaded from: classes.dex */
public final class C0635a {

    /* renamed from: a */
    public static final C0635a f1978a = new C0635a();

    /* renamed from: a */
    public final BackEvent m1440a(float f, float f2, float f3, int i2) {
        return new BackEvent(f, f2, f3, i2);
    }

    /* renamed from: b */
    public final float m1441b(BackEvent backEvent) {
        AbstractC1326c.m3062e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* renamed from: c */
    public final int m1442c(BackEvent backEvent) {
        AbstractC1326c.m3062e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* renamed from: d */
    public final float m1443d(BackEvent backEvent) {
        AbstractC1326c.m3062e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* renamed from: e */
    public final float m1444e(BackEvent backEvent) {
        AbstractC1326c.m3062e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
