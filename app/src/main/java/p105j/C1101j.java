package p105j;

import android.os.Parcel;
import android.os.Parcelable;
import p015F0.C0147b;

/* renamed from: j.j */
/* loaded from: classes.dex */
public final class C1101j implements Parcelable {
    public static final Parcelable.Creator<C1101j> CREATOR = new C0147b(13);

    /* renamed from: a */
    public int f4516a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4516a);
    }
}
