package p006C;

import android.graphics.Path;
import p033L1.AbstractC0356d;

/* renamed from: C.h */
/* loaded from: classes.dex */
public final class C0076h {

    /* renamed from: a */
    public char f177a;

    /* renamed from: b */
    public final float[] f178b;

    public C0076h(char c3, float[] fArr) {
        this.f177a = c3;
        this.f178b = fArr;
    }

    /* renamed from: a */
    public static void m243a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3) {
        double d3;
        double d4;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d5 = f;
        double d6 = f2;
        double d7 = f5;
        double d8 = ((d6 * dSin) + (d5 * dCos)) / d7;
        double d9 = f6;
        double d10 = ((d6 * dCos) + ((-f) * dSin)) / d9;
        double d11 = f4;
        double d12 = ((d11 * dSin) + (f3 * dCos)) / d7;
        double d13 = ((d11 * dCos) + ((-f3) * dSin)) / d9;
        double d14 = d8 - d12;
        double d15 = d10 - d13;
        double d16 = (d8 + d12) / 2.0d;
        double d17 = (d10 + d13) / 2.0d;
        double d18 = (d15 * d15) + (d14 * d14);
        if (d18 == 0.0d) {
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
            m243a(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z2, z3);
            return;
        }
        double dSqrt = Math.sqrt(d19);
        double d20 = d14 * dSqrt;
        double d21 = dSqrt * d15;
        if (z2 == z3) {
            d3 = d16 - d21;
            d4 = d17 + d20;
        } else {
            d3 = d16 + d21;
            d4 = d17 - d20;
        }
        double dAtan2 = Math.atan2(d10 - d4, d8 - d3);
        double dAtan22 = Math.atan2(d13 - d4, d12 - d3) - dAtan2;
        if (z3 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d22 = d3 * d7;
        double d23 = d4 * d9;
        double d24 = (d22 * dCos) - (d23 * dSin);
        double d25 = (d23 * dCos) + (d22 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d26 = -d7;
        double d27 = d26 * dCos2;
        double d28 = d9 * dSin2;
        double d29 = (d27 * dSin3) - (d28 * dCos3);
        double d30 = d26 * dSin2;
        double d31 = d9 * dCos2;
        double d32 = dAtan22 / iCeil;
        double d33 = (dCos3 * d31) + (dSin3 * d30);
        int i2 = 0;
        double d34 = d5;
        double d35 = d6;
        double d36 = dAtan2;
        while (i2 < iCeil) {
            double d37 = d36 + d32;
            double dSin4 = Math.sin(d37);
            double dCos4 = Math.cos(d37);
            double d38 = d32;
            double d39 = (((d7 * dCos2) * dCos4) + d24) - (d28 * dSin4);
            double d40 = d24;
            double d41 = (d31 * dSin4) + (d7 * dSin2 * dCos4) + d25;
            double d42 = (d27 * dSin4) - (d28 * dCos4);
            double d43 = (dCos4 * d31) + (dSin4 * d30);
            double d44 = d37 - d36;
            double dTan = Math.tan(d44 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d44)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d29 * dSqrt2) + d34), (float) ((d33 * dSqrt2) + d35), (float) (d39 - (dSqrt2 * d42)), (float) (d41 - (dSqrt2 * d43)), (float) d39, (float) d41);
            i2++;
            d35 = d41;
            iCeil = iCeil;
            d30 = d30;
            dCos2 = dCos2;
            d36 = d37;
            d33 = d43;
            d29 = d42;
            d24 = d40;
            d34 = d39;
            d32 = d38;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m244b(C0076h[] c0076hArr, Path path) {
        int i2;
        int i3;
        C0076h c0076h;
        int i4;
        char c3;
        float f;
        float f2;
        float f3;
        float f4;
        C0076h c0076h2;
        boolean z2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = c0076hArr.length;
        char c4 = 'm';
        int i5 = 0;
        char c5 = 'm';
        int i6 = 0;
        while (i6 < length) {
            C0076h c0076h3 = c0076hArr[i6];
            char c6 = c0076h3.f177a;
            float f13 = fArr[i5];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i2 = 2;
                    break;
            }
            float f19 = f14;
            float f20 = f17;
            float f21 = f18;
            float f22 = f13;
            int i7 = i5;
            while (true) {
                float[] fArr2 = c0076h3.f178b;
                if (i7 < fArr2.length) {
                    int i8 = i5;
                    if (c6 == 'A') {
                        i3 = i7;
                        c0076h = c0076h3;
                        float f23 = f22;
                        float f24 = f19;
                        i4 = i6;
                        c3 = c6;
                        int i9 = i3 + 5;
                        int i10 = i3 + 6;
                        m243a(path, f23, f24, fArr2[i9], fArr2[i10], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f ? 1 : i8, fArr2[i3 + 4] != 0.0f ? 1 : i8);
                        f15 = fArr2[i9];
                        f = fArr2[i10];
                        f16 = f;
                        f2 = f15;
                    } else if (c6 == 'C') {
                        i3 = i7;
                        i4 = i6;
                        c0076h = c0076h3;
                        c3 = c6;
                        int i11 = i3 + 2;
                        int i12 = i3 + 3;
                        int i13 = i3 + 4;
                        int i14 = i3 + 5;
                        path2.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        float f25 = fArr2[i13];
                        float f26 = fArr2[i14];
                        f15 = fArr2[i11];
                        f16 = fArr2[i12];
                        f = f26;
                        f2 = f25;
                    } else if (c6 != 'H') {
                        if (c6 == 'Q') {
                            i3 = i7;
                            i4 = i6;
                            c0076h = c0076h3;
                            c3 = c6;
                            int i15 = i3 + 1;
                            int i16 = i3 + 2;
                            int i17 = i3 + 3;
                            path2.quadTo(fArr2[i3], fArr2[i15], fArr2[i16], fArr2[i17]);
                            f3 = fArr2[i3];
                            float f27 = fArr2[i15];
                            f4 = fArr2[i16];
                            f16 = f27;
                            f = fArr2[i17];
                        } else if (c6 == 'V') {
                            i3 = i7;
                            i4 = i6;
                            c0076h = c0076h3;
                            f2 = f22;
                            c3 = c6;
                            path2.lineTo(f2, fArr2[i3]);
                            f = fArr2[i3];
                        } else if (c6 != 'a') {
                            if (c6 == 'c') {
                                i3 = i7;
                                int i18 = i3 + 2;
                                int i19 = i3 + 3;
                                int i20 = i3 + 4;
                                int i21 = i3 + 5;
                                path2.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i18], fArr2[i19], fArr2[i20], fArr2[i21]);
                                float f28 = fArr2[i18] + f22;
                                float f29 = f19 + fArr2[i19];
                                f22 += fArr2[i20];
                                f19 += fArr2[i21];
                                f15 = f28;
                                f16 = f29;
                            } else if (c6 != 'h') {
                                if (c6 != 'q') {
                                    if (c6 != 'v') {
                                        if (c6 == 'L') {
                                            i3 = i7;
                                            int i22 = i3 + 1;
                                            path2.lineTo(fArr2[i3], fArr2[i22]);
                                            f2 = fArr2[i3];
                                            f = fArr2[i22];
                                        } else if (c6 == 'M') {
                                            i3 = i7;
                                            f2 = fArr2[i3];
                                            f = fArr2[i3 + 1];
                                            if (i3 > 0) {
                                                path2.lineTo(f2, f);
                                            } else {
                                                path2.moveTo(f2, f);
                                                f20 = f2;
                                                f21 = f;
                                            }
                                        } else if (c6 == 'S') {
                                            i3 = i7;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f22 = (f22 * 2.0f) - f15;
                                                f19 = (f19 * 2.0f) - f16;
                                            }
                                            float f30 = f22;
                                            float f31 = f19;
                                            int i23 = i3 + 1;
                                            int i24 = i3 + 2;
                                            int i25 = i3 + 3;
                                            path2.cubicTo(f30, f31, fArr2[i3], fArr2[i23], fArr2[i24], fArr2[i25]);
                                            f3 = fArr2[i3];
                                            float f32 = fArr2[i23];
                                            f4 = fArr2[i24];
                                            f16 = f32;
                                            f = fArr2[i25];
                                            i4 = i6;
                                            c0076h = c0076h3;
                                            c3 = c6;
                                        } else if (c6 == 'T') {
                                            i3 = i7;
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f22 = (f22 * 2.0f) - f15;
                                                f19 = (f19 * 2.0f) - f16;
                                            }
                                            float f33 = f19;
                                            float f34 = fArr2[i3];
                                            int i26 = i3 + 1;
                                            path2.quadTo(f22, f33, f34, fArr2[i26]);
                                            f16 = f33;
                                            f2 = fArr2[i3];
                                            f = fArr2[i26];
                                            i4 = i6;
                                            c0076h = c0076h3;
                                            f15 = f22;
                                            c3 = c6;
                                        } else if (c6 == 'l') {
                                            i3 = i7;
                                            int i27 = i3 + 1;
                                            path2.rLineTo(fArr2[i3], fArr2[i27]);
                                            f22 += fArr2[i3];
                                            f8 = fArr2[i27];
                                        } else if (c6 == c4) {
                                            i3 = i7;
                                            float f35 = fArr2[i3];
                                            f22 += f35;
                                            float f36 = fArr2[i3 + 1];
                                            f19 += f36;
                                            if (i3 > 0) {
                                                path2.rLineTo(f35, f36);
                                            } else {
                                                path2.rMoveTo(f35, f36);
                                                c0076h = c0076h3;
                                                f2 = f22;
                                                f20 = f2;
                                                f = f19;
                                                f21 = f;
                                                i4 = i6;
                                                c3 = c6;
                                            }
                                        } else if (c6 == 's') {
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f9 = f19 - f16;
                                                f10 = f22 - f15;
                                            } else {
                                                f10 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i28 = i7 + 1;
                                            int i29 = i7 + 2;
                                            int i30 = i7 + 3;
                                            i3 = i7;
                                            path2.rCubicTo(f10, f9, fArr2[i7], fArr2[i28], fArr2[i29], fArr2[i30]);
                                            f5 = fArr2[i3] + f22;
                                            f6 = f19 + fArr2[i28];
                                            f22 += fArr2[i29];
                                            f7 = fArr2[i30];
                                        } else if (c6 != 't') {
                                            i3 = i7;
                                        } else {
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f11 = f22 - f15;
                                                f12 = f19 - f16;
                                            } else {
                                                f12 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i31 = i7 + 1;
                                            path2.rQuadTo(f11, f12, fArr2[i7], fArr2[i31]);
                                            float f37 = f11 + f22;
                                            float f38 = f19 + f12;
                                            float f39 = f22 + fArr2[i7];
                                            f19 += fArr2[i31];
                                            f16 = f38;
                                            i3 = i7;
                                            c0076h = c0076h3;
                                            f2 = f39;
                                            f15 = f37;
                                            f = f19;
                                            i4 = i6;
                                            c3 = c6;
                                        }
                                        i4 = i6;
                                        c0076h = c0076h3;
                                        c3 = c6;
                                    } else {
                                        i3 = i7;
                                        path2.rLineTo(0.0f, fArr2[i3]);
                                        f8 = fArr2[i3];
                                    }
                                    f19 += f8;
                                } else {
                                    i3 = i7;
                                    int i32 = i3 + 1;
                                    int i33 = i3 + 2;
                                    int i34 = i3 + 3;
                                    path2.rQuadTo(fArr2[i3], fArr2[i32], fArr2[i33], fArr2[i34]);
                                    f5 = fArr2[i3] + f22;
                                    f6 = f19 + fArr2[i32];
                                    f22 += fArr2[i33];
                                    f7 = fArr2[i34];
                                }
                                f19 += f7;
                                f15 = f5;
                                f16 = f6;
                            } else {
                                i3 = i7;
                                path2.rLineTo(fArr2[i3], 0.0f);
                                f22 += fArr2[i3];
                            }
                            c0076h = c0076h3;
                            f2 = f22;
                            f = f19;
                            i4 = i6;
                            c3 = c6;
                        } else {
                            i3 = i7;
                            int i35 = i3 + 5;
                            float f40 = fArr2[i35] + f22;
                            int i36 = i3 + 6;
                            float f41 = fArr2[i36] + f19;
                            float f42 = fArr2[i3];
                            float f43 = fArr2[i3 + 1];
                            float f44 = fArr2[i3 + 2];
                            if (fArr2[i3 + 3] != 0.0f) {
                                c0076h2 = c0076h3;
                                z2 = 1;
                            } else {
                                c0076h2 = c0076h3;
                                z2 = i8;
                            }
                            c0076h = c0076h2;
                            float f45 = f22;
                            c3 = c6;
                            float f46 = f19;
                            i4 = i6;
                            m243a(path, f45, f46, f40, f41, f42, f43, f44, z2, fArr2[i3 + 4] != 0.0f ? 1 : i8);
                            f2 = f45 + fArr2[i35];
                            f = f46 + fArr2[i36];
                            f15 = f2;
                            f16 = f;
                        }
                        f15 = f3;
                        f2 = f4;
                    } else {
                        i3 = i7;
                        c0076h = c0076h3;
                        c3 = c6;
                        f = f19;
                        i4 = i6;
                        path2.lineTo(fArr2[i3], f);
                        f2 = fArr2[i3];
                    }
                    c6 = c3;
                    c0076h3 = c0076h;
                    i6 = i4;
                    i5 = i8;
                    c4 = 'm';
                    f22 = f2;
                    f19 = f;
                    c5 = c6;
                    i7 = i3 + i2;
                    path2 = path;
                }
            }
            int i37 = i5;
            fArr[i37] = f22;
            fArr[1] = f19;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f20;
            fArr[5] = f21;
            c5 = c0076h3.f177a;
            i6++;
            path2 = path;
            i5 = i37;
            c4 = 'm';
        }
    }

    public C0076h(C0076h c0076h) {
        this.f177a = c0076h.f177a;
        float[] fArr = c0076h.f178b;
        this.f178b = AbstractC0356d.m959i(fArr, fArr.length);
    }
}
