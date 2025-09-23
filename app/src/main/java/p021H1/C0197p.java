package p021H1;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import p001A0.C0004c;
import p003B.C0048d;
import p011D1.C0111a;
import p011D1.C0124n;
import p011D1.C0126p;
import p011D1.C0130t;
import p011D1.C0132v;
import p011D1.C0133w;
import p011D1.C0134x;
import p011D1.EnumC0131u;
import p014E1.AbstractC0145b;
import p019G1.C0170d;
import p024I1.AbstractC0211e;
import p024I1.InterfaceC0210d;
import p027J1.C0219a;
import p027J1.C0221c;
import p027J1.C0222d;
import p027J1.C0223e;
import p027J1.C0224f;
import p027J1.C0225g;
import p030K1.AbstractC0313i;
import p033L1.AbstractC0356d;
import p050R1.C0488p;
import p050R1.C0489q;
import p050R1.InterfaceC0493u;
import p050R1.InterfaceC0494v;
import p110k1.C1215q;
import p131s1.AbstractC1326c;

/* renamed from: H1.p */
/* loaded from: classes.dex */
public final class C0197p implements InterfaceC0210d {

    /* renamed from: a */
    public int f734a;

    /* renamed from: b */
    public Object f735b;

    /* renamed from: c */
    public Object f736c;

    /* renamed from: d */
    public Object f737d;

    /* renamed from: e */
    public Object f738e;

    /* renamed from: f */
    public Object f739f;

    /* renamed from: g */
    public final Object f740g;

    public C0197p(C0111a c0111a, C0004c c0004c, C0190i c0190i) {
        List listM400m;
        AbstractC1326c.m3062e(c0004c, "routeDatabase");
        AbstractC1326c.m3062e(c0190i, "call");
        this.f738e = c0111a;
        this.f739f = c0004c;
        this.f740g = c0190i;
        C1215q c1215q = C1215q.f4904a;
        this.f735b = c1215q;
        this.f736c = c1215q;
        this.f737d = new ArrayList();
        C0126p c0126p = c0111a.f279a;
        AbstractC1326c.m3062e(c0126p, "url");
        URI uriM364g = c0126p.m364g();
        if (uriM364g.getHost() == null) {
            listM400m = AbstractC0145b.m400m(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = c0111a.f288j.select(uriM364g);
            listM400m = (listSelect == null || listSelect.isEmpty()) ? AbstractC0145b.m400m(Proxy.NO_PROXY) : AbstractC0145b.m412y(listSelect);
        }
        this.f735b = listM400m;
        this.f734a = 0;
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: a */
    public InterfaceC0493u mo520a(C0132v c0132v, long j2) {
        if ("chunked".equalsIgnoreCase(((C0124n) c0132v.f453e).m351a("Transfer-Encoding"))) {
            if (this.f734a == 1) {
                this.f734a = 2;
                return new C0221c(this);
            }
            throw new IllegalStateException(("state: " + this.f734a).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f734a == 1) {
            this.f734a = 2;
            return new C0224f(this);
        }
        throw new IllegalStateException(("state: " + this.f734a).toString());
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: b */
    public void mo521b() {
        ((C0488p) this.f740g).flush();
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: c */
    public void mo522c() {
        ((C0488p) this.f740g).flush();
    }

    @Override // p024I1.InterfaceC0210d
    public void cancel() throws IOException {
        Socket socket = ((C0194m) this.f738e).f712b;
        if (socket != null) {
            AbstractC0145b.m392e(socket);
        }
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: d */
    public long mo523d(C0134x c0134x) {
        if (!AbstractC0211e.m560a(c0134x)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(C0134x.m370g(c0134x, "Transfer-Encoding"))) {
            return -1L;
        }
        return AbstractC0145b.m399l(c0134x);
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: e */
    public C0133w mo524e(boolean z2) {
        C0219a c0219a = (C0219a) this.f735b;
        int i2 = this.f734a;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException(("state: " + this.f734a).toString());
        }
        try {
            String strM1230p = ((C0489q) c0219a.f784c).m1230p(c0219a.f783b);
            c0219a.f783b -= strM1230p.length();
            C0048d c0048dM942A = AbstractC0356d.m942A(strM1230p);
            int i3 = c0048dM942A.f115b;
            C0133w c0133w = new C0133w();
            c0133w.f456b = (EnumC0131u) c0048dM942A.f116c;
            c0133w.f457c = i3;
            c0133w.f458d = (String) c0048dM942A.f117d;
            c0133w.f460f = c0219a.m604f().m353c();
            if (z2 && i3 == 100) {
                return null;
            }
            if (i3 == 100) {
                this.f734a = 3;
                return c0133w;
            }
            this.f734a = 4;
            return c0133w;
        } catch (EOFException e3) {
            throw new IOException("unexpected end of stream on ".concat(((C0194m) this.f738e).f727q.f269a.f279a.m363f()), e3);
        }
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: f */
    public void mo525f(C0132v c0132v) {
        Proxy.Type type = ((C0194m) this.f738e).f727q.f270b.type();
        AbstractC1326c.m3061d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(c0132v.f450b);
        sb.append(' ');
        C0126p c0126p = (C0126p) c0132v.f452d;
        if (c0126p.f372a || type != Proxy.Type.HTTP) {
            String strM359b = c0126p.m359b();
            String strM361d = c0126p.m361d();
            if (strM361d != null) {
                strM359b = strM359b + '?' + strM361d;
            }
            sb.append(strM359b);
        } else {
            sb.append(c0126p);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        AbstractC1326c.m3061d(string, "StringBuilder().apply(builderAction).toString()");
        m530k((C0124n) c0132v.f453e, string);
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: g */
    public InterfaceC0494v mo526g(C0134x c0134x) {
        if (!AbstractC0211e.m560a(c0134x)) {
            return m529j(0L);
        }
        if ("chunked".equalsIgnoreCase(C0134x.m370g(c0134x, "Transfer-Encoding"))) {
            C0126p c0126p = (C0126p) c0134x.f468a.f452d;
            if (this.f734a == 4) {
                this.f734a = 5;
                return new C0222d(this, c0126p);
            }
            throw new IllegalStateException(("state: " + this.f734a).toString());
        }
        long jM399l = AbstractC0145b.m399l(c0134x);
        if (jM399l != -1) {
            return m529j(jM399l);
        }
        if (this.f734a == 4) {
            this.f734a = 5;
            ((C0194m) this.f738e).m516k();
            return new C0225g(this);
        }
        throw new IllegalStateException(("state: " + this.f734a).toString());
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: h */
    public C0194m mo527h() {
        return (C0194m) this.f738e;
    }

    /* renamed from: i */
    public boolean m528i() {
        return this.f734a < ((List) this.f735b).size() || !((ArrayList) this.f737d).isEmpty();
    }

    /* renamed from: j */
    public C0223e m529j(long j2) {
        if (this.f734a == 4) {
            this.f734a = 5;
            return new C0223e(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f734a).toString());
    }

    /* renamed from: k */
    public void m530k(C0124n c0124n, String str) {
        AbstractC1326c.m3062e(str, "requestLine");
        if (this.f734a != 0) {
            throw new IllegalStateException(("state: " + this.f734a).toString());
        }
        C0488p c0488p = (C0488p) this.f740g;
        c0488p.mo1173d(str);
        c0488p.mo1173d("\r\n");
        int size = c0124n.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0488p.mo1173d(c0124n.m352b(i2));
            c0488p.mo1173d(": ");
            c0488p.mo1173d(c0124n.m354d(i2));
            c0488p.mo1173d("\r\n");
        }
        c0488p.mo1173d("\r\n");
        this.f734a = 1;
    }

    public C0197p(C0130t c0130t, C0194m c0194m, C0489q c0489q, C0488p c0488p) {
        AbstractC1326c.m3062e(c0194m, "connection");
        AbstractC1326c.m3062e(c0489q, "source");
        AbstractC1326c.m3062e(c0488p, "sink");
        this.f737d = c0130t;
        this.f738e = c0194m;
        this.f739f = c0489q;
        this.f740g = c0488p;
        this.f735b = new C0219a(c0489q);
    }

    public C0197p(C0170d c0170d) {
        AbstractC1326c.m3062e(c0170d, "taskRunner");
        this.f740g = c0170d;
        this.f739f = AbstractC0313i.f964a;
    }
}
