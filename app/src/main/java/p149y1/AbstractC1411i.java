package p149y1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p002A1.C0019a;
import p093e2.AbstractC0901d;
import p110k1.AbstractC1209k;
import p110k1.C1199a;
import p131s1.AbstractC1326c;
import p140v1.C1379b;
import p140v1.C1380c;
import p146x1.C1398c;

/* renamed from: y1.i */
/* loaded from: classes.dex */
public abstract class AbstractC1411i extends AbstractC1410h {
    /* renamed from: M */
    public static boolean m3172M(CharSequence charSequence, char c3) {
        AbstractC1326c.m3062e(charSequence, "<this>");
        return m3177R(charSequence, c3, 0, 2) >= 0;
    }

    /* renamed from: N */
    public static boolean m3173N(CharSequence charSequence, String str) {
        AbstractC1326c.m3062e(charSequence, "<this>");
        return m3178S(charSequence, str, 0, 2) >= 0;
    }

    /* renamed from: O */
    public static boolean m3174O(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    /* renamed from: P */
    public static final int m3175P(CharSequence charSequence) {
        AbstractC1326c.m3062e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: Q */
    public static final int m3176Q(CharSequence charSequence, String str, int i2, boolean z2) {
        AbstractC1326c.m3062e(charSequence, "<this>");
        AbstractC1326c.m3062e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C1380c c1380c = new C1380c(i2, length, 1);
        boolean z3 = charSequence instanceof String;
        int i3 = c1380c.f5990b;
        if (!z3) {
            boolean z4 = z2;
            if (i2 > i3) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z5 = z4;
                z4 = z5;
                if (m3183X(str, 0, charSequence2, i2, str.length(), z5)) {
                    return i2;
                }
                if (i2 == i3) {
                    return -1;
                }
                i2++;
                charSequence = charSequence2;
            }
        } else {
            if (i2 > i3) {
                return -1;
            }
            int i4 = i2;
            while (true) {
                String str2 = str;
                boolean z6 = z2;
                if (m3182W(0, i4, str.length(), str2, (String) charSequence, z6)) {
                    return i4;
                }
                if (i4 == i3) {
                    return -1;
                }
                i4++;
                str = str2;
                z2 = z6;
            }
        }
    }

    /* renamed from: R */
    public static int m3177R(CharSequence charSequence, char c3, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        AbstractC1326c.m3062e(charSequence, "<this>");
        return !(charSequence instanceof String) ? m3179T(charSequence, new char[]{c3}, i2, false) : ((String) charSequence).indexOf(c3, i2);
    }

    /* renamed from: S */
    public static /* synthetic */ int m3178S(CharSequence charSequence, String str, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m3176Q(charSequence, str, i2, false);
    }

    /* renamed from: T */
    public static final int m3179T(CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        int i3;
        AbstractC1326c.m3062e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i2);
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = new C1380c(i2, m3175P(charSequence), 1).f5990b;
        boolean z3 = i2 <= i4;
        if (!z3) {
            i2 = i4;
        }
        while (z3) {
            if (i2 != i4) {
                i3 = i2 + 1;
            } else {
                if (!z3) {
                    throw new NoSuchElementException();
                }
                i3 = i2;
                z3 = false;
            }
            char cCharAt = charSequence.charAt(i2);
            for (char c3 : cArr) {
                if (AbstractC0901d.m2311p(c3, cCharAt, z2)) {
                    return i2;
                }
            }
            i2 = i3;
        }
        return -1;
    }

    /* renamed from: U */
    public static final boolean m3180U(String str) {
        AbstractC1326c.m3062e(str, "<this>");
        if (str.length() != 0) {
            Iterable c1380c = new C1380c(0, str.length() - 1, 1);
            if (!(c1380c instanceof Collection) || !((Collection) c1380c).isEmpty()) {
                Iterator it = c1380c.iterator();
                while (((C1379b) it).f5994c) {
                    char cCharAt = str.charAt(((C1379b) it).m3153a());
                    if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: V */
    public static int m3181V(String str, char c3, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = m3175P(str);
        }
        AbstractC1326c.m3062e(str, "<this>");
        return str.lastIndexOf(c3, i2);
    }

    /* renamed from: W */
    public static final boolean m3182W(int i2, int i3, int i4, String str, String str2, boolean z2) {
        AbstractC1326c.m3062e(str, "<this>");
        AbstractC1326c.m3062e(str2, "other");
        return !z2 ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z2, i2, str2, i3, i4);
    }

    /* renamed from: X */
    public static final boolean m3183X(String str, int i2, CharSequence charSequence, int i3, int i4, boolean z2) {
        AbstractC1326c.m3062e(str, "<this>");
        AbstractC1326c.m3062e(charSequence, "other");
        if (i3 >= 0 && i2 >= 0 && i2 <= str.length() - i4 && i3 <= charSequence.length() - i4) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (AbstractC0901d.m2311p(str.charAt(i2 + i5), charSequence.charAt(i3 + i5), z2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public static String m3184Y(String str, String str2) {
        if (!m3188c0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC1326c.m3061d(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* renamed from: Z */
    public static String m3185Z(String str, String str2, String str3) {
        AbstractC1326c.m3062e(str, "<this>");
        int iM3176Q = m3176Q(str, str2, 0, false);
        if (iM3176Q < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, iM3176Q);
            sb.append(str3);
            i3 = iM3176Q + length;
            if (iM3176Q >= str.length()) {
                break;
            }
            iM3176Q = m3176Q(str, str2, iM3176Q + i2, false);
        } while (iM3176Q > 0);
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        AbstractC1326c.m3061d(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    /* renamed from: a0 */
    public static List m3186a0(String str, char[] cArr) {
        AbstractC1326c.m3062e(str, "<this>");
        if (cArr.length == 1) {
            String strValueOf = String.valueOf(cArr[0]);
            int iM3176Q = m3176Q(str, strValueOf, 0, false);
            if (iM3176Q == -1) {
                return AbstractC0901d.m2287T(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iM3176Q).toString());
                length = strValueOf.length() + iM3176Q;
                iM3176Q = m3176Q(str, strValueOf, length, false);
            } while (iM3176Q != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            return arrayList;
        }
        C1398c c1398c = new C1398c(new C0019a(str, new C1199a(1, cArr)));
        ArrayList arrayList2 = new ArrayList(AbstractC1209k.m2850x0(c1398c));
        Iterator it = c1398c.iterator();
        while (true) {
            C1404b c1404b = (C1404b) it;
            if (!c1404b.hasNext()) {
                return arrayList2;
            }
            C1380c c1380c = (C1380c) c1404b.next();
            AbstractC1326c.m3062e(c1380c, "range");
            arrayList2.add(str.subSequence(c1380c.f5989a, c1380c.f5990b + 1).toString());
        }
    }

    /* renamed from: b0 */
    public static boolean m3187b0(String str, String str2, int i2, boolean z2) {
        AbstractC1326c.m3062e(str, "<this>");
        return !z2 ? str.startsWith(str2, i2) : m3182W(i2, 0, str2.length(), str, str2, z2);
    }

    /* renamed from: c0 */
    public static boolean m3188c0(String str, String str2, boolean z2) {
        AbstractC1326c.m3062e(str, "<this>");
        AbstractC1326c.m3062e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : m3182W(0, 0, str2.length(), str, str2, z2);
    }

    /* renamed from: d0 */
    public static String m3189d0(String str) {
        AbstractC1326c.m3062e(str, "<this>");
        AbstractC1326c.m3062e(str, "missingDelimiterValue");
        int iM3181V = m3181V(str, '.', 0, 6);
        if (iM3181V == -1) {
            return str;
        }
        String strSubstring = str.substring(iM3181V + 1, str.length());
        AbstractC1326c.m3061d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: e0 */
    public static Integer m3190e0(String str) {
        boolean z2;
        int i2;
        int i3;
        AbstractC0901d.m2295f(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (AbstractC1326c.m3063f(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i5 = Integer.MIN_VALUE;
                z2 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z2 = false;
            }
        } else {
            z2 = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / 10))) || (i3 = i4 * 10) < i5 + iDigit) {
                return null;
            }
            i4 = i3 - iDigit;
            i2++;
        }
        return z2 ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    /* renamed from: f0 */
    public static CharSequence m3191f0(String str) {
        AbstractC1326c.m3062e(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            char cCharAt = str.charAt(!z2 ? i2 : length);
            boolean z3 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i2, length + 1);
    }
}
