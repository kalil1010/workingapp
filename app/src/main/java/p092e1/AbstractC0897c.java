package p092e1;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p006C.AbstractC0075g;
import p033L1.AbstractC0364l;
import p073Z0.C0611g;

/* renamed from: e1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0897c {

    /* renamed from: a */
    public static final AbstractC0364l f3726a;

    static {
        AbstractC0364l c0895a;
        try {
            c0895a = new C0896b();
        } catch (NoSuchMethodException unused) {
            c0895a = new C0895a();
        }
        f3726a = c0895a;
    }

    /* renamed from: a */
    public static void m2273a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i2].getSimpleName());
        }
        sb.append(')');
    }

    /* renamed from: b */
    public static String m2274b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m2273a(constructor, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m2275c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* renamed from: d */
    public static String m2276d(AccessibleObject accessibleObject, boolean z2) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m2275c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m2273a(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m2274b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z2 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* renamed from: e */
    public static void m2277e(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e3) {
            throw new C0611g(AbstractC0075g.m238g("Failed making ", m2276d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e3);
        }
    }
}
