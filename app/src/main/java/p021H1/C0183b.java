package p021H1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p011D1.C0116f;
import p011D1.C0117g;
import p011D1.C0118h;
import p011D1.C0119i;
import p014E1.AbstractC0145b;
import p113l1.C1228a;
import p131s1.AbstractC1326c;

/* renamed from: H1.b */
/* loaded from: classes.dex */
public final class C0183b {

    /* renamed from: a */
    public int f656a;

    /* renamed from: b */
    public boolean f657b;

    /* renamed from: c */
    public boolean f658c;

    /* renamed from: d */
    public final List f659d;

    public C0183b(List list) {
        AbstractC1326c.m3062e(list, "connectionSpecs");
        this.f659d = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: a */
    public final C0119i m479a(SSLSocket sSLSocket) throws UnknownServiceException, CloneNotSupportedException {
        C0119i c0119i;
        int i2;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i3 = this.f656a;
        List list = this.f659d;
        int size = list.size();
        while (true) {
            if (i3 >= size) {
                c0119i = null;
                break;
            }
            c0119i = (C0119i) list.get(i3);
            if (c0119i.m331b(sSLSocket)) {
                this.f656a = i3 + 1;
                break;
            }
            i3++;
        }
        if (c0119i == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f658c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC1326c.m3059b(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            AbstractC1326c.m3061d(string, "java.util.Arrays.toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i4 = this.f656a;
        int size2 = list.size();
        while (true) {
            i2 = 0;
            if (i4 >= size2) {
                z2 = false;
                break;
            }
            if (((C0119i) list.get(i4)).m331b(sSLSocket)) {
                z2 = true;
                break;
            }
            i4++;
        }
        this.f657b = z2;
        boolean z3 = this.f658c;
        String[] strArr = c0119i.f337c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            AbstractC1326c.m3061d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = AbstractC0145b.m404q(enabledCipherSuites2, strArr, C0117g.f309b);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = c0119i.f338d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            AbstractC1326c.m3061d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = AbstractC0145b.m404q(enabledProtocols3, r6, C1228a.f4933b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC1326c.m3061d(supportedCipherSuites, "supportedCipherSuites");
        C0116f c0116f = C0117g.f309b;
        byte[] bArr = AbstractC0145b.f495a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (c0116f.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i2++;
        }
        if (z3 && i2 != -1) {
            AbstractC1326c.m3061d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i2];
            AbstractC1326c.m3061d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC1326c.m3061d(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C0118h c0118h = new C0118h();
        c0118h.f329a = c0119i.f335a;
        c0118h.f331c = strArr;
        c0118h.f332d = r6;
        c0118h.f330b = c0119i.f336b;
        AbstractC1326c.m3061d(enabledCipherSuites, "cipherSuitesIntersection");
        c0118h.m327c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        AbstractC1326c.m3061d(enabledProtocols, "tlsVersionsIntersection");
        c0118h.m329e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C0119i c0119iM325a = c0118h.m325a();
        if (c0119iM325a.m332c() != null) {
            sSLSocket.setEnabledProtocols(c0119iM325a.f338d);
        }
        if (c0119iM325a.m330a() != null) {
            sSLSocket.setEnabledCipherSuites(c0119iM325a.f337c);
        }
        return c0119i;
    }
}
