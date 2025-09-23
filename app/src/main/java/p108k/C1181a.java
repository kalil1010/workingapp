package p108k;

import java.util.concurrent.Executors;
import p033L1.AbstractC0356d;

/* renamed from: k.a */
/* loaded from: classes.dex */
public final class C1181a extends AbstractC0356d {

    /* renamed from: o */
    public static volatile C1181a f4803o;

    /* renamed from: n */
    public final Object f4804n;

    public C1181a(int i2) {
        switch (i2) {
            case 1:
                this.f4804n = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC1182b());
                break;
            default:
                this.f4804n = new C1181a(1);
                break;
        }
    }

    /* renamed from: L */
    public static C1181a m2831L() {
        if (f4803o != null) {
            return f4803o;
        }
        synchronized (C1181a.class) {
            try {
                if (f4803o == null) {
                    f4803o = new C1181a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4803o;
    }
}
