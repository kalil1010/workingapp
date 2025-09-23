package p110k1;

import p128r1.InterfaceC1301l;
import p131s1.AbstractC1327d;

/* renamed from: k1.a */
/* loaded from: classes.dex */
public final class C1199a extends AbstractC1327d implements InterfaceC1301l {

    /* renamed from: a */
    public final /* synthetic */ int f4888a;

    /* renamed from: b */
    public final /* synthetic */ Object f4889b;

    public /* synthetic */ C1199a(int i2, Object obj) {
        this.f4888a = i2;
        this.f4889b = obj;
    }

    @Override // p128r1.InterfaceC1301l
    /* renamed from: b */
    public Object mo1460b(Object obj) {
        return obj == ((AbstractC1203e) this.f4889b) ? "(this Collection)" : String.valueOf(obj);
    }
}
