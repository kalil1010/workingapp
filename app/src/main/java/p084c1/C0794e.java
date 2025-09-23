package p084c1;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import p006C.AbstractC0075g;
import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p073Z0.C0611g;
import p080b1.C0767e;
import p080b1.InterfaceC0779q;
import p101h1.C0987a;
import p101h1.C0988b;

/* renamed from: c1.e */
/* loaded from: classes.dex */
public final class C0794e extends AbstractC0616l {

    /* renamed from: a */
    public final C0802m f2952a;

    /* renamed from: b */
    public final C0802m f2953b;

    /* renamed from: c */
    public final InterfaceC0779q f2954c;

    /* renamed from: d */
    public final /* synthetic */ C0792c f2955d;

    public C0794e(C0792c c0792c, C0608d c0608d, Type type, AbstractC0616l abstractC0616l, Type type2, AbstractC0616l abstractC0616l2, InterfaceC0779q interfaceC0779q) {
        this.f2955d = c0792c;
        this.f2952a = new C0802m(c0608d, abstractC0616l, type);
        this.f2953b = new C0802m(c0608d, abstractC0616l2, type2);
        this.f2954c = interfaceC0779q;
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) throws IOException {
        int iM2496B = c0987a.m2496B();
        if (iM2496B == 9) {
            c0987a.m2521x();
            return null;
        }
        Map map = (Map) this.f2954c.mo22i();
        C0802m c0802m = this.f2953b;
        C0802m c0802m2 = this.f2952a;
        AbstractC0616l abstractC0616l = (AbstractC0616l) c0802m.f2982c;
        AbstractC0616l abstractC0616l2 = (AbstractC0616l) c0802m2.f2982c;
        if (iM2496B == 1) {
            c0987a.m2504g();
            while (c0987a.m2512o()) {
                c0987a.m2504g();
                Object objMo1406a = abstractC0616l2.mo1406a(c0987a);
                if (map.put(objMo1406a, abstractC0616l.mo1406a(c0987a)) != null) {
                    throw new C0611g("duplicate key: " + objMo1406a);
                }
                c0987a.m2508k();
            }
            c0987a.m2508k();
            return map;
        }
        c0987a.m2505h();
        while (c0987a.m2512o()) {
            C0767e.f2881b.getClass();
            int iM2507j = c0987a.f4145h;
            if (iM2507j == 0) {
                iM2507j = c0987a.m2507j();
            }
            if (iM2507j == 13) {
                c0987a.f4145h = 9;
            } else if (iM2507j == 12) {
                c0987a.f4145h = 8;
            } else {
                if (iM2507j != 14) {
                    throw new IllegalStateException("Expected a name but was " + AbstractC0075g.m242k(c0987a.m2496B()) + c0987a.m2514q());
                }
                c0987a.f4145h = 10;
            }
            Object objMo1406a2 = abstractC0616l2.mo1406a(c0987a);
            if (map.put(objMo1406a2, abstractC0616l.mo1406a(c0987a)) != null) {
                throw new C0611g("duplicate key: " + objMo1406a2);
            }
        }
        c0987a.m2509l();
        return map;
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c0988b.m2532o();
            return;
        }
        this.f2955d.getClass();
        C0802m c0802m = this.f2953b;
        c0988b.m2526i();
        for (Map.Entry entry : map.entrySet()) {
            c0988b.m2530m(String.valueOf(entry.getKey()));
            c0802m.mo1407b(c0988b, entry.getValue());
        }
        c0988b.m2529l();
    }
}
