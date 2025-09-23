package p033L1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p131s1.AbstractC1326c;

/* renamed from: L1.i */
/* loaded from: classes.dex */
public final class C0361i implements InvocationHandler {

    /* renamed from: a */
    public boolean f1115a;

    /* renamed from: b */
    public String f1116b;

    /* renamed from: c */
    public final ArrayList f1117c;

    public C0361i(ArrayList arrayList) {
        this.f1117c = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC1326c.m3062e(obj, "proxy");
        AbstractC1326c.m3062e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC1326c.m3058a(name, "supports") && AbstractC1326c.m3058a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC1326c.m3058a(name, "unsupported") && AbstractC1326c.m3058a(Void.TYPE, returnType)) {
            this.f1115a = true;
            return null;
        }
        boolean zM3058a = AbstractC1326c.m3058a(name, "protocols");
        ArrayList arrayList = this.f1117c;
        if (zM3058a && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC1326c.m3058a(name, "selectProtocol") || AbstractC1326c.m3058a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj3 = list.get(i2);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i2 == size) {
                                break;
                            }
                            i2++;
                        } else {
                            this.f1116b = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f1116b = str2;
                return str2;
            }
        }
        if ((!AbstractC1326c.m3058a(name, "protocolSelected") && !AbstractC1326c.m3058a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f1116b = (String) obj4;
        return null;
    }
}
