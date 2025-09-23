package p008C1;

import android.os.Handler;
import android.os.Looper;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A0.C0004c;
import p011D1.C0121k;
import p011D1.C0129s;
import p011D1.C0130t;
import p011D1.C0132v;
import p014E1.AbstractC0145b;
import p021H1.C0190i;
import p021H1.C0194m;
import p021H1.C0195n;
import p047Q1.C0462d;
import p047Q1.C0464f;
import p050R1.C0482j;
import p055T0.C0511e;
import p131s1.AbstractC1326c;

/* renamed from: C1.f */
/* loaded from: classes.dex */
public final class C0097f {

    /* renamed from: a */
    public final C0130t f233a;

    /* renamed from: b */
    public C0464f f234b;

    /* renamed from: c */
    public final C0132v f235c;

    /* renamed from: d */
    public final C0004c f236d;

    /* renamed from: e */
    public boolean f237e;

    /* renamed from: f */
    public final Handler f238f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public C0004c f239g;

    public C0097f(String str) {
        C0129s c0129s = new C0129s();
        AbstractC1326c.m3062e(TimeUnit.SECONDS, "unit");
        c0129s.f410y = AbstractC0145b.m389b("interval", 15L);
        c0129s.f391f = true;
        this.f233a = new C0130t(c0129s);
        C0121k c0121k = new C0121k(1);
        c0121k.m348p(str);
        this.f235c = c0121k.m334b();
        this.f236d = new C0004c(5, this);
    }

    /* renamed from: a */
    public static void m290a(C0097f c0097f, Runnable runnable) {
        c0097f.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            c0097f.f238f.post(runnable);
        }
    }

    /* renamed from: b */
    public final void m291b() {
        Socket socket;
        C0130t c0130t = this.f233a;
        if (c0130t != null) {
            C0195n c0195n = (C0195n) c0130t.f416b.f7b;
            Iterator it = c0195n.f731d.iterator();
            AbstractC1326c.m3061d(it, "connections.iterator()");
            while (it.hasNext()) {
                C0194m c0194m = (C0194m) it.next();
                AbstractC1326c.m3061d(c0194m, "connection");
                synchronized (c0194m) {
                    if (c0194m.f725o.isEmpty()) {
                        it.remove();
                        c0194m.f719i = true;
                        socket = c0194m.f713c;
                        AbstractC1326c.m3059b(socket);
                    } else {
                        socket = null;
                    }
                }
                if (socket != null) {
                    AbstractC0145b.m392e(socket);
                }
            }
            if (c0195n.f731d.isEmpty()) {
                c0195n.f729b.m466a();
            }
            ((ThreadPoolExecutor) this.f233a.f415a.m336d()).shutdown();
        }
        C0464f c0464f = this.f234b;
        if (c0464f != null) {
            C0190i c0190i = c0464f.f1395b;
            AbstractC1326c.m3059b(c0190i);
            c0190i.m498d();
        }
        this.f237e = false;
    }

    /* renamed from: c */
    public final void m292c(String str) {
        C0464f c0464f;
        if (!this.f237e || (c0464f = this.f234b) == null) {
            return;
        }
        AbstractC1326c.m3062e(str, "text");
        C0482j c0482j = C0482j.f1481d;
        C0482j c0482jM1275e = C0511e.m1275e(str);
        synchronized (c0464f) {
            if (!c0464f.f1408o && !c0464f.f1405l) {
                long j2 = c0464f.f1404k;
                byte[] bArr = c0482jM1275e.f1484c;
                if (bArr.length + j2 > 16777216) {
                    c0464f.m1147b(null, 1001);
                    return;
                }
                c0464f.f1404k = j2 + bArr.length;
                c0464f.f1403j.add(new C0462d(c0482jM1275e));
                c0464f.m1151f();
            }
        }
    }
}
