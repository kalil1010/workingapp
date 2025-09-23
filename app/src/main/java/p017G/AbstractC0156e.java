package p017G;

import java.util.Locale;
import p022I.AbstractC0200c;

/* renamed from: G.e */
/* loaded from: classes.dex */
public abstract class AbstractC0156e {

    /* renamed from: a */
    public static final Locale[] f534a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* renamed from: a */
    public static Locale m420a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* renamed from: b */
    public static boolean m421b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f534a;
            for (Locale locale3 : localeArr) {
                if (locale3.equals(locale)) {
                    return false;
                }
            }
            for (Locale locale4 : localeArr) {
                if (locale4.equals(locale2)) {
                    return false;
                }
            }
            String strM537c = AbstractC0200c.m537c(AbstractC0200c.m535a(AbstractC0200c.m536b(locale)));
            if (!strM537c.isEmpty()) {
                return strM537c.equals(AbstractC0200c.m537c(AbstractC0200c.m535a(AbstractC0200c.m536b(locale2))));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
        }
        return false;
    }
}
