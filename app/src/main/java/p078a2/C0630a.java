package p078a2;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import p125q0.AbstractC1274b;
import p125q0.C1273a;

/* renamed from: a2.a */
/* loaded from: classes.dex */
public final class C0630a {

    /* renamed from: d */
    public static volatile C0632c f1947d = AbstractC0633d.f1951q;

    /* renamed from: a */
    public final StringBuffer f1948a;

    /* renamed from: b */
    public final AbstractC1274b f1949b;

    /* renamed from: c */
    public final AbstractC0633d f1950c;

    public C0630a(AbstractC1274b abstractC1274b, C1273a c1273a) {
        AbstractC0633d abstractC0633d = c1273a == null ? f1947d : c1273a;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.f1948a = stringBuffer;
        this.f1950c = abstractC0633d;
        this.f1949b = abstractC1274b;
        if (abstractC0633d.f1954b) {
            AbstractC0633d.m1435d(abstractC1274b);
            if (abstractC0633d.f1955c) {
                stringBuffer.append(AbstractC0633d.m1434c(abstractC1274b.getClass()));
            } else {
                stringBuffer.append(abstractC1274b.getClass().getName());
            }
        }
        if (abstractC0633d.f1956d) {
            AbstractC0633d.m1435d(abstractC1274b);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(abstractC1274b)));
        }
        stringBuffer.append(abstractC0633d.f1957e);
        if (abstractC0633d.f1960h) {
            stringBuffer.append(abstractC0633d.f1961i);
        }
    }

    /* renamed from: a */
    public final void m1432a(Class cls) throws IllegalAccessException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        boolean zIsArray = cls.isArray();
        StringBuffer stringBuffer = this.f1948a;
        AbstractC0633d abstractC0633d = this.f1950c;
        AbstractC1274b abstractC1274b = this.f1949b;
        if (zIsArray) {
            stringBuffer.append(abstractC0633d.f1962j);
            int length = Array.getLength(abstractC1274b);
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = Array.get(abstractC1274b, i2);
                if (i2 > 0) {
                    stringBuffer.append(",");
                }
                if (obj == null) {
                    stringBuffer.append(abstractC0633d.f1964l);
                } else {
                    abstractC0633d.m1437a(stringBuffer, null, obj, true);
                }
            }
            stringBuffer.append(abstractC0633d.f1963k);
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if ((field.getName().indexOf(36) != -1 || Modifier.isTransient(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) ? false : !field.isAnnotationPresent(InterfaceC0631b.class)) {
                try {
                    Object obj2 = field.get(abstractC1274b);
                    Boolean boolValueOf = Boolean.valueOf(!field.isAnnotationPresent(InterfaceC0634e.class));
                    if (abstractC0633d.f1953a && name != null) {
                        stringBuffer.append(name);
                        stringBuffer.append(abstractC0633d.f1959g);
                    }
                    if (obj2 == null) {
                        stringBuffer.append(abstractC0633d.f1964l);
                    } else {
                        abstractC0633d.m1437a(stringBuffer, name, obj2, boolValueOf.booleanValue());
                    }
                    stringBuffer.append(abstractC0633d.f1961i);
                } catch (IllegalAccessException e3) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e3.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final String m1433b() {
        AbstractC0633d abstractC0633d = this.f1950c;
        StringBuffer stringBuffer = this.f1948a;
        AbstractC1274b abstractC1274b = this.f1949b;
        if (abstractC1274b == null) {
            stringBuffer.append(abstractC0633d.f1964l);
        } else {
            abstractC0633d.getClass();
            int length = stringBuffer.length();
            int length2 = abstractC0633d.f1961i.length();
            if (length > 0 && length2 > 0 && length >= length2) {
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        stringBuffer.setLength(length - length2);
                        break;
                    }
                    if (stringBuffer.charAt((length - 1) - i2) != abstractC0633d.f1961i.charAt((length2 - 1) - i2)) {
                        break;
                    }
                    i2++;
                }
            }
            stringBuffer.append(abstractC0633d.f1958f);
            AbstractC0633d.m1436e(abstractC1274b);
        }
        return stringBuffer.toString();
    }

    public final String toString() throws IllegalAccessException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        AbstractC1274b abstractC1274b = this.f1949b;
        if (abstractC1274b == null) {
            return this.f1950c.f1964l;
        }
        Class<?> superclass = abstractC1274b.getClass();
        m1432a(superclass);
        while (superclass.getSuperclass() != null) {
            superclass = superclass.getSuperclass();
            m1432a(superclass);
        }
        return m1433b();
    }
}
