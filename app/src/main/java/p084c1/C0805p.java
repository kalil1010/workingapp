package p084c1;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* renamed from: c1.p */
/* loaded from: classes.dex */
public final class C0805p implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ Class f2990a;

    public C0805p(Class cls) {
        this.f2990a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() throws SecurityException {
        Field[] declaredFields = this.f2990a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
