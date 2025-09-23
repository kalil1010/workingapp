package p084c1;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p033L1.AbstractC0364l;
import p073Z0.AbstractC0616l;
import p073Z0.C0611g;
import p092e1.AbstractC0897c;
import p101h1.C0987a;
import p101h1.C0988b;

/* renamed from: c1.j */
/* loaded from: classes.dex */
public abstract class AbstractC0799j extends AbstractC0616l {

    /* renamed from: a */
    public final LinkedHashMap f2974a;

    public AbstractC0799j(LinkedHashMap linkedHashMap) {
        this.f2974a = linkedHashMap;
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) throws IOException {
        if (c0987a.m2496B() == 9) {
            c0987a.m2521x();
            return null;
        }
        Object objMo2006c = mo2006c();
        try {
            c0987a.m2505h();
            while (c0987a.m2512o()) {
                C0798i c0798i = (C0798i) this.f2974a.get(c0987a.m2519v());
                if (c0798i == null || !c0798i.f2966e) {
                    c0987a.m2502H();
                } else {
                    mo2008e(objMo2006c, c0987a, c0798i);
                }
            }
            c0987a.m2509l();
            return mo2007d(objMo2006c);
        } catch (IllegalAccessException e3) {
            AbstractC0364l abstractC0364l = AbstractC0897c.f3726a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (IllegalStateException e4) {
            throw new C0611g(e4);
        }
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            c0988b.m2532o();
            return;
        }
        c0988b.m2526i();
        try {
            Iterator it = this.f2974a.values().iterator();
            while (it.hasNext()) {
                ((C0798i) it.next()).m2005a(c0988b, obj);
            }
            c0988b.m2529l();
        } catch (IllegalAccessException e3) {
            AbstractC0364l abstractC0364l = AbstractC0897c.f3726a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        }
    }

    /* renamed from: c */
    public abstract Object mo2006c();

    /* renamed from: d */
    public abstract Object mo2007d(Object obj);

    /* renamed from: e */
    public abstract void mo2008e(Object obj, C0987a c0987a, C0798i c0798i);
}
