package p036M1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p011D1.C0130t;
import p019G1.C0170d;
import p030K1.AbstractC0310f;
import p110k1.C1216r;
import p131s1.AbstractC1326c;

/* renamed from: M1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0400c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet f1276a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public static final Map f1277b;

    static {
        Map mapSingletonMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C0130t.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C0130t.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC0310f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C0170d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            mapSingletonMap = C1216r.f4905a;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(linkedHashMap);
        } else {
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            AbstractC1326c.m3061d(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        }
        f1277b = mapSingletonMap;
    }
}
