package p058U0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p007C0.C0089g;
import p051S.AbstractC0498b;

/* renamed from: U0.d */
/* loaded from: classes.dex */
public final class C0537d extends AbstractC0498b {
    public static final Parcelable.Creator<C0537d> CREATOR = new C0089g(6);

    /* renamed from: c */
    public final int f1703c;

    public C0537d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1703c = parcel.readInt();
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1703c);
    }

    public C0537d(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f1703c = sideSheetBehavior.f3308h;
    }
}
