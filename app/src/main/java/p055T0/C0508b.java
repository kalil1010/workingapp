package p055T0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: T0.b */
/* loaded from: classes.dex */
public final class C0508b implements InterfaceC0509c {

    /* renamed from: a */
    public final InterfaceC0509c f1580a;

    /* renamed from: b */
    public final float f1581b;

    public C0508b(float f, InterfaceC0509c interfaceC0509c) {
        while (interfaceC0509c instanceof C0508b) {
            interfaceC0509c = ((C0508b) interfaceC0509c).f1580a;
            f += ((C0508b) interfaceC0509c).f1581b;
        }
        this.f1580a = interfaceC0509c;
        this.f1581b = f;
    }

    @Override // p055T0.InterfaceC0509c
    /* renamed from: a */
    public final float mo1270a(RectF rectF) {
        return Math.max(0.0f, this.f1580a.mo1270a(rectF) + this.f1581b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0508b)) {
            return false;
        }
        C0508b c0508b = (C0508b) obj;
        return this.f1580a.equals(c0508b.f1580a) && this.f1581b == c0508b.f1581b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1580a, Float.valueOf(this.f1581b)});
    }
}
