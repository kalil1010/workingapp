package p028K;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: K.U */
/* loaded from: classes.dex */
public abstract class AbstractC0245U {

    /* renamed from: a */
    public static final Method f821a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f821a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m709a(ViewConfiguration viewConfiguration, Context context) {
        if (f821a != null) {
            try {
                return ((Integer) r0.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
