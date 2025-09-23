package p084c1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import p073Z0.AbstractC0616l;
import p073Z0.C0608d;
import p073Z0.InterfaceC0617m;
import p098g1.C0970a;

/* renamed from: c1.f */
/* loaded from: classes.dex */
public final class C0795f implements InterfaceC0617m {

    /* renamed from: a */
    public final /* synthetic */ int f2956a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0616l f2957b;

    public /* synthetic */ C0795f(AbstractC0616l abstractC0616l, int i2) {
        this.f2956a = i2;
        this.f2957b = abstractC0616l;
    }

    @Override // p073Z0.InterfaceC0617m
    /* renamed from: a */
    public final AbstractC0616l mo1416a(C0608d c0608d, C0970a c0970a) {
        switch (this.f2956a) {
            case 0:
                if (c0970a.f4064a == Number.class) {
                    break;
                }
                break;
            default:
                Class cls = c0970a.f4064a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    break;
                }
                break;
        }
        return (C0796g) this.f2957b;
    }

    public String toString() {
        switch (this.f2956a) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C0796g) this.f2957b) + "]";
            default:
                return super.toString();
        }
    }
}
