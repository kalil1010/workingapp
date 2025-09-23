package p094f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p015F0.C0147b;

/* renamed from: f0.e0 */
/* loaded from: classes.dex */
public final class C0936e0 implements Parcelable {
    public static final Parcelable.Creator<C0936e0> CREATOR = new C0147b(11);

    /* renamed from: a */
    public int f3868a;

    /* renamed from: b */
    public int f3869b;

    /* renamed from: c */
    public int[] f3870c;

    /* renamed from: d */
    public boolean f3871d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3868a + ", mGapDir=" + this.f3869b + ", mHasUnwantedGapAfter=" + this.f3871d + ", mGapPerSpan=" + Arrays.toString(this.f3870c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3868a);
        parcel.writeInt(this.f3869b);
        parcel.writeInt(this.f3871d ? 1 : 0);
        int[] iArr = this.f3870c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3870c);
        }
    }
}
