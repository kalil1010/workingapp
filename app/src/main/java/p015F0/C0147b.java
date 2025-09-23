package p015F0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.C0653a;
import androidx.fragment.app.C0683A;
import androidx.fragment.app.C0687E;
import androidx.fragment.app.C0690H;
import androidx.fragment.app.C0699b;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.C0810b;
import com.google.android.material.datepicker.C0812d;
import com.google.android.material.datepicker.C0822n;
import java.util.ArrayList;
import p045Q.C0447k;
import p094f0.C0936e0;
import p094f0.C0938f0;
import p094f0.C0957v;
import p105j.C1053P;
import p105j.C1101j;

/* renamed from: F0.b */
/* loaded from: classes.dex */
public final class C0147b implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f504a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f504a) {
            case 0:
                C0148c c0148c = new C0148c(parcel);
                c0148c.f505a = ((Integer) parcel.readValue(C0148c.class.getClassLoader())).intValue();
                return c0148c;
            case 1:
                C0447k c0447k = new C0447k(parcel);
                c0447k.f1352a = parcel.readInt();
                return c0447k;
            case 2:
                return new C0653a(parcel);
            case 3:
                return new C0699b(parcel);
            case 4:
                C0683A c0683a = new C0683A();
                c0683a.f2435a = parcel.readString();
                c0683a.f2436b = parcel.readInt();
                return c0683a;
            case 5:
                C0687E c0687e = new C0687E();
                c0687e.f2476e = null;
                c0687e.f2477f = new ArrayList();
                c0687e.f2478g = new ArrayList();
                c0687e.f2472a = parcel.createTypedArrayList(C0690H.CREATOR);
                c0687e.f2473b = parcel.createStringArrayList();
                c0687e.f2474c = (C0699b[]) parcel.createTypedArray(C0699b.CREATOR);
                c0687e.f2475d = parcel.readInt();
                c0687e.f2476e = parcel.readString();
                c0687e.f2477f = parcel.createStringArrayList();
                c0687e.f2478g = parcel.createTypedArrayList(Bundle.CREATOR);
                c0687e.f2479h = parcel.createTypedArrayList(C0683A.CREATOR);
                return c0687e;
            case 6:
                return new C0690H(parcel);
            case 7:
                return new C0810b((C0822n) parcel.readParcelable(C0822n.class.getClassLoader()), (C0822n) parcel.readParcelable(C0822n.class.getClassLoader()), (C0812d) parcel.readParcelable(C0812d.class.getClassLoader()), (C0822n) parcel.readParcelable(C0822n.class.getClassLoader()), parcel.readInt());
            case 8:
                return new C0812d(parcel.readLong());
            case 9:
                return C0822n.m2090a(parcel.readInt(), parcel.readInt());
            case 10:
                C0957v c0957v = new C0957v();
                c0957v.f4010a = parcel.readInt();
                c0957v.f4011b = parcel.readInt();
                c0957v.f4012c = parcel.readInt() == 1;
                return c0957v;
            case 11:
                C0936e0 c0936e0 = new C0936e0();
                c0936e0.f3868a = parcel.readInt();
                c0936e0.f3869b = parcel.readInt();
                c0936e0.f3871d = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    c0936e0.f3870c = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0936e0;
            case 12:
                C0938f0 c0938f0 = new C0938f0();
                c0938f0.f3877a = parcel.readInt();
                c0938f0.f3878b = parcel.readInt();
                int i3 = parcel.readInt();
                c0938f0.f3879c = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    c0938f0.f3880d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                c0938f0.f3881e = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    c0938f0.f3882f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0938f0.f3884h = parcel.readInt() == 1;
                c0938f0.f3885i = parcel.readInt() == 1;
                c0938f0.f3886j = parcel.readInt() == 1;
                c0938f0.f3883g = parcel.readArrayList(C0936e0.class.getClassLoader());
                return c0938f0;
            case 13:
                C1101j c1101j = new C1101j();
                c1101j.f4516a = parcel.readInt();
                return c1101j;
            case 14:
                C1053P c1053p = new C1053P(parcel);
                c1053p.f4412a = parcel.readByte() != 0;
                return c1053p;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f504a) {
            case 0:
                return new C0148c[i2];
            case 1:
                return new C0447k[i2];
            case 2:
                return new C0653a[i2];
            case 3:
                return new C0699b[i2];
            case 4:
                return new C0683A[i2];
            case 5:
                return new C0687E[i2];
            case 6:
                return new C0690H[i2];
            case 7:
                return new C0810b[i2];
            case 8:
                return new C0812d[i2];
            case 9:
                return new C0822n[i2];
            case 10:
                return new C0957v[i2];
            case 11:
                return new C0936e0[i2];
            case 12:
                return new C0938f0[i2];
            case 13:
                return new C1101j[i2];
            case 14:
                return new C1053P[i2];
            default:
                return new ParcelImpl[i2];
        }
    }
}
