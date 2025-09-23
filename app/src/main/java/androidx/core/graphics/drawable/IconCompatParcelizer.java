package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p112l0.AbstractC1225a;
import p112l0.C1226b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1225a abstractC1225a) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f2308a;
        if (abstractC1225a.mo2862e(1)) {
            i2 = ((C1226b) abstractC1225a).f4926e.readInt();
        }
        iconCompat.f2308a = i2;
        byte[] bArr = iconCompat.f2310c;
        if (abstractC1225a.mo2862e(2)) {
            Parcel parcel = ((C1226b) abstractC1225a).f4926e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2310c = bArr;
        iconCompat.f2311d = abstractC1225a.m2863f(iconCompat.f2311d, 3);
        int i4 = iconCompat.f2312e;
        if (abstractC1225a.mo2862e(4)) {
            i4 = ((C1226b) abstractC1225a).f4926e.readInt();
        }
        iconCompat.f2312e = i4;
        int i5 = iconCompat.f2313f;
        if (abstractC1225a.mo2862e(5)) {
            i5 = ((C1226b) abstractC1225a).f4926e.readInt();
        }
        iconCompat.f2313f = i5;
        iconCompat.f2314g = (ColorStateList) abstractC1225a.m2863f(iconCompat.f2314g, 6);
        String string = iconCompat.f2316i;
        if (abstractC1225a.mo2862e(7)) {
            string = ((C1226b) abstractC1225a).f4926e.readString();
        }
        iconCompat.f2316i = string;
        String string2 = iconCompat.f2317j;
        if (abstractC1225a.mo2862e(8)) {
            string2 = ((C1226b) abstractC1225a).f4926e.readString();
        }
        iconCompat.f2317j = string2;
        iconCompat.f2315h = PorterDuff.Mode.valueOf(iconCompat.f2316i);
        switch (iconCompat.f2308a) {
            case -1:
                Parcelable parcelable = iconCompat.f2311d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2309b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f2311d;
                if (parcelable2 != null) {
                    iconCompat.f2309b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f2310c;
                iconCompat.f2309b = bArr3;
                iconCompat.f2308a = 3;
                iconCompat.f2312e = 0;
                iconCompat.f2313f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f2310c, Charset.forName("UTF-16"));
                iconCompat.f2309b = str;
                if (iconCompat.f2308a == 2 && iconCompat.f2317j == null) {
                    iconCompat.f2317j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f2309b = iconCompat.f2310c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1225a abstractC1225a) {
        abstractC1225a.getClass();
        iconCompat.f2316i = iconCompat.f2315h.name();
        switch (iconCompat.f2308a) {
            case -1:
                iconCompat.f2311d = (Parcelable) iconCompat.f2309b;
                break;
            case 1:
            case 5:
                iconCompat.f2311d = (Parcelable) iconCompat.f2309b;
                break;
            case 2:
                iconCompat.f2310c = ((String) iconCompat.f2309b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2310c = (byte[]) iconCompat.f2309b;
                break;
            case 4:
            case 6:
                iconCompat.f2310c = iconCompat.f2309b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f2308a;
        if (-1 != i2) {
            abstractC1225a.mo2865h(1);
            ((C1226b) abstractC1225a).f4926e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f2310c;
        if (bArr != null) {
            abstractC1225a.mo2865h(2);
            int length = bArr.length;
            Parcel parcel = ((C1226b) abstractC1225a).f4926e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2311d;
        if (parcelable != null) {
            abstractC1225a.mo2865h(3);
            ((C1226b) abstractC1225a).f4926e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f2312e;
        if (i3 != 0) {
            abstractC1225a.mo2865h(4);
            ((C1226b) abstractC1225a).f4926e.writeInt(i3);
        }
        int i4 = iconCompat.f2313f;
        if (i4 != 0) {
            abstractC1225a.mo2865h(5);
            ((C1226b) abstractC1225a).f4926e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f2314g;
        if (colorStateList != null) {
            abstractC1225a.mo2865h(6);
            ((C1226b) abstractC1225a).f4926e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f2316i;
        if (str != null) {
            abstractC1225a.mo2865h(7);
            ((C1226b) abstractC1225a).f4926e.writeString(str);
        }
        String str2 = iconCompat.f2317j;
        if (str2 != null) {
            abstractC1225a.mo2865h(8);
            ((C1226b) abstractC1225a).f4926e.writeString(str2);
        }
    }
}
