package p015F0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: F0.c */
/* loaded from: classes.dex */
public final class C0148c extends View.BaseSavedState {
    public static final Parcelable.Creator<C0148c> CREATOR = new C0147b(0);

    /* renamed from: a */
    public int f505a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i2 = this.f505a;
        sb.append(i2 != 1 ? i2 != 2 ? "unchecked" : "indeterminate" : "checked");
        sb.append("}");
        return sb.toString();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Integer.valueOf(this.f505a));
    }
}
