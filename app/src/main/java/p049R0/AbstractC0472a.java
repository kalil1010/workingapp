package p049R0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* renamed from: R0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0472a {

    /* renamed from: a */
    public static final int[] f1458a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: a */
    public static ColorStateList m1161a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f1458a, 0));
        }
        return colorStateList;
    }
}
