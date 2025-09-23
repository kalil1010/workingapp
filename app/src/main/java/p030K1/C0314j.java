package p030K1;

import java.io.IOException;
import p019G1.AbstractC0167a;
import p033L1.C0366n;
import p131s1.AbstractC1326c;
import p131s1.C1329f;

/* renamed from: K1.j */
/* loaded from: classes.dex */
public final class C0314j extends AbstractC0167a {

    /* renamed from: e */
    public final /* synthetic */ int f965e;

    /* renamed from: f */
    public final /* synthetic */ C0315k f966f;

    /* renamed from: g */
    public final /* synthetic */ Object f967g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0314j(String str, C0315k c0315k, Object obj, int i2) {
        super(str, true);
        this.f965e = i2;
        this.f966f = c0315k;
        this.f967g = obj;
    }

    @Override // p019G1.AbstractC0167a
    /* renamed from: a */
    public final long mo465a() {
        long jM829a;
        C0327w[] c0327wArr;
        C0327w[] c0327wArr2;
        int i2 = 0;
        switch (this.f965e) {
            case 0:
                C0320p c0320p = this.f966f.f969b;
                c0320p.f985a.mo507a(c0320p, (C0303B) ((C1329f) this.f967g).f5650b);
                return -1L;
            case 1:
                try {
                    this.f966f.f969b.f985a.mo508b((C0327w) this.f967g);
                } catch (IOException e3) {
                    C0366n c0366n = C0366n.f1131a;
                    C0366n c0366n2 = C0366n.f1131a;
                    String str = "Http2Connection.Listener failure for " + this.f966f.f969b.f987c;
                    c0366n2.getClass();
                    C0366n.m1032i(str, 4, e3);
                    try {
                        ((C0327w) this.f967g).m862c(2, e3);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                C0315k c0315k = this.f966f;
                C0303B c0303b = (C0303B) this.f967g;
                c0315k.getClass();
                C1329f c1329f = new C1329f(0);
                synchronized (c0315k.f969b.f1008x) {
                    synchronized (c0315k.f969b) {
                        try {
                            C0303B c0303b2 = c0315k.f969b.f1002r;
                            C0303B c0303b3 = new C0303B();
                            c0303b3.m830b(c0303b2);
                            c0303b3.m830b(c0303b);
                            c1329f.f5650b = c0303b3;
                            jM829a = c0303b3.m829a() - c0303b2.m829a();
                            if (jM829a == 0 || c0315k.f969b.f986b.isEmpty()) {
                                c0327wArr = null;
                            } else {
                                Object[] array = c0315k.f969b.f986b.values().toArray(new C0327w[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                                c0327wArr = (C0327w[]) array;
                            }
                            c0327wArr2 = c0327wArr;
                            C0320p c0320p2 = c0315k.f969b;
                            C0303B c0303b4 = (C0303B) c1329f.f5650b;
                            c0320p2.getClass();
                            AbstractC1326c.m3062e(c0303b4, "<set-?>");
                            c0320p2.f1002r = c0303b4;
                            c0315k.f969b.f994j.m468c(new C0314j(c0315k.f969b.f987c + " onSettings", c0315k, c1329f, i2), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c0315k.f969b.f1008x.m871g((C0303B) c1329f.f5650b);
                    } catch (IOException e4) {
                        c0315k.f969b.m844g(2, 2, e4);
                    }
                }
                C0327w[] c0327wArr3 = c0327wArr2;
                if (c0327wArr3 != null) {
                    int length = c0327wArr3.length;
                    while (i2 < length) {
                        C0327w c0327w = c0327wArr3[i2];
                        synchronized (c0327w) {
                            c0327w.f1042d += jM829a;
                            if (jM829a > 0) {
                                c0327w.notifyAll();
                            }
                        }
                        i2++;
                    }
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0314j(String str, C0327w c0327w, C0315k c0315k) {
        super(str, true);
        this.f965e = 1;
        this.f967g = c0327w;
        this.f966f = c0315k;
    }
}
