package p024I1;

import java.io.IOException;
import java.net.ProtocolException;
import p011D1.AbstractC0136z;
import p011D1.C0121k;
import p011D1.C0124n;
import p011D1.C0132v;
import p011D1.C0133w;
import p011D1.C0134x;
import p011D1.InterfaceC0127q;
import p014E1.AbstractC0145b;
import p021H1.C0185d;
import p021H1.C0190i;
import p021H1.C0194m;
import p050R1.C0489q;
import p093e2.AbstractC0901d;
import p131s1.AbstractC1326c;

/* renamed from: I1.a */
/* loaded from: classes.dex */
public final class C0207a implements InterfaceC0127q {

    /* renamed from: a */
    public final boolean f764a;

    public C0207a(boolean z2) {
        this.f764a = z2;
    }

    @Override // p011D1.InterfaceC0127q
    /* renamed from: a */
    public final C0134x mo37a(C0212f c0212f) throws IOException {
        C0134x c0134xM369a;
        C0121k c0121k = c0212f.f771e;
        AbstractC1326c.m3059b(c0121k);
        C0190i c0190i = (C0190i) c0121k.f353b;
        InterfaceC0210d interfaceC0210d = (InterfaceC0210d) c0121k.f355d;
        C0132v c0132v = c0212f.f772f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AbstractC1326c.m3062e(c0190i, "call");
            interfaceC0210d.mo525f(c0132v);
            AbstractC0901d.m2294e0(c0132v.f450b);
            C0194m c0194m = (C0194m) c0121k.f352a;
            c0190i.m503i(c0121k, true, false, null);
            try {
                interfaceC0210d.mo521b();
                C0133w c0133wM346n = c0121k.m346n(false);
                AbstractC1326c.m3059b(c0133wM346n);
                AbstractC1326c.m3062e(c0190i, "call");
                c0133wM346n.f455a = c0132v;
                c0133wM346n.f459e = c0194m.f714d;
                c0133wM346n.f465k = jCurrentTimeMillis;
                c0133wM346n.f466l = System.currentTimeMillis();
                C0134x c0134xM369a2 = c0133wM346n.m369a();
                int i2 = c0134xM369a2.f471d;
                if (i2 == 100) {
                    C0133w c0133wM346n2 = c0121k.m346n(false);
                    AbstractC1326c.m3059b(c0133wM346n2);
                    c0133wM346n2.f455a = c0132v;
                    c0133wM346n2.f459e = c0194m.f714d;
                    c0133wM346n2.f465k = jCurrentTimeMillis;
                    c0133wM346n2.f466l = System.currentTimeMillis();
                    c0134xM369a2 = c0133wM346n2.m369a();
                    i2 = c0134xM369a2.f471d;
                }
                if (this.f764a && i2 == 101) {
                    C0133w c0133wM371h = c0134xM369a2.m371h();
                    c0133wM371h.f461g = AbstractC0145b.f497c;
                    c0134xM369a = c0133wM371h.m369a();
                } else {
                    C0133w c0133wM371h2 = c0134xM369a2.m371h();
                    try {
                        String strM370g = C0134x.m370g(c0134xM369a2, "Content-Type");
                        long jMo523d = interfaceC0210d.mo523d(c0134xM369a2);
                        c0133wM371h2.f461g = new C0213g(strM370g, jMo523d, new C0489q(new C0185d(c0121k, interfaceC0210d.mo526g(c0134xM369a2), jMo523d)));
                        c0134xM369a = c0133wM371h2.m369a();
                    } catch (IOException e3) {
                        c0121k.m347o(e3);
                        throw e3;
                    }
                }
                if ("close".equalsIgnoreCase(((C0124n) c0134xM369a.f468a.f453e).m351a("Connection")) || "close".equalsIgnoreCase(C0134x.m370g(c0134xM369a, "Connection"))) {
                    interfaceC0210d.mo527h().m516k();
                }
                if (i2 == 204 || i2 == 205) {
                    AbstractC0136z abstractC0136z = c0134xM369a.f474g;
                    if ((abstractC0136z != null ? abstractC0136z.mo372g() : -1L) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i2);
                        sb.append(" had non-zero Content-Length: ");
                        sb.append(abstractC0136z != null ? Long.valueOf(abstractC0136z.mo372g()) : null);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return c0134xM369a;
            } catch (IOException e4) {
                c0121k.m347o(e4);
                throw e4;
            }
        } catch (IOException e5) {
            AbstractC1326c.m3062e(c0190i, "call");
            c0121k.m347o(e5);
            throw e5;
        }
    }
}
