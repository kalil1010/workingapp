package p090e;

/* renamed from: e.D */
/* loaded from: classes.dex */
public final class C0863D {

    /* renamed from: d */
    public static C0863D f3527d;

    /* renamed from: a */
    public long f3528a;

    /* renamed from: b */
    public long f3529b;

    /* renamed from: c */
    public int f3530c;

    /* renamed from: a */
    public final void m2184a(long j2, double d3, double d4) {
        double d5 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d5) * 0.03341960161924362d) + d5 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d5) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d4) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d6 = 0.01745329238474369d * d3;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d6))) / (Math.cos(dAsin) * Math.cos(d6));
        if (dSin3 >= 1.0d) {
            this.f3530c = 1;
            this.f3528a = -1L;
            this.f3529b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f3530c = 0;
                this.f3528a = -1L;
                this.f3529b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f3528a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f3529b = jRound;
            if (jRound >= j2 || this.f3528a <= j2) {
                this.f3530c = 1;
            } else {
                this.f3530c = 0;
            }
        }
    }
}
