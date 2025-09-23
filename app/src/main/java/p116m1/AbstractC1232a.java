package p116m1;

import java.lang.reflect.Method;
import p131s1.AbstractC1326c;

/* renamed from: m1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1232a {

    /* renamed from: a */
    public static final Method f4951a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC1326c.m3061d(methods, "throwableMethods");
        int length = methods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methods[i2];
            if (AbstractC1326c.m3058a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC1326c.m3061d(parameterTypes, "it.parameterTypes");
                if (AbstractC1326c.m3058a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i2++;
        }
        f4951a = method;
        int length2 = methods.length;
        for (int i3 = 0; i3 < length2 && !AbstractC1326c.m3058a(methods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
