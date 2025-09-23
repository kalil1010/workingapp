package p006C;

import android.graphics.Color;

/* renamed from: C.a */
/* loaded from: classes.dex */
public abstract class AbstractC0069a {

    /* renamed from: a */
    public static final ThreadLocal f170a = new ThreadLocal();

    /* renamed from: a */
    public static int m192a(double d3, double d4, double d5) {
        double d6 = (((-0.4986d) * d5) + (((-1.5372d) * d4) + (3.2406d * d3))) / 100.0d;
        double d7 = ((0.0415d * d5) + ((1.8758d * d4) + ((-0.9689d) * d3))) / 100.0d;
        double d8 = ((1.057d * d5) + (((-0.204d) * d4) + (0.0557d * d3))) / 100.0d;
        double dPow = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        double dPow2 = d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d;
        double dPow3 = d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    /* renamed from: b */
    public static int m193b(int i2, int i3) {
        int iAlpha = Color.alpha(i3);
        int iAlpha2 = Color.alpha(i2);
        int i4 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i4, m194c(Color.red(i2), iAlpha2, Color.red(i3), iAlpha, i4), m194c(Color.green(i2), iAlpha2, Color.green(i3), iAlpha, i4), m194c(Color.blue(i2), iAlpha2, Color.blue(i3), iAlpha, i4));
    }

    /* renamed from: c */
    public static int m194c(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((255 - i3) * (i4 * i5)) + ((i2 * 255) * i3)) / (i6 * 255);
    }

    /* renamed from: d */
    public static int m195d(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}
