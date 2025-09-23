package p036M1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p033L1.AbstractC0364l;
import p131s1.AbstractC1326c;

/* renamed from: M1.b */
/* loaded from: classes.dex */
public final class C0399b extends AbstractC0364l {

    /* renamed from: f */
    public final X509TrustManager f1274f;

    /* renamed from: g */
    public final X509TrustManagerExtensions f1275g;

    public C0399b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f1274f = x509TrustManager;
        this.f1275g = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0399b) && ((C0399b) obj).f1274f == this.f1274f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1274f);
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: s */
    public final List mo1031s(List list, String str) throws CertificateException, SSLPeerUnverifiedException {
        AbstractC1326c.m3062e(list, "chain");
        AbstractC1326c.m3062e(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.f1275g.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            AbstractC1326c.m3061d(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e3) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
            sSLPeerUnverifiedException.initCause(e3);
            throw sSLPeerUnverifiedException;
        }
    }
}
