package p036M1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p131s1.AbstractC1326c;

/* renamed from: M1.m */
/* loaded from: classes.dex */
public final class C0410m implements InterfaceC0411n {

    /* renamed from: a */
    public InterfaceC0411n f1290a;

    /* renamed from: b */
    public final InterfaceC0409l f1291b;

    public C0410m(InterfaceC0409l interfaceC0409l) {
        this.f1291b = interfaceC0409l;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: a */
    public final boolean mo1077a(SSLSocket sSLSocket) {
        return this.f1291b.mo1081a(sSLSocket);
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: b */
    public final String mo1078b(SSLSocket sSLSocket) {
        InterfaceC0411n interfaceC0411nM1084e = m1084e(sSLSocket);
        if (interfaceC0411nM1084e != null) {
            return interfaceC0411nM1084e.mo1078b(sSLSocket);
        }
        return null;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: c */
    public final boolean mo1079c() {
        return true;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: d */
    public final void mo1080d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1326c.m3062e(list, "protocols");
        InterfaceC0411n interfaceC0411nM1084e = m1084e(sSLSocket);
        if (interfaceC0411nM1084e != null) {
            interfaceC0411nM1084e.mo1080d(sSLSocket, str, list);
        }
    }

    /* renamed from: e */
    public final synchronized InterfaceC0411n m1084e(SSLSocket sSLSocket) {
        try {
            if (this.f1290a == null && this.f1291b.mo1081a(sSLSocket)) {
                this.f1290a = this.f1291b.mo1082b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1290a;
    }
}
