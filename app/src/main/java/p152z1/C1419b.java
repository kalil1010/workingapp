package p152z1;

import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: z1.b */
/* loaded from: classes.dex */
public final class C1419b {

    /* renamed from: a */
    public final ArrayDeque f6103a;

    /* renamed from: b */
    public boolean f6104b;

    /* renamed from: c */
    public boolean f6105c;

    /* renamed from: d */
    public boolean f6106d;

    public C1419b(C1419b c1419b) {
        c1419b.getClass();
        ArrayDeque arrayDeque = c1419b.f6103a;
        ArrayDeque arrayDeque2 = new ArrayDeque(arrayDeque.size());
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            C1418a c1418a = (C1418a) it.next();
            arrayDeque2.addLast(new C1418a(c1418a.f6100a, c1418a.f6101b, c1418a.f6102c));
        }
        this(arrayDeque2, c1419b.f6104b, c1419b.f6105c, c1419b.f6106d);
    }

    /* renamed from: a */
    public final void m3199a(int i2) {
        ArrayDeque arrayDeque = this.f6103a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        C1418a c1418a = (C1418a) arrayDeque.peek();
        int i3 = c1418a.f6101b;
        int i4 = c1418a.f6102c;
        int i5 = i3 - i4;
        if (i2 > i5) {
            throw new IllegalArgumentException("Cannot process " + i2 + " bytes! Only " + i5 + " bytes left in this TLV object " + c1418a);
        }
        int i6 = i4 + i2;
        c1418a.f6102c = i6;
        if (i6 != i3) {
            this.f6104b = false;
            this.f6105c = false;
            this.f6106d = true;
        } else {
            arrayDeque.pop();
            m3199a(i3);
            this.f6104b = true;
            this.f6105c = false;
            this.f6106d = false;
        }
    }

    public final String toString() {
        return this.f6103a.toString();
    }

    public C1419b(ArrayDeque arrayDeque, boolean z2, boolean z3, boolean z4) {
        this.f6103a = arrayDeque;
        this.f6104b = z2;
        this.f6105c = z3;
        this.f6106d = z4;
    }
}
