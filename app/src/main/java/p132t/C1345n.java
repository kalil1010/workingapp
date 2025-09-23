package p132t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p006C.AbstractC0075g;
import p080b1.C0767e;
import p124q.C1269c;
import p129s.AbstractC1321j;
import p129s.C1315d;
import p129s.C1316e;

/* renamed from: t.n */
/* loaded from: classes.dex */
public final class C1345n {

    /* renamed from: f */
    public static int f5691f;

    /* renamed from: a */
    public ArrayList f5692a;

    /* renamed from: b */
    public int f5693b;

    /* renamed from: c */
    public int f5694c;

    /* renamed from: d */
    public ArrayList f5695d;

    /* renamed from: e */
    public int f5696e;

    /* renamed from: a */
    public final void m3102a(ArrayList arrayList) {
        int size = this.f5692a.size();
        if (this.f5696e != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C1345n c1345n = (C1345n) arrayList.get(i2);
                if (this.f5696e == c1345n.f5693b) {
                    m3104c(this.f5694c, c1345n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: b */
    public final int m3103b(C1269c c1269c, int i2) {
        int iM2944n;
        int iM2944n2;
        ArrayList arrayList = this.f5692a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1316e c1316e = (C1316e) ((C1315d) arrayList.get(0)).f5505T;
        c1269c.m2963t();
        c1316e.mo2978b(c1269c, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((C1315d) arrayList.get(i3)).mo2978b(c1269c, false);
        }
        if (i2 == 0 && c1316e.f5575z0 > 0) {
            AbstractC1321j.m3050a(c1316e, c1269c, arrayList, 0);
        }
        if (i2 == 1 && c1316e.f5554A0 > 0) {
            AbstractC1321j.m3050a(c1316e, c1269c, arrayList, 1);
        }
        try {
            c1269c.m2959p();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        this.f5695d = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C1315d c1315d = (C1315d) arrayList.get(i4);
            C0767e c0767e = new C0767e(13);
            new WeakReference(c1315d);
            C1269c.m2944n(c1315d.f5494I);
            C1269c.m2944n(c1315d.f5495J);
            C1269c.m2944n(c1315d.f5496K);
            C1269c.m2944n(c1315d.f5497L);
            C1269c.m2944n(c1315d.f5498M);
            this.f5695d.add(c0767e);
        }
        if (i2 == 0) {
            iM2944n = C1269c.m2944n(c1316e.f5494I);
            iM2944n2 = C1269c.m2944n(c1316e.f5496K);
            c1269c.m2963t();
        } else {
            iM2944n = C1269c.m2944n(c1316e.f5495J);
            iM2944n2 = C1269c.m2944n(c1316e.f5497L);
            c1269c.m2963t();
        }
        return iM2944n2 - iM2944n;
    }

    /* renamed from: c */
    public final void m3104c(int i2, C1345n c1345n) {
        Iterator it = this.f5692a.iterator();
        while (it.hasNext()) {
            C1315d c1315d = (C1315d) it.next();
            ArrayList arrayList = c1345n.f5692a;
            if (!arrayList.contains(c1315d)) {
                arrayList.add(c1315d);
            }
            int i3 = c1345n.f5693b;
            if (i2 == 0) {
                c1315d.f5539n0 = i3;
            } else {
                c1315d.f5541o0 = i3;
            }
        }
        this.f5696e = c1345n.f5693b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f5694c;
        sb.append(i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f5693b);
        sb.append("] <");
        String string = sb.toString();
        Iterator it = this.f5692a.iterator();
        while (it.hasNext()) {
            string = string + " " + ((C1315d) it.next()).f5527h0;
        }
        return AbstractC0075g.m237f(string, " >");
    }
}
