package p110k1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p033L1.AbstractC0356d;
import p107j1.C1178a;
import p131s1.AbstractC1326c;

/* renamed from: k1.t */
/* loaded from: classes.dex */
public abstract class AbstractC1218t extends AbstractC0356d {
    /* renamed from: L */
    public static int m2852L(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: M */
    public static Map m2853M(ArrayList arrayList) {
        C1216r c1216r = C1216r.f4905a;
        int size = arrayList.size();
        if (size == 0) {
            return c1216r;
        }
        if (size == 1) {
            C1178a c1178a = (C1178a) arrayList.get(0);
            AbstractC1326c.m3062e(c1178a, "pair");
            Map mapSingletonMap = Collections.singletonMap(c1178a.f4795a, c1178a.f4796b);
            AbstractC1326c.m3061d(mapSingletonMap, "singletonMap(pair.first, pair.second)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m2852L(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1178a c1178a2 = (C1178a) it.next();
            linkedHashMap.put(c1178a2.f4795a, c1178a2.f4796b);
        }
        return linkedHashMap;
    }
}
