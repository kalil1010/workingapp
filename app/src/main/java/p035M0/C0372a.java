package p035M0;

import android.os.Parcel;
import android.os.Parcelable;
import p007C0.C0089g;
import p051S.AbstractC0498b;

/* renamed from: M0.a */
/* loaded from: classes.dex */
public final class C0372a extends AbstractC0498b {
    public static final Parcelable.Creator<C0372a> CREATOR = new C0089g(2);

    /* renamed from: c */
    public boolean f1141c;

    public C0372a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1141c = parcel.readInt() == 1;
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1141c ? 1 : 0);
    }
}
