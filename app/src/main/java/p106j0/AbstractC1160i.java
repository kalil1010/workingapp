package p106j0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: j0.i */
/* loaded from: classes.dex */
public abstract class AbstractC1160i {
    /* renamed from: a */
    public static <T, V> ObjectAnimator m2802a(T t2, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t2, property, (TypeConverter) null, path);
    }
}
