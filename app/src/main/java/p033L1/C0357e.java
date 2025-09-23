package p033L1;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p131s1.AbstractC1326c;

/* renamed from: L1.e */
/* loaded from: classes.dex */
public final class C0357e extends C0366n {

    /* renamed from: d */
    public static final boolean f1110d;

    /* renamed from: c */
    public final Provider f1111c = new BouncyCastleJsseProvider();

    static {
        boolean z2 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC0356d.class.getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        f1110d = z2;
    }

    @Override // p033L1.C0366n
    /* renamed from: d */
    public final void mo934d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1326c.m3062e(list, "protocols");
    }

    @Override // p033L1.C0366n
    /* renamed from: f */
    public final String mo935f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p033L1.C0366n
    /* renamed from: k */
    public final SSLContext mo975k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f1111c);
        AbstractC1326c.m3061d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p033L1.C0366n
    /* renamed from: m */
    public final X509TrustManager mo976m() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC1326c.m3059b(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String string = Arrays.toString(trustManagers);
            AbstractC1326c.m3061d(string, "java.util.Arrays.toString(this)");
            throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }
}
