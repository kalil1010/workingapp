package p028K;

import p006C.C0072d;
import p093e2.AbstractC0901d;

/* renamed from: K.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC0276m0 {

    /* renamed from: a */
    public final C0292u0 f885a;

    /* renamed from: b */
    public C0072d[] f886b;

    public AbstractC0276m0() {
        this(new C0292u0());
    }

    /* renamed from: a */
    public final void m782a() {
        C0072d[] c0072dArr = this.f886b;
        if (c0072dArr != null) {
            C0072d c0072dMo793f = c0072dArr[0];
            C0072d c0072dMo793f2 = c0072dArr[1];
            C0292u0 c0292u0 = this.f885a;
            if (c0072dMo793f2 == null) {
                c0072dMo793f2 = c0292u0.f910a.mo793f(2);
            }
            if (c0072dMo793f == null) {
                c0072dMo793f = c0292u0.f910a.mo793f(1);
            }
            mo755g(C0072d.m227a(c0072dMo793f, c0072dMo793f2));
            C0072d c0072d = this.f886b[AbstractC0901d.m2282L(16)];
            if (c0072d != null) {
                mo758f(c0072d);
            }
            C0072d c0072d2 = this.f886b[AbstractC0901d.m2282L(32)];
            if (c0072d2 != null) {
                mo757d(c0072d2);
            }
            C0072d c0072d3 = this.f886b[AbstractC0901d.m2282L(64)];
            if (c0072d3 != null) {
                mo759h(c0072d3);
            }
        }
    }

    /* renamed from: b */
    public abstract C0292u0 mo753b();

    /* renamed from: c */
    public void mo773c(int i2, C0072d c0072d) {
        if (this.f886b == null) {
            this.f886b = new C0072d[9];
        }
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                this.f886b[AbstractC0901d.m2282L(i3)] = c0072d;
            }
        }
    }

    /* renamed from: d */
    public void mo757d(C0072d c0072d) {
    }

    /* renamed from: e */
    public abstract void mo754e(C0072d c0072d);

    /* renamed from: f */
    public void mo758f(C0072d c0072d) {
    }

    /* renamed from: g */
    public abstract void mo755g(C0072d c0072d);

    /* renamed from: h */
    public void mo759h(C0072d c0072d) {
    }

    public AbstractC0276m0(C0292u0 c0292u0) {
        this.f885a = c0292u0;
    }
}
