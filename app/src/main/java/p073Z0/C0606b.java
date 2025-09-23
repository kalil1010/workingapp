package p073Z0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p101h1.C0987a;
import p101h1.C0988b;

/* renamed from: Z0.b */
/* loaded from: classes.dex */
public final class C0606b extends AbstractC0616l {

    /* renamed from: a */
    public final /* synthetic */ int f1918a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0616l f1919b;

    public /* synthetic */ C0606b(AbstractC0616l abstractC0616l, int i2) {
        this.f1918a = i2;
        this.f1919b = abstractC0616l;
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) {
        switch (this.f1918a) {
            case 0:
                return new AtomicLong(((Number) this.f1919b.mo1406a(c0987a)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                c0987a.m2504g();
                while (c0987a.m2512o()) {
                    arrayList.add(Long.valueOf(((Number) this.f1919b.mo1406a(c0987a)).longValue()));
                }
                c0987a.m2508k();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                if (c0987a.m2496B() != 9) {
                    return this.f1919b.mo1406a(c0987a);
                }
                c0987a.m2521x();
                return null;
        }
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) throws IOException {
        switch (this.f1918a) {
            case 0:
                this.f1919b.mo1407b(c0988b, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c0988b.m2525h();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    this.f1919b.mo1407b(c0988b, Long.valueOf(atomicLongArray.get(i2)));
                }
                c0988b.m2528k();
                break;
            default:
                if (obj == null) {
                    c0988b.m2532o();
                    break;
                } else {
                    this.f1919b.mo1407b(c0988b, obj);
                    break;
                }
        }
    }
}
