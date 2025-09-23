package p033L1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p011D1.EnumC0131u;
import p110k1.AbstractC1209k;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1411i;

/* renamed from: L1.k */
/* loaded from: classes.dex */
public final class C0363k extends C0366n {

    /* renamed from: c */
    public static final boolean f1123c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM3190e0 = property != null ? AbstractC1411i.m3190e0(property) : null;
        boolean z2 = true;
        if (numM3190e0 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM3190e0.intValue() < 9) {
            z2 = false;
        }
        f1123c = z2;
    }

    @Override // p033L1.C0366n
    /* renamed from: d */
    public final void mo934d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1326c.m3062e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
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
        AbstractC1326c.m3061d(sSLParameters, "sslParameters");
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p033L1.C0366n
    /* renamed from: f */
    public final String mo935f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
