package p021H1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p001A0.C0004c;
import p006C.AbstractC0075g;
import p011D1.C0109A;
import p011D1.C0111a;
import p011D1.C0115e;
import p011D1.C0119i;
import p011D1.C0121k;
import p011D1.C0123m;
import p011D1.C0124n;
import p011D1.C0126p;
import p011D1.C0130t;
import p011D1.C0132v;
import p011D1.C0133w;
import p011D1.C0134x;
import p011D1.EnumC0131u;
import p014E1.AbstractC0145b;
import p019G1.C0168b;
import p019G1.C0170d;
import p024I1.C0212f;
import p024I1.InterfaceC0210d;
import p027J1.C0223e;
import p030K1.AbstractC0310f;
import p030K1.AbstractC0313i;
import p030K1.C0303B;
import p030K1.C0320p;
import p030K1.C0321q;
import p030K1.C0327w;
import p030K1.C0328x;
import p033L1.AbstractC0364l;
import p033L1.C0366n;
import p044P1.C0435c;
import p050R1.C0482j;
import p050R1.C0488p;
import p050R1.C0489q;
import p050R1.C0496x;
import p093e2.AbstractC0901d;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1405c;

/* renamed from: H1.m */
/* loaded from: classes.dex */
public final class C0194m extends AbstractC0313i {

    /* renamed from: b */
    public Socket f712b;

    /* renamed from: c */
    public Socket f713c;

    /* renamed from: d */
    public C0123m f714d;

    /* renamed from: e */
    public EnumC0131u f715e;

    /* renamed from: f */
    public C0320p f716f;

    /* renamed from: g */
    public C0489q f717g;

    /* renamed from: h */
    public C0488p f718h;

    /* renamed from: i */
    public boolean f719i;

    /* renamed from: j */
    public boolean f720j;

    /* renamed from: k */
    public int f721k;

    /* renamed from: l */
    public int f722l;

    /* renamed from: m */
    public int f723m;

    /* renamed from: n */
    public int f724n;

    /* renamed from: o */
    public final ArrayList f725o;

    /* renamed from: p */
    public long f726p;

    /* renamed from: q */
    public final C0109A f727q;

    public C0194m(C0195n c0195n, C0109A c0109a) {
        AbstractC1326c.m3062e(c0195n, "connectionPool");
        AbstractC1326c.m3062e(c0109a, "route");
        this.f727q = c0109a;
        this.f724n = 1;
        this.f725o = new ArrayList();
        this.f726p = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public static void m506d(C0130t c0130t, C0109A c0109a, IOException iOException) {
        AbstractC1326c.m3062e(c0130t, "client");
        AbstractC1326c.m3062e(c0109a, "failedRoute");
        AbstractC1326c.m3062e(iOException, "failure");
        if (c0109a.f270b.type() != Proxy.Type.DIRECT) {
            C0111a c0111a = c0109a.f269a;
            c0111a.f288j.connectFailed(c0111a.f279a.m364g(), c0109a.f270b.address(), iOException);
        }
        C0004c c0004c = c0130t.f414A;
        synchronized (c0004c) {
            ((LinkedHashSet) c0004c.f7b).add(c0109a);
        }
    }

    @Override // p030K1.AbstractC0313i
    /* renamed from: a */
    public final synchronized void mo507a(C0320p c0320p, C0303B c0303b) {
        AbstractC1326c.m3062e(c0320p, "connection");
        AbstractC1326c.m3062e(c0303b, "settings");
        this.f724n = (c0303b.f928a & 16) != 0 ? c0303b.f929b[4] : Integer.MAX_VALUE;
    }

    @Override // p030K1.AbstractC0313i
    /* renamed from: b */
    public final void mo508b(C0327w c0327w) {
        c0327w.m862c(8, null);
    }

    /* renamed from: c */
    public final void m509c(int i2, int i3, int i4, int i5, boolean z2, C0190i c0190i) throws Throwable {
        C0109A c0109a;
        AbstractC1326c.m3062e(c0190i, "call");
        if (this.f715e != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f727q.f269a.f281c;
        C0183b c0183b = new C0183b(list);
        C0111a c0111a = this.f727q.f269a;
        if (c0111a.f284f == null) {
            if (!list.contains(C0119i.f334f)) {
                throw new C0196o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f727q.f269a.f279a.f376e;
            C0366n c0366n = C0366n.f1131a;
            if (!C0366n.f1131a.mo936h(str)) {
                throw new C0196o(new UnknownServiceException(AbstractC0075g.m238g("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c0111a.f280b.contains(EnumC0131u.H2_PRIOR_KNOWLEDGE)) {
            throw new C0196o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C0196o c0196o = null;
        do {
            try {
                C0109A c0109a2 = this.f727q;
                if (c0109a2.f269a.f284f != null && c0109a2.f270b.type() == Proxy.Type.HTTP) {
                    m511f(i2, i3, i4, c0190i);
                    if (this.f712b == null) {
                    }
                    c0109a = this.f727q;
                    if (c0109a.f269a.f284f == null && c0109a.f270b.type() == Proxy.Type.HTTP && this.f712b == null) {
                        throw new C0196o(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f726p = System.nanoTime();
                    return;
                }
                m510e(i2, i3, c0190i);
                m512g(c0183b, i5, c0190i);
                AbstractC1326c.m3062e(this.f727q.f271c, "inetSocketAddress");
                c0109a = this.f727q;
                if (c0109a.f269a.f284f == null) {
                }
                this.f726p = System.nanoTime();
                return;
            } catch (IOException e3) {
                Socket socket = this.f713c;
                if (socket != null) {
                    AbstractC0145b.m392e(socket);
                }
                Socket socket2 = this.f712b;
                if (socket2 != null) {
                    AbstractC0145b.m392e(socket2);
                }
                this.f713c = null;
                this.f712b = null;
                this.f717g = null;
                this.f718h = null;
                this.f714d = null;
                this.f715e = null;
                this.f716f = null;
                this.f724n = 1;
                AbstractC1326c.m3062e(this.f727q.f271c, "inetSocketAddress");
                if (c0196o == null) {
                    c0196o = new C0196o(e3);
                } else {
                    AbstractC0901d.m2291a(c0196o.f733b, e3);
                    c0196o.f732a = e3;
                }
                if (!z2) {
                    throw c0196o;
                }
                c0183b.f658c = true;
                if (!c0183b.f657b) {
                    throw c0196o;
                }
                if (e3 instanceof ProtocolException) {
                    throw c0196o;
                }
                if (e3 instanceof InterruptedIOException) {
                    throw c0196o;
                }
                if ((e3 instanceof SSLHandshakeException) && (e3.getCause() instanceof CertificateException)) {
                    throw c0196o;
                }
                if (e3 instanceof SSLPeerUnverifiedException) {
                    throw c0196o;
                }
            }
        } while (e3 instanceof SSLException);
        throw c0196o;
    }

    /* renamed from: e */
    public final void m510e(int i2, int i3, C0190i c0190i) throws IOException {
        Socket socket;
        int i4;
        C0109A c0109a = this.f727q;
        Proxy proxy = c0109a.f270b;
        C0111a c0111a = c0109a.f269a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i4 = AbstractC0191j.f705a[type.ordinal()]) == 1 || i4 == 2)) {
            socket = c0111a.f283e.createSocket();
            AbstractC1326c.m3059b(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f712b = socket;
        InetSocketAddress inetSocketAddress = this.f727q.f271c;
        AbstractC1326c.m3062e(c0190i, "call");
        AbstractC1326c.m3062e(inetSocketAddress, "inetSocketAddress");
        socket.setSoTimeout(i3);
        try {
            C0366n c0366n = C0366n.f1131a;
            C0366n.f1131a.mo939e(socket, this.f727q.f271c, i2);
            try {
                this.f717g = new C0489q(AbstractC0901d.m2315r0(socket));
                this.f718h = new C0488p(AbstractC0901d.m2313q0(socket));
            } catch (NullPointerException e3) {
                if (AbstractC1326c.m3058a(e3.getMessage(), "throw with null exception")) {
                    throw new IOException(e3);
                }
            }
        } catch (ConnectException e4) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f727q.f271c);
            connectException.initCause(e4);
            throw connectException;
        }
    }

    /* renamed from: f */
    public final void m511f(int i2, int i3, int i4, C0190i c0190i) throws IOException {
        C0121k c0121k = new C0121k(1);
        C0109A c0109a = this.f727q;
        C0126p c0126p = c0109a.f269a.f279a;
        AbstractC1326c.m3062e(c0126p, "url");
        c0121k.f352a = c0126p;
        c0121k.m341i("CONNECT", null);
        C0111a c0111a = c0109a.f269a;
        c0121k.m340h("Host", AbstractC0145b.m411x(c0111a.f279a, true));
        c0121k.m340h("Proxy-Connection", "Keep-Alive");
        c0121k.m340h("User-Agent", "okhttp/4.9.3");
        C0132v c0132vM334b = c0121k.m334b();
        C0004c c0004c = new C0004c(8);
        AbstractC0901d.m2293e("Proxy-Authenticate");
        AbstractC0901d.m2297g("OkHttp-Preemptive", "Proxy-Authenticate");
        c0004c.m34u("Proxy-Authenticate");
        c0004c.m28o("Proxy-Authenticate", "OkHttp-Preemptive");
        c0004c.m29p();
        c0111a.f287i.getClass();
        m510e(i2, i3, c0190i);
        String str = "CONNECT " + AbstractC0145b.m411x((C0126p) c0132vM334b.f452d, true) + " HTTP/1.1";
        C0489q c0489q = this.f717g;
        AbstractC1326c.m3059b(c0489q);
        C0488p c0488p = this.f718h;
        AbstractC1326c.m3059b(c0488p);
        C0197p c0197p = new C0197p(null, this, c0489q, c0488p);
        C0496x c0496xMo485a = c0489q.f1503c.mo485a();
        long j2 = i3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0496xMo485a.mo1212g(j2, timeUnit);
        c0488p.f1500c.mo480a().mo1212g(i4, timeUnit);
        c0197p.m530k((C0124n) c0132vM334b.f453e, str);
        c0197p.mo521b();
        C0133w c0133wMo524e = c0197p.mo524e(false);
        AbstractC1326c.m3059b(c0133wMo524e);
        c0133wMo524e.f455a = c0132vM334b;
        C0134x c0134xM369a = c0133wMo524e.m369a();
        long jM399l = AbstractC0145b.m399l(c0134xM369a);
        if (jM399l != -1) {
            C0223e c0223eM529j = c0197p.m529j(jM399l);
            AbstractC0145b.m409v(c0223eM529j, Integer.MAX_VALUE);
            c0223eM529j.close();
        }
        int i5 = c0134xM369a.f471d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(AbstractC0075g.m236e("Unexpected response code for CONNECT: ", i5));
            }
            c0111a.f287i.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c0489q.f1501a.m1175g() || !c0488p.f1498a.m1175g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* renamed from: g */
    public final void m512g(C0183b c0183b, int i2, C0190i c0190i) throws Throwable {
        C0111a c0111a = this.f727q.f269a;
        SSLSocketFactory sSLSocketFactory = c0111a.f284f;
        EnumC0131u enumC0131uM981C = EnumC0131u.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c0111a.f280b;
            EnumC0131u enumC0131u = EnumC0131u.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(enumC0131u)) {
                this.f713c = this.f712b;
                this.f715e = enumC0131uM981C;
                return;
            } else {
                this.f713c = this.f712b;
                this.f715e = enumC0131u;
                m517l(i2);
                return;
            }
        }
        AbstractC1326c.m3062e(c0190i, "call");
        C0111a c0111a2 = this.f727q.f269a;
        SSLSocketFactory sSLSocketFactory2 = c0111a2.f284f;
        SSLSocket sSLSocket = null;
        String strMo935f = null;
        try {
            AbstractC1326c.m3059b(sSLSocketFactory2);
            Socket socket = this.f712b;
            C0126p c0126p = c0111a2.f279a;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, c0126p.f376e, c0126p.f377f, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                C0119i c0119iM479a = c0183b.m479a(sSLSocket2);
                if (c0119iM479a.f336b) {
                    C0366n c0366n = C0366n.f1131a;
                    C0366n.f1131a.mo934d(sSLSocket2, c0111a2.f279a.f376e, c0111a2.f280b);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                AbstractC1326c.m3061d(session, "sslSocketSession");
                C0123m c0123mM980B = AbstractC0364l.m980B(session);
                HostnameVerifier hostnameVerifier = c0111a2.f285g;
                AbstractC1326c.m3059b(hostnameVerifier);
                if (hostnameVerifier.verify(c0111a2.f279a.f376e, session)) {
                    C0115e c0115e = c0111a2.f286h;
                    AbstractC1326c.m3059b(c0115e);
                    this.f714d = new C0123m(c0123mM980B.f359b, c0123mM980B.f360c, c0123mM980B.f361d, new C0192k(c0115e, c0123mM980B, c0111a2));
                    AbstractC1326c.m3062e(c0111a2.f279a.f376e, "hostname");
                    Iterator it = c0115e.f307a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (c0119iM479a.f336b) {
                        C0366n c0366n2 = C0366n.f1131a;
                        strMo935f = C0366n.f1131a.mo935f(sSLSocket2);
                    }
                    this.f713c = sSLSocket2;
                    this.f717g = new C0489q(AbstractC0901d.m2315r0(sSLSocket2));
                    this.f718h = new C0488p(AbstractC0901d.m2313q0(sSLSocket2));
                    if (strMo935f != null) {
                        enumC0131uM981C = AbstractC0364l.m981C(strMo935f);
                    }
                    this.f715e = enumC0131uM981C;
                    C0366n c0366n3 = C0366n.f1131a;
                    C0366n.f1131a.mo979a(sSLSocket2);
                    if (this.f715e == EnumC0131u.HTTP_2) {
                        m517l(i2);
                        return;
                    }
                    return;
                }
                List listM350a = c0123mM980B.m350a();
                if (listM350a.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0111a2.f279a.f376e + " not verified (no certificates)");
                }
                Object obj = listM350a.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c0111a2.f279a.f376e);
                sb.append(" not verified:\n              |    certificate: ");
                C0115e c0115e2 = C0115e.f306c;
                sb.append(AbstractC0901d.m2298g0(x509Certificate));
                sb.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                AbstractC1326c.m3061d(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                List listM1098a = C0435c.m1098a(x509Certificate, 7);
                List listM1098a2 = C0435c.m1098a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(listM1098a2.size() + listM1098a.size());
                arrayList.addAll(listM1098a);
                arrayList.addAll(listM1098a2);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC1405c.m3171L(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C0366n c0366n4 = C0366n.f1131a;
                    C0366n.f1131a.mo979a(sSLSocket);
                }
                if (sSLSocket != null) {
                    AbstractC0145b.m392e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m513h(p011D1.C0111a r10, java.util.ArrayList r11) {
        /*
            r9 = this;
            java.lang.String r0 = "hostname"
            byte[] r1 = p014E1.AbstractC0145b.f495a
            java.util.ArrayList r1 = r9.f725o
            int r1 = r1.size()
            int r2 = r9.f724n
            r3 = 0
            if (r1 >= r2) goto Le4
            boolean r1 = r9.f719i
            if (r1 == 0) goto L15
            goto Le4
        L15:
            D1.A r1 = r9.f727q
            D1.a r2 = r1.f269a
            boolean r2 = r2.m317a(r10)
            if (r2 != 0) goto L21
            goto Le4
        L21:
            D1.p r2 = r10.f279a
            java.lang.String r4 = r2.f376e
            D1.a r5 = r1.f269a
            D1.p r6 = r5.f279a
            java.lang.String r6 = r6.f376e
            boolean r4 = p131s1.AbstractC1326c.m3058a(r4, r6)
            r6 = 1
            if (r4 == 0) goto L33
            return r6
        L33:
            K1.p r4 = r9.f716f
            if (r4 != 0) goto L39
            goto Le4
        L39:
            if (r11 == 0) goto Le4
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L43
            goto Le4
        L43:
            java.util.Iterator r11 = r11.iterator()
        L47:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto Le4
            java.lang.Object r4 = r11.next()
            D1.A r4 = (p011D1.C0109A) r4
            java.net.Proxy r7 = r4.f270b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto L47
            java.net.Proxy r7 = r1.f270b
            java.net.Proxy$Type r7 = r7.type()
            if (r7 != r8) goto L47
            java.net.InetSocketAddress r4 = r4.f271c
            java.net.InetSocketAddress r7 = r1.f271c
            boolean r4 = p131s1.AbstractC1326c.m3058a(r7, r4)
            if (r4 == 0) goto L47
            P1.c r11 = p044P1.C0435c.f1323a
            javax.net.ssl.HostnameVerifier r1 = r10.f285g
            if (r1 == r11) goto L76
            goto Le4
        L76:
            byte[] r11 = p014E1.AbstractC0145b.f495a
            D1.p r11 = r5.f279a
            int r1 = r11.f377f
            int r4 = r2.f377f
            if (r4 == r1) goto L81
            goto Le4
        L81:
            java.lang.String r11 = r11.f376e
            java.lang.String r1 = r2.f376e
            boolean r11 = p131s1.AbstractC1326c.m3058a(r1, r11)
            if (r11 == 0) goto L8c
            goto Lac
        L8c:
            boolean r11 = r9.f720j
            if (r11 != 0) goto Le4
            D1.m r11 = r9.f714d
            if (r11 == 0) goto Le4
            java.util.List r11 = r11.m350a()
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto Le4
            java.lang.Object r11 = r11.get(r3)
            if (r11 == 0) goto Ldc
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11
            boolean r11 = p044P1.C0435c.m1100c(r1, r11)
            if (r11 == 0) goto Le4
        Lac:
            D1.e r10 = r10.f286h     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            p131s1.AbstractC1326c.m3059b(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            D1.m r11 = r9.f714d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            p131s1.AbstractC1326c.m3059b(r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.util.List r11 = r11.m350a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            p131s1.AbstractC1326c.m3062e(r1, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.lang.String r0 = "peerCertificates"
            p131s1.AbstractC1326c.m3062e(r11, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.util.Set r10 = r10.f307a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.util.Iterator r10 = r10.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            boolean r11 = r10.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            if (r11 != 0) goto Lcf
            return r6
        Lcf:
            java.lang.Object r10 = r10.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            r10.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.lang.ClassCastException r10 = new java.lang.ClassCastException     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            r10.<init>()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            throw r10     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
        Ldc:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r10.<init>(r11)
            throw r10
        Le4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p021H1.C0194m.m513h(D1.a, java.util.ArrayList):boolean");
    }

    /* renamed from: i */
    public final boolean m514i(boolean z2) throws SocketException {
        long j2;
        byte[] bArr = AbstractC0145b.f495a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f712b;
        AbstractC1326c.m3059b(socket);
        Socket socket2 = this.f713c;
        AbstractC1326c.m3059b(socket2);
        AbstractC1326c.m3059b(this.f717g);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C0320p c0320p = this.f716f;
        if (c0320p != null) {
            synchronized (c0320p) {
                if (c0320p.f990f) {
                    return false;
                }
                if (c0320p.f999o < c0320p.f998n) {
                    if (jNanoTime >= c0320p.f1000p) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = jNanoTime - this.f726p;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.m1221g();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: j */
    public final InterfaceC0210d m515j(C0130t c0130t, C0212f c0212f) throws SocketException {
        AbstractC1326c.m3062e(c0130t, "client");
        Socket socket = this.f713c;
        AbstractC1326c.m3059b(socket);
        C0489q c0489q = this.f717g;
        AbstractC1326c.m3059b(c0489q);
        C0488p c0488p = this.f718h;
        AbstractC1326c.m3059b(c0488p);
        C0320p c0320p = this.f716f;
        if (c0320p != null) {
            return new C0321q(c0130t, this, c0212f, c0320p);
        }
        int i2 = c0212f.f774h;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0489q.f1503c.mo485a().mo1212g(i2, timeUnit);
        c0488p.f1500c.mo480a().mo1212g(c0212f.f775i, timeUnit);
        return new C0197p(c0130t, this, c0489q, c0488p);
    }

    /* renamed from: k */
    public final synchronized void m516k() {
        this.f719i = true;
    }

    /* renamed from: l */
    public final void m517l(int i2) throws SocketException {
        Socket socket = this.f713c;
        AbstractC1326c.m3059b(socket);
        C0489q c0489q = this.f717g;
        AbstractC1326c.m3059b(c0489q);
        C0488p c0488p = this.f718h;
        AbstractC1326c.m3059b(c0488p);
        socket.setSoTimeout(0);
        C0170d c0170d = C0170d.f619h;
        C0197p c0197p = new C0197p(c0170d);
        String str = this.f727q.f269a.f279a.f376e;
        AbstractC1326c.m3062e(str, "peerName");
        c0197p.f735b = socket;
        c0197p.f736c = AbstractC0145b.f501g + ' ' + str;
        c0197p.f737d = c0489q;
        c0197p.f738e = c0488p;
        c0197p.f739f = this;
        c0197p.f734a = i2;
        C0320p c0320p = new C0320p(c0197p);
        this.f716f = c0320p;
        C0303B c0303b = C0320p.f984A;
        this.f724n = (c0303b.f928a & 16) != 0 ? c0303b.f929b[4] : Integer.MAX_VALUE;
        C0328x c0328x = c0320p.f1008x;
        synchronized (c0328x) {
            try {
                if (c0328x.f1056c) {
                    throw new IOException("closed");
                }
                Logger logger = C0328x.f1053f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC0145b.m397j(">> CONNECTION " + AbstractC0310f.f957a.mo1198d(), new Object[0]));
                }
                C0488p c0488p2 = c0328x.f1058e;
                C0482j c0482j = AbstractC0310f.f957a;
                c0488p2.getClass();
                AbstractC1326c.m3062e(c0482j, "byteString");
                if (c0488p2.f1499b) {
                    throw new IllegalStateException("closed");
                }
                c0488p2.f1498a.m1190v(c0482j);
                c0488p2.m1218g();
                c0328x.f1058e.flush();
            } finally {
            }
        }
        C0328x c0328x2 = c0320p.f1008x;
        C0303B c0303b2 = c0320p.f1001q;
        synchronized (c0328x2) {
            try {
                AbstractC1326c.m3062e(c0303b2, "settings");
                if (c0328x2.f1056c) {
                    throw new IOException("closed");
                }
                c0328x2.m873i(0, Integer.bitCount(c0303b2.f928a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    boolean z2 = true;
                    if (((1 << i3) & c0303b2.f928a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i4 = i3 != 4 ? i3 != 7 ? i3 : 4 : 3;
                        C0488p c0488p3 = c0328x2.f1058e;
                        if (c0488p3.f1499b) {
                            throw new IllegalStateException("closed");
                        }
                        c0488p3.f1498a.m1168C(i4);
                        c0488p3.m1218g();
                        c0328x2.f1058e.m1220i(c0303b2.f929b[i3]);
                    }
                    i3++;
                }
                c0328x2.f1058e.flush();
            } finally {
            }
        }
        if (c0320p.f1001q.m829a() != 65535) {
            c0320p.f1008x.m878n(0, r0 - 65535);
        }
        c0170d.m475e().m468c(new C0168b(c0320p.f1009y, c0320p.f987c, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C0109A c0109a = this.f727q;
        sb.append(c0109a.f269a.f279a.f376e);
        sb.append(':');
        sb.append(c0109a.f269a.f279a.f377f);
        sb.append(", proxy=");
        sb.append(c0109a.f270b);
        sb.append(" hostAddress=");
        sb.append(c0109a.f271c);
        sb.append(" cipherSuite=");
        C0123m c0123m = this.f714d;
        if (c0123m == null || (obj = c0123m.f360c) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f715e);
        sb.append('}');
        return sb.toString();
    }
}
