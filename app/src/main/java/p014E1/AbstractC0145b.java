package p014E1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p011D1.C0124n;
import p011D1.C0126p;
import p011D1.C0134x;
import p011D1.C0135y;
import p030K1.C0306b;
import p050R1.C0479g;
import p050R1.C0487o;
import p050R1.C0489q;
import p050R1.InterfaceC0481i;
import p050R1.InterfaceC0494v;
import p093e2.AbstractC0901d;
import p110k1.C1215q;
import p131s1.AbstractC1326c;
import p131s1.C1329f;
import p149y1.AbstractC1403a;
import p149y1.AbstractC1411i;

/* renamed from: E1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0145b {

    /* renamed from: a */
    public static final byte[] f495a;

    /* renamed from: b */
    public static final C0124n f496b = AbstractC0901d.m2289V(new String[0]);

    /* renamed from: c */
    public static final C0135y f497c;

    /* renamed from: d */
    public static final C0487o f498d;

    /* renamed from: e */
    public static final TimeZone f499e;

    /* renamed from: f */
    public static final C1329f f500f;

    /* renamed from: g */
    public static final String f501g;

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0195, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p014E1.AbstractC0145b.<clinit>():void");
    }

    /* renamed from: A */
    public static final String m386A(String str, int i2, int i3) {
        int iM402o = m402o(str, i2, i3);
        String strSubstring = str.substring(iM402o, m403p(str, iM402o, i3));
        AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: B */
    public static final void m387B(IOException iOException, List list) {
        AbstractC1326c.m3062e(iOException, "$this$withSuppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0901d.m2291a(iOException, (Exception) it.next());
        }
    }

    /* renamed from: a */
    public static final boolean m388a(C0126p c0126p, C0126p c0126p2) {
        AbstractC1326c.m3062e(c0126p, "$this$canReuseConnectionFor");
        AbstractC1326c.m3062e(c0126p2, "other");
        return AbstractC1326c.m3058a(c0126p.f376e, c0126p2.f376e) && c0126p.f377f == c0126p2.f377f && AbstractC1326c.m3058a(c0126p.f373b, c0126p2.f373b);
    }

    /* renamed from: b */
    public static final int m389b(String str, long j2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (j2 < 0) {
            throw new IllegalStateException(str.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(str.concat(" too large.").toString());
        }
        if (millis != 0 || j2 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str.concat(" too small.").toString());
    }

    /* renamed from: c */
    public static final void m390c(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: d */
    public static final void m391d(Closeable closeable) throws IOException {
        AbstractC1326c.m3062e(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final void m392e(Socket socket) throws IOException {
        AbstractC1326c.m3062e(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (!AbstractC1326c.m3058a(e4.getMessage(), "bio == null")) {
                throw e4;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public static final int m393f(String str, char c3, int i2, int i3) {
        while (i2 < i3) {
            if (str.charAt(i2) == c3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: g */
    public static final int m394g(String str, String str2, int i2, int i3) {
        while (i2 < i3) {
            if (AbstractC1411i.m3172M(str2, str.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: h */
    public static /* synthetic */ int m395h(String str, char c3, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return m393f(str, c3, i2, i3);
    }

    /* renamed from: i */
    public static final boolean m396i(InterfaceC0494v interfaceC0494v) {
        AbstractC1326c.m3062e(TimeUnit.MILLISECONDS, "timeUnit");
        try {
            return m409v(interfaceC0494v, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static final String m397j(String str, Object... objArr) {
        AbstractC1326c.m3062e(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* renamed from: k */
    public static final boolean m398k(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1326c.m3062e(strArr, "$this$hasIntersection");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static final long m399l(C0134x c0134x) {
        String strM351a = c0134x.f473f.m351a("Content-Length");
        if (strM351a == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM351a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: m */
    public static final List m400m(Object... objArr) {
        List listAsList;
        AbstractC1326c.m3062e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        AbstractC1326c.m3062e(objArrCopyOf, "elements");
        if (objArrCopyOf.length > 0) {
            listAsList = Arrays.asList(objArrCopyOf);
            AbstractC1326c.m3061d(listAsList, "asList(this)");
        } else {
            listAsList = C1215q.f4904a;
        }
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        AbstractC1326c.m3061d(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* renamed from: n */
    public static final int m401n(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (AbstractC1326c.m3063f(cCharAt, 31) <= 0 || AbstractC1326c.m3063f(cCharAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public static final int m402o(String str, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: p */
    public static final int m403p(String str, int i2, int i3) {
        int i4 = i3 - 1;
        if (i4 >= i2) {
            while (true) {
                char cCharAt = str.charAt(i4);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        return i2;
    }

    /* renamed from: q */
    public static final String[] m404q(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1326c.m3062e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: r */
    public static final boolean m405r(String str) {
        AbstractC1326c.m3062e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* renamed from: s */
    public static final int m406s(char c3) {
        if ('0' <= c3 && '9' >= c3) {
            return c3 - '0';
        }
        if ('a' <= c3 && 'f' >= c3) {
            return c3 - 'W';
        }
        if ('A' <= c3 && 'F' >= c3) {
            return c3 - '7';
        }
        return -1;
    }

    /* renamed from: t */
    public static final Charset m407t(InterfaceC0481i interfaceC0481i, Charset charset) {
        AbstractC1326c.m3062e(interfaceC0481i, "$this$readBomAsCharset");
        AbstractC1326c.m3062e(charset, "default");
        int iMo1172c = interfaceC0481i.mo1172c(f498d);
        if (iMo1172c == -1) {
            return charset;
        }
        if (iMo1172c == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            AbstractC1326c.m3061d(charset2, "UTF_8");
            return charset2;
        }
        if (iMo1172c == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            AbstractC1326c.m3061d(charset3, "UTF_16BE");
            return charset3;
        }
        if (iMo1172c == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            AbstractC1326c.m3061d(charset4, "UTF_16LE");
            return charset4;
        }
        if (iMo1172c == 3) {
            Charset charset5 = AbstractC1403a.f6077a;
            Charset charset6 = AbstractC1403a.f6079c;
            if (charset6 != null) {
                return charset6;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            AbstractC1326c.m3061d(charsetForName, "forName(\"UTF-32BE\")");
            AbstractC1403a.f6079c = charsetForName;
            return charsetForName;
        }
        if (iMo1172c != 4) {
            throw new AssertionError();
        }
        Charset charset7 = AbstractC1403a.f6077a;
        Charset charset8 = AbstractC1403a.f6078b;
        if (charset8 != null) {
            return charset8;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        AbstractC1326c.m3061d(charsetForName2, "forName(\"UTF-32LE\")");
        AbstractC1403a.f6078b = charsetForName2;
        return charsetForName2;
    }

    /* renamed from: u */
    public static final int m408u(C0489q c0489q) {
        AbstractC1326c.m3062e(c0489q, "$this$readMedium");
        return (c0489q.m1223i() & 255) | ((c0489q.m1223i() & 255) << 16) | ((c0489q.m1223i() & 255) << 8);
    }

    /* renamed from: v */
    public static final boolean m409v(InterfaceC0494v interfaceC0494v, int i2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC1326c.m3062e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo1208c = interfaceC0494v.mo485a().mo1210e() ? interfaceC0494v.mo485a().mo1208c() - jNanoTime : Long.MAX_VALUE;
        interfaceC0494v.mo485a().mo1209d(Math.min(jMo1208c, timeUnit.toNanos(i2)) + jNanoTime);
        try {
            C0479g c0479g = new C0479g();
            while (interfaceC0494v.mo486b(c0479g, 8192L) != -1) {
                c0479g.m1187s(c0479g.f1480b);
            }
            if (jMo1208c == Long.MAX_VALUE) {
                interfaceC0494v.mo485a().mo1206a();
                return true;
            }
            interfaceC0494v.mo485a().mo1209d(jNanoTime + jMo1208c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo1208c == Long.MAX_VALUE) {
                interfaceC0494v.mo485a().mo1206a();
                return false;
            }
            interfaceC0494v.mo485a().mo1209d(jNanoTime + jMo1208c);
            return false;
        } catch (Throwable th) {
            if (jMo1208c == Long.MAX_VALUE) {
                interfaceC0494v.mo485a().mo1206a();
            } else {
                interfaceC0494v.mo485a().mo1209d(jNanoTime + jMo1208c);
            }
            throw th;
        }
    }

    /* renamed from: w */
    public static final C0124n m410w(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0306b c0306b = (C0306b) it.next();
            String strM1204j = c0306b.f938b.m1204j();
            String strM1204j2 = c0306b.f939c.m1204j();
            arrayList.add(strM1204j);
            arrayList.add(AbstractC1411i.m3191f0(strM1204j2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new C0124n((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m411x(p011D1.C0126p r3, boolean r4) {
        /*
            java.lang.String r0 = "$this$toHostHeader"
            p131s1.AbstractC1326c.m3062e(r3, r0)
            java.lang.String r0 = ":"
            java.lang.String r1 = r3.f376e
            boolean r0 = p149y1.AbstractC1411i.m3173N(r1, r0)
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r0.<init>(r2)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L22:
            int r0 = r3.f377f
            if (r4 != 0) goto L57
            java.lang.String r3 = r3.f373b
            java.lang.String r4 = "scheme"
            p131s1.AbstractC1326c.m3062e(r3, r4)
            int r4 = r3.hashCode()
            r2 = 3213448(0x310888, float:4.503E-39)
            if (r4 == r2) goto L47
            r2 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r4 == r2) goto L3c
            goto L52
        L3c:
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L52
            r3 = 443(0x1bb, float:6.21E-43)
            goto L53
        L47:
            java.lang.String r4 = "http"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L52
            r3 = 80
            goto L53
        L52:
            r3 = -1
        L53:
            if (r0 == r3) goto L56
            goto L57
        L56:
            return r1
        L57:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r4 = 58
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p014E1.AbstractC0145b.m411x(D1.p, boolean):java.lang.String");
    }

    /* renamed from: y */
    public static final List m412y(List list) {
        AbstractC1326c.m3062e(list, "$this$toImmutableList");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        AbstractC1326c.m3061d(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* renamed from: z */
    public static final int m413z(String str, int i2) throws NumberFormatException {
        if (str != null) {
            try {
                long j2 = Long.parseLong(str);
                if (j2 > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (j2 < 0) {
                    return 0;
                }
                return (int) j2;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }
}
