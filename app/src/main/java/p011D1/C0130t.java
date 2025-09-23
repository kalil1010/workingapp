package p011D1;

import java.net.ProtocolException;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p001A0.C0004c;
import p002A1.C0019a;
import p014E1.AbstractC0145b;
import p019G1.C0170d;
import p021H1.C0190i;
import p033L1.AbstractC0364l;
import p033L1.C0366n;
import p039N1.C0423a;
import p044P1.C0435c;
import p047Q1.C0464f;
import p055T0.C0511e;
import p110k1.AbstractC1213o;
import p131s1.AbstractC1326c;

/* renamed from: D1.t */
/* loaded from: classes.dex */
public final class C0130t implements Cloneable {

    /* renamed from: B */
    public static final List f412B = AbstractC0145b.m400m(EnumC0131u.HTTP_2, EnumC0131u.HTTP_1_1);

    /* renamed from: C */
    public static final List f413C = AbstractC0145b.m400m(C0119i.f333e, C0119i.f334f);

    /* renamed from: A */
    public final C0004c f414A;

    /* renamed from: a */
    public final C0121k f415a;

    /* renamed from: b */
    public final C0004c f416b;

    /* renamed from: c */
    public final List f417c;

    /* renamed from: d */
    public final List f418d;

    /* renamed from: e */
    public final C0511e f419e;

    /* renamed from: f */
    public final boolean f420f;

    /* renamed from: g */
    public final C0112b f421g;

    /* renamed from: h */
    public final boolean f422h;

    /* renamed from: i */
    public final boolean f423i;

    /* renamed from: j */
    public final C0112b f424j;

    /* renamed from: k */
    public final C0112b f425k;

    /* renamed from: l */
    public final ProxySelector f426l;

    /* renamed from: m */
    public final C0112b f427m;

    /* renamed from: n */
    public final SocketFactory f428n;

    /* renamed from: o */
    public final SSLSocketFactory f429o;

    /* renamed from: p */
    public final X509TrustManager f430p;

    /* renamed from: q */
    public final List f431q;

    /* renamed from: r */
    public final List f432r;

    /* renamed from: s */
    public final C0435c f433s;

    /* renamed from: t */
    public final C0115e f434t;

    /* renamed from: u */
    public final AbstractC0364l f435u;

    /* renamed from: v */
    public final int f436v;

    /* renamed from: w */
    public final int f437w;

    /* renamed from: x */
    public final int f438x;

    /* renamed from: y */
    public final int f439y;

    /* renamed from: z */
    public final long f440z;

    public C0130t(C0129s c0129s) throws NoSuchAlgorithmException, KeyStoreException {
        this.f415a = c0129s.f386a;
        this.f416b = c0129s.f387b;
        this.f417c = AbstractC0145b.m412y(c0129s.f388c);
        this.f418d = AbstractC0145b.m412y(c0129s.f389d);
        this.f419e = c0129s.f390e;
        this.f420f = c0129s.f391f;
        this.f421g = c0129s.f392g;
        this.f422h = c0129s.f393h;
        this.f423i = c0129s.f394i;
        this.f424j = c0129s.f395j;
        this.f425k = c0129s.f396k;
        ProxySelector proxySelector = c0129s.f397l;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f426l = proxySelector == null ? C0423a.f1311a : proxySelector;
        this.f427m = c0129s.f398m;
        this.f428n = c0129s.f399n;
        List list = c0129s.f402q;
        this.f431q = list;
        this.f432r = c0129s.f403r;
        this.f433s = c0129s.f404s;
        this.f436v = c0129s.f407v;
        this.f437w = c0129s.f408w;
        this.f438x = c0129s.f409x;
        this.f439y = c0129s.f410y;
        this.f440z = c0129s.f411z;
        C0004c c0004c = c0129s.f385A;
        this.f414A = c0004c == null ? new C0004c(10) : c0004c;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C0119i) it.next()).f335a) {
                    SSLSocketFactory sSLSocketFactory = c0129s.f400o;
                    if (sSLSocketFactory != null) {
                        this.f429o = sSLSocketFactory;
                        AbstractC0364l abstractC0364l = c0129s.f406u;
                        AbstractC1326c.m3059b(abstractC0364l);
                        this.f435u = abstractC0364l;
                        X509TrustManager x509TrustManager = c0129s.f401p;
                        AbstractC1326c.m3059b(x509TrustManager);
                        this.f430p = x509TrustManager;
                        C0115e c0115e = c0129s.f405t;
                        c0115e.getClass();
                        this.f434t = AbstractC1326c.m3058a(c0115e.f308b, abstractC0364l) ? c0115e : new C0115e(c0115e.f307a, abstractC0364l);
                    } else {
                        C0366n c0366n = C0366n.f1131a;
                        X509TrustManager x509TrustManagerMo976m = C0366n.f1131a.mo976m();
                        this.f430p = x509TrustManagerMo976m;
                        this.f429o = C0366n.f1131a.mo978l(x509TrustManagerMo976m);
                        AbstractC0364l abstractC0364lMo933b = C0366n.f1131a.mo933b(x509TrustManagerMo976m);
                        this.f435u = abstractC0364lMo933b;
                        C0115e c0115e2 = c0129s.f405t;
                        c0115e2.getClass();
                        this.f434t = AbstractC1326c.m3058a(c0115e2.f308b, abstractC0364lMo933b) ? c0115e2 : new C0115e(c0115e2.f307a, abstractC0364lMo933b);
                    }
                }
            }
            this.f429o = null;
            this.f435u = null;
            this.f430p = null;
            this.f434t = C0115e.f306c;
        } else {
            this.f429o = null;
            this.f435u = null;
            this.f430p = null;
            this.f434t = C0115e.f306c;
        }
        List list2 = this.f417c;
        if (list2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
        List list3 = this.f418d;
        if (list3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        X509TrustManager x509TrustManager2 = this.f430p;
        AbstractC0364l abstractC0364l2 = this.f435u;
        SSLSocketFactory sSLSocketFactory2 = this.f429o;
        List list4 = this.f431q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C0119i) it2.next()).f335a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (abstractC0364l2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (!(sSLSocketFactory2 == null)) {
            throw new IllegalStateException("Check failed.");
        }
        if (abstractC0364l2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC1326c.m3058a(this.f434t, C0115e.f306c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: a */
    public final C0464f m366a(C0132v c0132v, C0004c c0004c) {
        AbstractC1326c.m3062e(c0132v, "request");
        AbstractC1326c.m3062e(c0004c, "listener");
        C0170d c0170d = C0170d.f619h;
        Random random = new Random();
        int i2 = this.f439y;
        C0464f c0464f = new C0464f(c0170d, c0132v, c0004c, random, i2, this.f440z);
        if (((C0124n) c0132v.f453e).m351a("Sec-WebSocket-Extensions") != null) {
            c0464f.m1148c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"));
            return c0464f;
        }
        C0129s c0129s = new C0129s();
        c0129s.f386a = this.f415a;
        c0129s.f387b = this.f416b;
        AbstractC1213o.m2851y0(c0129s.f388c, this.f417c);
        AbstractC1213o.m2851y0(c0129s.f389d, this.f418d);
        c0129s.f391f = this.f420f;
        c0129s.f392g = this.f421g;
        c0129s.f393h = this.f422h;
        c0129s.f394i = this.f423i;
        c0129s.f395j = this.f424j;
        c0129s.f396k = this.f425k;
        c0129s.f397l = this.f426l;
        c0129s.f398m = this.f427m;
        c0129s.f399n = this.f428n;
        c0129s.f400o = this.f429o;
        c0129s.f401p = this.f430p;
        c0129s.f402q = this.f431q;
        c0129s.f403r = this.f432r;
        c0129s.f404s = this.f433s;
        c0129s.f405t = this.f434t;
        c0129s.f406u = this.f435u;
        c0129s.f407v = this.f436v;
        c0129s.f408w = this.f437w;
        c0129s.f409x = this.f438x;
        c0129s.f410y = i2;
        c0129s.f411z = this.f440z;
        c0129s.f385A = this.f414A;
        c0129s.f390e = new C0511e(2);
        List list = C0464f.f1393w;
        AbstractC1326c.m3062e(list, "protocols");
        ArrayList arrayList = new ArrayList(list);
        EnumC0131u enumC0131u = EnumC0131u.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(enumC0131u) && !arrayList.contains(EnumC0131u.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
        }
        if (arrayList.contains(enumC0131u) && arrayList.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
        }
        if (arrayList.contains(EnumC0131u.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
        }
        if (arrayList.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayList.remove(EnumC0131u.SPDY_3);
        if (!arrayList.equals(c0129s.f403r)) {
            c0129s.f385A = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC1326c.m3061d(listUnmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
        c0129s.f403r = listUnmodifiableList;
        C0130t c0130t = new C0130t(c0129s);
        C0121k c0121kM367a = c0132v.m367a();
        c0121kM367a.m340h("Upgrade", "websocket");
        c0121kM367a.m340h("Connection", "Upgrade");
        c0121kM367a.m340h("Sec-WebSocket-Key", c0464f.f1394a);
        c0121kM367a.m340h("Sec-WebSocket-Version", "13");
        c0121kM367a.m340h("Sec-WebSocket-Extensions", "permessage-deflate");
        C0132v c0132vM334b = c0121kM367a.m334b();
        C0190i c0190i = new C0190i(c0130t, c0132vM334b, true);
        c0464f.f1395b = c0190i;
        c0190i.m499e(new C0019a(c0464f, 8, c0132vM334b));
        return c0464f;
    }

    public final Object clone() {
        return super.clone();
    }
}
