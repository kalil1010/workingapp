package p021H1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p011D1.C0111a;
import p014E1.AbstractC0145b;
import p019G1.C0168b;
import p019G1.C0169c;
import p019G1.C0170d;
import p033L1.C0366n;
import p131s1.AbstractC1326c;

/* renamed from: H1.n */
/* loaded from: classes.dex */
public final class C0195n {

    /* renamed from: a */
    public final long f728a;

    /* renamed from: b */
    public final C0169c f729b;

    /* renamed from: c */
    public final C0168b f730c;

    /* renamed from: d */
    public final ConcurrentLinkedQueue f731d;

    public C0195n(C0170d c0170d) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        AbstractC1326c.m3062e(c0170d, "taskRunner");
        AbstractC1326c.m3062e(timeUnit, "timeUnit");
        this.f728a = timeUnit.toNanos(5L);
        this.f729b = c0170d.m475e();
        this.f730c = new C0168b(this, AbstractC0145b.f501g + " ConnectionPool", 1);
        this.f731d = new ConcurrentLinkedQueue();
    }

    /* renamed from: a */
    public final boolean m518a(C0111a c0111a, C0190i c0190i, ArrayList arrayList, boolean z2) {
        AbstractC1326c.m3062e(c0190i, "call");
        Iterator it = this.f731d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            C0194m c0194m = (C0194m) it.next();
            AbstractC1326c.m3061d(c0194m, "connection");
            synchronized (c0194m) {
                if (z2) {
                    if (!(c0194m.f716f != null)) {
                    }
                }
                if (c0194m.m513h(c0111a, arrayList)) {
                    c0190i.m496b(c0194m);
                    return true;
                }
            }
        }
    }

    /* renamed from: b */
    public final int m519b(C0194m c0194m, long j2) {
        byte[] bArr = AbstractC0145b.f495a;
        ArrayList arrayList = c0194m.f725o;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                String str = "A connection to " + c0194m.f727q.f269a.f279a + " was leaked. Did you forget to close a response body?";
                C0366n c0366n = C0366n.f1131a;
                C0366n.f1131a.mo941j(((C0188g) reference).f685a, str);
                arrayList.remove(i2);
                c0194m.f719i = true;
                if (arrayList.isEmpty()) {
                    c0194m.f726p = j2 - this.f728a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
