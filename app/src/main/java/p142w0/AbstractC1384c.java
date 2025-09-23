package p142w0;

import java.util.Arrays;
import p074Z1.AbstractC0618a;
import p085c2.AbstractC0808b;
import p085c2.InterfaceC0807a;
import p093e2.AbstractC0901d;
import p115m0.EnumC1231b;

/* renamed from: w0.c */
/* loaded from: classes.dex */
public abstract class AbstractC1384c {

    /* renamed from: a */
    public static final InterfaceC0807a f6002a = AbstractC0808b.m2014d(AbstractC1384c.class);

    /* renamed from: a */
    public static boolean m3155a(byte[] bArr, EnumC1231b... enumC1231bArr) {
        EnumC1231b enumC1231b;
        EnumC1231b enumC1231b2 = EnumC1231b.f4944c;
        if (bArr == null || bArr.length < 2) {
            enumC1231b = null;
        } else {
            EnumC1231b[] enumC1231bArrValues = EnumC1231b.values();
            int length = enumC1231bArrValues.length;
            for (int i2 = 0; i2 < length; i2++) {
                enumC1231b = enumC1231bArrValues[i2];
                byte[] bArr2 = enumC1231b.f4949a;
                if ((bArr2.length == 1 && bArr[bArr.length - 2] == bArr2[0]) || (bArr[bArr.length - 2] == bArr2[0] && bArr[bArr.length - 1] == bArr2[1])) {
                    break;
                }
            }
            enumC1231b = null;
        }
        InterfaceC0807a interfaceC0807a = f6002a;
        if (interfaceC0807a.mo121d() && bArr != null) {
            StringBuilder sb = new StringBuilder("Response Status <");
            sb.append(AbstractC0901d.m2312q(Arrays.copyOfRange(bArr, Math.max(bArr.length - 2, 0), bArr.length), false));
            sb.append("> : ");
            sb.append(enumC1231b != null ? enumC1231b.f4950b : "Unknow");
            interfaceC0807a.mo127k(sb.toString());
        }
        return enumC1231b != null && AbstractC0618a.m1417a(enumC1231bArr, enumC1231b);
    }

    /* renamed from: b */
    public static boolean m3156b(byte[] bArr) {
        return m3155a(bArr, EnumC1231b.f4947f);
    }
}
