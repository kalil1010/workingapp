package p084c1;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p006C.AbstractC0075g;
import p073Z0.AbstractC0610f;
import p073Z0.AbstractC0616l;
import p073Z0.C0609e;
import p073Z0.C0611g;
import p073Z0.C0612h;
import p073Z0.C0613i;
import p073Z0.C0615k;
import p080b1.C0774l;
import p080b1.C0775m;
import p080b1.C0776n;
import p080b1.C0777o;
import p101h1.C0987a;
import p101h1.C0988b;
import p124q.AbstractC1271e;

/* renamed from: c1.g */
/* loaded from: classes.dex */
public final class C0796g extends AbstractC0616l {

    /* renamed from: b */
    public static final C0795f f2958b = new C0795f(new C0796g(0), 0);

    /* renamed from: a */
    public final /* synthetic */ int f2959a;

    public /* synthetic */ C0796g(int i2) {
        this.f2959a = i2;
    }

    /* renamed from: c */
    public static AbstractC0610f m2002c(C0987a c0987a, int i2) {
        int iM2966a = AbstractC1271e.m2966a(i2);
        if (iM2966a == 5) {
            return new C0615k(c0987a.m2523z());
        }
        if (iM2966a == 6) {
            return new C0615k(new C0774l(c0987a.m2523z()));
        }
        if (iM2966a == 7) {
            return new C0615k(Boolean.valueOf(c0987a.m2515r()));
        }
        if (iM2966a != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0075g.m242k(i2)));
        }
        c0987a.m2521x();
        return C0612h.f1928a;
    }

    /* renamed from: d */
    public static void m2003d(C0988b c0988b, AbstractC0610f abstractC0610f) throws IOException {
        if (abstractC0610f == null || (abstractC0610f instanceof C0612h)) {
            c0988b.m2532o();
            return;
        }
        boolean z2 = abstractC0610f instanceof C0615k;
        if (z2) {
            if (!z2) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC0610f);
            }
            C0615k c0615k = (C0615k) abstractC0610f;
            Serializable serializable = c0615k.f1930a;
            if (serializable instanceof Number) {
                c0988b.m2537t(c0615k.m1414a());
                return;
            } else if (serializable instanceof Boolean) {
                c0988b.m2539v(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c0615k.m1415b()));
                return;
            } else {
                c0988b.m2538u(c0615k.m1415b());
                return;
            }
        }
        boolean z3 = abstractC0610f instanceof C0609e;
        if (z3) {
            c0988b.m2525h();
            if (!z3) {
                throw new IllegalStateException("Not a JSON Array: " + abstractC0610f);
            }
            Iterator it = ((C0609e) abstractC0610f).f1927a.iterator();
            while (it.hasNext()) {
                m2003d(c0988b, (AbstractC0610f) it.next());
            }
            c0988b.m2528k();
            return;
        }
        boolean z4 = abstractC0610f instanceof C0613i;
        if (!z4) {
            throw new IllegalArgumentException("Couldn't write " + abstractC0610f.getClass());
        }
        c0988b.m2526i();
        if (!z4) {
            throw new IllegalStateException("Not a JSON Object: " + abstractC0610f);
        }
        Iterator it2 = ((C0776n) ((C0613i) abstractC0610f).f1929a.entrySet()).iterator();
        while (((C0775m) it2).hasNext()) {
            C0777o c0777oM1990b = ((C0775m) it2).m1990b();
            c0988b.m2530m((String) c0777oM1990b.getKey());
            m2003d(c0988b, (AbstractC0610f) c0777oM1990b.getValue());
        }
        c0988b.m2529l();
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) {
        AbstractC0610f c0609e;
        AbstractC0610f c0609e2;
        boolean zM2515r;
        switch (this.f2959a) {
            case 0:
                int iM2496B = c0987a.m2496B();
                int iM2966a = AbstractC1271e.m2966a(iM2496B);
                if (iM2966a == 5 || iM2966a == 6) {
                    return new C0774l(c0987a.m2523z());
                }
                if (iM2966a == 8) {
                    c0987a.m2521x();
                    return null;
                }
                throw new C0611g("Expecting number, got: " + AbstractC0075g.m242k(iM2496B) + "; at path " + c0987a.m2511n(false));
            case 1:
                ArrayList arrayList = new ArrayList();
                c0987a.m2504g();
                while (c0987a.m2512o()) {
                    try {
                        arrayList.add(Integer.valueOf(c0987a.m2517t()));
                    } catch (NumberFormatException e3) {
                        throw new C0611g(e3);
                    }
                }
                c0987a.m2508k();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            case 2:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                try {
                    return Long.valueOf(c0987a.m2518u());
                } catch (NumberFormatException e4) {
                    throw new C0611g(e4);
                }
            case 3:
                if (c0987a.m2496B() != 9) {
                    return Float.valueOf((float) c0987a.m2516s());
                }
                c0987a.m2521x();
                return null;
            case 4:
                if (c0987a.m2496B() != 9) {
                    return Double.valueOf(c0987a.m2516s());
                }
                c0987a.m2521x();
                return null;
            case 5:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                String strM2523z = c0987a.m2523z();
                if (strM2523z.length() == 1) {
                    return Character.valueOf(strM2523z.charAt(0));
                }
                throw new C0611g("Expecting character, got: " + strM2523z + "; at " + c0987a.m2511n(true));
            case 6:
                int iM2496B2 = c0987a.m2496B();
                if (iM2496B2 != 9) {
                    return iM2496B2 == 8 ? Boolean.toString(c0987a.m2515r()) : c0987a.m2523z();
                }
                c0987a.m2521x();
                return null;
            case 7:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                String strM2523z2 = c0987a.m2523z();
                try {
                    return new BigDecimal(strM2523z2);
                } catch (NumberFormatException e5) {
                    throw new C0611g("Failed parsing '" + strM2523z2 + "' as BigDecimal; at path " + c0987a.m2511n(true), e5);
                }
            case 8:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                String strM2523z3 = c0987a.m2523z();
                try {
                    return new BigInteger(strM2523z3);
                } catch (NumberFormatException e6) {
                    throw new C0611g("Failed parsing '" + strM2523z3 + "' as BigInteger; at path " + c0987a.m2511n(true), e6);
                }
            case 9:
                if (c0987a.m2496B() != 9) {
                    return new C0774l(c0987a.m2523z());
                }
                c0987a.m2521x();
                return null;
            case 10:
                if (c0987a.m2496B() != 9) {
                    return new StringBuilder(c0987a.m2523z());
                }
                c0987a.m2521x();
                return null;
            case 11:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (c0987a.m2496B() != 9) {
                    return new StringBuffer(c0987a.m2523z());
                }
                c0987a.m2521x();
                return null;
            case 13:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                String strM2523z4 = c0987a.m2523z();
                if ("null".equals(strM2523z4)) {
                    return null;
                }
                return new URL(strM2523z4);
            case 14:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                try {
                    String strM2523z5 = c0987a.m2523z();
                    if ("null".equals(strM2523z5)) {
                        return null;
                    }
                    return new URI(strM2523z5);
                } catch (URISyntaxException e7) {
                    throw new C0611g(e7);
                }
            case 15:
                if (c0987a.m2496B() != 9) {
                    return InetAddress.getByName(c0987a.m2523z());
                }
                c0987a.m2521x();
                return null;
            case 16:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                String strM2523z6 = c0987a.m2523z();
                try {
                    return UUID.fromString(strM2523z6);
                } catch (IllegalArgumentException e8) {
                    throw new C0611g("Failed parsing '" + strM2523z6 + "' as UUID; at path " + c0987a.m2511n(true), e8);
                }
            case 17:
                String strM2523z7 = c0987a.m2523z();
                try {
                    return Currency.getInstance(strM2523z7);
                } catch (IllegalArgumentException e9) {
                    throw new C0611g("Failed parsing '" + strM2523z7 + "' as Currency; at path " + c0987a.m2511n(true), e9);
                }
            case 18:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                c0987a.m2505h();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (c0987a.m2496B() != 4) {
                    String strM2519v = c0987a.m2519v();
                    int iM2517t = c0987a.m2517t();
                    if ("year".equals(strM2519v)) {
                        i3 = iM2517t;
                    } else if ("month".equals(strM2519v)) {
                        i4 = iM2517t;
                    } else if ("dayOfMonth".equals(strM2519v)) {
                        i5 = iM2517t;
                    } else if ("hourOfDay".equals(strM2519v)) {
                        i6 = iM2517t;
                    } else if ("minute".equals(strM2519v)) {
                        i7 = iM2517t;
                    } else if ("second".equals(strM2519v)) {
                        i8 = iM2517t;
                    }
                }
                c0987a.m2509l();
                return new GregorianCalendar(i3, i4, i5, i6, i7, i8);
            case 19:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c0987a.m2523z(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 20:
                int iM2496B3 = c0987a.m2496B();
                int iM2966a2 = AbstractC1271e.m2966a(iM2496B3);
                if (iM2966a2 == 0) {
                    c0987a.m2504g();
                    c0609e = new C0609e();
                } else if (iM2966a2 != 2) {
                    c0609e = null;
                } else {
                    c0987a.m2505h();
                    c0609e = new C0613i();
                }
                if (c0609e == null) {
                    return m2002c(c0987a, iM2496B3);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c0987a.m2512o()) {
                        String strM2519v2 = c0609e instanceof C0613i ? c0987a.m2519v() : null;
                        int iM2496B4 = c0987a.m2496B();
                        int iM2966a3 = AbstractC1271e.m2966a(iM2496B4);
                        if (iM2966a3 == 0) {
                            c0987a.m2504g();
                            c0609e2 = new C0609e();
                        } else if (iM2966a3 != 2) {
                            c0609e2 = null;
                        } else {
                            c0987a.m2505h();
                            c0609e2 = new C0613i();
                        }
                        boolean z2 = c0609e2 != null;
                        if (c0609e2 == null) {
                            c0609e2 = m2002c(c0987a, iM2496B4);
                        }
                        if (c0609e instanceof C0609e) {
                            ((C0609e) c0609e).f1927a.add(c0609e2);
                        } else {
                            ((C0613i) c0609e).f1929a.put(strM2519v2, c0609e2);
                        }
                        if (z2) {
                            arrayDeque.addLast(c0609e);
                            c0609e = c0609e2;
                        }
                    } else {
                        if (c0609e instanceof C0609e) {
                            c0987a.m2508k();
                        } else {
                            c0987a.m2509l();
                        }
                        if (arrayDeque.isEmpty()) {
                            return c0609e;
                        }
                        c0609e = (AbstractC0610f) arrayDeque.removeLast();
                    }
                }
            case 21:
                BitSet bitSet = new BitSet();
                c0987a.m2504g();
                int iM2496B5 = c0987a.m2496B();
                int i9 = 0;
                while (iM2496B5 != 2) {
                    int iM2966a4 = AbstractC1271e.m2966a(iM2496B5);
                    if (iM2966a4 == 5 || iM2966a4 == 6) {
                        int iM2517t2 = c0987a.m2517t();
                        if (iM2517t2 == 0) {
                            zM2515r = false;
                        } else {
                            if (iM2517t2 != 1) {
                                throw new C0611g("Invalid bitset value " + iM2517t2 + ", expected 0 or 1; at path " + c0987a.m2511n(true));
                            }
                            zM2515r = true;
                        }
                    } else {
                        if (iM2966a4 != 7) {
                            throw new C0611g("Invalid bitset value type: " + AbstractC0075g.m242k(iM2496B5) + "; at path " + c0987a.m2511n(false));
                        }
                        zM2515r = c0987a.m2515r();
                    }
                    if (zM2515r) {
                        bitSet.set(i9);
                    }
                    i9++;
                    iM2496B5 = c0987a.m2496B();
                }
                c0987a.m2508k();
                return bitSet;
            case 22:
                int iM2496B6 = c0987a.m2496B();
                if (iM2496B6 != 9) {
                    return iM2496B6 == 6 ? Boolean.valueOf(Boolean.parseBoolean(c0987a.m2523z())) : Boolean.valueOf(c0987a.m2515r());
                }
                c0987a.m2521x();
                return null;
            case 23:
                if (c0987a.m2496B() != 9) {
                    return Boolean.valueOf(c0987a.m2523z());
                }
                c0987a.m2521x();
                return null;
            case 24:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                try {
                    int iM2517t3 = c0987a.m2517t();
                    if (iM2517t3 <= 255 && iM2517t3 >= -128) {
                        return Byte.valueOf((byte) iM2517t3);
                    }
                    throw new C0611g("Lossy conversion from " + iM2517t3 + " to byte; at path " + c0987a.m2511n(true));
                } catch (NumberFormatException e10) {
                    throw new C0611g(e10);
                }
            case 25:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                try {
                    int iM2517t4 = c0987a.m2517t();
                    if (iM2517t4 <= 65535 && iM2517t4 >= -32768) {
                        return Short.valueOf((short) iM2517t4);
                    }
                    throw new C0611g("Lossy conversion from " + iM2517t4 + " to short; at path " + c0987a.m2511n(true));
                } catch (NumberFormatException e11) {
                    throw new C0611g(e11);
                }
            case 26:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                try {
                    return Integer.valueOf(c0987a.m2517t());
                } catch (NumberFormatException e12) {
                    throw new C0611g(e12);
                }
            case 27:
                try {
                    return new AtomicInteger(c0987a.m2517t());
                } catch (NumberFormatException e13) {
                    throw new C0611g(e13);
                }
            default:
                return new AtomicBoolean(c0987a.m2515r());
        }
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) throws IOException {
        switch (this.f2959a) {
            case 0:
                c0988b.m2537t((Number) obj);
                return;
            case 1:
                c0988b.m2525h();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i2 = 0; i2 < length; i2++) {
                    c0988b.m2536s(r6.get(i2));
                }
                c0988b.m2528k();
                return;
            case 2:
                Number number = (Number) obj;
                if (number == null) {
                    c0988b.m2532o();
                    return;
                } else {
                    c0988b.m2536s(number.longValue());
                    return;
                }
            case 3:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    c0988b.m2532o();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                c0988b.m2537t(numberValueOf);
                return;
            case 4:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c0988b.m2532o();
                    return;
                } else {
                    c0988b.m2535r(number2.doubleValue());
                    return;
                }
            case 5:
                Character ch = (Character) obj;
                c0988b.m2538u(ch == null ? null : String.valueOf(ch));
                return;
            case 6:
                c0988b.m2538u((String) obj);
                return;
            case 7:
                c0988b.m2537t((BigDecimal) obj);
                return;
            case 8:
                c0988b.m2537t((BigInteger) obj);
                return;
            case 9:
                c0988b.m2537t((C0774l) obj);
                return;
            case 10:
                StringBuilder sb = (StringBuilder) obj;
                c0988b.m2538u(sb == null ? null : sb.toString());
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c0988b.m2538u(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 13:
                URL url = (URL) obj;
                c0988b.m2538u(url == null ? null : url.toExternalForm());
                return;
            case 14:
                URI uri = (URI) obj;
                c0988b.m2538u(uri == null ? null : uri.toASCIIString());
                return;
            case 15:
                InetAddress inetAddress = (InetAddress) obj;
                c0988b.m2538u(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 16:
                UUID uuid = (UUID) obj;
                c0988b.m2538u(uuid == null ? null : uuid.toString());
                return;
            case 17:
                c0988b.m2538u(((Currency) obj).getCurrencyCode());
                return;
            case 18:
                if (((Calendar) obj) == null) {
                    c0988b.m2532o();
                    return;
                }
                c0988b.m2526i();
                c0988b.m2530m("year");
                c0988b.m2536s(r6.get(1));
                c0988b.m2530m("month");
                c0988b.m2536s(r6.get(2));
                c0988b.m2530m("dayOfMonth");
                c0988b.m2536s(r6.get(5));
                c0988b.m2530m("hourOfDay");
                c0988b.m2536s(r6.get(11));
                c0988b.m2530m("minute");
                c0988b.m2536s(r6.get(12));
                c0988b.m2530m("second");
                c0988b.m2536s(r6.get(13));
                c0988b.m2529l();
                return;
            case 19:
                Locale locale = (Locale) obj;
                c0988b.m2538u(locale == null ? null : locale.toString());
                return;
            case 20:
                m2003d(c0988b, (AbstractC0610f) obj);
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                c0988b.m2525h();
                int length2 = bitSet.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    c0988b.m2536s(bitSet.get(i3) ? 1L : 0L);
                }
                c0988b.m2528k();
                return;
            case 22:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    c0988b.m2532o();
                    return;
                }
                c0988b.m2540w();
                c0988b.m2524g();
                c0988b.f4156a.write(bool.booleanValue() ? "true" : "false");
                return;
            case 23:
                Boolean bool2 = (Boolean) obj;
                c0988b.m2538u(bool2 == null ? "null" : bool2.toString());
                return;
            case 24:
                if (((Number) obj) == null) {
                    c0988b.m2532o();
                    return;
                } else {
                    c0988b.m2536s(r6.byteValue());
                    return;
                }
            case 25:
                if (((Number) obj) == null) {
                    c0988b.m2532o();
                    return;
                } else {
                    c0988b.m2536s(r6.shortValue());
                    return;
                }
            case 26:
                if (((Number) obj) == null) {
                    c0988b.m2532o();
                    return;
                } else {
                    c0988b.m2536s(r6.intValue());
                    return;
                }
            case 27:
                c0988b.m2536s(((AtomicInteger) obj).get());
                return;
            default:
                c0988b.m2539v(((AtomicBoolean) obj).get());
                return;
        }
    }
}
