package p105j;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;

/* renamed from: j.t1 */
/* loaded from: classes.dex */
public abstract class AbstractC1133t1 {

    /* renamed from: a */
    public static final Method f4638a;

    /* renamed from: b */
    public static final boolean f4639b;

    static {
        f4639b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f4638a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m2754a(View view) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        return view.getLayoutDirection() == 1;
    }
}
