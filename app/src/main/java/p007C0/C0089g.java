package p007C0;

import android.os.Parcel;
import android.os.Parcelable;
import p010D0.C0104b;
import p035M0.C0372a;
import p035M0.C0390s;
import p041O0.C0429e;
import p051S.AbstractC0498b;
import p058U0.C0537d;
import p060V.C0543e;
import p064W0.C0554B;
import p094f0.C0920T;
import p105j.C1069X0;
import p105j.C1106k1;
import p144x.C1393f;

/* renamed from: C0.g */
/* loaded from: classes.dex */
public final class C0089g implements Parcelable.ClassLoaderCreator {

    /* renamed from: a */
    public final /* synthetic */ int f209a;

    public /* synthetic */ C0089g(int i2) {
        this.f209a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f209a) {
            case 0:
                return new C0090h(parcel, classLoader);
            case 1:
                return new C0104b(parcel, classLoader);
            case 2:
                return new C0372a(parcel, classLoader);
            case 3:
                return new C0390s(parcel, classLoader);
            case 4:
                return new C0429e(parcel, classLoader);
            case 5:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0498b.f1520b;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new C0537d(parcel, classLoader);
            case 7:
                return new C0543e(parcel, classLoader);
            case 8:
                return new C0554B(parcel, classLoader);
            case 9:
                return new C0920T(parcel, classLoader);
            case 10:
                return new C1069X0(parcel, classLoader);
            case 11:
                return new C1106k1(parcel, classLoader);
            default:
                return new C1393f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f209a) {
            case 0:
                return new C0090h[i2];
            case 1:
                return new C0104b[i2];
            case 2:
                return new C0372a[i2];
            case 3:
                return new C0390s[i2];
            case 4:
                return new C0429e[i2];
            case 5:
                return new AbstractC0498b[i2];
            case 6:
                return new C0537d[i2];
            case 7:
                return new C0543e[i2];
            case 8:
                return new C0554B[i2];
            case 9:
                return new C0920T[i2];
            case 10:
                return new C1069X0[i2];
            case 11:
                return new C1106k1[i2];
            default:
                return new C1393f[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f209a) {
            case 0:
                return new C0090h(parcel, null);
            case 1:
                return new C0104b(parcel, null);
            case 2:
                return new C0372a(parcel, null);
            case 3:
                return new C0390s(parcel, null);
            case 4:
                return new C0429e(parcel, null);
            case 5:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0498b.f1520b;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new C0537d(parcel, null);
            case 7:
                return new C0543e(parcel, null);
            case 8:
                return new C0554B(parcel, null);
            case 9:
                return new C0920T(parcel, null);
            case 10:
                return new C1069X0(parcel, null);
            case 11:
                return new C1106k1(parcel, null);
            default:
                return new C1393f(parcel, null);
        }
    }
}
