package p011D1;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p131s1.AbstractC1326c;

/* renamed from: D1.A */
/* loaded from: classes.dex */
public final class C0109A {

    /* renamed from: a */
    public final C0111a f269a;

    /* renamed from: b */
    public final Proxy f270b;

    /* renamed from: c */
    public final InetSocketAddress f271c;

    public C0109A(C0111a c0111a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC1326c.m3062e(inetSocketAddress, "socketAddress");
        this.f269a = c0111a;
        this.f270b = proxy;
        this.f271c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0109A)) {
            return false;
        }
        C0109A c0109a = (C0109A) obj;
        return AbstractC1326c.m3058a(c0109a.f269a, this.f269a) && AbstractC1326c.m3058a(c0109a.f270b, this.f270b) && AbstractC1326c.m3058a(c0109a.f271c, this.f271c);
    }

    public final int hashCode() {
        return this.f271c.hashCode() + ((this.f270b.hashCode() + ((this.f269a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f271c + '}';
    }
}
