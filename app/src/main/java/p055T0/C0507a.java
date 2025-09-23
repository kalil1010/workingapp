package p055T0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: T0.a */
/* loaded from: classes.dex */
public final class C0507a implements InterfaceC0509c {

    /* renamed from: a */
    public final float f1579a;

    public C0507a(float f) {
        this.f1579a = f;
    }

    @Override // p055T0.InterfaceC0509c
    /* renamed from: a */
    public final float mo1270a(RectF rectF) {
        return this.f1579a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0507a) && this.f1579a == ((C0507a) obj).f1579a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1579a)});
    }
}
