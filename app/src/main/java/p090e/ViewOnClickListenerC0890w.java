package p090e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.w */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0890w implements View.OnClickListener {

    /* renamed from: a */
    public final View f3708a;

    /* renamed from: b */
    public final String f3709b;

    /* renamed from: c */
    public Method f3710c;

    /* renamed from: d */
    public Context f3711d;

    public ViewOnClickListenerC0890w(View view, String str) {
        this.f3708a = view;
        this.f3709b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f3710c == null) {
            View view2 = this.f3708a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f3709b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f3710c = method;
                        this.f3711d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f3710c.invoke(this.f3711d, view);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("Could not execute method for android:onClick", e4);
        }
    }
}
