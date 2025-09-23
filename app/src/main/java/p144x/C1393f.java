package p144x;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p007C0.C0089g;
import p051S.AbstractC0498b;

/* renamed from: x.f */
/* loaded from: classes.dex */
public final class C1393f extends AbstractC0498b {
    public static final Parcelable.Creator<C1393f> CREATOR = new C0089g(12);

    /* renamed from: c */
    public SparseArray f6024c;

    public C1393f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i2 = parcel.readInt();
        int[] iArr = new int[i2];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f6024c = new SparseArray(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f6024c.append(iArr[i3], parcelableArray[i3]);
        }
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        SparseArray sparseArray = this.f6024c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = this.f6024c.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.f6024c.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}
