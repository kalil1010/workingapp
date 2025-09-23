package p094f0;

import android.os.Parcel;
import android.os.Parcelable;
import p007C0.C0089g;
import p051S.AbstractC0498b;

/* renamed from: f0.T */
/* loaded from: classes.dex */
public final class C0920T extends AbstractC0498b {
    public static final Parcelable.Creator<C0920T> CREATOR = new C0089g(9);

    /* renamed from: c */
    public Parcelable f3786c;

    public C0920T(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3786c = parcel.readParcelable(classLoader == null ? AbstractC0911J.class.getClassLoader() : classLoader);
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f3786c, 0);
    }
}
