package p007C0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p051S.AbstractC0498b;

/* renamed from: C0.h */
/* loaded from: classes.dex */
public final class C0090h extends AbstractC0498b {
    public static final Parcelable.Creator<C0090h> CREATOR = new C0089g(0);

    /* renamed from: c */
    public final int f210c;

    /* renamed from: d */
    public final int f211d;

    /* renamed from: e */
    public final boolean f212e;

    /* renamed from: f */
    public final boolean f213f;

    /* renamed from: g */
    public final boolean f214g;

    public C0090h(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f210c = parcel.readInt();
        this.f211d = parcel.readInt();
        this.f212e = parcel.readInt() == 1;
        this.f213f = parcel.readInt() == 1;
        this.f214g = parcel.readInt() == 1;
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f210c);
        parcel.writeInt(this.f211d);
        parcel.writeInt(this.f212e ? 1 : 0);
        parcel.writeInt(this.f213f ? 1 : 0);
        parcel.writeInt(this.f214g ? 1 : 0);
    }

    public C0090h(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f210c = bottomSheetBehavior.f3062L;
        this.f211d = bottomSheetBehavior.f3085e;
        this.f212e = bottomSheetBehavior.f3079b;
        this.f213f = bottomSheetBehavior.f3059I;
        this.f214g = bottomSheetBehavior.f3060J;
    }
}
