package p142w0;

import p085c2.AbstractC0808b;
import p085c2.InterfaceC0807a;
import p127r0.InterfaceC1286c;

/* renamed from: w0.b */
/* loaded from: classes.dex */
public abstract class AbstractC1383b {

    /* renamed from: a */
    public static final InterfaceC0807a f6001a = AbstractC0808b.m2014d(AbstractC1383b.class);

    /* renamed from: a */
    public static InterfaceC1286c m3154a(int i2, Class cls) {
        for (InterfaceC1286c interfaceC1286c : (InterfaceC1286c[]) cls.getEnumConstants()) {
            if (interfaceC1286c.getKey() == i2) {
                return interfaceC1286c;
            }
        }
        f6001a.mo125i("Unknow value:" + i2 + " for Enum:" + cls.getName());
        return null;
    }
}
