package p133t0;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.TreeSet;
import p093e2.AbstractC0901d;
import p120o0.AbstractC1252b;
import p120o0.C1251a;
import p123p0.C1266b;
import p125q0.AbstractC1277e;
import p125q0.C1281i;

/* renamed from: t0.b */
/* loaded from: classes.dex */
public final class C1348b {

    /* renamed from: c */
    public static final Class[] f5715c = {C1281i.class, AbstractC1277e.class};

    /* renamed from: d */
    public static final C1348b f5716d = new C1348b();

    /* renamed from: a */
    public final HashMap f5717a = new HashMap();

    /* renamed from: b */
    public final HashMap f5718b = new HashMap();

    public C1348b() throws SecurityException {
        Class[] clsArr = f5715c;
        for (int i2 = 0; i2 < 2; i2++) {
            Class cls = clsArr[i2];
            HashMap map = new HashMap();
            TreeSet treeSet = new TreeSet();
            for (Field field : cls.getDeclaredFields()) {
                C1347a c1347a = new C1347a();
                field.setAccessible(true);
                c1347a.f5710d = field;
                InterfaceC1349c interfaceC1349c = (InterfaceC1349c) field.getAnnotation(InterfaceC1349c.class);
                if (interfaceC1349c != null) {
                    c1347a.f5711e = interfaceC1349c.dateStandard();
                    c1347a.f5712f = interfaceC1349c.format();
                    c1347a.f5708b = interfaceC1349c.index();
                    c1347a.f5709c = interfaceC1349c.readHexa();
                    c1347a.f5707a = interfaceC1349c.size();
                    if (interfaceC1349c.tag() != null) {
                        c1347a.f5713g = (C1266b) AbstractC1252b.f5077a.get(new C1251a(AbstractC0901d.m2314r(interfaceC1349c.tag())));
                    }
                    map.put(c1347a.f5713g, c1347a);
                    try {
                        treeSet.add((C1347a) c1347a.clone());
                    } catch (CloneNotSupportedException unused) {
                    }
                }
            }
            this.f5718b.put(cls.getName(), treeSet);
            this.f5717a.put(cls.getName(), map);
        }
    }
}
