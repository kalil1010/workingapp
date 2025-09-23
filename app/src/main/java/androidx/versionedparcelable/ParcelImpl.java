package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import p015F0.C0147b;
import p112l0.C1226b;
import p112l0.InterfaceC1227c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0147b(15);

    /* renamed from: a */
    public final InterfaceC1227c f2872a;

    public ParcelImpl(Parcel parcel) {
        this.f2872a = new C1226b(parcel).m2864g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new C1226b(parcel).m2866i(this.f2872a);
    }
}
