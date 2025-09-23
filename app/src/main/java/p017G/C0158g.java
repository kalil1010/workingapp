package p017G;

import java.util.Locale;

/* renamed from: G.g */
/* loaded from: classes.dex */
public final class C0158g {

    /* renamed from: b */
    public static final C0158g f535b = new C0158g(new C0159h(AbstractC0157f.m422a(new Locale[0])));

    /* renamed from: a */
    public final C0159h f536a;

    public C0158g(C0159h c0159h) {
        this.f536a = c0159h;
    }

    /* renamed from: a */
    public static C0158g m425a(String str) {
        if (str == null || str.isEmpty()) {
            return f535b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = AbstractC0156e.m420a(strArrSplit[i2]);
        }
        return new C0158g(new C0159h(AbstractC0157f.m422a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0158g) {
            return this.f536a.equals(((C0158g) obj).f536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f536a.f537a.hashCode();
    }

    public final String toString() {
        return this.f536a.f537a.toString();
    }
}
