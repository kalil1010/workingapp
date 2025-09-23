package p116m1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p131s1.AbstractC1326c;
import p134t1.AbstractC1350a;
import p134t1.C1351b;

/* renamed from: m1.b */
/* loaded from: classes.dex */
public class C1233b {
    /* renamed from: a */
    public void mo2868a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC1326c.m3062e(th, "cause");
        AbstractC1326c.m3062e(th2, "exception");
        Method method = AbstractC1232a.f4951a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* renamed from: b */
    public AbstractC1350a mo2869b() {
        return new C1351b();
    }
}
