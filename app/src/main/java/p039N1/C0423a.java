package p039N1;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p093e2.AbstractC0901d;

/* renamed from: N1.a */
/* loaded from: classes.dex */
public final class C0423a extends ProxySelector {

    /* renamed from: a */
    public static final C0423a f1311a = new C0423a();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return AbstractC0901d.m2287T(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
