package p003B;

import android.graphics.Color;

/* renamed from: B.a */
/* loaded from: classes.dex */
public final class C0045a {

    /* renamed from: a */
    public final float f100a;

    /* renamed from: b */
    public final float f101b;

    /* renamed from: c */
    public final float f102c;

    /* renamed from: d */
    public final float f103d;

    /* renamed from: e */
    public final float f104e;

    /* renamed from: f */
    public final float f105f;

    public C0045a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f100a = f;
        this.f101b = f2;
        this.f102c = f3;
        this.f103d = f4;
        this.f104e = f5;
        this.f105f = f6;
    }

    /* renamed from: a */
    public static C0045a m159a(int i2) {
        C0061q c0061q = C0061q.f140k;
        float fM165e = AbstractC0046b.m165e(Color.red(i2));
        float fM165e2 = AbstractC0046b.m165e(Color.green(i2));
        float fM165e3 = AbstractC0046b.m165e(Color.blue(i2));
        float[][] fArr = AbstractC0046b.f109d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM165e3) + (fArr2[1] * fM165e2) + (fArr2[0] * fM165e);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM165e3) + (fArr3[1] * fM165e2) + (fArr3[0] * fM165e);
        float[] fArr4 = fArr[2];
        float f3 = (fM165e3 * fArr4[2]) + (fM165e2 * fArr4[1]) + (fM165e * fArr4[0]);
        float[][] fArr5 = AbstractC0046b.f106a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = c0061q.f147g;
        float f7 = fArr9[0] * f4;
        float f8 = fArr9[1] * f5;
        float f9 = fArr9[2] * f6;
        float fAbs = Math.abs(f7);
        float f10 = c0061q.f148h;
        float fPow = (float) Math.pow((fAbs * f10) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f8) * f10) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f9) * f10) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f7) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f8) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f9) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d3 = fSignum3;
        float f11 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d3)) / 11.0f;
        float f12 = ((float) ((fSignum + fSignum2) - (d3 * 2.0d))) / 9.0f;
        float f13 = fSignum2 * 20.0f;
        float f14 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f13)) / 20.0f;
        float f15 = (((fSignum * 40.0f) + f13) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f16 = fAtan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float f18 = f15 * c0061q.f142b;
        float f19 = c0061q.f141a;
        float f20 = c0061q.f144d;
        float fPow4 = ((float) Math.pow(f18 / f19, c0061q.f150j * f20)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f21 = f19 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0061q.f146f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f16) < 20.14d ? f16 + 360.0f : f16) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0061q.f145e) * c0061q.f143c) * ((float) Math.sqrt((f12 * f12) + (f11 * f11)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f22 = c0061q.f149i * fPow5;
        Math.sqrt((r3 * f20) / f21);
        float f23 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d4 = f17;
        return new C0045a(f16, fPow5, fPow4, f23, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    /* renamed from: b */
    public static C0045a m160b(float f, float f2, float f3) {
        C0061q c0061q = C0061q.f140k;
        float f4 = c0061q.f144d;
        Math.sqrt(f / 100.0d);
        float f5 = c0061q.f141a + 4.0f;
        float f6 = c0061q.f149i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * c0061q.f144d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f3) / 180.0f;
        return new C0045a(f3, f2, f, f7, fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m161c(p003B.C0061q r21) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003B.C0045a.m161c(B.q):int");
    }
}
