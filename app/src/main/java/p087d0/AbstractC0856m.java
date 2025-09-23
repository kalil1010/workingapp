package p087d0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p080b1.C0767e;
import p122p.AbstractFutureC1263g;
import p122p.C1264h;

/* renamed from: d0.m */
/* loaded from: classes.dex */
public abstract class AbstractC0856m {

    /* renamed from: a */
    public static final C1264h f3514a = new C1264h();

    /* renamed from: b */
    public static final Object f3515b = new Object();

    /* renamed from: c */
    public static C0767e f3516c = null;

    /* renamed from: a */
    public static long m2176a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0854k.m2173a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static C0767e m2177b() {
        C0767e c0767e = new C0767e(6);
        f3516c = c0767e;
        C1264h c1264h = f3514a;
        c1264h.getClass();
        if (AbstractFutureC1263g.f5130f.mo1029m(c1264h, null, c0767e)) {
            AbstractFutureC1263g.m2921b(c1264h);
        }
        return f3516c;
    }

    /* renamed from: c */
    public static void m2178c(Context context, boolean z2) {
        C0855l c0855lM2174a;
        int i2;
        if (z2 || f3516c == null) {
            synchronized (f3515b) {
                if (!z2) {
                    try {
                        if (f3516c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i4 = 0;
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long jM2176a = m2176a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c0855lM2174a = C0855l.m2174a(file3);
                            } catch (IOException unused) {
                                m2177b();
                                return;
                            }
                        } else {
                            c0855lM2174a = null;
                        }
                        if (c0855lM2174a != null && c0855lM2174a.f3512c == jM2176a && (i2 = c0855lM2174a.f3511b) != 2) {
                            i4 = i2;
                        } else if (z3) {
                            i4 = 1;
                        } else if (z4) {
                            i4 = 2;
                        }
                        if (z2 && z4 && i4 != 1) {
                            i4 = 2;
                        }
                        if (c0855lM2174a != null && c0855lM2174a.f3511b == 2 && i4 == 1 && length < c0855lM2174a.f3513d) {
                            i4 = 3;
                        }
                        C0855l c0855l = new C0855l(1, i4, jM2176a, length2);
                        if (c0855lM2174a == null || !c0855lM2174a.equals(c0855l)) {
                            try {
                                c0855l.m2175b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        m2177b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m2177b();
                        return;
                    }
                }
                m2177b();
            }
        }
    }
}
