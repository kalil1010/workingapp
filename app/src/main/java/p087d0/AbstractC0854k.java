package p087d0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: d0.k */
/* loaded from: classes.dex */
public abstract class AbstractC0854k {
    /* renamed from: a */
    public static PackageInfo m2173a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
