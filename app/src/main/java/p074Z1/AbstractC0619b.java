package p074Z1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Z1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0619b {

    /* renamed from: a */
    public static final HashMap f1934a;

    /* renamed from: b */
    public static final Map f1935b;

    static {
        String.valueOf('.');
        String.valueOf('$');
        HashMap map = new HashMap();
        Class cls = Boolean.TYPE;
        map.put("boolean", cls);
        Class cls2 = Byte.TYPE;
        map.put("byte", cls2);
        Class cls3 = Character.TYPE;
        map.put("char", cls3);
        Class cls4 = Short.TYPE;
        map.put("short", cls4);
        Class cls5 = Integer.TYPE;
        map.put("int", cls5);
        Class cls6 = Long.TYPE;
        map.put("long", cls6);
        Class cls7 = Double.TYPE;
        map.put("double", cls7);
        Class cls8 = Float.TYPE;
        map.put("float", cls8);
        Class cls9 = Void.TYPE;
        map.put("void", cls9);
        HashMap map2 = new HashMap();
        map2.put(cls, Boolean.class);
        map2.put(cls2, Byte.class);
        map2.put(cls3, Character.class);
        map2.put(cls4, Short.class);
        map2.put(cls5, Integer.class);
        map2.put(cls6, Long.class);
        map2.put(cls7, Double.class);
        map2.put(cls8, Float.class);
        map2.put(cls9, cls9);
        f1934a = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            Class cls10 = (Class) entry.getKey();
            Class cls11 = (Class) entry.getValue();
            if (!cls10.equals(cls11)) {
                f1934a.put(cls11, cls10);
            }
        }
        HashMap map3 = new HashMap();
        map3.put("int", "I");
        map3.put("boolean", "Z");
        map3.put("float", "F");
        map3.put("long", "J");
        map3.put("short", "S");
        map3.put("byte", "B");
        map3.put("double", "D");
        map3.put("char", "C");
        HashMap map4 = new HashMap();
        for (Map.Entry entry2 : map3.entrySet()) {
            map4.put(entry2.getValue(), entry2.getKey());
        }
        Collections.unmodifiableMap(map3);
        f1935b = Collections.unmodifiableMap(map4);
    }
}
