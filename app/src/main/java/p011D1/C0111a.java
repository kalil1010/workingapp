package p011D1;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p006C.AbstractC0075g;
import p014E1.AbstractC0145b;
import p033L1.AbstractC0364l;
import p131s1.AbstractC1326c;

/* renamed from: D1.a */
/* loaded from: classes.dex */
public final class C0111a {

    /* renamed from: a */
    public final C0126p f279a;

    /* renamed from: b */
    public final List f280b;

    /* renamed from: c */
    public final List f281c;

    /* renamed from: d */
    public final C0112b f282d;

    /* renamed from: e */
    public final SocketFactory f283e;

    /* renamed from: f */
    public final SSLSocketFactory f284f;

    /* renamed from: g */
    public final HostnameVerifier f285g;

    /* renamed from: h */
    public final C0115e f286h;

    /* renamed from: i */
    public final C0112b f287i;

    /* renamed from: j */
    public final ProxySelector f288j;

    public C0111a(String str, int i2, C0112b c0112b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0115e c0115e, C0112b c0112b2, List list, List list2, ProxySelector proxySelector) {
        AbstractC1326c.m3062e(str, "uriHost");
        AbstractC1326c.m3062e(c0112b, "dns");
        AbstractC1326c.m3062e(socketFactory, "socketFactory");
        AbstractC1326c.m3062e(c0112b2, "proxyAuthenticator");
        AbstractC1326c.m3062e(list, "protocols");
        AbstractC1326c.m3062e(list2, "connectionSpecs");
        AbstractC1326c.m3062e(proxySelector, "proxySelector");
        this.f282d = c0112b;
        this.f283e = socketFactory;
        this.f284f = sSLSocketFactory;
        this.f285g = hostnameVerifier;
        this.f286h = c0115e;
        this.f287i = c0112b2;
        this.f288j = proxySelector;
        C0125o c0125o = new C0125o();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c0125o.f363a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c0125o.f363a = "https";
        }
        String strM1006k0 = AbstractC0364l.m1006k0(C0112b.m322f(str, 0, 0, 7));
        if (strM1006k0 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c0125o.f366d = strM1006k0;
        if (1 > i2 || 65535 < i2) {
            throw new IllegalArgumentException(AbstractC0075g.m236e("unexpected port: ", i2).toString());
        }
        c0125o.f367e = i2;
        this.f279a = c0125o.m355a();
        this.f280b = AbstractC0145b.m412y(list);
        this.f281c = AbstractC0145b.m412y(list2);
    }

    /* renamed from: a */
    public final boolean m317a(C0111a c0111a) {
        AbstractC1326c.m3062e(c0111a, "that");
        return AbstractC1326c.m3058a(this.f282d, c0111a.f282d) && AbstractC1326c.m3058a(this.f287i, c0111a.f287i) && AbstractC1326c.m3058a(this.f280b, c0111a.f280b) && AbstractC1326c.m3058a(this.f281c, c0111a.f281c) && AbstractC1326c.m3058a(this.f288j, c0111a.f288j) && AbstractC1326c.m3058a(this.f284f, c0111a.f284f) && AbstractC1326c.m3058a(this.f285g, c0111a.f285g) && AbstractC1326c.m3058a(this.f286h, c0111a.f286h) && this.f279a.f377f == c0111a.f279a.f377f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0111a)) {
            return false;
        }
        C0111a c0111a = (C0111a) obj;
        return AbstractC1326c.m3058a(this.f279a, c0111a.f279a) && m317a(c0111a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f286h) + ((Objects.hashCode(this.f285g) + ((Objects.hashCode(this.f284f) + ((this.f288j.hashCode() + ((this.f281c.hashCode() + ((this.f280b.hashCode() + ((this.f287i.hashCode() + ((this.f282d.hashCode() + ((this.f279a.f380i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C0126p c0126p = this.f279a;
        sb.append(c0126p.f376e);
        sb.append(':');
        sb.append(c0126p.f377f);
        sb.append(", ");
        sb.append("proxySelector=" + this.f288j);
        sb.append("}");
        return sb.toString();
    }
}
