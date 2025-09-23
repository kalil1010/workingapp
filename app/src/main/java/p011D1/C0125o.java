package p011D1;

import java.util.ArrayList;
import java.util.Iterator;
import p110k1.AbstractC1209k;
import p131s1.AbstractC1326c;

/* renamed from: D1.o */
/* loaded from: classes.dex */
public final class C0125o {

    /* renamed from: a */
    public String f363a;

    /* renamed from: d */
    public String f366d;

    /* renamed from: f */
    public final ArrayList f368f;

    /* renamed from: g */
    public ArrayList f369g;

    /* renamed from: h */
    public String f370h;

    /* renamed from: b */
    public String f364b = "";

    /* renamed from: c */
    public String f365c = "";

    /* renamed from: e */
    public int f367e = -1;

    public C0125o() {
        ArrayList arrayList = new ArrayList();
        this.f368f = arrayList;
        arrayList.add("");
    }

    /* renamed from: a */
    public final C0126p m355a() {
        ArrayList arrayList;
        String str = this.f363a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strM322f = C0112b.m322f(this.f364b, 0, 0, 7);
        String strM322f2 = C0112b.m322f(this.f365c, 0, 0, 7);
        String str2 = this.f366d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iM356b = m356b();
        ArrayList arrayList2 = this.f368f;
        ArrayList arrayList3 = new ArrayList(AbstractC1209k.m2850x0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0112b.m322f((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f369g;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC1209k.m2850x0(arrayList4));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? C0112b.m322f(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = this.f370h;
        return new C0126p(str, strM322f, strM322f2, str2, iM356b, arrayList3, arrayList, str4 != null ? C0112b.m322f(str4, 0, 0, 7) : null, toString());
    }

    /* renamed from: b */
    public final int m356b() {
        int i2 = this.f367e;
        if (i2 != -1) {
            return i2;
        }
        String str = this.f363a;
        AbstractC1326c.m3059b(str);
        int iHashCode = str.hashCode();
        return iHashCode != 3213448 ? (iHashCode == 99617003 && str.equals("https")) ? 443 : -1 : str.equals("http") ? 80 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m357c(p011D1.C0126p r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p011D1.C0125o.m357c(D1.p, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p011D1.C0125o.toString():java.lang.String");
    }
}
