package p105j;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: j.t0 */
/* loaded from: classes.dex */
public abstract class AbstractC1132t0 {

    /* renamed from: a */
    public static final Field f4637a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
        f4637a = declaredField;
    }
}
