package p020H;

import java.util.ArrayList;
import p002A1.C0019a;
import p119o.C1249k;

/* renamed from: H.e */
/* loaded from: classes.dex */
public final class C0175e {

    /* renamed from: a */
    public final /* synthetic */ int f637a;

    /* renamed from: b */
    public final /* synthetic */ Object f638b;

    public /* synthetic */ C0175e(int i2, Object obj) {
        this.f637a = i2;
        this.f638b = obj;
    }

    /* renamed from: a */
    public final void m477a(Object obj) {
        switch (this.f637a) {
            case 0:
                C0176f c0176f = (C0176f) obj;
                if (c0176f == null) {
                    c0176f = new C0176f(-3);
                }
                ((C0019a) this.f638b).m60F(c0176f);
                return;
            default:
                C0176f c0176f2 = (C0176f) obj;
                synchronized (AbstractC0177g.f643c) {
                    try {
                        C1249k c1249k = AbstractC0177g.f644d;
                        ArrayList arrayList = (ArrayList) c1249k.getOrDefault((String) this.f638b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c1249k.remove((String) this.f638b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((C0175e) arrayList.get(i2)).m477a(c0176f2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
