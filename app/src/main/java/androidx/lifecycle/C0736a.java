package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public final class C0736a {

    /* renamed from: a */
    public final HashMap f2712a = new HashMap();

    /* renamed from: b */
    public final HashMap f2713b;

    public C0736a(HashMap map) {
        this.f2713b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0747l enumC0747l = (EnumC0747l) entry.getValue();
            List arrayList = (List) this.f2712a.get(enumC0747l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2712a.put(enumC0747l, arrayList);
            }
            arrayList.add((C0737b) entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m1774a(List list, InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l, InterfaceC0752q interfaceC0752q) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0737b c0737b = (C0737b) list.get(size);
                c0737b.getClass();
                try {
                    int i2 = c0737b.f2714a;
                    Method method = c0737b.f2715b;
                    if (i2 == 0) {
                        method.invoke(interfaceC0752q, new Object[0]);
                    } else if (i2 == 1) {
                        method.invoke(interfaceC0752q, interfaceC0753r);
                    } else if (i2 == 2) {
                        method.invoke(interfaceC0752q, interfaceC0753r, enumC0747l);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}
