package p011D1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p014E1.AbstractC0145b;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1411i;

/* renamed from: D1.p */
/* loaded from: classes.dex */
public final class C0126p {

    /* renamed from: j */
    public static final char[] f371j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final boolean f372a;

    /* renamed from: b */
    public final String f373b;

    /* renamed from: c */
    public final String f374c;

    /* renamed from: d */
    public final String f375d;

    /* renamed from: e */
    public final String f376e;

    /* renamed from: f */
    public final int f377f;

    /* renamed from: g */
    public final ArrayList f378g;

    /* renamed from: h */
    public final String f379h;

    /* renamed from: i */
    public final String f380i;

    public C0126p(String str, String str2, String str3, String str4, int i2, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        AbstractC1326c.m3062e(str, "scheme");
        AbstractC1326c.m3062e(str4, "host");
        this.f373b = str;
        this.f374c = str2;
        this.f375d = str3;
        this.f376e = str4;
        this.f377f = i2;
        this.f378g = arrayList2;
        this.f379h = str5;
        this.f380i = str6;
        this.f372a = str.equals("https");
    }

    /* renamed from: a */
    public final String m358a() {
        if (this.f375d.length() == 0) {
            return "";
        }
        int length = this.f373b.length() + 3;
        String str = this.f380i;
        String strSubstring = str.substring(AbstractC1411i.m3177R(str, ':', length, 4) + 1, AbstractC1411i.m3177R(str, '@', 0, 6));
        AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: b */
    public final String m359b() {
        int length = this.f373b.length() + 3;
        String str = this.f380i;
        int iM3177R = AbstractC1411i.m3177R(str, '/', length, 4);
        String strSubstring = str.substring(iM3177R, AbstractC0145b.m394g(str, "?#", iM3177R, str.length()));
        AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: c */
    public final ArrayList m360c() {
        int length = this.f373b.length() + 3;
        String str = this.f380i;
        int iM3177R = AbstractC1411i.m3177R(str, '/', length, 4);
        int iM394g = AbstractC0145b.m394g(str, "?#", iM3177R, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM3177R < iM394g) {
            int i2 = iM3177R + 1;
            int iM393f = AbstractC0145b.m393f(str, '/', i2, iM394g);
            String strSubstring = str.substring(i2, iM393f);
            AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM3177R = iM393f;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String m361d() {
        if (this.f378g == null) {
            return null;
        }
        String str = this.f380i;
        int iM3177R = AbstractC1411i.m3177R(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iM3177R, AbstractC0145b.m393f(str, '#', iM3177R, str.length()));
        AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: e */
    public final String m362e() {
        if (this.f374c.length() == 0) {
            return "";
        }
        int length = this.f373b.length() + 3;
        String str = this.f380i;
        int iM394g = AbstractC0145b.m394g(str, ":@", length, str.length());
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(length, iM394g);
        AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0126p) && AbstractC1326c.m3058a(((C0126p) obj).f380i, this.f380i);
    }

    /* renamed from: f */
    public final String m363f() {
        C0125o c0125o;
        try {
            c0125o = new C0125o();
            c0125o.m357c(this, "/...");
        } catch (IllegalArgumentException unused) {
            c0125o = null;
        }
        AbstractC1326c.m3059b(c0125o);
        c0125o.f364b = C0112b.m319b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        c0125o.f365c = C0112b.m319b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return c0125o.m355a().f380i;
    }

    /* renamed from: g */
    public final URI m364g() {
        String strSubstring;
        String strReplaceAll;
        C0125o c0125o = new C0125o();
        String str = this.f373b;
        c0125o.f363a = str;
        c0125o.f364b = m362e();
        c0125o.f365c = m358a();
        c0125o.f366d = this.f376e;
        int iM320c = C0112b.m320c(str);
        int i2 = this.f377f;
        if (i2 == iM320c) {
            i2 = -1;
        }
        c0125o.f367e = i2;
        ArrayList arrayList = c0125o.f368f;
        arrayList.clear();
        arrayList.addAll(m360c());
        String strM361d = m361d();
        c0125o.f369g = strM361d != null ? C0112b.m323g(C0112b.m319b(strM361d, 0, 0, " \"'<>#", 211)) : null;
        if (this.f379h == null) {
            strSubstring = null;
        } else {
            String str2 = this.f380i;
            strSubstring = str2.substring(AbstractC1411i.m3177R(str2, '#', 0, 6) + 1);
            AbstractC1326c.m3061d(strSubstring, "(this as java.lang.String).substring(startIndex)");
        }
        c0125o.f370h = strSubstring;
        String str3 = c0125o.f366d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            AbstractC1326c.m3061d(patternCompile, "compile(pattern)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            AbstractC1326c.m3061d(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            strReplaceAll = null;
        }
        c0125o.f366d = strReplaceAll;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, C0112b.m319b((String) arrayList.get(i3), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = c0125o.f369g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? C0112b.m319b(str4, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str5 = c0125o.f370h;
        c0125o.f370h = str5 != null ? C0112b.m319b(str5, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = c0125o.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e3) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC1326c.m3061d(patternCompile2, "compile(pattern)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                AbstractC1326c.m3061d(strReplaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI uriCreate = URI.create(strReplaceAll2);
                AbstractC1326c.m3061d(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final int hashCode() {
        return this.f380i.hashCode();
    }

    public final String toString() {
        return this.f380i;
    }
}
