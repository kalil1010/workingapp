package p142w0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p068X1.AbstractC0599a;
import p073Z0.C0614j;
import p074Z1.AbstractC0618a;
import p085c2.AbstractC0808b;
import p085c2.InterfaceC0807a;
import p120o0.AbstractC1252b;
import p120o0.C1251a;
import p120o0.C1253c;
import p120o0.C1254d;
import p123p0.C1266b;
import p152z1.AbstractC1421d;
import p152z1.C1420c;

/* renamed from: w0.d */
/* loaded from: classes.dex */
public abstract class AbstractC1385d {

    /* renamed from: a */
    public static final InterfaceC0807a f6003a = AbstractC0808b.m2014d(AbstractC1385d.class);

    /* renamed from: a */
    public static C1253c m3157a(C1420c c1420c) throws IOException {
        InterfaceC0807a interfaceC0807a = f6003a;
        C1253c c1253c = null;
        try {
            try {
                try {
                    if (c1420c.f6108a.available() <= 2) {
                        return null;
                    }
                    C1266b c1266bM3161e = m3161e(c1420c.m3201h());
                    int iM3200g = c1420c.m3200g();
                    if (c1420c.f6108a.available() >= iM3200g) {
                        AbstractC1421d.m3203a(iM3200g);
                        c1253c = new C1253c(c1266bM3161e, iM3200g, c1420c.m3202i());
                    }
                    return c1253c;
                } catch (IOException e3) {
                    interfaceC0807a.mo124g(e3.getMessage(), e3);
                    return null;
                }
            } catch (EOFException e4) {
                interfaceC0807a.mo118a(e4.getMessage(), e4);
                return null;
            }
        } finally {
            AbstractC0599a.m1404a(c1420c);
        }
    }

    /* renamed from: b */
    public static byte[] m3158b(byte[] bArr, C1266b... c1266bArr) throws IOException {
        C1253c c1253cM3157a;
        byte[] bArrM3158b = null;
        if (bArr == null) {
            return null;
        }
        C1420c c1420c = new C1420c(new ByteArrayInputStream(bArr));
        while (c1420c.f6108a.available() > 0 && (c1253cM3157a = m3157a(c1420c)) != null) {
            try {
                C1266b c1266b = c1253cM3157a.f5103a;
                boolean zM1417a = AbstractC0618a.m1417a(c1266bArr, c1266b);
                byte[] bArr2 = c1253cM3157a.f5104b;
                if (!zM1417a) {
                    if ((c1266b.f5140e == 2) && (bArrM3158b = m3158b(bArr2, c1266bArr)) != null) {
                        break;
                    }
                } else {
                    return bArr2;
                }
            } catch (IOException e3) {
                f6003a.mo124g(e3.getMessage(), e3);
                return bArrM3158b;
            } finally {
                AbstractC0599a.m1404a(c1420c);
            }
        }
        return bArrM3158b;
    }

    /* renamed from: c */
    public static ArrayList m3159c(byte[] bArr, C1266b... c1266bArr) {
        C1253c c1253cM3157a;
        ArrayList arrayList = new ArrayList();
        C1420c c1420c = new C1420c(new ByteArrayInputStream(bArr));
        while (c1420c.f6108a.available() > 0 && (c1253cM3157a = m3157a(c1420c)) != null) {
            try {
                try {
                    C1266b c1266b = c1253cM3157a.f5103a;
                    if (AbstractC0618a.m1417a(c1266bArr, c1266b)) {
                        arrayList.add(c1253cM3157a);
                    } else {
                        if (c1266b.f5140e == 2) {
                            arrayList.addAll(m3159c(c1253cM3157a.f5104b, c1266bArr));
                        }
                    }
                } catch (IOException e3) {
                    f6003a.mo124g(e3.getMessage(), e3);
                    AbstractC0599a.m1404a(c1420c);
                    return arrayList;
                }
            } catch (Throwable th) {
                AbstractC0599a.m1404a(c1420c);
                throw th;
            }
        }
        AbstractC0599a.m1404a(c1420c);
        return arrayList;
    }

    /* renamed from: d */
    public static ArrayList m3160d(byte[] bArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            C1420c c1420c = new C1420c(new ByteArrayInputStream(bArr));
            while (c1420c.f6108a.available() > 0) {
                try {
                    try {
                        if (c1420c.f6108a.available() < 2) {
                            throw new C0614j("Data length < 2 : " + c1420c.f6108a.available());
                        }
                        C1266b c1266bM3161e = m3161e(c1420c.m3201h());
                        int iM3200g = c1420c.m3200g();
                        C1254d c1254d = new C1254d();
                        c1254d.f5105a = c1266bM3161e;
                        c1254d.f5106b = iM3200g;
                        arrayList.add(c1254d);
                    } catch (IOException e3) {
                        f6003a.mo124g(e3.getMessage(), e3);
                        AbstractC0599a.m1404a(c1420c);
                    }
                } catch (Throwable th) {
                    AbstractC0599a.m1404a(c1420c);
                    throw th;
                }
            }
            AbstractC0599a.m1404a(c1420c);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C1266b m3161e(int i2) {
        int i3 = AbstractC1421d.f6111a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iLog = ((int) (Math.log(i2) / Math.log(256.0d))) + 1;
        for (int i4 = 0; i4 < iLog; i4++) {
            int i5 = ((iLog - i4) - 1) * 8;
            byteArrayOutputStream.write(((255 << i5) & i2) >> i5);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i6 = 3;
        int i7 = 3;
        while (i7 >= 0 && ((255 << (i7 * 8)) & i2) == 0) {
            i7--;
        }
        int i8 = i7 * 8;
        int i9 = (((255 << i8) & i2) >> i8) & 192;
        char c3 = i9 != 0 ? i9 != 64 ? i9 != 128 ? (char) 3 : (char) 2 : (char) 1 : (char) 0;
        if (c3 == 1) {
            byteArray[0] = (byte) (byteArray[0] | 64);
        } else if (c3 == 2) {
            byteArray[0] = (byte) (byteArray[0] | 128);
        } else if (c3 == 3) {
            byteArray[0] = (byte) (byteArray[0] | 192);
        }
        while (i6 >= 0 && ((255 << (i6 * 8)) & i2) == 0) {
            i6--;
        }
        int i10 = i6 * 8;
        if ((((i2 & (255 << i10)) >> i10) & 32) != 0) {
            byteArray[0] = (byte) (byteArray[0] | 32);
        }
        LinkedHashMap linkedHashMap = AbstractC1252b.f5077a;
        byteArray.getClass();
        C1266b c1266b = (C1266b) linkedHashMap.get(new C1251a(byteArray));
        return c1266b == null ? new C1266b(byteArray, 1, "[UNKNOWN TAG]") : c1266b;
    }
}
