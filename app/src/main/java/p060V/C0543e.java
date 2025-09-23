package p060V;

import android.os.Parcel;
import android.os.Parcelable;
import p007C0.C0089g;
import p051S.AbstractC0498b;

/* renamed from: V.e */
/* loaded from: classes.dex */
public final class C0543e extends AbstractC0498b {
    public static final Parcelable.Creator<C0543e> CREATOR = new C0089g(7);

    /* renamed from: c */
    public int f1712c;

    /* renamed from: d */
    public int f1713d;

    /* renamed from: e */
    public int f1714e;

    /* renamed from: f */
    public int f1715f;

    /* renamed from: g */
    public int f1716g;

    public C0543e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1712c = 0;
        this.f1712c = parcel.readInt();
        this.f1713d = parcel.readInt();
        this.f1714e = parcel.readInt();
        this.f1715f = parcel.readInt();
        this.f1716g = parcel.readInt();
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1712c);
        parcel.writeInt(this.f1713d);
        parcel.writeInt(this.f1714e);
        parcel.writeInt(this.f1715f);
        parcel.writeInt(this.f1716g);
    }
}
