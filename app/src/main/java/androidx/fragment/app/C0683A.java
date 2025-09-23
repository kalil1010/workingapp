package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import p015F0.C0147b;

/* renamed from: androidx.fragment.app.A */
/* loaded from: classes.dex */
public final class C0683A implements Parcelable {
    public static final Parcelable.Creator<C0683A> CREATOR = new C0147b(4);

    /* renamed from: a */
    public String f2435a;

    /* renamed from: b */
    public int f2436b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2435a);
        parcel.writeInt(this.f2436b);
    }
}
