package androidx.activity;

import android.window.BackEvent;
import p131s1.AbstractC1326c;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public final class C0636b {

    /* renamed from: a */
    public final float f1979a;

    /* renamed from: b */
    public final float f1980b;

    /* renamed from: c */
    public final float f1981c;

    /* renamed from: d */
    public final int f1982d;

    public C0636b(BackEvent backEvent) {
        AbstractC1326c.m3062e(backEvent, "backEvent");
        C0635a c0635a = C0635a.f1978a;
        float fM1443d = c0635a.m1443d(backEvent);
        float fM1444e = c0635a.m1444e(backEvent);
        float fM1441b = c0635a.m1441b(backEvent);
        int iM1442c = c0635a.m1442c(backEvent);
        this.f1979a = fM1443d;
        this.f1980b = fM1444e;
        this.f1981c = fM1441b;
        this.f1982d = iM1442c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1979a + ", touchY=" + this.f1980b + ", progress=" + this.f1981c + ", swipeEdge=" + this.f1982d + '}';
    }
}
