package p150z;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: z.d */
/* loaded from: classes.dex */
public abstract class AbstractC1415d {
    /* renamed from: a */
    public static int m3196a(AppOpsManager appOpsManager, String str, int i2, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i2, str2);
    }

    /* renamed from: b */
    public static String m3197b(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: c */
    public static AppOpsManager m3198c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
