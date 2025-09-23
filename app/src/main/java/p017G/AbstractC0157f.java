package p017G;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: G.f */
/* loaded from: classes.dex */
public abstract class AbstractC0157f {
    /* renamed from: a */
    public static LocaleList m422a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* renamed from: b */
    public static LocaleList m423b() {
        return LocaleList.getAdjustedDefault();
    }

    /* renamed from: c */
    public static LocaleList m424c() {
        return LocaleList.getDefault();
    }
}
