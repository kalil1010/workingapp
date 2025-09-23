package p084c1;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p073Z0.C0611g;
import p080b1.InterfaceC0779q;
import p101h1.C0987a;
import p101h1.C0988b;

/* renamed from: c1.b */
/* loaded from: classes.dex */
public final class C0791b extends AbstractC0616l {

    /* renamed from: d */
    public static final C0790a f2944d = new C0790a(0);

    /* renamed from: a */
    public final /* synthetic */ int f2945a = 0;

    /* renamed from: b */
    public final Object f2946b;

    /* renamed from: c */
    public final Object f2947c;

    public C0791b(C0608d c0608d, AbstractC0616l abstractC0616l, Class cls) {
        this.f2946b = new C0802m(c0608d, abstractC0616l, cls);
        this.f2947c = cls;
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        switch (this.f2945a) {
            case 0:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                c0987a.m2504g();
                while (c0987a.m2512o()) {
                    arrayList.add(((AbstractC0616l) ((C0802m) this.f2946b).f2982c).mo1406a(c0987a));
                }
                c0987a.m2508k();
                int size = arrayList.size();
                Class cls = (Class) this.f2947c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i2 = 0; i2 < size; i2++) {
                    Array.set(objNewInstance, i2, arrayList.get(i2));
                }
                return objNewInstance;
            case 1:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC0779q) this.f2947c).mo22i();
                c0987a.m2504g();
                while (c0987a.m2512o()) {
                    collection.add(((AbstractC0616l) ((C0802m) this.f2946b).f2982c).mo1406a(c0987a));
                }
                c0987a.m2508k();
                return collection;
            default:
                Object objMo1406a = ((AbstractC0616l) ((C0803n) this.f2946b).f2986c).mo1406a(c0987a);
                if (objMo1406a != null) {
                    Class cls2 = (Class) this.f2947c;
                    if (!cls2.isInstance(objMo1406a)) {
                        throw new C0611g("Expected a " + cls2.getName() + " but was " + objMo1406a.getClass().getName() + "; at path " + c0987a.m2511n(true));
                    }
                }
                return objMo1406a;
        }
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        switch (this.f2945a) {
            case 0:
                if (obj == null) {
                    c0988b.m2532o();
                    break;
                } else {
                    c0988b.m2525h();
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        ((C0802m) this.f2946b).mo1407b(c0988b, Array.get(obj, i2));
                    }
                    c0988b.m2528k();
                    break;
                }
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c0988b.m2532o();
                    break;
                } else {
                    c0988b.m2525h();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C0802m) this.f2946b).mo1407b(c0988b, it.next());
                    }
                    c0988b.m2528k();
                    break;
                }
            default:
                ((AbstractC0616l) ((C0803n) this.f2946b).f2986c).mo1407b(c0988b, obj);
                break;
        }
    }

    public C0791b(C0608d c0608d, Type type, AbstractC0616l abstractC0616l, InterfaceC0779q interfaceC0779q) {
        this.f2946b = new C0802m(c0608d, abstractC0616l, type);
        this.f2947c = interfaceC0779q;
    }

    public C0791b(C0803n c0803n, Class cls) {
        this.f2946b = c0803n;
        this.f2947c = cls;
    }
}
