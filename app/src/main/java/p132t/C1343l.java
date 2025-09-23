package p132t;

import java.util.ArrayList;

/* renamed from: t.l */
/* loaded from: classes.dex */
public final class C1343l {

    /* renamed from: a */
    public AbstractC1346o f5687a;

    /* renamed from: b */
    public ArrayList f5688b;

    /* renamed from: a */
    public static long m3099a(C1337f c1337f, long j2) {
        AbstractC1346o abstractC1346o = c1337f.f5675d;
        if (abstractC1346o instanceof C1341j) {
            return j2;
        }
        ArrayList arrayList = c1337f.f5682k;
        int size = arrayList.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1335d interfaceC1335d = (InterfaceC1335d) arrayList.get(i2);
            if (interfaceC1335d instanceof C1337f) {
                C1337f c1337f2 = (C1337f) interfaceC1335d;
                if (c1337f2.f5675d != abstractC1346o) {
                    jMin = Math.min(jMin, m3099a(c1337f2, c1337f2.f5677f + j2));
                }
            }
        }
        if (c1337f != abstractC1346o.f5705i) {
            return jMin;
        }
        long jMo3072j = abstractC1346o.mo3072j();
        long j3 = j2 - jMo3072j;
        return Math.min(Math.min(jMin, m3099a(abstractC1346o.f5704h, j3)), j3 - r9.f5677f);
    }

    /* renamed from: b */
    public static long m3100b(C1337f c1337f, long j2) {
        AbstractC1346o abstractC1346o = c1337f.f5675d;
        if (abstractC1346o instanceof C1341j) {
            return j2;
        }
        ArrayList arrayList = c1337f.f5682k;
        int size = arrayList.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1335d interfaceC1335d = (InterfaceC1335d) arrayList.get(i2);
            if (interfaceC1335d instanceof C1337f) {
                C1337f c1337f2 = (C1337f) interfaceC1335d;
                if (c1337f2.f5675d != abstractC1346o) {
                    jMax = Math.max(jMax, m3100b(c1337f2, c1337f2.f5677f + j2));
                }
            }
        }
        if (c1337f != abstractC1346o.f5704h) {
            return jMax;
        }
        long jMo3072j = abstractC1346o.mo3072j();
        long j3 = j2 + jMo3072j;
        return Math.max(Math.max(jMax, m3100b(abstractC1346o.f5705i, j3)), j3 - r9.f5677f);
    }
}
