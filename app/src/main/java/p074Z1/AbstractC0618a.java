package p074Z1;

import java.util.ArrayList;

/* renamed from: Z1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0618a {

    /* renamed from: a */
    public static final Object[] f1931a = new Object[0];

    /* renamed from: b */
    public static final String[] f1932b = new String[0];

    /* renamed from: c */
    public static final byte[] f1933c = new byte[0];

    /* renamed from: a */
    public static boolean m1417a(Object[] objArr, Object obj) {
        int i2 = 0;
        while (true) {
            if (i2 >= objArr.length) {
                i2 = -1;
                break;
            }
            if (obj.equals(objArr[i2])) {
                break;
            }
            i2++;
        }
        return i2 != -1;
    }

    /* renamed from: b */
    public static String m1418b(String str) {
        if (m1419c(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (!Character.isWhitespace(str.charAt(i3))) {
                cArr[i2] = str.charAt(i3);
                i2++;
            }
        }
        return i2 == length ? str : new String(cArr, 0, i2);
    }

    /* renamed from: c */
    public static boolean m1419c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: d */
    public static boolean m1420d(CharSequence charSequence) {
        boolean z2;
        int length;
        if (charSequence == null || (length = charSequence.length()) == 0) {
            z2 = true;
        } else {
            z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                if (!Character.isWhitespace(charSequence.charAt(i2))) {
                    break;
                }
            }
            z2 = true;
        }
        return !z2;
    }

    /* renamed from: e */
    public static String m1421e(String str, int i2, String str2) {
        String str3;
        if (str == null) {
            return null;
        }
        if (m1419c(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i2 - str.length();
        if (length2 > 0) {
            if (length != 1 || length2 > 8192) {
                if (length2 == length) {
                    return str2.concat(str);
                }
                if (length2 < length) {
                    return str2.substring(0, length2).concat(str);
                }
                char[] cArr = new char[length2];
                char[] charArray = str2.toCharArray();
                for (int i3 = 0; i3 < length2; i3++) {
                    cArr[i3] = charArray[i3 % length];
                }
                return new String(cArr).concat(str);
            }
            char cCharAt = str2.charAt(0);
            int length3 = i2 - str.length();
            if (length3 > 0) {
                if (length3 > 8192) {
                    return m1421e(str, i2, String.valueOf(cCharAt));
                }
                if (length3 <= 0) {
                    str3 = "";
                } else {
                    char[] cArr2 = new char[length3];
                    for (int i4 = length3 - 1; i4 >= 0; i4--) {
                        cArr2[i4] = cCharAt;
                    }
                    str3 = new String(cArr2);
                }
                return str3.concat(str);
            }
        }
        return str;
    }

    /* renamed from: f */
    public static String m1422f(String str, String str2) {
        String str3;
        if (str == null) {
            return null;
        }
        if (m1419c(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = 4 - str.length();
        if (length2 > 0) {
            if (length != 1 || length2 > 8192) {
                if (length2 == length) {
                    return str.concat(str2);
                }
                if (length2 < length) {
                    return str.concat(str2.substring(0, length2));
                }
                char[] cArr = new char[length2];
                char[] charArray = str2.toCharArray();
                for (int i2 = 0; i2 < length2; i2++) {
                    cArr[i2] = charArray[i2 % length];
                }
                return str.concat(new String(cArr));
            }
            char cCharAt = str2.charAt(0);
            int length3 = str.length();
            int i3 = 4 - length3;
            if (i3 > 0) {
                if (i3 > 8192) {
                    return m1422f(str, String.valueOf(cCharAt));
                }
                if (i3 <= 0) {
                    str3 = "";
                } else {
                    char[] cArr2 = new char[i3];
                    for (int i4 = 3 - length3; i4 >= 0; i4--) {
                        cArr2[i4] = cCharAt;
                    }
                    str3 = new String(cArr2);
                }
                return str.concat(str3);
            }
        }
        return str;
    }

    /* renamed from: g */
    public static String[] m1423g(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return f1932b;
        }
        ArrayList arrayList = new ArrayList();
        char cCharAt = "/".charAt(0);
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            if (str.charAt(i2) == cCharAt) {
                if (z2) {
                    int i5 = i4 + 1;
                    if (i4 == -1) {
                        i2 = length;
                    }
                    arrayList.add(str.substring(i3, i2));
                    i4 = i5;
                    z2 = false;
                }
                i3 = i2 + 1;
                i2 = i3;
            } else {
                i2++;
                z2 = true;
            }
        }
        if (z2) {
            arrayList.add(str.substring(i3, i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: h */
    public static void m1424h(String str) {
        m1419c(str == null ? null : str.trim());
    }
}
