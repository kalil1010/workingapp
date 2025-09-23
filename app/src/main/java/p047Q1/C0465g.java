package p047Q1;

import p131s1.AbstractC1326c;

/* renamed from: Q1.g */
/* loaded from: classes.dex */
public final class C0465g {

    /* renamed from: a */
    public final boolean f1416a;

    /* renamed from: b */
    public final Integer f1417b;

    /* renamed from: c */
    public final boolean f1418c;

    /* renamed from: d */
    public final Integer f1419d;

    /* renamed from: e */
    public final boolean f1420e;

    /* renamed from: f */
    public final boolean f1421f;

    public C0465g(boolean z2, Integer num, boolean z3, Integer num2, boolean z4, boolean z5) {
        this.f1416a = z2;
        this.f1417b = num;
        this.f1418c = z3;
        this.f1419d = num2;
        this.f1420e = z4;
        this.f1421f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0465g)) {
            return false;
        }
        C0465g c0465g = (C0465g) obj;
        return this.f1416a == c0465g.f1416a && AbstractC1326c.m3058a(this.f1417b, c0465g.f1417b) && this.f1418c == c0465g.f1418c && AbstractC1326c.m3058a(this.f1419d, c0465g.f1419d) && this.f1420e == c0465g.f1420e && this.f1421f == c0465g.f1421f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z2 = this.f1416a;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = i2 * 31;
        Integer num = this.f1417b;
        int iHashCode = (i3 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z3 = this.f1418c;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (iHashCode + i4) * 31;
        Integer num2 = this.f1419d;
        int iHashCode2 = (i5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z4 = this.f1420e;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (iHashCode2 + i6) * 31;
        boolean z5 = this.f1421f;
        return i7 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f1416a + ", clientMaxWindowBits=" + this.f1417b + ", clientNoContextTakeover=" + this.f1418c + ", serverMaxWindowBits=" + this.f1419d + ", serverNoContextTakeover=" + this.f1420e + ", unknownValues=" + this.f1421f + ")";
    }
}
