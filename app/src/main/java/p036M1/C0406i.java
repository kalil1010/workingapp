package p036M1;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: M1.i */
/* loaded from: classes.dex */
public final class C0406i {

    /* renamed from: a */
    public Method f1286a;

    /* renamed from: b */
    public Method f1287b;

    /* renamed from: c */
    public Method f1288c;

    /* renamed from: a */
    public static void m1083a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
