package p010D0;

import android.os.Parcel;
import android.os.Parcelable;
import p007C0.C0089g;
import p051S.AbstractC0498b;

/* renamed from: D0.b */
/* loaded from: classes.dex */
public final class C0104b extends AbstractC0498b {
    public static final Parcelable.Creator<C0104b> CREATOR = new C0089g(1);

    /* renamed from: c */
    public boolean f240c;

    public C0104b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0104b.class.getClassLoader();
        }
        this.f240c = parcel.readInt() == 1;
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f240c ? 1 : 0);
    }
}
