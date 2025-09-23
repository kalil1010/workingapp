package p036M1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p033L1.C0357e;
import p033L1.C0366n;
import p055T0.C0511e;
import p131s1.AbstractC1326c;

/* renamed from: M1.h */
/* loaded from: classes.dex */
public final class C0405h implements InterfaceC0411n {

    /* renamed from: a */
    public static final C0404g f1285a = new C0404g();

    @Override // p036M1.InterfaceC0411n
    /* renamed from: a */
    public final boolean mo1077a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: b */
    public final String mo1078b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: c */
    public final boolean mo1079c() {
        boolean z2 = C0357e.f1110d;
        return C0357e.f1110d;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: d */
    public final void mo1080d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1326c.m3062e(list, "protocols");
        if (mo1077a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            AbstractC1326c.m3061d(parameters, "sslParameters");
            C0366n c0366n = C0366n.f1131a;
            Object[] array = C0511e.m1272b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
