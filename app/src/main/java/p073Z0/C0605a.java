package p073Z0;

import java.io.IOException;
import p101h1.C0987a;
import p101h1.C0988b;

/* renamed from: Z0.a */
/* loaded from: classes.dex */
public final class C0605a extends AbstractC0616l {

    /* renamed from: a */
    public final /* synthetic */ int f1917a;

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) {
        switch (this.f1917a) {
            case 0:
                if (c0987a.m2496B() != 9) {
                    return Double.valueOf(c0987a.m2516s());
                }
                c0987a.m2521x();
                return null;
            default:
                if (c0987a.m2496B() != 9) {
                    return Float.valueOf((float) c0987a.m2516s());
                }
                c0987a.m2521x();
                return null;
        }
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) throws IOException {
        switch (this.f1917a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    C0608d.m1408a(dDoubleValue);
                    c0988b.m2535r(dDoubleValue);
                    break;
                } else {
                    c0988b.m2532o();
                    break;
                }
            default:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    C0608d.m1408a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c0988b.m2537t(numberValueOf);
                    break;
                } else {
                    c0988b.m2532o();
                    break;
                }
        }
    }
}
