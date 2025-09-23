package p106j0;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p119o.C1240b;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j0.q */
/* loaded from: classes.dex */
public abstract class AbstractC1168q {

    /* renamed from: a */
    public static final C1152a f4784a;

    /* renamed from: b */
    public static final ThreadLocal f4785b;

    /* renamed from: c */
    public static final ArrayList f4786c;

    static {
        C1152a c1152a = new C1152a();
        c1152a.f4718A = new ArrayList();
        c1152a.f4719B = true;
        c1152a.f4721D = false;
        c1152a.f4722E = 0;
        c1152a.f4719B = false;
        c1152a.m2782I(new C1159h(2));
        c1152a.m2782I(new C1157f());
        c1152a.m2782I(new C1159h(1));
        f4784a = c1152a;
        f4785b = new ThreadLocal();
        f4786c = new ArrayList();
    }

    /* renamed from: a */
    public static void m2817a(ViewGroup viewGroup, AbstractC1164m abstractC1164m) {
        ArrayList arrayList = f4786c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC1164m == null) {
            abstractC1164m = f4784a;
        }
        AbstractC1164m abstractC1164mClone = abstractC1164m.clone();
        ArrayList arrayList2 = (ArrayList) m2818b().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC1164m) it.next()).mo2789w(viewGroup);
            }
        }
        abstractC1164mClone.m2809h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC1167p viewTreeObserverOnPreDrawListenerC1167p = new ViewTreeObserverOnPreDrawListenerC1167p();
        viewTreeObserverOnPreDrawListenerC1167p.f4782a = abstractC1164mClone;
        viewTreeObserverOnPreDrawListenerC1167p.f4783b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1167p);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1167p);
    }

    /* renamed from: b */
    public static C1240b m2818b() {
        C1240b c1240b;
        ThreadLocal threadLocal = f4785b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1240b = (C1240b) weakReference.get()) != null) {
            return c1240b;
        }
        C1240b c1240b2 = new C1240b();
        threadLocal.set(new WeakReference(c1240b2));
        return c1240b2;
    }
}
