package p036M1;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p033L1.C0366n;
import p055T0.C0511e;
import p131s1.AbstractC1326c;

/* renamed from: M1.a */
/* loaded from: classes.dex */
public final class C0398a implements InterfaceC0411n {
    @Override // p036M1.InterfaceC0411n
    /* renamed from: a */
    public final boolean mo1077a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: b */
    public final String mo1078b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: c */
    public final boolean mo1079c() {
        C0366n c0366n = C0366n.f1131a;
        return C0511e.m1277h() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: d */
    public final void mo1080d(SSLSocket sSLSocket, String str, List list) throws IOException {
        AbstractC1326c.m3062e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            AbstractC1326c.m3061d(sSLParameters, "sslParameters");
            C0366n c0366n = C0366n.f1131a;
            Object[] array = C0511e.m1272b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e3) {
            throw new IOException("Android internal error", e3);
        }
    }
}
