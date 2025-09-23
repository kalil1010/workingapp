package p080b1;

import java.io.IOException;
import java.util.List;
import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p073Z0.InterfaceC0617m;
import p098g1.C0970a;
import p101h1.C0987a;
import p101h1.C0988b;

/* renamed from: b1.i */
/* loaded from: classes.dex */
public final class C0771i extends AbstractC0616l {

    /* renamed from: a */
    public AbstractC0616l f2888a;

    /* renamed from: b */
    public final /* synthetic */ boolean f2889b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2890c;

    /* renamed from: d */
    public final /* synthetic */ C0608d f2891d;

    /* renamed from: e */
    public final /* synthetic */ C0970a f2892e;

    /* renamed from: f */
    public final /* synthetic */ C0772j f2893f;

    public C0771i(C0772j c0772j, boolean z2, boolean z3, C0608d c0608d, C0970a c0970a) {
        this.f2893f = c0772j;
        this.f2889b = z2;
        this.f2890c = z3;
        this.f2891d = c0608d;
        this.f2892e = c0970a;
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) throws IOException {
        if (this.f2889b) {
            c0987a.m2502H();
            return null;
        }
        AbstractC0616l abstractC0616l = this.f2888a;
        if (abstractC0616l == null) {
            C0970a c0970a = this.f2892e;
            C0608d c0608d = this.f2891d;
            List<InterfaceC0617m> list = c0608d.f1925e;
            InterfaceC0617m interfaceC0617m = this.f2893f;
            if (!list.contains(interfaceC0617m)) {
                interfaceC0617m = c0608d.f1924d;
            }
            boolean z2 = false;
            for (InterfaceC0617m interfaceC0617m2 : list) {
                if (z2) {
                    AbstractC0616l abstractC0616lMo1416a = interfaceC0617m2.mo1416a(c0608d, c0970a);
                    if (abstractC0616lMo1416a != null) {
                        this.f2888a = abstractC0616lMo1416a;
                        abstractC0616l = abstractC0616lMo1416a;
                    }
                } else if (interfaceC0617m2 == interfaceC0617m) {
                    z2 = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c0970a);
        }
        return abstractC0616l.mo1406a(c0987a);
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) throws IOException {
        if (this.f2890c) {
            c0988b.m2532o();
            return;
        }
        AbstractC0616l abstractC0616l = this.f2888a;
        if (abstractC0616l == null) {
            C0970a c0970a = this.f2892e;
            C0608d c0608d = this.f2891d;
            List<InterfaceC0617m> list = c0608d.f1925e;
            InterfaceC0617m interfaceC0617m = this.f2893f;
            if (!list.contains(interfaceC0617m)) {
                interfaceC0617m = c0608d.f1924d;
            }
            boolean z2 = false;
            for (InterfaceC0617m interfaceC0617m2 : list) {
                if (z2) {
                    AbstractC0616l abstractC0616lMo1416a = interfaceC0617m2.mo1416a(c0608d, c0970a);
                    if (abstractC0616lMo1416a != null) {
                        this.f2888a = abstractC0616lMo1416a;
                        abstractC0616l = abstractC0616lMo1416a;
                    }
                } else if (interfaceC0617m2 == interfaceC0617m) {
                    z2 = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c0970a);
        }
        abstractC0616l.mo1407b(c0988b, obj);
    }
}
