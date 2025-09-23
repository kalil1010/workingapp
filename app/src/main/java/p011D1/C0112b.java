package p011D1;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p014E1.AbstractC0145b;
import p050R1.C0479g;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1411i;

/* renamed from: D1.b */
/* loaded from: classes.dex */
public final class C0112b {

    /* renamed from: a */
    public static final C0112b f289a = new C0112b();

    /* renamed from: b */
    public static final C0112b f290b = new C0112b();

    /* renamed from: c */
    public static final C0112b f291c = new C0112b();

    /* renamed from: a */
    public static final C0117g m318a(C0112b c0112b, String str) {
        C0117g c0117g = new C0117g(str);
        C0117g.f310c.put(str, c0117g);
        return c0117g;
    }

    /* renamed from: b */
    public static String m319b(String str, int i2, int i3, String str2, int i4) throws EOFException {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z2 = (i4 & 8) == 0;
        boolean z3 = (i4 & 16) == 0;
        boolean z4 = (i4 & 32) == 0;
        boolean z5 = (i4 & 64) == 0;
        AbstractC1326c.m3062e(str, "$this$canonicalize");
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 32;
            int i7 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z5) || AbstractC1411i.m3172M(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z2 || (z3 && !m321e(str, iCharCount, length)))) || (iCodePointAt == 43 && z4)))) {
                C0479g c0479g = new C0479g();
                c0479g.m1170E(str, i5, iCharCount);
                C0479g c0479g2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z2 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z4) {
                            c0479g.m1169D(z2 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i7 && !z5) || AbstractC1411i.m3172M(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z2 || (z3 && !m321e(str, iCharCount, length)))))) {
                            if (c0479g2 == null) {
                                c0479g2 = new C0479g();
                            }
                            c0479g2.m1171F(iCodePointAt2);
                            while (!c0479g2.m1175g()) {
                                byte bM1179k = c0479g2.m1179k();
                                c0479g.m1194z(37);
                                char[] cArr = C0126p.f371j;
                                c0479g.m1194z(cArr[((bM1179k & 255) >> 4) & 15]);
                                c0479g.m1194z(cArr[bM1179k & 15]);
                            }
                        } else {
                            c0479g.m1171F(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i6 = 32;
                    i7 = 128;
                }
                return c0479g.m1186r();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i5, length);
        AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: c */
    public static int m320c(String str) {
        AbstractC1326c.m3062e(str, "scheme");
        int iHashCode = str.hashCode();
        return iHashCode != 3213448 ? (iHashCode == 99617003 && str.equals("https")) ? 443 : -1 : str.equals("http") ? 80 : -1;
    }

    /* renamed from: e */
    public static boolean m321e(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && AbstractC0145b.m406s(str.charAt(i2 + 1)) != -1 && AbstractC0145b.m406s(str.charAt(i4)) != -1;
    }

    /* renamed from: f */
    public static String m322f(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z2 = (i4 & 4) == 0;
        AbstractC1326c.m3062e(str, "$this$percentDecode");
        int iCharCount = i2;
        while (iCharCount < i3) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                C0479g c0479g = new C0479g();
                c0479g.m1170E(str, i2, iCharCount);
                while (iCharCount < i3) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i3) {
                        int iM406s = AbstractC0145b.m406s(str.charAt(iCharCount + 1));
                        int iM406s2 = AbstractC0145b.m406s(str.charAt(i5));
                        if (iM406s == -1 || iM406s2 == -1) {
                            c0479g.m1171F(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c0479g.m1194z((iM406s << 4) + iM406s2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z2) {
                        c0479g.m1194z(32);
                        iCharCount++;
                    } else {
                        c0479g.m1171F(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c0479g.m1186r();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i2, i3);
        AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: g */
    public static ArrayList m323g(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int iM3177R = AbstractC1411i.m3177R(str, '&', i2, 4);
            if (iM3177R == -1) {
                iM3177R = str.length();
            }
            int iM3177R2 = AbstractC1411i.m3177R(str, '=', i2, 4);
            if (iM3177R2 == -1 || iM3177R2 > iM3177R) {
                String strSubstring = str.substring(i2, iM3177R);
                AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i2, iM3177R2);
                AbstractC1326c.m3061d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iM3177R2 + 1, iM3177R);
                AbstractC1326c.m3061d(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i2 = iM3177R + 1;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized C0117g m324d(String str) {
        C0117g c0117g;
        String strConcat;
        try {
            AbstractC1326c.m3062e(str, "javaName");
            LinkedHashMap linkedHashMap = C0117g.f310c;
            c0117g = (C0117g) linkedHashMap.get(str);
            if (c0117g == null) {
                if (AbstractC1411i.m3188c0(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    AbstractC1326c.m3061d(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (AbstractC1411i.m3188c0(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    AbstractC1326c.m3061d(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                c0117g = (C0117g) linkedHashMap.get(strConcat);
                if (c0117g == null) {
                    c0117g = new C0117g(str);
                }
                linkedHashMap.put(str, c0117g);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0117g;
    }
}
