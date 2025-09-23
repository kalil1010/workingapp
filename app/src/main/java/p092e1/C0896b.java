package p092e1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p033L1.AbstractC0364l;

/* renamed from: e1.b */
/* loaded from: classes.dex */
public final class C0896b extends AbstractC0364l {

    /* renamed from: f */
    public final Method f3722f = Class.class.getMethod("isRecord", new Class[0]);

    /* renamed from: g */
    public final Method f3723g;

    /* renamed from: h */
    public final Method f3724h;

    /* renamed from: i */
    public final Method f3725i;

    public C0896b() throws NoSuchMethodException, SecurityException {
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f3723g = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f3724h = componentType.getMethod("getName", new Class[0]);
        this.f3725i = componentType.getMethod("getType", new Class[0]);
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: D */
    public final Method mo1015D(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: E */
    public final Constructor mo1016E(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f3723g.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                clsArr[i2] = (Class) this.f3725i.invoke(objArr[i2], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: K */
    public final String[] mo1017K(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f3723g.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                strArr[i2] = (String) this.f3724h.invoke(objArr[i2], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: P */
    public final boolean mo1019P(Class cls) {
        try {
            return ((Boolean) this.f3722f.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }
}
