package p021H1;

import java.io.IOException;
import p011D1.C0121k;
import p011D1.C0130t;
import p011D1.C0134x;
import p011D1.InterfaceC0127q;
import p024I1.C0212f;
import p024I1.InterfaceC0210d;
import p131s1.AbstractC1326c;

/* renamed from: H1.a */
/* loaded from: classes.dex */
public final class C0182a implements InterfaceC0127q {

    /* renamed from: a */
    public static final C0182a f655a = new C0182a();

    @Override // p011D1.InterfaceC0127q
    /* renamed from: a */
    public final C0134x mo37a(C0212f c0212f) throws IOException {
        C0190i c0190i = c0212f.f768b;
        c0190i.getClass();
        synchronized (c0190i) {
            try {
                if (!c0190i.f698k) {
                    throw new IllegalStateException("released");
                }
                if (c0190i.f697j) {
                    throw new IllegalStateException("Check failed.");
                }
                if (c0190i.f696i) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0186e c0186e = c0190i.f692e;
        AbstractC1326c.m3059b(c0186e);
        C0130t c0130t = c0190i.f702o;
        AbstractC1326c.m3062e(c0130t, "client");
        try {
            InterfaceC0210d interfaceC0210dM515j = c0186e.m489a(c0212f.f773g, c0212f.f774h, c0212f.f775i, c0130t.f439y, c0130t.f420f, !AbstractC1326c.m3058a(c0212f.f772f.f450b, "GET")).m515j(c0130t, c0212f);
            AbstractC1326c.m3062e(c0190i, "call");
            AbstractC1326c.m3062e(c0186e, "finder");
            C0121k c0121k = new C0121k();
            c0121k.f353b = c0190i;
            c0121k.f354c = c0186e;
            c0121k.f355d = interfaceC0210dM515j;
            c0121k.f352a = interfaceC0210dM515j.mo527h();
            c0190i.f695h = c0121k;
            c0190i.f700m = c0121k;
            synchronized (c0190i) {
                c0190i.f696i = true;
                c0190i.f697j = true;
            }
            if (c0190i.f699l) {
                throw new IOException("Canceled");
            }
            return C0212f.m562a(c0212f, 0, c0121k, null, 61).m563b(c0212f.f772f);
        } catch (C0196o e3) {
            c0186e.m491c(e3.f732a);
            throw e3;
        } catch (IOException e4) {
            c0186e.m491c(e4);
            throw new C0196o(e4);
        }
    }
}
