package p006C;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p003B.C0051g;
import p003B.C0052h;
import p020H.C0178h;
import p033L1.AbstractC0364l;

/* renamed from: C.n */
/* loaded from: classes.dex */
public final class C0082n extends AbstractC0364l {
    /* renamed from: m0 */
    public static Font m261m0(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM262n0 = m262n0(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int iM262n02 = m262n0(fontStyle, font2.getStyle());
            if (iM262n02 < iM262n0) {
                font = font2;
                iM262n0 = iM262n02;
            }
        }
        return font;
    }

    /* renamed from: n0 */
    public static int m262n0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: A */
    public final C0178h mo263A(int i2, C0178h[] c0178hArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: v */
    public final Typeface mo249v(Context context, C0051g c0051g, Resources resources, int i2) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (C0052h c0052h : c0051g.f118a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0052h.f124f).setWeight(c0052h.f120b).setSlant(c0052h.f121c ? 1 : 0).setTtcIndex(c0052h.f123e).setFontVariationSettings(c0052h.f122d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m261m0(fontFamilyBuild, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: w */
    public final Typeface mo250w(Context context, C0178h[] c0178hArr, int i2) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0178h c0178h : c0178hArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c0178h.f645a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0178h.f647c).setSlant(c0178h.f648d ? 1 : 0).setTtcIndex(c0178h.f646b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder != null) {
                FontFamily fontFamilyBuild = builder.build();
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m261m0(fontFamilyBuild, i2).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: x */
    public final Typeface mo264x(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: y */
    public final Typeface mo260y(Context context, Resources resources, int i2, String str, int i3) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
