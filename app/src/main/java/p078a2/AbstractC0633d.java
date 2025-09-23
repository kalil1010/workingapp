package p078a2;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p074Z1.AbstractC0618a;
import p074Z1.AbstractC0619b;

/* renamed from: a2.d */
/* loaded from: classes.dex */
public abstract class AbstractC0633d implements Serializable {

    /* renamed from: q */
    public static final C0632c f1951q = new C0632c();

    /* renamed from: r */
    public static final ThreadLocal f1952r;

    /* renamed from: a */
    public final boolean f1953a = true;

    /* renamed from: b */
    public final boolean f1954b = true;

    /* renamed from: c */
    public boolean f1955c = false;

    /* renamed from: d */
    public boolean f1956d = true;

    /* renamed from: e */
    public String f1957e = "[";

    /* renamed from: f */
    public String f1958f = "]";

    /* renamed from: g */
    public final String f1959g = "=";

    /* renamed from: h */
    public boolean f1960h = false;

    /* renamed from: i */
    public String f1961i = ",";

    /* renamed from: j */
    public final String f1962j = "{";

    /* renamed from: k */
    public final String f1963k = "}";

    /* renamed from: l */
    public final String f1964l = "<null>";

    /* renamed from: m */
    public final String f1965m = "<size=";

    /* renamed from: n */
    public final String f1966n = ">";

    /* renamed from: o */
    public final String f1967o = "<";

    /* renamed from: p */
    public final String f1968p = ">";

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        sb.append("  ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.lineSeparator());
        sb2.append("]");
        f1952r = new ThreadLocal();
    }

    /* renamed from: c */
    public static String m1434c(Class cls) {
        HashMap map = AbstractC0619b.f1934a;
        String name = cls.getName();
        if (AbstractC0618a.m1419c(name)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (name.startsWith("[")) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                sb.append("[]");
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = name.substring(1, name.length() - 1);
            }
            Map map2 = AbstractC0619b.f1935b;
            if (map2.containsKey(name)) {
                name = (String) map2.get(name);
            }
        }
        int iLastIndexOf = name.lastIndexOf(46);
        int iIndexOf = name.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = name.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace('$', '.');
        }
        return strSubstring + ((Object) sb);
    }

    /* renamed from: d */
    public static void m1435d(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocal = f1952r;
            if (((Map) threadLocal.get()) == null) {
                threadLocal.set(new WeakHashMap());
            }
            ((Map) threadLocal.get()).put(obj, null);
        }
    }

    /* renamed from: e */
    public static void m1436e(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocal = f1952r;
            Map map = (Map) threadLocal.get();
            if (map != null) {
                map.remove(obj);
                if (map.isEmpty()) {
                    threadLocal.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m1437a(StringBuffer stringBuffer, String str, Object obj, boolean z2) {
        Map map = (Map) f1952r.get();
        if (map != null && map.containsKey(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            if (obj == null) {
                throw new NullPointerException("Cannot get the toString of a null object");
            }
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
            stringBuffer.append(name);
            stringBuffer.append('@');
            stringBuffer.append(hexString);
            return;
        }
        m1435d(obj);
        try {
            if (obj instanceof Collection) {
                if (z2) {
                    stringBuffer.append((Collection) obj);
                } else {
                    m1438b(stringBuffer, ((Collection) obj).size());
                }
            } else if (!(obj instanceof Map)) {
                int i2 = 0;
                if (obj instanceof long[]) {
                    if (z2) {
                        long[] jArr = (long[]) obj;
                        stringBuffer.append(this.f1962j);
                        while (i2 < jArr.length) {
                            if (i2 > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(jArr[i2]);
                            i2++;
                        }
                        stringBuffer.append(this.f1963k);
                    } else {
                        m1438b(stringBuffer, ((long[]) obj).length);
                    }
                } else if (obj instanceof int[]) {
                    if (z2) {
                        int[] iArr = (int[]) obj;
                        stringBuffer.append(this.f1962j);
                        while (i2 < iArr.length) {
                            if (i2 > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(iArr[i2]);
                            i2++;
                        }
                        stringBuffer.append(this.f1963k);
                    } else {
                        m1438b(stringBuffer, ((int[]) obj).length);
                    }
                } else if (obj instanceof short[]) {
                    if (z2) {
                        short[] sArr = (short[]) obj;
                        stringBuffer.append(this.f1962j);
                        while (i2 < sArr.length) {
                            if (i2 > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append((int) sArr[i2]);
                            i2++;
                        }
                        stringBuffer.append(this.f1963k);
                    } else {
                        m1438b(stringBuffer, ((short[]) obj).length);
                    }
                } else if (obj instanceof byte[]) {
                    if (z2) {
                        byte[] bArr = (byte[]) obj;
                        stringBuffer.append(this.f1962j);
                        while (i2 < bArr.length) {
                            if (i2 > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append((int) bArr[i2]);
                            i2++;
                        }
                        stringBuffer.append(this.f1963k);
                    } else {
                        m1438b(stringBuffer, ((byte[]) obj).length);
                    }
                } else if (obj instanceof char[]) {
                    if (z2) {
                        char[] cArr = (char[]) obj;
                        stringBuffer.append(this.f1962j);
                        while (i2 < cArr.length) {
                            if (i2 > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(cArr[i2]);
                            i2++;
                        }
                        stringBuffer.append(this.f1963k);
                    } else {
                        m1438b(stringBuffer, ((char[]) obj).length);
                    }
                } else if (obj instanceof double[]) {
                    if (z2) {
                        double[] dArr = (double[]) obj;
                        stringBuffer.append(this.f1962j);
                        while (i2 < dArr.length) {
                            if (i2 > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(dArr[i2]);
                            i2++;
                        }
                        stringBuffer.append(this.f1963k);
                    } else {
                        m1438b(stringBuffer, ((double[]) obj).length);
                    }
                } else if (obj instanceof float[]) {
                    if (z2) {
                        float[] fArr = (float[]) obj;
                        stringBuffer.append(this.f1962j);
                        while (i2 < fArr.length) {
                            if (i2 > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(fArr[i2]);
                            i2++;
                        }
                        stringBuffer.append(this.f1963k);
                    } else {
                        m1438b(stringBuffer, ((float[]) obj).length);
                    }
                } else if (obj instanceof boolean[]) {
                    if (z2) {
                        boolean[] zArr = (boolean[]) obj;
                        stringBuffer.append(this.f1962j);
                        while (i2 < zArr.length) {
                            if (i2 > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(zArr[i2]);
                            i2++;
                        }
                        stringBuffer.append(this.f1963k);
                    } else {
                        m1438b(stringBuffer, ((boolean[]) obj).length);
                    }
                } else if (obj.getClass().isArray()) {
                    if (z2) {
                        Object[] objArr = (Object[]) obj;
                        stringBuffer.append(this.f1962j);
                        while (i2 < objArr.length) {
                            Object obj2 = objArr[i2];
                            if (i2 > 0) {
                                stringBuffer.append(",");
                            }
                            if (obj2 == null) {
                                stringBuffer.append(this.f1964l);
                            } else {
                                m1437a(stringBuffer, str, obj2, true);
                            }
                            i2++;
                        }
                        stringBuffer.append(this.f1963k);
                    } else {
                        m1438b(stringBuffer, ((Object[]) obj).length);
                    }
                } else if (z2) {
                    stringBuffer.append(obj);
                } else {
                    stringBuffer.append(this.f1967o);
                    stringBuffer.append(m1434c(obj.getClass()));
                    stringBuffer.append(this.f1968p);
                }
            } else if (z2) {
                stringBuffer.append((Map) obj);
            } else {
                m1438b(stringBuffer, ((Map) obj).size());
            }
            m1436e(obj);
        } catch (Throwable th) {
            m1436e(obj);
            throw th;
        }
    }

    /* renamed from: b */
    public final void m1438b(StringBuffer stringBuffer, int i2) {
        stringBuffer.append(this.f1965m);
        stringBuffer.append(i2);
        stringBuffer.append(this.f1966n);
    }
}
