package p033L1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p011D1.EnumC0131u;
import p110k1.AbstractC1209k;
import p131s1.AbstractC1326c;

/* renamed from: L1.j */
/* loaded from: classes.dex */
public final class C0362j extends C0366n {

    /* renamed from: c */
    public final Method f1118c;

    /* renamed from: d */
    public final Method f1119d;

    /* renamed from: e */
    public final Method f1120e;

    /* renamed from: f */
    public final Class f1121f;

    /* renamed from: g */
    public final Class f1122g;

    public C0362j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f1118c = method;
        this.f1119d = method2;
        this.f1120e = method3;
        this.f1121f = cls;
        this.f1122g = cls2;
    }

    @Override // p033L1.C0366n
    /* renamed from: a */
    public final void mo979a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f1120e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        }
    }

    @Override // p033L1.C0366n
    /* renamed from: d */
    public final void mo934d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC1326c.m3062e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC0131u) obj) != EnumC0131u.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1209k.m2850x0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC0131u) it.next()).f448a);
        }
        try {
            this.f1118c.invoke(null, sSLSocket, Proxy.newProxyInstance(C0366n.class.getClassLoader(), new Class[]{this.f1121f, this.f1122g}, new C0361i(arrayList2)));
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        }
    }

    @Override // p033L1.C0366n
    /* renamed from: f */
    public final String mo935f(SSLSocket sSLSocket) throws IllegalArgumentException {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f1119d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            C0361i c0361i = (C0361i) invocationHandler;
            boolean z2 = c0361i.f1115a;
            if (!z2 && c0361i.f1116b == null) {
                C0366n.m1032i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z2) {
                return null;
            }
            return c0361i.f1116b;
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        }
    }
}
