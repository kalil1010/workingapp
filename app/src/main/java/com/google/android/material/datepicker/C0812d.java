package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p015F0.C0147b;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public final class C0812d implements Parcelable {
    public static final Parcelable.Creator<C0812d> CREATOR = new C0147b(8);

    /* renamed from: a */
    public final long f3171a;

    public C0812d(long j2) {
        this.f3171a = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0812d) && this.f3171a == ((C0812d) obj).f3171a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3171a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f3171a);
    }
}
