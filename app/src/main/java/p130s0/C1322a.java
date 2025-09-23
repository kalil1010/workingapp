package p130s0;

import android.nfc.tech.IsoDep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p001A0.C0004c;
import p065W1.C0582b;
import p065W1.C0587g;
import p074Z1.AbstractC0618a;
import p080b1.C0767e;
import p080b1.C0770h;
import p085c2.AbstractC0808b;
import p085c2.InterfaceC0807a;
import p093e2.AbstractC0901d;
import p115m0.EnumC1230a;
import p120o0.AbstractC1252b;
import p120o0.C1253c;
import p123p0.C1265a;
import p123p0.C1266b;
import p125q0.C1276d;
import p125q0.C1278f;
import p142w0.AbstractC1382a;
import p142w0.AbstractC1384c;
import p142w0.AbstractC1385d;

/* renamed from: s0.a */
/* loaded from: classes.dex */
public final class C1322a {

    /* renamed from: f */
    public static final InterfaceC0807a f5639f = AbstractC0808b.m2014d(C1322a.class);

    /* renamed from: g */
    public static final byte[] f5640g = "2PAY.SYS.DDF01".getBytes();

    /* renamed from: a */
    public C1265a f5641a;

    /* renamed from: b */
    public C0770h f5642b;

    /* renamed from: c */
    public ArrayList f5643c;

    /* renamed from: d */
    public C0767e f5644d;

    /* renamed from: e */
    public C1278f f5645e;

    static {
        "1PAY.SYS.DDF01".getBytes();
    }

    /* renamed from: a */
    public static ArrayList m3053a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC1385d.m3159c(bArr, AbstractC1252b.f5080d).iterator();
        while (it.hasNext()) {
            C1253c c1253c = (C1253c) it.next();
            C1276d c1276d = new C1276d();
            Iterator it2 = AbstractC1385d.m3159c(c1253c.f5104b, AbstractC1252b.f5078b, AbstractC1252b.f5079c, AbstractC1252b.f5086j).iterator();
            while (it2.hasNext()) {
                C1253c c1253c2 = (C1253c) it2.next();
                C1266b c1266b = c1253c2.f5103a;
                C1266b c1266b2 = AbstractC1252b.f5086j;
                byte[] bArr2 = c1253c2.f5104b;
                if (c1266b == c1266b2) {
                    c1276d.f5196d = AbstractC0901d.m2292b(bArr2);
                } else if (c1266b == AbstractC1252b.f5079c) {
                    c1276d.f5195c = new String(bArr2);
                } else {
                    c1276d.f5194b = bArr2;
                    arrayList.add(c1276d);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* renamed from: b */
    public final C1278f m3054b() {
        int length;
        boolean z2;
        boolean zMo3055a;
        char c3;
        this.f5644d.getClass();
        C0770h c0770h = this.f5642b;
        boolean z3 = false;
        String strM2312q = AbstractC0901d.m2312q(((IsoDep) ((C0004c) c0770h.f2887a).f7b).getHistoricalBytes(), false);
        C1278f c1278f = this.f5645e;
        c1278f.getClass();
        InterfaceC0807a interfaceC0807a = AbstractC1382a.f5999a;
        ArrayList arrayList = new ArrayList();
        if (AbstractC0618a.m1420d(strM2312q)) {
            String strReplaceAll = AbstractC0618a.m1418b(strM2312q).replaceAll("9000$", "");
            C0587g c0587g = AbstractC1382a.f6000b;
            for (String str : c0587g.f1877b.keySet()) {
                int length2 = strReplaceAll.length() - 1;
                int length3 = str.length() - 1;
                while (true) {
                    if (length3 < 0) {
                        break;
                    }
                    if (str.charAt(length3) == '.' || str.charAt(length3) == strReplaceAll.charAt(length2)) {
                        length2--;
                        length3--;
                        if (length2 < 0) {
                            if (!str.substring(str.length() - strReplaceAll.length(), str.length()).replace(".", "").isEmpty()) {
                                arrayList.addAll(new C0582b(c0587g, str));
                            }
                        }
                    } else if (length2 != strReplaceAll.length() - 1) {
                        length2 = strReplaceAll.length() - 1;
                    } else {
                        if (length3 == str.length() - 1) {
                            break;
                        }
                        length3--;
                    }
                }
            }
        }
        InterfaceC0807a interfaceC0807a2 = f5639f;
        if (interfaceC0807a2.mo121d()) {
            interfaceC0807a2.mo127k("Try to read card with Payment System Environment");
        }
        if (interfaceC0807a2.mo121d()) {
            interfaceC0807a2.mo127k("Select PPSE Application");
        }
        byte[] bArr = f5640g;
        int length4 = bArr == null ? 0 : bArr.length;
        int i2 = 5;
        int i3 = 4;
        byte[] bArr2 = new byte[((bArr == null || bArr.length == 0) ? 4 : bArr.length + 5) + 1];
        byte b = (byte) 0;
        bArr2[0] = b;
        bArr2[1] = (byte) 164;
        bArr2[2] = (byte) 4;
        bArr2[3] = b;
        if (bArr == null || bArr.length == 0) {
            length = 4;
        } else {
            bArr2[4] = (byte) length4;
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
            length = bArr.length + 5;
        }
        bArr2[length] = (byte) (bArr2[length] + b);
        byte[] bArrM1986l = c0770h.m1986l(bArr2);
        boolean zM3156b = AbstractC1384c.m3156b(bArrM1986l);
        ArrayList arrayList2 = this.f5643c;
        ArrayList arrayList3 = c1278f.f5201e;
        if (zM3156b) {
            ArrayList arrayList4 = new ArrayList();
            byte[] bArrM3158b = AbstractC1385d.m3158b(bArrM1986l, AbstractC1252b.f5082f);
            if (bArrM3158b != null) {
                int iM2292b = AbstractC0901d.m2292b(bArrM3158b);
                if (interfaceC0807a2.mo121d()) {
                    c3 = 1;
                    interfaceC0807a2.mo127k("SFI found:" + iM2292b);
                } else {
                    c3 = 1;
                }
                int i4 = 0;
                while (i4 < 16) {
                    int i5 = (iM2292b << 3) | i3;
                    int i6 = i3;
                    byte[] bArr3 = new byte[i2];
                    bArr3[0] = b;
                    bArr3[c3] = (byte) 178;
                    bArr3[2] = (byte) i4;
                    bArr3[3] = (byte) i5;
                    bArr3[i6] = (byte) (bArr3[i6] + b);
                    byte[] bArrM1986l2 = c0770h.m1986l(bArr3);
                    if (!AbstractC1384c.m3156b(bArrM1986l2)) {
                        break;
                    }
                    arrayList4.addAll(m3053a(bArrM1986l2));
                    i4++;
                    i3 = i6;
                    i2 = 5;
                }
            } else {
                arrayList4.addAll(m3053a(bArrM1986l));
                if (interfaceC0807a2.mo121d()) {
                    interfaceC0807a2.mo127k("(FCI) Issuer Discretionary Data is already present");
                }
            }
            arrayList3.addAll(arrayList4);
            Collections.sort(arrayList3);
            Iterator it = arrayList3.iterator();
            z2 = false;
            while (it.hasNext()) {
                C1276d c1276d = (C1276d) it.next();
                String strM2312q2 = AbstractC0901d.m2312q(c1276d.f5194b, false);
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        zMo3055a = false;
                        break;
                    }
                    InterfaceC1323b interfaceC1323b = (InterfaceC1323b) it2.next();
                    if (interfaceC1323b.mo3056c() != null && interfaceC1323b.mo3056c().matcher(strM2312q2).matches()) {
                        zMo3055a = interfaceC1323b.mo3055a(c1276d);
                        break;
                    }
                }
                if (!z2 && zMo3055a) {
                    z2 = zMo3055a;
                }
            }
        } else {
            if (interfaceC0807a2.mo121d()) {
                interfaceC0807a2.mo127k("PPSE".concat(" not found -> Use kown AID"));
            }
            z2 = false;
        }
        if (!z2) {
            if (interfaceC0807a2.mo121d()) {
                interfaceC0807a2.mo127k("Try to read card with AID");
            }
            C1276d c1276d2 = new C1276d();
            EnumC1230a[] enumC1230aArrValues = EnumC1230a.values();
            int length5 = enumC1230aArrValues.length;
            int i7 = 0;
            while (i7 < length5) {
                EnumC1230a enumC1230a = enumC1230aArrValues[i7];
                byte[][] bArr4 = enumC1230a.f4941b;
                int length6 = bArr4.length;
                for (?? r10 = z3; r10 < length6; r10++) {
                    byte[] bArr5 = bArr4[r10];
                    if (bArr5 != null) {
                        c1276d2.f5194b = bArr5;
                    }
                    c1276d2.f5195c = enumC1230a.f4942c;
                    String strM2312q3 = AbstractC0901d.m2312q(bArr5, z3);
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        InterfaceC1323b interfaceC1323b2 = (InterfaceC1323b) it3.next();
                        if (interfaceC1323b2.mo3056c() != null && interfaceC1323b2.mo3056c().matcher(strM2312q3).matches() && interfaceC1323b2.mo3055a(c1276d2)) {
                            arrayList3.clear();
                            arrayList3.add(c1276d2);
                            return c1278f;
                        }
                    }
                    z3 = false;
                }
                i7++;
                z3 = false;
            }
        }
        return c1278f;
    }
}
