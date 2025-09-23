package p111l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l.f */
/* loaded from: classes.dex */
public class C1224f implements Iterable {

    /* renamed from: a */
    public C1221c f4918a;

    /* renamed from: b */
    public C1221c f4919b;

    /* renamed from: c */
    public final WeakHashMap f4920c = new WeakHashMap();

    /* renamed from: d */
    public int f4921d = 0;

    /* renamed from: a */
    public C1221c mo2854a(Object obj) {
        C1221c c1221c = this.f4918a;
        while (c1221c != null && !c1221c.f4911a.equals(obj)) {
            c1221c = c1221c.f4913c;
        }
        return c1221c;
    }

    /* renamed from: b */
    public Object mo2855b(Object obj) {
        C1221c c1221cMo2854a = mo2854a(obj);
        if (c1221cMo2854a == null) {
            return null;
        }
        this.f4921d--;
        WeakHashMap weakHashMap = this.f4920c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1223e) it.next()).mo2856a(c1221cMo2854a);
            }
        }
        C1221c c1221c = c1221cMo2854a.f4914d;
        if (c1221c != null) {
            c1221c.f4913c = c1221cMo2854a.f4913c;
        } else {
            this.f4918a = c1221cMo2854a.f4913c;
        }
        C1221c c1221c2 = c1221cMo2854a.f4913c;
        if (c1221c2 != null) {
            c1221c2.f4914d = c1221c;
        } else {
            this.f4919b = c1221c;
        }
        c1221cMo2854a.f4913c = null;
        c1221cMo2854a.f4914d = null;
        return c1221cMo2854a.f4912b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p111l.C1220b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p111l.C1224f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l.f r7 = (p111l.C1224f) r7
            int r1 = r6.f4921d
            int r3 = r7.f4921d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            l.b r3 = (p111l.C1220b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            l.b r4 = (p111l.C1220b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            l.b r7 = (p111l.C1220b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p111l.C1224f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C1220b c1220b = (C1220b) it;
            if (!c1220b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c1220b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1220b c1220b = new C1220b(this.f4918a, this.f4919b, 0);
        this.f4920c.put(c1220b, Boolean.FALSE);
        return c1220b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1220b c1220b = (C1220b) it;
            if (!c1220b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1220b.next()).toString());
            if (c1220b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
