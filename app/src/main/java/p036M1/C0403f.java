package p036M1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p033L1.C0355c;
import p033L1.C0366n;
import p055T0.C0511e;
import p131s1.AbstractC1326c;

/* renamed from: M1.f */
/* loaded from: classes.dex */
public class C0403f implements InterfaceC0411n {

    /* renamed from: f */
    public static final C0402e f1279f = new C0402e();

    /* renamed from: a */
    public final Method f1280a;

    /* renamed from: b */
    public final Method f1281b;

    /* renamed from: c */
    public final Method f1282c;

    /* renamed from: d */
    public final Method f1283d;

    /* renamed from: e */
    public final Class f1284e;

    public C0403f(Class cls) throws NoSuchMethodException, SecurityException {
        this.f1284e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC1326c.m3061d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f1280a = declaredMethod;
        this.f1281b = cls.getMethod("setHostname", String.class);
        this.f1282c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f1283d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: a */
    public final boolean mo1077a(SSLSocket sSLSocket) {
        return this.f1284e.isInstance(sSLSocket);
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: b */
    public final String mo1078b(SSLSocket sSLSocket) {
        if (!this.f1284e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f1282c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            AbstractC1326c.m3061d(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (NullPointerException e4) {
            if (AbstractC1326c.m3058a(e4.getMessage(), "ssl == null")) {
                return null;
            }
            throw e4;
        } catch (InvocationTargetException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: c */
    public final boolean mo1079c() {
        boolean z2 = C0355c.f1094e;
        return C0355c.f1094e;
    }

    @Override // p036M1.InterfaceC0411n
    /* renamed from: d */
    public final void mo1080d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC1326c.m3062e(list, "protocols");
        if (this.f1284e.isInstance(sSLSocket)) {
            try {
                this.f1280a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f1281b.invoke(sSLSocket, str);
                }
                Method method = this.f1283d;
                C0366n c0366n = C0366n.f1131a;
                method.invoke(sSLSocket, C0511e.m1273c(list));
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e4) {
                throw new AssertionError(e4);
            }
        }
    }
}
