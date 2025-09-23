package p055T0;

import p033L1.AbstractC0356d;

/* renamed from: T0.i */
/* loaded from: classes.dex */
public final class C0515i extends AbstractC0356d {
    @Override // p033L1.AbstractC0356d
    /* renamed from: t */
    public final void mo974t(C0527u c0527u, float f, float f2) {
        c0527u.m1309d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C0523q c0523q = new C0523q(0.0f, 0.0f, f3, f3);
        c0523q.f1672f = 180.0f;
        c0523q.f1673g = 90.0f;
        c0527u.f1684f.add(c0523q);
        C0521o c0521o = new C0521o(c0523q);
        c0527u.m1306a(180.0f);
        c0527u.f1685g.add(c0521o);
        c0527u.f1682d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d3 = 270.0f;
        c0527u.f1680b = (((float) Math.cos(Math.toRadians(d3))) * f5) + f4;
        c0527u.f1681c = (f5 * ((float) Math.sin(Math.toRadians(d3)))) + f4;
    }
}
