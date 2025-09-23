package p020H;

import android.content.Context;
import java.util.concurrent.Callable;
import p011D1.C0132v;

/* renamed from: H.d */
/* loaded from: classes.dex */
public final class CallableC0174d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f632a;

    /* renamed from: b */
    public final /* synthetic */ String f633b;

    /* renamed from: c */
    public final /* synthetic */ Context f634c;

    /* renamed from: d */
    public final /* synthetic */ C0132v f635d;

    /* renamed from: e */
    public final /* synthetic */ int f636e;

    public /* synthetic */ CallableC0174d(String str, Context context, C0132v c0132v, int i2, int i3) {
        this.f632a = i3;
        this.f633b = str;
        this.f634c = context;
        this.f635d = c0132v;
        this.f636e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f632a) {
            case 0:
                return AbstractC0177g.m478a(this.f633b, this.f634c, this.f635d, this.f636e);
            default:
                try {
                    return AbstractC0177g.m478a(this.f633b, this.f634c, this.f635d, this.f636e);
                } catch (Throwable unused) {
                    return new C0176f(-3);
                }
        }
    }
}
