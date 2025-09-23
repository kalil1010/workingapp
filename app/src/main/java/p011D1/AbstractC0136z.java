package p011D1;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import p014E1.AbstractC0145b;
import p050R1.InterfaceC0481i;
import p149y1.AbstractC1403a;

/* renamed from: D1.z */
/* loaded from: classes.dex */
public abstract class AbstractC0136z implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        AbstractC0145b.m391d(mo374i());
    }

    /* renamed from: g */
    public abstract long mo372g();

    /* renamed from: h */
    public abstract C0128r mo373h();

    /* renamed from: i */
    public abstract InterfaceC0481i mo374i();

    /* renamed from: j */
    public final String m375j() throws IOException {
        Charset charsetM365a;
        InterfaceC0481i interfaceC0481iMo374i = mo374i();
        try {
            C0128r c0128rMo373h = mo373h();
            if (c0128rMo373h == null || (charsetM365a = c0128rMo373h.m365a(AbstractC1403a.f6077a)) == null) {
                charsetM365a = AbstractC1403a.f6077a;
            }
            String strMo1174e = interfaceC0481iMo374i.mo1174e(AbstractC0145b.m407t(interfaceC0481iMo374i, charsetM365a));
            interfaceC0481iMo374i.close();
            return strMo1174e;
        } finally {
        }
    }
}
