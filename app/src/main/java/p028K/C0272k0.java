package p028K;

import android.view.WindowInsets;
import p006C.AbstractC0070b;
import p006C.C0072d;

/* renamed from: K.k0 */
/* loaded from: classes.dex */
public class C0272k0 extends AbstractC0276m0 {

    /* renamed from: c */
    public final WindowInsets.Builder f879c;

    public C0272k0() {
        this.f879c = AbstractC0070b.m205f();
    }

    @Override // p028K.AbstractC0276m0
    /* renamed from: b */
    public C0292u0 mo753b() {
        m782a();
        C0292u0 c0292u0M817g = C0292u0.m817g(null, this.f879c.build());
        c0292u0M817g.f910a.mo797o(this.f886b);
        return c0292u0M817g;
    }

    @Override // p028K.AbstractC0276m0
    /* renamed from: d */
    public void mo757d(C0072d c0072d) {
        this.f879c.setMandatorySystemGestureInsets(c0072d.m230d());
    }

    @Override // p028K.AbstractC0276m0
    /* renamed from: e */
    public void mo754e(C0072d c0072d) {
        this.f879c.setStableInsets(c0072d.m230d());
    }

    @Override // p028K.AbstractC0276m0
    /* renamed from: f */
    public void mo758f(C0072d c0072d) {
        this.f879c.setSystemGestureInsets(c0072d.m230d());
    }

    @Override // p028K.AbstractC0276m0
    /* renamed from: g */
    public void mo755g(C0072d c0072d) {
        this.f879c.setSystemWindowInsets(c0072d.m230d());
    }

    @Override // p028K.AbstractC0276m0
    /* renamed from: h */
    public void mo759h(C0072d c0072d) {
        this.f879c.setTappableElementInsets(c0072d.m230d());
    }

    public C0272k0(C0292u0 c0292u0) {
        WindowInsets.Builder builderM205f;
        super(c0292u0);
        WindowInsets windowInsetsM822f = c0292u0.m822f();
        if (windowInsetsM822f != null) {
            builderM205f = AbstractC0070b.m206g(windowInsetsM822f);
        } else {
            builderM205f = AbstractC0070b.m205f();
        }
        this.f879c = builderM205f;
    }
}
