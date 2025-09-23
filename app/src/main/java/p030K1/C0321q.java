package p030K1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p001A0.C0004c;
import p003B.C0048d;
import p006C.AbstractC0075g;
import p011D1.C0124n;
import p011D1.C0126p;
import p011D1.C0130t;
import p011D1.C0132v;
import p011D1.C0133w;
import p011D1.C0134x;
import p011D1.EnumC0131u;
import p014E1.AbstractC0145b;
import p021H1.C0189h;
import p021H1.C0194m;
import p024I1.AbstractC0211e;
import p024I1.C0212f;
import p024I1.InterfaceC0210d;
import p033L1.AbstractC0356d;
import p050R1.C0482j;
import p050R1.InterfaceC0493u;
import p050R1.InterfaceC0494v;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1411i;

/* renamed from: K1.q */
/* loaded from: classes.dex */
public final class C0321q implements InterfaceC0210d {

    /* renamed from: g */
    public static final List f1011g = AbstractC0145b.m400m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List f1012h = AbstractC0145b.m400m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public volatile C0327w f1013a;

    /* renamed from: b */
    public final EnumC0131u f1014b;

    /* renamed from: c */
    public volatile boolean f1015c;

    /* renamed from: d */
    public final C0194m f1016d;

    /* renamed from: e */
    public final C0212f f1017e;

    /* renamed from: f */
    public final C0320p f1018f;

    public C0321q(C0130t c0130t, C0194m c0194m, C0212f c0212f, C0320p c0320p) {
        AbstractC1326c.m3062e(c0130t, "client");
        AbstractC1326c.m3062e(c0194m, "connection");
        AbstractC1326c.m3062e(c0320p, "http2Connection");
        this.f1016d = c0194m;
        this.f1017e = c0212f;
        this.f1018f = c0320p;
        EnumC0131u enumC0131u = EnumC0131u.H2_PRIOR_KNOWLEDGE;
        this.f1014b = c0130t.f432r.contains(enumC0131u) ? enumC0131u : EnumC0131u.HTTP_2;
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: a */
    public final InterfaceC0493u mo520a(C0132v c0132v, long j2) {
        C0327w c0327w = this.f1013a;
        AbstractC1326c.m3059b(c0327w);
        return c0327w.m865f();
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: b */
    public final void mo521b() throws IOException {
        C0327w c0327w = this.f1013a;
        AbstractC1326c.m3059b(c0327w);
        c0327w.m865f().close();
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: c */
    public final void mo522c() {
        this.f1018f.flush();
    }

    @Override // p024I1.InterfaceC0210d
    public final void cancel() {
        this.f1015c = true;
        C0327w c0327w = this.f1013a;
        if (c0327w != null) {
            c0327w.m864e(9);
        }
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: d */
    public final long mo523d(C0134x c0134x) {
        if (AbstractC0211e.m560a(c0134x)) {
            return AbstractC0145b.m399l(c0134x);
        }
        return 0L;
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: e */
    public final C0133w mo524e(boolean z2) throws NumberFormatException, IOException {
        C0124n c0124n;
        C0327w c0327w = this.f1013a;
        AbstractC1326c.m3059b(c0327w);
        synchronized (c0327w) {
            c0327w.f1047i.m1162i();
            while (c0327w.f1043e.isEmpty() && c0327w.f1049k == 0) {
                try {
                    c0327w.m870k();
                } catch (Throwable th) {
                    c0327w.f1047i.m493l();
                    throw th;
                }
            }
            c0327w.f1047i.m493l();
            if (c0327w.f1043e.isEmpty()) {
                IOException iOException = c0327w.f1050l;
                if (iOException != null) {
                    throw iOException;
                }
                int i2 = c0327w.f1049k;
                AbstractC0075g.m239h(i2);
                throw new C0304C(i2);
            }
            Object objRemoveFirst = c0327w.f1043e.removeFirst();
            AbstractC1326c.m3061d(objRemoveFirst, "headersQueue.removeFirst()");
            c0124n = (C0124n) objRemoveFirst;
        }
        EnumC0131u enumC0131u = this.f1014b;
        AbstractC1326c.m3062e(enumC0131u, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = c0124n.size();
        C0048d c0048dM942A = null;
        for (int i3 = 0; i3 < size; i3++) {
            String strM352b = c0124n.m352b(i3);
            String strM354d = c0124n.m354d(i3);
            if (AbstractC1326c.m3058a(strM352b, ":status")) {
                c0048dM942A = AbstractC0356d.m942A("HTTP/1.1 " + strM354d);
            } else if (!f1012h.contains(strM352b)) {
                AbstractC1326c.m3062e(strM352b, "name");
                AbstractC1326c.m3062e(strM354d, "value");
                arrayList.add(strM352b);
                arrayList.add(AbstractC1411i.m3191f0(strM354d).toString());
            }
        }
        if (c0048dM942A == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C0133w c0133w = new C0133w();
        c0133w.f456b = enumC0131u;
        c0133w.f457c = c0048dM942A.f115b;
        c0133w.f458d = (String) c0048dM942A.f117d;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        C0004c c0004c = new C0004c(8);
        ArrayList arrayList2 = (ArrayList) c0004c.f7b;
        AbstractC1326c.m3062e(arrayList2, "<this>");
        List listAsList = Arrays.asList((String[]) array);
        AbstractC1326c.m3061d(listAsList, "asList(this)");
        arrayList2.addAll(listAsList);
        c0133w.f460f = c0004c;
        if (z2 && c0133w.f457c == 100) {
            return null;
        }
        return c0133w;
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: f */
    public final void mo525f(C0132v c0132v) throws IOException {
        int i2;
        C0327w c0327w;
        if (this.f1013a != null) {
            return;
        }
        c0132v.getClass();
        C0124n c0124n = (C0124n) c0132v.f453e;
        ArrayList arrayList = new ArrayList(c0124n.size() + 4);
        arrayList.add(new C0306b(C0306b.f933f, c0132v.f450b));
        C0482j c0482j = C0306b.f934g;
        C0126p c0126p = (C0126p) c0132v.f452d;
        AbstractC1326c.m3062e(c0126p, "url");
        String strM359b = c0126p.m359b();
        String strM361d = c0126p.m361d();
        if (strM361d != null) {
            strM359b = strM359b + '?' + strM361d;
        }
        arrayList.add(new C0306b(c0482j, strM359b));
        String strM351a = ((C0124n) c0132v.f453e).m351a("Host");
        if (strM351a != null) {
            arrayList.add(new C0306b(C0306b.f936i, strM351a));
        }
        arrayList.add(new C0306b(C0306b.f935h, c0126p.f373b));
        int size = c0124n.size();
        for (int i3 = 0; i3 < size; i3++) {
            String strM352b = c0124n.m352b(i3);
            Locale locale = Locale.US;
            AbstractC1326c.m3061d(locale, "Locale.US");
            if (strM352b == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strM352b.toLowerCase(locale);
            AbstractC1326c.m3061d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (!f1011g.contains(lowerCase) || (lowerCase.equals("te") && AbstractC1326c.m3058a(c0124n.m354d(i3), "trailers"))) {
                arrayList.add(new C0306b(lowerCase, c0124n.m354d(i3)));
            }
        }
        C0320p c0320p = this.f1018f;
        c0320p.getClass();
        boolean z2 = !false;
        synchronized (c0320p.f1008x) {
            synchronized (c0320p) {
                try {
                    if (c0320p.f989e > 1073741823) {
                        c0320p.m847j(8);
                    }
                    if (c0320p.f990f) {
                        throw new C0305a();
                    }
                    i2 = c0320p.f989e;
                    c0320p.f989e = i2 + 2;
                    c0327w = new C0327w(i2, c0320p, z2, false, null);
                    if (c0327w.m867h()) {
                        c0320p.f986b.put(Integer.valueOf(i2), c0327w);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0320p.f1008x.m875k(z2, i2, arrayList);
        }
        c0320p.f1008x.flush();
        this.f1013a = c0327w;
        if (this.f1015c) {
            C0327w c0327w2 = this.f1013a;
            AbstractC1326c.m3059b(c0327w2);
            c0327w2.m864e(9);
            throw new IOException("Canceled");
        }
        C0327w c0327w3 = this.f1013a;
        AbstractC1326c.m3059b(c0327w3);
        C0189h c0189h = c0327w3.f1047i;
        long j2 = this.f1017e.f774h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0189h.mo1212g(j2, timeUnit);
        C0327w c0327w4 = this.f1013a;
        AbstractC1326c.m3059b(c0327w4);
        c0327w4.f1048j.mo1212g(this.f1017e.f775i, timeUnit);
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: g */
    public final InterfaceC0494v mo526g(C0134x c0134x) {
        C0327w c0327w = this.f1013a;
        AbstractC1326c.m3059b(c0327w);
        return c0327w.f1045g;
    }

    @Override // p024I1.InterfaceC0210d
    /* renamed from: h */
    public final C0194m mo527h() {
        return this.f1016d;
    }
}
