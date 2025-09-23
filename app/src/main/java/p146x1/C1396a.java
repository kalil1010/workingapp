package p146x1;

import java.util.Iterator;
import p110k1.C1200b;

/* renamed from: x1.a */
/* loaded from: classes.dex */
public final class C1396a implements InterfaceC1397b {

    /* renamed from: a */
    public final InterfaceC1397b f6058a;

    /* renamed from: b */
    public final int f6059b;

    public C1396a(InterfaceC1397b interfaceC1397b, int i2) {
        this.f6058a = interfaceC1397b;
        this.f6059b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // p146x1.InterfaceC1397b
    public final Iterator iterator() {
        return new C1200b(this);
    }
}
