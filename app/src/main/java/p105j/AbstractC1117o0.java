package p105j;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: j.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC1117o0 {

    /* renamed from: a */
    public static final int[] f4587a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f4588b = new int[0];

    static {
        new Rect();
    }

    /* renamed from: a */
    public static void m2732a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i2 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f4587a);
        } else {
            drawable.setState(f4588b);
        }
        drawable.setState(state);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m2733b(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
