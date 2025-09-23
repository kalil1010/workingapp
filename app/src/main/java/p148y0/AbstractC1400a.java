package p148y0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p072Z.C0603a;

/* renamed from: y0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1400a {

    /* renamed from: a */
    public static final LinearInterpolator f6066a = new LinearInterpolator();

    /* renamed from: b */
    public static final C0603a f6067b = new C0603a(1);

    /* renamed from: c */
    public static final C0603a f6068c = new C0603a(0);

    /* renamed from: d */
    public static final C0603a f6069d = new C0603a(C0603a.f1914e);

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    public static float m3164a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* renamed from: b */
    public static float m3165b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m3164a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m3166c(int i2, int i3, float f) {
        return Math.round(f * (i3 - i2)) + i2;
    }
}
