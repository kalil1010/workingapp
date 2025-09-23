package p045Q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p015F0.C0147b;

/* renamed from: Q.k */
/* loaded from: classes.dex */
public final class C0447k extends View.BaseSavedState {
    public static final Parcelable.Creator<C0447k> CREATOR = new C0147b(1);

    /* renamed from: a */
    public int f1352a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1352a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1352a);
    }
}
