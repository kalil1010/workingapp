package p051S;

import android.os.Parcel;
import android.os.Parcelable;
import p007C0.C0089g;

/* renamed from: S.b */
/* loaded from: classes.dex */
public abstract class AbstractC0498b implements Parcelable {

    /* renamed from: a */
    public final Parcelable f1521a;

    /* renamed from: b */
    public static final C0497a f1520b = new C0497a();
    public static final Parcelable.Creator<AbstractC0498b> CREATOR = new C0089g(5);

    public AbstractC0498b() {
        this.f1521a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f1521a, i2);
    }

    public AbstractC0498b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1521a = parcelable == f1520b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0498b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1521a = parcelable == null ? f1520b : parcelable;
    }
}
