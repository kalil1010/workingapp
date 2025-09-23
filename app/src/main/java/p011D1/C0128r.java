package p011D1;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import p033L1.AbstractC0364l;
import p131s1.AbstractC1326c;
import p140v1.C1378a;
import p140v1.C1380c;
import p149y1.AbstractC1411i;

/* renamed from: D1.r */
/* loaded from: classes.dex */
public final class C0128r {

    /* renamed from: c */
    public static final Pattern f381c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d */
    public static final Pattern f382d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f383a;

    /* renamed from: b */
    public final String[] f384b;

    public C0128r(String str, String[] strArr) {
        this.f383a = str;
        this.f384b = strArr;
    }

    /* renamed from: a */
    public final Charset m365a(Charset charset) {
        String str;
        String[] strArr = this.f384b;
        C1378a c1378aM1004j0 = AbstractC0364l.m1004j0(new C1380c(0, strArr.length - 1, 1), 2);
        int i2 = c1378aM1004j0.f5989a;
        int i3 = c1378aM1004j0.f5990b;
        int i4 = c1378aM1004j0.f5991c;
        if (i4 < 0 ? i2 < i3 : i2 > i3) {
            str = null;
            break;
        }
        while (!AbstractC1411i.m3174O(strArr[i2], "charset")) {
            if (i2 == i3) {
                str = null;
                break;
            }
            i2 += i4;
        }
        str = strArr[i2 + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0128r) && AbstractC1326c.m3058a(((C0128r) obj).f383a, this.f383a);
    }

    public final int hashCode() {
        return this.f383a.hashCode();
    }

    public final String toString() {
        return this.f383a;
    }
}
