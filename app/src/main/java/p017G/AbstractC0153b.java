package p017G;

import android.os.Build;
import java.util.Locale;
import p131s1.AbstractC1326c;

/* renamed from: G.b */
/* loaded from: classes.dex */
public abstract class AbstractC0153b {
    static {
        int i2 = Build.VERSION.SDK_INT;
        C0152a c0152a = C0152a.f530a;
        if (i2 >= 30) {
            c0152a.m417a(30);
        }
        if (i2 >= 30) {
            c0152a.m417a(31);
        }
        if (i2 >= 30) {
            c0152a.m417a(33);
        }
        if (i2 >= 30) {
            c0152a.m417a(1000000);
        }
    }

    /* renamed from: a */
    public static final boolean m418a() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return true;
        }
        if (i2 < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        AbstractC1326c.m3061d(str, "CODENAME");
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        AbstractC1326c.m3061d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = "Tiramisu".toUpperCase(locale);
        AbstractC1326c.m3061d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }
}
