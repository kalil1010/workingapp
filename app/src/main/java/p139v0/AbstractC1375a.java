package p139v0;

import java.io.IOException;
import java.lang.ref.WeakReference;
import p074Z1.AbstractC0618a;
import p080b1.C0770h;
import p085c2.AbstractC0808b;
import p085c2.InterfaceC0807a;
import p093e2.AbstractC0901d;
import p120o0.AbstractC1252b;
import p125q0.C1278f;
import p130s0.C1322a;
import p130s0.InterfaceC1323b;
import p142w0.AbstractC1384c;
import p142w0.AbstractC1385d;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1375a implements InterfaceC1323b {

    /* renamed from: b */
    public static final InterfaceC0807a f5983b = AbstractC0808b.m2014d(AbstractC1375a.class);

    /* renamed from: a */
    public final WeakReference f5984a;

    public AbstractC1375a(C1322a c1322a) {
        this.f5984a = new WeakReference(c1322a);
    }

    /* renamed from: b */
    public static String m3144b(byte[] bArr) throws IOException {
        InterfaceC0807a interfaceC0807a = f5983b;
        if (interfaceC0807a.mo121d()) {
            interfaceC0807a.mo127k("Extract Application label");
        }
        byte[] bArrM3158b = AbstractC1385d.m3158b(bArr, AbstractC1252b.f5095s);
        if (bArrM3158b == null) {
            bArrM3158b = AbstractC1385d.m3158b(bArr, AbstractC1252b.f5079c);
        }
        if (bArrM3158b != null) {
            return new String(bArrM3158b);
        }
        return null;
    }

    /* renamed from: d */
    public final void m3145d(byte[] bArr) throws IOException {
        byte[] bArrM3158b = AbstractC1385d.m3158b(bArr, AbstractC1252b.f5093q);
        WeakReference weakReference = this.f5984a;
        if (bArrM3158b != null) {
            C1278f c1278f = ((C1322a) weakReference.get()).f5645e;
            new String(bArrM3158b);
            c1278f.getClass();
        }
        byte[] bArrM3158b2 = AbstractC1385d.m3158b(bArr, AbstractC1252b.f5092p);
        if (bArrM3158b2 != null) {
            C1278f c1278f2 = ((C1322a) weakReference.get()).f5645e;
            new String(bArrM3158b2);
            c1278f2.getClass();
        }
    }

    /* renamed from: e */
    public final void m3146e(byte[] bArr) throws IOException {
        String[] strArrM1423g;
        byte[] bArrM3158b = AbstractC1385d.m3158b(bArr, AbstractC1252b.f5090n);
        if (bArrM3158b == null || (strArrM1423g = AbstractC0618a.m1423g(new String(bArrM3158b).trim())) == null || strArrM1423g.length <= 0) {
            return;
        }
        WeakReference weakReference = this.f5984a;
        C1278f c1278f = ((C1322a) weakReference.get()).f5645e;
        AbstractC0618a.m1424h(strArrM1423g[0]);
        c1278f.getClass();
        if (strArrM1423g.length == 2) {
            C1278f c1278f2 = ((C1322a) weakReference.get()).f5645e;
            AbstractC0618a.m1424h(strArrM1423g[1]);
            c1278f2.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:19:0x00a7, B:21:0x00b3, B:23:0x00be, B:26:0x00ce, B:28:0x00d2, B:31:0x00dd, B:33:0x00e1, B:34:0x00e5), top: B:39:0x00a7 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList m3147f(byte[] r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139v0.AbstractC1375a.m3147f(byte[]):java.util.ArrayList");
    }

    /* renamed from: g */
    public final void m3148g() {
        byte[] bArrM3158b;
        InterfaceC0807a interfaceC0807a = f5983b;
        if (interfaceC0807a.mo121d()) {
            interfaceC0807a.mo127k("Get Left PIN try");
        }
        C0770h c0770h = ((C1322a) this.f5984a.get()).f5642b;
        byte[] bArr = new byte[5];
        bArr[0] = (byte) 128;
        bArr[1] = (byte) 202;
        bArr[2] = (byte) 159;
        bArr[3] = (byte) 23;
        bArr[4] = (byte) (bArr[4] + ((byte) 0));
        byte[] bArrM1986l = c0770h.m1986l(bArr);
        if (!AbstractC1384c.m3156b(bArrM1986l) || (bArrM3158b = AbstractC1385d.m3158b(bArrM1986l, AbstractC1252b.f5096t)) == null) {
            return;
        }
        AbstractC0901d.m2292b(bArrM3158b);
    }

    /* renamed from: h */
    public final void m3149h() {
        byte[] bArrM3158b;
        InterfaceC0807a interfaceC0807a = f5983b;
        if (interfaceC0807a.mo121d()) {
            interfaceC0807a.mo127k("Get Transaction Counter ATC");
        }
        C0770h c0770h = ((C1322a) this.f5984a.get()).f5642b;
        byte[] bArr = new byte[5];
        bArr[0] = (byte) 128;
        bArr[1] = (byte) 202;
        bArr[2] = (byte) 159;
        bArr[3] = (byte) 54;
        bArr[4] = (byte) (bArr[4] + ((byte) 0));
        byte[] bArrM1986l = c0770h.m1986l(bArr);
        if (!AbstractC1384c.m3156b(bArrM1986l) || (bArrM3158b = AbstractC1385d.m3158b(bArrM1986l, AbstractC1252b.f5100x)) == null) {
            return;
        }
        AbstractC0901d.m2292b(bArrM3158b);
    }

    /* renamed from: i */
    public final byte[] m3150i(byte[] bArr) {
        InterfaceC0807a interfaceC0807a = f5983b;
        if (interfaceC0807a.mo121d()) {
            interfaceC0807a.mo127k("Select AID: ".concat(AbstractC0901d.m2312q(bArr, true)));
        }
        C0770h c0770h = ((C1322a) this.f5984a.get()).f5642b;
        int length = bArr == null ? 0 : bArr.length;
        int length2 = 4;
        byte[] bArr2 = new byte[((bArr == null || bArr.length == 0) ? 4 : bArr.length + 5) + 1];
        byte b = (byte) 0;
        bArr2[0] = b;
        bArr2[1] = (byte) 164;
        bArr2[2] = (byte) 4;
        bArr2[3] = b;
        if (bArr != null && bArr.length != 0) {
            bArr2[4] = (byte) length;
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
            length2 = 5 + bArr.length;
        }
        bArr2[length2] = (byte) (bArr2[length2] + b);
        return c0770h.m1986l(bArr2);
    }
}
