package p033L1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p036M1.C0398a;
import p036M1.C0399b;
import p036M1.C0403f;
import p036M1.C0405h;
import p036M1.C0408k;
import p036M1.C0410m;
import p036M1.InterfaceC0411n;
import p044P1.C0433a;
import p055T0.C0511e;
import p110k1.AbstractC1206h;
import p131s1.AbstractC1326c;

/* renamed from: L1.a */
/* loaded from: classes.dex */
public final class C0353a extends C0366n {

    /* renamed from: d */
    public static final boolean f1090d;

    /* renamed from: c */
    public final ArrayList f1091c;

    static {
        f1090d = C0511e.m1277h() && Build.VERSION.SDK_INT >= 29;
    }

    public C0353a() {
        ArrayList arrayListM2846q0 = AbstractC1206h.m2846q0(new InterfaceC0411n[]{(!C0511e.m1277h() || Build.VERSION.SDK_INT < 29) ? null : new C0398a(), new C0410m(C0403f.f1279f), new C0410m(C0408k.f1289a), new C0410m(C0405h.f1285a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM2846q0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC0411n) next).mo1079c()) {
                arrayList.add(next);
            }
        }
        this.f1091c = arrayList;
    }

    @Override // p033L1.C0366n
    /* renamed from: b */
    public final AbstractC0364l mo933b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C0399b c0399b = x509TrustManagerExtensions != null ? new C0399b(x509TrustManager, x509TrustManagerExtensions) : null;
        return c0399b != null ? c0399b : new C0433a(mo938c(x509TrustManager));
    }

    @Override // p033L1.C0366n
    /* renamed from: d */
    public final void mo934d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        AbstractC1326c.m3062e(list, "protocols");
        Iterator it = this.f1091c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC0411n) next).mo1077a(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC0411n interfaceC0411n = (InterfaceC0411n) next;
        if (interfaceC0411n != null) {
            interfaceC0411n.mo1080d(sSLSocket, str, list);
        }
    }

    @Override // p033L1.C0366n
    /* renamed from: f */
    public final String mo935f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f1091c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC0411n) next).mo1077a(sSLSocket)) {
                break;
            }
        }
        InterfaceC0411n interfaceC0411n = (InterfaceC0411n) next;
        if (interfaceC0411n != null) {
            return interfaceC0411n.mo1078b(sSLSocket);
        }
        return null;
    }

    @Override // p033L1.C0366n
    /* renamed from: h */
    public final boolean mo936h(String str) {
        AbstractC1326c.m3062e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
