package p022I;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: I.c */
/* loaded from: classes.dex */
public abstract class AbstractC0200c {
    /* renamed from: a */
    public static ULocale m535a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* renamed from: b */
    public static ULocale m536b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* renamed from: c */
    public static String m537c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
