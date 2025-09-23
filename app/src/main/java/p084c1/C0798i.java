package p084c1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p006C.AbstractC0075g;
import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p073Z0.C0611g;
import p092e1.AbstractC0897c;
import p098g1.C0970a;
import p101h1.C0988b;

/* renamed from: c1.i */
/* loaded from: classes.dex */
public final class C0798i {

    /* renamed from: a */
    public final String f2962a;

    /* renamed from: b */
    public final Field f2963b;

    /* renamed from: c */
    public final String f2964c;

    /* renamed from: d */
    public final boolean f2965d;

    /* renamed from: e */
    public final boolean f2966e;

    /* renamed from: f */
    public final /* synthetic */ Method f2967f;

    /* renamed from: g */
    public final /* synthetic */ boolean f2968g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC0616l f2969h;

    /* renamed from: i */
    public final /* synthetic */ C0608d f2970i;

    /* renamed from: j */
    public final /* synthetic */ C0970a f2971j;

    /* renamed from: k */
    public final /* synthetic */ boolean f2972k;

    /* renamed from: l */
    public final /* synthetic */ boolean f2973l;

    public C0798i(String str, Field field, boolean z2, boolean z3, Method method, boolean z4, AbstractC0616l abstractC0616l, C0608d c0608d, C0970a c0970a, boolean z5, boolean z6) {
        this.f2967f = method;
        this.f2968g = z4;
        this.f2969h = abstractC0616l;
        this.f2970i = c0608d;
        this.f2971j = c0970a;
        this.f2972k = z5;
        this.f2973l = z6;
        this.f2962a = str;
        this.f2963b = field;
        this.f2964c = field.getName();
        this.f2965d = z2;
        this.f2966e = z3;
    }

    /* renamed from: a */
    public final void m2005a(C0988b c0988b, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        if (this.f2965d) {
            Field field = this.f2963b;
            Method method = this.f2967f;
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e3) {
                    throw new C0611g(AbstractC0075g.m238g("Accessor ", AbstractC0897c.m2276d(method, false), " threw exception"), e3.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            c0988b.m2530m(this.f2962a);
            boolean z2 = this.f2968g;
            AbstractC0616l c0802m = this.f2969h;
            if (!z2) {
                c0802m = new C0802m(this.f2970i, c0802m, this.f2971j.f4065b);
            }
            c0802m.mo1407b(c0988b, objInvoke);
        }
    }
}
