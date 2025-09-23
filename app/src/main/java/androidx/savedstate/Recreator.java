package androidx.savedstate;

import android.os.Bundle;
import androidx.fragment.app.C0713p;
import androidx.lifecycle.AbstractC0732I;
import androidx.lifecycle.C0734K;
import androidx.lifecycle.C0744i;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.EnumC0747l;
import androidx.lifecycle.InterfaceC0735L;
import androidx.lifecycle.InterfaceC0751p;
import androidx.lifecycle.InterfaceC0753r;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p006C.AbstractC0075g;
import p097g0.C0968d;
import p097g0.InterfaceC0966b;
import p097g0.InterfaceC0969e;
import p131s1.AbstractC1326c;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0751p {

    /* renamed from: a */
    public final InterfaceC0969e f2871a;

    public Recreator(InterfaceC0969e interfaceC0969e) {
        this.f2871a = interfaceC0969e;
    }

    @Override // androidx.lifecycle.InterfaceC0751p
    /* renamed from: b */
    public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        boolean z2;
        if (enumC0747l != EnumC0747l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0753r.mo1453e().m1784f(this);
        Bundle bundleM2476c = this.f2871a.mo1451b().m2476c("androidx.savedstate.Restarter");
        if (bundleM2476c == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM2476c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0966b.class);
                AbstractC1326c.m3061d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        AbstractC1326c.m3061d(objNewInstance, "{\n                constr…wInstance()\n            }");
                        InterfaceC0969e interfaceC0969e = this.f2871a;
                        if (!(interfaceC0969e instanceof InterfaceC0735L)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        C0734K c0734kMo1452c = ((InterfaceC0735L) interfaceC0969e).mo1452c();
                        C0968d c0968dMo1451b = interfaceC0969e.mo1451b();
                        c0734kMo1452c.getClass();
                        Iterator it = new HashSet(c0734kMo1452c.f2707a.keySet()).iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            AbstractC1326c.m3062e(str2, "key");
                            AbstractC0732I abstractC0732I = (AbstractC0732I) c0734kMo1452c.f2707a.get(str2);
                            AbstractC1326c.m3059b(abstractC0732I);
                            C0755t c0755tMo1453e = interfaceC0969e.mo1453e();
                            AbstractC1326c.m3062e(c0968dMo1451b, "registry");
                            AbstractC1326c.m3062e(c0755tMo1453e, "lifecycle");
                            HashMap map = abstractC0732I.f2703a;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = abstractC0732I.f2703a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z2 = savedStateHandleController.f2711a)) {
                                if (z2) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f2711a = true;
                                c0755tMo1453e.m1779a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(c0734kMo1452c.f2707a.keySet()).isEmpty()) {
                            if (!c0968dMo1451b.f4060c) {
                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                            }
                            C0713p c0713p = (C0713p) c0968dMo1451b.f4063f;
                            if (c0713p == null) {
                                c0713p = new C0713p(c0968dMo1451b);
                            }
                            c0968dMo1451b.f4063f = c0713p;
                            try {
                                C0744i.class.getDeclaredConstructor(new Class[0]);
                                C0713p c0713p2 = (C0713p) c0968dMo1451b.f4063f;
                                if (c0713p2 != null) {
                                    ((LinkedHashSet) c0713p2.f2655b).add(C0744i.class.getName());
                                }
                            } catch (NoSuchMethodException e3) {
                                throw new IllegalArgumentException("Class " + C0744i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                            }
                        }
                    } catch (Exception e4) {
                        throw new RuntimeException("Failed to instantiate " + str, e4);
                    }
                } catch (NoSuchMethodException e5) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException(AbstractC0075g.m238g("Class ", str, " wasn't found"), e6);
            }
        }
    }
}
