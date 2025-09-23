package p090e;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: e.j */
/* loaded from: classes.dex */
public abstract class AbstractC0877j {
    /* renamed from: a */
    public static LocaleList m2225a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* renamed from: b */
    public static void m2226b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
