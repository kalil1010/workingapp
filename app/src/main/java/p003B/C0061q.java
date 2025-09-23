package p003B;

/* renamed from: B.q */
/* loaded from: classes.dex */
public final class C0061q {

    /* renamed from: k */
    public static final C0061q f140k;

    /* renamed from: a */
    public final float f141a;

    /* renamed from: b */
    public final float f142b;

    /* renamed from: c */
    public final float f143c;

    /* renamed from: d */
    public final float f144d;

    /* renamed from: e */
    public final float f145e;

    /* renamed from: f */
    public final float f146f;

    /* renamed from: g */
    public final float[] f147g;

    /* renamed from: h */
    public final float f148h;

    /* renamed from: i */
    public final float f149i;

    /* renamed from: j */
    public final float f150j;

    static {
        float[] fArr = AbstractC0046b.f108c;
        float fM170l = (float) ((AbstractC0046b.m170l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC0046b.f106a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM170l) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = 0.0f;
        }
        float f10 = 1.0f / ((5.0f * fM170l) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float fCbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(fM170l * 5.0d))) + (f11 * fM170l);
        float fM170l2 = AbstractC0046b.m170l() / fArr[1];
        double d4 = fM170l2;
        float fSqrt = ((float) Math.sqrt(d4)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d4, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r9[0] * fCbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((r9[1] * fCbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((r9[2] * fCbrt) * f8) / 100.0d, 0.42d)};
        float f13 = fArr6[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr6[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr6[2];
        float[] fArr7 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        f140k = new C0061q(fM170l2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * fPow, fPow, fPow, f9, 1.0f, new float[]{(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C0061q(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f146f = f;
        this.f141a = f2;
        this.f142b = f3;
        this.f143c = f4;
        this.f144d = f5;
        this.f145e = f6;
        this.f147g = fArr;
        this.f148h = f7;
        this.f149i = f8;
        this.f150j = f9;
    }
}
