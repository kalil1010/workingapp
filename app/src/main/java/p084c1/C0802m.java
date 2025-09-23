package p084c1;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p077a1.InterfaceC0629b;
import p101h1.C0987a;

/* renamed from: c1.m */
/* loaded from: classes.dex */
public final class C0802m extends AbstractC0616l {

    /* renamed from: a */
    public final /* synthetic */ int f2980a;

    /* renamed from: b */
    public final Object f2981b;

    /* renamed from: c */
    public final Object f2982c;

    /* renamed from: d */
    public final Object f2983d;

    public C0802m(C0608d c0608d, AbstractC0616l abstractC0616l, Type type) {
        this.f2980a = 0;
        this.f2981b = c0608d;
        this.f2982c = abstractC0616l;
        this.f2983d = type;
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) {
        switch (this.f2980a) {
            case 0:
                return ((AbstractC0616l) this.f2982c).mo1406a(c0987a);
            default:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                String strM2523z = c0987a.m2523z();
                Enum r02 = (Enum) ((HashMap) this.f2981b).get(strM2523z);
                return r02 == null ? (Enum) ((HashMap) this.f2982c).get(strM2523z) : r02;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Type] */
    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1407b(p101h1.C0988b r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f2980a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto Lb
            r6 = 0
            goto L15
        Lb:
            java.lang.Object r0 = r4.f2983d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            r5.m2538u(r6)
            return
        L19:
            java.lang.Object r0 = r4.f2983d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L2c
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L27
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L2c
        L27:
            java.lang.Class r1 = r6.getClass()
            goto L2d
        L2c:
            r1 = r0
        L2d:
            java.lang.Object r2 = r4.f2982c
            Z0.l r2 = (p073Z0.AbstractC0616l) r2
            if (r1 == r0) goto L64
            g1.a r0 = new g1.a
            r0.<init>(r1)
            java.lang.Object r1 = r4.f2981b
            Z0.d r1 = (p073Z0.C0608d) r1
            Z0.l r0 = r1.m1410c(r0)
            boolean r1 = r0 instanceof p084c1.AbstractC0799j
            if (r1 != 0) goto L45
            goto L63
        L45:
            r1 = r2
        L46:
            boolean r3 = r1 instanceof p073Z0.C0607c
            if (r3 == 0) goto L5e
            r3 = r1
            Z0.c r3 = (p073Z0.C0607c) r3
            Z0.l r3 = r3.f1920a
            if (r3 == 0) goto L56
            if (r3 != r1) goto L54
            goto L5e
        L54:
            r1 = r3
            goto L46
        L56:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            r5.<init>(r6)
            throw r5
        L5e:
            boolean r1 = r1 instanceof p084c1.AbstractC0799j
            if (r1 != 0) goto L63
            goto L64
        L63:
            r2 = r0
        L64:
            r2.mo1407b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p084c1.C0802m.mo1407b(h1.b, java.lang.Object):void");
    }

    public C0802m(Class cls) {
        this.f2980a = 1;
        this.f2981b = new HashMap();
        this.f2982c = new HashMap();
        this.f2983d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C0805p(cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                InterfaceC0629b interfaceC0629b = (InterfaceC0629b) field.getAnnotation(InterfaceC0629b.class);
                if (interfaceC0629b != null) {
                    strName = interfaceC0629b.value();
                    for (String str : interfaceC0629b.alternate()) {
                        ((HashMap) this.f2981b).put(str, r4);
                    }
                }
                ((HashMap) this.f2981b).put(strName, r4);
                ((HashMap) this.f2982c).put(string, r4);
                ((HashMap) this.f2983d).put(r4, strName);
            }
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
