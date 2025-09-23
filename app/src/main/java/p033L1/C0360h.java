package p033L1;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import p011D1.EnumC0131u;
import p110k1.AbstractC1209k;
import p131s1.AbstractC1326c;

/* renamed from: L1.h */
/* loaded from: classes.dex */
public final class C0360h extends C0366n {

    /* renamed from: d */
    public static final boolean f1113d;

    /* renamed from: c */
    public final Provider f1114c;

    static {
        boolean z2 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC0358f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC0358f.m977a()) {
                    z2 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f1113d = z2;
    }

    public C0360h() {
        Provider providerNewProvider = Conscrypt.newProvider();
        AbstractC1326c.m3061d(providerNewProvider, "Conscrypt.newProvider()");
        this.f1114c = providerNewProvider;
    }

    @Override // p033L1.C0366n
    /* renamed from: d */
    public final void mo934d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1326c.m3062e(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((EnumC0131u) obj) != EnumC0131u.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1209k.m2850x0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EnumC0131u) it.next()).f448a);
            }
            Object[] array = arrayList2.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    @Override // p033L1.C0366n
    /* renamed from: f */
    public final String mo935f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p033L1.C0366n
    /* renamed from: k */
    public final SSLContext mo975k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f1114c);
        AbstractC1326c.m3061d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p033L1.C0366n
    /* renamed from: l */
    public final SSLSocketFactory mo978l(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContextMo975k = mo975k();
        sSLContextMo975k.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo975k.getSocketFactory();
        AbstractC1326c.m3061d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p033L1.C0366n
    /* renamed from: m */
    public final X509TrustManager mo976m() throws NoSuchAlgorithmException, KeyStoreException {
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
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, C0359g.f1112a);
        return x509TrustManager;
    }
}
