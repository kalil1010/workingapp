package p011D1;

import p001A0.C0004c;

/* renamed from: D1.w */
/* loaded from: classes.dex */
public final class C0133w {

    /* renamed from: a */
    public C0132v f455a;

    /* renamed from: b */
    public EnumC0131u f456b;

    /* renamed from: d */
    public String f458d;

    /* renamed from: e */
    public C0123m f459e;

    /* renamed from: g */
    public AbstractC0136z f461g;

    /* renamed from: h */
    public C0134x f462h;

    /* renamed from: i */
    public C0134x f463i;

    /* renamed from: j */
    public C0134x f464j;

    /* renamed from: k */
    public long f465k;

    /* renamed from: l */
    public long f466l;

    /* renamed from: m */
    public C0121k f467m;

    /* renamed from: c */
    public int f457c = -1;

    /* renamed from: f */
    public C0004c f460f = new C0004c(8);

    /* renamed from: b */
    public static void m368b(C0134x c0134x, String str) {
        if (c0134x != null) {
            if (c0134x.f474g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (c0134x.f475h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c0134x.f476i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c0134x.f477j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* renamed from: a */
    public final C0134x m369a() {
        int i2 = this.f457c;
        if (i2 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f457c).toString());
        }
        C0132v c0132v = this.f455a;
        if (c0132v == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC0131u enumC0131u = this.f456b;
        if (enumC0131u == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f458d;
        if (str != null) {
            return new C0134x(c0132v, enumC0131u, str, i2, this.f459e, this.f460f.m29p(), this.f461g, this.f462h, this.f463i, this.f464j, this.f465k, this.f466l, this.f467m);
        }
        throw new IllegalStateException("message == null");
    }
}
