package p055T0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: T0.h */
/* loaded from: classes.dex */
public final class C0514h implements InterfaceC0509c {

    /* renamed from: a */
    public final float f1623a;

    public C0514h(float f) {
        this.f1623a = f;
    }

    @Override // p055T0.InterfaceC0509c
    /* renamed from: a */
    public final float mo1270a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f1623a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0514h) && this.f1623a == ((C0514h) obj).f1623a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1623a)});
    }
}
