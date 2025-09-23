package p036M1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p033L1.C0360h;
import p033L1.C0366n;
import p055T0.C0511e;
import p131s1.AbstractC1326c;

/* renamed from: M1.k */
/* loaded from: classes.dex */
public final class C0408k implements InterfaceC0411n {

    /* renamed from: a */
    public static final C0407j f1289a = new C0407j();

    @Override // p036M1.InterfaceC0411n
    /* renamed from: a */
    public final boolean mo1077a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: b */
    public final String mo1078b(SSLSocket sSLSocket) {
        if (mo1077a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: c */
    public final boolean mo1079c() {
        boolean z2 = C0360h.f1113d;
        return C0360h.f1113d;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: d */
    public final void mo1080d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1326c.m3062e(list, "protocols");
        if (mo1077a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C0366n c0366n = C0366n.f1131a;
            Object[] array = C0511e.m1272b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
