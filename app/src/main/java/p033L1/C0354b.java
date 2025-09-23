package p033L1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p044P1.InterfaceC0436d;
import p131s1.AbstractC1326c;

/* renamed from: L1.b */
/* loaded from: classes.dex */
public final class C0354b implements InterfaceC0436d {

    /* renamed from: a */
    public final X509TrustManager f1092a;

    /* renamed from: b */
    public final Method f1093b;

    public C0354b(X509TrustManager x509TrustManager, Method method) {
        this.f1092a = x509TrustManager;
        this.f1093b = method;
    }

    @Override // p044P1.InterfaceC0436d
    /* renamed from: a */
    public final X509Certificate mo937a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.f1093b.invoke(this.f1092a, x509Certificate);
            if (objInvoke != null) {
                return ((TrustAnchor) objInvoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e3) {
            throw new AssertionError("unable to get issues and signature", e3);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0354b)) {
            return false;
        }
        C0354b c0354b = (C0354b) obj;
        return AbstractC1326c.m3058a(this.f1092a, c0354b.f1092a) && AbstractC1326c.m3058a(this.f1093b, c0354b.f1093b);
    }

    public final int hashCode() {
        X509TrustManager x509TrustManager = this.f1092a;
        int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
        Method method = this.f1093b;
        return iHashCode + (method != null ? method.hashCode() : 0);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f1092a + ", findByIssuerAndSignatureMethod=" + this.f1093b + ")";
    }
}
