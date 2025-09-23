package p094f0;

import android.os.Parcel;
import android.os.Parcelable;
import p015F0.C0147b;

/* renamed from: f0.v */
/* loaded from: classes.dex */
public final class C0957v implements Parcelable {
    public static final Parcelable.Creator<C0957v> CREATOR = new C0147b(10);

    /* renamed from: a */
    public int f4010a;

    /* renamed from: b */
    public int f4011b;

    /* renamed from: c */
    public boolean f4012c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4010a);
        parcel.writeInt(this.f4011b);
        parcel.writeInt(this.f4012c ? 1 : 0);
    }
}
