package p099h;

import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h.g */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0977g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c */
    public static final Class[] f4083c = {MenuItem.class};

    /* renamed from: a */
    public Object f4084a;

    /* renamed from: b */
    public Method f4085b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f4085b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f4084a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
