package p090e;

import android.content.res.Configuration;
import android.os.LocaleList;
import p017G.C0158g;

/* renamed from: e.o */
/* loaded from: classes.dex */
public abstract class AbstractC0882o {
    /* renamed from: a */
    public static void m2237a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* renamed from: b */
    public static C0158g m2238b(Configuration configuration) {
        return C0158g.m425a(configuration.getLocales().toLanguageTags());
    }

    /* renamed from: c */
    public static void m2239c(C0158g c0158g) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c0158g.f536a.f537a.toLanguageTags()));
    }

    /* renamed from: d */
    public static void m2240d(Configuration configuration, C0158g c0158g) {
        configuration.setLocales(LocaleList.forLanguageTags(c0158g.f536a.f537a.toLanguageTags()));
    }
}
