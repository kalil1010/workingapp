package p021H1;

import p011D1.C0111a;
import p011D1.C0115e;
import p011D1.C0123m;
import p033L1.AbstractC0364l;
import p128r1.InterfaceC1290a;
import p131s1.AbstractC1326c;
import p131s1.AbstractC1327d;

/* renamed from: H1.k */
/* loaded from: classes.dex */
public final class C0192k extends AbstractC1327d implements InterfaceC1290a {

    /* renamed from: a */
    public final /* synthetic */ C0115e f706a;

    /* renamed from: b */
    public final /* synthetic */ C0123m f707b;

    /* renamed from: c */
    public final /* synthetic */ C0111a f708c;

    public C0192k(C0115e c0115e, C0123m c0123m, C0111a c0111a) {
        this.f706a = c0115e;
        this.f707b = c0123m;
        this.f708c = c0111a;
    }

    @Override // p128r1.InterfaceC1290a
    /* renamed from: a */
    public final Object mo349a() {
        AbstractC0364l abstractC0364l = this.f706a.f308b;
        AbstractC1326c.m3059b(abstractC0364l);
        return abstractC0364l.mo1031s(this.f707b.m350a(), this.f708c.f279a.f376e);
    }
}
