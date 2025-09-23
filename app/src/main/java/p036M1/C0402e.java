package p036M1;

import javax.net.ssl.SSLSocket;
import p149y1.AbstractC1411i;

/* renamed from: M1.e */
/* loaded from: classes.dex */
public final class C0402e implements InterfaceC0409l {
    @Override // p036M1.InterfaceC0409l
    /* renamed from: a */
    public final boolean mo1081a(SSLSocket sSLSocket) {
        return AbstractC1411i.m3188c0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p036M1.InterfaceC0409l
    /* renamed from: b */
    public final InterfaceC0411n mo1082b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C0403f(superclass);
    }
}
