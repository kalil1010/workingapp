package p107j1;

import java.io.Serializable;
import p128r1.InterfaceC1290a;
import p131s1.AbstractC1326c;
import p131s1.AbstractC1327d;

/* renamed from: j1.b */
/* loaded from: classes.dex */
public final class C1179b implements Serializable {

    /* renamed from: a */
    public AbstractC1327d f4797a;

    /* renamed from: b */
    public volatile Object f4798b = C1180c.f4800b;

    /* renamed from: c */
    public final Object f4799c = this;

    /* JADX WARN: Multi-variable type inference failed */
    public C1179b(InterfaceC1290a interfaceC1290a) {
        this.f4797a = (AbstractC1327d) interfaceC1290a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, r1.a, s1.d] */
    /* renamed from: a */
    public final Object m2830a() {
        Object objMo349a;
        Object obj = this.f4798b;
        C1180c c1180c = C1180c.f4800b;
        if (obj != c1180c) {
            return obj;
        }
        synchronized (this.f4799c) {
            objMo349a = this.f4798b;
            if (objMo349a == c1180c) {
                ?? r12 = this.f4797a;
                AbstractC1326c.m3059b(r12);
                objMo349a = r12.mo349a();
                this.f4798b = objMo349a;
                this.f4797a = null;
            }
        }
        return objMo349a;
    }

    public final String toString() {
        return this.f4798b != C1180c.f4800b ? String.valueOf(m2830a()) : "Lazy value not initialized yet.";
    }
}
