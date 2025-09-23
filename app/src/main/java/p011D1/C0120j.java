package p011D1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import p024I1.AbstractC0209c;
import p131s1.AbstractC1326c;

/* renamed from: D1.j */
/* loaded from: classes.dex */
public final class C0120j {

    /* renamed from: j */
    public static final Pattern f339j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f340k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f341l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f342m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f343a;

    /* renamed from: b */
    public final String f344b;

    /* renamed from: c */
    public final long f345c;

    /* renamed from: d */
    public final String f346d;

    /* renamed from: e */
    public final String f347e;

    /* renamed from: f */
    public final boolean f348f;

    /* renamed from: g */
    public final boolean f349g;

    /* renamed from: h */
    public final boolean f350h;

    /* renamed from: i */
    public final boolean f351i;

    public C0120j(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f343a = str;
        this.f344b = str2;
        this.f345c = j2;
        this.f346d = str3;
        this.f347e = str4;
        this.f348f = z2;
        this.f349g = z3;
        this.f350h = z4;
        this.f351i = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0120j)) {
            return false;
        }
        C0120j c0120j = (C0120j) obj;
        return AbstractC1326c.m3058a(c0120j.f343a, this.f343a) && AbstractC1326c.m3058a(c0120j.f344b, this.f344b) && c0120j.f345c == this.f345c && AbstractC1326c.m3058a(c0120j.f346d, this.f346d) && AbstractC1326c.m3058a(c0120j.f347e, this.f347e) && c0120j.f348f == this.f348f && c0120j.f349g == this.f349g && c0120j.f350h == this.f350h && c0120j.f351i == this.f351i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f351i) + ((Boolean.hashCode(this.f350h) + ((Boolean.hashCode(this.f349g) + ((Boolean.hashCode(this.f348f) + ((this.f347e.hashCode() + ((this.f346d.hashCode() + ((Long.hashCode(this.f345c) + ((this.f344b.hashCode() + ((this.f343a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f343a);
        sb.append('=');
        sb.append(this.f344b);
        if (this.f350h) {
            long j2 = this.f345c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) AbstractC0209c.f766a.get()).format(new Date(j2));
                AbstractC1326c.m3061d(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f351i) {
            sb.append("; domain=");
            sb.append(this.f346d);
        }
        sb.append("; path=");
        sb.append(this.f347e);
        if (this.f348f) {
            sb.append("; secure");
        }
        if (this.f349g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        AbstractC1326c.m3061d(string, "toString()");
        return string;
    }
}
