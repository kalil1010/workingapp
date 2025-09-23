package p019G1;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import p014E1.AbstractC0145b;
import p021H1.C0194m;
import p021H1.C0195n;
import p030K1.C0315k;
import p030K1.C0320p;
import p131s1.AbstractC1326c;

/* renamed from: G1.b */
/* loaded from: classes.dex */
public final class C0168b extends AbstractC0167a {

    /* renamed from: e */
    public final /* synthetic */ int f611e;

    /* renamed from: f */
    public final /* synthetic */ Object f612f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0168b(Object obj, String str, int i2) {
        super(str, true);
        this.f611e = i2;
        this.f612f = obj;
    }

    @Override // p019G1.AbstractC0167a
    /* renamed from: a */
    public final long mo465a() throws IOException {
        switch (this.f611e) {
            case 0:
                ((C0315k) this.f612f).mo349a();
                return -1L;
            case 1:
                C0195n c0195n = (C0195n) this.f612f;
                long jNanoTime = System.nanoTime();
                Iterator it = c0195n.f731d.iterator();
                int i2 = 0;
                long j2 = Long.MIN_VALUE;
                C0194m c0194m = null;
                int i3 = 0;
                while (it.hasNext()) {
                    C0194m c0194m2 = (C0194m) it.next();
                    AbstractC1326c.m3061d(c0194m2, "connection");
                    synchronized (c0194m2) {
                        if (c0195n.m519b(c0194m2, jNanoTime) > 0) {
                            i3++;
                        } else {
                            i2++;
                            long j3 = jNanoTime - c0194m2.f726p;
                            if (j3 > j2) {
                                c0194m = c0194m2;
                                j2 = j3;
                            }
                        }
                    }
                }
                long j4 = c0195n.f728a;
                if (j2 < j4 && i2 <= 5) {
                    if (i2 > 0) {
                        return j4 - j2;
                    }
                    if (i3 > 0) {
                        return j4;
                    }
                    return -1L;
                }
                AbstractC1326c.m3059b(c0194m);
                synchronized (c0194m) {
                    if (!c0194m.f725o.isEmpty()) {
                        return 0L;
                    }
                    if (c0194m.f726p + j2 != jNanoTime) {
                        return 0L;
                    }
                    c0194m.f719i = true;
                    c0195n.f731d.remove(c0194m);
                    Socket socket = c0194m.f713c;
                    AbstractC1326c.m3059b(socket);
                    AbstractC0145b.m392e(socket);
                    if (!c0195n.f731d.isEmpty()) {
                        return 0L;
                    }
                    c0195n.f729b.m466a();
                    return 0L;
                }
            default:
                C0320p c0320p = (C0320p) this.f612f;
                c0320p.getClass();
                try {
                    c0320p.f1008x.m876l(2, 0, false);
                    return -1L;
                } catch (IOException e3) {
                    c0320p.m844g(2, 2, e3);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0168b(String str, C0320p c0320p) {
        super(str, true);
        this.f611e = 2;
        this.f612f = c0320p;
    }
}
