package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p015F0.C0147b;

/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final class C0653a implements Parcelable {
    public static final Parcelable.Creator<C0653a> CREATOR = new C0147b(2);

    /* renamed from: a */
    public final int f2027a;

    /* renamed from: b */
    public final Intent f2028b;

    public C0653a(int i2, Intent intent) {
        this.f2027a = i2;
        this.f2028b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f2027a;
        sb.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2028b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2027a);
        Intent intent = this.f2028b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    public C0653a(Parcel parcel) {
        this.f2027a = parcel.readInt();
        this.f2028b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
