package p148y0;

import android.animation.TimeInterpolator;

/* renamed from: y0.c */
/* loaded from: classes.dex */
public final class C1402c {

    /* renamed from: a */
    public long f6072a;

    /* renamed from: b */
    public long f6073b;

    /* renamed from: c */
    public TimeInterpolator f6074c;

    /* renamed from: d */
    public int f6075d;

    /* renamed from: e */
    public int f6076e;

    /* renamed from: a */
    public final TimeInterpolator m3169a() {
        TimeInterpolator timeInterpolator = this.f6074c;
        return timeInterpolator != null ? timeInterpolator : AbstractC1400a.f6067b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1402c)) {
            return false;
        }
        C1402c c1402c = (C1402c) obj;
        if (this.f6072a == c1402c.f6072a && this.f6073b == c1402c.f6073b && this.f6075d == c1402c.f6075d && this.f6076e == c1402c.f6076e) {
            return m3169a().getClass().equals(c1402c.m3169a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f6072a;
        long j3 = this.f6073b;
        return ((((m3169a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f6075d) * 31) + this.f6076e;
    }

    public final String toString() {
        return "\n" + C1402c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f6072a + " duration: " + this.f6073b + " interpolator: " + m3169a().getClass() + " repeatCount: " + this.f6075d + " repeatMode: " + this.f6076e + "}\n";
    }
}
