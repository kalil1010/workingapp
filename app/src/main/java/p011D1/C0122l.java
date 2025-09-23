package p011D1;

import androidx.activity.AbstractActivityC0645k;
import androidx.lifecycle.AbstractC0732I;
import androidx.lifecycle.C0731H;
import androidx.lifecycle.C0733J;
import androidx.lifecycle.C0734K;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p076a0.AbstractC0625b;
import p076a0.C0627d;
import p110k1.C1215q;
import p128r1.InterfaceC1290a;
import p131s1.AbstractC1326c;
import p131s1.AbstractC1327d;
import p131s1.AbstractC1330g;
import p131s1.C1325b;

/* renamed from: D1.l */
/* loaded from: classes.dex */
public final class C0122l extends AbstractC1327d implements InterfaceC1290a {

    /* renamed from: a */
    public final /* synthetic */ int f356a;

    /* renamed from: b */
    public final /* synthetic */ Object f357b;

    public /* synthetic */ C0122l(int i2, Object obj) {
        this.f356a = i2;
        this.f357b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [r1.a, s1.d] */
    @Override // p128r1.InterfaceC1290a
    /* renamed from: a */
    public final Object mo349a() {
        switch (this.f356a) {
            case 0:
                return (List) this.f357b;
            case 1:
                try {
                    return (List) ((AbstractC1327d) this.f357b).mo349a();
                } catch (SSLPeerUnverifiedException unused) {
                    return C1215q.f4904a;
                }
            default:
                AbstractActivityC0645k abstractActivityC0645k = (AbstractActivityC0645k) this.f357b;
                ArrayList arrayList = new ArrayList();
                AbstractC1330g.f5651a.getClass();
                Class clsMo3057a = new C1325b(C0731H.class).mo3057a();
                AbstractC1326c.m3060c(clsMo3057a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                arrayList.add(new C0627d(clsMo3057a));
                C0627d[] c0627dArr = (C0627d[]) arrayList.toArray(new C0627d[0]);
                C0627d[] c0627dArr2 = (C0627d[]) Arrays.copyOf(c0627dArr, c0627dArr.length);
                AbstractC1326c.m3062e(c0627dArr2, "initializers");
                C0734K c0734kMo1452c = abstractActivityC0645k.mo1452c();
                AbstractC0625b abstractC0625bMo1450a = abstractActivityC0645k.mo1450a();
                AbstractC1326c.m3062e(c0734kMo1452c, "store");
                AbstractC1326c.m3062e(abstractC0625bMo1450a, "defaultCreationExtras");
                LinkedHashMap linkedHashMap = c0734kMo1452c.f2707a;
                AbstractC0732I c0731h = (AbstractC0732I) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (C0731H.class.isInstance(c0731h)) {
                    AbstractC1326c.m3060c(c0731h, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(abstractC0625bMo1450a.f1945a);
                    linkedHashMap2.put(C0733J.f2706b, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        c0731h = null;
                        for (C0627d c0627d : c0627dArr2) {
                            if (c0627d.f1946a.equals(C0731H.class)) {
                                c0731h = new C0731H();
                            }
                        }
                        if (c0731h == null) {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(C0731H.class.getName()));
                        }
                        AbstractC0732I abstractC0732I = (AbstractC0732I) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", c0731h);
                        if (abstractC0732I != null) {
                            abstractC0732I.mo1694a();
                        }
                    } catch (AbstractMethodError unused2) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (C0731H) c0731h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0122l(InterfaceC1290a interfaceC1290a) {
        this.f356a = 1;
        this.f357b = (AbstractC1327d) interfaceC1290a;
    }
}
