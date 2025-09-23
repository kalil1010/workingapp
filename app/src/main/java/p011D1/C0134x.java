package p011D1;

import java.io.Closeable;
import p131s1.AbstractC1326c;

/* renamed from: D1.x */
/* loaded from: classes.dex */
public final class C0134x implements Closeable {

    /* renamed from: a */
    public final C0132v f468a;

    /* renamed from: b */
    public final EnumC0131u f469b;

    /* renamed from: c */
    public final String f470c;

    /* renamed from: d */
    public final int f471d;

    /* renamed from: e */
    public final C0123m f472e;

    /* renamed from: f */
    public final C0124n f473f;

    /* renamed from: g */
    public final AbstractC0136z f474g;

    /* renamed from: h */
    public final C0134x f475h;

    /* renamed from: i */
    public final C0134x f476i;

    /* renamed from: j */
    public final C0134x f477j;

    /* renamed from: k */
    public final long f478k;

    /* renamed from: l */
    public final long f479l;

    /* renamed from: m */
    public final C0121k f480m;

    public C0134x(C0132v c0132v, EnumC0131u enumC0131u, String str, int i2, C0123m c0123m, C0124n c0124n, AbstractC0136z abstractC0136z, C0134x c0134x, C0134x c0134x2, C0134x c0134x3, long j2, long j3, C0121k c0121k) {
        AbstractC1326c.m3062e(c0132v, "request");
        AbstractC1326c.m3062e(enumC0131u, "protocol");
        AbstractC1326c.m3062e(str, "message");
        this.f468a = c0132v;
        this.f469b = enumC0131u;
        this.f470c = str;
        this.f471d = i2;
        this.f472e = c0123m;
        this.f473f = c0124n;
        this.f474g = abstractC0136z;
        this.f475h = c0134x;
        this.f476i = c0134x2;
        this.f477j = c0134x3;
        this.f478k = j2;
        this.f479l = j3;
        this.f480m = c0121k;
    }

    /* renamed from: g */
    public static String m370g(C0134x c0134x, String str) {
        c0134x.getClass();
        String strM351a = c0134x.f473f.m351a(str);
        if (strM351a != null) {
            return strM351a;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0136z abstractC0136z = this.f474g;
        if (abstractC0136z == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC0136z.close();
    }

    /* renamed from: h */
    public final C0133w m371h() {
        C0133w c0133w = new C0133w();
        c0133w.f455a = this.f468a;
        c0133w.f456b = this.f469b;
        c0133w.f457c = this.f471d;
        c0133w.f458d = this.f470c;
        c0133w.f459e = this.f472e;
        c0133w.f460f = this.f473f.m353c();
        c0133w.f461g = this.f474g;
        c0133w.f462h = this.f475h;
        c0133w.f463i = this.f476i;
        c0133w.f464j = this.f477j;
        c0133w.f465k = this.f478k;
        c0133w.f466l = this.f479l;
        c0133w.f467m = this.f480m;
        return c0133w;
    }

    public final String toString() {
        return "Response{protocol=" + this.f469b + ", code=" + this.f471d + ", message=" + this.f470c + ", url=" + ((C0126p) this.f468a.f452d) + '}';
    }
}
