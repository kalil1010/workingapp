package p106j0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: j0.w */
/* loaded from: classes.dex */
public abstract class AbstractC1174w {

    /* renamed from: a */
    public static final C1147B f4793a;

    /* renamed from: b */
    public static final C1153b f4794b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4793a = new C1148C();
        } else {
            f4793a = new C1147B();
        }
        f4794b = new C1153b(Float.class, "translationAlpha", 5);
        new C1153b(Rect.class, "clipBounds", 6);
    }

    /* renamed from: a */
    public static void m2822a(View view, int i2, int i3, int i4, int i5) {
        f4793a.mo2765m0(view, i2, i3, i4, i5);
    }

    /* renamed from: b */
    public static void m2823b(View view, int i2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f4793a.mo1027i0(view, i2);
    }
}
