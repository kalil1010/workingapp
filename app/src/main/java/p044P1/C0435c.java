package p044P1;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p110k1.C1215q;
import p131s1.AbstractC1326c;

/* renamed from: P1.c */
/* loaded from: classes.dex */
public final class C0435c implements HostnameVerifier {

    /* renamed from: a */
    public static final C0435c f1323a = new C0435c();

    /* renamed from: a */
    public static List m1098a(X509Certificate x509Certificate, int i2) throws CertificateParsingException {
        Object obj;
        C1215q c1215q = C1215q.f4904a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && AbstractC1326c.m3058a(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return c1215q;
    }

    /* renamed from: b */
    public static boolean m1099b(String str) {
        int i2;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + length2 + " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < length2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    i2 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i2 = 3;
                } else {
                    int i4 = i3 + 1;
                    char cCharAt2 = i4 < length2 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i3 = i4;
                    } else {
                        j2 += 4;
                        i3 += 2;
                    }
                }
                j2 += i2;
            }
            i3++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1100c(java.lang.String r11, java.security.cert.X509Certificate r12) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p044P1.C0435c.m1100c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        AbstractC1326c.m3062e(str, "host");
        AbstractC1326c.m3062e(sSLSession, "session");
        if (m1099b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                if (certificate != null) {
                    return m1100c(str, (X509Certificate) certificate);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
