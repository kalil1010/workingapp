package p080b1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p006C.AbstractC0075g;
import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p073Z0.InterfaceC0617m;
import p098g1.C0970a;

/* renamed from: b1.j */
/* loaded from: classes.dex */
public final class C0772j implements InterfaceC0617m, Cloneable {

    /* renamed from: c */
    public static final C0772j f2894c;

    /* renamed from: a */
    public List f2895a;

    /* renamed from: b */
    public List f2896b;

    static {
        C0772j c0772j = new C0772j();
        List list = Collections.EMPTY_LIST;
        c0772j.f2895a = list;
        c0772j.f2896b = list;
        f2894c = c0772j;
    }

    /* renamed from: c */
    public static boolean m1987c(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // p073Z0.InterfaceC0617m
    /* renamed from: a */
    public final AbstractC0616l mo1416a(C0608d c0608d, C0970a c0970a) {
        boolean z2;
        boolean z3;
        boolean zM1987c = m1987c(c0970a.f4064a);
        if (zM1987c) {
            z2 = true;
        } else {
            m1988b(true);
            z2 = false;
        }
        if (zM1987c) {
            z3 = true;
        } else {
            m1988b(false);
            z3 = false;
        }
        if (z2 || z3) {
            return new C0771i(this, z3, z2, c0608d, c0970a);
        }
        return null;
    }

    /* renamed from: b */
    public final void m1988b(boolean z2) {
        Iterator it = (z2 ? this.f2895a : this.f2896b).iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
    }

    public final Object clone() {
        try {
            return (C0772j) super.clone();
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }
}
