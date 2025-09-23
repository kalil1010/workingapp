package p024I1;

import java.util.ArrayList;
import p011D1.C0121k;
import p011D1.C0126p;
import p011D1.C0132v;
import p011D1.C0134x;
import p011D1.InterfaceC0127q;
import p021H1.C0186e;
import p021H1.C0190i;
import p131s1.AbstractC1326c;

/* renamed from: I1.f */
/* loaded from: classes.dex */
public final class C0212f {

    /* renamed from: a */
    public int f767a;

    /* renamed from: b */
    public final C0190i f768b;

    /* renamed from: c */
    public final ArrayList f769c;

    /* renamed from: d */
    public final int f770d;

    /* renamed from: e */
    public final C0121k f771e;

    /* renamed from: f */
    public final C0132v f772f;

    /* renamed from: g */
    public final int f773g;

    /* renamed from: h */
    public final int f774h;

    /* renamed from: i */
    public final int f775i;

    public C0212f(C0190i c0190i, ArrayList arrayList, int i2, C0121k c0121k, C0132v c0132v, int i3, int i4, int i5) {
        AbstractC1326c.m3062e(c0190i, "call");
        this.f768b = c0190i;
        this.f769c = arrayList;
        this.f770d = i2;
        this.f771e = c0121k;
        this.f772f = c0132v;
        this.f773g = i3;
        this.f774h = i4;
        this.f775i = i5;
    }

    /* renamed from: a */
    public static C0212f m562a(C0212f c0212f, int i2, C0121k c0121k, C0132v c0132v, int i3) {
        if ((i3 & 1) != 0) {
            i2 = c0212f.f770d;
        }
        int i4 = i2;
        if ((i3 & 2) != 0) {
            c0121k = c0212f.f771e;
        }
        C0121k c0121k2 = c0121k;
        if ((i3 & 4) != 0) {
            c0132v = c0212f.f772f;
        }
        C0132v c0132v2 = c0132v;
        AbstractC1326c.m3062e(c0132v2, "request");
        return new C0212f(c0212f.f768b, c0212f.f769c, i4, c0121k2, c0132v2, c0212f.f773g, c0212f.f774h, c0212f.f775i);
    }

    /* renamed from: b */
    public final C0134x m563b(C0132v c0132v) {
        AbstractC1326c.m3062e(c0132v, "request");
        ArrayList arrayList = this.f769c;
        int size = arrayList.size();
        int i2 = this.f770d;
        if (i2 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f767a++;
        C0121k c0121k = this.f771e;
        if (c0121k != null) {
            if (!((C0186e) c0121k.f354c).m490b((C0126p) c0132v.f452d)) {
                throw new IllegalStateException(("network interceptor " + ((InterfaceC0127q) arrayList.get(i2 - 1)) + " must retain the same host and port").toString());
            }
            if (this.f767a != 1) {
                throw new IllegalStateException(("network interceptor " + ((InterfaceC0127q) arrayList.get(i2 - 1)) + " must call proceed() exactly once").toString());
            }
        }
        int i3 = i2 + 1;
        C0212f c0212fM562a = m562a(this, i3, null, c0132v, 58);
        InterfaceC0127q interfaceC0127q = (InterfaceC0127q) arrayList.get(i2);
        C0134x c0134xMo37a = interfaceC0127q.mo37a(c0212fM562a);
        if (c0134xMo37a == null) {
            throw new NullPointerException("interceptor " + interfaceC0127q + " returned null");
        }
        if (c0121k != null && i3 < arrayList.size() && c0212fM562a.f767a != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC0127q + " must call proceed() exactly once").toString());
        }
        if (c0134xMo37a.f474g != null) {
            return c0134xMo37a;
        }
        throw new IllegalStateException(("interceptor " + interfaceC0127q + " returned a response with no body").toString());
    }
}
