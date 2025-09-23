package p105j;

import android.os.Parcel;
import android.os.Parcelable;
import p007C0.C0089g;
import p051S.AbstractC0498b;

/* renamed from: j.k1 */
/* loaded from: classes.dex */
public final class C1106k1 extends AbstractC0498b {
    public static final Parcelable.Creator<C1106k1> CREATOR = new C0089g(11);

    /* renamed from: c */
    public int f4558c;

    /* renamed from: d */
    public boolean f4559d;

    public C1106k1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4558c = parcel.readInt();
        this.f4559d = parcel.readInt() != 0;
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f4558c);
        parcel.writeInt(this.f4559d ? 1 : 0);
    }
}
