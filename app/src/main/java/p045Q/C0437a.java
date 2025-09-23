package p045Q;

/* renamed from: Q.a */
/* loaded from: classes.dex */
public final class C0437a {

    /* renamed from: a */
    public int f1324a;

    /* renamed from: b */
    public int f1325b;

    /* renamed from: c */
    public float f1326c;

    /* renamed from: d */
    public float f1327d;

    /* renamed from: e */
    public long f1328e;

    /* renamed from: f */
    public long f1329f;

    /* renamed from: g */
    public long f1330g;

    /* renamed from: h */
    public float f1331h;

    /* renamed from: i */
    public int f1332i;

    /* renamed from: a */
    public final float m1101a(long j2) {
        if (j2 < this.f1328e) {
            return 0.0f;
        }
        long j3 = this.f1330g;
        if (j3 < 0 || j2 < j3) {
            return ViewOnTouchListenerC0443g.m1115b((j2 - r0) / this.f1324a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f1331h;
        return (ViewOnTouchListenerC0443g.m1115b((j2 - j3) / this.f1332i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
