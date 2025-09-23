package androidx.fragment.app;

import androidx.lifecycle.AbstractC0732I;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.F */
/* loaded from: classes.dex */
public final class C0688F extends AbstractC0732I {

    /* renamed from: f */
    public final boolean f2483f;

    /* renamed from: c */
    public final HashMap f2480c = new HashMap();

    /* renamed from: d */
    public final HashMap f2481d = new HashMap();

    /* renamed from: e */
    public final HashMap f2482e = new HashMap();

    /* renamed from: g */
    public boolean f2484g = false;

    /* renamed from: h */
    public boolean f2485h = false;

    public C0688F(boolean z2) {
        this.f2483f = z2;
    }

    @Override // androidx.lifecycle.AbstractC0732I
    /* renamed from: a */
    public final void mo1694a() {
        if (C0686D.m1646D(3)) {
            toString();
        }
        this.f2484g = true;
    }

    /* renamed from: b */
    public final void m1695b(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        if (this.f2485h) {
            C0686D.m1646D(2);
        } else {
            if (this.f2480c.remove(abstractComponentCallbacksC0712o.f2632e) == null || !C0686D.m1646D(2)) {
                return;
            }
            abstractComponentCallbacksC0712o.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0688F.class == obj.getClass()) {
            C0688F c0688f = (C0688F) obj;
            if (this.f2480c.equals(c0688f.f2480c) && this.f2481d.equals(c0688f.f2481d) && this.f2482e.equals(c0688f.f2482e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2482e.hashCode() + ((this.f2481d.hashCode() + (this.f2480c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f2480c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f2481d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f2482e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
