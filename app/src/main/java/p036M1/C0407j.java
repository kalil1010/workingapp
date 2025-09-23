package p036M1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p033L1.C0360h;

/* renamed from: M1.j */
/* loaded from: classes.dex */
public final class C0407j implements InterfaceC0409l {
    @Override // p036M1.InterfaceC0409l
    /* renamed from: a */
    public final boolean mo1081a(SSLSocket sSLSocket) {
        return C0360h.f1113d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p036M1.InterfaceC0409l
    /* renamed from: b */
    public final InterfaceC0411n mo1082b(SSLSocket sSLSocket) {
        return new C0408k();
    }
}
