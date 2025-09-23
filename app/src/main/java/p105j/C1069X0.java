package p105j;

import android.os.Parcel;
import android.os.Parcelable;
import p007C0.C0089g;
import p051S.AbstractC0498b;

/* renamed from: j.X0 */
/* loaded from: classes.dex */
public final class C1069X0 extends AbstractC0498b {
    public static final Parcelable.Creator<C1069X0> CREATOR = new C0089g(10);

    /* renamed from: c */
    public boolean f4438c;

    public C1069X0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4438c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f4438c + "}";
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Boolean.valueOf(this.f4438c));
    }
}
