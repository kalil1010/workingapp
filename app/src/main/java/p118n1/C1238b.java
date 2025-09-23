package p118n1;

import java.lang.reflect.InvocationTargetException;
import p116m1.C1233b;
import p131s1.AbstractC1326c;

/* renamed from: n1.b */
/* loaded from: classes.dex */
public class C1238b extends C1233b {
    @Override // p116m1.C1233b
    /* renamed from: a */
    public final void mo2868a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC1326c.m3062e(th, "cause");
        AbstractC1326c.m3062e(th2, "exception");
        Integer num = AbstractC1237a.f4965a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.mo2868a(th, th2);
        }
    }
}
