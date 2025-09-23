package p105j;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: j.W */
/* loaded from: classes.dex */
public abstract class AbstractC1066W {
    /* renamed from: a */
    public static LocaleList m2670a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* renamed from: b */
    public static void m2671b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
