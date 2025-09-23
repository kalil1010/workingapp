package p105j;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: j.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC1123q0 {

    /* renamed from: a */
    public static final Method f4610a;

    /* renamed from: b */
    public static final Method f4611b;

    /* renamed from: c */
    public static final Method f4612c;

    /* renamed from: d */
    public static final boolean f4613d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f4610a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f4611b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f4612c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f4613d = true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
    }
}
