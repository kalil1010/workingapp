package p084c1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p033L1.AbstractC0364l;
import p073Z0.C0614j;
import p092e1.AbstractC0897c;
import p101h1.C0987a;

/* renamed from: c1.l */
/* loaded from: classes.dex */
public final class C0801l extends AbstractC0799j {

    /* renamed from: e */
    public static final HashMap f2976e;

    /* renamed from: b */
    public final Constructor f2977b;

    /* renamed from: c */
    public final Object[] f2978c;

    /* renamed from: d */
    public final HashMap f2979d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f2976e = map;
    }

    public C0801l(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f2979d = new HashMap();
        AbstractC0364l abstractC0364l = AbstractC0897c.f3726a;
        Constructor constructorMo1016E = abstractC0364l.mo1016E(cls);
        this.f2977b = constructorMo1016E;
        AbstractC0897c.m2277e(constructorMo1016E);
        String[] strArrMo1017K = abstractC0364l.mo1017K(cls);
        for (int i2 = 0; i2 < strArrMo1017K.length; i2++) {
            this.f2979d.put(strArrMo1017K[i2], Integer.valueOf(i2));
        }
        Class<?>[] parameterTypes = this.f2977b.getParameterTypes();
        this.f2978c = new Object[parameterTypes.length];
        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
            this.f2978c[i3] = f2976e.get(parameterTypes[i3]);
        }
    }

    @Override // p084c1.AbstractC0799j
    /* renamed from: c */
    public final Object mo2006c() {
        return (Object[]) this.f2978c.clone();
    }

    @Override // p084c1.AbstractC0799j
    /* renamed from: d */
    public final Object mo2007d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f2977b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e3) {
            AbstractC0364l abstractC0364l = AbstractC0897c.f3726a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (IllegalArgumentException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0897c.m2274b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e5) {
            e = e5;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0897c.m2274b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0897c.m2274b(constructor) + "' with args " + Arrays.toString(objArr), e6.getCause());
        }
    }

    @Override // p084c1.AbstractC0799j
    /* renamed from: e */
    public final void mo2008e(Object obj, C0987a c0987a, C0798i c0798i) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f2979d;
        String str = c0798i.f2964c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC0897c.m2274b(this.f2977b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo1406a = c0798i.f2969h.mo1406a(c0987a);
        if (objMo1406a != null || !c0798i.f2972k) {
            objArr[iIntValue] = objMo1406a;
            return;
        }
        throw new C0614j("null is not allowed as value for record component '" + str + "' of primitive type; at path " + c0987a.m2511n(false));
    }
}
