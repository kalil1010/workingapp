package p074Z1;

/* renamed from: Z1.d */
/* loaded from: classes.dex */
public abstract class AbstractC0621d {

    /* renamed from: a */
    public static final String f1938a;

    /* renamed from: b */
    public static final String f1939b;

    /* renamed from: c */
    public static final String f1940c;

    /* renamed from: d */
    public static final String f1941d;

    static {
        m1429d("awt.toolkit");
        m1429d("file.encoding");
        m1429d("file.separator");
        m1429d("java.awt.fonts");
        m1429d("java.awt.graphicsenv");
        m1429d("java.awt.headless");
        m1429d("java.awt.printerjob");
        m1429d("java.class.path");
        m1429d("java.class.version");
        m1429d("java.compiler");
        m1429d("java.endorsed.dirs");
        m1429d("java.ext.dirs");
        m1429d("java.home");
        m1429d("java.io.tmpdir");
        m1429d("java.library.path");
        m1429d("java.runtime.name");
        m1429d("java.runtime.version");
        m1429d("java.specification.name");
        m1429d("java.specification.vendor");
        String strM1429d = m1429d("java.specification.version");
        f1938a = strM1429d;
        EnumC0620c[] enumC0620cArr = EnumC0620c.f1936b;
        if (!"0.9".equals(strM1429d) && !"1.1".equals(strM1429d) && !"1.2".equals(strM1429d) && !"1.3".equals(strM1429d) && !"1.4".equals(strM1429d) && !"1.5".equals(strM1429d) && !"1.6".equals(strM1429d) && !"1.7".equals(strM1429d) && !"1.8".equals(strM1429d) && !"9".equals(strM1429d) && !"10".equals(strM1429d) && !"11".equals(strM1429d) && strM1429d != null) {
            float fM1425a = EnumC0620c.m1425a(strM1429d);
            if (fM1425a - 1.0d < 1.0d) {
                int iMax = Math.max(strM1429d.indexOf(46), strM1429d.indexOf(44));
                int i2 = (Float.parseFloat(strM1429d.substring(iMax + 1, Math.max(strM1429d.length(), strM1429d.indexOf(44, iMax)))) > 0.9f ? 1 : (Float.parseFloat(strM1429d.substring(iMax + 1, Math.max(strM1429d.length(), strM1429d.indexOf(44, iMax)))) == 0.9f ? 0 : -1));
            } else {
                int i3 = (fM1425a > 10.0f ? 1 : (fM1425a == 10.0f ? 0 : -1));
            }
        }
        m1429d("java.util.prefs.PreferencesFactory");
        m1429d("java.vendor");
        m1429d("java.vendor.url");
        m1429d("java.version");
        m1429d("java.vm.info");
        m1429d("java.vm.name");
        m1429d("java.vm.specification.name");
        m1429d("java.vm.specification.vendor");
        m1429d("java.vm.specification.version");
        m1429d("java.vm.vendor");
        m1429d("java.vm.version");
        f1939b = m1429d("line.separator");
        m1429d("os.arch");
        String strM1429d2 = m1429d("os.name");
        f1940c = strM1429d2;
        f1941d = m1429d("os.version");
        m1429d("path.separator");
        m1429d(m1429d("user.country") == null ? "user.region" : "user.country");
        m1429d("user.dir");
        m1429d("user.home");
        m1429d("user.language");
        m1429d("user.name");
        m1429d("user.timezone");
        m1426a("1.1");
        m1426a("1.2");
        m1426a("1.3");
        m1426a("1.4");
        m1426a("1.5");
        m1426a("1.6");
        m1426a("1.7");
        m1426a("1.8");
        m1426a("9");
        m1426a("9");
        m1426a("10");
        m1426a("11");
        m1430e(strM1429d2, "AIX");
        m1430e(strM1429d2, "HP-UX");
        m1428c("OS/400");
        m1430e(strM1429d2, "Irix");
        if (!m1430e(strM1429d2, "Linux") && !m1430e(strM1429d2, "LINUX")) {
        }
        m1428c("Mac");
        m1430e(strM1429d2, "Mac OS X");
        m1427b("10.0");
        m1427b("10.1");
        m1427b("10.2");
        m1427b("10.3");
        m1427b("10.4");
        m1427b("10.5");
        m1427b("10.6");
        m1427b("10.7");
        m1427b("10.8");
        m1427b("10.9");
        m1427b("10.10");
        m1427b("10.11");
        m1430e(strM1429d2, "FreeBSD");
        m1430e(strM1429d2, "OpenBSD");
        m1430e(strM1429d2, "NetBSD");
        m1428c("OS/2");
        m1430e(strM1429d2, "Solaris");
        m1430e(strM1429d2, "SunOS");
        m1428c("Windows");
        m1428c("Windows 2000");
        m1428c("Windows 2003");
        m1428c("Windows Server 2008");
        m1428c("Windows Server 2012");
        m1428c("Windows 95");
        m1428c("Windows 98");
        m1428c("Windows Me");
        m1428c("Windows NT");
        m1428c("Windows XP");
        m1428c("Windows Vista");
        m1428c("Windows 7");
        m1428c("Windows 8");
        m1428c("Windows 10");
        m1428c("z/OS");
    }

    /* renamed from: a */
    public static void m1426a(String str) {
        String str2 = f1938a;
        if (str2 == null) {
            return;
        }
        str2.startsWith(str);
    }

    /* renamed from: b */
    public static void m1427b(String str) {
        String str2;
        String str3 = f1940c;
        if (str3 == null || (str2 = f1941d) == null || !str3.startsWith("Mac OS X") || AbstractC0618a.m1419c(str2)) {
            return;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        for (int i2 = 0; i2 < Math.min(strArrSplit.length, strArrSplit2.length) && strArrSplit[i2].equals(strArrSplit2[i2]); i2++) {
        }
    }

    /* renamed from: c */
    public static void m1428c(String str) {
        m1430e(f1940c, str);
    }

    /* renamed from: d */
    public static String m1429d(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m1430e(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }
}
