package p150z;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: z.c */
/* loaded from: classes.dex */
public abstract class AbstractC1414c {
    /* renamed from: a */
    public static <T> T m3192a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: b */
    public static int m3193b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* renamed from: c */
    public static int m3194c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* renamed from: d */
    public static String m3195d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
