package p033L1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p044P1.C0433a;
import p044P1.C0434b;
import p044P1.InterfaceC0436d;
import p131s1.AbstractC1326c;

/* renamed from: L1.n */
/* loaded from: classes.dex */
public class C0366n {

    /* renamed from: a */
    public static volatile C0366n f1131a;

    /* renamed from: b */
    public static final Logger f1132b;

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    static {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p033L1.C0366n.<clinit>():void");
    }

    /* renamed from: i */
    public static void m1032i(String str, int i2, Throwable th) {
        AbstractC1326c.m3062e(str, "message");
        f1132b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: a */
    public void mo979a(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public AbstractC0364l mo933b(X509TrustManager x509TrustManager) {
        return new C0433a(mo938c(x509TrustManager));
    }

    /* renamed from: c */
    public InterfaceC0436d mo938c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC1326c.m3061d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C0434b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: d */
    public void mo934d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1326c.m3062e(list, "protocols");
    }

    /* renamed from: e */
    public void mo939e(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        AbstractC1326c.m3062e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i2);
    }

    /* renamed from: f */
    public String mo935f(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: g */
    public Object mo940g() {
        if (f1132b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo936h(String str) {
        AbstractC1326c.m3062e(str, "hostname");
        return true;
    }

    /* renamed from: j */
    public void mo941j(Object obj, String str) {
        AbstractC1326c.m3062e(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m1032i(str, 5, (Throwable) obj);
    }

    /* renamed from: k */
    public SSLContext mo975k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC1326c.m3061d(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: l */
    public SSLSocketFactory mo978l(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContextMo975k = mo975k();
            sSLContextMo975k.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo975k.getSocketFactory();
            AbstractC1326c.m3061d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e3) {
            throw new AssertionError("No System TLS: " + e3, e3);
        }
    }

    /* renamed from: m */
    public X509TrustManager mo976m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }
}
