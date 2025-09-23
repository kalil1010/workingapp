package p033L1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p036M1.C0399b;
import p036M1.C0403f;
import p036M1.C0405h;
import p036M1.C0406i;
import p036M1.C0408k;
import p036M1.C0410m;
import p036M1.C0412o;
import p036M1.InterfaceC0411n;
import p044P1.C0433a;
import p044P1.InterfaceC0436d;
import p055T0.C0511e;
import p110k1.AbstractC1206h;
import p131s1.AbstractC1326c;

/* renamed from: L1.c */
/* loaded from: classes.dex */
public final class C0355c extends C0366n {

    /* renamed from: e */
    public static final boolean f1094e;

    /* renamed from: c */
    public final ArrayList f1095c;

    /* renamed from: d */
    public final C0406i f1096d;

    static {
        boolean z2 = false;
        if (C0511e.m1277h() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f1094e = z2;
    }

    public C0355c() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        C0412o c0412o;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c0412o = new C0412o(cls);
        } catch (Exception e3) {
            C0366n.f1131a.getClass();
            C0366n.m1032i("unable to load android socket classes", 5, e3);
            c0412o = null;
        }
        ArrayList arrayListM2846q0 = AbstractC1206h.m2846q0(new InterfaceC0411n[]{c0412o, new C0410m(C0403f.f1279f), new C0410m(C0408k.f1289a), new C0410m(C0405h.f1285a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM2846q0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC0411n) next).mo1079c()) {
                arrayList.add(next);
            }
        }
        this.f1095c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        C0406i c0406i = new C0406i();
        c0406i.f1286a = method3;
        c0406i.f1287b = method2;
        c0406i.f1288c = method;
        this.f1096d = c0406i;
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
    /* renamed from: c */
    public final InterfaceC0436d mo938c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            AbstractC1326c.m3061d(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0354b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo938c(x509TrustManager);
        }
    }

    @Override // p033L1.C0366n
    /* renamed from: d */
    public final void mo934d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        AbstractC1326c.m3062e(list, "protocols");
        Iterator it = this.f1095c.iterator();
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
    /* renamed from: e */
    public final void mo939e(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        AbstractC1326c.m3062e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            throw new IOException("Exception in connect", e3);
        }
    }

    @Override // p033L1.C0366n
    /* renamed from: f */
    public final String mo935f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f1095c.iterator();
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
    /* renamed from: g */
    public final Object mo940g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0406i c0406i = this.f1096d;
        c0406i.getClass();
        Method method = c0406i.f1286a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = c0406i.f1287b;
                AbstractC1326c.m3059b(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // p033L1.C0366n
    /* renamed from: h */
    public final boolean mo936h(String str) {
        AbstractC1326c.m3062e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p033L1.C0366n
    /* renamed from: j */
    public final void mo941j(Object obj, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC1326c.m3062e(str, "message");
        C0406i c0406i = this.f1096d;
        c0406i.getClass();
        if (obj != null) {
            try {
                Method method = c0406i.f1288c;
                AbstractC1326c.m3059b(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        C0366n.m1032i(str, 5, null);
    }
}
