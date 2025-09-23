package p131s1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p033L1.AbstractC0356d;
import p107j1.C1178a;
import p110k1.AbstractC1209k;
import p110k1.AbstractC1218t;
import p110k1.C1199a;
import p128r1.InterfaceC1290a;
import p128r1.InterfaceC1291b;
import p128r1.InterfaceC1292c;
import p128r1.InterfaceC1293d;
import p128r1.InterfaceC1294e;
import p128r1.InterfaceC1295f;
import p128r1.InterfaceC1296g;
import p128r1.InterfaceC1297h;
import p128r1.InterfaceC1298i;
import p128r1.InterfaceC1299j;
import p128r1.InterfaceC1300k;
import p128r1.InterfaceC1301l;
import p128r1.InterfaceC1302m;
import p128r1.InterfaceC1303n;
import p128r1.InterfaceC1304o;
import p128r1.InterfaceC1305p;
import p128r1.InterfaceC1306q;
import p128r1.InterfaceC1307r;
import p128r1.InterfaceC1308s;
import p128r1.InterfaceC1309t;
import p128r1.InterfaceC1310u;
import p128r1.InterfaceC1311v;
import p143w1.InterfaceC1387a;
import p149y1.AbstractC1411i;

/* renamed from: s1.b */
/* loaded from: classes.dex */
public final class C1325b implements InterfaceC1387a, InterfaceC1324a {

    /* renamed from: b */
    public static final Map f5646b;

    /* renamed from: a */
    public final Class f5647a;

    static {
        List listAsList = Arrays.asList(InterfaceC1290a.class, InterfaceC1301l.class, C1199a.class, InterfaceC1305p.class, InterfaceC1306q.class, InterfaceC1307r.class, InterfaceC1308s.class, InterfaceC1309t.class, InterfaceC1310u.class, InterfaceC1311v.class, InterfaceC1291b.class, InterfaceC1292c.class, InterfaceC1293d.class, InterfaceC1294e.class, InterfaceC1295f.class, InterfaceC1296g.class, InterfaceC1297h.class, InterfaceC1298i.class, InterfaceC1299j.class, InterfaceC1300k.class, InterfaceC1302m.class, InterfaceC1303n.class, InterfaceC1304o.class);
        AbstractC1326c.m3061d(listAsList, "asList(this)");
        ArrayList arrayList = new ArrayList(AbstractC1209k.m2850x0(listAsList));
        int i2 = 0;
        for (Object obj : listAsList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C1178a((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f5646b = AbstractC1218t.m2853M(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC1326c.m3061d(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC1326c.m3061d(str, "kotlinName");
            sb.append(AbstractC1411i.m3189d0(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f5646b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1218t.m2852L(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC1411i.m3189d0((String) entry2.getValue()));
        }
    }

    public C1325b(Class cls) {
        this.f5647a = cls;
    }

    @Override // p131s1.InterfaceC1324a
    /* renamed from: a */
    public final Class mo3057a() {
        return this.f5647a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1325b) && AbstractC0356d.m970u(this).equals(AbstractC0356d.m970u((InterfaceC1387a) obj));
    }

    public final int hashCode() {
        return AbstractC0356d.m970u(this).hashCode();
    }

    public final String toString() {
        return this.f5647a.toString() + " (Kotlin reflection is not available)";
    }
}
