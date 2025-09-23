package p111l;

import java.util.HashMap;

/* renamed from: l.a */
/* loaded from: classes.dex */
public final class C1219a extends C1224f {

    /* renamed from: e */
    public final HashMap f4907e = new HashMap();

    @Override // p111l.C1224f
    /* renamed from: a */
    public final C1221c mo2854a(Object obj) {
        return (C1221c) this.f4907e.get(obj);
    }

    @Override // p111l.C1224f
    /* renamed from: b */
    public final Object mo2855b(Object obj) {
        Object objMo2855b = super.mo2855b(obj);
        this.f4907e.remove(obj);
        return objMo2855b;
    }
}
