package p025J;

/* renamed from: J.b */
/* loaded from: classes.dex */
public final class C0215b extends C0214a {

    /* renamed from: c */
    public final Object f781c;

    public C0215b() {
        super(12);
        this.f781c = new Object();
    }

    @Override // p025J.C0214a
    /* renamed from: a */
    public final Object mo564a() {
        Object objMo564a;
        synchronized (this.f781c) {
            objMo564a = super.mo564a();
        }
        return objMo564a;
    }

    @Override // p025J.C0214a
    /* renamed from: c */
    public final boolean mo566c(Object obj) {
        boolean zMo566c;
        synchronized (this.f781c) {
            zMo566c = super.mo566c(obj);
        }
        return zMo566c;
    }
}
