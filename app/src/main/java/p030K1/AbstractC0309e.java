package p030K1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p050R1.C0482j;
import p131s1.AbstractC1326c;

/* renamed from: K1.e */
/* loaded from: classes.dex */
public abstract class AbstractC0309e {

    /* renamed from: a */
    public static final C0306b[] f955a;

    /* renamed from: b */
    public static final Map f956b;

    static {
        C0306b c0306b = new C0306b(C0306b.f936i, "");
        C0482j c0482j = C0306b.f933f;
        C0306b c0306b2 = new C0306b(c0482j, "GET");
        C0306b c0306b3 = new C0306b(c0482j, "POST");
        C0482j c0482j2 = C0306b.f934g;
        C0306b c0306b4 = new C0306b(c0482j2, "/");
        C0306b c0306b5 = new C0306b(c0482j2, "/index.html");
        C0482j c0482j3 = C0306b.f935h;
        C0306b c0306b6 = new C0306b(c0482j3, "http");
        C0306b c0306b7 = new C0306b(c0482j3, "https");
        C0482j c0482j4 = C0306b.f932e;
        C0306b[] c0306bArr = {c0306b, c0306b2, c0306b3, c0306b4, c0306b5, c0306b6, c0306b7, new C0306b(c0482j4, "200"), new C0306b(c0482j4, "204"), new C0306b(c0482j4, "206"), new C0306b(c0482j4, "304"), new C0306b(c0482j4, "400"), new C0306b(c0482j4, "404"), new C0306b(c0482j4, "500"), new C0306b("accept-charset", ""), new C0306b("accept-encoding", "gzip, deflate"), new C0306b("accept-language", ""), new C0306b("accept-ranges", ""), new C0306b("accept", ""), new C0306b("access-control-allow-origin", ""), new C0306b("age", ""), new C0306b("allow", ""), new C0306b("authorization", ""), new C0306b("cache-control", ""), new C0306b("content-disposition", ""), new C0306b("content-encoding", ""), new C0306b("content-language", ""), new C0306b("content-length", ""), new C0306b("content-location", ""), new C0306b("content-range", ""), new C0306b("content-type", ""), new C0306b("cookie", ""), new C0306b("date", ""), new C0306b("etag", ""), new C0306b("expect", ""), new C0306b("expires", ""), new C0306b("from", ""), new C0306b("host", ""), new C0306b("if-match", ""), new C0306b("if-modified-since", ""), new C0306b("if-none-match", ""), new C0306b("if-range", ""), new C0306b("if-unmodified-since", ""), new C0306b("last-modified", ""), new C0306b("link", ""), new C0306b("location", ""), new C0306b("max-forwards", ""), new C0306b("proxy-authenticate", ""), new C0306b("proxy-authorization", ""), new C0306b("range", ""), new C0306b("referer", ""), new C0306b("refresh", ""), new C0306b("retry-after", ""), new C0306b("server", ""), new C0306b("set-cookie", ""), new C0306b("strict-transport-security", ""), new C0306b("transfer-encoding", ""), new C0306b("user-agent", ""), new C0306b("vary", ""), new C0306b("via", ""), new C0306b("www-authenticate", "")};
        f955a = c0306bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i2 = 0; i2 < 61; i2++) {
            if (!linkedHashMap.containsKey(c0306bArr[i2].f938b)) {
                linkedHashMap.put(c0306bArr[i2].f938b, Integer.valueOf(i2));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC1326c.m3061d(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        f956b = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public static void m842a(C0482j c0482j) throws IOException {
        AbstractC1326c.m3062e(c0482j, "name");
        int iMo1197c = c0482j.mo1197c();
        for (int i2 = 0; i2 < iMo1197c; i2++) {
            byte b = (byte) 65;
            byte b3 = (byte) 90;
            byte bMo1200f = c0482j.mo1200f(i2);
            if (b <= bMo1200f && b3 >= bMo1200f) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0482j.m1204j()));
            }
        }
    }
}
