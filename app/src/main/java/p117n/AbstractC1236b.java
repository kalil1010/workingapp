package p117n;

import android.graphics.drawable.Drawable;

/* renamed from: n.b */
/* loaded from: classes.dex */
public abstract class AbstractC1236b extends Drawable {

    /* renamed from: a */
    public static final double f4964a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m2872a(float f, float f2, boolean z2) {
        if (!z2) {
            return f;
        }
        return (float) (((1.0d - f4964a) * f2) + f);
    }

    /* renamed from: b */
    public static float m2873b(float f, float f2, boolean z2) {
        if (!z2) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f4964a) * f2) + (f * 1.5f));
    }
}
