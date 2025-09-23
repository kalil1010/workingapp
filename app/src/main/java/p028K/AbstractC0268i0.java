package p028K;

import android.view.View;
import java.lang.reflect.Field;

/* renamed from: K.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC0268i0 {

    /* renamed from: a */
    public static final Field f868a;

    /* renamed from: b */
    public static final Field f869b;

    /* renamed from: c */
    public static final Field f870c;

    /* renamed from: d */
    public static final boolean f871d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f868a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f869b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f870c = declaredField3;
            declaredField3.setAccessible(true);
            f871d = true;
        } catch (ReflectiveOperationException e3) {
            e3.getMessage();
        }
    }
}
