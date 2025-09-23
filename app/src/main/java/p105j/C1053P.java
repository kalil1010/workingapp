package p105j;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p015F0.C0147b;

/* renamed from: j.P */
/* loaded from: classes.dex */
public final class C1053P extends View.BaseSavedState {
    public static final Parcelable.Creator<C1053P> CREATOR = new C0147b(14);

    /* renamed from: a */
    public boolean f4412a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f4412a ? (byte) 1 : (byte) 0);
    }
}
